package p001o;

import p001o.xej;

/* loaded from: classes3.dex */
public abstract class xba {

    /* renamed from: o.xba$a */
    public static final class C18103a extends xba {

        /* renamed from: a */
        public static final C18103a f53456a = new C18103a();

        /* renamed from: b */
        public static final int f53457b = 0;

        public C18103a() {
            super(null);
        }

        @Override // p001o.xba
        /* renamed from: a */
        public int mo55943a() {
            return f53457b;
        }
    }

    /* renamed from: o.xba$b */
    public static final class C18104b extends xba {

        /* renamed from: a */
        public static final C18104b f53458a = new C18104b();

        /* renamed from: b */
        public static final int f53459b = 0;

        public C18104b() {
            super(null);
        }

        @Override // p001o.xba
        /* renamed from: a */
        public int mo55943a() {
            return f53459b;
        }
    }

    /* renamed from: o.xba$c */
    public static final class C18105c extends xba {

        /* renamed from: a */
        public static final C18105c f53460a = new C18105c();

        /* renamed from: b */
        public static final int f53461b = 0;

        public C18105c() {
            super(null);
        }

        @Override // p001o.xba
        /* renamed from: a */
        public int mo55943a() {
            return f53461b;
        }
    }

    /* renamed from: o.xba$d */
    public static abstract class AbstractC18106d extends xba {

        /* renamed from: o.xba$d$a */
        public static final class a extends AbstractC18106d {

            /* renamed from: a */
            public final xej.C18137d f53462a;

            /* renamed from: b */
            public final b f53463b;

            /* renamed from: c */
            public final int f53464c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xej.C18137d c18137d, b bVar) {
                super(null);
                sq8.m48649h(c18137d, "name");
                this.f53462a = c18137d;
                this.f53463b = bVar;
                b bVarM55945c = m55945c();
                this.f53464c = (bVarM55945c != null ? bVarM55945c.mo55943a() : 0) + 1;
            }

            @Override // p001o.xba
            /* renamed from: a */
            public int mo55943a() {
                return this.f53464c;
            }

            /* renamed from: b */
            public xej.C18137d m55944b() {
                return this.f53462a;
            }

            /* renamed from: c */
            public b m55945c() {
                return this.f53463b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return sq8.m48644c(this.f53462a, aVar.f53462a) && sq8.m48644c(this.f53463b, aVar.f53463b);
            }

            public int hashCode() {
                int iHashCode = this.f53462a.hashCode() * 31;
                b bVar = this.f53463b;
                return iHashCode + (bVar == null ? 0 : bVar.hashCode());
            }

            public String toString() {
                return "EmptyTag(name=" + this.f53462a + ", parent=" + this.f53463b + ')';
            }
        }

        /* renamed from: o.xba$d$b */
        public static final class b extends AbstractC18106d {

            /* renamed from: a */
            public final xej.C18137d f53465a;

            /* renamed from: b */
            public final b f53466b;

            /* renamed from: c */
            public final boolean f53467c;

            /* renamed from: d */
            public final int f53468d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(xej.C18137d c18137d, b bVar, boolean z) {
                super(null);
                sq8.m48649h(c18137d, "name");
                this.f53465a = c18137d;
                this.f53466b = bVar;
                this.f53467c = z;
                b bVarM55949e = m55949e();
                this.f53468d = (bVarM55949e != null ? bVarM55949e.mo55943a() : 0) + 1;
            }

            /* renamed from: c */
            public static /* synthetic */ b m55946c(b bVar, xej.C18137d c18137d, b bVar2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    c18137d = bVar.f53465a;
                }
                if ((i & 2) != 0) {
                    bVar2 = bVar.f53466b;
                }
                if ((i & 4) != 0) {
                    z = bVar.f53467c;
                }
                return bVar.m55947b(c18137d, bVar2, z);
            }

            @Override // p001o.xba
            /* renamed from: a */
            public int mo55943a() {
                return this.f53468d;
            }

            /* renamed from: b */
            public final b m55947b(xej.C18137d c18137d, b bVar, boolean z) {
                sq8.m48649h(c18137d, "name");
                return new b(c18137d, bVar, z);
            }

            /* renamed from: d */
            public xej.C18137d m55948d() {
                return this.f53465a;
            }

            /* renamed from: e */
            public b m55949e() {
                return this.f53466b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return sq8.m48644c(this.f53465a, bVar.f53465a) && sq8.m48644c(this.f53466b, bVar.f53466b) && this.f53467c == bVar.f53467c;
            }

            /* renamed from: f */
            public final boolean m55950f() {
                return this.f53467c;
            }

            public int hashCode() {
                int iHashCode = this.f53465a.hashCode() * 31;
                b bVar = this.f53466b;
                return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.f53467c);
            }

            public String toString() {
                return "OpenTag(name=" + this.f53465a + ", parent=" + this.f53466b + ", seenChildren=" + this.f53467c + ')';
            }
        }

        public /* synthetic */ AbstractC18106d(id5 id5Var) {
            this();
        }

        public AbstractC18106d() {
            super(null);
        }
    }

    public xba() {
    }

    public /* synthetic */ xba(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract int mo55943a();
}
