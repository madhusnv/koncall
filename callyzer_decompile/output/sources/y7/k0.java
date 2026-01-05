package y7;

import android.util.SparseArray;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    public SparseArray f41696a;

    /* renamed from: b */
    public int f41697b;

    /* renamed from: a */
    public final j0 m15871a(int i10) {
        SparseArray sparseArray = this.f41696a;
        j0 j0Var = (j0) sparseArray.get(i10);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0();
        sparseArray.put(i10, j0Var2);
        return j0Var2;
    }
}
