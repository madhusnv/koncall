package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;

/* loaded from: classes3.dex */
public final class ydc {

    /* renamed from: m */
    public static final C18385a f55307m = new C18385a(null);

    /* renamed from: n */
    public static final ydc f55308n = new ydc("NoOp", vdh.f50220a.m52646a());

    /* renamed from: a */
    public final vdh f55309a;

    /* renamed from: b */
    public final deb f55310b;

    /* renamed from: c */
    public final qy7 f55311c;

    /* renamed from: d */
    public final nlb f55312d;

    /* renamed from: e */
    public final nlb f55313e;

    /* renamed from: f */
    public final qy7 f55314f;

    /* renamed from: g */
    public final qy7 f55315g;

    /* renamed from: h */
    public final qy7 f55316h;

    /* renamed from: i */
    public final qy7 f55317i;

    /* renamed from: j */
    public final qy7 f55318j;

    /* renamed from: k */
    public final qy7 f55319k;

    /* renamed from: l */
    public final qy7 f55320l;

    /* renamed from: o.ydc$a */
    public static final class C18385a {
        public C18385a() {
        }

        public /* synthetic */ C18385a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ydc m57652a() {
            return ydc.f55308n;
        }
    }

    public ydc(String str, vdh vdhVar) {
        sq8.m48649h(str, "scope");
        sq8.m48649h(vdhVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        this.f55309a = vdhVar;
        deb debVarMo24858a = vdhVar.mo40625a().mo24858a(str);
        this.f55310b = debVarMo24858a;
        this.f55311c = debVarMo24858a.mo22901c("smithy.client.call.duration", "s", "Overall call duration including retries");
        this.f55312d = debVarMo24858a.mo22899a("smithy.client.call.attempts", "{attempt}", "The number of attempts for an operation");
        this.f55313e = debVarMo24858a.mo22899a("smithy.client.call.errors", "{error}", "The number of errors for an operation");
        this.f55314f = debVarMo24858a.mo22901c("smithy.client.call.attempt_duration", "s", "The time it takes to connect to complete an entire call attempt, including identity resolution, endpoint resolution, signing, sending the request, and receiving the HTTP status code and headers from the response for an operation");
        this.f55315g = debVarMo24858a.mo22901c("smithy.client.call.attempt_overhead_duration", "s", "The time it takes to execute an attempt minus the time spent waiting for a response from the remote server");
        this.f55316h = debVarMo24858a.mo22901c("smithy.client.call.serialization_duration", "s", "The time it takes to serialize a request message body");
        this.f55317i = debVarMo24858a.mo22901c("smithy.client.call.deserialization_duration", "s", "The time it takes to deserialize a response message body");
        this.f55318j = debVarMo24858a.mo22901c("smithy.client.call.resolve_endpoint_duration", "s", "The time it takes to resolve an endpoint for a request");
        this.f55319k = debVarMo24858a.mo22901c("smithy.client.call.auth.resolve_identity_duration", "s", "The time it takes to resolve an identity for signing a request");
        this.f55320l = debVarMo24858a.mo22901c("smithy.client.call.auth.signing_duration", "s", "The time it takes to sign a request");
    }

    /* renamed from: b */
    public final qy7 m57641b() {
        return this.f55317i;
    }

    /* renamed from: c */
    public final vdh m57642c() {
        return this.f55309a;
    }

    /* renamed from: d */
    public final qy7 m57643d() {
        return this.f55318j;
    }

    /* renamed from: e */
    public final qy7 m57644e() {
        return this.f55319k;
    }

    /* renamed from: f */
    public final qy7 m57645f() {
        return this.f55314f;
    }

    /* renamed from: g */
    public final qy7 m57646g() {
        return this.f55315g;
    }

    /* renamed from: h */
    public final nlb m57647h() {
        return this.f55312d;
    }

    /* renamed from: i */
    public final qy7 m57648i() {
        return this.f55311c;
    }

    /* renamed from: j */
    public final nlb m57649j() {
        return this.f55313e;
    }

    /* renamed from: k */
    public final qy7 m57650k() {
        return this.f55316h;
    }

    /* renamed from: l */
    public final qy7 m57651l() {
        return this.f55320l;
    }
}
