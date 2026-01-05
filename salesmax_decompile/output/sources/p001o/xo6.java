package p001o;

import org.apache.http.HttpHeaders;
import p001o.gk8;
import p001o.qja;
import p001o.sn8;

/* loaded from: classes3.dex */
public final class xo6 implements sn8 {

    /* renamed from: a */
    public static final xo6 f54001a = new xo6();

    /* renamed from: b */
    public static final String m56532b(h48 h48Var) {
        return "Failed to parse `expires`=\"" + ((String) h48Var.m29799d().m59804l(HttpHeaders.EXPIRES)) + "\" as a timestamp, setting it to `null`. The unparsed value is available in `expiresString`.";
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
        final h48 h48VarM33193h = j48.m33193h((g48) e2eVar.mo24161d());
        if (h48VarM33193h.m29799d().m59801i(HttpHeaders.EXPIRES)) {
            xx7 xx7VarM29799d = h48VarM33193h.m29799d();
            Object objM59804l = h48VarM33193h.m29799d().m59804l(HttpHeaders.EXPIRES);
            sq8.m48646e(objM59804l);
            xx7VarM29799d.m59810r("ExpiresString", objM59804l);
            try {
                gk8.C13769a c13769a = gk8.f25374b;
                Object objM59804l2 = h48VarM33193h.m29799d().m59804l(HttpHeaders.EXPIRES);
                sq8.m48646e(objM59804l2);
                c13769a.m28961e((String) objM59804l2);
            } catch (Exception unused) {
                q74 context = n64Var.getContext();
                String strMo26336c = kge.m35689b(xo6.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                }
                qja.C16414b.m45551d(v74.m52400e(context, strMo26336c), null, new uk7() { // from class: o.wo6
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return xo6.m56532b(h48VarM33193h);
                    }
                }, 1, null);
                h48VarM33193h.m29799d().m59809q(HttpHeaders.EXPIRES);
            }
        }
        return h48VarM33193h.m29797b();
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
