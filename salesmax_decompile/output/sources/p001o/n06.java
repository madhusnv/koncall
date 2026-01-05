package p001o;

/* loaded from: classes3.dex */
public final class n06 {

    /* renamed from: a */
    public final o06 f36152a;

    /* renamed from: b */
    public final xk7 f36153b;

    /* renamed from: c */
    public final xk7 f36154c;

    /* renamed from: d */
    public xk7 f36155d;

    /* renamed from: e */
    public o06 f36156e;

    /* renamed from: f */
    public kdg f36157f;

    /* renamed from: g */
    public uk7 f36158g;

    /* renamed from: h */
    public Object f36159h;

    /* renamed from: o.n06$a */
    public /* synthetic */ class C15454a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36160a;

        static {
            int[] iArr = new int[kdg.values().length];
            try {
                iArr[kdg.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kdg.EXPLICIT_INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36160a = iArr;
        }
    }

    public n06(o06 o06Var, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(o06Var, "defaultFactory");
        sq8.m48649h(xk7Var, "toBuilderApplicator");
        sq8.m48649h(xk7Var2, "managedTransform");
        this.f36152a = o06Var;
        this.f36153b = xk7Var;
        this.f36154c = xk7Var2;
        this.f36155d = new xk7() { // from class: o.j06
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return n06.m39943n(obj);
            }
        };
        this.f36156e = o06Var;
        this.f36157f = kdg.NOT_INITIALIZED;
        this.f36158g = new uk7() { // from class: o.k06
            @Override // p001o.uk7
            public final Object invoke() {
                return n06.m39944q(this.f31317a);
            }
        };
    }

    /* renamed from: i */
    public static final Object m39938i(Object obj) {
        return obj;
    }

    /* renamed from: j */
    public static final Object m39939j(n06 n06Var) {
        return n06Var.f36154c.invoke(n06Var.f36156e.mo19519a(new xk7() { // from class: o.l06
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return n06.m39940k(obj);
            }
        }));
    }

    /* renamed from: k */
    public static final y3i m39940k(Object obj) {
        return y3i.f54824a;
    }

    /* renamed from: l */
    public static final Object m39941l(Object obj) {
        return obj;
    }

    /* renamed from: m */
    public static final y3i m39942m(Object obj) {
        return y3i.f54824a;
    }

    /* renamed from: n */
    public static final y3i m39943n(Object obj) {
        return y3i.f54824a;
    }

    /* renamed from: q */
    public static final Object m39944q(n06 n06Var) {
        return n06Var.f36154c.invoke(n06Var.f36156e.mo19519a(new xk7() { // from class: o.m06
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return n06.m39945r(obj);
            }
        }));
    }

    /* renamed from: r */
    public static final y3i m39945r(Object obj) {
        return y3i.f54824a;
    }

    /* renamed from: o */
    public final uk7 m39946o() {
        return this.f36158g;
    }

    /* renamed from: p */
    public final void m39947p(final Object obj) {
        uk7 uk7Var;
        xk7 xk7Var;
        this.f36157f = C15454a.f36160a[this.f36157f.ordinal()] == 1 ? kdg.INITIALIZED : kdg.EXPLICIT_INSTANCE;
        this.f36159h = obj;
        if (obj == null) {
            this.f36156e = this.f36152a;
            uk7Var = new uk7() { // from class: o.g06
                @Override // p001o.uk7
                public final Object invoke() {
                    return n06.m39939j(this.f24324a);
                }
            };
        } else {
            uk7Var = new uk7() { // from class: o.h06
                @Override // p001o.uk7
                public final Object invoke() {
                    return n06.m39941l(obj);
                }
            };
        }
        this.f36158g = uk7Var;
        if (obj == null || (xk7Var = (xk7) this.f36153b.invoke(obj)) == null) {
            xk7Var = new xk7() { // from class: o.i06
                @Override // p001o.xk7
                public final Object invoke(Object obj2) {
                    return n06.m39942m(obj2);
                }
            };
        }
        this.f36155d = xk7Var;
    }

    public /* synthetic */ n06(o06 o06Var, xk7 xk7Var, xk7 xk7Var2, int i, id5 id5Var) {
        this(o06Var, xk7Var, (i & 4) != 0 ? new xk7() { // from class: o.f06
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return n06.m39938i(obj);
            }
        } : xk7Var2);
    }
}
