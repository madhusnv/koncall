package p001o;

import android.graphics.Rect;
import p001o.l77;

/* loaded from: classes2.dex */
public final class zw7 implements l77 {

    /* renamed from: d */
    public static final C18721a f57810d = new C18721a(null);

    /* renamed from: a */
    public final ll1 f57811a;

    /* renamed from: b */
    public final C18722b f57812b;

    /* renamed from: c */
    public final l77.C15011b f57813c;

    /* renamed from: o.zw7$a */
    public static final class C18721a {
        public C18721a() {
        }

        public /* synthetic */ C18721a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m59992a(ll1 ll1Var) {
            sq8.m48649h(ll1Var, "bounds");
            if (!((ll1Var.m37418d() == 0 && ll1Var.m37415a() == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (!(ll1Var.m37416b() == 0 || ll1Var.m37417c() == 0)) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* renamed from: o.zw7$b */
    public static final class C18722b {

        /* renamed from: b */
        public static final a f57814b = new a(null);

        /* renamed from: c */
        public static final C18722b f57815c = new C18722b("FOLD");

        /* renamed from: d */
        public static final C18722b f57816d = new C18722b("HINGE");

        /* renamed from: a */
        public final String f57817a;

        /* renamed from: o.zw7$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C18722b m59995a() {
                return C18722b.f57815c;
            }

            /* renamed from: b */
            public final C18722b m59996b() {
                return C18722b.f57816d;
            }
        }

        public C18722b(String str) {
            this.f57817a = str;
        }

        public String toString() {
            return this.f57817a;
        }
    }

    public zw7(ll1 ll1Var, C18722b c18722b, l77.C15011b c15011b) {
        sq8.m48649h(ll1Var, "featureBounds");
        sq8.m48649h(c18722b, "type");
        sq8.m48649h(c15011b, "state");
        this.f57811a = ll1Var;
        this.f57812b = c18722b;
        this.f57813c = c15011b;
        f57810d.m59992a(ll1Var);
    }

    @Override // p001o.ou5
    /* renamed from: a */
    public Rect mo42700a() {
        return this.f57811a.m37420f();
    }

    @Override // p001o.l77
    /* renamed from: b */
    public boolean mo36655b() {
        C18722b c18722b = this.f57812b;
        C18722b.a aVar = C18722b.f57814b;
        if (sq8.m48644c(c18722b, aVar.m59996b())) {
            return true;
        }
        return sq8.m48644c(this.f57812b, aVar.m59995a()) && sq8.m48644c(m59991d(), l77.C15011b.f33349d);
    }

    @Override // p001o.l77
    /* renamed from: c */
    public l77.C15010a mo36656c() {
        return this.f57811a.m37418d() > this.f57811a.m37415a() ? l77.C15010a.f33345d : l77.C15010a.f33344c;
    }

    /* renamed from: d */
    public l77.C15011b m59991d() {
        return this.f57813c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(zw7.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        zw7 zw7Var = (zw7) obj;
        return sq8.m48644c(this.f57811a, zw7Var.f57811a) && sq8.m48644c(this.f57812b, zw7Var.f57812b) && sq8.m48644c(m59991d(), zw7Var.m59991d());
    }

    public int hashCode() {
        return (((this.f57811a.hashCode() * 31) + this.f57812b.hashCode()) * 31) + m59991d().hashCode();
    }

    public String toString() {
        return ((Object) zw7.class.getSimpleName()) + " { " + this.f57811a + ", type=" + this.f57812b + ", state=" + m59991d() + " }";
    }
}
