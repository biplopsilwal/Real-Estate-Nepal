// Generated code from Butter Knife. Do not modify!
package app.com.tenantnepal.views.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import app.com.tenantnepal.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GeneralAdapter$ViewHolder_ViewBinding implements Unbinder {
  private GeneralAdapter.ViewHolder target;

  @UiThread
  public GeneralAdapter$ViewHolder_ViewBinding(GeneralAdapter.ViewHolder target, View source) {
    this.target = target;

    target.singleItemGeneralImageView = Utils.findRequiredViewAsType(source, R.id.single_item_general_imageView, "field 'singleItemGeneralImageView'", ImageView.class);
    target.singleItemGeneralTxtLocation = Utils.findRequiredViewAsType(source, R.id.single_item_general_txtLocation, "field 'singleItemGeneralTxtLocation'", TextView.class);
    target.singleItemGeneralTxtTotalRooms = Utils.findRequiredViewAsType(source, R.id.single_item_general_txtTotalRooms, "field 'singleItemGeneralTxtTotalRooms'", TextView.class);
    target.singleItemGeneralTxtSalesPrice = Utils.findRequiredViewAsType(source, R.id.single_item_general_txtSalesPrice, "field 'singleItemGeneralTxtSalesPrice'", TextView.class);
    target.singleItemGeneralTxtTotalAreas = Utils.findRequiredViewAsType(source, R.id.single_item_general_txtTotalAreas, "field 'singleItemGeneralTxtTotalAreas'", TextView.class);
    target.singleItemGeneralTxtTotalApplied = Utils.findRequiredViewAsType(source, R.id.single_item_general_txtTotalApplied, "field 'singleItemGeneralTxtTotalApplied'", TextView.class);
    target.singleItemGeneralTxtTotalViews = Utils.findRequiredViewAsType(source, R.id.single_item_general_txtTotalViews, "field 'singleItemGeneralTxtTotalViews'", TextView.class);
    target.singleItemGeneralCardView = Utils.findRequiredViewAsType(source, R.id.single_item_general_cardView, "field 'singleItemGeneralCardView'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GeneralAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.singleItemGeneralImageView = null;
    target.singleItemGeneralTxtLocation = null;
    target.singleItemGeneralTxtTotalRooms = null;
    target.singleItemGeneralTxtSalesPrice = null;
    target.singleItemGeneralTxtTotalAreas = null;
    target.singleItemGeneralTxtTotalApplied = null;
    target.singleItemGeneralTxtTotalViews = null;
    target.singleItemGeneralCardView = null;
  }
}
