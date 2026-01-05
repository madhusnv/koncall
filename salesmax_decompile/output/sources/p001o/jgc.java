package p001o;

import com.google.android.gms.cast.HlsSegmentFormat;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class jgc {

    /* renamed from: a */
    public static final C14538a f30395a = new C14538a(null);

    /* renamed from: b */
    public static final List f30396b = ch3.m21249n(C14539b.f30397c, C14540c.f30399c, C14541d.f30401c, C14542e.f30403c);

    /* renamed from: o.jgc$a */
    public static final class C14538a {
        public C14538a() {
        }

        public /* synthetic */ C14538a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final jgc m33801a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -803792317:
                    if (str.equals("ogg_vorbis")) {
                        return C14541d.f30401c;
                    }
                    break;
                case 108272:
                    if (str.equals(HlsSegmentFormat.MP3)) {
                        return C14540c.f30399c;
                    }
                    break;
                case 110810:
                    if (str.equals("pcm")) {
                        return C14542e.f30403c;
                    }
                    break;
                case 3271912:
                    if (str.equals("json")) {
                        return C14539b.f30397c;
                    }
                    break;
            }
            return new C14543f(str);
        }
    }

    /* renamed from: o.jgc$b */
    public static final class C14539b extends jgc {

        /* renamed from: c */
        public static final C14539b f30397c = new C14539b();

        /* renamed from: d */
        public static final String f30398d = "json";

        public C14539b() {
            super(null);
        }

        @Override // p001o.jgc
        /* renamed from: a */
        public String mo33800a() {
            return f30398d;
        }

        public String toString() {
            return "Json";
        }
    }

    /* renamed from: o.jgc$c */
    public static final class C14540c extends jgc {

        /* renamed from: c */
        public static final C14540c f30399c = new C14540c();

        /* renamed from: d */
        public static final String f30400d = HlsSegmentFormat.MP3;

        public C14540c() {
            super(null);
        }

        @Override // p001o.jgc
        /* renamed from: a */
        public String mo33800a() {
            return f30400d;
        }

        public String toString() {
            return "Mp3";
        }
    }

    /* renamed from: o.jgc$d */
    public static final class C14541d extends jgc {

        /* renamed from: c */
        public static final C14541d f30401c = new C14541d();

        /* renamed from: d */
        public static final String f30402d = "ogg_vorbis";

        public C14541d() {
            super(null);
        }

        @Override // p001o.jgc
        /* renamed from: a */
        public String mo33800a() {
            return f30402d;
        }

        public String toString() {
            return "OggVorbis";
        }
    }

    /* renamed from: o.jgc$e */
    public static final class C14542e extends jgc {

        /* renamed from: c */
        public static final C14542e f30403c = new C14542e();

        /* renamed from: d */
        public static final String f30404d = "pcm";

        public C14542e() {
            super(null);
        }

        @Override // p001o.jgc
        /* renamed from: a */
        public String mo33800a() {
            return f30404d;
        }

        public String toString() {
            return "Pcm";
        }
    }

    /* renamed from: o.jgc$f */
    public static final class C14543f extends jgc {

        /* renamed from: c */
        public final String f30405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14543f(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f30405c = str;
        }

        @Override // p001o.jgc
        /* renamed from: a */
        public String mo33800a() {
            return this.f30405c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14543f) && sq8.m48644c(this.f30405c, ((C14543f) obj).f30405c);
        }

        public int hashCode() {
            return this.f30405c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo33800a() + ')';
        }
    }

    public jgc() {
    }

    public /* synthetic */ jgc(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo33800a();
}
