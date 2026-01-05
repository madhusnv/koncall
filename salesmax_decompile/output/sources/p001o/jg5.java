package p001o;

/* loaded from: classes3.dex */
public final class jg5 implements pme {

    /* renamed from: o.jg5$a */
    public /* synthetic */ class C14527a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30385a;

        static {
            int[] iArr = new int[t81.values().length];
            try {
                iArr[t81.HTTP_REQUEST_VIA_HEADERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t81.HTTP_REQUEST_VIA_QUERY_PARAMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30385a = iArr;
        }
    }

    @Override // p001o.pme
    /* renamed from: a */
    public y38 mo33788a(z81 z81Var, gc2 gc2Var, String str) {
        sq8.m48649h(z81Var, "config");
        sq8.m48649h(gc2Var, "canonical");
        sq8.m48649h(str, "signatureHex");
        int i = C14527a.f30385a[z81Var.m58890k().ordinal()];
        if (i == 1) {
            xx7 xx7VarM58668e = gc2Var.m28387a().m58668e();
            xx7VarM58668e.m59810r("Authorization", "AWS4-HMAC-SHA256 " + ("Credential=" + cc5.m20835a(z81Var)) + ", " + ("SignedHeaders=" + gc2Var.m28389c()) + ", " + ("Signature=" + str));
        } else {
            if (i != 2) {
                throw new v0c("An operation is not implemented: " + ("Support for " + z81Var.m58890k() + " is not yet implemented"));
            }
            gc2Var.m28387a().m58671h().m36766g().m20280o().put("X-Amz-Signature", (Object) str);
        }
        return gc2Var.m28387a().m58665b();
    }
}
