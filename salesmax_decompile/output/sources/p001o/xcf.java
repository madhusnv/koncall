package p001o;

/* loaded from: classes2.dex */
public final class xcf {

    /* renamed from: a */
    public final String f53531a;

    /* renamed from: b */
    public final nl7 f53532b;

    /* renamed from: o.xcf$a */
    public static final class C18115a extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C18115a f53533a = new C18115a();

        public C18115a() {
            super(2);
        }

        @Override // p001o.nl7
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public xcf(String str, nl7 nl7Var) {
        sq8.m48649h(str, "name");
        sq8.m48649h(nl7Var, "mergePolicy");
        this.f53531a = str;
        this.f53532b = nl7Var;
    }

    /* renamed from: a */
    public final String m56027a() {
        return this.f53531a;
    }

    /* renamed from: b */
    public final Object m56028b(Object obj, Object obj2) {
        return this.f53532b.invoke(obj, obj2);
    }

    /* renamed from: c */
    public final void m56029c(ycf ycfVar, ac9 ac9Var, Object obj) {
        sq8.m48649h(ycfVar, "thisRef");
        sq8.m48649h(ac9Var, "property");
        ycfVar.mo35413d(this, obj);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f53531a;
    }

    public /* synthetic */ xcf(String str, nl7 nl7Var, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? C18115a.f53533a : nl7Var);
    }
}
