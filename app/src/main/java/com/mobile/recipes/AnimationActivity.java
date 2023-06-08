package com.mobile.recipes;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Handler;

public class AnimationActivity extends SingleFragmentActivity {
    Handler handler = new Handler();

    @Override
    protected Fragment createFragment() {
        handler.postDelayed(mLaunchTask, 5000);
        return AnimationFragment.newInstance();
    }

    private Runnable mLaunchTask = new Runnable() {
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };


}