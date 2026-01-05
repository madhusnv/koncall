package p001o;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class m47 {

    /* renamed from: a */
    public static final xk7 f34778a = new xk7() { // from class: o.k47
        @Override // p001o.xk7
        public final Object invoke(Object obj) {
            return m47.m38347d(obj);
        }
    };

    /* renamed from: b */
    public static final nl7 f34779b = new nl7() { // from class: o.l47
        @Override // p001o.nl7
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(m47.m38346c(obj, obj2));
        }
    };

    /* renamed from: c */
    public static final boolean m38346c(Object obj, Object obj2) {
        return sq8.m48644c(obj, obj2);
    }

    /* renamed from: d */
    public static final Object m38347d(Object obj) {
        return obj;
    }

    /* renamed from: e */
    public static final v37 m38348e(v37 v37Var) {
        return v37Var instanceof q4g ? v37Var : m38349f(v37Var, f34778a, f34779b);
    }

    /* renamed from: f */
    public static final v37 m38349f(v37 v37Var, xk7 xk7Var, nl7 nl7Var) {
        if (v37Var instanceof hv5) {
            hv5 hv5Var = (hv5) v37Var;
            if (hv5Var.f27667b == xk7Var && hv5Var.f27668c == nl7Var) {
                return v37Var;
            }
        }
        return new hv5(v37Var, xk7Var, nl7Var);
    }
}
