package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ut8 {

    /* renamed from: a */
    public static final C17446a f49469a = new C17446a(null);

    /* renamed from: b */
    public static final List f49470b = bh3.m18963e(C17447b.f49471c);

    /* renamed from: o.ut8$a */
    public static final class C17446a {
        public C17446a() {
        }

        public /* synthetic */ C17446a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ut8 m52012a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "INVALID_DOCUMENT") ? C17447b.f49471c : new C17448c(str);
        }
    }

    /* renamed from: o.ut8$b */
    public static final class C17447b extends ut8 {

        /* renamed from: c */
        public static final C17447b f49471c = new C17447b();

        /* renamed from: d */
        public static final String f49472d = "INVALID_DOCUMENT";

        public C17447b() {
            super(null);
        }

        public String toString() {
            return "InvalidDocument";
        }
    }

    /* renamed from: o.ut8$c */
    public static final class C17448c extends ut8 {

        /* renamed from: c */
        public final String f49473c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17448c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f49473c = str;
        }

        /* renamed from: a */
        public String m52013a() {
            return this.f49473c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17448c) && sq8.m48644c(this.f49473c, ((C17448c) obj).f49473c);
        }

        public int hashCode() {
            return this.f49473c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m52013a() + ')';
        }
    }

    public ut8() {
    }

    public /* synthetic */ ut8(id5 id5Var) {
        this();
    }
}
