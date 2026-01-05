package pg;

import android.content.Context;
import android.os.UserManager;
import b2.C0543a;
import b2.C0566x;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import i1.C3135n;
import j1.AbstractC3517i;
import j1.AbstractC3520l;
import j1.C3511c;
import j1.C3512d;
import j1.C3516h;
import j1.C3518j;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import og.xe;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.C6734c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p7 {
    /* renamed from: a */
    public static final void m11821a(C3518j c3518j, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, C0566x c0566x, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(645832757);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(c3518j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 32 : 16;
        }
        int i12 = i11 | KyberEngine.KyberPolyBytes;
        if ((i10 & 3072) == 0) {
            i12 |= c3966o.m8616i(c0566x) ? NewHope.SENDB_BYTES : 1024;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 1171) != 1170)) {
            AbstractC3517i abstractC3517i = (AbstractC3517i) c3518j.f18408a.getValue();
            if (!(abstractC3517i instanceof C3516h)) {
                k2.n1 n1VarM8628u = c3966o.m8628u();
                if (n1VarM8628u != null) {
                    n1VarM8628u.f20443d = new C0543a(c3518j, interfaceC2137a, c0566x, i10);
                    return;
                }
                return;
            }
            boolean zM8614g = c3966o.m8614g(abstractC3517i);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C3512d(xe.m11048e(((C3516h) abstractC3517i).f18407a));
                c3966o.j0(objM8596M);
            }
            AbstractC3520l.m8077c((C3512d) objM8596M, interfaceC2137a, c0566x, c3966o, i12 & 8176);
            interfaceC7879r = C7876o.f37669a;
        } else {
            c3966o.m8601S();
        }
        InterfaceC7879r interfaceC7879r2 = interfaceC7879r;
        k2.n1 n1VarM8628u2 = c3966o.m8628u();
        if (n1VarM8628u2 != null) {
            n1VarM8628u2.f20443d = new g2.w2(c3518j, interfaceC2137a, interfaceC7879r2, c0566x, i10);
        }
    }

    /* renamed from: b */
    public static final void m11822b(C3518j c3518j, InterfaceC2137a interfaceC2137a, C0566x c0566x, InterfaceC7879r interfaceC7879r, boolean z6, InterfaceC2137a interfaceC2137a2, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2137a interfaceC2137a3;
        C0566x c0566x2;
        InterfaceC7879r interfaceC7879r2;
        InterfaceC7879r interfaceC7879rM11373a;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1969259374);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(c3518j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            interfaceC2137a3 = interfaceC2137a;
            i11 |= c3966o.m8616i(interfaceC2137a3) ? 32 : 16;
        } else {
            interfaceC2137a3 = interfaceC2137a;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            c0566x2 = c0566x;
            i11 |= c3966o.m8616i(c0566x2) ? 256 : 128;
        } else {
            c0566x2 = c0566x;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= c3966o.m8615h(z6) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c3966o.m8616i(interfaceC2137a2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? 1048576 : 524288;
        }
        if (c3966o.m8598P(i12 & 1, (599187 & i12) != 599186)) {
            interfaceC7879r2 = C7876o.f37669a;
            if (z6) {
                c3966o.m8607Y(1021907653);
                boolean z10 = ((i12 & 14) == 4) | ((458752 & i12) == 131072);
                Object objM8596M = c3966o.m8596M();
                if (z10 || objM8596M == C3961j.f20408a) {
                    objM8596M = new C3135n(3, interfaceC2137a2, c3518j);
                    c3966o.j0(objM8596M);
                }
                interfaceC7879rM11373a = p3.b0.m11373a(interfaceC7879r2, C3511c.f18390a, new b2.d0(1, (InterfaceC2139c) objM8596M));
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(1022064513);
                c3966o.m8623p(false);
                interfaceC7879rM11373a = interfaceC7879r2;
            }
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, true);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM11373a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c6734c.invoke(c3966o, Integer.valueOf((i12 >> 18) & 14));
            m11821a(c3518j, interfaceC2137a3, null, c0566x2, c3966o, ((i12 << 3) & 7168) | (i12 & 126));
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g2.y0(c3518j, interfaceC2137a, c0566x, interfaceC7879r2, z6, interfaceC2137a2, c6734c, i10);
        }
    }

    /* renamed from: c */
    public static boolean m11823c(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
