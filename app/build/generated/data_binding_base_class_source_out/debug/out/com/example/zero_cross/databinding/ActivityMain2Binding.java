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

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button oneOne;

  @NonNull
  public final Button oneTwo;

  @NonNull
  public final Button oneZero;

  @NonNull
  public final TextView title;

  @NonNull
  public final Button twoOne;

  @NonNull
  public final Button twoTwo;

  @NonNull
  public final Button twoZero;

  @NonNull
  public final Button zeroOne;

  @NonNull
  public final Button zeroTwo;

  @NonNull
  public final Button zeroZero;

  private ActivityMain2Binding(@NonNull ConstraintLayout rootView, @NonNull Button oneOne,
      @NonNull Button oneTwo, @NonNull Button oneZero, @NonNull TextView title,
      @NonNull Button twoOne, @NonNull Button twoTwo, @NonNull Button twoZero,
      @NonNull Button zeroOne, @NonNull Button zeroTwo, @NonNull Button zeroZero) {
    this.rootView = rootView;
    this.oneOne = oneOne;
    this.oneTwo = oneTwo;
    this.oneZero = oneZero;
    this.title = title;
    this.twoOne = twoOne;
    this.twoTwo = twoTwo;
    this.twoZero = twoZero;
    this.zeroOne = zeroOne;
    this.zeroTwo = zeroTwo;
    this.zeroZero = zeroZero;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.one_one;
      Button oneOne = ViewBindings.findChildViewById(rootView, id);
      if (oneOne == null) {
        break missingId;
      }

      id = R.id.one_two;
      Button oneTwo = ViewBindings.findChildViewById(rootView, id);
      if (oneTwo == null) {
        break missingId;
      }

      id = R.id.one_zero;
      Button oneZero = ViewBindings.findChildViewById(rootView, id);
      if (oneZero == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.two_one;
      Button twoOne = ViewBindings.findChildViewById(rootView, id);
      if (twoOne == null) {
        break missingId;
      }

      id = R.id.two_two;
      Button twoTwo = ViewBindings.findChildViewById(rootView, id);
      if (twoTwo == null) {
        break missingId;
      }

      id = R.id.two_zero;
      Button twoZero = ViewBindings.findChildViewById(rootView, id);
      if (twoZero == null) {
        break missingId;
      }

      id = R.id.zero_one;
      Button zeroOne = ViewBindings.findChildViewById(rootView, id);
      if (zeroOne == null) {
        break missingId;
      }

      id = R.id.zero_two;
      Button zeroTwo = ViewBindings.findChildViewById(rootView, id);
      if (zeroTwo == null) {
        break missingId;
      }

      id = R.id.zero_zero;
      Button zeroZero = ViewBindings.findChildViewById(rootView, id);
      if (zeroZero == null) {
        break missingId;
      }

      return new ActivityMain2Binding((ConstraintLayout) rootView, oneOne, oneTwo, oneZero, title,
          twoOne, twoTwo, twoZero, zeroOne, zeroTwo, zeroZero);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
