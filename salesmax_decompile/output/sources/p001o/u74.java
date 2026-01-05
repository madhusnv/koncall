package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public abstract class u74 {
    /* renamed from: d */
    public static final q74 m51075d(q74 q74Var, q74 q74Var2, final boolean z) {
        boolean zM51079h = m51079h(q74Var);
        boolean zM51079h2 = m51079h(q74Var2);
        if (!zM51079h && !zM51079h2) {
            return q74Var.plus(q74Var2);
        }
        final gge ggeVar = new gge();
        ggeVar.f25106a = q74Var2;
        e66 e66Var = e66.f21035a;
        q74 q74Var3 = (q74) q74Var.fold(e66Var, new nl7() { // from class: o.r74
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return u74.m51076e(ggeVar, z, (q74) obj, (q74.InterfaceC16311b) obj2);
            }
        });
        if (zM51079h2) {
            ggeVar.f25106a = ((q74) ggeVar.f25106a).fold(e66Var, new nl7() { // from class: o.s74
                @Override // p001o.nl7
                public final Object invoke(Object obj, Object obj2) {
                    return u74.m51077f((q74) obj, (q74.InterfaceC16311b) obj2);
                }
            });
        }
        return q74Var3.plus((q74) ggeVar.f25106a);
    }

    /* renamed from: e */
    public static final q74 m51076e(gge ggeVar, boolean z, q74 q74Var, q74.InterfaceC16311b interfaceC16311b) {
        return q74Var.plus(interfaceC16311b);
    }

    /* renamed from: f */
    public static final q74 m51077f(q74 q74Var, q74.InterfaceC16311b interfaceC16311b) {
        return q74Var.plus(interfaceC16311b);
    }

    /* renamed from: g */
    public static final String m51078g(q74 q74Var) {
        return null;
    }

    /* renamed from: h */
    public static final boolean m51079h(q74 q74Var) {
        return ((Boolean) q74Var.fold(Boolean.FALSE, new nl7() { // from class: o.t74
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(u74.m51080i(((Boolean) obj).booleanValue(), (q74.InterfaceC16311b) obj2));
            }
        })).booleanValue();
    }

    /* renamed from: i */
    public static final boolean m51080i(boolean z, q74.InterfaceC16311b interfaceC16311b) {
        return z;
    }

    /* renamed from: j */
    public static final q74 m51081j(q74 q74Var, q74 q74Var2) {
        return !m51079h(q74Var2) ? q74Var.plus(q74Var2) : m51075d(q74Var, q74Var2, false);
    }

    /* renamed from: k */
    public static final q74 m51082k(h84 h84Var, q74 q74Var) {
        q74 q74VarM51075d = m51075d(h84Var.mo6529D(), q74Var, true);
        return (q74VarM51075d == eu5.m25610a() || q74VarM51075d.get(p64.f39391p) != null) ? q74VarM51075d : q74VarM51075d.plus(eu5.m25610a());
    }

    /* renamed from: l */
    public static final h3i m51083l(k84 k84Var) {
        while (!(k84Var instanceof au5) && (k84Var = k84Var.getCallerFrame()) != null) {
            if (k84Var instanceof h3i) {
                return (h3i) k84Var;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static final h3i m51084m(n64 n64Var, q74 q74Var, Object obj) {
        if (!(n64Var instanceof k84)) {
            return null;
        }
        if (!(q74Var.get(j3i.f29729a) != null)) {
            return null;
        }
        h3i h3iVarM51083l = m51083l((k84) n64Var);
        if (h3iVarM51083l != null) {
            h3iVarM51083l.X0(q74Var, obj);
        }
        return h3iVarM51083l;
    }
}
