package gb;

import a9.C0073l;
import bd.C0645a;
import cd.C0959n;
import cj.C0979e;
import ec.C2003a;
import ec.C2005c;
import ec.C2011i;
import i0.m0;
import i9.n0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.i0;
import k4.C4001v;
import kc.C4054i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import l1.C4327p;
import lb.C4435a;
import ld.C4446f;
import ld.InterfaceC4447g;
import lv.C4535g;
import mb.v0;
import mb.x0;
import na.C4979a;
import na.C4980b;
import nc.InterfaceC4991b;
import nf.C5047i;
import oa.C5331c;
import og.kf;
import og.s1;
import og.ud;
import p9.C5866a;
import pa.C5868b;
import pa.EnumC5867a;
import qa.C6150a;
import qd.EnumC6183c;
import rb.C6489b;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import sc.C6797q;
import sc.C6801u;
import tb.AbstractC7094e;
import tb.AbstractC7107r;
import tb.EnumC7092c;
import v0.C7622f;
import vb.AbstractC7694a;
import wc.AbstractC7984r;
import ww.AbstractC8199i;
import yb.AbstractC8610b;
import yb.EnumC8611c;
import yk.C8687a;
import zb.AbstractC8923q;
import zj.C8986c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gb.b */
/* loaded from: classes.dex */
public final class C2552b implements InterfaceC2556f {

    /* renamed from: a */
    public final C2555e f13884a;

    /* renamed from: b */
    public final C7622f f13885b;

    /* renamed from: c */
    public final i0 f13886c;

    /* renamed from: d */
    public final C8989c f13887d;

    /* renamed from: e */
    public final Map f13888e;

    /* renamed from: f */
    public final C8986c f13889f;

    /* renamed from: g */
    public final String f13890g;

    /* renamed from: h */
    public final C6801u f13891h;

    /* renamed from: j */
    public final C4980b f13892j;

    public C2552b(C2555e config) {
        AbstractC4154l.m8923f(config, "config");
        this.f13884a = config;
        C7622f c7622f = new C7622f(4);
        this.f13885b = c7622f;
        C4001v c4001v = config.f13932a;
        this.f13886c = new i0((InterfaceC4991b) c4001v.f20704b);
        this.f13887d = new C8989c(config);
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(config.f13938g, 10));
        LinkedHashMap linkedHashMapM12786n = AbstractC6674x.m12786n(new LinkedHashMap(iM12776d < 16 ? 16 : iM12776d));
        C6489b c6489b = new C6489b("aws.auth#sigv4");
        if (linkedHashMapM12786n.get(c6489b) == null) {
            linkedHashMapM12786n.put(c6489b, new C4054i("s3", AbstractC7107r.f34293a));
        }
        C6489b c6489b2 = new C6489b("aws.auth#sigv4a");
        if (linkedHashMapM12786n.get(c6489b2) == null) {
            linkedHashMapM12786n.put(c6489b2, new C4054i(AbstractC7107r.f34293a, 0));
        }
        C6489b c6489b3 = new C6489b("aws.auth#sigv4s3express");
        if (linkedHashMapM12786n.get(c6489b3) == null) {
            linkedHashMapM12786n.put(c6489b3, new C4054i(AbstractC7107r.f34293a, 2));
        }
        this.f13888e = AbstractC6674x.m12785m(linkedHashMapM12786n);
        this.f13889f = new C8986c(config);
        this.f13890g = "aws.sdk.kotlin.services.s3";
        this.f13891h = new C6801u("aws.sdk.kotlin.services.s3", config.f13926C);
        AbstractC7984r.m15157a(c7622f, (InterfaceC4991b) c4001v.f20704b);
        AbstractC7984r.m15157a(c7622f, config.f13947r);
        AbstractC7984r.m15157a(c7622f, config.f13940j);
        this.f13892j = s1.m10886a(new C4979a("S3", "1.5.0"), config.f13930G);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13885b.m14520y();
    }

    /* renamed from: h */
    public final Object m6570h(v0 v0Var, AbstractC8199i abstractC8199i) {
        C4147e c4147eM8901a = a0.m8901a(v0.class);
        C4147e c4147eM8901a2 = a0.m8901a(x0.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C8687a c8687a = new C8687a(24);
        C5866a c5866a = new C5866a(7);
        C2555e c2555e = this.f13884a;
        c0073l.m202L(c2555e.f13926C);
        c0073l.f268e = this.f13890g;
        c0073l.m201K(this.f13891h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f13889f, this.f13888e, this.f13887d);
        c4535g.f22543g = new C5047i(c2555e);
        c4535g.m9393k((C0959n) c2555e.f13933b.f36778a);
        c4535g.m9392j(c2555e.f13954z);
        c0645a.mo1862b(AbstractC8923q.f42882a, "ListObjectsV2");
        C0979e c0979e = new C0979e(c4535g, c0645a, c8687a, c5866a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "S3", c4147eM8901a, c4147eM8901a2), c0073l);
        m6571j(c0645a);
        c0979e.m2783r(new C6150a());
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        arrayList.add(C5331c.f26228a);
        int i10 = AbstractC2551a.f13882a[c2555e.f13953y.ordinal()];
        if (i10 == 1) {
            AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED);
        }
        arrayList.add(C4435a.f22156c);
        c0645a.mo1862b(AbstractC2553c.f13894b, this);
        String str = v0Var.f23497a;
        if (str != null) {
            c0645a.mo1862b(AbstractC2553c.f13893a, str);
        }
        arrayList.add(new C5868b(0));
        if (c2555e.f13940j instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        m0.m7367D(new C4327p(this.f13892j), c0979e, c0979e);
        arrayList.addAll(c2555e.f13950v);
        return kf.m10740e(c0979e, this.f13886c, v0Var, abstractC8199i);
    }

    /* renamed from: j */
    public final void m6571j(C0645a c0645a) {
        C2003a c2003a = AbstractC8923q.f42884c;
        C2555e c2555e = this.f13884a;
        ud.m10981g(c0645a, c2003a, c2555e.f13934c);
        ud.m10981g(c0645a, AbstractC8923q.f42886e, c2555e.f13951w);
        ud.m10982h(c0645a, AbstractC8923q.f42885d, c2555e.f13949t);
        C2003a c2003a2 = AbstractC7694a.f37196a;
        String str = c2555e.f13935d;
        ud.m10982h(c0645a, c2003a2, str);
        ud.m10982h(c0645a, AbstractC7094e.f34211a, str);
        ud.m10981g(c0645a, AbstractC7094e.f34214d, "s3");
        ud.m10981g(c0645a, AbstractC7094e.f34216f, c2555e.f13940j);
        ud.m10982h(c0645a, AbstractC7094e.f34213c, c2555e.f13925B);
        C2003a c2003a3 = AbstractC7094e.f34221k;
        Boolean bool = Boolean.FALSE;
        ud.m10981g(c0645a, c2003a3, bool);
        ud.m10981g(c0645a, AbstractC7094e.f34220j, bool);
        ud.m10981g(c0645a, AbstractC7094e.f34218h, EnumC7092c.X_AMZ_CONTENT_SHA256);
        ud.m10981g(c0645a, AbstractC7094e.f34222l, Boolean.valueOf(c2555e.f13944n));
    }
}
