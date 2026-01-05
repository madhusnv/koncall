package g2;

import ex.InterfaceC2141e;
import g1.C2429i;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class u9 {

    /* renamed from: a */
    public static final float f12886a = 16;

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6323a(w2.InterfaceC7879r r20, s2.C6734c r21, ex.InterfaceC2141e r22, ex.InterfaceC2141e r23, ex.InterfaceC2141e r24, int r25, long r26, long r28, o1.v1 r30, s2.C6734c r31, k2.InterfaceC3962k r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.u9.m6323a(w2.r, s2.c, ex.e, ex.e, ex.e, int, long, long, o1.v1, s2.c, k2.k, int, int):void");
    }

    /* renamed from: b */
    public static final void m6324b(int i10, C6734c c6734c, C6734c c6734c2, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, o1.v1 v1Var, InterfaceC2141e interfaceC2141e3, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        C6734c c6734c3;
        o1.v1 v1Var2;
        InterfaceC2141e interfaceC2141e4;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8612e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            c6734c3 = c6734c2;
            i12 |= c3966o.m8616i(c6734c3) ? 256 : 128;
        } else {
            c6734c3 = c6734c2;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o.m8616i(interfaceC2141e) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c3966o.m8616i(interfaceC2141e2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            v1Var2 = v1Var;
            i12 |= c3966o.m8614g(v1Var2) ? 131072 : 65536;
        } else {
            v1Var2 = v1Var;
        }
        if ((1572864 & i11) == 0) {
            interfaceC2141e4 = interfaceC2141e3;
            i12 |= c3966o.m8616i(interfaceC2141e4) ? 1048576 : 524288;
        } else {
            interfaceC2141e4 = interfaceC2141e3;
        }
        if ((i12 & 599187) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            boolean z6 = ((i12 & 896) == 256) | ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576);
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                C2429i c2429i = new C2429i(c6734c, interfaceC2141e, interfaceC2141e2, i10, v1Var2, interfaceC2141e4, c6734c3);
                c3966o.j0(c2429i);
                objM8596M = c2429i;
            }
            t3.c1.m13274c(null, (InterfaceC2141e) objM8596M, c3966o, 0, 1);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new w0(i10, c6734c, c6734c2, interfaceC2141e, interfaceC2141e2, v1Var, interfaceC2141e3, i11);
        }
    }
}
