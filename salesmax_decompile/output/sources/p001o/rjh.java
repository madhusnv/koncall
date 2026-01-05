package p001o;

import p001o.njh;

/* loaded from: classes3.dex */
public final class rjh implements pb8 {

    /* renamed from: a */
    public final njh.C15595c f43720a;

    public rjh(njh.C15595c c15595c) {
        sq8.m48649h(c15595c, "config");
        this.f43720a = c15595c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f43720a.m40690g();
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
