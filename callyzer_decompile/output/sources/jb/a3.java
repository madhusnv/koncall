package jb;

import ad.C0109p;
import ex.InterfaceC2141e;
import gb.C2555e;
import ib.C3221a;
import ib.C3222b;
import kotlin.jvm.internal.AbstractC4154l;
import og.ud;
import qw.C6361k;
import rw.AbstractC6674x;
import sc.C6804x;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a3 {

    /* renamed from: a */
    public static final Object f19445a = AbstractC6674x.m12778f(new C6361k("AbortMultipartUpload", C3714p.f19503a), new C6361k("CompleteMultipartUpload", a0.f19442a), new C6361k("CopyObject", l0.f19488a), new C6361k("CreateBucket", w0.f19532a), new C6361k("CreateBucketMetadataConfiguration", h1.f19473a), new C6361k("CreateBucketMetadataTableConfiguration", s1.f19517a), new C6361k("CreateMultipartUpload", d2.f19458a), new C6361k("CreateSession", o2.f19502a), new C6361k("DeleteBucket", z2.f19546a), new C6361k("DeleteBucketAnalyticsConfiguration", C3704f.f19463a), new C6361k("DeleteBucketCors", C3705g.f19467a), new C6361k("DeleteBucketEncryption", C3706h.f19471a), new C6361k("DeleteBucketIntelligentTieringConfiguration", C3707i.f19475a), new C6361k("DeleteBucketInventoryConfiguration", C3708j.f19479a), new C6361k("DeleteBucketLifecycle", C3709k.f19483a), new C6361k("DeleteBucketMetadataConfiguration", C3710l.f19487a), new C6361k("DeleteBucketMetadataTableConfiguration", C3711m.f19491a), new C6361k("DeleteBucketMetricsConfiguration", C3712n.f19495a), new C6361k("DeleteBucketOwnershipControls", C3713o.f19499a), new C6361k("DeleteBucketPolicy", C3715q.f19507a), new C6361k("DeleteBucketReplication", C3716r.f19511a), new C6361k("DeleteBucketTagging", C3717s.f19515a), new C6361k("DeleteBucketWebsite", C3718t.f19519a), new C6361k("DeleteObject", C3719u.f19523a), new C6361k("DeleteObjects", C3720v.f19527a), new C6361k("DeleteObjectTagging", C3721w.f19531a), new C6361k("DeletePublicAccessBlock", C3722x.f19535a), new C6361k("GetBucketAccelerateConfiguration", C3723y.f19539a), new C6361k("GetBucketAcl", C3724z.f19543a), new C6361k("GetBucketAnalyticsConfiguration", b0.f19447a), new C6361k("GetBucketCors", c0.f19452a), new C6361k("GetBucketEncryption", d0.f19456a), new C6361k("GetBucketIntelligentTieringConfiguration", e0.f19460a), new C6361k("GetBucketInventoryConfiguration", f0.f19464a), new C6361k("GetBucketLifecycleConfiguration", g0.f19468a), new C6361k("GetBucketLocation", h0.f19472a), new C6361k("GetBucketLogging", i0.f19476a), new C6361k("GetBucketMetadataConfiguration", j0.f19480a), new C6361k("GetBucketMetadataTableConfiguration", k0.f19484a), new C6361k("GetBucketMetricsConfiguration", m0.f19492a), new C6361k("GetBucketNotificationConfiguration", n0.f19496a), new C6361k("GetBucketOwnershipControls", o0.f19500a), new C6361k("GetBucketPolicy", p0.f19504a), new C6361k("GetBucketPolicyStatus", q0.f19508a), new C6361k("GetBucketReplication", r0.f19512a), new C6361k("GetBucketRequestPayment", s0.f19516a), new C6361k("GetBucketTagging", t0.f19520a), new C6361k("GetBucketVersioning", u0.f19524a), new C6361k("GetBucketWebsite", v0.f19528a), new C6361k("GetObject", x0.f19536a), new C6361k("GetObjectAcl", y0.f19540a), new C6361k("GetObjectAttributes", z0.f19544a), new C6361k("GetObjectLegalHold", a1.f19443a), new C6361k("GetObjectLockConfiguration", b1.f19448a), new C6361k("GetObjectRetention", c1.f19453a), new C6361k("GetObjectTagging", d1.f19457a), new C6361k("GetObjectTorrent", e1.f19461a), new C6361k("GetPublicAccessBlock", f1.f19465a), new C6361k("HeadBucket", g1.f19469a), new C6361k("HeadObject", i1.f19477a), new C6361k("ListBucketAnalyticsConfigurations", j1.f19481a), new C6361k("ListBucketIntelligentTieringConfigurations", k1.f19485a), new C6361k("ListBucketInventoryConfigurations", l1.f19489a), new C6361k("ListBucketMetricsConfigurations", m1.f19493a), new C6361k("ListDirectoryBuckets", n1.f19497a), new C6361k("ListMultipartUploads", o1.f19501a), new C6361k("ListObjects", p1.f19505a), new C6361k("ListObjectsV2", q1.f19509a), new C6361k("ListObjectVersions", r1.f19513a), new C6361k("ListParts", t1.f19521a), new C6361k("PutBucketAccelerateConfiguration", u1.f19525a), new C6361k("PutBucketAcl", v1.f19529a), new C6361k("PutBucketAnalyticsConfiguration", w1.f19533a), new C6361k("PutBucketCors", x1.f19537a), new C6361k("PutBucketEncryption", y1.f19541a), new C6361k("PutBucketIntelligentTieringConfiguration", z1.f19545a), new C6361k("PutBucketInventoryConfiguration", a2.f19444a), new C6361k("PutBucketLifecycleConfiguration", b2.f19449a), new C6361k("PutBucketLogging", c2.f19454a), new C6361k("PutBucketMetricsConfiguration", e2.f19462a), new C6361k("PutBucketNotificationConfiguration", f2.f19466a), new C6361k("PutBucketOwnershipControls", g2.f19470a), new C6361k("PutBucketPolicy", h2.f19474a), new C6361k("PutBucketReplication", i2.f19478a), new C6361k("PutBucketRequestPayment", j2.f19482a), new C6361k("PutBucketTagging", k2.f19486a), new C6361k("PutBucketVersioning", l2.f19490a), new C6361k("PutBucketWebsite", m2.f19494a), new C6361k("PutObject", n2.f19498a), new C6361k("PutObjectAcl", p2.f19506a), new C6361k("PutObjectLegalHold", q2.f19510a), new C6361k("PutObjectLockConfiguration", r2.f19514a), new C6361k("PutObjectRetention", s2.f19518a), new C6361k("PutObjectTagging", t2.f19522a), new C6361k("PutPublicAccessBlock", u2.f19526a), new C6361k("RenameObject", v2.f19530a), new C6361k("RestoreObject", w2.f19534a), new C6361k("SelectObjectContent", x2.f19538a), new C6361k("UpdateBucketMetadataInventoryTableConfiguration", y2.f19542a), new C6361k("UpdateBucketMetadataJournalTableConfiguration", C3700b.f19446a), new C6361k("UploadPart", C3701c.f19451a), new C6361k("UploadPartCopy", C3702d.f19455a), new C6361k("WriteGetObjectResponse", C3703e.f19459a));

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    /* renamed from: a */
    public static final C3222b m8270a(C2555e config, C6804x request) {
        AbstractC4154l.m8923f(config, "config");
        AbstractC4154l.m8923f(request, "request");
        C3221a c3221a = new C3221a();
        Boolean bool = Boolean.FALSE;
        c3221a.f17359a = bool;
        c3221a.f17361c = bool;
        c3221a.f17364f = bool;
        c3221a.f17369k = bool;
        c3221a.f17370l = bool;
        c3221a.f17371m = bool;
        c3221a.f17367i = config.f13935d;
        c3221a.f17370l = Boolean.valueOf(config.f13929F);
        c3221a.f17369k = Boolean.valueOf(config.f13928E);
        c3221a.f17364f = Boolean.valueOf(config.f13948s);
        c3221a.f17359a = Boolean.valueOf(config.f13943m);
        c3221a.f17371m = bool;
        c3221a.f17361c = Boolean.valueOf(config.f13941k);
        c3221a.f17368j = Boolean.valueOf(config.f13927D);
        C0109p c0109p = config.f13946q;
        c3221a.f17363e = c0109p != null ? c0109p.f382h : null;
        c3221a.f17362d = Boolean.valueOf(config.f13942l);
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) f19445a.get((String) ud.m10978d(request.f32335a, AbstractC8923q.f42882a));
        if (interfaceC2141e != null) {
            interfaceC2141e.invoke(c3221a, request);
        }
        return new C3222b(c3221a);
    }
}
