package p001o;

/* loaded from: classes6.dex */
public final class vg2 {

    /* renamed from: b */
    public static final C17575b f50294b = new C17575b(null);

    /* renamed from: c */
    public static final C17576c f50295c = new C17576c();

    /* renamed from: a */
    public final Object f50296a;

    /* renamed from: o.vg2$a */
    public static final class C17574a extends C17576c {

        /* renamed from: a */
        public final Throwable f50297a;

        public C17574a(Throwable th) {
            this.f50297a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C17574a) && sq8.m48644c(this.f50297a, ((C17574a) obj).f50297a);
        }

        public int hashCode() {
            Throwable th = this.f50297a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p001o.vg2.C17576c
        public String toString() {
            return "Closed(" + this.f50297a + ')';
        }
    }

    /* renamed from: o.vg2$b */
    public static final class C17575b {
        public C17575b() {
        }

        public /* synthetic */ C17575b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Object m52746a(Throwable th) {
            return vg2.m52737c(new C17574a(th));
        }

        /* renamed from: b */
        public final Object m52747b() {
            return vg2.m52737c(vg2.f50295c);
        }

        /* renamed from: c */
        public final Object m52748c(Object obj) {
            return vg2.m52737c(obj);
        }
    }

    /* renamed from: o.vg2$c */
    public static class C17576c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ vg2(Object obj) {
        this.f50296a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ vg2 m52736b(Object obj) {
        return new vg2(obj);
    }

    /* renamed from: c */
    public static Object m52737c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m52738d(Object obj, Object obj2) {
        return (obj2 instanceof vg2) && sq8.m48644c(obj, ((vg2) obj2).m52745k());
    }

    /* renamed from: e */
    public static final Throwable m52739e(Object obj) {
        C17574a c17574a = obj instanceof C17574a ? (C17574a) obj : null;
        if (c17574a != null) {
            return c17574a.f50297a;
        }
        return null;
    }

    /* renamed from: f */
    public static int m52740f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m52741g(Object obj) {
        return obj instanceof C17574a;
    }

    /* renamed from: h */
    public static final boolean m52742h(Object obj) {
        return obj instanceof C17576c;
    }

    /* renamed from: i */
    public static final boolean m52743i(Object obj) {
        return !(obj instanceof C17576c);
    }

    /* renamed from: j */
    public static String m52744j(Object obj) {
        if (obj instanceof C17574a) {
            return ((C17574a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m52738d(this.f50296a, obj);
    }

    public int hashCode() {
        return m52740f(this.f50296a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object m52745k() {
        return this.f50296a;
    }

    public String toString() {
        return m52744j(this.f50296a);
    }
}
