package p001o;

/* loaded from: classes2.dex */
public abstract class gp3 {

    /* renamed from: a */
    public static final Object f25633a = new Object();

    /* renamed from: a */
    public static final ap3 m29261a(ao0 ao0Var, bp3 bp3Var) {
        sq8.m48649h(ao0Var, "applier");
        sq8.m48649h(bp3Var, "parent");
        return new fp3(bp3Var, ao0Var, null, 4, null);
    }

    /* renamed from: d */
    public static final void m29264d(kb8 kb8Var, Object obj, Object obj2) {
        if (kb8Var.m35350c(obj)) {
            lb8 lb8Var = (lb8) kb8Var.m35353f(obj);
            if (lb8Var != null) {
                lb8Var.add(obj2);
                return;
            }
            return;
        }
        lb8 lb8Var2 = new lb8();
        lb8Var2.add(obj2);
        y3i y3iVar = y3i.f54824a;
        kb8Var.m35359l(obj, lb8Var2);
    }
}
