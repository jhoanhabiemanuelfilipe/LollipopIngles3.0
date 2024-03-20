package com.cursoandroid.navigationdrawertest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.cursoandroid.navigationdrawertest.R;
import java.util.Objects;

public final class ContentMainBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private ContentMainBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ContentMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ContentMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.content_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ContentMainBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new ContentMainBinding((ConstraintLayout) view);
    }
}
