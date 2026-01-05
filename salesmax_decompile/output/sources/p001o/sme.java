package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class sme {

    /* renamed from: a */
    public static final C16870a f45648a = new C16870a(null);

    /* renamed from: b */
    public static final List f45649b = bh3.m18963e(C16871b.f45650c);

    /* renamed from: o.sme$a */
    public static final class C16870a {
        public C16870a() {
        }

        public /* synthetic */ C16870a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final sme m48559a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "requester") ? C16871b.f45650c : new C16872c(str);
        }
    }

    /* renamed from: o.sme$b */
    public static final class C16871b extends sme {

        /* renamed from: c */
        public static final C16871b f45650c = new C16871b();

        /* renamed from: d */
        public static final String f45651d = "requester";

        public C16871b() {
            super(null);
        }

        @Override // p001o.sme
        /* renamed from: a */
        public String mo48558a() {
            return f45651d;
        }

        public String toString() {
            return "Requester";
        }
    }

    /* renamed from: o.sme$c */
    public static final class C16872c extends sme {

        /* renamed from: c */
        public final String f45652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16872c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f45652c = str;
        }

        @Override // p001o.sme
        /* renamed from: a */
        public String mo48558a() {
            return this.f45652c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16872c) && sq8.m48644c(this.f45652c, ((C16872c) obj).f45652c);
        }

        public int hashCode() {
            return this.f45652c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo48558a() + ')';
        }
    }

    public sme() {
    }

    public /* synthetic */ sme(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo48558a();
}
