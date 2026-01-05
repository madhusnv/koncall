package p001o;

import p001o.cg3;

/* loaded from: classes3.dex */
public final class gg3 implements pb8 {

    /* renamed from: a */
    public final cg3.C12676c f25089a;

    public gg3(cg3.C12676c c12676c) {
        sq8.m48649h(c12676c, "config");
        this.f25089a = c12676c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        if (sq8.m48644c(str, "aws.auth#sigv4")) {
            return this.f25089a.m21149g();
        }
        if (sq8.m48644c(str, "smithy.api#noAuth")) {
            return vh0.f50319a;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
