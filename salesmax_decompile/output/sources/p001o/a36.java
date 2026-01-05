package p001o;

import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class a36 implements l48 {

    /* renamed from: a */
    public final String f14089a;

    public a36(String str) {
        this.f14089a = str;
    }

    @Override // p001o.l48
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo16371a(jl6 jl6Var, y3i y3iVar, n64 n64Var) {
        z38 z38Var = new z38();
        z38Var.m58671h().m36767h();
        a48.m16408d(z38Var, "Accept", "application/json");
        a48.m16408d(z38Var, HttpHeaders.ACCEPT_ENCODING, HTTP.IDENTITY_CODING);
        String str = this.f14089a;
        if (str != null) {
            a48.m16408d(z38Var, "Authorization", str);
        }
        return z38Var;
    }
}
