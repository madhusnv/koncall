package p001o;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.wb9;

/* loaded from: classes6.dex */
public abstract class azh {
    /* renamed from: a */
    public static Collection m18048a(Object obj) {
        if ((obj instanceof sb9) && !(obj instanceof tb9)) {
            m18064q(obj, "kotlin.collections.MutableCollection");
        }
        return m18053f(obj);
    }

    /* renamed from: b */
    public static Iterable m18049b(Object obj) {
        if ((obj instanceof sb9) && !(obj instanceof ub9)) {
            m18064q(obj, "kotlin.collections.MutableIterable");
        }
        return m18054g(obj);
    }

    /* renamed from: c */
    public static List m18050c(Object obj) {
        if ((obj instanceof sb9) && !(obj instanceof vb9)) {
            m18064q(obj, "kotlin.collections.MutableList");
        }
        return m18055h(obj);
    }

    /* renamed from: d */
    public static Map m18051d(Object obj) {
        if ((obj instanceof sb9) && !(obj instanceof wb9)) {
            m18064q(obj, "kotlin.collections.MutableMap");
        }
        return m18056i(obj);
    }

    /* renamed from: e */
    public static Object m18052e(Object obj, int i) {
        if (obj != null && !m18058k(obj, i)) {
            m18064q(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: f */
    public static Collection m18053f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m18063p(e);
        }
    }

    /* renamed from: g */
    public static Iterable m18054g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m18063p(e);
        }
    }

    /* renamed from: h */
    public static List m18055h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m18063p(e);
        }
    }

    /* renamed from: i */
    public static Map m18056i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m18063p(e);
        }
    }

    /* renamed from: j */
    public static int m18057j(Object obj) {
        if (obj instanceof bm7) {
            return ((bm7) obj).getArity();
        }
        if (obj instanceof uk7) {
            return 0;
        }
        if (obj instanceof xk7) {
            return 1;
        }
        if (obj instanceof nl7) {
            return 2;
        }
        if (obj instanceof ql7) {
            return 3;
        }
        if (obj instanceof sl7) {
            return 4;
        }
        if (obj instanceof ul7) {
            return 5;
        }
        if (obj instanceof vl7) {
            return 6;
        }
        if (obj instanceof wl7) {
            return 7;
        }
        if (obj instanceof xl7) {
            return 8;
        }
        if (obj instanceof yl7) {
            return 9;
        }
        if (obj instanceof wk7) {
            return 10;
        }
        if (obj instanceof yk7) {
            return 11;
        }
        if (obj instanceof al7) {
            return 13;
        }
        if (obj instanceof bl7) {
            return 14;
        }
        if (obj instanceof cl7) {
            return 15;
        }
        if (obj instanceof dl7) {
            return 16;
        }
        if (obj instanceof el7) {
            return 17;
        }
        if (obj instanceof fl7) {
            return 18;
        }
        if (obj instanceof gl7) {
            return 19;
        }
        if (obj instanceof jl7) {
            return 20;
        }
        return obj instanceof kl7 ? 21 : -1;
    }

    /* renamed from: k */
    public static boolean m18058k(Object obj, int i) {
        return (obj instanceof tl7) && m18057j(obj) == i;
    }

    /* renamed from: l */
    public static boolean m18059l(Object obj) {
        return (obj instanceof List) && (!(obj instanceof sb9) || (obj instanceof vb9));
    }

    /* renamed from: m */
    public static boolean m18060m(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof sb9) || (obj instanceof wb9.InterfaceC17813a));
    }

    /* renamed from: n */
    public static boolean m18061n(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof sb9) || (obj instanceof zb9));
    }

    /* renamed from: o */
    public static Throwable m18062o(Throwable th) {
        return sq8.m48657p(th, azh.class.getName());
    }

    /* renamed from: p */
    public static ClassCastException m18063p(ClassCastException classCastException) {
        throw ((ClassCastException) m18062o(classCastException));
    }

    /* renamed from: q */
    public static void m18064q(Object obj, String str) {
        m18065r((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: r */
    public static void m18065r(String str) {
        throw m18063p(new ClassCastException(str));
    }
}
