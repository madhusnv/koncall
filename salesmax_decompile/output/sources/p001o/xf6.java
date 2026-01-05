package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class xf6 {

    /* renamed from: a */
    public static final C18139a f53687a = new C18139a(null);

    /* renamed from: b */
    public static final List f53688b = ch3.m21249n(C18140b.f53689c, C18141c.f53691c, C18142d.f53693c, C18144f.f53696c);

    /* renamed from: o.xf6$a */
    public static final class C18139a {
        public C18139a() {
        }

        public /* synthetic */ C18139a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final xf6 m56210a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1048886849:
                    if (str.equals("neural")) {
                        return C18142d.f53693c;
                    }
                    break;
                case 81532277:
                    if (str.equals("long-form")) {
                        return C18141c.f53691c;
                    }
                    break;
                case 305703400:
                    if (str.equals("generative")) {
                        return C18140b.f53689c;
                    }
                    break;
                case 1312628413:
                    if (str.equals("standard")) {
                        return C18144f.f53696c;
                    }
                    break;
            }
            return new C18143e(str);
        }
    }

    /* renamed from: o.xf6$b */
    public static final class C18140b extends xf6 {

        /* renamed from: c */
        public static final C18140b f53689c = new C18140b();

        /* renamed from: d */
        public static final String f53690d = "generative";

        public C18140b() {
            super(null);
        }

        @Override // p001o.xf6
        /* renamed from: a */
        public String mo56209a() {
            return f53690d;
        }

        public String toString() {
            return "Generative";
        }
    }

    /* renamed from: o.xf6$c */
    public static final class C18141c extends xf6 {

        /* renamed from: c */
        public static final C18141c f53691c = new C18141c();

        /* renamed from: d */
        public static final String f53692d = "long-form";

        public C18141c() {
            super(null);
        }

        @Override // p001o.xf6
        /* renamed from: a */
        public String mo56209a() {
            return f53692d;
        }

        public String toString() {
            return "LongForm";
        }
    }

    /* renamed from: o.xf6$d */
    public static final class C18142d extends xf6 {

        /* renamed from: c */
        public static final C18142d f53693c = new C18142d();

        /* renamed from: d */
        public static final String f53694d = "neural";

        public C18142d() {
            super(null);
        }

        @Override // p001o.xf6
        /* renamed from: a */
        public String mo56209a() {
            return f53694d;
        }

        public String toString() {
            return "Neural";
        }
    }

    /* renamed from: o.xf6$e */
    public static final class C18143e extends xf6 {

        /* renamed from: c */
        public final String f53695c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18143e(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f53695c = str;
        }

        @Override // p001o.xf6
        /* renamed from: a */
        public String mo56209a() {
            return this.f53695c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18143e) && sq8.m48644c(this.f53695c, ((C18143e) obj).f53695c);
        }

        public int hashCode() {
            return this.f53695c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo56209a() + ')';
        }
    }

    /* renamed from: o.xf6$f */
    public static final class C18144f extends xf6 {

        /* renamed from: c */
        public static final C18144f f53696c = new C18144f();

        /* renamed from: d */
        public static final String f53697d = "standard";

        public C18144f() {
            super(null);
        }

        @Override // p001o.xf6
        /* renamed from: a */
        public String mo56209a() {
            return f53697d;
        }

        public String toString() {
            return "Standard";
        }
    }

    public xf6() {
    }

    public /* synthetic */ xf6(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo56209a();
}
