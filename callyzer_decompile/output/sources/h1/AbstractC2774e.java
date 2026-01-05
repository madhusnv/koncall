package h1;

import a3.C0043b;
import bs.C0749g;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import pg.o6;
import s4.C6750f;
import vx.InterfaceC7810l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.e */
/* loaded from: classes.dex */
public abstract class AbstractC2774e {

    /* renamed from: a */
    public static final a1 f15394a = AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);

    static {
        Object obj = h2.f15452a;
        AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, new C6750f(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    /* renamed from: a */
    public static final k2.h2 m6798a(float f6, w1 w1Var, InterfaceC3962k interfaceC3962k) {
        return m6800c(new C6750f(f6), y1.f15666c, w1Var, null, "DpAnimation", interfaceC3962k, KyberEngine.KyberPolyBytes, 8);
    }

    /* renamed from: b */
    public static final k2.h2 m6799b(float f6, InterfaceC2779j interfaceC2779j, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        InterfaceC2779j interfaceC2779j2;
        int i12 = i11 & 2;
        a1 a1Var = f15394a;
        if (i12 != 0) {
            interfaceC2779j = a1Var;
        }
        if (interfaceC2779j == a1Var) {
            C3966o c3966o = (C3966o) interfaceC3962k;
            c3966o.m8607Y(1125558999);
            boolean zM8611d = c3966o.m8611d(0.01f);
            Object objM8596M = c3966o.m8596M();
            if (zM8611d || objM8596M == C3961j.f20408a) {
                objM8596M = AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, Float.valueOf(0.01f), 3);
                c3966o.j0(objM8596M);
            }
            c3966o.m8623p(false);
            interfaceC2779j2 = (a1) objM8596M;
        } else {
            C3966o c3966o2 = (C3966o) interfaceC3962k;
            c3966o2.m8607Y(1125668925);
            c3966o2.m8623p(false);
            interfaceC2779j2 = interfaceC2779j;
        }
        return m6800c(Float.valueOf(f6), y1.f15664a, interfaceC2779j2, Float.valueOf(0.01f), "FloatAnimation", interfaceC3962k, 0, 0);
    }

    /* renamed from: c */
    public static final k2.h2 m6800c(Object obj, x1 x1Var, InterfaceC2779j interfaceC2779j, Float f6, String str, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        if ((i11 & 8) != 0) {
            f6 = null;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        Object obj2 = C3961j.f20408a;
        if (objM8596M == obj2) {
            objM8596M = C3953b.m8517t(null);
            c3966o.j0(objM8596M);
        }
        k2.w0 w0Var = (k2.w0) objM8596M;
        Object objM8596M2 = c3966o.m8596M();
        if (objM8596M2 == obj2) {
            objM8596M2 = new C2772c(obj, x1Var, f6);
            c3966o.j0(objM8596M2);
        }
        C2772c c2772c = (C2772c) objM8596M2;
        Object objM8520w = C3953b.m8520w(null, c3966o);
        if (f6 != null && (interfaceC2779j instanceof a1)) {
            a1 a1Var = (a1) interfaceC2779j;
            if (!AbstractC4154l.m8918a(a1Var.f15347c, f6)) {
                interfaceC2779j = new a1(a1Var.f15345a, a1Var.f15346b, f6);
            }
        }
        Object objM8520w2 = C3953b.m8520w(interfaceC2779j, c3966o);
        Object objM8596M3 = c3966o.m8596M();
        if (objM8596M3 == obj2) {
            objM8596M3 = o6.m11805a(-1, null, null, 6);
            c3966o.j0(objM8596M3);
        }
        Object obj3 = (InterfaceC7810l) objM8596M3;
        boolean zM8616i = c3966o.m8616i(obj3) | c3966o.m8616i(obj);
        Object objM8596M4 = c3966o.m8596M();
        if (zM8616i || objM8596M4 == obj2) {
            objM8596M4 = new C0043b(8, obj3, obj);
            c3966o.j0(objM8596M4);
        }
        C3953b.m8505h((InterfaceC2137a) objM8596M4, c3966o);
        boolean zM8616i2 = c3966o.m8616i(obj3) | c3966o.m8616i(c2772c) | c3966o.m8614g(objM8520w2) | c3966o.m8614g(objM8520w);
        Object objM8596M5 = c3966o.m8596M();
        if (zM8616i2 || objM8596M5 == obj2) {
            Object c0749g = new C0749g(obj3, c2772c, objM8520w2, objM8520w, null, 4);
            c3966o.j0(c0749g);
            objM8596M5 = c0749g;
        }
        C3953b.m8503f((InterfaceC2141e) objM8596M5, obj3, c3966o);
        k2.h2 h2Var = (k2.h2) w0Var.getValue();
        return h2Var == null ? c2772c.f15360c : h2Var;
    }
}
