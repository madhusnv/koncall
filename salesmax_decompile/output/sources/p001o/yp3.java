package p001o;

import p001o.up3;

/* loaded from: classes3.dex */
public final class yp3 implements pb8 {

    /* renamed from: a */
    public final up3.C17430c f55778a;

    public yp3(up3.C17430c c17430c) {
        sq8.m48649h(c17430c, "config");
        this.f55778a = c17430c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f55778a.m51880g();
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
