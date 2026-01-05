package r1;

import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import k1.x0;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import og.hg;
import og.ue;
import q1.C6098z;
import rw.C6668r;
import tx.c0;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.z */
/* loaded from: classes.dex */
public abstract class AbstractC6441z {

    /* renamed from: a */
    public static final C6433r f31096a;

    static {
        C6098z c6098z = new C6098z(1);
        x0 x0Var = x0.Vertical;
        f31096a = new C6433r(null, 0, false, DefinitionKt.NO_Float_VALUE, c6098z, DefinitionKt.NO_Float_VALUE, false, c0.m13479b(C7565i.f36440a), ue.m10985a(), 0, C6432q.f31017e, C6668r.f31943a, 0, 0, 0, x0Var, 0, 0);
    }

    /* renamed from: a */
    public static final C6440y m12436a(int i10, int i11, InterfaceC3962k interfaceC3962k) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        C0917l c0917l = C6440y.f31073w;
        boolean zM8612e = ((C3966o) interfaceC3962k).m8612e(i10) | ((C3966o) interfaceC3962k).m8612e(0);
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (zM8612e || objM8596M == C3961j.f20408a) {
            objM8596M = new q1.a0(i10, 1);
            c3966o.j0(objM8596M);
        }
        return (C6440y) hg.m10691b(objArr, c0917l, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
    }
}
