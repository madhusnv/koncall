package p012n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.k */
/* loaded from: classes.dex */
public abstract class AbstractC4931k implements InterfaceC4937q, InterfaceC4935o, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f24581a;

    /* renamed from: m */
    public static int m9876m(ListAdapter listAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: i */
    public final boolean mo9878i(MenuItemC4930j menuItemC4930j) {
        return false;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: k */
    public final boolean mo9879k(MenuItemC4930j menuItemC4930j) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo9841l(MenuC4929i menuC4929i);

    /* renamed from: n */
    public abstract void mo9842n(View view);

    /* renamed from: o */
    public abstract void mo9843o(boolean z6);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C4927g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C4927g) listAdapter).f24526a.m9867p((MenuItem) listAdapter.getItem(i10), this, !(this instanceof ViewOnKeyListenerC4926f) ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo9844p(int i10);

    /* renamed from: q */
    public abstract void mo9845q(int i10);

    /* renamed from: r */
    public abstract void mo9846r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo9847s(boolean z6);

    /* renamed from: t */
    public abstract void mo9848t(int i10);

    @Override // p012n.InterfaceC4935o
    /* renamed from: b */
    public final void mo9877b(Context context, MenuC4929i menuC4929i) {
    }
}
