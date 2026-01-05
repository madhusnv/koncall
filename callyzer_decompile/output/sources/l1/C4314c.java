package l1;

import b2.j0;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Iterator;
import k1.q1;
import k2.e1;
import pg.w9;
import q1.C6090r;
import q1.C6091s;
import q1.C6097y;
import t1.AbstractC7000y;
import t1.C6993r;
import t1.C6995t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.c */
/* loaded from: classes.dex */
public final class C4314c implements InterfaceC4324m {

    /* renamed from: a */
    public final /* synthetic */ int f21747a = 0;

    /* renamed from: b */
    public final /* synthetic */ q1 f21748b;

    /* renamed from: c */
    public final /* synthetic */ Object f21749c;

    public C4314c(AbstractC7000y abstractC7000y, j0 j0Var, C6995t c6995t) {
        this.f21748b = abstractC7000y;
        this.f21749c = j0Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // l1.InterfaceC4324m
    /* renamed from: a */
    public final float mo6336a(float f6, float f10) {
        switch (this.f21747a) {
            case 0:
                float fAbs = Math.abs(f10);
                C6090r c6090rM12134h = ((C6097y) this.f21748b).m12134h();
                int i10 = 0;
                if (!c6090rM12134h.f29726k.isEmpty()) {
                    ?? r02 = c6090rM12134h.f29726k;
                    int size = r02.size();
                    Iterator it = r02.iterator();
                    while (it.hasNext()) {
                        i10 += ((C6091s) it.next()).f29745m;
                    }
                    i10 /= size;
                }
                float f11 = fAbs - i10;
                if (f11 < DefinitionKt.NO_Float_VALUE) {
                    f11 = 0.0f;
                }
                return Math.signum(f10) * f11;
            default:
                AbstractC7000y abstractC7000y = (AbstractC7000y) this.f21748b;
                int iM13265m = abstractC7000y.m13265m();
                e1 e1Var = abstractC7000y.f33913p;
                int i11 = ((C6993r) e1Var.getValue()).f33853c + iM13265m;
                if (i11 == 0) {
                    return DefinitionKt.NO_Float_VALUE;
                }
                int i12 = f6 < DefinitionKt.NO_Float_VALUE ? abstractC7000y.f33902e + 1 : abstractC7000y.f33902e;
                int iM11912c = w9.m11912c(((int) (f10 / i11)) + i12, 0, abstractC7000y.mo13252l());
                abstractC7000y.m13265m();
                int i13 = ((C6993r) e1Var.getValue()).f33853c;
                long j6 = i12;
                long j10 = 1;
                long j11 = j6 - j10;
                if (j11 < 0) {
                    j11 = 0;
                }
                int i14 = (int) j11;
                long j12 = j6 + j10;
                if (j12 > 2147483647L) {
                    j12 = 2147483647L;
                }
                int iAbs = Math.abs((w9.m11912c(w9.m11912c(iM11912c, i14, (int) j12), 0, abstractC7000y.mo13252l()) - i12) * i11) - i11;
                int i15 = iAbs >= 0 ? iAbs : 0;
                if (i15 == 0) {
                    return i15;
                }
                return Math.signum(f6) * i15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // l1.InterfaceC4324m
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float mo6337b(float r19) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C4314c.mo6337b(float):float");
    }

    public C4314c(C6097y c6097y, InterfaceC4326o interfaceC4326o) {
        this.f21748b = c6097y;
        this.f21749c = interfaceC4326o;
    }
}
