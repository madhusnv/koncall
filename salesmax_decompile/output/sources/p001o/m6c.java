package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class m6c {

    /* renamed from: a */
    public static final C15231a f34854a = new C15231a(null);

    /* renamed from: b */
    public static final List f34855b = ch3.m21249n(C15232b.f34856c, C15233c.f34858c);

    /* renamed from: o.m6c$a */
    public static final class C15231a {
        public C15231a() {
        }

        public /* synthetic */ C15231a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final m6c m38412a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "OFF") ? C15232b.f34856c : sq8.m48644c(str, "ON") ? C15233c.f34858c : new C15234d(str);
        }
    }

    /* renamed from: o.m6c$b */
    public static final class C15232b extends m6c {

        /* renamed from: c */
        public static final C15232b f34856c = new C15232b();

        /* renamed from: d */
        public static final String f34857d = "OFF";

        public C15232b() {
            super(null);
        }

        @Override // p001o.m6c
        /* renamed from: a */
        public String mo38411a() {
            return f34857d;
        }

        public String toString() {
            return "Off";
        }
    }

    /* renamed from: o.m6c$c */
    public static final class C15233c extends m6c {

        /* renamed from: c */
        public static final C15233c f34858c = new C15233c();

        /* renamed from: d */
        public static final String f34859d = "ON";

        public C15233c() {
            super(null);
        }

        @Override // p001o.m6c
        /* renamed from: a */
        public String mo38411a() {
            return f34859d;
        }

        public String toString() {
            return "On";
        }
    }

    /* renamed from: o.m6c$d */
    public static final class C15234d extends m6c {

        /* renamed from: c */
        public final String f34860c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15234d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f34860c = str;
        }

        @Override // p001o.m6c
        /* renamed from: a */
        public String mo38411a() {
            return this.f34860c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15234d) && sq8.m48644c(this.f34860c, ((C15234d) obj).f34860c);
        }

        public int hashCode() {
            return this.f34860c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo38411a() + ')';
        }
    }

    public m6c() {
    }

    public /* synthetic */ m6c(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo38411a();
}
