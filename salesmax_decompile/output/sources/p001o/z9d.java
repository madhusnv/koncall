package p001o;

/* loaded from: classes2.dex */
public final class z9d implements y9d {

    /* renamed from: a */
    public final nl7 f56750a;

    /* renamed from: b */
    public final uxf f56751b;

    /* renamed from: c */
    public boolean f56752c;

    /* renamed from: d */
    public x9d f56753d;

    /* renamed from: o.z9d$a */
    public static final class C18587a {

        /* renamed from: a */
        public final w9d f56754a;

        /* renamed from: b */
        public final uk7 f56755b;

        public C18587a(w9d w9dVar, uk7 uk7Var) {
            sq8.m48649h(w9dVar, "adapter");
            sq8.m48649h(uk7Var, "onDispose");
            this.f56754a = w9dVar;
            this.f56755b = uk7Var;
        }

        /* renamed from: a */
        public final w9d m58996a() {
            return this.f56754a;
        }
    }

    /* renamed from: o.z9d$b */
    public final class C18588b implements v9d {

        /* renamed from: a */
        public final x9d f56756a;

        /* renamed from: b */
        public final /* synthetic */ z9d f56757b;

        public C18588b(z9d z9dVar, x9d x9dVar) {
            sq8.m48649h(x9dVar, "plugin");
            this.f56757b = z9dVar;
            this.f56756a = x9dVar;
        }
    }

    /* renamed from: o.z9d$c */
    public final class C18589c {

        /* renamed from: a */
        public final w9d f56758a;

        /* renamed from: b */
        public final dpb f56759b;

        /* renamed from: c */
        public final /* synthetic */ z9d f56760c;

        public C18589c(z9d z9dVar, w9d w9dVar) {
            sq8.m48649h(w9dVar, "adapter");
            this.f56760c = z9dVar;
            this.f56758a = w9dVar;
            this.f56759b = cxf.m22040a(0);
        }

        /* renamed from: a */
        public final boolean m58997a() {
            m59001e(m58999c() - 1);
            if (m58999c() >= 0) {
                if (m58999c() != 0) {
                    return false;
                }
                this.f56760c.f56752c = true;
                return true;
            }
            throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + m58999c() + ')').toString());
        }

        /* renamed from: b */
        public final w9d m58998b() {
            return this.f56758a;
        }

        /* renamed from: c */
        public final int m58999c() {
            return this.f56759b.mo23664b();
        }

        /* renamed from: d */
        public final void m59000d() {
            m59001e(m58999c() + 1);
        }

        /* renamed from: e */
        public final void m59001e(int i) {
            this.f56759b.mo23665f(i);
        }
    }

    /* renamed from: o.z9d$d */
    public static final class C18590d extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ C18589c f56761a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18590d(C18589c c18589c) {
            super(0);
            this.f56761a = c18589c;
        }

        @Override // p001o.uk7
        public final Boolean invoke() {
            return Boolean.valueOf(this.f56761a.m58997a());
        }
    }

    public z9d(nl7 nl7Var) {
        sq8.m48649h(nl7Var, "factory");
        this.f56750a = nl7Var;
        this.f56751b = qxf.m45952c();
    }

    /* renamed from: b */
    public final w9d m58993b() {
        C18589c c18589c = (C18589c) this.f56751b.get(this.f56753d);
        if (c18589c != null) {
            return c18589c.m58998b();
        }
        return null;
    }

    /* renamed from: c */
    public final C18587a m58994c(x9d x9dVar) {
        sq8.m48649h(x9dVar, "plugin");
        C18589c c18589cM58995d = (C18589c) this.f56751b.get(x9dVar);
        if (c18589cM58995d == null) {
            c18589cM58995d = m58995d(x9dVar);
        }
        c18589cM58995d.m59000d();
        return new C18587a(c18589cM58995d.m58998b(), new C18590d(c18589cM58995d));
    }

    /* renamed from: d */
    public final C18589c m58995d(x9d x9dVar) {
        Object objInvoke = this.f56750a.invoke(x9dVar, new C18588b(this, x9dVar));
        sq8.m48647f(objInvoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        C18589c c18589c = new C18589c(this, (w9d) objInvoke);
        this.f56751b.put(x9dVar, c18589c);
        return c18589c;
    }
}
