package p001o;

import p001o.kg3;

/* loaded from: classes3.dex */
public final class og3 implements pb8 {

    /* renamed from: a */
    public final kg3.C14827c f38316a;

    public og3(kg3.C14827c c14827c) {
        sq8.m48649h(c14827c, "config");
        this.f38316a = c14827c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f38316a.m35659g();
        }
        if (sq8.m48644c(str, "smithy.api#noAuth")) {
            return vh0.f50319a;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
