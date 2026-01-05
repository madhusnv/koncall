package p001o;

import p001o.c2g;

/* loaded from: classes2.dex */
public final class g2g implements pb8 {

    /* renamed from: a */
    public final c2g.C12539c f24489a;

    public g2g(c2g.C12539c c12539c) {
        sq8.m48649h(c12539c, "config");
        this.f24489a = c12539c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f24489a.m20115g();
        }
        if (sq8.m48644c(str, "smithy.api#noAuth")) {
            return vh0.f50319a;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
