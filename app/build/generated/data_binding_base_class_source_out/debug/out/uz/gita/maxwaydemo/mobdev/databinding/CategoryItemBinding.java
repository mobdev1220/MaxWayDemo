// Generated by view binder compiler. Do not edit!
package uz.gita.maxwaydemo.mobdev.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.maxwaydemo.mobdev.R;

public final class CategoryItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final View addFood;

  @NonNull
  public final TextView countAdd;

  @NonNull
  public final FrameLayout foodCost;

  @NonNull
  public final TextView foodCount;

  @NonNull
  public final FrameLayout foodImage;

  @NonNull
  public final TextView foodName;

  @NonNull
  public final TextView foodSum;

  @NonNull
  public final AppCompatImageView imageCategory;

  @NonNull
  public final AppCompatImageView minus;

  @NonNull
  public final AppCompatImageView plus;

  private CategoryItemBinding(@NonNull MaterialCardView rootView, @NonNull View addFood,
      @NonNull TextView countAdd, @NonNull FrameLayout foodCost, @NonNull TextView foodCount,
      @NonNull FrameLayout foodImage, @NonNull TextView foodName, @NonNull TextView foodSum,
      @NonNull AppCompatImageView imageCategory, @NonNull AppCompatImageView minus,
      @NonNull AppCompatImageView plus) {
    this.rootView = rootView;
    this.addFood = addFood;
    this.countAdd = countAdd;
    this.foodCost = foodCost;
    this.foodCount = foodCount;
    this.foodImage = foodImage;
    this.foodName = foodName;
    this.foodSum = foodSum;
    this.imageCategory = imageCategory;
    this.minus = minus;
    this.plus = plus;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CategoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.category_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CategoryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addFood;
      View addFood = ViewBindings.findChildViewById(rootView, id);
      if (addFood == null) {
        break missingId;
      }

      id = R.id.countAdd;
      TextView countAdd = ViewBindings.findChildViewById(rootView, id);
      if (countAdd == null) {
        break missingId;
      }

      id = R.id.foodCost;
      FrameLayout foodCost = ViewBindings.findChildViewById(rootView, id);
      if (foodCost == null) {
        break missingId;
      }

      id = R.id.foodCount;
      TextView foodCount = ViewBindings.findChildViewById(rootView, id);
      if (foodCount == null) {
        break missingId;
      }

      id = R.id.foodImage;
      FrameLayout foodImage = ViewBindings.findChildViewById(rootView, id);
      if (foodImage == null) {
        break missingId;
      }

      id = R.id.foodName;
      TextView foodName = ViewBindings.findChildViewById(rootView, id);
      if (foodName == null) {
        break missingId;
      }

      id = R.id.foodSum;
      TextView foodSum = ViewBindings.findChildViewById(rootView, id);
      if (foodSum == null) {
        break missingId;
      }

      id = R.id.imageCategory;
      AppCompatImageView imageCategory = ViewBindings.findChildViewById(rootView, id);
      if (imageCategory == null) {
        break missingId;
      }

      id = R.id.minus;
      AppCompatImageView minus = ViewBindings.findChildViewById(rootView, id);
      if (minus == null) {
        break missingId;
      }

      id = R.id.plus;
      AppCompatImageView plus = ViewBindings.findChildViewById(rootView, id);
      if (plus == null) {
        break missingId;
      }

      return new CategoryItemBinding((MaterialCardView) rootView, addFood, countAdd, foodCost,
          foodCount, foodImage, foodName, foodSum, imageCategory, minus, plus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}