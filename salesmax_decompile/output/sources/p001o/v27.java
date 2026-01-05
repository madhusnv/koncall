package p001o;

import java.util.Iterator;
import p001o.qja;
import p001o.sn8;

/* loaded from: classes3.dex */
public final class v27 implements sn8 {

    /* renamed from: c */
    public static final C17501a f49799c = new C17501a(null);

    /* renamed from: d */
    public static final kx0 f49800d = new kx0("ChecksumHeaderValidated");

    /* renamed from: a */
    public final xk7 f49801a;

    /* renamed from: b */
    public boolean f49802b;

    /* renamed from: o.v27$a */
    public static final class C17501a {
        public C17501a() {
        }

        public /* synthetic */ C17501a(id5 id5Var) {
            this();
        }
    }

    public v27(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "shouldValidateResponseChecksumInitializer");
        this.f49801a = xk7Var;
    }

    /* renamed from: c */
    public static final String m52283c() {
        return "User requested checksum validation, but the response headers did not contain any valid checksums";
    }

    /* renamed from: d */
    public static final String m52284d(String str) {
        return "Validating checksum from " + str;
    }

    @Override // p001o.sn8
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48563a(this, ereVar, n64Var);
    }

    @Override // p001o.sn8
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48564b(this, ereVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var) {
        Object next;
        if (!this.f49802b) {
            return e2eVar.mo24161d();
        }
        q74 context = n64Var.getContext();
        String strMo26336c = kge.m35689b(v27.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
        Iterator it = w27.m53810c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((g48) e2eVar.mo24161d()).getHeaders().contains((String) next)) {
                break;
            }
        }
        final String str = (String) next;
        if (str == null) {
            qja.C16414b.m45551d(qjaVarM52400e, null, new uk7() { // from class: o.t27
                @Override // p001o.uk7
                public final Object invoke() {
                    return v27.m52283c();
                }
            }, 1, null);
            return e2eVar.mo24161d();
        }
        qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.u27
            @Override // p001o.uk7
            public final Object invoke() {
                return v27.m52284d(str);
            }
        }, 1, null);
        e2eVar.mo25341b().mo34002p(f49800d, str);
        ax7 ax7VarM19912d = bx7.m19912d(f9g.u0(str, "x-amz-checksum-"));
        if (ax7VarM19912d == null) {
            throw new xa3("could not parse checksum algorithm from header " + str);
        }
        g48 g48Var = (g48) e2eVar.mo24161d();
        m18 m18VarM39982c = n18.m39982c(((g48) e2eVar.mo24161d()).getBody(), ax7VarM19912d, ((g48) e2eVar.mo24161d()).getBody().getContentLength());
        Object obj = ((g48) e2eVar.mo24161d()).getHeaders().get(str);
        sq8.m48646e(obj);
        return j48.m33189d(g48Var, null, null, w27.m53811d(m18VarM39982c, (String) obj), 3, null);
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
        return sn8.C16877a.m48568f(this, c2eVar, n64Var);
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
        sq8.m48649h(emeVar, "context");
        this.f49802b = ((Boolean) this.f49801a.invoke(emeVar.mo25340a())).booleanValue();
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
