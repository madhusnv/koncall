package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class d67 {

    /* renamed from: o.d67$a */
    public static final class C12796a extends s47 {

        /* renamed from: b */
        public final Object f19142b;

        /* renamed from: c */
        public final rl7 f19143c;

        public C12796a(Object obj, rl7 rl7Var) {
            this.f19142b = obj;
            this.f19143c = rl7Var;
        }

        @Override // p001o.s47
        public void c0(qag qagVar) {
            try {
                Object objApply = this.f19143c.apply(this.f19142b);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                g3e g3eVar = (g3e) objApply;
                if (!(g3eVar instanceof idg)) {
                    g3eVar.mo28025a(qagVar);
                    return;
                }
                try {
                    Object obj = ((idg) g3eVar).get();
                    if (obj == null) {
                        u66.complete(qagVar);
                    } else {
                        qagVar.mo18165b(new j4f(qagVar, obj));
                    }
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    u66.error(th, qagVar);
                }
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                u66.error(th2, qagVar);
            }
        }
    }

    /* renamed from: a */
    public static s47 m22359a(Object obj, rl7 rl7Var) {
        return fwe.m27593l(new C12796a(obj, rl7Var));
    }

    /* renamed from: b */
    public static boolean m22360b(g3e g3eVar, qag qagVar, rl7 rl7Var) {
        if (!(g3eVar instanceof idg)) {
            return false;
        }
        try {
            Object obj = ((idg) g3eVar).get();
            if (obj == null) {
                u66.complete(qagVar);
                return true;
            }
            try {
                Object objApply = rl7Var.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                g3e g3eVar2 = (g3e) objApply;
                if (g3eVar2 instanceof idg) {
                    try {
                        Object obj2 = ((idg) g3eVar2).get();
                        if (obj2 == null) {
                            u66.complete(qagVar);
                            return true;
                        }
                        qagVar.mo18165b(new j4f(qagVar, obj2));
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        u66.error(th, qagVar);
                        return true;
                    }
                } else {
                    g3eVar2.mo28025a(qagVar);
                }
                return true;
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                u66.error(th2, qagVar);
                return true;
            }
        } catch (Throwable th3) {
            zk6.m59526b(th3);
            u66.error(th3, qagVar);
            return true;
        }
    }
}
