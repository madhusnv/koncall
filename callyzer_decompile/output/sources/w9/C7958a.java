package w9;

import a9.C0073l;
import aa.C0074a;
import aa.C0075b;
import aa.C0076c;
import aa.C0077d;
import ba.C0631a;
import bd.C0645a;
import cd.C0959n;
import cj.C0979e;
import com.amplifyframework.storage.ObjectMetadata;
import ec.C2003a;
import ec.C2005c;
import ec.C2011i;
import i0.m0;
import i9.n0;
import i9.p0;
import i9.r0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.C3733i;
import jc.i0;
import k4.C4001v;
import kc.C4046a;
import kc.C4054i;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import l1.C4327p;
import l4.C4367l;
import ld.C4446f;
import ld.InterfaceC4447g;
import lv.C4535g;
import na.C4979a;
import na.C4980b;
import nc.InterfaceC4991b;
import ng.C5070u;
import oa.C5331c;
import og.kf;
import og.s1;
import og.ud;
import oj.C5392d;
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
import v0.C7622f;
import vb.AbstractC7694a;
import wc.AbstractC7984r;
import x9.C8316a;
import yb.AbstractC8610b;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w9.a */
/* loaded from: classes.dex */
public final class C7958a implements InterfaceC7964g {

    /* renamed from: a */
    public final C7963f f38277a;

    /* renamed from: b */
    public final C7622f f38278b;

    /* renamed from: c */
    public final i0 f38279c;

    /* renamed from: d */
    public final C7622f f38280d;

    /* renamed from: e */
    public final Map f38281e;

    /* renamed from: f */
    public final C8316a f38282f;

    /* renamed from: g */
    public final String f38283g;

    /* renamed from: h */
    public final C6801u f38284h;

    /* renamed from: j */
    public final C4980b f38285j;

    public C7958a(C7963f config) {
        AbstractC4154l.m8923f(config, "config");
        this.f38277a = config;
        C7622f c7622f = new C7622f(4);
        this.f38278b = c7622f;
        C4001v c4001v = config.f38308a;
        this.f38279c = new i0((InterfaceC4991b) c4001v.f20704b);
        AbstractC4154l.m8923f(config, "config");
        C7622f c7622f2 = new C7622f();
        c7622f2.f36778a = config;
        this.f38280d = c7622f2;
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(config.f38312e, 10));
        LinkedHashMap linkedHashMapM12786n = AbstractC6674x.m12786n(new LinkedHashMap(iM12776d < 16 ? 16 : iM12776d));
        C6489b c6489b = new C6489b("aws.auth#sigv4");
        if (linkedHashMapM12786n.get(c6489b) == null) {
            linkedHashMapM12786n.put(c6489b, new C4054i("sts", AbstractC7107r.f34293a));
        }
        C6489b c6489b2 = new C6489b("smithy.api#noAuth");
        if (linkedHashMapM12786n.get(c6489b2) == null) {
            linkedHashMapM12786n.put(c6489b2, C4046a.f20888a);
        }
        this.f38281e = AbstractC6674x.m12785m(linkedHashMapM12786n);
        this.f38282f = new C8316a(config, 0);
        this.f38283g = "aws.sdk.kotlin.runtime.auth.credentials.internal.sts";
        this.f38284h = new C6801u("aws.sdk.kotlin.runtime.auth.credentials.internal.sts", config.f38319m);
        AbstractC7984r.m15157a(c7622f, (InterfaceC4991b) c4001v.f20704b);
        AbstractC7984r.m15157a(c7622f, config.f38313f);
        this.f38285j = s1.m10886a(new C4979a("STS", "1.5.0"), config.f38322q);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38278b.m14520y();
    }

    /* renamed from: h */
    public final Object m15138h(C0074a c0074a, p0 p0Var) {
        C4147e c4147eM8901a = a0.m8901a(C0074a.class);
        C4147e c4147eM8901a2 = a0.m8901a(C0075b.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C5070u c5070u = new C5070u(3);
        C0631a c0631a = new C0631a(0);
        C7963f c7963f = this.f38277a;
        c0073l.m202L(c7963f.f38319m);
        c0073l.f268e = this.f38283g;
        c0073l.m201K(this.f38284h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f38282f, this.f38281e, this.f38280d);
        c4535g.f22543g = new C8316a(c7963f, 1);
        c4535g.m9393k((C0959n) c7963f.f38309b.f36778a);
        c4535g.m9392j(c7963f.f38318l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "AssumeRole");
        C0979e c0979e = new C0979e(c4535g, c0645a, c5070u, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "STS", c4147eM8901a, c4147eM8901a2), c0073l);
        m15140n(c0645a);
        c0979e.m2783r(new C6150a());
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c7963f.f38313f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        C4367l c4367l = new C4367l(22);
        ((C3733i) c4367l.f21923d).m336p("application/x-www-form-urlencoded", ObjectMetadata.CONTENT_TYPE);
        c4367l.m9121E(c0979e);
        m0.m7367D(new C4327p(this.f38285j), c0979e, c0979e);
        arrayList.addAll(c7963f.f38316j);
        return kf.m10740e(c0979e, this.f38279c, c0074a, p0Var);
    }

    /* renamed from: j */
    public final Object m15139j(C0076c c0076c, r0 r0Var) {
        C4147e c4147eM8901a = a0.m8901a(C0076c.class);
        C4147e c4147eM8901a2 = a0.m8901a(C0077d.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C5392d c5392d = new C5392d(3);
        C0631a c0631a = new C0631a(1);
        C7963f c7963f = this.f38277a;
        c0073l.m202L(c7963f.f38319m);
        c0073l.f268e = this.f38283g;
        c0073l.m201K(this.f38284h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f38282f, this.f38281e, this.f38280d);
        c4535g.f22543g = new C8316a(c7963f, 1);
        c4535g.m9393k((C0959n) c7963f.f38309b.f36778a);
        c4535g.m9392j(c7963f.f38318l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "AssumeRoleWithWebIdentity");
        C0979e c0979e = new C0979e(c4535g, c0645a, c5392d, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "STS", c4147eM8901a, c4147eM8901a2), c0073l);
        m15140n(c0645a);
        c0979e.m2783r(new C6150a());
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c7963f.f38313f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        C4367l c4367l = new C4367l(22);
        ((C3733i) c4367l.f21923d).m336p("application/x-www-form-urlencoded", ObjectMetadata.CONTENT_TYPE);
        c4367l.m9121E(c0979e);
        m0.m7367D(new C4327p(this.f38285j), c0979e, c0979e);
        arrayList.addAll(c7963f.f38316j);
        return kf.m10740e(c0979e, this.f38279c, c0076c, r0Var);
    }

    /* renamed from: n */
    public final void m15140n(C0645a c0645a) {
        C2003a c2003a = AbstractC8923q.f42884c;
        C7963f c7963f = this.f38277a;
        ud.m10981g(c0645a, c2003a, c7963f.f38310c);
        ud.m10981g(c0645a, AbstractC8923q.f42886e, c7963f.f38317k);
        C2003a c2003a2 = AbstractC7694a.f37196a;
        String str = c7963f.f38311d;
        ud.m10982h(c0645a, c2003a2, str);
        ud.m10982h(c0645a, AbstractC7094e.f34211a, str);
        ud.m10981g(c0645a, AbstractC7094e.f34214d, "sts");
        ud.m10981g(c0645a, AbstractC7094e.f34216f, c7963f.f38313f);
    }
}
