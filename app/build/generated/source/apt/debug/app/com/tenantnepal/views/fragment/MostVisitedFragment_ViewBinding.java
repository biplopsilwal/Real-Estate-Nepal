// Generated code from Butter Knife. Do not modify!
package app.com.tenantnepal.views.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import app.com.tenantnepal.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MostVisitedFragment_ViewBinding implements Unbinder {
  private MostVisitedFragment target;

  @UiThread
  public MostVisitedFragment_ViewBinding(MostVisitedFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.recyclerViewSwipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.recycler_view_swipeRefreshLayout, "field 'recyclerViewSwipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MostVisitedFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.recyclerViewSwipeRefreshLayout = null;
  }
}
