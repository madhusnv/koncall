package ea;

import ad.C0108o;
import ad.C0109p;
import c4.C0860j;
import ex.InterfaceC2139c;
import gc.AbstractC2562f;
import gc.C2557a;
import gc.C2558b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ea.f */
/* loaded from: classes.dex */
public abstract class AbstractC1976f {

    /* renamed from: A */
    public static final C2558b f9238A;

    /* renamed from: B */
    public static final C2558b f9239B;

    /* renamed from: C */
    public static final C2558b f9240C;

    /* renamed from: D */
    public static final C2558b f9241D;

    /* renamed from: a */
    public static final C2558b f9242a;

    /* renamed from: b */
    public static final C2558b f9243b;

    /* renamed from: c */
    public static final C2558b f9244c;

    /* renamed from: d */
    public static final C2558b f9245d;

    /* renamed from: e */
    public static final C2558b f9246e;

    /* renamed from: f */
    public static final C2558b f9247f;

    /* renamed from: g */
    public static final C2558b f9248g;

    /* renamed from: h */
    public static final C2558b f9249h;

    /* renamed from: i */
    public static final C2558b f9250i;

    /* renamed from: j */
    public static final C2558b f9251j;

    /* renamed from: k */
    public static final C2558b f9252k;

    /* renamed from: l */
    public static final C2558b f9253l;

    /* renamed from: m */
    public static final C2558b f9254m;

    /* renamed from: n */
    public static final C2558b f9255n;

    /* renamed from: o */
    public static final C2558b f9256o;

    /* renamed from: p */
    public static final C2558b f9257p;

    /* renamed from: q */
    public static final C2558b f9258q;

    /* renamed from: r */
    public static final C2558b f9259r;

    /* renamed from: s */
    public static final C2558b f9260s;

    /* renamed from: t */
    public static final C2558b f9261t;

    /* renamed from: u */
    public static final C2558b f9262u;

    /* renamed from: v */
    public static final C2558b f9263v;

    /* renamed from: w */
    public static final C2558b f9264w;

    /* renamed from: x */
    public static final C2558b f9265x;

    /* renamed from: y */
    public static final C2558b f9266y;

    /* renamed from: z */
    public static final C2558b f9267z;

    static {
        C2557a c2557a = AbstractC2562f.f13967d;
        f9242a = (C2558b) c2557a.invoke("aws.accessKeyId", "AWS_ACCESS_KEY_ID");
        f9243b = (C2558b) c2557a.invoke("aws.secretAccessKey", "AWS_SECRET_ACCESS_KEY");
        f9244c = (C2558b) c2557a.invoke("aws.sessionToken", "AWS_SESSION_TOKEN");
        f9245d = (C2558b) c2557a.invoke("aws.region", "AWS_REGION");
        f9246e = (C2558b) c2557a.invoke("aws.accountId", "AWS_ACCOUNT_ID");
        f9247f = (C2558b) c2557a.invoke("aws.userAgentAppId", "AWS_SDK_UA_APP_ID");
        f9248g = (C2558b) c2557a.invoke("aws.configFile", "AWS_CONFIG_FILE");
        f9249h = (C2558b) c2557a.invoke("aws.sharedCredentialsFile", "AWS_SHARED_CREDENTIALS_FILE");
        c2557a.invoke("aws.executionEnvironment", "AWS_EXECUTION_ENV");
        C2558b c2558b = (C2558b) c2557a.invoke("aws.profile", "AWS_PROFILE");
        InterfaceC2139c parse = c2558b.f13957a;
        String sysProp = c2558b.f13958b;
        String envVar = c2558b.f13959c;
        AbstractC4154l.m8923f(parse, "parse");
        AbstractC4154l.m8923f(sysProp, "sysProp");
        AbstractC4154l.m8923f(envVar, "envVar");
        f9250i = new C2558b(parse, sysProp, envVar, "default");
        C2557a c2557a2 = AbstractC2562f.f13964a;
        C2558b c2558b2 = (C2558b) c2557a2.invoke("aws.disableEc2Metadata", "AWS_EC2_METADATA_DISABLED");
        Boolean bool = Boolean.FALSE;
        InterfaceC2139c parse2 = c2558b2.f13957a;
        String sysProp2 = c2558b2.f13958b;
        String envVar2 = c2558b2.f13959c;
        AbstractC4154l.m8923f(parse2, "parse");
        AbstractC4154l.m8923f(sysProp2, "sysProp");
        AbstractC4154l.m8923f(envVar2, "envVar");
        f9251j = new C2558b(parse2, sysProp2, envVar2, bool);
        f9252k = (C2558b) c2557a.invoke("aws.ec2MetadataServiceEndpoint", "AWS_EC2_METADATA_SERVICE_ENDPOINT");
        f9253l = (C2558b) c2557a.invoke("aws.ec2MetadataServiceEndpointMode", "AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE");
        f9254m = (C2558b) c2557a.invoke("aws.ec2InstanceProfileName", "AWS_EC2_INSTANCE_PROFILE_NAME");
        f9255n = (C2558b) c2557a.invoke("aws.roleArn", "AWS_ROLE_ARN");
        f9256o = (C2558b) c2557a.invoke("aws.roleSessionName", "AWS_ROLE_SESSION_NAME");
        f9257p = (C2558b) c2557a.invoke("aws.webIdentityTokenFile", "AWS_WEB_IDENTITY_TOKEN_FILE");
        f9258q = (C2558b) c2557a.invoke("aws.containerCredentialsPath", "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI");
        f9259r = (C2558b) c2557a.invoke("aws.containerCredentialsFullUri", "AWS_CONTAINER_CREDENTIALS_FULL_URI");
        f9260s = (C2558b) c2557a.invoke("aws.containerAuthorizationToken", "AWS_CONTAINER_AUTHORIZATION_TOKEN");
        f9261t = (C2558b) c2557a.invoke("aws.containerAuthorizationTokenFile", "AWS_CONTAINER_AUTHORIZATION_TOKEN_FILE");
        f9262u = (C2558b) AbstractC2562f.f13965b.invoke("aws.maxAttempts", "AWS_MAX_ATTEMPTS");
        f9263v = new C2558b(C1975e.f9234b, "aws.retryMode", "AWS_RETRY_MODE", null);
        f9264w = (C2558b) c2557a2.invoke("aws.useFipsEndpoint", "AWS_USE_FIPS_ENDPOINT");
        f9265x = (C2558b) c2557a2.invoke("aws.useDualstackEndpoint", "AWS_USE_DUALSTACK_ENDPOINT");
        f9266y = new C2558b(new C0860j(1, C0109p.f374i, C0108o.class, "parse", "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;", 0, 1), "aws.endpointUrl", "AWS_ENDPOINT_URL", null);
        f9267z = (C2558b) c2557a2.invoke("aws.ignoreConfiguredEndpointUrls", "AWS_IGNORE_CONFIGURED_ENDPOINT_URLS");
        c2557a2.invoke("aws.disableRequestCompression", "AWS_DISABLE_REQUEST_COMPRESSION");
        AbstractC2562f.f13966c.invoke("aws.requestMinCompressionSizeBytes", "AWS_REQUEST_MIN_COMPRESSION_SIZE_BYTES");
        f9238A = (C2558b) c2557a.invoke("aws.sigV4aSigningRegionSet", "AWS_SIGV4A_SIGNING_REGION_SET");
        c2557a2.invoke("aws.endpointDiscoveryEnabled", "AWS_ENABLE_ENDPOINT_DISCOVERY");
        f9239B = new C2558b(C1975e.f9235c, "aws.requestChecksumCalculation", "AWS_REQUEST_CHECKSUM_CALCULATION", null);
        f9240C = new C2558b(C1975e.f9236d, "aws.responseChecksumValidation", "AWS_RESPONSE_CHECKSUM_VALIDATION", null);
        f9241D = (C2558b) c2557a.invoke("aws.authSchemePreference", "AWS_AUTH_SCHEME_PREFERENCE");
    }
}
