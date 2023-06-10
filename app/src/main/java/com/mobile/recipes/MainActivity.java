package com.mobile.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.content.Intent;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Stan i układ
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Adapter kategorii przepisów
        SectionsPagerAdapter pagerAdapter =
                new SectionsPagerAdapter(this);
        // Pager kategorii przepisów
        ViewPager2 pager = (ViewPager2) findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);
        // Menu zakładek
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, pager,
                (tab, position) -> tab.setText(pagerAdapter.getPageTitle(position))
        ).attach();
        // Pasek narzędzi
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // Ustawienie układu paska narzędzi
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Obsługa kliknięcia w link do strony "o autorze"
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

    // Adapter kategorii przepisów
    private class SectionsPagerAdapter extends FragmentStateAdapter {
        public SectionsPagerAdapter(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override
        public int getItemCount() {
            return 3;
        } // 2 kategorie + strona startowa

        // Fragmenty stron
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new TopFragment(); // Strona startowa
                case 1:
                    return new Tab1Fragment(); // Przepisy na obiad
                case 2:
                    return new Tab2Fragment(); // Przepisy na deser
            }
            return null;
        }

        // Tytuły stron
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getText(R.string.home_tab);
                case 1:
                    return getResources().getText(R.string.category1_tab);
                case 2:
                    return getResources().getText(R.string.category2_tab);
            }
            return null;
        }
    }
}