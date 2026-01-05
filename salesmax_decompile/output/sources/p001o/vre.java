package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class vre implements Serializable {

    /* renamed from: b */
    public static final C17665a f50797b = new C17665a(null);

    /* renamed from: a */
    public final Object f50798a;

    /* renamed from: o.vre$a */
    public static final class C17665a {
        public C17665a() {
        }

        public /* synthetic */ C17665a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.vre$b */
    public static final class C17666b implements Serializable {

        /* renamed from: a */
        public final Throwable f50799a;

        public C17666b(Throwable th) {
            sq8.m48649h(th, "exception");
            this.f50799a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C17666b) && sq8.m48644c(this.f50799a, ((C17666b) obj).f50799a);
        }

        public int hashCode() {
            return this.f50799a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f50799a + ')';
        }
    }

    public /* synthetic */ vre(Object obj) {
        this.f50798a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ vre m53350a(Object obj) {
        return new vre(obj);
    }

    /* renamed from: b */
    public static Object m53351b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m53352c(Object obj, Object obj2) {
        return (obj2 instanceof vre) && sq8.m48644c(obj, ((vre) obj2).m53359j());
    }

    /* renamed from: d */
    public static final boolean m53353d(Object obj, Object obj2) {
        return sq8.m48644c(obj, obj2);
    }

    /* renamed from: e */
    public static final Throwable m53354e(Object obj) {
        if (obj instanceof C17666b) {
            return ((C17666b) obj).f50799a;
        }
        return null;
    }

    /* renamed from: f */
    public static int m53355f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m53356g(Object obj) {
        return obj instanceof C17666b;
    }

    /* renamed from: h */
    public static final boolean m53357h(Object obj) {
        return !(obj instanceof C17666b);
    }

    /* renamed from: i */
    public static String m53358i(Object obj) {
        if (obj instanceof C17666b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m53352c(this.f50798a, obj);
    }

    public int hashCode() {
        return m53355f(this.f50798a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m53359j() {
        return this.f50798a;
    }

    public String toString() {
        return m53358i(this.f50798a);
    }
}
