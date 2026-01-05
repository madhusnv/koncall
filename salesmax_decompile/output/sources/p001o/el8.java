package p001o;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class el8 {

    /* renamed from: a */
    public final SparseArray f21802a;

    public el8(SparseArray sparseArray) {
        this.f21802a = sparseArray;
    }

    /* renamed from: a */
    public final void m25205a() {
        this.f21802a.clear();
    }

    /* renamed from: b */
    public final Object m25206b(int i) {
        return this.f21802a.get(i);
    }

    /* renamed from: c */
    public final void m25207c(int i, Object obj) {
        this.f21802a.put(i, obj);
    }

    public el8(int i) {
        this(new SparseArray(i));
    }

    public /* synthetic */ el8(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
