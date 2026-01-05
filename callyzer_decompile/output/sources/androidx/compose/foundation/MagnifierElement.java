package androidx.compose.foundation;

import android.view.View;
import b2.d1;
import b2.e1;
import com.sun.mail.util.AbstractC1452a;
import d4.C1595w;
import i1.g1;
import i1.w0;
import i1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6750f;
import s4.InterfaceC6747c;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MagnifierElement extends a1 {

    /* renamed from: a */
    public final d1 f1904a;

    /* renamed from: b */
    public final e1 f1905b;

    /* renamed from: c */
    public final g1 f1906c;

    public MagnifierElement(d1 d1Var, e1 e1Var, g1 g1Var) {
        this.f1904a = d1Var;
        this.f1905b = e1Var;
        this.f1906c = g1Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new w0(this.f1904a, this.f1905b, this.f1906c);
    }

    public final int hashCode() {
        return this.f1906c.hashCode() + ((this.f1905b.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4555b(Float.NaN, AbstractC1452a.m4555b(Float.NaN, AbstractC1452a.m4557d(AbstractC1452a.m4558e(AbstractC1452a.m4555b(Float.NaN, this.f1904a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        w0 w0Var = (w0) abstractC7878q;
        w0Var.getClass();
        g1 g1Var = w0Var.f17004s;
        View view = w0Var.f17005t;
        InterfaceC6747c interfaceC6747c = w0Var.f17006v;
        w0Var.f17002q = this.f1904a;
        w0Var.f17003r = this.f1905b;
        g1 g1Var2 = this.f1906c;
        w0Var.f17004s = g1Var2;
        View viewM14565z = AbstractC7634f.m14565z(w0Var);
        InterfaceC6747c interfaceC6747c2 = AbstractC7634f.m14563x(w0Var).f36825C;
        if (w0Var.f17007w != null) {
            C1595w c1595w = x0.f17011a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !g1Var2.mo7506a()) || !C6750f.m12935a(Float.NaN, Float.NaN) || !C6750f.m12935a(Float.NaN, Float.NaN) || !g1Var2.equals(g1Var) || !viewM14565z.equals(view) || !AbstractC4154l.m8918a(interfaceC6747c2, interfaceC6747c)) {
                w0Var.M0();
            }
        }
        w0Var.N0();
    }
}
