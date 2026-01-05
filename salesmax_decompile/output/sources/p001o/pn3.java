package p001o;

/* loaded from: classes2.dex */
public abstract class pn3 {
    /* renamed from: a */
    public static final int m43902a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* renamed from: b */
    public static final nn3 m43903b(un3 un3Var, int i, boolean z, Object obj) {
        on3 on3Var;
        sq8.m48649h(un3Var, "composer");
        sq8.m48649h(obj, "block");
        un3Var.mo27207i(i);
        Object objMo27208j = un3Var.mo27208j();
        if (objMo27208j == un3.f49155a.m51802a()) {
            on3Var = new on3(i, z);
            un3Var.mo27204f(on3Var);
        } else {
            sq8.m48647f(objMo27208j, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            on3Var = (on3) objMo27208j;
        }
        on3Var.m42457f(obj);
        un3Var.mo27214p();
        return on3Var;
    }

    /* renamed from: c */
    public static final nn3 m43904c(int i, boolean z, Object obj) {
        sq8.m48649h(obj, "block");
        on3 on3Var = new on3(i, z);
        on3Var.m42457f(obj);
        return on3Var;
    }

    /* renamed from: d */
    public static final int m43905d(int i) {
        return m43902a(2, i);
    }

    /* renamed from: e */
    public static final boolean m43906e(qee qeeVar, qee qeeVar2) {
        sq8.m48649h(qeeVar2, "other");
        if (qeeVar != null) {
            if ((qeeVar instanceof ree) && (qeeVar2 instanceof ree)) {
                ree reeVar = (ree) qeeVar;
                if (!reeVar.m46609q() || sq8.m48644c(qeeVar, qeeVar2) || sq8.m48644c(reeVar.m46602j(), ((ree) qeeVar2).m46602j())) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final int m43907f(int i) {
        return m43902a(1, i);
    }
}
