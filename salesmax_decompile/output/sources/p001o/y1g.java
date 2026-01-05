package p001o;

import p001o.q1g;

/* loaded from: classes2.dex */
public final class y1g implements pb8 {

    /* renamed from: a */
    public final q1g.C16272c f54725a;

    public y1g(q1g.C16272c c16272c) {
        sq8.m48649h(c16272c, "config");
        this.f54725a = c16272c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f54725a.m44713g();
        }
        if (sq8.m48644c(str, "smithy.api#noAuth")) {
            return vh0.f50319a;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
