package k2;

import fx.InterfaceC2395a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 implements Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final v1 f20604a;

    /* renamed from: b */
    public final int f20605b;

    /* renamed from: c */
    public final int f20606c;

    public w1(v1 v1Var, int i10, int i11) {
        this.f20604a = v1Var;
        this.f20605b = i10;
        this.f20606c = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10;
        ArrayList arrayList;
        int iM8709e;
        v1 v1Var = this.f20604a;
        if (v1Var.f20600h != this.f20606c) {
            x1.m8710f();
        }
        HashMap map = v1Var.f20602k;
        C3952a c3952a = null;
        int i11 = this.f20605b;
        if (map != null) {
            if (v1Var.f20599g) {
                AbstractC3967p.m8636c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i11 >= 0 && i11 < (i10 = v1Var.f20594b) && (iM8709e = x1.m8709e((arrayList = v1Var.f20601j), i11, i10)) >= 0) {
                c3952a = (C3952a) arrayList.get(iM8709e);
            }
            if (c3952a != null) {
            }
        }
        return new j0(v1Var, i11 + 1, v1Var.f20593a[(i11 * 5) + 3] + i11);
    }
}
