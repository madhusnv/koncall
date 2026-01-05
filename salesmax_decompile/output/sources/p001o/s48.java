package p001o;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaTrack;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class s48 {

    /* renamed from: a */
    public final int f44798a;

    /* renamed from: b */
    public final String f44799b;

    /* renamed from: c */
    public static final C16740b f44774c = new C16740b(null);

    /* renamed from: d */
    public static final s48 f44775d = new s48(100, "Continue");

    /* renamed from: e */
    public static final s48 f44776e = new s48(101, "Switching Protocols");

    /* renamed from: f */
    public static final s48 f44777f = new s48(102, "Processing");

    /* renamed from: g */
    public static final s48 f44778g = new s48(200, "OK");

    /* renamed from: h */
    public static final s48 f44779h = new s48(201, "Created");

    /* renamed from: i */
    public static final s48 f44780i = new s48(202, "Accepted");

    /* renamed from: j */
    public static final s48 f44781j = new s48(203, "Non-Authoritative Information");

    /* renamed from: k */
    public static final s48 f44782k = new s48(204, "No Content");

    /* renamed from: l */
    public static final s48 f44783l = new s48(HttpStatus.SC_RESET_CONTENT, "Reset Content");

    /* renamed from: m */
    public static final s48 f44784m = new s48(HttpStatus.SC_PARTIAL_CONTENT, "Partial Content");

    /* renamed from: n */
    public static final s48 f44785n = new s48(HttpStatus.SC_MULTI_STATUS, "Multi-Status");

    /* renamed from: o */
    public static final s48 f44786o = new s48(300, "Multiple Choices");

    /* renamed from: p */
    public static final s48 f44787p = new s48(301, "Moved Permanently");

    /* renamed from: q */
    public static final s48 f44788q = new s48(302, "Found");

    /* renamed from: r */
    public static final s48 f44789r = new s48(303, "See Other");

    /* renamed from: s */
    public static final s48 f44790s = new s48(304, "Not Modified");

    /* renamed from: t */
    public static final s48 f44791t = new s48(HttpStatus.SC_USE_PROXY, "Use Proxy");

    /* renamed from: u */
    public static final s48 f44792u = new s48(307, "Temporary Redirect");

    /* renamed from: v */
    public static final s48 f44793v = new s48(DefaultRedirectStrategy.SC_PERMANENT_REDIRECT, "Permanent Redirect");

    /* renamed from: w */
    public static final s48 f44794w = new s48(400, "Bad Request");

    /* renamed from: x */
    public static final s48 f44795x = new s48(401, "Unauthorized");

    /* renamed from: y */
    public static final s48 f44796y = new s48(402, "Payment Required");

    /* renamed from: z */
    public static final s48 f44797z = new s48(403, "Forbidden");

    /* renamed from: A */
    public static final s48 f44748A = new s48(404, "Not Found");

    /* renamed from: B */
    public static final s48 f44749B = new s48(405, "Method Not Allowed");

    /* renamed from: C */
    public static final s48 f44750C = new s48(406, "Not Acceptable");

    /* renamed from: D */
    public static final s48 f44751D = new s48(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, "Proxy Authentication Required");

    /* renamed from: E */
    public static final s48 f44752E = new s48(HttpStatus.SC_REQUEST_TIMEOUT, "Request Timeout");

    /* renamed from: F */
    public static final s48 f44753F = new s48(409, "Conflict");

    /* renamed from: G */
    public static final s48 f44754G = new s48(410, "Gone");

    /* renamed from: H */
    public static final s48 f44755H = new s48(411, "Length Required");

    /* renamed from: I */
    public static final s48 f44756I = new s48(412, "Precondition Failed");

    /* renamed from: J */
    public static final s48 f44757J = new s48(413, "Payload Too Large");

    /* renamed from: K */
    public static final s48 f44758K = new s48(HttpStatus.SC_REQUEST_URI_TOO_LONG, "Request-URI Too Long");

    /* renamed from: L */
    public static final s48 f44759L = new s48(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "Unsupported Media Type");

    /* renamed from: M */
    public static final s48 f44760M = new s48(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "Requested Range Not Satisfiable");

    /* renamed from: N */
    public static final s48 f44761N = new s48(HttpStatus.SC_EXPECTATION_FAILED, "Expectation Failed");

    /* renamed from: O */
    public static final s48 f44762O = new s48(422, "Unprocessable Entity");

    /* renamed from: P */
    public static final s48 f44763P = new s48(423, "Locked");

    /* renamed from: Q */
    public static final s48 f44764Q = new s48(HttpStatus.SC_FAILED_DEPENDENCY, "Failed Dependency");

    /* renamed from: R */
    public static final s48 f44765R = new s48(425, "Too Early");

    /* renamed from: S */
    public static final s48 f44766S = new s48(426, "Upgrade Required");

    /* renamed from: T */
    public static final s48 f44767T = new s48(428, "Precondition Required");

    /* renamed from: U */
    public static final s48 f44768U = new s48(429, "Too Many Requests");

    /* renamed from: V */
    public static final s48 f44769V = new s48(MediaError.DetailedErrorCode.SMOOTH_MANIFEST, "Request Header Fields Too Large");

    /* renamed from: W */
    public static final s48 f44770W = new s48(451, "Unavailable For Legal Reason");

    /* renamed from: X */
    public static final s48 f44771X = new s48(500, "Internal Server Error");

    /* renamed from: Y */
    public static final s48 f44772Y = new s48(HttpStatus.SC_NOT_IMPLEMENTED, "Not Implemented");

    /* renamed from: Z */
    public static final s48 f44773Z = new s48(502, "Bad Gateway");
    public static final s48 a0 = new s48(503, "Service Unavailable");
    public static final s48 b0 = new s48(HttpStatus.SC_GATEWAY_TIMEOUT, "Gateway Timeout");
    public static final s48 c0 = new s48(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, "HTTP Version Not Supported");
    public static final s48 d0 = new s48(506, "Variant Also Negotiates");
    public static final s48 e0 = new s48(HttpStatus.SC_INSUFFICIENT_STORAGE, "Insufficient Storage");
    public static final s48 f0 = new s48(508, "Loop Detected");
    public static final s48 g0 = new s48(510, "Not Extended");
    public static final s48 h0 = new s48(511, "Network Authentication Required");
    public static final Map i0 = t48.m49283d();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.s48$a */
    public static final class EnumC16739a implements Comparable, xb3 {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC16739a[] $VALUES;
        public static final a Companion;
        private final kl8 range;
        public static final EnumC16739a INFORMATION = new EnumC16739a("INFORMATION", 0, new kl8(100, Opcodes.IFNONNULL));
        public static final EnumC16739a SUCCESS = new EnumC16739a("SUCCESS", 1, new kl8(200, 299));
        public static final EnumC16739a REDIRECT = new EnumC16739a("REDIRECT", 2, new kl8(300, 399));
        public static final EnumC16739a CLIENT_ERROR = new EnumC16739a("CLIENT_ERROR", 3, new kl8(400, 499));
        public static final EnumC16739a SERVER_ERROR = new EnumC16739a("SERVER_ERROR", 4, new kl8(500, 599));

        /* renamed from: o.s48$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final EnumC16739a m47768a(int i) {
                EnumC16739a enumC16739a;
                EnumC16739a[] enumC16739aArrValues = EnumC16739a.values();
                int length = enumC16739aArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        enumC16739a = null;
                        break;
                    }
                    enumC16739a = enumC16739aArrValues[i2];
                    kl8 kl8Var = enumC16739a.range;
                    if (i <= kl8Var.m32261j() && kl8Var.m32260e() <= i) {
                        break;
                    }
                    i2++;
                }
                if (enumC16739a != null) {
                    return enumC16739a;
                }
                throw new IllegalStateException(("Invalid HTTP code " + i).toString());
            }
        }

        private static final /* synthetic */ EnumC16739a[] $values() {
            return new EnumC16739a[]{INFORMATION, SUCCESS, REDIRECT, CLIENT_ERROR, SERVER_ERROR};
        }

        static {
            EnumC16739a[] enumC16739aArr$values = $values();
            $VALUES = enumC16739aArr$values;
            $ENTRIES = hi6.m30609a(enumC16739aArr$values);
            Companion = new a(null);
        }

        private EnumC16739a(String str, int i, kl8 kl8Var) {
            this.range = kl8Var;
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC16739a valueOf(String str) {
            return (EnumC16739a) Enum.valueOf(EnumC16739a.class, str);
        }

        public static EnumC16739a[] values() {
            return (EnumC16739a[]) $VALUES.clone();
        }

        public boolean contains(int i) {
            return this.range.m35829r(i);
        }

        @Override // p001o.xb3
        public Integer getEndInclusive() {
            return this.range.getEndInclusive();
        }

        @Override // p001o.xb3
        public Integer getStart() {
            return this.range.getStart();
        }

        @Override // p001o.xb3
        public boolean isEmpty() {
            return this.range.isEmpty();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
            return contains(((Number) comparable).intValue());
        }
    }

    /* renamed from: o.s48$b */
    public static final class C16740b {
        public C16740b() {
        }

        public /* synthetic */ C16740b(id5 id5Var) {
            this();
        }

        /* renamed from: A */
        public final s48 m47769A() {
            return s48.g0;
        }

        /* renamed from: B */
        public final s48 m47770B() {
            return s48.f44748A;
        }

        /* renamed from: C */
        public final s48 m47771C() {
            return s48.f44772Y;
        }

        /* renamed from: D */
        public final s48 m47772D() {
            return s48.f44790s;
        }

        /* renamed from: E */
        public final s48 m47773E() {
            return s48.f44778g;
        }

        /* renamed from: F */
        public final s48 m47774F() {
            return s48.f44784m;
        }

        /* renamed from: G */
        public final s48 m47775G() {
            return s48.f44757J;
        }

        /* renamed from: H */
        public final s48 m47776H() {
            return s48.f44796y;
        }

        /* renamed from: I */
        public final s48 m47777I() {
            return s48.f44793v;
        }

        /* renamed from: J */
        public final s48 m47778J() {
            return s48.f44756I;
        }

        /* renamed from: K */
        public final s48 m47779K() {
            return s48.f44767T;
        }

        /* renamed from: L */
        public final s48 m47780L() {
            return s48.f44777f;
        }

        /* renamed from: M */
        public final s48 m47781M() {
            return s48.f44751D;
        }

        /* renamed from: N */
        public final s48 m47782N() {
            return s48.f44769V;
        }

        /* renamed from: O */
        public final s48 m47783O() {
            return s48.f44752E;
        }

        /* renamed from: P */
        public final s48 m47784P() {
            return s48.f44758K;
        }

        /* renamed from: Q */
        public final s48 m47785Q() {
            return s48.f44760M;
        }

        /* renamed from: R */
        public final s48 m47786R() {
            return s48.f44783l;
        }

        /* renamed from: S */
        public final s48 m47787S() {
            return s48.f44789r;
        }

        /* renamed from: T */
        public final s48 m47788T() {
            return s48.a0;
        }

        /* renamed from: U */
        public final s48 m47789U() {
            return s48.f44776e;
        }

        /* renamed from: V */
        public final s48 m47790V() {
            return s48.f44792u;
        }

        /* renamed from: W */
        public final s48 m47791W() {
            return s48.f44765R;
        }

        /* renamed from: X */
        public final s48 m47792X() {
            return s48.f44768U;
        }

        /* renamed from: Y */
        public final s48 m47793Y() {
            return s48.f44795x;
        }

        /* renamed from: Z */
        public final s48 m47794Z() {
            return s48.f44770W;
        }

        /* renamed from: a */
        public final s48 m47795a(int i) {
            s48 s48Var = (s48) s48.i0.get(Integer.valueOf(i));
            return s48Var == null ? new s48(i, "Unknown HttpStatusCode") : s48Var;
        }

        public final s48 a0() {
            return s48.f44762O;
        }

        /* renamed from: b */
        public final s48 m47796b() {
            return s48.f44780i;
        }

        public final s48 b0() {
            return s48.f44759L;
        }

        /* renamed from: c */
        public final s48 m47797c() {
            return s48.f44773Z;
        }

        public final s48 c0() {
            return s48.f44766S;
        }

        /* renamed from: d */
        public final s48 m47798d() {
            return s48.f44794w;
        }

        public final s48 d0() {
            return s48.f44791t;
        }

        /* renamed from: e */
        public final s48 m47799e() {
            return s48.f44753F;
        }

        public final s48 e0() {
            return s48.d0;
        }

        /* renamed from: f */
        public final s48 m47800f() {
            return s48.f44775d;
        }

        public final s48 f0() {
            return s48.c0;
        }

        /* renamed from: g */
        public final s48 m47801g() {
            return s48.f44779h;
        }

        /* renamed from: h */
        public final s48 m47802h() {
            return s48.f44761N;
        }

        /* renamed from: i */
        public final s48 m47803i() {
            return s48.f44764Q;
        }

        /* renamed from: j */
        public final s48 m47804j() {
            return s48.f44797z;
        }

        /* renamed from: k */
        public final s48 m47805k() {
            return s48.f44788q;
        }

        /* renamed from: l */
        public final s48 m47806l() {
            return s48.b0;
        }

        /* renamed from: m */
        public final s48 m47807m() {
            return s48.f44754G;
        }

        /* renamed from: n */
        public final s48 m47808n() {
            return s48.e0;
        }

        /* renamed from: o */
        public final s48 m47809o() {
            return s48.f44771X;
        }

        /* renamed from: p */
        public final s48 m47810p() {
            return s48.f44755H;
        }

        /* renamed from: q */
        public final s48 m47811q() {
            return s48.f44763P;
        }

        /* renamed from: r */
        public final s48 m47812r() {
            return s48.f0;
        }

        /* renamed from: s */
        public final s48 m47813s() {
            return s48.f44749B;
        }

        /* renamed from: t */
        public final s48 m47814t() {
            return s48.f44787p;
        }

        /* renamed from: u */
        public final s48 m47815u() {
            return s48.f44785n;
        }

        /* renamed from: v */
        public final s48 m47816v() {
            return s48.f44786o;
        }

        /* renamed from: w */
        public final s48 m47817w() {
            return s48.h0;
        }

        /* renamed from: x */
        public final s48 m47818x() {
            return s48.f44782k;
        }

        /* renamed from: y */
        public final s48 m47819y() {
            return s48.f44781j;
        }

        /* renamed from: z */
        public final s48 m47820z() {
            return s48.f44750C;
        }
    }

    public s48(int i, String str) {
        sq8.m48649h(str, MediaTrack.ROLE_DESCRIPTION);
        this.f44798a = i;
        this.f44799b = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s48) && ((s48) obj).f44798a == this.f44798a;
    }

    public final String g0() {
        return this.f44799b;
    }

    public final int h0() {
        return this.f44798a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f44798a);
    }

    public String toString() {
        return this.f44798a + ": " + this.f44799b;
    }
}
