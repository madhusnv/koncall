package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C1792e;
import p001o.anh;

/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements C1792e.b, InterfaceC1797j, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final int[] f5519c = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    public C1792e f5520a;

    /* renamed from: b */
    public int f5521b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j
    /* renamed from: a */
    public void mo3956a(C1792e c1792e) {
        this.f5520a = c1792e;
    }

    @Override // androidx.appcompat.view.menu.C1792e.b
    /* renamed from: d */
    public boolean mo3957d(C1794g c1794g) {
        return this.f5520a.m4028O(c1794g, 0);
    }

    public int getWindowAnimations() {
        return this.f5521b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo3957d((C1794g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        anh anhVarM17525v = anh.m17525v(context, attributeSet, f5519c, i, 0);
        if (anhVarM17525v.m17544s(0)) {
            setBackgroundDrawable(anhVarM17525v.m17532g(0));
        }
        if (anhVarM17525v.m17544s(1)) {
            setDivider(anhVarM17525v.m17532g(1));
        }
        anhVarM17525v.m17546x();
    }
}
