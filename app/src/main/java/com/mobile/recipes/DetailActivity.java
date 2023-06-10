package com.mobile.recipes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_RECIPE_ID = "0";
    public static final String EXTRA_RECIPE_CATEGORY = "dinner";

    private ShareActionProvider shareActionProvider;
    private String shareContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Stan i układ
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // Fragment opisu przepisu
        RecipeDetailFragment fragment = (RecipeDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        // Przekazywanie fragmentowi identufikatora przepisu i kategorii
        int recipeID = (int) getIntent().getExtras().get(EXTRA_RECIPE_ID);
        String recipeCategory = (String) getIntent().getExtras().get(EXTRA_RECIPE_CATEGORY);
        fragment.setRecipeID(recipeID, recipeCategory);
        // Pobieranie zdjęcia i wstawianie go w element zwijanego obrazka w nagłówku układu
        Recipe recipe = recipeCategory.equals("dinner") ? Recipe.recipesDinner[recipeID] :
                recipeCategory.equals("dessert") ? Recipe.recipesDessert[recipeID] :
                        Recipe.recipesDinner[recipeID];
        ImageView imageView = (ImageView)findViewById(R.id.recipe_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, recipe.getImageId()));
        //Pobierz przepis do dostawcy udostepniania
        shareContent = recipe.toString();
        // Ustawienie paska narzędzi (tak samo jak w MainActivity)
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent(shareContent);
        return super.onCreateOptionsMenu(menu);
    }

    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.author_action) {
            Intent intent = new Intent(this, AuthorActivity.class);
            startActivity(intent);
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void onClickCopy(View view) {
        int recipeID = (int) getIntent().getExtras().get(EXTRA_RECIPE_ID);
        String recipeCategory = (String) getIntent().getExtras().get(EXTRA_RECIPE_CATEGORY);

        String recipeName = recipeCategory.equals("dinner") ? Recipe.recipesDinner[recipeID].getName() :
                recipeCategory.equals("dessert") ? Recipe.recipesDessert[recipeID].getName() :
                        Recipe.recipesDinner[recipeID].getName();
        String recipeIngredients = recipeCategory.equals("dinner") ? Recipe.recipesDinner[recipeID].getIngredients() :
                recipeCategory.equals("dessert") ? Recipe.recipesDessert[recipeID].getIngredients() :
                        Recipe.recipesDinner[recipeID].getIngredients();

        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Składniki na " + recipeName, recipeIngredients);
        clipboard.setPrimaryClip(clip);

        final Handler handler = new Handler();
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Skopiowano do schowka");
        final AlertDialog dialog = builder.create();
        dialog.show();
        handler.postDelayed(new Runnable() {
            public void run() {
                dialog.dismiss();
            }
        }, 1000);
    }
}