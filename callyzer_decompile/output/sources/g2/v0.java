package g2;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import h1.C2772c;
import h1.C2780k;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import m1.C4620b;
import m1.C4622d;
import m1.C4626h;
import m1.C4633o;
import m1.InterfaceC4628j;
import m1.InterfaceC4630l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import rw.AbstractC6663m;
import s4.C6750f;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a */
    public final float f12922a;

    /* renamed from: b */
    public final float f12923b;

    /* renamed from: c */
    public final float f12924c;

    /* renamed from: d */
    public final float f12925d;

    /* renamed from: e */
    public final float f12926e;

    /* renamed from: f */
    public final float f12927f;

    public v0(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f12922a = f6;
        this.f12923b = f10;
        this.f12924c = f11;
        this.f12925d = f12;
        this.f12926e = f13;
        this.f12927f = f14;
    }

    /* renamed from: a */
    public final k2.h2 m6327a(boolean z6, InterfaceC4630l interfaceC4630l, InterfaceC3962k interfaceC3962k, int i10) {
        C2772c c2772c;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-1763481333);
        c3966o.m8607Y(-734838460);
        float f6 = this.f12922a;
        k2.s0 s0Var = C3961j.f20408a;
        if (interfaceC4630l == null) {
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(new C6750f(f6));
                c3966o.j0(objM8596M);
            }
            k2.w0 w0Var = (k2.w0) objM8596M;
            c3966o.m8623p(false);
            c3966o.m8623p(false);
            return w0Var;
        }
        c3966o.m8623p(false);
        Object objM8596M2 = c3966o.m8596M();
        if (objM8596M2 == s0Var) {
            objM8596M2 = new C7320q();
            c3966o.j0(objM8596M2);
        }
        C7320q c7320q = (C7320q) objM8596M2;
        boolean z10 = true;
        boolean z11 = (((i10 & 112) ^ 48) > 32 && c3966o.m8614g(interfaceC4630l)) || (i10 & 48) == 32;
        Object objM8596M3 = c3966o.m8596M();
        if (z11 || objM8596M3 == s0Var) {
            objM8596M3 = new m0(interfaceC4630l, c7320q, null, 1);
            c3966o.j0(objM8596M3);
        }
        C3953b.m8503f((InterfaceC2141e) objM8596M3, interfaceC4630l, c3966o);
        InterfaceC4628j interfaceC4628j = (InterfaceC4628j) AbstractC6663m.m12751O(c7320q);
        if (!z6) {
            f6 = this.f12927f;
        } else if (interfaceC4628j instanceof C4633o) {
            f6 = this.f12923b;
        } else if (interfaceC4628j instanceof C4626h) {
            f6 = this.f12925d;
        } else if (interfaceC4628j instanceof C4622d) {
            f6 = this.f12924c;
        } else if (interfaceC4628j instanceof C4620b) {
            f6 = this.f12926e;
        }
        Object objM8596M4 = c3966o.m8596M();
        if (objM8596M4 == s0Var) {
            objM8596M4 = new C2772c(new C6750f(f6), h1.y1.f15666c, null, 12);
            c3966o.j0(objM8596M4);
        }
        C2772c c2772c2 = (C2772c) objM8596M4;
        C6750f c6750f = new C6750f(f6);
        boolean zM8616i = c3966o.m8616i(c2772c2) | c3966o.m8611d(f6) | ((((i10 & 14) ^ 6) > 4 && c3966o.m8615h(z6)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !c3966o.m8614g(this)) && (i10 & KyberEngine.KyberPolyBytes) != 256) {
            z10 = false;
        }
        boolean zM8616i2 = zM8616i | z10 | c3966o.m8616i(interfaceC4628j);
        Object objM8596M5 = c3966o.m8596M();
        if (zM8616i2 || objM8596M5 == s0Var) {
            c2772c = c2772c2;
            n0 n0Var = new n0(c2772c, f6, z6, this, interfaceC4628j, null, 1);
            c3966o.j0(n0Var);
            objM8596M5 = n0Var;
        } else {
            c2772c = c2772c2;
        }
        C3953b.m8503f((InterfaceC2141e) objM8596M5, c6750f, c3966o);
        C2780k c2780k = c2772c.f15360c;
        c3966o.m8623p(false);
        return c2780k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return C6750f.m12935a(this.f12922a, v0Var.f12922a) && C6750f.m12935a(this.f12923b, v0Var.f12923b) && C6750f.m12935a(this.f12924c, v0Var.f12924c) && C6750f.m12935a(this.f12925d, v0Var.f12925d) && C6750f.m12935a(this.f12927f, v0Var.f12927f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12927f) + AbstractC1452a.m4555b(this.f12925d, AbstractC1452a.m4555b(this.f12924c, AbstractC1452a.m4555b(this.f12923b, Float.hashCode(this.f12922a) * 31, 31), 31), 31);
    }
}
