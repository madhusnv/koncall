package g2;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import aw.C0473m;
import com.sun.mail.util.AbstractC1452a;
import d4.AbstractC1586n;
import ex.InterfaceC2141e;
import i1.C3138q;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import o1.AbstractC5256o;
import s2.C6734c;
import s4.InterfaceC6747c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class cb extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7879r f11323a;

    /* renamed from: b */
    public final /* synthetic */ d3.l0 f11324b;

    /* renamed from: c */
    public final /* synthetic */ long f11325c;

    /* renamed from: d */
    public final /* synthetic */ float f11326d;

    /* renamed from: e */
    public final /* synthetic */ C3138q f11327e;

    /* renamed from: f */
    public final /* synthetic */ float f11328f;

    /* renamed from: g */
    public final /* synthetic */ C6734c f11329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(InterfaceC7879r interfaceC7879r, d3.l0 l0Var, long j6, float f6, C3138q c3138q, float f10, C6734c c6734c) {
        super(2);
        this.f11323a = interfaceC7879r;
        this.f11324b = l0Var;
        this.f11325c = j6;
        this.f11326d = f6;
        this.f11327e = c3138q;
        this.f11328f = f10;
        this.f11329g = c6734c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        qw.a0 a0Var = qw.a0.f30746a;
        if (iIntValue == 2) {
            C3966o c3966o = (C3966o) interfaceC3962k;
            if (c3966o.m8586C()) {
                c3966o.m8601S();
                return a0Var;
            }
        }
        long jM6168e = fb.m6168e(this.f11325c, this.f11326d, interfaceC3962k);
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        InterfaceC7879r interfaceC7879rMo14852e = AbstractC1586n.m5204b(fb.m6167d(this.f11323a, this.f11324b, jM6168e, this.f11327e, ((InterfaceC6747c) c3966o2.m8618k(w3.k1.f37836h)).mo8435T(this.f11328f)), false, p0.f12348E).mo14852e(new SuspendPointerInputElement(a0Var, null, new p3.a0(new C0473m(2, 2, null)), 6));
        t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, true);
        int i10 = c3966o2.f20462P;
        k2.i1 i1VarM8620m = c3966o2.m8620m();
        InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rMo14852e);
        InterfaceC7639k.V0.getClass();
        C7637i c7637i = C7638j.f36921b;
        c3966o2.c0();
        if (c3966o2.f20461O) {
            c3966o2.m8619l(c7637i);
        } else {
            c3966o2.m0();
        }
        C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o2);
        C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
        C7636h c7636h = C7638j.f36926g;
        if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i10))) {
            AbstractC1452a.m4577x(i10, c3966o2, i10, c7636h);
        }
        C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
        this.f11329g.invoke(c3966o2, 0);
        c3966o2.m8623p(true);
        return a0Var;
    }
}
