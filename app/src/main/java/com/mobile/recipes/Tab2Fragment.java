package com.mobile.recipes;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView recipeRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_tab2, container, false);
        String[] recipeNames = new String[Recipe.recipesDessert.length];
        for (int i = 0; i < recipeNames.length; i++) {
            recipeNames[i] = Recipe.recipesDessert[i].getName();
        }
        int[] recipeImages = new int[Recipe.recipesDessert.length];
        for (int i = 0; i < recipeImages.length; i++) {
            recipeImages[i] = Recipe.recipesDessert[i].getImageId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(recipeNames, recipeImages);
        recipeRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recipeRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_RECIPE_ID, position);
                intent.putExtra(DetailActivity.EXTRA_RECIPE_CATEGORY, "dessert");
                getActivity().startActivity(intent);
            }
        });

        return recipeRecycler;
    }
}