package f2;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0406i;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import ex.InterfaceC2141e;
import i1.p0;
import i1.q0;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.w0;
import m1.InterfaceC4629k;
import og.ne;
import s4.C6750f;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.d */
/* loaded from: classes.dex */
public final class C2181d implements p0 {

    /* renamed from: a */
    public final boolean f10078a;

    /* renamed from: b */
    public final float f10079b;

    /* renamed from: c */
    public final w0 f10080c;

    public C2181d(boolean z6, float f6, w0 w0Var) {
        this.f10078a = z6;
        this.f10079b = f6;
        this.f10080c = w0Var;
    }

    @Override // i1.p0
    /* renamed from: a */
    public final q0 mo5881a(InterfaceC4629k interfaceC4629k, C3966o c3966o) {
        long jMo5879a;
        c3966o.m8607Y(988743187);
        InterfaceC2189l interfaceC2189l = (InterfaceC2189l) c3966o.m8618k(AbstractC2191n.f10102a);
        w0 w0Var = this.f10080c;
        if (((C1565s) w0Var.getValue()).f7819a != 16) {
            c3966o.m8607Y(-303557454);
            c3966o.m8623p(false);
            jMo5879a = ((C1565s) w0Var.getValue()).f7819a;
        } else {
            c3966o.m8607Y(-303499670);
            jMo5879a = interfaceC2189l.mo5879a(c3966o);
            c3966o.m8623p(false);
        }
        w0 w0VarM8520w = C3953b.m8520w(new C1565s(jMo5879a), c3966o);
        w0 w0VarM8520w2 = C3953b.m8520w(interfaceC2189l.mo5880b(c3966o), c3966o);
        c3966o.m8607Y(331259447);
        ViewGroup viewGroupM10784b = ne.m10784b((View) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2138f));
        boolean zM8614g = c3966o.m8614g(interfaceC4629k) | c3966o.m8614g(this) | c3966o.m8614g(viewGroupM10784b);
        Object objM8596M = c3966o.m8596M();
        Object obj = C3961j.f20408a;
        if (zM8614g || objM8596M == obj) {
            Object c2178a = new C2178a(this.f10078a, this.f10079b, w0VarM8520w, w0VarM8520w2, viewGroupM10784b);
            c3966o.j0(c2178a);
            objM8596M = c2178a;
        }
        C2178a c2178a2 = (C2178a) objM8596M;
        c3966o.m8623p(false);
        boolean zM8614g2 = c3966o.m8614g(interfaceC4629k) | c3966o.m8616i(c2178a2);
        Object objM8596M2 = c3966o.m8596M();
        if (zM8614g2 || objM8596M2 == obj) {
            objM8596M2 = new C0406i(interfaceC4629k, c2178a2, (InterfaceC7559c) null, 14);
            c3966o.j0(objM8596M2);
        }
        C3953b.m8504g(c2178a2, interfaceC4629k, (InterfaceC2141e) objM8596M2, c3966o);
        c3966o.m8623p(false);
        return c2178a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2181d)) {
            return false;
        }
        C2181d c2181d = (C2181d) obj;
        return this.f10078a == c2181d.f10078a && C6750f.m12935a(this.f10079b, c2181d.f10079b) && this.f10080c.equals(c2181d.f10080c);
    }

    public final int hashCode() {
        return this.f10080c.hashCode() + AbstractC1452a.m4555b(this.f10079b, Boolean.hashCode(this.f10078a) * 31, 31);
    }
}
