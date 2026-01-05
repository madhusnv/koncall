package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public class ggf extends kj6 {

    /* renamed from: e */
    public static final C13707a f25107e = new C13707a(null);

    /* renamed from: f */
    public static final kx0 f25108f = new kx0("aws.smithy.kotlin#ErrorCode");

    /* renamed from: g */
    public static final kx0 f25109g = new kx0("aws.smithy.kotlin#ErrorMessage");

    /* renamed from: h */
    public static final kx0 f25110h = new kx0("aws.smithy.kotlin#ErrorType");

    /* renamed from: i */
    public static final kx0 f25111i = new kx0("aws.smithy.kotlin#ProtocolResponse");

    /* renamed from: j */
    public static final kx0 f25112j = new kx0("aws.smithy.kotlin#RequestId");

    /* renamed from: o.ggf$a */
    public static final class C13707a {
        public C13707a() {
        }

        public /* synthetic */ C13707a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kx0 m28589a() {
            return ggf.f25108f;
        }

        /* renamed from: b */
        public final kx0 m28590b() {
            return ggf.f25109g;
        }

        /* renamed from: c */
        public final kx0 m28591c() {
            return ggf.f25110h;
        }

        /* renamed from: d */
        public final kx0 m28592d() {
            return ggf.f25111i;
        }

        /* renamed from: e */
        public final kx0 m28593e() {
            return ggf.f25112j;
        }
    }

    /* renamed from: k */
    public final String m28584k() {
        return (String) m35772c().mo18191b(f25108f);
    }

    /* renamed from: l */
    public final String m28585l() {
        return (String) m35772c().mo18191b(f25109g);
    }

    /* renamed from: m */
    public final hgf.EnumC13938a m28586m() {
        hgf.EnumC13938a enumC13938a = (hgf.EnumC13938a) m35772c().mo18191b(f25110h);
        return enumC13938a == null ? hgf.EnumC13938a.Unknown : enumC13938a;
    }

    /* renamed from: n */
    public final d2e m28587n() {
        d2e d2eVar = (d2e) m35772c().mo18191b(f25111i);
        return d2eVar == null ? n66.f36436a : d2eVar;
    }

    /* renamed from: o */
    public final String m28588o() {
        return (String) m35772c().mo18191b(f25112j);
    }
}
