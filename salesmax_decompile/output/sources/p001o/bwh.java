package p001o;

import p001o.xvh;

/* loaded from: classes3.dex */
public final class bwh implements pb8 {

    /* renamed from: a */
    public final xvh.C18256c f16949a;

    public bwh(xvh.C18256c c18256c) {
        sq8.m48649h(c18256c, "config");
        this.f16949a = c18256c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f16949a.m56883g();
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
