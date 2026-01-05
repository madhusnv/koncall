package p001o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.gk8;
import p001o.k16;
import p001o.qja;
import p001o.sn8;

/* loaded from: classes3.dex */
public final class pb3 implements sn8 {

    /* renamed from: b */
    public static final C16045a f39763b = new C16045a(null);

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39764c;

    /* renamed from: d */
    public static final long f39765d;

    /* renamed from: e */
    public static final List f39766e;

    /* renamed from: f */
    public static final List f39767f;

    /* renamed from: a */
    public volatile /* synthetic */ Object f39768a = null;

    /* renamed from: o.pb3$a */
    public static final class C16045a {
        public C16045a() {
        }

        public /* synthetic */ C16045a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m43296a() {
            return pb3.f39765d;
        }

        /* renamed from: b */
        public final boolean m43297b(gk8 gk8Var, gk8 gk8Var2, String str) {
            sq8.m48649h(gk8Var, "<this>");
            sq8.m48649h(gk8Var2, "serverTime");
            sq8.m48649h(str, "errorCode");
            return pb3.f39766e.contains(str) || (pb3.f39767f.contains(str) && k16.m34884m(k16.m34890u(jk8.m33905c(gk8Var, gk8Var2)), m43296a()) >= 0);
        }
    }

    static {
        k16.C14700a c14700a = k16.f31358b;
        f39765d = m16.m38175s(4, o16.MINUTES);
        f39766e = ch3.m21249n("RequestTimeTooSkewed", "RequestExpired", "RequestInTheFuture");
        f39767f = ch3.m21249n("InvalidSignatureException", "SignatureDoesNotMatch", "AuthFailure");
        f39764c = AtomicReferenceFieldUpdater.newUpdater(pb3.class, Object.class, "a");
    }

    /* renamed from: i */
    public static final String m43291i(gk8 gk8Var, long j, gk8 gk8Var2) {
        return "client clock (" + gk8Var + ") is skewed " + ((Object) k16.m34876V(j)) + " from the server (" + gk8Var2 + "), applying correction";
    }

    /* renamed from: j */
    public static final String m43292j() {
        return "Error while parsing \"Date\" header from service response";
    }

    /* renamed from: k */
    public static final String m43293k(String str) {
        return "Service returned malformed \"Date\" header value \"" + str + "\", skipping skew calculation";
    }

    /* renamed from: l */
    public static final String m43294l() {
        return "service did not return \"Date\" header, skipping skew calculation";
    }

    /* renamed from: m */
    public static final String m43295m(k16 k16Var) {
        return "applying clock skew " + k16Var + " to client";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        r0 = p001o.j48.m33192g(r0, "Date");
     */
    @Override // p001o.sn8
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var) {
        final String strM33192g;
        final gk8 gk8VarM28960d;
        q74 context = n64Var.getContext();
        String strMo26336c = kge.m35689b(pb3.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
        g48 g48Var = (g48) ereVar.mo24161d();
        if (g48Var != null && strM33192g != null) {
            try {
                gk8.C13769a c13769a = gk8.f25374b;
                final gk8 gk8VarM28961e = c13769a.m28961e(strM33192g);
                if (gk8VarM28961e != null) {
                    String str = (String) ((y38) ereVar.mo20099c()).getHeaders().get("Date");
                    if (str == null || (gk8VarM28960d = c13769a.m28961e(str)) == null) {
                        String str2 = (String) ((y38) ereVar.mo20099c()).getHeaders().get("x-amz-date");
                        gk8VarM28960d = str2 != null ? c13769a.m28960d(str2) : (gk8) tx0.m50737b(ereVar.mo25341b(), s38.f44646a.m47567c());
                    }
                    Throwable thM53354e = vre.m53354e(ereVar.mo25521e());
                    s6f s6fVar = thM53354e instanceof s6f ? (s6f) thM53354e : null;
                    if (s6fVar == null) {
                        return ereVar.mo25521e();
                    }
                    String str3 = (String) s6fVar.mo34658a().m35772c().mo18191b(ggf.f25107e.m28589a());
                    if (str3 == null || !f39763b.m43297b(gk8VarM28960d, gk8VarM28961e, str3)) {
                        return ereVar.mo25521e();
                    }
                    final long jM33905c = jk8.m33905c(gk8VarM28960d, gk8VarM28961e);
                    qja.C16414b.m45551d(qjaVarM52400e, null, new uk7() { // from class: o.nb3
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return pb3.m43291i(gk8VarM28960d, jM33905c, gk8VarM28961e);
                        }
                    }, 1, null);
                    f39764c.getAndSet(this, k16.m34883h(jM33905c));
                    ereVar.mo25341b().mo34002p(s38.f44646a.m47566b(), k16.m34883h(jM33905c));
                    s6fVar.mo34658a().m35772c().mo34002p(kj6.f32297b.m35775a(), ml1.m39301a(true));
                    return vre.m53351b(wre.m54933a(s6fVar));
                }
            } catch (bxc e) {
                qjaVarM52400e.mo18187d(e, new uk7() { // from class: o.kb3
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return pb3.m43292j();
                    }
                });
                qja.C16414b.m45551d(qjaVarM52400e, null, new uk7() { // from class: o.lb3
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return pb3.m43293k(strM33192g);
                    }
                }, 1, null);
                return ereVar.mo25521e();
            }
        }
        qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.mb3
            @Override // p001o.uk7
            public final Object invoke() {
                return pb3.m43294l();
            }
        }, 1, null);
        return ereVar.mo25521e();
    }

    @Override // p001o.sn8
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48564b(this, ereVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var) {
        return sn8.C16877a.m48565c(this, e2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeRetryLoop(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48566d(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeSerialization(eme emeVar, n64 n64Var) {
        return sn8.C16877a.m48567e(this, emeVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeSigning(c2e c2eVar, n64 n64Var) {
        q74 context = n64Var.getContext();
        String strMo26336c = kge.m35689b(pb3.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
        final k16 k16Var = (k16) this.f39768a;
        if (k16Var != null) {
            k16Var.m34896X();
            qja.C16414b.m45549b(qjaVarM52400e, null, new uk7() { // from class: o.ob3
                @Override // p001o.uk7
                public final Object invoke() {
                    return pb3.m43295m(k16Var);
                }
            }, 1, null);
            c2eVar.mo25341b().mo34002p(s38.f44646a.m47566b(), k16Var);
        }
        c2eVar.mo25341b().mo34002p(s38.f44646a.m47567c(), gk8.f25374b.m28963g());
        return c2eVar.mo20099c();
    }

    @Override // p001o.sn8
    public Object modifyBeforeTransmit(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48569g(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public void readAfterAttempt(ere ereVar) {
        sn8.C16877a.m48570h(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterDeserialization(ere ereVar) {
        sn8.C16877a.m48571i(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterExecution(ere ereVar) {
        sn8.C16877a.m48572j(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterSerialization(c2e c2eVar) {
        sn8.C16877a.m48573k(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readAfterSigning(c2e c2eVar) {
        sn8.C16877a.m48574l(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readAfterTransmit(e2e e2eVar) {
        sn8.C16877a.m48575m(this, e2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeAttempt(c2e c2eVar) {
        sn8.C16877a.m48576n(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeDeserialization(e2e e2eVar) {
        sn8.C16877a.m48577o(this, e2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeExecution(eme emeVar) {
        sn8.C16877a.m48578p(this, emeVar);
    }

    @Override // p001o.sn8
    public void readBeforeSerialization(eme emeVar) {
        sn8.C16877a.m48579q(this, emeVar);
    }

    @Override // p001o.sn8
    public void readBeforeSigning(c2e c2eVar) {
        sn8.C16877a.m48580r(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeTransmit(c2e c2eVar) {
        sn8.C16877a.m48581s(this, c2eVar);
    }
}
