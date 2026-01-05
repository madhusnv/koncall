package p001o;

import java.util.List;
import p001o.kei;
import p001o.y66;

/* loaded from: classes3.dex */
public final class kei {

    /* renamed from: e */
    public static final C14822b f32115e = new C14822b(null);

    /* renamed from: f */
    public static final kei f32116f;

    /* renamed from: a */
    public final y66 f32117a;

    /* renamed from: b */
    public final y66 f32118b;

    /* renamed from: c */
    public final boolean f32119c;

    /* renamed from: d */
    public final boolean f32120d;

    /* renamed from: o.kei$b */
    public static final class C14822b {
        public C14822b() {
        }

        public /* synthetic */ C14822b(id5 id5Var) {
            this();
        }

        /* renamed from: d */
        public static final y3i m35562d(String str, C14821a c14821a) {
            sq8.m48649h(c14821a, "$this$UserInfo");
            c14821a.m35559e(str);
            return y3i.f54824a;
        }

        /* renamed from: b */
        public final kei m35563b(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C14821a c14821a = new C14821a();
            xk7Var.invoke(c14821a);
            return c14821a.m35555a();
        }

        /* renamed from: c */
        public final kei m35564c(final String str) {
            sq8.m48649h(str, "encoded");
            return kei.f32115e.m35563b(new xk7() { // from class: o.lei
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return kei.C14822b.m35562d(str, (kei.C14821a) obj);
                }
            });
        }
    }

    static {
        y66.C18343a c18343a = y66.f54989f;
        f32116f = new kei(c18343a.m57315a(), c18343a.m57315a());
    }

    public /* synthetic */ kei(y66 y66Var, y66 y66Var2, id5 id5Var) {
        this(y66Var, y66Var2);
    }

    /* renamed from: a */
    public final y66 m35552a() {
        return this.f32118b;
    }

    /* renamed from: b */
    public final y66 m35553b() {
        return this.f32117a;
    }

    /* renamed from: c */
    public final C14821a m35554c() {
        return new C14821a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kei.class != obj.getClass()) {
            return false;
        }
        kei keiVar = (kei) obj;
        return sq8.m48644c(this.f32117a, keiVar.f32117a) && sq8.m48644c(this.f32118b, keiVar.f32118b);
    }

    public int hashCode() {
        return (this.f32117a.hashCode() * 31) + this.f32118b.hashCode();
    }

    public String toString() {
        if (this.f32117a.m57312d()) {
            return "";
        }
        if (this.f32118b.m57312d()) {
            return this.f32117a.m57311c();
        }
        return this.f32117a.m57311c() + ':' + this.f32118b.m57311c();
    }

    public kei(y66 y66Var, y66 y66Var2) {
        this.f32117a = y66Var;
        this.f32118b = y66Var2;
        boolean z = false;
        if (!(y66Var2.m57312d() || y66Var.m57313e())) {
            throw new IllegalArgumentException("Cannot have a password without a user name".toString());
        }
        if (y66Var.m57312d() && y66Var2.m57312d()) {
            z = true;
        }
        this.f32119c = z;
        this.f32120d = !z;
    }

    /* renamed from: o.kei$a */
    public static final class C14821a {

        /* renamed from: a */
        public y66 f32121a;

        /* renamed from: b */
        public y66 f32122b;

        /* renamed from: o.kei$a$a */
        public /* synthetic */ class a extends dm7 implements xk7 {
            public a(Object obj) {
                super(1, obj, m76.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24243c(str);
            }
        }

        public C14821a(kei keiVar) {
            y66 y66VarM35552a;
            y66 y66VarM35553b;
            this.f32121a = (keiVar == null || (y66VarM35553b = keiVar.m35553b()) == null) ? y66.f54989f.m57315a() : y66VarM35553b;
            this.f32122b = (keiVar == null || (y66VarM35552a = keiVar.m35552a()) == null) ? y66.f54989f.m57315a() : y66VarM35552a;
        }

        /* renamed from: a */
        public final kei m35555a() {
            return new kei(this.f32121a, this.f32122b, null);
        }

        /* renamed from: b */
        public final void m35556b(C14821a c14821a) {
            sq8.m48649h(c14821a, "other");
            this.f32121a = c14821a.f32121a;
            this.f32122b = c14821a.f32122b;
        }

        /* renamed from: c */
        public final void m35557c(kei keiVar) {
            sq8.m48649h(keiVar, "other");
            this.f32121a = keiVar.m35553b();
            this.f32122b = keiVar.m35552a();
        }

        /* renamed from: d */
        public final void m35558d(String str, xk7 xk7Var) {
            y66 y66VarM57315a;
            if (str.length() == 0) {
                y66.C18343a c18343a = y66.f54989f;
                this.f32121a = c18343a.m57315a();
                this.f32122b = c18343a.m57315a();
                return;
            }
            List listD0 = f9g.D0(str, new String[]{":"}, false, 2, 2, null);
            this.f32121a = (y66) xk7Var.invoke(listD0.get(0));
            int size = listD0.size();
            if (size == 1) {
                y66VarM57315a = y66.f54989f.m57315a();
            } else {
                if (size != 2) {
                    throw new IllegalArgumentException("invalid user info string " + str);
                }
                y66VarM57315a = (y66) xk7Var.invoke(listD0.get(1));
            }
            this.f32122b = y66VarM57315a;
        }

        /* renamed from: e */
        public final void m35559e(String str) {
            sq8.m48649h(str, "encoded");
            m35558d(str, new a(e3d.f20909h.m24253j()));
        }

        public C14821a() {
            this(null);
        }
    }
}
