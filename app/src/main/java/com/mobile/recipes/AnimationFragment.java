package com.mobile.recipes;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.view.animation.DecelerateInterpolator;

public class AnimationFragment extends Fragment {
    private View mSceneView;
    private View mIconView;
    private View mSkyView;
    private int mStartColor;
    private int mEndColor;

    public static AnimationFragment newInstance() {
            return new AnimationFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animation, container, false);
        mSceneView = view;
        mIconView = view.findViewById(R.id.icon);
        mSkyView = view.findViewById(R.id.sky);
        Resources resources = getResources();
        mStartColor = resources.getColor(R.color.black);
        mEndColor = resources.getColor(R.color.white);
        startAnimation();
        return view;
    }

    private void startAnimation() {
        float iconYStart = mSceneView.getTop()-1500;
        float iconYEnd = mSkyView.getPivotY();

        ObjectAnimator heightAnimator = ObjectAnimator
                .ofFloat(mIconView, "y", iconYStart, iconYEnd)
                .setDuration(3000);
        heightAnimator.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator sunsetSkyAnimator = ObjectAnimator
                .ofInt(mSkyView, "backgroundColor", mStartColor, mEndColor)
                .setDuration(3000);
        sunsetSkyAnimator.setEvaluator(new ArgbEvaluator());
        heightAnimator.start();
        sunsetSkyAnimator.start();
    }
}