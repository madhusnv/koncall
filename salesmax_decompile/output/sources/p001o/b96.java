package p001o;

import java.util.Map;
import p001o.cxe;
import p001o.exe;

/* loaded from: classes3.dex */
public abstract class b96 {

    /* renamed from: a */
    public static final Map f15700a = isa.m32684k(vyh.m53620a("AbortMultipartUpload", C12313k.f15741a), vyh.m53620a("CompleteMultipartUpload", C12324v.f15780a), vyh.m53620a("CopyObject", g0.f15726a), vyh.m53620a("CreateBucket", r0.f15769a), vyh.m53620a("CreateMultipartUpload", c1.f15711a), vyh.m53620a("CreateSession", n1.f15755a), vyh.m53620a("DeleteBucket", y1.f15791a), vyh.m53620a("DeleteBucketAnalyticsConfiguration", j2.f15740a), vyh.m53620a("DeleteBucketCors", p2.f15764a), vyh.m53620a("DeleteBucketEncryption", C12303a.f15701a), vyh.m53620a("DeleteBucketIntelligentTieringConfiguration", C12304b.f15705a), vyh.m53620a("DeleteBucketInventoryConfiguration", C12305c.f15709a), vyh.m53620a("DeleteBucketLifecycle", C12306d.f15713a), vyh.m53620a("DeleteBucketMetricsConfiguration", C12307e.f15717a), vyh.m53620a("DeleteBucketOwnershipControls", C12308f.f15721a), vyh.m53620a("DeleteBucketPolicy", C12309g.f15725a), vyh.m53620a("DeleteBucketReplication", C12310h.f15729a), vyh.m53620a("DeleteBucketTagging", C12311i.f15733a), vyh.m53620a("DeleteBucketWebsite", C12312j.f15737a), vyh.m53620a("DeleteObject", C12314l.f15745a), vyh.m53620a("DeleteObjects", C12315m.f15749a), vyh.m53620a("DeleteObjectTagging", C12316n.f15753a), vyh.m53620a("DeletePublicAccessBlock", C12317o.f15757a), vyh.m53620a("GetBucketAccelerateConfiguration", C12318p.f15761a), vyh.m53620a("GetBucketAcl", C12319q.f15765a), vyh.m53620a("GetBucketAnalyticsConfiguration", C12320r.f15768a), vyh.m53620a("GetBucketCors", C12321s.f15771a), vyh.m53620a("GetBucketEncryption", C12322t.f15774a), vyh.m53620a("GetBucketIntelligentTieringConfiguration", C12323u.f15777a), vyh.m53620a("GetBucketInventoryConfiguration", C12325w.f15783a), vyh.m53620a("GetBucketLifecycleConfiguration", C12326x.f15786a), vyh.m53620a("GetBucketLocation", C12327y.f15789a), vyh.m53620a("GetBucketLogging", C12328z.f15792a), vyh.m53620a("GetBucketMetricsConfiguration", a0.f15702a), vyh.m53620a("GetBucketNotificationConfiguration", b0.f15706a), vyh.m53620a("GetBucketOwnershipControls", c0.f15710a), vyh.m53620a("GetBucketPolicy", d0.f15714a), vyh.m53620a("GetBucketPolicyStatus", e0.f15718a), vyh.m53620a("GetBucketReplication", f0.f15722a), vyh.m53620a("GetBucketRequestPayment", h0.f15730a), vyh.m53620a("GetBucketTagging", i0.f15734a), vyh.m53620a("GetBucketVersioning", j0.f15738a), vyh.m53620a("GetBucketWebsite", k0.f15742a), vyh.m53620a("GetObject", l0.f15746a), vyh.m53620a("GetObjectAcl", m0.f15750a), vyh.m53620a("GetObjectAttributes", n0.f15754a), vyh.m53620a("GetObjectLegalHold", o0.f15758a), vyh.m53620a("GetObjectLockConfiguration", p0.f15762a), vyh.m53620a("GetObjectRetention", q0.f15766a), vyh.m53620a("GetObjectTagging", s0.f15772a), vyh.m53620a("GetObjectTorrent", t0.f15775a), vyh.m53620a("GetPublicAccessBlock", u0.f15778a), vyh.m53620a("HeadBucket", v0.f15781a), vyh.m53620a("HeadObject", w0.f15784a), vyh.m53620a("ListBucketAnalyticsConfigurations", x0.f15787a), vyh.m53620a("ListBucketIntelligentTieringConfigurations", y0.f15790a), vyh.m53620a("ListBucketInventoryConfigurations", z0.f15793a), vyh.m53620a("ListBucketMetricsConfigurations", a1.f15703a), vyh.m53620a("ListDirectoryBuckets", b1.f15707a), vyh.m53620a("ListMultipartUploads", d1.f15715a), vyh.m53620a("ListObjects", e1.f15719a), vyh.m53620a("ListObjectsV2", f1.f15723a), vyh.m53620a("ListObjectVersions", g1.f15727a), vyh.m53620a("ListParts", h1.f15731a), vyh.m53620a("PutBucketAccelerateConfiguration", i1.f15735a), vyh.m53620a("PutBucketAcl", j1.f15739a), vyh.m53620a("PutBucketAnalyticsConfiguration", k1.f15743a), vyh.m53620a("PutBucketCors", l1.f15747a), vyh.m53620a("PutBucketEncryption", m1.f15751a), vyh.m53620a("PutBucketIntelligentTieringConfiguration", o1.f15759a), vyh.m53620a("PutBucketInventoryConfiguration", p1.f15763a), vyh.m53620a("PutBucketLifecycleConfiguration", q1.f15767a), vyh.m53620a("PutBucketLogging", r1.f15770a), vyh.m53620a("PutBucketMetricsConfiguration", s1.f15773a), vyh.m53620a("PutBucketNotificationConfiguration", t1.f15776a), vyh.m53620a("PutBucketOwnershipControls", u1.f15779a), vyh.m53620a("PutBucketPolicy", v1.f15782a), vyh.m53620a("PutBucketReplication", w1.f15785a), vyh.m53620a("PutBucketRequestPayment", x1.f15788a), vyh.m53620a("PutBucketTagging", z1.f15794a), vyh.m53620a("PutBucketVersioning", a2.f15704a), vyh.m53620a("PutBucketWebsite", b2.f15708a), vyh.m53620a("PutObject", c2.f15712a), vyh.m53620a("PutObjectAcl", d2.f15716a), vyh.m53620a("PutObjectLegalHold", e2.f15720a), vyh.m53620a("PutObjectLockConfiguration", f2.f15724a), vyh.m53620a("PutObjectRetention", g2.f15728a), vyh.m53620a("PutObjectTagging", h2.f15732a), vyh.m53620a("PutPublicAccessBlock", i2.f15736a), vyh.m53620a("RestoreObject", k2.f15744a), vyh.m53620a("SelectObjectContent", l2.f15748a), vyh.m53620a("UploadPart", m2.f15752a), vyh.m53620a("UploadPartCopy", n2.f15756a), vyh.m53620a("WriteGetObjectResponse", o2.f15760a));

    /* renamed from: o.b96$a */
    public /* synthetic */ class C12303a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12303a f15701a = new C12303a();

        public C12303a() {
            super(2, b96.class, "bindDeleteBucketEncryptionEndpointContext", "bindDeleteBucketEncryptionEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18342b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.Z0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18342b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class a0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final a0 f15702a = new a0();

        public a0() {
            super(2, b96.class, "bindGetBucketMetricsConfigurationEndpointContext", "bindGetBucketMetricsConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18343b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.y1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18343b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class a1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final a1 f15703a = new a1();

        public a1() {
            super(2, b96.class, "bindListBucketMetricsConfigurationsEndpointContext", "bindListBucketMetricsConfigurationsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18344b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.W1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18344b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class a2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final a2 f15704a = new a2();

        public a2() {
            super(2, b96.class, "bindPutBucketVersioningEndpointContext", "bindPutBucketVersioningEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18345b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.t2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18345b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$b */
    public /* synthetic */ class C12304b extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12304b f15705a = new C12304b();

        public C12304b() {
            super(2, b96.class, "bindDeleteBucketIntelligentTieringConfigurationEndpointContext", "bindDeleteBucketIntelligentTieringConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18346b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.b1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18346b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class b0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final b0 f15706a = new b0();

        public b0() {
            super(2, b96.class, "bindGetBucketNotificationConfigurationEndpointContext", "bindGetBucketNotificationConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18347b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.z1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18347b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class b1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final b1 f15707a = new b1();

        public b1() {
            super(2, b96.class, "bindListDirectoryBucketsEndpointContext", "bindListDirectoryBucketsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18348b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.X1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18348b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class b2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final b2 f15708a = new b2();

        public b2() {
            super(2, b96.class, "bindPutBucketWebsiteEndpointContext", "bindPutBucketWebsiteEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18349b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.u2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18349b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$c */
    public /* synthetic */ class C12305c extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12305c f15709a = new C12305c();

        public C12305c() {
            super(2, b96.class, "bindDeleteBucketInventoryConfigurationEndpointContext", "bindDeleteBucketInventoryConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18350b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.c1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18350b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class c0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final c0 f15710a = new c0();

        public c0() {
            super(2, b96.class, "bindGetBucketOwnershipControlsEndpointContext", "bindGetBucketOwnershipControlsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18351b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.A1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18351b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class c1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final c1 f15711a = new c1();

        public c1() {
            super(2, b96.class, "bindCreateMultipartUploadEndpointContext", "bindCreateMultipartUploadEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18352b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.V0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18352b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class c2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final c2 f15712a = new c2();

        public c2() {
            super(2, b96.class, "bindPutObjectEndpointContext", "bindPutObjectEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18353b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.w2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18353b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$d */
    public /* synthetic */ class C12306d extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12306d f15713a = new C12306d();

        public C12306d() {
            super(2, b96.class, "bindDeleteBucketLifecycleEndpointContext", "bindDeleteBucketLifecycleEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18354b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.d1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18354b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class d0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final d0 f15714a = new d0();

        public d0() {
            super(2, b96.class, "bindGetBucketPolicyEndpointContext", "bindGetBucketPolicyEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18355b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.B1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18355b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class d1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final d1 f15715a = new d1();

        public d1() {
            super(2, b96.class, "bindListMultipartUploadsEndpointContext", "bindListMultipartUploadsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18356b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.Y1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18356b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class d2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final d2 f15716a = new d2();

        public d2() {
            super(2, b96.class, "bindPutObjectAclEndpointContext", "bindPutObjectAclEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18357b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.v2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18357b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$e */
    public /* synthetic */ class C12307e extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12307e f15717a = new C12307e();

        public C12307e() {
            super(2, b96.class, "bindDeleteBucketMetricsConfigurationEndpointContext", "bindDeleteBucketMetricsConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18358b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.e1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18358b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class e0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final e0 f15718a = new e0();

        public e0() {
            super(2, b96.class, "bindGetBucketPolicyStatusEndpointContext", "bindGetBucketPolicyStatusEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18359b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.C1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18359b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class e1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final e1 f15719a = new e1();

        public e1() {
            super(2, b96.class, "bindListObjectsEndpointContext", "bindListObjectsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18360b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.a2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18360b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class e2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final e2 f15720a = new e2();

        public e2() {
            super(2, b96.class, "bindPutObjectLegalHoldEndpointContext", "bindPutObjectLegalHoldEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18361b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.x2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18361b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$f */
    public /* synthetic */ class C12308f extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12308f f15721a = new C12308f();

        public C12308f() {
            super(2, b96.class, "bindDeleteBucketOwnershipControlsEndpointContext", "bindDeleteBucketOwnershipControlsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18362b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.f1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18362b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class f0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final f0 f15722a = new f0();

        public f0() {
            super(2, b96.class, "bindGetBucketReplicationEndpointContext", "bindGetBucketReplicationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18363b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.D1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18363b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class f1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final f1 f15723a = new f1();

        public f1() {
            super(2, b96.class, "bindListObjectsV2EndpointContext", "bindListObjectsV2EndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18364b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.b2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18364b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class f2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final f2 f15724a = new f2();

        public f2() {
            super(2, b96.class, "bindPutObjectLockConfigurationEndpointContext", "bindPutObjectLockConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18365b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.y2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18365b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$g */
    public /* synthetic */ class C12309g extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12309g f15725a = new C12309g();

        public C12309g() {
            super(2, b96.class, "bindDeleteBucketPolicyEndpointContext", "bindDeleteBucketPolicyEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18366b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.g1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18366b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class g0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final g0 f15726a = new g0();

        public g0() {
            super(2, b96.class, "bindCopyObjectEndpointContext", "bindCopyObjectEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18367b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.T0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18367b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class g1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final g1 f15727a = new g1();

        public g1() {
            super(2, b96.class, "bindListObjectVersionsEndpointContext", "bindListObjectVersionsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18368b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.Z1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18368b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class g2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final g2 f15728a = new g2();

        public g2() {
            super(2, b96.class, "bindPutObjectRetentionEndpointContext", "bindPutObjectRetentionEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18369b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.z2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18369b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$h */
    public /* synthetic */ class C12310h extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12310h f15729a = new C12310h();

        public C12310h() {
            super(2, b96.class, "bindDeleteBucketReplicationEndpointContext", "bindDeleteBucketReplicationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18370b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.h1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18370b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class h0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final h0 f15730a = new h0();

        public h0() {
            super(2, b96.class, "bindGetBucketRequestPaymentEndpointContext", "bindGetBucketRequestPaymentEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18371b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.E1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18371b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class h1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final h1 f15731a = new h1();

        public h1() {
            super(2, b96.class, "bindListPartsEndpointContext", "bindListPartsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18372b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.c2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18372b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class h2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final h2 f15732a = new h2();

        public h2() {
            super(2, b96.class, "bindPutObjectTaggingEndpointContext", "bindPutObjectTaggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18373b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.A2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18373b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$i */
    public /* synthetic */ class C12311i extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12311i f15733a = new C12311i();

        public C12311i() {
            super(2, b96.class, "bindDeleteBucketTaggingEndpointContext", "bindDeleteBucketTaggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18374b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.i1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18374b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class i0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final i0 f15734a = new i0();

        public i0() {
            super(2, b96.class, "bindGetBucketTaggingEndpointContext", "bindGetBucketTaggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18375b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.F1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18375b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class i1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final i1 f15735a = new i1();

        public i1() {
            super(2, b96.class, "bindPutBucketAccelerateConfigurationEndpointContext", "bindPutBucketAccelerateConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18376b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.d2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18376b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class i2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final i2 f15736a = new i2();

        public i2() {
            super(2, b96.class, "bindPutPublicAccessBlockEndpointContext", "bindPutPublicAccessBlockEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18377b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.B2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18377b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$j */
    public /* synthetic */ class C12312j extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12312j f15737a = new C12312j();

        public C12312j() {
            super(2, b96.class, "bindDeleteBucketWebsiteEndpointContext", "bindDeleteBucketWebsiteEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18378b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.j1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18378b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class j0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final j0 f15738a = new j0();

        public j0() {
            super(2, b96.class, "bindGetBucketVersioningEndpointContext", "bindGetBucketVersioningEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18379b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.G1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18379b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class j1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final j1 f15739a = new j1();

        public j1() {
            super(2, b96.class, "bindPutBucketAclEndpointContext", "bindPutBucketAclEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18380b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.e2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18380b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class j2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final j2 f15740a = new j2();

        public j2() {
            super(2, b96.class, "bindDeleteBucketAnalyticsConfigurationEndpointContext", "bindDeleteBucketAnalyticsConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18381b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.X0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18381b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$k */
    public /* synthetic */ class C12313k extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12313k f15741a = new C12313k();

        public C12313k() {
            super(2, b96.class, "bindAbortMultipartUploadEndpointContext", "bindAbortMultipartUploadEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18382b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.Q0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18382b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class k0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final k0 f15742a = new k0();

        public k0() {
            super(2, b96.class, "bindGetBucketWebsiteEndpointContext", "bindGetBucketWebsiteEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18383b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.H1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18383b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class k1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final k1 f15743a = new k1();

        public k1() {
            super(2, b96.class, "bindPutBucketAnalyticsConfigurationEndpointContext", "bindPutBucketAnalyticsConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18384b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.f2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18384b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class k2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final k2 f15744a = new k2();

        public k2() {
            super(2, b96.class, "bindRestoreObjectEndpointContext", "bindRestoreObjectEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18385b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.C2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18385b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$l */
    public /* synthetic */ class C12314l extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12314l f15745a = new C12314l();

        public C12314l() {
            super(2, b96.class, "bindDeleteObjectEndpointContext", "bindDeleteObjectEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18386b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.k1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18386b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class l0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final l0 f15746a = new l0();

        public l0() {
            super(2, b96.class, "bindGetObjectEndpointContext", "bindGetObjectEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18387b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.K1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18387b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class l1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final l1 f15747a = new l1();

        public l1() {
            super(2, b96.class, "bindPutBucketCorsEndpointContext", "bindPutBucketCorsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18388b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.g2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18388b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class l2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final l2 f15748a = new l2();

        public l2() {
            super(2, b96.class, "bindSelectObjectContentEndpointContext", "bindSelectObjectContentEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18389b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.D2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18389b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$m */
    public /* synthetic */ class C12315m extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12315m f15749a = new C12315m();

        public C12315m() {
            super(2, b96.class, "bindDeleteObjectsEndpointContext", "bindDeleteObjectsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18390b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.m1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18390b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class m0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final m0 f15750a = new m0();

        public m0() {
            super(2, b96.class, "bindGetObjectAclEndpointContext", "bindGetObjectAclEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18391b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.I1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18391b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class m1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final m1 f15751a = new m1();

        public m1() {
            super(2, b96.class, "bindPutBucketEncryptionEndpointContext", "bindPutBucketEncryptionEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18392b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.h2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18392b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class m2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final m2 f15752a = new m2();

        public m2() {
            super(2, b96.class, "bindUploadPartEndpointContext", "bindUploadPartEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18393b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.F2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18393b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$n */
    public /* synthetic */ class C12316n extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12316n f15753a = new C12316n();

        public C12316n() {
            super(2, b96.class, "bindDeleteObjectTaggingEndpointContext", "bindDeleteObjectTaggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18394b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.l1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18394b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class n0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final n0 f15754a = new n0();

        public n0() {
            super(2, b96.class, "bindGetObjectAttributesEndpointContext", "bindGetObjectAttributesEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18395b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.J1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18395b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class n1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final n1 f15755a = new n1();

        public n1() {
            super(2, b96.class, "bindCreateSessionEndpointContext", "bindCreateSessionEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18396b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.W0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18396b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class n2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final n2 f15756a = new n2();

        public n2() {
            super(2, b96.class, "bindUploadPartCopyEndpointContext", "bindUploadPartCopyEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18397b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.E2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18397b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$o */
    public /* synthetic */ class C12317o extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12317o f15757a = new C12317o();

        public C12317o() {
            super(2, b96.class, "bindDeletePublicAccessBlockEndpointContext", "bindDeletePublicAccessBlockEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18398b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.n1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18398b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class o0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final o0 f15758a = new o0();

        public o0() {
            super(2, b96.class, "bindGetObjectLegalHoldEndpointContext", "bindGetObjectLegalHoldEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18399b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.L1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18399b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class o1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final o1 f15759a = new o1();

        public o1() {
            super(2, b96.class, "bindPutBucketIntelligentTieringConfigurationEndpointContext", "bindPutBucketIntelligentTieringConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18400b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.i2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18400b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class o2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final o2 f15760a = new o2();

        public o2() {
            super(2, b96.class, "bindWriteGetObjectResponseEndpointContext", "bindWriteGetObjectResponseEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18401b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.G2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18401b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$p */
    public /* synthetic */ class C12318p extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12318p f15761a = new C12318p();

        public C12318p() {
            super(2, b96.class, "bindGetBucketAccelerateConfigurationEndpointContext", "bindGetBucketAccelerateConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18402b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.o1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18402b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class p0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final p0 f15762a = new p0();

        public p0() {
            super(2, b96.class, "bindGetObjectLockConfigurationEndpointContext", "bindGetObjectLockConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18403b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.M1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18403b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class p1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final p1 f15763a = new p1();

        public p1() {
            super(2, b96.class, "bindPutBucketInventoryConfigurationEndpointContext", "bindPutBucketInventoryConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18404b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.j2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18404b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class p2 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final p2 f15764a = new p2();

        public p2() {
            super(2, b96.class, "bindDeleteBucketCorsEndpointContext", "bindDeleteBucketCorsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18405b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.Y0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18405b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$q */
    public /* synthetic */ class C12319q extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12319q f15765a = new C12319q();

        public C12319q() {
            super(2, b96.class, "bindGetBucketAclEndpointContext", "bindGetBucketAclEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18406b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.p1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18406b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class q0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final q0 f15766a = new q0();

        public q0() {
            super(2, b96.class, "bindGetObjectRetentionEndpointContext", "bindGetObjectRetentionEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18407b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.N1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18407b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class q1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final q1 f15767a = new q1();

        public q1() {
            super(2, b96.class, "bindPutBucketLifecycleConfigurationEndpointContext", "bindPutBucketLifecycleConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18408b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.k2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18408b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$r */
    public /* synthetic */ class C12320r extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12320r f15768a = new C12320r();

        public C12320r() {
            super(2, b96.class, "bindGetBucketAnalyticsConfigurationEndpointContext", "bindGetBucketAnalyticsConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18409b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.q1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18409b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class r0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final r0 f15769a = new r0();

        public r0() {
            super(2, b96.class, "bindCreateBucketEndpointContext", "bindCreateBucketEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18410b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.U0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18410b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class r1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final r1 f15770a = new r1();

        public r1() {
            super(2, b96.class, "bindPutBucketLoggingEndpointContext", "bindPutBucketLoggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18411b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.l2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18411b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$s */
    public /* synthetic */ class C12321s extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12321s f15771a = new C12321s();

        public C12321s() {
            super(2, b96.class, "bindGetBucketCorsEndpointContext", "bindGetBucketCorsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18412b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.r1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18412b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class s0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final s0 f15772a = new s0();

        public s0() {
            super(2, b96.class, "bindGetObjectTaggingEndpointContext", "bindGetObjectTaggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18413b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.O1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18413b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class s1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final s1 f15773a = new s1();

        public s1() {
            super(2, b96.class, "bindPutBucketMetricsConfigurationEndpointContext", "bindPutBucketMetricsConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18414b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.m2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18414b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$t */
    public /* synthetic */ class C12322t extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12322t f15774a = new C12322t();

        public C12322t() {
            super(2, b96.class, "bindGetBucketEncryptionEndpointContext", "bindGetBucketEncryptionEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18415b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.s1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18415b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class t0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final t0 f15775a = new t0();

        public t0() {
            super(2, b96.class, "bindGetObjectTorrentEndpointContext", "bindGetObjectTorrentEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18416b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.P1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18416b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class t1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final t1 f15776a = new t1();

        public t1() {
            super(2, b96.class, "bindPutBucketNotificationConfigurationEndpointContext", "bindPutBucketNotificationConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18417b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.n2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18417b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$u */
    public /* synthetic */ class C12323u extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12323u f15777a = new C12323u();

        public C12323u() {
            super(2, b96.class, "bindGetBucketIntelligentTieringConfigurationEndpointContext", "bindGetBucketIntelligentTieringConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18418b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.t1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18418b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class u0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final u0 f15778a = new u0();

        public u0() {
            super(2, b96.class, "bindGetPublicAccessBlockEndpointContext", "bindGetPublicAccessBlockEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18419b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.Q1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18419b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class u1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final u1 f15779a = new u1();

        public u1() {
            super(2, b96.class, "bindPutBucketOwnershipControlsEndpointContext", "bindPutBucketOwnershipControlsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18420b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.o2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18420b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$v */
    public /* synthetic */ class C12324v extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12324v f15780a = new C12324v();

        public C12324v() {
            super(2, b96.class, "bindCompleteMultipartUploadEndpointContext", "bindCompleteMultipartUploadEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18421b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.S0(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18421b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class v0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final v0 f15781a = new v0();

        public v0() {
            super(2, b96.class, "bindHeadBucketEndpointContext", "bindHeadBucketEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18422b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.R1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18422b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class v1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final v1 f15782a = new v1();

        public v1() {
            super(2, b96.class, "bindPutBucketPolicyEndpointContext", "bindPutBucketPolicyEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18423b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.p2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18423b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$w */
    public /* synthetic */ class C12325w extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12325w f15783a = new C12325w();

        public C12325w() {
            super(2, b96.class, "bindGetBucketInventoryConfigurationEndpointContext", "bindGetBucketInventoryConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18424b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.u1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18424b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class w0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final w0 f15784a = new w0();

        public w0() {
            super(2, b96.class, "bindHeadObjectEndpointContext", "bindHeadObjectEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18425b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.S1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18425b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class w1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final w1 f15785a = new w1();

        public w1() {
            super(2, b96.class, "bindPutBucketReplicationEndpointContext", "bindPutBucketReplicationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18426b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.q2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18426b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$x */
    public /* synthetic */ class C12326x extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12326x f15786a = new C12326x();

        public C12326x() {
            super(2, b96.class, "bindGetBucketLifecycleConfigurationEndpointContext", "bindGetBucketLifecycleConfigurationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18427b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.v1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18427b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class x0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final x0 f15787a = new x0();

        public x0() {
            super(2, b96.class, "bindListBucketAnalyticsConfigurationsEndpointContext", "bindListBucketAnalyticsConfigurationsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18428b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.T1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18428b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class x1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final x1 f15788a = new x1();

        public x1() {
            super(2, b96.class, "bindPutBucketRequestPaymentEndpointContext", "bindPutBucketRequestPaymentEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18429b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.r2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18429b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$y */
    public /* synthetic */ class C12327y extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12327y f15789a = new C12327y();

        public C12327y() {
            super(2, b96.class, "bindGetBucketLocationEndpointContext", "bindGetBucketLocationEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18430b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.w1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18430b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class y0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final y0 f15790a = new y0();

        public y0() {
            super(2, b96.class, "bindListBucketIntelligentTieringConfigurationsEndpointContext", "bindListBucketIntelligentTieringConfigurationsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18431b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.U1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18431b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class y1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final y1 f15791a = new y1();

        public y1() {
            super(2, b96.class, "bindDeleteBucketEndpointContext", "bindDeleteBucketEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18432b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.a1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18432b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.b96$z */
    public /* synthetic */ class C12328z extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12328z f15792a = new C12328z();

        public C12328z() {
            super(2, b96.class, "bindGetBucketLoggingEndpointContext", "bindGetBucketLoggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18433b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.x1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18433b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class z0 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final z0 f15793a = new z0();

        public z0() {
            super(2, b96.class, "bindListBucketInventoryConfigurationsEndpointContext", "bindListBucketInventoryConfigurationsEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18434b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.V1(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18434b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ class z1 extends dm7 implements nl7 {

        /* renamed from: a */
        public static final z1 f15794a = new z1();

        public z1() {
            super(2, b96.class, "bindPutBucketTaggingEndpointContext", "bindPutBucketTaggingEndpointContext(Laws/sdk/kotlin/services/s3/endpoints/S3EndpointParameters$Builder;Laws/smithy/kotlin/runtime/http/operation/ResolveEndpointRequest;)V", 1);
        }

        /* renamed from: b */
        public final void m18435b(exe.C13281a c13281a, rne rneVar) {
            sq8.m48649h(c13281a, "p0");
            sq8.m48649h(rneVar, "p1");
            b96.s2(c13281a, rneVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18435b((exe.C13281a) obj, (rne) obj2);
            return y3i.f54824a;
        }
    }

    public static final void A1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketOwnershipControlsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void A2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutObjectTaggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void B1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketPolicyRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void B2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutPublicAccessBlockRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void C1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketPolicyStatusRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void C2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.RestoreObjectRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void D1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketReplicationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void D2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.SelectObjectContentRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void E1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketRequestPaymentRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void E2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.UploadPartCopyRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void F1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketTaggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void F2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.UploadPartRequest");
        c7i c7iVar = (c7i) objM50737b;
        c13281a.m25762t(c7iVar.m20378b());
        c13281a.m25767y(c7iVar.m20387k());
    }

    public static final void G1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketVersioningRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void G2(exe.C13281a c13281a, rne rneVar) {
        c13281a.m25741F(Boolean.TRUE);
    }

    public static final void H1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketWebsiteRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final exe H2(cxe.C12766c c12766c, rne rneVar) {
        sq8.m48649h(c12766c, "config");
        sq8.m48649h(rneVar, "request");
        exe.C13282b c13282b = exe.f22302r;
        exe.C13281a c13281a = new exe.C13281a();
        c13281a.m25736A(c12766c.m21994s());
        R0(c13281a, c12766c, rneVar);
        l8i l8iVarM21989n = c12766c.m21989n();
        c13281a.m25765w(l8iVarM21989n != null ? l8iVarM21989n.toString() : null);
        c13281a.m25764v(Boolean.valueOf(c12766c.m21985j()));
        nl7 nl7Var = (nl7) f15700a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c13281a, rneVar);
        }
        return c13281a.m25743a();
    }

    public static final void I1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectAclRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void J1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectAttributesRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void K1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectRequest");
        wq7 wq7Var = (wq7) objM50737b;
        c13281a.m25762t(wq7Var.m54808a());
        c13281a.m25767y(wq7Var.m54815h());
    }

    public static final void L1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectLegalHoldRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void M1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectLockConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void N1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectRetentionRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void O1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectTaggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void P1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetObjectTorrentRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void Q0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.AbortMultipartUploadRequest");
        e6 e6Var = (e6) objM50737b;
        c13281a.m25762t(e6Var.m24352a());
        c13281a.m25767y(e6Var.m24355d());
    }

    public static final void Q1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetPublicAccessBlockRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void R0(exe.C13281a c13281a, cxe.C12766c c12766c, rne rneVar) {
        c13281a.m25739D(Boolean.valueOf(c12766c.m22000y()));
        c13281a.m25738C(Boolean.valueOf(c12766c.m21999x()));
        c13281a.m25766x(Boolean.valueOf(c12766c.m21991p()));
        c13281a.m25761s(Boolean.valueOf(c12766c.m21986k()));
        c13281a.m25740E(Boolean.FALSE);
        c13281a.m25763u(Boolean.valueOf(c12766c.m21984i()));
        c13281a.m25737B(Boolean.valueOf(c12766c.m21998w()));
    }

    public static final void R1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.HeadBucketRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void S0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.CompleteMultipartUploadRequest");
        am3 am3Var = (am3) objM50737b;
        c13281a.m25762t(am3Var.m17403a());
        c13281a.m25767y(am3Var.m17410h());
    }

    public static final void S1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.HeadObjectRequest");
        qx7 qx7Var = (qx7) objM50737b;
        c13281a.m25762t(qx7Var.m45904a());
        c13281a.m25767y(qx7Var.m45911h());
    }

    public static final void T0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.CopyObjectRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void T1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListBucketAnalyticsConfigurationsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void U0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.CreateBucketRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void U1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListBucketIntelligentTieringConfigurationsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void V0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.CreateMultipartUploadRequest");
        ca4 ca4Var = (ca4) objM50737b;
        c13281a.m25762t(ca4Var.m20553b());
        c13281a.m25767y(ca4Var.m20567p());
    }

    public static final void V1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListBucketInventoryConfigurationsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void W0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.CreateSessionRequest");
        c13281a.m25762t(((ma4) objM50737b).m38614a());
        c13281a.m25764v(Boolean.TRUE);
    }

    public static final void W1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListBucketMetricsConfigurationsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void X0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketAnalyticsConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void X1(exe.C13281a c13281a, rne rneVar) {
        c13281a.m25742G(Boolean.TRUE);
    }

    public static final void Y0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketCorsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void Y1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListMultipartUploadsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void Z0(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketEncryptionRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void Z1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListObjectVersionsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void a1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void a2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListObjectsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void b1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketIntelligentTieringConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void b2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListObjectsV2Request");
        efa efaVar = (efa) objM50737b;
        c13281a.m25762t(efaVar.m24926a());
        c13281a.m25768z(efaVar.m24934i());
    }

    public static final void c1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketInventoryConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void c2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.ListPartsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void d1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketLifecycleRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void d2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketAccelerateConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void e1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketMetricsConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void e2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketAclRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void f1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketOwnershipControlsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void f2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketAnalyticsConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void g1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketPolicyRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void g2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketCorsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void h1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketReplicationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void h2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketEncryptionRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void i1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketTaggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void i2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketIntelligentTieringConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void j1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteBucketWebsiteRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void j2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketInventoryConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void k1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteObjectRequest");
        fl5 fl5Var = (fl5) objM50737b;
        c13281a.m25762t(fl5Var.m26992a());
        c13281a.m25767y(fl5Var.m26998g());
    }

    public static final void k2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketLifecycleConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void l1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteObjectTaggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void l2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketLoggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void m1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeleteObjectsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void m2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketMetricsConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void n1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.DeletePublicAccessBlockRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void n2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketNotificationConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void o1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketAccelerateConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void o2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketOwnershipControlsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void p1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketAclRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void p2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketPolicyRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void q1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketAnalyticsConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void q2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketReplicationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void r1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketCorsRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void r2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketRequestPaymentRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void s1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketEncryptionRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void s2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketTaggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void t1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketIntelligentTieringConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void t2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketVersioningRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void u1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketInventoryConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void u2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutBucketWebsiteRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void v1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketLifecycleConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void v2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutObjectAclRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void w1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketLocationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void w2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutObjectRequest");
        s3e s3eVar = (s3e) objM50737b;
        c13281a.m25762t(s3eVar.m47591c());
        c13281a.m25767y(s3eVar.m47612x());
    }

    public static final void x1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketLoggingRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void x2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutObjectLegalHoldRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void y1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketMetricsConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void y2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutObjectLockConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void z1(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.GetBucketNotificationConfigurationRequest");
        tq.m50332a(objM50737b);
        throw null;
    }

    public static final void z2(exe.C13281a c13281a, rne rneVar) {
        Object objM50737b = tx0.m50737b(rneVar.m47005a(), s38.f44646a.m47571g());
        sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.model.PutObjectRetentionRequest");
        tq.m50332a(objM50737b);
        throw null;
    }
}
