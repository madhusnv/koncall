package o1;

import g2.b7;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;
import s4.AbstractC6746b;
import t3.InterfaceC7035v;
import u3.InterfaceC7332c;
import u3.InterfaceC7335f;
import w2.InterfaceC7877p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 implements InterfaceC7035v, InterfaceC7332c, InterfaceC7877p {

    /* renamed from: a */
    public final v1 f25886a;

    /* renamed from: b */
    public final k2.e1 f25887b;

    /* renamed from: c */
    public final k2.e1 f25888c;

    public x0(v1 v1Var) {
        this.f25886a = v1Var;
        this.f25887b = C3953b.m8517t(v1Var);
        this.f25888c = C3953b.m8517t(v1Var);
    }

    @Override // t3.InterfaceC7035v
    /* renamed from: b */
    public final t3.k0 mo10375b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        k2.e1 e1Var = this.f25887b;
        int iMo6893a = ((v1) e1Var.getValue()).mo6893a(l0Var, l0Var.getLayoutDirection());
        int iMo6895c = ((v1) e1Var.getValue()).mo6895c(l0Var);
        int iMo6894b = ((v1) e1Var.getValue()).mo6894b(l0Var, l0Var.getLayoutDirection()) + iMo6893a;
        int iMo6896d = ((v1) e1Var.getValue()).mo6896d(l0Var) + iMo6895c;
        t3.w0 w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12931i(-iMo6894b, -iMo6896d, j6));
        return l0Var.g0(AbstractC6746b.m12929g(w0VarMo13314z.f34030a + iMo6894b, j6), AbstractC6746b.m12928f(w0VarMo13314z.f34031b + iMo6896d, j6), C6669s.f31944a, new b7(w0VarMo13314z, iMo6893a, iMo6895c, 2));
    }

    @Override // u3.InterfaceC7332c
    /* renamed from: d */
    public final void mo10373d(InterfaceC7335f interfaceC7335f) {
        v1 v1Var = (v1) interfaceC7335f.mo13728d(y1.f25893a);
        v1 v1Var2 = this.f25886a;
        this.f25887b.setValue(new a0(v1Var2, v1Var));
        this.f25888c.setValue(new r1(v1Var, v1Var2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return AbstractC4154l.m8918a(((x0) obj).f25886a, this.f25886a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25886a.hashCode();
    }
}
