package p001o;

import p001o.klb;

/* loaded from: classes2.dex */
public final class vfe implements klb {

    /* renamed from: a */
    public final ri6 f50286a;

    public vfe(ri6 ri6Var) {
        sq8.m48649h(ri6Var, "env");
        this.f50286a = ri6Var;
    }

    @Override // p001o.klb
    /* renamed from: a */
    public void mo21637a(j7f j7fVar) {
        klb.C14858a.m35837a(this, j7fVar);
    }

    @Override // p001o.jlb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo21638b(zdc zdcVar, n64 n64Var) {
        if (((z38) zdcVar.m59255d()).m58668e().m59801i("X-Amzn-Trace-Id")) {
            return zdcVar;
        }
        String strMo26798i = this.f50286a.mo26798i("_X_AMZN_TRACE_ID");
        if (this.f50286a.mo26798i("AWS_LAMBDA_FUNCTION_NAME") != null && strMo26798i != null) {
            ((z38) zdcVar.m59255d()).m58668e().m59810r("X-Amzn-Trace-Id", wfe.f51906a.mo24241a(strMo26798i));
        }
        return zdcVar;
    }

    public /* synthetic */ vfe(ri6 ri6Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? r9d.f43250a.m46382a() : ri6Var);
    }
}
