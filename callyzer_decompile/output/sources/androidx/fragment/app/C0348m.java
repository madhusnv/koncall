package androidx.fragment.app;

import a3.C0043b;
import a9.C0069h;
import android.net.ConnectivityManager;
import android.view.ViewGroup;
import b2.C0554l;
import c3.C0848c;
import cv.C1528x;
import e1.C1922x;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import g2.ja;
import g2.ka;
import g2.r7;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import k1.C3932g;
import k1.C3934i;
import k1.InterfaceC3928c;
import k2.C3966o;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4164v;
import kx.C4266h;
import l2.C4328a;
import l2.C4329b;
import m2.C4640e;
import n1.AbstractC4941a;
import nf.C5047i;
import p012n.ViewOnAttachStateChangeListenerC4924d;
import pg.z8;
import q1.C6075c;
import q1.C6080h;
import q1.C6082j;
import q1.C6097y;
import s4.C6756l;
import t1.C6989n;
import t8.C7077w;
import tx.InterfaceC7266z;
import u1.C7303e;
import uw.InterfaceC7559c;
import w3.AbstractC7883a;
import w3.C7892j;
import wr.C8158n;
import y8.AbstractC8600i;
import y8.C8598g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public final class C0348m extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f2622a;

    /* renamed from: b */
    public final /* synthetic */ Object f2623b;

    /* renamed from: c */
    public final /* synthetic */ Object f2624c;

    /* renamed from: d */
    public final /* synthetic */ Object f2625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0348m(int i10, Object obj, Object obj2, Object obj3) {
        super(0);
        this.f2622a = i10;
        this.f2623b = obj;
        this.f2624c = obj2;
        this.f2625d = obj3;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        InterfaceC7559c interfaceC7559c = null;
        switch (this.f2622a) {
            case 0:
                ((C0349n) this.f2623b).f2632f.mo1099c((ViewGroup) this.f2624c, this.f2625d);
                return qw.a0.f30746a;
            case 1:
                ja jaVar = (ja) this.f2623b;
                if (((Boolean) ((InterfaceC2139c) jaVar.f11872b.f5654d).invoke(ka.Hidden)).booleanValue()) {
                    tx.c0.m13502y((InterfaceC7266z) this.f2624c, null, null, new C1528x(jaVar, interfaceC7559c, 4), 3).v0(new r7(jaVar, (InterfaceC2137a) this.f2625d, 0));
                }
                return qw.a0.f30746a;
            case 2:
                if (((Boolean) ((InterfaceC2139c) ((ja) this.f2623b).f11872b.f5654d).invoke(ka.Expanded)).booleanValue()) {
                    tx.c0.m13502y((InterfaceC7266z) this.f2624c, null, null, new C1528x((ja) this.f2625d, interfaceC7559c, 5), 3);
                }
                return Boolean.TRUE;
            case 3:
                qw.a0 a0Var = qw.a0.f30746a;
                C3934i c3934i = (C3934i) this.f2623b;
                C5047i c5047i = c3934i.f20118v;
                while (true) {
                    C4640e c4640e = (C4640e) c5047i.f24823b;
                    int i10 = c4640e.f22886c;
                    if (i10 != 0) {
                        if (i10 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        C0848c c0848c = (C0848c) ((C3932g) c4640e.f22884a[i10 - 1]).f20100a.invoke();
                        if (c0848c == null ? true : c3934i.N0(c0848c, c3934i.f20122z)) {
                            C4640e c4640e2 = (C4640e) c5047i.f24823b;
                            ((C3932g) c4640e2.m9515m(c4640e2.f22886c - 1)).f20101b.resumeWith(a0Var);
                        }
                    }
                }
                if (c3934i.f20120x) {
                    C0848c c0848cM0 = c3934i.M0();
                    if (c0848cM0 != null && c3934i.N0(c0848cM0, c3934i.f20122z)) {
                        c3934i.f20120x = false;
                    }
                }
                ((k1.l2) this.f2624c).f20174e = C3934i.L0(c3934i, (InterfaceC3928c) this.f2625d);
                return a0Var;
            case 4:
                C3966o c3966o = (C3966o) this.f2623b;
                C4329b c4329b = c3966o.f20458L;
                C4328a c4328a = (C4328a) this.f2624c;
                k2.u1 u1Var = (k2.u1) this.f2625d;
                C4328a c4328a2 = c4329b.f21792b;
                try {
                    c4329b.f21792b = c4328a;
                    k2.u1 u1Var2 = c3966o.f20452F;
                    int[] iArr = c3966o.f20477n;
                    C1922x c1922x = c3966o.f20484u;
                    c3966o.f20477n = null;
                    c3966o.f20484u = null;
                    try {
                        c3966o.f20452F = u1Var;
                        boolean z6 = c4329b.f21795e;
                        try {
                            c4329b.f21795e = false;
                            throw null;
                        } catch (Throwable th2) {
                            c4329b.f21795e = z6;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        c3966o.f20452F = u1Var2;
                        c3966o.f20477n = iArr;
                        c3966o.f20484u = c1922x;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    c4329b.f21792b = c4328a2;
                    throw th4;
                }
            case 5:
                C6080h c6080h = (C6080h) ((k2.c0) this.f2623b).getValue();
                C6097y c6097y = (C6097y) this.f2624c;
                return new C6082j(c6097y, c6080h, (C6075c) this.f2625d, new C0554l((C4266h) c6097y.f29773d.f29756f.getValue(), c6080h));
            case 6:
                return new C6989n((InterfaceC2143g) ((k2.w0) this.f2623b).getValue(), (InterfaceC2139c) ((k2.w0) this.f2624c).getValue(), ((Number) ((InterfaceC2137a) this.f2625d).invoke()).intValue());
            case 7:
                C7303e c7303e = (C7303e) this.f2623b;
                C0848c c0848cL0 = C7303e.L0(c7303e, (v3.h1) this.f2624c, (C0043b) this.f2625d);
                if (c0848cL0 == null) {
                    return null;
                }
                C3934i c3934i2 = c7303e.f34833q;
                if (C6756l.m12948a(c3934i2.f20122z, 0L)) {
                    AbstractC4941a.m9886c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c0848cL0.m2287i(c3934i2.P0(c0848cL0, c3934i2.f20122z) ^ (-9223372034707292160L));
            case 8:
                AbstractC7883a abstractC7883a = (AbstractC7883a) this.f2623b;
                abstractC7883a.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC4924d) this.f2624c);
                C7892j listener = (C7892j) this.f2625d;
                AbstractC4154l.m8923f(listener, "listener");
                z8.m11968c(abstractC7883a).f20787a.remove(listener);
                return qw.a0.f30746a;
            case 9:
                tx.c0.m13502y((InterfaceC7266z) this.f2623b, null, tx.b0.UNDISPATCHED, new o6.s0((k2.w0) this.f2624c, (b2.y0) this.f2625d, interfaceC7559c, 19), 1);
                return qw.a0.f30746a;
            case 10:
                if (((C4164v) this.f2623b).f21160a) {
                    C7077w c7077wM13371a = C7077w.m13371a();
                    int i11 = AbstractC8600i.f41852a;
                    c7077wM13371a.getClass();
                    ((ConnectivityManager) this.f2624c).unregisterNetworkCallback((C0069h) this.f2625d);
                }
                return qw.a0.f30746a;
            default:
                Object obj = C8598g.f41847b;
                C8158n c8158n = (C8158n) this.f2623b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f2624c;
                C8598g c8598g = (C8598g) this.f2625d;
                synchronized (obj) {
                    LinkedHashMap linkedHashMap = C8598g.f41848c;
                    linkedHashMap.remove(c8158n);
                    if (linkedHashMap.isEmpty()) {
                        C7077w c7077wM13371a2 = C7077w.m13371a();
                        int i12 = AbstractC8600i.f41852a;
                        c7077wM13371a2.getClass();
                        connectivityManager.unregisterNetworkCallback(c8598g);
                        C8598g.f41846a.getClass();
                        C8598g.f41849d = null;
                        C8598g.f41850e = false;
                    }
                }
                return qw.a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348m(C3966o c3966o, C4328a c4328a, k2.u1 u1Var, k2.v0 v0Var) {
        super(0);
        this.f2622a = 4;
        this.f2623b = c3966o;
        this.f2624c = c4328a;
        this.f2625d = u1Var;
    }
}
