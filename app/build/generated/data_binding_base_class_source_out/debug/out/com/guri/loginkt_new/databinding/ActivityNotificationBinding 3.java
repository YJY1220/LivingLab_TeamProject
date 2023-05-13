// Generated by view binder compiler. Do not edit!
package com.guri.loginkt_new.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.guri.loginkt_new.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNotificationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout ConstraintLayout;

  @NonNull
  public final RecyclerView rvPro1;

  private ActivityNotificationBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout ConstraintLayout, @NonNull RecyclerView rvPro1) {
    this.rootView = rootView;
    this.ConstraintLayout = ConstraintLayout;
    this.rvPro1 = rvPro1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_notification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNotificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout ConstraintLayout = (ConstraintLayout) rootView;

      id = R.id.rv_pro_1;
      RecyclerView rvPro1 = ViewBindings.findChildViewById(rootView, id);
      if (rvPro1 == null) {
        break missingId;
      }

      return new ActivityNotificationBinding((ConstraintLayout) rootView, ConstraintLayout, rvPro1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
