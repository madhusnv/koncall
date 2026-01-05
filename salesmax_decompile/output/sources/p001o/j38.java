package p001o;

import org.apache.http.HttpHeaders;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public class j38 extends ul1 {

    /* renamed from: A */
    public static final sl1 f29673A;

    /* renamed from: B */
    public static final sl1 f29674B;

    /* renamed from: C */
    public static final sl1 f29675C;

    /* renamed from: D */
    public static final sl1 f29676D;

    /* renamed from: E */
    public static final sl1 f29677E;

    /* renamed from: F */
    public static final sl1 f29678F;

    /* renamed from: G */
    public static final sl1 f29679G;

    /* renamed from: H */
    public static final sl1 f29680H;

    /* renamed from: I */
    public static final sl1 f29681I;

    /* renamed from: J */
    public static final sl1 f29682J;

    /* renamed from: K */
    public static final sl1 f29683K;

    /* renamed from: L */
    public static final sl1 f29684L;

    /* renamed from: M */
    public static final sl1 f29685M;

    /* renamed from: N */
    public static final sl1 f29686N;

    /* renamed from: O */
    public static final sl1 f29687O;

    /* renamed from: P */
    public static final sl1 f29688P;

    /* renamed from: Q */
    public static final sl1 f29689Q;

    /* renamed from: R */
    public static final sl1 f29690R;

    /* renamed from: S */
    public static final sl1 f29691S;

    /* renamed from: T */
    public static final sl1 f29692T;

    /* renamed from: U */
    public static final sl1 f29693U;

    /* renamed from: V */
    public static final sl1 f29694V;

    /* renamed from: W */
    public static final sl1 f29695W;

    /* renamed from: X */
    public static final sl1 f29696X;

    /* renamed from: Y */
    public static final sl1 f29697Y;

    /* renamed from: Z */
    public static final sl1 f29698Z;
    public static final sl1 a0;
    public static final sl1 b0;
    public static final sl1 c0;

    /* renamed from: d */
    public static final j38 f29699d;
    public static final sl1 d0;

    /* renamed from: e */
    public static final sl1 f29700e;
    public static final sl1 e0;

    /* renamed from: f */
    public static final sl1 f29701f;
    public static final sl1 f0;

    /* renamed from: g */
    public static final sl1 f29702g;
    public static final sl1 g0;

    /* renamed from: h */
    public static final sl1 f29703h;
    public static final sl1 h0;

    /* renamed from: i */
    public static final sl1 f29704i;
    public static final sl1 i0;

    /* renamed from: j */
    public static final sl1 f29705j;
    public static final sl1 j0;

    /* renamed from: k */
    public static final sl1 f29706k;

    /* renamed from: l */
    public static final sl1 f29707l;

    /* renamed from: m */
    public static final sl1 f29708m;

    /* renamed from: n */
    public static final sl1 f29709n;

    /* renamed from: o */
    public static final sl1 f29710o;

    /* renamed from: p */
    public static final sl1 f29711p;

    /* renamed from: q */
    public static final sl1 f29712q;

    /* renamed from: r */
    public static final sl1 f29713r;

    /* renamed from: s */
    public static final sl1 f29714s;

    /* renamed from: t */
    public static final sl1 f29715t;

    /* renamed from: u */
    public static final sl1 f29716u;

    /* renamed from: v */
    public static final sl1 f29717v;

    /* renamed from: w */
    public static final sl1 f29718w;

    /* renamed from: x */
    public static final sl1 f29719x;

    /* renamed from: y */
    public static final sl1 f29720y;

    /* renamed from: z */
    public static final sl1 f29721z;

    static {
        j38 j38Var = new j38();
        f29699d = j38Var;
        f29700e = j38Var.m51689a("Host", 27);
        f29701f = j38Var.m51689a("Accept", 19);
        f29702g = j38Var.m51689a(HttpHeaders.ACCEPT_CHARSET, 20);
        f29703h = j38Var.m51689a(HttpHeaders.ACCEPT_ENCODING, 21);
        f29704i = j38Var.m51689a(HttpHeaders.ACCEPT_LANGUAGE, 22);
        f29705j = j38Var.m51689a("Content-Length", 12);
        f29706k = j38Var.m51689a("Connection", 1);
        f29707l = j38Var.m51689a("Cache-Control", 57);
        f29708m = j38Var.m51689a("Date", 2);
        f29709n = j38Var.m51689a(HttpHeaders.PRAGMA, 3);
        f29710o = j38Var.m51689a(HttpHeaders.TRAILER, 4);
        f29711p = j38Var.m51689a("Transfer-Encoding", 5);
        f29712q = j38Var.m51689a(HttpHeaders.UPGRADE, 6);
        f29713r = j38Var.m51689a(HttpHeaders.VIA, 7);
        f29714s = j38Var.m51689a(HttpHeaders.WARNING, 8);
        f29715t = j38Var.m51689a("Allow", 9);
        f29716u = j38Var.m51689a("Content-Encoding", 10);
        f29717v = j38Var.m51689a(HttpHeaders.CONTENT_LANGUAGE, 11);
        f29718w = j38Var.m51689a(HttpHeaders.CONTENT_LOCATION, 13);
        f29719x = j38Var.m51689a("Content-MD5", 14);
        f29720y = j38Var.m51689a(HttpHeaders.CONTENT_RANGE, 15);
        f29721z = j38Var.m51689a("Content-Type", 16);
        f29673A = j38Var.m51689a(HttpHeaders.EXPIRES, 17);
        f29674B = j38Var.m51689a(HttpHeaders.LAST_MODIFIED, 18);
        f29675C = j38Var.m51689a("Authorization", 23);
        f29676D = j38Var.m51689a("Expect", 24);
        f29677E = j38Var.m51689a("Forwarded", 25);
        f29678F = j38Var.m51689a(HttpHeaders.FROM, 26);
        f29679G = j38Var.m51689a(HttpHeaders.IF_MATCH, 28);
        f29680H = j38Var.m51689a(HttpHeaders.IF_MODIFIED_SINCE, 29);
        f29681I = j38Var.m51689a(HttpHeaders.IF_NONE_MATCH, 30);
        f29682J = j38Var.m51689a(HttpHeaders.IF_RANGE, 31);
        f29683K = j38Var.m51689a(HttpHeaders.IF_UNMODIFIED_SINCE, 32);
        f29684L = j38Var.m51689a(HTTP.CONN_KEEP_ALIVE, 33);
        f29685M = j38Var.m51689a(HttpHeaders.MAX_FORWARDS, 34);
        f29686N = j38Var.m51689a("Proxy-Authorization", 35);
        f29687O = j38Var.m51689a(HttpHeaders.RANGE, 36);
        f29688P = j38Var.m51689a("Request-Range", 37);
        f29689Q = j38Var.m51689a(HttpHeaders.REFERER, 38);
        f29690R = j38Var.m51689a(HttpHeaders.TE, 39);
        f29691S = j38Var.m51689a("User-Agent", 40);
        f29692T = j38Var.m51689a("X-Forwarded-For", 41);
        f29693U = j38Var.m51689a(HttpHeaders.ACCEPT_RANGES, 42);
        f29694V = j38Var.m51689a(HttpHeaders.AGE, 43);
        f29695W = j38Var.m51689a(HttpHeaders.ETAG, 44);
        f29696X = j38Var.m51689a("Location", 45);
        f29697Y = j38Var.m51689a("Proxy-Authenticate", 46);
        f29698Z = j38Var.m51689a(HttpHeaders.RETRY_AFTER, 47);
        a0 = j38Var.m51689a("Server", 48);
        b0 = j38Var.m51689a("Servlet-Engine", 49);
        c0 = j38Var.m51689a(HttpHeaders.VARY, 50);
        d0 = j38Var.m51689a("WWW-Authenticate", 51);
        e0 = j38Var.m51689a(SM.COOKIE, 52);
        f0 = j38Var.m51689a(SM.SET_COOKIE, 53);
        g0 = j38Var.m51689a(SM.SET_COOKIE2, 54);
        h0 = j38Var.m51689a("MIME-Version", 55);
        i0 = j38Var.m51689a(HTTP.IDENTITY_CODING, 56);
        j0 = j38Var.m51689a("Proxy-Connection", 58);
    }
}
