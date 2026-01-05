package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes2.dex */
public abstract class AbstractC2412r extends RecyclerView.AbstractC2376m {

    /* renamed from: g */
    public boolean f10190g = true;

    /* renamed from: A */
    public abstract boolean mo9472A(RecyclerView.d0 d0Var);

    /* renamed from: B */
    public final void m9665B(RecyclerView.d0 d0Var) {
        m9673J(d0Var);
        m9205h(d0Var);
    }

    /* renamed from: C */
    public final void m9666C(RecyclerView.d0 d0Var) {
        m9674K(d0Var);
    }

    /* renamed from: D */
    public final void m9667D(RecyclerView.d0 d0Var, boolean z) {
        m9675L(d0Var, z);
        m9205h(d0Var);
    }

    /* renamed from: E */
    public final void m9668E(RecyclerView.d0 d0Var, boolean z) {
        m9676M(d0Var, z);
    }

    /* renamed from: F */
    public final void m9669F(RecyclerView.d0 d0Var) {
        m9677N(d0Var);
        m9205h(d0Var);
    }

    /* renamed from: G */
    public final void m9670G(RecyclerView.d0 d0Var) {
        m9678O(d0Var);
    }

    /* renamed from: H */
    public final void m9671H(RecyclerView.d0 d0Var) {
        m9679P(d0Var);
        m9205h(d0Var);
    }

    /* renamed from: I */
    public final void m9672I(RecyclerView.d0 d0Var) {
        m9680Q(d0Var);
    }

    /* renamed from: J */
    public void m9673J(RecyclerView.d0 d0Var) {
    }

    /* renamed from: K */
    public void m9674K(RecyclerView.d0 d0Var) {
    }

    /* renamed from: L */
    public void m9675L(RecyclerView.d0 d0Var, boolean z) {
    }

    /* renamed from: M */
    public void m9676M(RecyclerView.d0 d0Var, boolean z) {
    }

    /* renamed from: N */
    public void m9677N(RecyclerView.d0 d0Var) {
    }

    /* renamed from: O */
    public void m9678O(RecyclerView.d0 d0Var) {
    }

    /* renamed from: P */
    public void m9679P(RecyclerView.d0 d0Var) {
    }

    /* renamed from: Q */
    public void m9680Q(RecyclerView.d0 d0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: a */
    public boolean mo9199a(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar, RecyclerView.AbstractC2376m.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.f9822a) == (i2 = cVar2.f9822a) && cVar.f9823b == cVar2.f9823b)) ? mo9482x(d0Var) : mo9484z(d0Var, i, cVar.f9823b, i2, cVar2.f9823b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: b */
    public boolean mo9200b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.AbstractC2376m.c cVar, RecyclerView.AbstractC2376m.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f9822a;
        int i4 = cVar.f9823b;
        if (d0Var2.m9134L()) {
            int i5 = cVar.f9822a;
            i2 = cVar.f9823b;
            i = i5;
        } else {
            i = cVar2.f9822a;
            i2 = cVar2.f9823b;
        }
        return mo9483y(d0Var, d0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: c */
    public boolean mo9201c(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar, RecyclerView.AbstractC2376m.c cVar2) {
        int i = cVar.f9822a;
        int i2 = cVar.f9823b;
        View view = d0Var.f9794a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f9822a;
        int top = cVar2 == null ? view.getTop() : cVar2.f9823b;
        if (d0Var.m9160x() || (i == left && i2 == top)) {
            return mo9472A(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo9484z(d0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: d */
    public boolean mo9202d(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar, RecyclerView.AbstractC2376m.c cVar2) {
        int i = cVar.f9822a;
        int i2 = cVar2.f9822a;
        if (i != i2 || cVar.f9823b != cVar2.f9823b) {
            return mo9484z(d0Var, i, cVar.f9823b, i2, cVar2.f9823b);
        }
        m9669F(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: f */
    public boolean mo9203f(RecyclerView.d0 d0Var) {
        return !this.f10190g || d0Var.m9158v();
    }

    /* renamed from: x */
    public abstract boolean mo9482x(RecyclerView.d0 d0Var);

    /* renamed from: y */
    public abstract boolean mo9483y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo9484z(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);
}
