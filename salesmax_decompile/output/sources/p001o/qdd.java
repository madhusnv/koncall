package p001o;

import p001o.mdd;

/* loaded from: classes3.dex */
public final class qdd implements pb8 {

    /* renamed from: a */
    public final mdd.C15289c f41723a;

    public qdd(mdd.C15289c c15289c) {
        sq8.m48649h(c15289c, "config");
        this.f41723a = c15289c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f41723a.m38772g();
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
