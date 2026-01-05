package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ild {

    /* renamed from: a */
    public static final C14313a f28820a = new C14313a(null);

    /* renamed from: b */
    public static final List f28821b = bh3.m18963e(C14314b.f28822c);

    /* renamed from: o.ild$a */
    public static final class C14313a {
        public C14313a() {
        }

        public /* synthetic */ C14313a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ild m32266a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "MASK") ? C14314b.f28822c : new C14315c(str);
        }
    }

    /* renamed from: o.ild$b */
    public static final class C14314b extends ild {

        /* renamed from: c */
        public static final C14314b f28822c = new C14314b();

        /* renamed from: d */
        public static final String f28823d = "MASK";

        public C14314b() {
            super(null);
        }

        @Override // p001o.ild
        /* renamed from: a */
        public String mo32265a() {
            return f28823d;
        }

        public String toString() {
            return "Mask";
        }
    }

    /* renamed from: o.ild$c */
    public static final class C14315c extends ild {

        /* renamed from: c */
        public final String f28824c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14315c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f28824c = str;
        }

        @Override // p001o.ild
        /* renamed from: a */
        public String mo32265a() {
            return this.f28824c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14315c) && sq8.m48644c(this.f28824c, ((C14315c) obj).f28824c);
        }

        public int hashCode() {
            return this.f28824c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo32265a() + ')';
        }
    }

    public ild() {
    }

    public /* synthetic */ ild(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo32265a();
}
