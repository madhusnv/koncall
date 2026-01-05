package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p001o.nfa;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes2.dex */
public final class C2396b implements nfa {

    /* renamed from: a */
    public final RecyclerView.AbstractC2371h f9944a;

    public C2396b(RecyclerView.AbstractC2371h abstractC2371h) {
        this.f9944a = abstractC2371h;
    }

    @Override // p001o.nfa
    /* renamed from: a */
    public void mo9426a(int i, int i2) {
        this.f9944a.notifyItemRangeInserted(i, i2);
    }

    @Override // p001o.nfa
    /* renamed from: b */
    public void mo9427b(int i, int i2) {
        this.f9944a.notifyItemRangeRemoved(i, i2);
    }

    @Override // p001o.nfa
    /* renamed from: c */
    public void mo9428c(int i, int i2, Object obj) {
        this.f9944a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // p001o.nfa
    /* renamed from: d */
    public void mo9429d(int i, int i2) {
        this.f9944a.notifyItemMoved(i, i2);
    }
}
