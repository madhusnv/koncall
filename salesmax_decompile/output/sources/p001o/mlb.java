package p001o;

import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class mlb {

    /* renamed from: a */
    public static final mlb f35649a = new mlb();

    /* renamed from: b */
    public static final C15355a f35650b = new C15355a(null, null, null);

    /* renamed from: c */
    public static C15355a f35651c;

    /* renamed from: o.mlb$a */
    public static final class C15355a {

        /* renamed from: a */
        public final Method f35652a;

        /* renamed from: b */
        public final Method f35653b;

        /* renamed from: c */
        public final Method f35654c;

        public C15355a(Method method, Method method2, Method method3) {
            this.f35652a = method;
            this.f35653b = method2;
            this.f35654c = method3;
        }
    }

    /* renamed from: a */
    public final C15355a m39314a(vb1 vb1Var) {
        try {
            C15355a c15355a = new C15355a(Class.class.getDeclaredMethod("getModule", new Class[0]), vb1Var.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), vb1Var.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f35651c = c15355a;
            return c15355a;
        } catch (Exception unused) {
            C15355a c15355a2 = f35650b;
            f35651c = c15355a2;
            return c15355a2;
        }
    }

    /* renamed from: b */
    public final String m39315b(vb1 vb1Var) {
        sq8.m48649h(vb1Var, "continuation");
        C15355a c15355aM39314a = f35651c;
        if (c15355aM39314a == null) {
            c15355aM39314a = m39314a(vb1Var);
        }
        if (c15355aM39314a == f35650b) {
            return null;
        }
        Method method = c15355aM39314a.f35652a;
        Object objInvoke = method != null ? method.invoke(vb1Var.getClass(), new Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = c15355aM39314a.f35653b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = c15355aM39314a.f35654c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
