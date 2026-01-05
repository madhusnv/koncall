package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cp.C1476g;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import f2.C2187j;
import g2.b0;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import s1.C6727v;
import s1.RunnableC6706a;
import s1.h0;
import s1.i0;
import s1.x0;
import t2.InterfaceC7003b;
import t3.c1;
import t3.f1;
import w2.InterfaceC7879r;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.lazy.layout.c */
/* loaded from: classes.dex */
public final class C0249c extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ h0 f1997a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f1998b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f1999c;

    /* renamed from: d */
    public final /* synthetic */ w0 f2000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249c(h0 h0Var, InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, w0 w0Var) {
        super(3);
        this.f1997a = h0Var;
        this.f1998b = interfaceC7879r;
        this.f1999c = interfaceC2141e;
        this.f2000d = w0Var;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC7879r interfaceC7879rMo14852e;
        InterfaceC7003b interfaceC7003b = (InterfaceC7003b) obj;
        ((Number) obj3).intValue();
        C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
        Object objM8596M = c3966o.m8596M();
        Object obj4 = C3961j.f20408a;
        if (objM8596M == obj4) {
            objM8596M = new C6727v(interfaceC7003b, new C2187j(this.f2000d, 5));
            c3966o.j0(objM8596M);
        }
        C6727v c6727v = (C6727v) objM8596M;
        Object objM8596M2 = c3966o.m8596M();
        if (objM8596M2 == obj4) {
            objM8596M2 = new f1(new C8849i(c6727v));
            c3966o.j0(objM8596M2);
        }
        f1 f1Var = (f1) objM8596M2;
        h0 h0Var = this.f1997a;
        if (h0Var != null) {
            c3966o.m8607Y(204281539);
            c3966o.m8607Y(6591363);
            Object obj5 = x0.f32168a;
            if (obj5 != null) {
                c3966o.m8607Y(1213893039);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(1213931944);
                View view = (View) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2138f);
                boolean zM8614g = c3966o.m8614g(view);
                Object objM8596M3 = c3966o.m8596M();
                if (zM8614g || objM8596M3 == obj4) {
                    objM8596M3 = new RunnableC6706a(view);
                    c3966o.j0(objM8596M3);
                }
                obj5 = (RunnableC6706a) objM8596M3;
                c3966o.m8623p(false);
            }
            Object obj6 = obj5;
            c3966o.m8623p(false);
            Object[] objArr = {h0Var, c6727v, f1Var, obj6};
            boolean zM8614g2 = c3966o.m8614g(h0Var) | c3966o.m8616i(c6727v) | c3966o.m8616i(f1Var) | c3966o.m8616i(obj6);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g2 || objM8596M4 == obj4) {
                Object b0Var = new b0(h0Var, c6727v, f1Var, obj6, 3);
                c3966o.j0(b0Var);
                objM8596M4 = b0Var;
            }
            C3953b.m8502e(objArr, (InterfaceC2139c) objM8596M4, c3966o);
            c3966o.m8623p(false);
        } else {
            c3966o.m8607Y(204710145);
            c3966o.m8623p(false);
        }
        int i10 = i0.f32077b;
        InterfaceC7879r interfaceC7879r = this.f1998b;
        if (h0Var != null && (interfaceC7879rMo14852e = interfaceC7879r.mo14852e(new TraversablePrefetchStateModifierElement(h0Var))) != null) {
            interfaceC7879r = interfaceC7879rMo14852e;
        }
        boolean zM8614g3 = c3966o.m8614g(c6727v);
        Object obj7 = this.f1999c;
        boolean zM8614g4 = zM8614g3 | c3966o.m8614g(obj7);
        Object objM8596M5 = c3966o.m8596M();
        if (zM8614g4 || objM8596M5 == obj4) {
            objM8596M5 = new C1476g(21, c6727v, obj7);
            c3966o.j0(objM8596M5);
        }
        c1.m13273b(f1Var, interfaceC7879r, (InterfaceC2141e) objM8596M5, c3966o, 8);
        return a0.f30746a;
    }
}
