package com.mobile.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_RECIPE_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        RecipeDetailFragment fragment = (RecipeDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        int coctailId = (int) getIntent().getExtras().get(EXTRA_RECIPE_ID);
        fragment.setRecipeID(coctailId);
    }
}