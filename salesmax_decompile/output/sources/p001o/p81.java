package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.l8i;

/* loaded from: classes2.dex */
public abstract class p81 {

    /* renamed from: o.p81$a */
    public /* synthetic */ class C16020a extends uv implements xk7 {
        public C16020a(Object obj) {
            super(1, obj, l8i.C15037b.class, "parse", "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l8i invoke(String str) {
            sq8.m48649h(str, "p0");
            return l8i.C15037b.m36787m((l8i.C15037b) this.f49525a, str, null, 2, null);
        }
    }

    /* renamed from: a */
    public static final l8i m43157a(o81 o81Var, r9d r9dVar, String str, String str2) {
        sq8.m48649h(o81Var, "<this>");
        sq8.m48649h(r9dVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        sq8.m48649h(str, "sysPropSuffix");
        sq8.m48649h(str2, "envSuffix");
        l8i l8iVar = (l8i) bj6.m19237f((zi6) zi6.f57249e.m59497b(new C16020a(l8i.f33466k)).invoke("aws.endpointUrl" + str, "AWS_ENDPOINT_URL_" + str2), r9dVar);
        return l8iVar == null ? (l8i) bj6.m19237f(o81Var.m41739l(), r9dVar) : l8iVar;
    }
}
