package t1;

import b2.C0563u;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import k1.x0;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import l1.C4325n;
import og.hg;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import pg.w9;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a */
    public static final float f33756a = 56;

    /* renamed from: b */
    public static final C6993r f33757b = new C6993r(0, 0, 0, x0.Horizontal, 0, 0, 0, C4325n.f21785c, new C7001z(), tx.c0.m13479b(C7565i.f36440a));

    /* renamed from: c */
    public static final a0 f33758c = new a0();

    /* renamed from: a */
    public static final long m13250a(C6993r c6993r, int i10) {
        int i11 = c6993r.f33853c;
        long j6 = i10 * (c6993r.f33852b + i11);
        int i12 = -c6993r.f33856f;
        long j10 = ((j6 + i12) + c6993r.f33854d) - i11;
        int iM13256f = (int) (c6993r.f33855e == x0.Horizontal ? c6993r.m13256f() >> 32 : c6993r.m13256f() & 4294967295L);
        long jM11912c = j10 - (iM13256f - w9.m11912c(c6993r.f33864n.mo9045a(iM13256f, c6993r.f33852b, i12, r1), 0, iM13256f));
        if (jM11912c < 0) {
            return 0L;
        }
        return jM11912c;
    }

    /* renamed from: b */
    public static final C6979d m13251b(int i10, int i11, int i12, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k) {
        boolean z6 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        C0917l c0917l = C6979d.f33766I;
        boolean zM8612e = ((C3966o) interfaceC3962k).m8612e(i10) | ((C3966o) interfaceC3962k).m8611d(DefinitionKt.NO_Float_VALUE);
        if ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !((C3966o) interfaceC3962k).m8614g(interfaceC2137a)) && (i11 & KyberEngine.KyberPolyBytes) != 256) {
            z6 = false;
        }
        boolean z10 = zM8612e | z6;
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (z10 || objM8596M == C3961j.f20408a) {
            objM8596M = new C0563u(i10, interfaceC2137a, 3);
            c3966o.j0(objM8596M);
        }
        C6979d c6979d = (C6979d) hg.m10691b(objArr, c0917l, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
        c6979d.f33767H.setValue(interfaceC2137a);
        return c6979d;
    }
}
