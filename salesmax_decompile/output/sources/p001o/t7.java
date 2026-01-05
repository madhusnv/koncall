package p001o;

/* loaded from: classes6.dex */
public abstract class t7 extends s7 implements mw7 {

    /* renamed from: a */
    public static /* synthetic */ Class f46549a;

    static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* renamed from: A */
    public abstract Object mo36261A(Object obj, Class cls);

    /* renamed from: B */
    public Object m49496B(iw7 iw7Var, Object obj, Class cls) {
        if (iw7Var == null) {
            return obj;
        }
        if (cls == null || cls.isAssignableFrom(iw7Var.getClass())) {
            obj = ti9.m49909a(obj, iw7Var);
        }
        if (iw7Var instanceof t7) {
            return ((t7) iw7Var).mo36261A(obj, cls);
        }
        if (!(iw7Var instanceof mw7)) {
            return obj;
        }
        mw7 mw7Var = (mw7) iw7Var;
        return ti9.m49910b(obj, cls == null ? mw7Var.mo39733k() : mw7Var.mo39734p(cls));
    }

    @Override // p001o.mw7
    /* renamed from: k */
    public iw7[] mo39733k() throws Throwable {
        Object objMo36261A = mo36261A(null, null);
        Class clsClass$ = f46549a;
        if (clsClass$ == null) {
            clsClass$ = class$("org.mortbay.jetty.Handler");
            f46549a = clsClass$;
        }
        return (iw7[]) ti9.m49918l(objMo36261A, clsClass$);
    }

    @Override // p001o.mw7
    /* renamed from: p */
    public iw7[] mo39734p(Class cls) {
        Object objMo36261A = mo36261A(null, cls);
        Class clsClass$ = f46549a;
        if (clsClass$ == null) {
            clsClass$ = class$("org.mortbay.jetty.Handler");
            f46549a = clsClass$;
        }
        return (iw7[]) ti9.m49918l(objMo36261A, clsClass$);
    }
}
