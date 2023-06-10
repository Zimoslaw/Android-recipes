package com.mobile.recipes;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Ustawienie RecyclerView z układu listy przepisów
        RecyclerView recipeRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_tab1, container, false);
        // Pobranie nazw i zdjęć przepisów z odpowiedniej listy
        String[] recipeNames = new String[Recipe.recipesDinner.length];
        for (int i = 0; i < recipeNames.length; i++) {
            recipeNames[i] = Recipe.recipesDinner[i].getName();
        }
        int[] recipeImages = new int[Recipe.recipesDinner.length];
        for (int i = 0; i < recipeImages.length; i++) {
            recipeImages[i] = Recipe.recipesDinner[i].getImageId();
        }
        // Ustawienie adaptera kafelków z obrazkami i tekstem
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(recipeNames, recipeImages);
        recipeRecycler.setAdapter(adapter);
        // Ustawienie menedżera listy (siatki) kafelków
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recipeRecycler.setLayoutManager(layoutManager);
        // Nasłuchiwanie kliknięcia w pozycje na liście
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_RECIPE_ID, position);
                intent.putExtra(DetailActivity.EXTRA_RECIPE_CATEGORY, "dinner");
                getActivity().startActivity(intent);
            }
        });
        
        return recipeRecycler;
    }
}