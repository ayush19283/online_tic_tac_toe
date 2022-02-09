// Generated by view binder compiler. Do not edit!
package com.example.zero_cross.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.zero_cross.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView changer;

  @NonNull
  public final Button playAg;

  private ActivityMain3Binding(@NonNull ConstraintLayout rootView, @NonNull TextView changer,
      @NonNull Button playAg) {
    this.rootView = rootView;
    this.changer = changer;
    this.playAg = playAg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.changer;
      TextView changer = ViewBindings.findChildViewById(rootView, id);
      if (changer == null) {
        break missingId;
      }

      id = R.id.play_ag;
      Button playAg = ViewBindings.findChildViewById(rootView, id);
      if (playAg == null) {
        break missingId;
      }

      return new ActivityMain3Binding((ConstraintLayout) rootView, changer, playAg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}