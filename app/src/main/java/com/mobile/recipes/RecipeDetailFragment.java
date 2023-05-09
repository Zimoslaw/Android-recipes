package com.mobile.recipes;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class RecipeDetailFragment extends Fragment {
    private long recipeID;

    public void setRecipeID(long id) {
        this.recipeID = id;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            recipeID = savedInstanceState.getLong("recipeID");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recipe_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Recipe recipe = Recipe.recipes[(int) recipeID];

            TextView title = (TextView) view.findViewById(R.id.recipeTitle);
            title.setText(recipe.getName());

            TextView count = (TextView) view.findViewById(R.id.recipeCount);
            count.setText(recipe.getCount());

            TextView ingredients = (TextView) view.findViewById(R.id.recipeIngredients);
            ingredients.setText(recipe.getIngredients());

            TextView preparation = (TextView) view.findViewById(R.id.recipePreparation);
            preparation.setText(recipe.getPreparation());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("recipeID", recipeID);
    }
}