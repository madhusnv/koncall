package p3;

import com.google.android.gms.internal.measurement.j4;
import e1.C1915q;
import m2.C4640e;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.i */
/* loaded from: classes.dex */
public class C5811i {

    /* renamed from: a */
    public final C4640e f28465a = new C4640e(new C5810h[16]);

    /* renamed from: b */
    public final e1.e0 f28466b = new e1.e0(10);

    /* renamed from: a */
    public boolean mo11390a(C1915q c1915q, InterfaceC7033t interfaceC7033t, j4 j4Var, boolean z6) {
        C4640e c4640e = this.f28465a;
        Object[] objArr = c4640e.f22884a;
        int i10 = c4640e.f22886c;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z10 = ((C5810h) objArr[i11]).mo11390a(c1915q, interfaceC7033t, j4Var, z6) || z10;
        }
        return z10;
    }

    /* renamed from: b */
    public void mo11391b(j4 j4Var) {
        C4640e c4640e = this.f28465a;
        int i10 = c4640e.f22886c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((C5810h) c4640e.f22884a[i10]).f28447d.f9605b == 0) {
                c4640e.m9515m(i10);
            }
        }
    }
}
