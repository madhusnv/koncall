package p001o;

import p001o.z9g;

/* loaded from: classes2.dex */
public final class dag implements pb8 {

    /* renamed from: a */
    public final z9g.C18593c f19496a;

    public dag(z9g.C18593c c18593c) {
        sq8.m48649h(c18593c, "config");
        this.f19496a = c18593c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f19496a.m59011g();
        }
        if (sq8.m48644c(str, "smithy.api#noAuth")) {
            return vh0.f50319a;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
