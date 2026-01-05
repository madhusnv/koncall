package p001o;

import p001o.p69;
import p001o.q74;

/* loaded from: classes3.dex */
public abstract class p84 {
    /* renamed from: c */
    public static final void m43166c(q74 q74Var, final p69 p69Var) {
        p69 p69Var2 = (p69) q74Var.get(p69.f39399t);
        if (p69Var2 == null) {
            return;
        }
        final yu5 yu5VarM43002d = p69.C15966a.m43002d(p69Var2, true, false, new xk7() { // from class: o.m84
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return p84.m43167d(p69Var, (Throwable) obj);
            }
        }, 2, null);
        p69Var.j0(new xk7() { // from class: o.n84
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return p84.m43168e(yu5VarM43002d, (Throwable) obj);
            }
        });
    }

    /* renamed from: d */
    public static final y3i m43167d(p69 p69Var, Throwable th) {
        if (th == null) {
            return y3i.f54824a;
        }
        p69Var.mo22429f(al6.m17345a(th.getMessage(), th));
        return y3i.f54824a;
    }

    /* renamed from: e */
    public static final y3i m43168e(yu5 yu5Var, Throwable th) {
        yu5Var.dispose();
        return y3i.f54824a;
    }

    /* renamed from: f */
    public static final Object m43169f(n64 n64Var) {
        q74.InterfaceC16311b interfaceC16311b = n64Var.getContext().get(a8f.f14296b);
        sq8.m48646e(interfaceC16311b);
        return ((a8f) interfaceC16311b).m16682b();
    }

    /* renamed from: g */
    public static final q74 m43170g(t18 t18Var, q74 q74Var) {
        sq8.m48649h(t18Var, "<this>");
        sq8.m48649h(q74Var, "outerContext");
        kl3 kl3VarM58836a = z69.m58836a((p69) t18Var.mo6529D().get(p69.f39399t));
        q74 q74VarPlus = t18Var.mo6529D().plus(kl3VarM58836a).plus(new f84("call-context")).plus(new wdh(xdh.m56098a(q74Var))).plus(new cka(v74.m52397b(q74Var)));
        x54 x54VarM51389a = udh.m51389a(q74Var);
        q74 q74VarPlus2 = q74VarPlus.plus(x54VarM51389a != null ? new tdh(x54VarM51389a) : e66.f21035a);
        m43166c(q74Var, kl3VarM58836a);
        return q74VarPlus2;
    }
}
