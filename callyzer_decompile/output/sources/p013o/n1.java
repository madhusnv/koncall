package p013o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p012n.C4927g;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 extends x0 {

    /* renamed from: n */
    public final int f25587n;

    /* renamed from: p */
    public final int f25588p;

    /* renamed from: q */
    public k1 f25589q;

    /* renamed from: r */
    public MenuItemC4930j f25590r;

    public n1(Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f25587n = 21;
            this.f25588p = 22;
        } else {
            this.f25587n = 22;
            this.f25588p = 21;
        }
    }

    @Override // p013o.x0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C4927g c4927g;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.f25589q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c4927g = (C4927g) headerViewListAdapter.getWrappedAdapter();
            } else {
                c4927g = (C4927g) adapter;
                headersCount = 0;
            }
            MenuItemC4930j item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= c4927g.getCount()) ? null : c4927g.getItem(i10);
            MenuItemC4930j menuItemC4930j = this.f25590r;
            if (menuItemC4930j != item) {
                MenuC4929i menuC4929i = c4927g.f24526a;
                if (menuItemC4930j != null) {
                    this.f25589q.mo8765d(menuC4929i, menuItemC4930j);
                }
                this.f25590r = item;
                if (item != null) {
                    this.f25589q.mo8774o(menuC4929i, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f25587n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f25588p) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C4927g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C4927g) adapter).f24526a.m9854c(false);
        return true;
    }

    public void setHoverListener(k1 k1Var) {
        this.f25589q = k1Var;
    }

    @Override // p013o.x0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
