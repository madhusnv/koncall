package gm;

import ab.C0084b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0403f;
import com.amplifyframework.statemachine.codegen.data.C1226a;
import com.websoptimization.callyzerbiz.MainActivity;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.b1;
import k2.l1;
import k2.m1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import og.hg;
import pg.g0;
import pg.w5;
import s2.AbstractC6740i;
import tx.InterfaceC7266z;
import uw.C7565i;
import uw.InterfaceC7559c;
import xu.AbstractC8463b;
import xv.C8489p;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gm.x */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2655x implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f14385a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f14386b;

    public /* synthetic */ C2655x(MainActivity mainActivity, int i10) {
        this.f14385a = i10;
        this.f14386b = mainActivity;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        b1 b1Var;
        int i10 = this.f14385a;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj3 = C3961j.f20408a;
        InterfaceC7559c interfaceC7559c = null;
        final int i11 = 0;
        final int i12 = 1;
        switch (i10) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = MainActivity.f7256m;
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final MainActivity mainActivity = this.f14386b;
                    C8489p c8489p = mainActivity.f7266k;
                    if (c8489p == null) {
                        AbstractC4154l.m8928k("permissionsViewModel");
                        throw null;
                    }
                    boolean zM8616i = c3966o.m8616i(mainActivity);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8616i || objM8596M == obj3) {
                        objM8596M = new InterfaceC2139c() { // from class: gm.y
                            @Override // ex.InterfaceC2139c
                            public final Object invoke(Object obj4) {
                                int i14 = i11;
                                qw.a0 a0Var2 = qw.a0.f30746a;
                                MainActivity mainActivity2 = mainActivity;
                                l7.a0 it = (l7.a0) obj4;
                                switch (i14) {
                                    case 0:
                                        int i15 = MainActivity.f7256m;
                                        AbstractC4154l.m8923f(it, "it");
                                        mainActivity2.f7263g = it;
                                        break;
                                    default:
                                        int i16 = MainActivity.f7256m;
                                        AbstractC4154l.m8923f(it, "it");
                                        mainActivity2.f7264h = it;
                                        break;
                                }
                                return a0Var2;
                            }
                        };
                        c3966o.j0(objM8596M);
                    }
                    InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M;
                    boolean zM8616i2 = c3966o.m8616i(mainActivity);
                    Object objM8596M2 = c3966o.m8596M();
                    if (zM8616i2 || objM8596M2 == obj3) {
                        objM8596M2 = new InterfaceC2139c() { // from class: gm.y
                            @Override // ex.InterfaceC2139c
                            public final Object invoke(Object obj4) {
                                int i14 = i12;
                                qw.a0 a0Var2 = qw.a0.f30746a;
                                MainActivity mainActivity2 = mainActivity;
                                l7.a0 it = (l7.a0) obj4;
                                switch (i14) {
                                    case 0:
                                        int i15 = MainActivity.f7256m;
                                        AbstractC4154l.m8923f(it, "it");
                                        mainActivity2.f7263g = it;
                                        break;
                                    default:
                                        int i16 = MainActivity.f7256m;
                                        AbstractC4154l.m8923f(it, "it");
                                        mainActivity2.f7264h = it;
                                        break;
                                }
                                return a0Var2;
                            }
                        };
                        c3966o.j0(objM8596M2);
                    }
                    AbstractC8463b.m15768a(c8489p, interfaceC2139c, (InterfaceC2139c) objM8596M2, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                return a0Var;
            default:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = MainActivity.f7256m;
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    Object objM8596M3 = c3966o2.m8596M();
                    if (objM8596M3 == obj3) {
                        objM8596M3 = C3953b.m8510m(C7565i.f36440a, c3966o2);
                        c3966o2.j0(objM8596M3);
                    }
                    InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M3;
                    Object[] objArr = new Object[0];
                    Object objM8596M4 = c3966o2.m8596M();
                    if (objM8596M4 == obj3) {
                        objM8596M4 = new C1226a(19);
                        c3966o2.j0(objM8596M4);
                    }
                    w0 w0Var = (w0) hg.m10691b(objArr, null, (InterfaceC2137a) objM8596M4, c3966o2, 0, 6);
                    Object[] objArr2 = new Object[0];
                    Object objM8596M5 = c3966o2.m8596M();
                    if (objM8596M5 == obj3) {
                        objM8596M5 = new C1226a(20);
                        c3966o2.j0(objM8596M5);
                    }
                    b1 b1Var2 = (b1) hg.m10691b(objArr2, null, (InterfaceC2137a) objM8596M5, c3966o2, 0, 6);
                    Object objM8596M6 = c3966o2.m8596M();
                    if (objM8596M6 == obj3) {
                        objM8596M6 = C3953b.m8517t(Boolean.FALSE);
                        c3966o2.j0(objM8596M6);
                    }
                    w0 w0Var2 = (w0) objM8596M6;
                    w0Var2.setValue(Boolean.valueOf(g0.m11646c(c3966o2)));
                    l1 l1Var = AndroidCompositionLocals_androidKt.f2134b;
                    Object objM8618k = c3966o2.m8618k(l1Var);
                    boolean zM8616i3 = c3966o2.m8616i(interfaceC7266z) | c3966o2.m8614g(w0Var);
                    MainActivity mainActivity2 = this.f14386b;
                    boolean zM8616i4 = zM8616i3 | c3966o2.m8616i(mainActivity2) | c3966o2.m8614g(b1Var2);
                    Object objM8596M7 = c3966o2.m8596M();
                    if (zM8616i4 || objM8596M7 == obj3) {
                        b1Var = b1Var2;
                        Object c0Var = new c0(interfaceC7266z, w0Var, mainActivity2, b1Var, w0Var2, (InterfaceC7559c) null);
                        c3966o2.j0(c0Var);
                        objM8596M7 = c0Var;
                    } else {
                        b1Var = b1Var2;
                    }
                    C3953b.m8503f((InterfaceC2141e) objM8596M7, objM8618k, c3966o2);
                    Object objM8618k2 = c3966o2.m8618k(l1Var);
                    boolean zM8616i5 = c3966o2.m8616i(mainActivity2);
                    Object objM8596M8 = c3966o2.m8596M();
                    int i15 = 17;
                    if (zM8616i5 || objM8596M8 == obj3) {
                        objM8596M8 = new C0084b(mainActivity2, interfaceC7559c, i15);
                        c3966o2.j0(objM8596M8);
                    }
                    C3953b.m8503f((InterfaceC2141e) objM8596M8, objM8618k2, c3966o2);
                    mainActivity2.m4587j(b1Var.m8526f(), ((Boolean) w0Var.getValue()).booleanValue());
                    C3953b.m8499b(new m1[]{l1Var.mo8541a(w5.m11906b(((Boolean) w0Var.getValue()).booleanValue(), c3966o2)), C8791f.f42458b.mo8541a(mainActivity2)}, AbstractC6740i.m12902d(1468902736, new C0403f(i15, w0Var, mainActivity2), c3966o2), c3966o2, 56);
                } else {
                    c3966o2.m8601S();
                }
                return a0Var;
        }
    }
}
