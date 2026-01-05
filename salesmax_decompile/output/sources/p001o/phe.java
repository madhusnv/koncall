package p001o;

import p001o.lhe;

/* loaded from: classes3.dex */
public final class phe implements pb8 {

    /* renamed from: a */
    public final lhe.C15078c f40110a;

    public phe(lhe.C15078c c15078c) {
        sq8.m48649h(c15078c, "config");
        this.f40110a = c15078c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f40110a.m37233g();
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
