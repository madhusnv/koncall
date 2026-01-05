package p001o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C1791d;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.InterfaceC1796i;

/* loaded from: classes2.dex */
public abstract class abb implements brf, InterfaceC1796i, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f14446a;

    /* renamed from: p */
    public static int m16815p(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: y */
    public static boolean m16816y(C1792e c1792e) {
        int size = c1792e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c1792e.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public static C1791d m16817z(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C1791d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1791d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: c */
    public boolean mo3964c(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: j */
    public boolean mo3968j(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: k */
    public void mo3969k(Context context, C1792e c1792e) {
    }

    /* renamed from: l */
    public abstract void mo3990l(C1792e c1792e);

    /* renamed from: m */
    public boolean mo3991m() {
        return true;
    }

    /* renamed from: n */
    public Rect m16818n() {
        return this.f14446a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m16817z(listAdapter).f5588a.m4029P((MenuItem) listAdapter.getItem(i), this, mo3991m() ? 0 : 4);
    }

    /* renamed from: q */
    public abstract void mo3993q(View view);

    /* renamed from: r */
    public void m16819r(Rect rect) {
        this.f14446a = rect;
    }

    /* renamed from: s */
    public abstract void mo3994s(boolean z);

    /* renamed from: t */
    public abstract void mo3995t(int i);

    /* renamed from: u */
    public abstract void mo3996u(int i);

    /* renamed from: v */
    public abstract void mo3997v(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: w */
    public abstract void mo3998w(boolean z);

    /* renamed from: x */
    public abstract void mo3999x(int i);
}
