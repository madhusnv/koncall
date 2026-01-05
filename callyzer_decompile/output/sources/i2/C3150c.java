package i2;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.draw.AbstractC0258a;
import androidx.compose.ui.graphics.AbstractC0260a;
import com.sun.mail.util.AbstractC1452a;
import g2.v1;
import g2.y1;
import h1.AbstractC2773d;
import j2.AbstractC3530j;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import og.rf;
import s2.AbstractC6740i;
import t3.j0;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.c */
/* loaded from: classes.dex */
public final class C3150c {

    /* renamed from: a */
    public static final C3150c f17029a = new C3150c();

    /* renamed from: b */
    public static final C7860d f17030b = AbstractC7861e.f37635a;

    /* renamed from: c */
    public static final float f17031c = 80;

    /* renamed from: d */
    public static final float f17032d = AbstractC3530j.f18615c;

    /* renamed from: a */
    public final void m7526a(InterfaceC3161n interfaceC3161n, boolean z6, InterfaceC7879r interfaceC7879r, long j6, long j10, float f6, InterfaceC3962k interfaceC3962k, int i10) {
        float f10;
        long j11;
        int i11;
        long j12;
        long j13;
        float f11;
        long j14;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1076870256);
        int i12 = i10 | (c3966o.m8614g(interfaceC3161n) ? 4 : 2) | (c3966o.m8615h(z6) ? 32 : 16) | (c3966o.m8614g(interfaceC7879r) ? 256 : 128) | 74752;
        if ((599187 & i12) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
            j13 = j6;
            j14 = j10;
            f11 = f6;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                i2 i2Var = y1.f13286a;
                long j15 = ((v1) c3966o.m8618k(i2Var)).f12934G;
                long j16 = ((v1) c3966o.m8618k(i2Var)).f12972s;
                f10 = f17031c;
                j11 = j16;
                i11 = i12 & (-523265);
                j12 = j15;
            } else {
                c3966o.m8601S();
                j11 = j10;
                f10 = f6;
                i11 = i12 & (-523265);
                j12 = j6;
            }
            c3966o.m8624q();
            float f12 = AbstractC3154g.f17042a;
            InterfaceC7879r interfaceC7879rM709c = AbstractC0258a.m709c(AbstractC0245d.m678o(interfaceC7879r, AbstractC3154g.f17045d), C3151d.f17033b);
            float f13 = f17032d;
            C7860d c7860d = f17030b;
            float f14 = f10;
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(AbstractC0260a.m714a(interfaceC7879rM709c, new C3152e(interfaceC3161n, z6, f14, f13, c7860d)), j12, c7860d);
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, false);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM633a);
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
            rf.m10881b(Boolean.valueOf(z6), null, AbstractC2773d.m6795r(100, 0, null, 6), null, AbstractC6740i.m12902d(167807595, new C3148a(j11, interfaceC3161n), c3966o), c3966o, ((i11 >> 3) & 14) | 24960, 10);
            c3966o.m8623p(true);
            j13 = j12;
            f11 = f14;
            j14 = j11;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C3149b(this, interfaceC3161n, z6, interfaceC7879r, j13, j14, f11, i10);
        }
    }
}
