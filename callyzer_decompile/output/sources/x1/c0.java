package x1;

import b3.C0585q;
import b3.InterfaceC0579k;
import ex.InterfaceC2139c;
import g4.C2492h;
import k2.C3972u;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4365j;
import l4.C4381z;
import t3.InterfaceC7033t;
import w3.p2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f39452a;

    /* renamed from: b */
    public final /* synthetic */ v0 f39453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(v0 v0Var, int i10) {
        super(1);
        this.f39452a = i10;
        this.f39453b = v0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC2139c interfaceC2139c;
        qw.a0 a0Var;
        p2 p2Var;
        switch (this.f39452a) {
            case 0:
                InterfaceC7033t interfaceC7033t = (InterfaceC7033t) obj;
                r1 r1VarM15480d = this.f39453b.m15480d();
                if (r1VarM15480d != null) {
                    r1VarM15480d.f39670c = interfaceC7033t;
                }
                return qw.a0.f30746a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f39453b.f39719q.setValue(bool);
                return qw.a0.f30746a;
            case 2:
                int i10 = ((C4365j) obj).f21911a;
                s0 s0Var = this.f39453b.f39720r;
                s0Var.getClass();
                if (i10 == 7) {
                    interfaceC2139c = s0Var.m15470a().f39683a;
                } else {
                    if (i10 == 2 || i10 == 6 || i10 == 5 || i10 == 3 || i10 == 4) {
                        s0Var.m15470a();
                    } else if (i10 != 1 && i10 != 0) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    interfaceC2139c = null;
                }
                qw.a0 a0Var2 = qw.a0.f30746a;
                if (interfaceC2139c != null) {
                    interfaceC2139c.invoke(s0Var);
                    a0Var = a0Var2;
                } else {
                    a0Var = null;
                }
                if (a0Var == null) {
                    if (i10 == 6) {
                        InterfaceC0579k interfaceC0579k = s0Var.f39676c;
                        if (interfaceC0579k == null) {
                            AbstractC4154l.m8928k("focusManager");
                            throw null;
                        }
                        ((C0585q) interfaceC0579k).m1747f(1);
                    } else if (i10 == 5) {
                        InterfaceC0579k interfaceC0579k2 = s0Var.f39676c;
                        if (interfaceC0579k2 == null) {
                            AbstractC4154l.m8928k("focusManager");
                            throw null;
                        }
                        ((C0585q) interfaceC0579k2).m1747f(2);
                    } else if (i10 == 7 && (p2Var = s0Var.f39674a) != null) {
                        ((w3.l1) p2Var).m14975a();
                    }
                }
                return a0Var2;
            default:
                C4381z c4381z = (C4381z) obj;
                String str = c4381z.f21945a.f13620b;
                v0 v0Var = this.f39453b;
                k2.e1 e1Var = v0Var.f39722t;
                C2492h c2492h = v0Var.f39712j;
                if (!AbstractC4154l.m8918a(str, c2492h != null ? c2492h.f13620b : null)) {
                    v0Var.f39713k.setValue(k0.None);
                    if (((Boolean) e1Var.getValue()).booleanValue()) {
                        e1Var.setValue(Boolean.FALSE);
                    } else {
                        v0Var.f39721s.setValue(Boolean.FALSE);
                    }
                }
                long j6 = g4.n0.f13684b;
                v0Var.m15482f(j6);
                v0Var.m15481e(j6);
                v0Var.f39723u.invoke(c4381z);
                k2.n1 n1Var = v0Var.f39704b;
                C3972u c3972u = n1Var.f20441b;
                if (c3972u != null) {
                    c3972u.m8673p(n1Var, null);
                }
                return qw.a0.f30746a;
        }
    }
}
