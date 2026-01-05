package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 implements f1 {

    /* renamed from: a */
    public final String f2536a;

    /* renamed from: b */
    public final int f2537b;

    /* renamed from: c */
    public final /* synthetic */ j1 f2538c;

    public g1(j1 j1Var, String str, int i10) {
        this.f2538c = j1Var;
        this.f2536a = str;
        this.f2537b = i10;
    }

    @Override // androidx.fragment.app.f1
    /* renamed from: a */
    public final boolean mo1086a(ArrayList arrayList, ArrayList arrayList2) {
        j0 j0Var = this.f2538c.f2604z;
        if (j0Var != null && this.f2537b < 0 && this.f2536a == null && j0Var.getChildFragmentManager().m1168S(-1, 0)) {
            return false;
        }
        return this.f2538c.m1169T(arrayList, arrayList2, this.f2536a, this.f2537b, 1);
    }
}
