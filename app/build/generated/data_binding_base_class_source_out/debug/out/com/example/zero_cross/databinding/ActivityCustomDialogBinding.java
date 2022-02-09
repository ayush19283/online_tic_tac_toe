// Generated by view binder compiler. Do not edit!
package com.example.zero_cross.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.zero_cross.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCustomDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button enter;

  @NonNull
  public final EditText globalUsername;

  @NonNull
  public final TextView txtExit;

  private ActivityCustomDialogBinding(@NonNull LinearLayout rootView, @NonNull Button enter,
      @NonNull EditText globalUsername, @NonNull TextView txtExit) {
    this.rootView = rootView;
    this.enter = enter;
    this.globalUsername = globalUsername;
    this.txtExit = txtExit;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustomDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustomDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_custom_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustomDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.enter;
      Button enter = ViewBindings.findChildViewById(rootView, id);
      if (enter == null) {
        break missingId;
      }

      id = R.id.global_username;
      EditText globalUsername = ViewBindings.findChildViewById(rootView, id);
      if (globalUsername == null) {
        break missingId;
      }

      id = R.id.txt_exit;
      TextView txtExit = ViewBindings.findChildViewById(rootView, id);
      if (txtExit == null) {
        break missingId;
      }

      return new ActivityCustomDialogBinding((LinearLayout) rootView, enter, globalUsername,
          txtExit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
