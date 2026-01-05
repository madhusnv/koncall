package p001o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.AbstractC0000a;

/* loaded from: classes.dex */
public final class sab extends RecyclerView.AbstractC2378o {

    /* renamed from: a */
    public final int f45086a = AbstractC0000a.m0a(16);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
    /* renamed from: g */
    public void mo9226g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
        sq8.m48649h(rect, "outRect");
        sq8.m48649h(view, "view");
        sq8.m48649h(recyclerView, "parent");
        sq8.m48649h(c2389z, "state");
        RecyclerView.AbstractC2379p layoutManager = recyclerView.getLayoutManager();
        sq8.m48647f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iI3 = gridLayoutManager.i3();
        double dM9242j = gridLayoutManager.m9242j();
        double d = iI3;
        int iCeil = (int) Math.ceil(dM9242j / d);
        if (recyclerView.j0(view) == -1) {
            super.mo9226g(rect, view, recyclerView, c2389z);
        }
        if (((int) Math.ceil((r3 + 1) / d)) != iCeil) {
            rect.bottom = this.f45086a;
        }
    }
}
