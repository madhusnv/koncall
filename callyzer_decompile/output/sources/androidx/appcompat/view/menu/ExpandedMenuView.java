package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l4.C4367l;
import p012n.InterfaceC4928h;
import p012n.MenuItemC4930j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC4928h, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public static final int[] f1683a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C4367l c4367lM9117H = C4367l.m9117H(context, attributeSet, f1683a, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c4367lM9117H.m9145y(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c4367lM9117H.m9145y(1));
        }
        c4367lM9117H.m9124I();
    }

    @Override // p012n.InterfaceC4928h
    /* renamed from: b */
    public final boolean mo555b(MenuItemC4930j menuItemC4930j) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        throw null;
    }
}
