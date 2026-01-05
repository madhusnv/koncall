package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class h6g {

    /* renamed from: a */
    public static final C13867a f26258a = new C13867a(null);

    /* renamed from: b */
    public static final List f26259b = ch3.m21249n(C13868b.f26260c, C13869c.f26262c, C13870d.f26264c, C13871e.f26266c, C13872f.f26268c, C13873g.f26270c, C13874h.f26272c, C13875i.f26274c, C13877k.f26277c, C13878l.f26279c, C13879m.f26281c);

    /* renamed from: o.h6g$a */
    public static final class C13867a {
        public C13867a() {
        }

        public /* synthetic */ C13867a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final h6g m29845a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1400230653:
                    if (str.equals("EXPRESS_ONEZONE")) {
                        return C13869c.f26262c;
                    }
                    break;
                case -1285524091:
                    if (str.equals("ONEZONE_IA")) {
                        return C13873g.f26270c;
                    }
                    break;
                case -456762289:
                    if (str.equals("DEEP_ARCHIVE")) {
                        return C13868b.f26260c;
                    }
                    break;
                case 2550147:
                    if (str.equals("SNOW")) {
                        return C13877k.f26277c;
                    }
                    break;
                case 246938206:
                    if (str.equals("REDUCED_REDUNDANCY")) {
                        return C13875i.f26274c;
                    }
                    break;
                case 826164623:
                    if (str.equals("GLACIER")) {
                        return C13870d.f26264c;
                    }
                    break;
                case 852630853:
                    if (str.equals("OUTPOSTS")) {
                        return C13874h.f26272c;
                    }
                    break;
                case 988907994:
                    if (str.equals("STANDARD_IA")) {
                        return C13879m.f26281c;
                    }
                    break;
                case 1305227448:
                    if (str.equals("INTELLIGENT_TIERING")) {
                        return C13872f.f26268c;
                    }
                    break;
                case 2095255229:
                    if (str.equals("STANDARD")) {
                        return C13878l.f26279c;
                    }
                    break;
                case 2107771353:
                    if (str.equals("GLACIER_IR")) {
                        return C13871e.f26266c;
                    }
                    break;
            }
            return new C13876j(str);
        }
    }

    /* renamed from: o.h6g$b */
    public static final class C13868b extends h6g {

        /* renamed from: c */
        public static final C13868b f26260c = new C13868b();

        /* renamed from: d */
        public static final String f26261d = "DEEP_ARCHIVE";

        public C13868b() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26261d;
        }

        public String toString() {
            return "DeepArchive";
        }
    }

    /* renamed from: o.h6g$c */
    public static final class C13869c extends h6g {

        /* renamed from: c */
        public static final C13869c f26262c = new C13869c();

        /* renamed from: d */
        public static final String f26263d = "EXPRESS_ONEZONE";

        public C13869c() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26263d;
        }

        public String toString() {
            return "ExpressOnezone";
        }
    }

    /* renamed from: o.h6g$d */
    public static final class C13870d extends h6g {

        /* renamed from: c */
        public static final C13870d f26264c = new C13870d();

        /* renamed from: d */
        public static final String f26265d = "GLACIER";

        public C13870d() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26265d;
        }

        public String toString() {
            return "Glacier";
        }
    }

    /* renamed from: o.h6g$e */
    public static final class C13871e extends h6g {

        /* renamed from: c */
        public static final C13871e f26266c = new C13871e();

        /* renamed from: d */
        public static final String f26267d = "GLACIER_IR";

        public C13871e() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26267d;
        }

        public String toString() {
            return "GlacierIr";
        }
    }

    /* renamed from: o.h6g$f */
    public static final class C13872f extends h6g {

        /* renamed from: c */
        public static final C13872f f26268c = new C13872f();

        /* renamed from: d */
        public static final String f26269d = "INTELLIGENT_TIERING";

        public C13872f() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26269d;
        }

        public String toString() {
            return "IntelligentTiering";
        }
    }

    /* renamed from: o.h6g$g */
    public static final class C13873g extends h6g {

        /* renamed from: c */
        public static final C13873g f26270c = new C13873g();

        /* renamed from: d */
        public static final String f26271d = "ONEZONE_IA";

        public C13873g() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26271d;
        }

        public String toString() {
            return "OnezoneIa";
        }
    }

    /* renamed from: o.h6g$h */
    public static final class C13874h extends h6g {

        /* renamed from: c */
        public static final C13874h f26272c = new C13874h();

        /* renamed from: d */
        public static final String f26273d = "OUTPOSTS";

        public C13874h() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26273d;
        }

        public String toString() {
            return "Outposts";
        }
    }

    /* renamed from: o.h6g$i */
    public static final class C13875i extends h6g {

        /* renamed from: c */
        public static final C13875i f26274c = new C13875i();

        /* renamed from: d */
        public static final String f26275d = "REDUCED_REDUNDANCY";

        public C13875i() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26275d;
        }

        public String toString() {
            return "ReducedRedundancy";
        }
    }

    /* renamed from: o.h6g$j */
    public static final class C13876j extends h6g {

        /* renamed from: c */
        public final String f26276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13876j(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f26276c = str;
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return this.f26276c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13876j) && sq8.m48644c(this.f26276c, ((C13876j) obj).f26276c);
        }

        public int hashCode() {
            return this.f26276c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo29844a() + ')';
        }
    }

    /* renamed from: o.h6g$k */
    public static final class C13877k extends h6g {

        /* renamed from: c */
        public static final C13877k f26277c = new C13877k();

        /* renamed from: d */
        public static final String f26278d = "SNOW";

        public C13877k() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26278d;
        }

        public String toString() {
            return "Snow";
        }
    }

    /* renamed from: o.h6g$l */
    public static final class C13878l extends h6g {

        /* renamed from: c */
        public static final C13878l f26279c = new C13878l();

        /* renamed from: d */
        public static final String f26280d = "STANDARD";

        public C13878l() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26280d;
        }

        public String toString() {
            return "Standard";
        }
    }

    /* renamed from: o.h6g$m */
    public static final class C13879m extends h6g {

        /* renamed from: c */
        public static final C13879m f26281c = new C13879m();

        /* renamed from: d */
        public static final String f26282d = "STANDARD_IA";

        public C13879m() {
            super(null);
        }

        @Override // p001o.h6g
        /* renamed from: a */
        public String mo29844a() {
            return f26282d;
        }

        public String toString() {
            return "StandardIa";
        }
    }

    public h6g() {
    }

    public /* synthetic */ h6g(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo29844a();
}
