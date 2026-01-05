package p001o;

/* loaded from: classes6.dex */
public abstract class ybf {

    /* renamed from: a */
    public static final ql7 f55194a = C18374a.f55200a;

    /* renamed from: b */
    public static final lgg f55195b = new lgg("STATE_REG");

    /* renamed from: c */
    public static final lgg f55196c = new lgg("STATE_COMPLETED");

    /* renamed from: d */
    public static final lgg f55197d = new lgg("STATE_CANCELLED");

    /* renamed from: e */
    public static final lgg f55198e = new lgg("NO_RESULT");

    /* renamed from: f */
    public static final lgg f55199f = new lgg("PARAM_CLAUSE_0");

    /* renamed from: o.ybf$a */
    public static final class C18374a implements ql7 {

        /* renamed from: a */
        public static final C18374a f55200a = new C18374a();

        @Override // p001o.ql7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* renamed from: a */
    public static final cyh m57477a(int i) {
        if (i == 0) {
            return cyh.SUCCESSFUL;
        }
        if (i == 1) {
            return cyh.REREGISTER;
        }
        if (i == 2) {
            return cyh.CANCELLED;
        }
        if (i == 3) {
            return cyh.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    /* renamed from: h */
    public static final lgg m57484h() {
        return f55199f;
    }

    /* renamed from: i */
    public static final boolean m57485i(xb2 xb2Var, ql7 ql7Var) {
        Object objMo48693p = xb2Var.mo48693p(y3i.f54824a, null, ql7Var);
        if (objMo48693p == null) {
            return false;
        }
        xb2Var.mo48686F(objMo48693p);
        return true;
    }
}
