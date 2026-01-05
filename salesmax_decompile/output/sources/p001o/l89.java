package p001o;

/* loaded from: classes6.dex */
public abstract class l89 {

    /* renamed from: a */
    public static final uef f33447a = zi8.m59498a("kotlinx.serialization.json.JsonUnquotedLiteral", sm1.m48531z(h8g.f26398a));

    /* renamed from: a */
    public static final ea9 m36736a(String str) {
        return str == null ? w99.INSTANCE : new q99(str, true, null, 4, null);
    }

    /* renamed from: b */
    public static final Void m36737b(k89 k89Var, String str) {
        throw new IllegalArgumentException("Element " + kge.m35689b(k89Var.getClass()) + " is not a " + str);
    }

    /* renamed from: c */
    public static final Boolean m36738c(ea9 ea9Var) {
        sq8.m48649h(ea9Var, "<this>");
        return o8g.m41774d(ea9Var.mo24656d());
    }

    /* renamed from: d */
    public static final String m36739d(ea9 ea9Var) {
        sq8.m48649h(ea9Var, "<this>");
        if (ea9Var instanceof w99) {
            return null;
        }
        return ea9Var.mo24656d();
    }

    /* renamed from: e */
    public static final double m36740e(ea9 ea9Var) {
        sq8.m48649h(ea9Var, "<this>");
        return Double.parseDouble(ea9Var.mo24656d());
    }

    /* renamed from: f */
    public static final float m36741f(ea9 ea9Var) {
        sq8.m48649h(ea9Var, "<this>");
        return Float.parseFloat(ea9Var.mo24656d());
    }

    /* renamed from: g */
    public static final int m36742g(ea9 ea9Var) {
        sq8.m48649h(ea9Var, "<this>");
        try {
            long jM16612m = new j8g(ea9Var.mo24656d()).m16612m();
            boolean z = false;
            if (-2147483648L <= jM16612m && jM16612m <= 2147483647L) {
                z = true;
            }
            if (z) {
                return (int) jM16612m;
            }
            throw new NumberFormatException(ea9Var.mo24656d() + " is not an Int");
        } catch (d89 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    /* renamed from: h */
    public static final ea9 m36743h(k89 k89Var) {
        sq8.m48649h(k89Var, "<this>");
        ea9 ea9Var = k89Var instanceof ea9 ? (ea9) k89Var : null;
        if (ea9Var != null) {
            return ea9Var;
        }
        m36737b(k89Var, "JsonPrimitive");
        throw new qe9();
    }

    /* renamed from: i */
    public static final uef m36744i() {
        return f33447a;
    }

    /* renamed from: j */
    public static final long m36745j(ea9 ea9Var) {
        sq8.m48649h(ea9Var, "<this>");
        try {
            return new j8g(ea9Var.mo24656d()).m16612m();
        } catch (d89 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }
}
