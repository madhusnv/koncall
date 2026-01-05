package p001o;

import p001o.ese;
import p001o.m3g;
import p001o.zv;

/* loaded from: classes3.dex */
public final class zv extends m3g {

    /* renamed from: d */
    public static final C18715a f57735d = new C18715a(null);

    /* renamed from: c */
    public final C18716b f57736c;

    /* renamed from: o.zv$a */
    public static final class C18715a implements o06 {
        public C18715a() {
        }

        public /* synthetic */ C18715a(id5 id5Var) {
            this();
        }

        @Override // p001o.o06
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public zv mo19519a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C18716b.a aVar = new C18716b.a();
            xk7Var.invoke(aVar);
            return new zv(new C18716b(aVar));
        }
    }

    /* renamed from: o.zv$b */
    public static final class C18716b extends m3g.C15211b {

        /* renamed from: f */
        public static final b f57737f = new b(null);

        /* renamed from: g */
        public static final C18716b f57738g = new C18716b(new a());

        /* renamed from: e */
        public final cce f57739e;

        /* renamed from: o.zv$b$a */
        public static final class a extends m3g.C15211b.a {

            /* renamed from: d */
            public final n06 f57740d = new n06(wv.f52683j, new xk7() { // from class: o.aw
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return zv.C18716b.a.m59971m((cce) obj);
                }
            }, null, 4, null);

            /* renamed from: m */
            public static final xk7 m59971m(cce cceVar) {
                sq8.m48649h(cceVar, "$this$DslBuilderProperty");
                return cceVar.getConfig().mo20852a();
            }

            /* renamed from: l */
            public final n06 m59972l() {
                return this.f57740d;
            }
        }

        /* renamed from: o.zv$b$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18716b(a aVar) {
            super(aVar);
            sq8.m48649h(aVar, "builder");
            this.f57739e = (cce) aVar.m59972l().m39946o().invoke();
        }

        /* renamed from: g */
        public final cce m59969g() {
            return this.f57739e;
        }
    }

    /* renamed from: o.zv$c */
    public static final class C18717c extends o64 {

        /* renamed from: a */
        public Object f57741a;

        /* renamed from: b */
        public Object f57742b;

        /* renamed from: c */
        public /* synthetic */ Object f57743c;

        /* renamed from: e */
        public int f57745e;

        public C18717c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f57743c = obj;
            this.f57745e |= Integer.MIN_VALUE;
            return zv.this.mo38252d(0, null, null, null, this);
        }
    }

    /* renamed from: o.zv$d */
    public static final class C18718d extends o64 {

        /* renamed from: a */
        public Object f57746a;

        /* renamed from: b */
        public /* synthetic */ Object f57747b;

        /* renamed from: d */
        public int f57749d;

        public C18718d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f57747b = obj;
            this.f57749d |= Integer.MIN_VALUE;
            return zv.this.mo38253f(this);
        }
    }

    /* renamed from: o.zv$e */
    public static final class C18719e extends o64 {

        /* renamed from: a */
        public Object f57750a;

        /* renamed from: b */
        public /* synthetic */ Object f57751b;

        /* renamed from: d */
        public int f57753d;

        public C18719e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f57751b = obj;
            this.f57753d |= Integer.MIN_VALUE;
            return zv.this.mo38254h(0, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(C18716b c18716b) {
        super(c18716b);
        sq8.m48649h(c18716b, "config");
        this.f57736c = c18716b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.m3g
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo38252d(int i, Object obj, ese eseVar, tse tseVar, n64 n64Var) {
        C18717c c18717c;
        zv zvVar;
        if (n64Var instanceof C18717c) {
            c18717c = (C18717c) n64Var;
            int i2 = c18717c.f57745e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18717c.f57745e = i2 - Integer.MIN_VALUE;
            } else {
                c18717c = new C18717c(n64Var);
            }
        }
        Object obj2 = c18717c.f57743c;
        Object objM51918f = uq8.m51918f();
        int i3 = c18717c.f57745e;
        if (i3 == 0) {
            wre.m54934b(obj2);
            c18717c.f57741a = this;
            c18717c.f57742b = eseVar;
            c18717c.f57745e = 1;
            if (super.mo38252d(i, obj, eseVar, tseVar, c18717c) == objM51918f) {
                return objM51918f;
            }
            zvVar = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj2);
                return y3i.f54824a;
            }
            eseVar = (ese) c18717c.f57742b;
            zvVar = (zv) c18717c.f57741a;
            wre.m54934b(obj2);
        }
        ese.C13254a c13254a = eseVar instanceof ese.C13254a ? (ese.C13254a) eseVar : null;
        fse fseVarM25527a = c13254a != null ? c13254a.m25527a() : null;
        cce cceVarM59969g = zvVar.getConfig().m59969g();
        c18717c.f57741a = null;
        c18717c.f57742b = null;
        c18717c.f57745e = 2;
        if (cceVarM59969g.mo20851b(fseVarM25527a, c18717c) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.m3g
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo38253f(n64 n64Var) {
        C18718d c18718d;
        zv zvVar;
        if (n64Var instanceof C18718d) {
            c18718d = (C18718d) n64Var;
            int i = c18718d.f57749d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18718d.f57749d = i - Integer.MIN_VALUE;
            } else {
                c18718d = new C18718d(n64Var);
            }
        }
        Object obj = c18718d.f57747b;
        Object objM51918f = uq8.m51918f();
        int i2 = c18718d.f57749d;
        if (i2 == 0) {
            wre.m54934b(obj);
            c18718d.f57746a = this;
            c18718d.f57749d = 1;
            if (super.mo38253f(c18718d) == objM51918f) {
                return objM51918f;
            }
            zvVar = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            zvVar = (zv) c18718d.f57746a;
            wre.m54934b(obj);
        }
        cce cceVarM59969g = zvVar.getConfig().m59969g();
        c18718d.f57746a = null;
        c18718d.f57749d = 2;
        if (cceVarM59969g.mo20850a(1, c18718d) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.m3g
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo38254h(int i, Object obj, ese eseVar, tse tseVar, n64 n64Var) {
        C18719e c18719e;
        zv zvVar;
        if (n64Var instanceof C18719e) {
            c18719e = (C18719e) n64Var;
            int i2 = c18719e.f57753d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18719e.f57753d = i2 - Integer.MIN_VALUE;
            } else {
                c18719e = new C18719e(n64Var);
            }
        }
        Object obj2 = c18719e.f57751b;
        Object objM51918f = uq8.m51918f();
        int i3 = c18719e.f57753d;
        if (i3 == 0) {
            wre.m54934b(obj2);
            c18719e.f57750a = this;
            c18719e.f57753d = 1;
            if (super.mo38254h(i, obj, eseVar, tseVar, c18719e) == objM51918f) {
                return objM51918f;
            }
            zvVar = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj2);
                return y3i.f54824a;
            }
            zvVar = (zv) c18719e.f57750a;
            wre.m54934b(obj2);
        }
        cce cceVarM59969g = zvVar.getConfig().m59969g();
        c18719e.f57750a = null;
        c18719e.f57753d = 2;
        if (cceVarM59969g.mo20850a(1, c18719e) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    @Override // p001o.m3g
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C18716b getConfig() {
        return this.f57736c;
    }
}
