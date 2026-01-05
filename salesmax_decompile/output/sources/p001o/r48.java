package p001o;

import com.google.android.gms.cast.MediaError;
import org.apache.http.HttpStatus;
import p001o.ul1;

/* loaded from: classes6.dex */
public abstract class r48 {

    /* renamed from: A */
    public static final sl1 f42926A;

    /* renamed from: B */
    public static final sl1 f42927B;

    /* renamed from: C */
    public static final sl1 f42928C;

    /* renamed from: D */
    public static final sl1 f42929D;

    /* renamed from: E */
    public static final sl1 f42930E;

    /* renamed from: F */
    public static final sl1 f42931F;

    /* renamed from: G */
    public static final sl1 f42932G;

    /* renamed from: H */
    public static final sl1 f42933H;

    /* renamed from: I */
    public static final sl1 f42934I;

    /* renamed from: J */
    public static final sl1 f42935J;

    /* renamed from: K */
    public static final sl1 f42936K;

    /* renamed from: L */
    public static final sl1 f42937L;

    /* renamed from: M */
    public static final sl1 f42938M;

    /* renamed from: N */
    public static final sl1 f42939N;

    /* renamed from: O */
    public static final sl1 f42940O;

    /* renamed from: P */
    public static final sl1 f42941P;

    /* renamed from: Q */
    public static final sl1 f42942Q;

    /* renamed from: R */
    public static final sl1 f42943R;

    /* renamed from: S */
    public static final sl1 f42944S;

    /* renamed from: T */
    public static final sl1 f42945T;

    /* renamed from: U */
    public static final sl1 f42946U;

    /* renamed from: V */
    public static final sl1 f42947V;

    /* renamed from: W */
    public static sl1[] f42948W;

    /* renamed from: a */
    public static final ul1 f42949a;

    /* renamed from: b */
    public static final sl1 f42950b;

    /* renamed from: c */
    public static final sl1 f42951c;

    /* renamed from: d */
    public static final sl1 f42952d;

    /* renamed from: e */
    public static final sl1 f42953e;

    /* renamed from: f */
    public static final sl1 f42954f;

    /* renamed from: g */
    public static final sl1 f42955g;

    /* renamed from: h */
    public static final sl1 f42956h;

    /* renamed from: i */
    public static final sl1 f42957i;

    /* renamed from: j */
    public static final sl1 f42958j;

    /* renamed from: k */
    public static final sl1 f42959k;

    /* renamed from: l */
    public static final sl1 f42960l;

    /* renamed from: m */
    public static final sl1 f42961m;

    /* renamed from: n */
    public static final sl1 f42962n;

    /* renamed from: o */
    public static final sl1 f42963o;

    /* renamed from: p */
    public static final sl1 f42964p;

    /* renamed from: q */
    public static final sl1 f42965q;

    /* renamed from: r */
    public static final sl1 f42966r;

    /* renamed from: s */
    public static final sl1 f42967s;

    /* renamed from: t */
    public static final sl1 f42968t;

    /* renamed from: u */
    public static final sl1 f42969u;

    /* renamed from: v */
    public static final sl1 f42970v;

    /* renamed from: w */
    public static final sl1 f42971w;

    /* renamed from: x */
    public static final sl1 f42972x;

    /* renamed from: y */
    public static final sl1 f42973y;

    /* renamed from: z */
    public static final sl1 f42974z;

    static {
        ul1 ul1Var = new ul1();
        f42949a = ul1Var;
        f42950b = ul1Var.m51689a("Continue", 100);
        f42951c = ul1Var.m51689a("Switching Protocols", 101);
        f42952d = ul1Var.m51689a("Processing", 102);
        f42953e = ul1Var.m51689a("OK", 200);
        f42954f = ul1Var.m51689a("Created", 201);
        f42955g = ul1Var.m51689a("Accepted", 202);
        f42956h = ul1Var.m51689a("Non Authoritative Information", 203);
        f42957i = ul1Var.m51689a("No Content", 204);
        f42958j = ul1Var.m51689a("Reset Content", HttpStatus.SC_RESET_CONTENT);
        f42959k = ul1Var.m51689a("Partial Content", HttpStatus.SC_PARTIAL_CONTENT);
        f42960l = ul1Var.m51689a("Multi Status", HttpStatus.SC_MULTI_STATUS);
        f42961m = ul1Var.m51689a("Multiple Choices", 300);
        f42962n = ul1Var.m51689a("Moved Permanently", 301);
        f42963o = ul1Var.m51689a("Moved Temporarily", 302);
        f42964p = ul1Var.m51689a("Found", 302);
        f42965q = ul1Var.m51689a("See Other", 303);
        f42966r = ul1Var.m51689a("Not Modified", 304);
        f42967s = ul1Var.m51689a("Use Proxy", HttpStatus.SC_USE_PROXY);
        f42968t = ul1Var.m51689a("Bad Request", 400);
        f42969u = ul1Var.m51689a("Unauthorized", 401);
        f42970v = ul1Var.m51689a("Payment Required", 402);
        f42971w = ul1Var.m51689a("Forbidden", 403);
        f42972x = ul1Var.m51689a("Not Found", 404);
        f42973y = ul1Var.m51689a("Method Not Allowed", 405);
        f42974z = ul1Var.m51689a("Not Acceptable", 406);
        f42926A = ul1Var.m51689a("Proxy Authentication Required", HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED);
        f42927B = ul1Var.m51689a("Request Timeout", HttpStatus.SC_REQUEST_TIMEOUT);
        f42928C = ul1Var.m51689a("Conflict", 409);
        f42929D = ul1Var.m51689a("Gone", 410);
        f42930E = ul1Var.m51689a("Length Required", 411);
        f42931F = ul1Var.m51689a("Precondition Failed", 412);
        f42932G = ul1Var.m51689a("Request Entity Too Large", 413);
        f42933H = ul1Var.m51689a("Request URI Too Large", HttpStatus.SC_REQUEST_URI_TOO_LONG);
        f42934I = ul1Var.m51689a("Unsupported Media Type", HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
        f42935J = ul1Var.m51689a("Requested Range Not Satisfiable", HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE);
        f42936K = ul1Var.m51689a("Expectation Failed", HttpStatus.SC_EXPECTATION_FAILED);
        f42937L = ul1Var.m51689a("Unprocessable Entity", 422);
        f42938M = ul1Var.m51689a("Locked", 423);
        f42939N = ul1Var.m51689a("Failed Dependency", HttpStatus.SC_FAILED_DEPENDENCY);
        f42940O = ul1Var.m51689a("Internal Server Error", 500);
        f42941P = ul1Var.m51689a("Not Implemented", HttpStatus.SC_NOT_IMPLEMENTED);
        f42942Q = ul1Var.m51689a("Bad Gateway", 502);
        f42943R = ul1Var.m51689a("Service Unavailable", 503);
        f42944S = ul1Var.m51689a("Gateway Timeout", HttpStatus.SC_GATEWAY_TIMEOUT);
        f42945T = ul1Var.m51689a("HTTP Version Not Supported", HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED);
        f42946U = ul1Var.m51689a("Insufficient Storage", HttpStatus.SC_INSUFFICIENT_STORAGE);
        f42947V = ul1Var.m51689a("Unknown", 999);
        f42948W = new sl1[MediaError.DetailedErrorCode.TEXT_UNKNOWN];
        int length = z48.f56511d.length();
        for (int i = 0; i < f42948W.length; i++) {
            ul1.C17390a c17390aM51690b = f42949a.m51690b(i);
            if (c17390aM51690b != null) {
                int i2 = length + 5;
                int length2 = c17390aM51690b.length() + i2 + 2;
                byte[] bArr = new byte[length2];
                z48.f56511d.G0(0, bArr, 0, length);
                bArr[length + 0] = 32;
                bArr[length + 1] = (byte) ((i / 100) + 48);
                bArr[length + 2] = (byte) (((i % 100) / 10) + 48);
                bArr[length + 3] = (byte) ((i % 10) + 48);
                bArr[length + 4] = 32;
                c17390aM51690b.G0(0, bArr, i2, c17390aM51690b.length());
                bArr[i2 + c17390aM51690b.length()] = 13;
                bArr[length + 6 + c17390aM51690b.length()] = 10;
                f42948W[i] = new pp1(bArr, 0, length2, 0);
            }
        }
    }

    /* renamed from: a */
    public static sl1 m46205a(int i) {
        sl1[] sl1VarArr = f42948W;
        if (i >= sl1VarArr.length) {
            return null;
        }
        return sl1VarArr[i];
    }
}
