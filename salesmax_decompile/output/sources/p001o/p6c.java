package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class p6c {

    /* renamed from: a */
    public static final C15968a f39402a = new C15968a(null);

    /* renamed from: b */
    public static final List f39403b = ch3.m21249n(C15969b.f39404c, C15970c.f39406c, C15971d.f39408c, C15972e.f39410c, C15973f.f39412c, C15974g.f39414c, C15975h.f39416c, C15976i.f39418c, C15978k.f39421c, C15979l.f39423c, C15980m.f39425c);

    /* renamed from: o.p6c$a */
    public static final class C15968a {
        public C15968a() {
        }

        public /* synthetic */ C15968a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final p6c m43006a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1400230653:
                    if (str.equals("EXPRESS_ONEZONE")) {
                        return C15970c.f39406c;
                    }
                    break;
                case -1285524091:
                    if (str.equals("ONEZONE_IA")) {
                        return C15974g.f39414c;
                    }
                    break;
                case -456762289:
                    if (str.equals("DEEP_ARCHIVE")) {
                        return C15969b.f39404c;
                    }
                    break;
                case 2550147:
                    if (str.equals("SNOW")) {
                        return C15978k.f39421c;
                    }
                    break;
                case 246938206:
                    if (str.equals("REDUCED_REDUNDANCY")) {
                        return C15976i.f39418c;
                    }
                    break;
                case 826164623:
                    if (str.equals("GLACIER")) {
                        return C15971d.f39408c;
                    }
                    break;
                case 852630853:
                    if (str.equals("OUTPOSTS")) {
                        return C15975h.f39416c;
                    }
                    break;
                case 988907994:
                    if (str.equals("STANDARD_IA")) {
                        return C15980m.f39425c;
                    }
                    break;
                case 1305227448:
                    if (str.equals("INTELLIGENT_TIERING")) {
                        return C15973f.f39412c;
                    }
                    break;
                case 2095255229:
                    if (str.equals("STANDARD")) {
                        return C15979l.f39423c;
                    }
                    break;
                case 2107771353:
                    if (str.equals("GLACIER_IR")) {
                        return C15972e.f39410c;
                    }
                    break;
            }
            return new C15977j(str);
        }
    }

    /* renamed from: o.p6c$b */
    public static final class C15969b extends p6c {

        /* renamed from: c */
        public static final C15969b f39404c = new C15969b();

        /* renamed from: d */
        public static final String f39405d = "DEEP_ARCHIVE";

        public C15969b() {
            super(null);
        }

        public String toString() {
            return "DeepArchive";
        }
    }

    /* renamed from: o.p6c$c */
    public static final class C15970c extends p6c {

        /* renamed from: c */
        public static final C15970c f39406c = new C15970c();

        /* renamed from: d */
        public static final String f39407d = "EXPRESS_ONEZONE";

        public C15970c() {
            super(null);
        }

        public String toString() {
            return "ExpressOnezone";
        }
    }

    /* renamed from: o.p6c$d */
    public static final class C15971d extends p6c {

        /* renamed from: c */
        public static final C15971d f39408c = new C15971d();

        /* renamed from: d */
        public static final String f39409d = "GLACIER";

        public C15971d() {
            super(null);
        }

        public String toString() {
            return "Glacier";
        }
    }

    /* renamed from: o.p6c$e */
    public static final class C15972e extends p6c {

        /* renamed from: c */
        public static final C15972e f39410c = new C15972e();

        /* renamed from: d */
        public static final String f39411d = "GLACIER_IR";

        public C15972e() {
            super(null);
        }

        public String toString() {
            return "GlacierIr";
        }
    }

    /* renamed from: o.p6c$f */
    public static final class C15973f extends p6c {

        /* renamed from: c */
        public static final C15973f f39412c = new C15973f();

        /* renamed from: d */
        public static final String f39413d = "INTELLIGENT_TIERING";

        public C15973f() {
            super(null);
        }

        public String toString() {
            return "IntelligentTiering";
        }
    }

    /* renamed from: o.p6c$g */
    public static final class C15974g extends p6c {

        /* renamed from: c */
        public static final C15974g f39414c = new C15974g();

        /* renamed from: d */
        public static final String f39415d = "ONEZONE_IA";

        public C15974g() {
            super(null);
        }

        public String toString() {
            return "OnezoneIa";
        }
    }

    /* renamed from: o.p6c$h */
    public static final class C15975h extends p6c {

        /* renamed from: c */
        public static final C15975h f39416c = new C15975h();

        /* renamed from: d */
        public static final String f39417d = "OUTPOSTS";

        public C15975h() {
            super(null);
        }

        public String toString() {
            return "Outposts";
        }
    }

    /* renamed from: o.p6c$i */
    public static final class C15976i extends p6c {

        /* renamed from: c */
        public static final C15976i f39418c = new C15976i();

        /* renamed from: d */
        public static final String f39419d = "REDUCED_REDUNDANCY";

        public C15976i() {
            super(null);
        }

        public String toString() {
            return "ReducedRedundancy";
        }
    }

    /* renamed from: o.p6c$j */
    public static final class C15977j extends p6c {

        /* renamed from: c */
        public final String f39420c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15977j(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f39420c = str;
        }

        /* renamed from: a */
        public String m43007a() {
            return this.f39420c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15977j) && sq8.m48644c(this.f39420c, ((C15977j) obj).f39420c);
        }

        public int hashCode() {
            return this.f39420c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m43007a() + ')';
        }
    }

    /* renamed from: o.p6c$k */
    public static final class C15978k extends p6c {

        /* renamed from: c */
        public static final C15978k f39421c = new C15978k();

        /* renamed from: d */
        public static final String f39422d = "SNOW";

        public C15978k() {
            super(null);
        }

        public String toString() {
            return "Snow";
        }
    }

    /* renamed from: o.p6c$l */
    public static final class C15979l extends p6c {

        /* renamed from: c */
        public static final C15979l f39423c = new C15979l();

        /* renamed from: d */
        public static final String f39424d = "STANDARD";

        public C15979l() {
            super(null);
        }

        public String toString() {
            return "Standard";
        }
    }

    /* renamed from: o.p6c$m */
    public static final class C15980m extends p6c {

        /* renamed from: c */
        public static final C15980m f39425c = new C15980m();

        /* renamed from: d */
        public static final String f39426d = "STANDARD_IA";

        public C15980m() {
            super(null);
        }

        public String toString() {
            return "StandardIa";
        }
    }

    public p6c() {
    }

    public /* synthetic */ p6c(id5 id5Var) {
        this();
    }
}
