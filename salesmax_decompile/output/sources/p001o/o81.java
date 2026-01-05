package p001o;

import com.amazonaws.SDKGlobalConfiguration;
import org.apache.http.client.config.CookieSpecs;
import p001o.l8i;

/* loaded from: classes2.dex */
public final class o81 {

    /* renamed from: a */
    public static final o81 f37890a = new o81();

    /* renamed from: b */
    public static final zi6 f37891b = (zi6) bj6.m19236e().invoke(SDKGlobalConfiguration.ACCESS_KEY_SYSTEM_PROPERTY, SDKGlobalConfiguration.ACCESS_KEY_ENV_VAR);

    /* renamed from: c */
    public static final zi6 f37892c = (zi6) bj6.m19236e().invoke("aws.secretAccessKey", SDKGlobalConfiguration.ALTERNATE_SECRET_KEY_ENV_VAR);

    /* renamed from: d */
    public static final zi6 f37893d = (zi6) bj6.m19236e().invoke("aws.sessionToken", SDKGlobalConfiguration.AWS_SESSION_TOKEN_ENV_VAR);

    /* renamed from: e */
    public static final zi6 f37894e = (zi6) bj6.m19236e().invoke("aws.region", "AWS_REGION");

    /* renamed from: f */
    public static final zi6 f37895f = (zi6) bj6.m19236e().invoke("aws.accountId", "AWS_ACCOUNT_ID");

    /* renamed from: g */
    public static final zi6 f37896g = (zi6) bj6.m19236e().invoke("aws.userAgentAppId", "AWS_SDK_UA_APP_ID");

    /* renamed from: h */
    public static final zi6 f37897h = (zi6) bj6.m19236e().invoke("aws.configFile", "AWS_CONFIG_FILE");

    /* renamed from: i */
    public static final zi6 f37898i = (zi6) bj6.m19236e().invoke("aws.sharedCredentialsFile", "AWS_SHARED_CREDENTIALS_FILE");

    /* renamed from: j */
    public static final zi6 f37899j = (zi6) bj6.m19236e().invoke("aws.executionEnvironment", "AWS_EXECUTION_ENV");

    /* renamed from: k */
    public static final zi6 f37900k = ((zi6) bj6.m19236e().invoke("aws.profile", "AWS_PROFILE")).m59494g(CookieSpecs.DEFAULT);

    /* renamed from: l */
    public static final zi6 f37901l = ((zi6) bj6.m19233b().invoke("aws.disableEc2Metadata", "AWS_EC2_METADATA_DISABLED")).m59494g(Boolean.FALSE);

    /* renamed from: m */
    public static final zi6 f37902m = (zi6) bj6.m19236e().invoke("aws.ec2MetadataServiceEndpoint", "AWS_EC2_METADATA_SERVICE_ENDPOINT");

    /* renamed from: n */
    public static final zi6 f37903n = (zi6) bj6.m19236e().invoke("aws.ec2MetadataServiceEndpointMode", "AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE");

    /* renamed from: o */
    public static final zi6 f37904o = (zi6) bj6.m19236e().invoke("aws.roleArn", "AWS_ROLE_ARN");

    /* renamed from: p */
    public static final zi6 f37905p = (zi6) bj6.m19236e().invoke("aws.roleSessionName", "AWS_ROLE_SESSION_NAME");

    /* renamed from: q */
    public static final zi6 f37906q = (zi6) bj6.m19236e().invoke("aws.webIdentityTokenFile", "AWS_WEB_IDENTITY_TOKEN_FILE");

    /* renamed from: r */
    public static final zi6 f37907r = (zi6) bj6.m19236e().invoke("aws.containerCredentialsPath", "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI");

    /* renamed from: s */
    public static final zi6 f37908s = (zi6) bj6.m19236e().invoke("aws.containerCredentialsFullUri", "AWS_CONTAINER_CREDENTIALS_FULL_URI");

    /* renamed from: t */
    public static final zi6 f37909t = (zi6) bj6.m19236e().invoke("aws.containerAuthorizationToken", "AWS_CONTAINER_AUTHORIZATION_TOKEN");

    /* renamed from: u */
    public static final zi6 f37910u = (zi6) bj6.m19236e().invoke("aws.containerAuthorizationTokenFile", "AWS_CONTAINER_AUTHORIZATION_TOKEN_FILE");

    /* renamed from: v */
    public static final zi6 f37911v = (zi6) bj6.m19234c().invoke("aws.maxAttempts", "AWS_MAX_ATTEMPTS");

    /* renamed from: w */
    public static final zi6 f37912w = new zi6(C15728b.f37916a, "aws.retryMode", "AWS_RETRY_MODE", null, 8, null);

    /* renamed from: x */
    public static final zi6 f37913x = (zi6) bj6.m19233b().invoke("aws.useFipsEndpoint", "AWS_USE_FIPS_ENDPOINT");

    /* renamed from: y */
    public static final zi6 f37914y = (zi6) bj6.m19233b().invoke("aws.useDualstackEndpoint", "AWS_USE_DUALSTACK_ENDPOINT");

    /* renamed from: z */
    public static final zi6 f37915z = (zi6) zi6.f57249e.m59497b(new C15727a(l8i.f33466k)).invoke("aws.endpointUrl", "AWS_ENDPOINT_URL");

    /* renamed from: A */
    public static final zi6 f37885A = (zi6) bj6.m19233b().invoke("aws.ignoreConfiguredEndpointUrls", "AWS_IGNORE_CONFIGURED_ENDPOINT_URLS");

    /* renamed from: B */
    public static final zi6 f37886B = new zi6(C15729c.f37917a, "aws.accountIdEndpointMode", "AWS_ACCOUNT_ID_ENDPOINT_MODE", null, 8, null);

    /* renamed from: C */
    public static final zi6 f37887C = (zi6) bj6.m19233b().invoke("aws.disableRequestCompression", "AWS_DISABLE_REQUEST_COMPRESSION");

    /* renamed from: D */
    public static final zi6 f37888D = (zi6) bj6.m19235d().invoke("aws.requestMinCompressionSizeBytes", "AWS_REQUEST_MIN_COMPRESSION_SIZE_BYTES");

    /* renamed from: E */
    public static final zi6 f37889E = (zi6) bj6.m19236e().invoke("aws.sigV4aSigningRegionSet", "AWS_SIGV4A_SIGNING_REGION_SET");

    /* renamed from: o.o81$a */
    public /* synthetic */ class C15727a extends uv implements xk7 {
        public C15727a(Object obj) {
            super(1, obj, l8i.C15037b.class, "parse", "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l8i invoke(String str) {
            sq8.m48649h(str, "p0");
            return l8i.C15037b.m36787m((l8i.C15037b) this.f49525a, str, null, 2, null);
        }
    }

    /* renamed from: o.o81$b */
    public static final class C15728b implements xk7 {

        /* renamed from: a */
        public static final C15728b f37916a = new C15728b();

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Enum invoke(String str) {
            qse qseVar;
            sq8.m48649h(str, "strValue");
            qse[] qseVarArrValues = qse.values();
            int length = qseVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    qseVar = null;
                    break;
                }
                qseVar = qseVarArrValues[i];
                if (e9g.m24606x(qseVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (qseVar != null) {
                return qseVar;
            }
            throw new xa3("Value " + str + " is not supported, should be one of " + gp0.r0(qseVarArrValues, ", ", null, null, 0, null, null, 62, null));
        }
    }

    /* renamed from: o.o81$c */
    public static final class C15729c implements xk7 {

        /* renamed from: a */
        public static final C15729c f37917a = new C15729c();

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Enum invoke(String str) {
            ge geVar;
            sq8.m48649h(str, "strValue");
            ge[] geVarArrValues = ge.values();
            int length = geVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    geVar = null;
                    break;
                }
                geVar = geVarArrValues[i];
                if (e9g.m24606x(geVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (geVar != null) {
                return geVar;
            }
            throw new xa3("Value " + str + " is not supported, should be one of " + gp0.r0(geVarArrValues, ", ", null, null, 0, null, null, 62, null));
        }
    }

    /* renamed from: a */
    public final zi6 m41728a() {
        return f37891b;
    }

    /* renamed from: b */
    public final zi6 m41729b() {
        return f37895f;
    }

    /* renamed from: c */
    public final zi6 m41730c() {
        return f37896g;
    }

    /* renamed from: d */
    public final zi6 m41731d() {
        return f37897h;
    }

    /* renamed from: e */
    public final zi6 m41732e() {
        return f37909t;
    }

    /* renamed from: f */
    public final zi6 m41733f() {
        return f37910u;
    }

    /* renamed from: g */
    public final zi6 m41734g() {
        return f37908s;
    }

    /* renamed from: h */
    public final zi6 m41735h() {
        return f37907r;
    }

    /* renamed from: i */
    public final zi6 m41736i() {
        return f37901l;
    }

    /* renamed from: j */
    public final zi6 m41737j() {
        return f37902m;
    }

    /* renamed from: k */
    public final zi6 m41738k() {
        return f37903n;
    }

    /* renamed from: l */
    public final zi6 m41739l() {
        return f37915z;
    }

    /* renamed from: m */
    public final zi6 m41740m() {
        return f37885A;
    }

    /* renamed from: n */
    public final zi6 m41741n() {
        return f37911v;
    }

    /* renamed from: o */
    public final zi6 m41742o() {
        return f37900k;
    }

    /* renamed from: p */
    public final zi6 m41743p() {
        return f37894e;
    }

    /* renamed from: q */
    public final zi6 m41744q() {
        return f37912w;
    }

    /* renamed from: r */
    public final zi6 m41745r() {
        return f37904o;
    }

    /* renamed from: s */
    public final zi6 m41746s() {
        return f37905p;
    }

    /* renamed from: t */
    public final zi6 m41747t() {
        return f37892c;
    }

    /* renamed from: u */
    public final zi6 m41748u() {
        return f37893d;
    }

    /* renamed from: v */
    public final zi6 m41749v() {
        return f37898i;
    }

    /* renamed from: w */
    public final zi6 m41750w() {
        return f37889E;
    }

    /* renamed from: x */
    public final zi6 m41751x() {
        return f37914y;
    }

    /* renamed from: y */
    public final zi6 m41752y() {
        return f37913x;
    }

    /* renamed from: z */
    public final zi6 m41753z() {
        return f37906q;
    }
}
