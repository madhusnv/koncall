package p001o;

import org.apache.http.cookie.ClientCookie;
import p001o.klb;
import p001o.m18;

/* loaded from: classes3.dex */
public final class h81 implements klb {

    /* renamed from: a */
    public final String f26388a;

    /* renamed from: b */
    public final String f26389b;

    public h81(String str, String str2) {
        sq8.m48649h(str, "serviceShapeName");
        sq8.m48649h(str2, ClientCookie.VERSION_ATTR);
        this.f26388a = str;
        this.f26389b = str2;
    }

    @Override // p001o.klb
    /* renamed from: a */
    public void mo21637a(j7f j7fVar) {
        klb.C14858a.m35837a(this, j7fVar);
    }

    @Override // p001o.jlb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo21638b(zdc zdcVar, n64 n64Var) {
        String str = (String) tx0.m50737b(zdcVar.m59254c(), e7f.f21127a.m24497d());
        ((z38) zdcVar.m59255d()).m58668e().m59796c("X-Amz-Target", this.f26388a + '.' + str);
        ((z38) zdcVar.m59255d()).m58668e().m59811s("Content-Type", "application/x-amz-json-" + this.f26389b);
        if (((z38) zdcVar.m59255d()).m58667d() instanceof m18.C15196d) {
            ((z38) zdcVar.m59255d()).m58672i(m18.Companion.m38178a(e9g.m24603u("{}")));
        }
        return zdcVar;
    }
}
