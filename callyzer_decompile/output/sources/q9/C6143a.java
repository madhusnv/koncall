package q9;

import a9.C0073l;
import bd.C0645a;
import cd.C0959n;
import cj.C0979e;
import ec.C2003a;
import ec.C2005c;
import ec.C2011i;
import i0.m0;
import i9.j0;
import i9.n0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.i0;
import k4.C4001v;
import kc.C4046a;
import kc.C4054i;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import l1.C4327p;
import l4.d0;
import ld.C4446f;
import ld.InterfaceC4447g;
import lv.C4535g;
import na.C4979a;
import na.C4980b;
import nc.InterfaceC4991b;
import oa.C5331c;
import og.kf;
import og.s1;
import og.ud;
import p9.C5866a;
import pa.EnumC5867a;
import qa.C6150a;
import qd.EnumC6183c;
import rb.C6489b;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import sb.InterfaceC6775b;
import sc.C6797q;
import sc.C6801u;
import tb.AbstractC7094e;
import tb.AbstractC7107r;
import u9.C7379a;
import u9.C7380b;
import v0.C7622f;
import vb.AbstractC7694a;
import wc.AbstractC7984r;
import yb.AbstractC8610b;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q9.a */
/* loaded from: classes.dex */
public final class C6143a implements InterfaceC6149g {

    /* renamed from: a */
    public final C6148f f29945a;

    /* renamed from: b */
    public final C7622f f29946b;

    /* renamed from: c */
    public final i0 f29947c;

    /* renamed from: d */
    public final C4327p f29948d;

    /* renamed from: e */
    public final Map f29949e;

    /* renamed from: f */
    public final C4001v f29950f;

    /* renamed from: g */
    public final String f29951g;

    /* renamed from: h */
    public final C6801u f29952h;

    /* renamed from: j */
    public final C4980b f29953j;

    public C6143a(C6148f config) {
        AbstractC4154l.m8923f(config, "config");
        this.f29945a = config;
        C7622f c7622f = new C7622f(4);
        this.f29946b = c7622f;
        C4001v c4001v = config.f29975a;
        this.f29947c = new i0((InterfaceC4991b) c4001v.f20704b);
        this.f29948d = new C4327p(config);
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(config.f29979e, 10));
        LinkedHashMap linkedHashMapM12786n = AbstractC6674x.m12786n(new LinkedHashMap(iM12776d < 16 ? 16 : iM12776d));
        C6489b c6489b = new C6489b("aws.auth#sigv4");
        if (linkedHashMapM12786n.get(c6489b) == null) {
            linkedHashMapM12786n.put(c6489b, new C4054i("sso-oauth", AbstractC7107r.f34293a));
        }
        C6489b c6489b2 = new C6489b("smithy.api#noAuth");
        if (linkedHashMapM12786n.get(c6489b2) == null) {
            linkedHashMapM12786n.put(c6489b2, C4046a.f20888a);
        }
        this.f29949e = AbstractC6674x.m12785m(linkedHashMapM12786n);
        this.f29950f = new C4001v(config);
        this.f29951g = "aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc";
        this.f29952h = new C6801u("aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc", config.f29986m);
        AbstractC7984r.m15157a(c7622f, (InterfaceC4991b) c4001v.f20704b);
        AbstractC7984r.m15157a(c7622f, config.f29980f);
        this.f29953j = s1.m10886a(new C4979a("SSO OIDC", "1.5.0"), config.f29989q);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29946b.m14520y();
    }

    /* renamed from: h */
    public final Object m12190h(C7379a c7379a, j0 j0Var) {
        C4147e c4147eM8901a = a0.m8901a(C7379a.class);
        C4147e c4147eM8901a2 = a0.m8901a(C7380b.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        ug.a0 a0Var = new ug.a0(20);
        C5866a c5866a = new C5866a(10);
        C6148f c6148f = this.f29945a;
        c0073l.m202L(c6148f.f29986m);
        c0073l.f268e = this.f29951g;
        c0073l.m201K(this.f29952h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f29950f, this.f29949e, this.f29948d);
        c4535g.f22543g = new d0(c6148f);
        c4535g.m9393k((C0959n) c6148f.f29976b.f36778a);
        c4535g.m9392j(c6148f.f29985l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "CreateToken");
        C0979e c0979e = new C0979e(c4535g, c0645a, a0Var, c5866a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "SSO OIDC", c4147eM8901a, c4147eM8901a2), c0073l);
        ud.m10981g(c0645a, AbstractC8923q.f42884c, c6148f.f29977c);
        ud.m10981g(c0645a, AbstractC8923q.f42886e, c6148f.f29984k);
        C2003a c2003a = AbstractC7694a.f37196a;
        String str = c6148f.f29978d;
        ud.m10982h(c0645a, c2003a, str);
        ud.m10982h(c0645a, AbstractC7094e.f34211a, str);
        ud.m10981g(c0645a, AbstractC7094e.f34214d, "sso-oauth");
        C2003a c2003a2 = AbstractC7094e.f34216f;
        InterfaceC6775b interfaceC6775b = c6148f.f29980f;
        ud.m10981g(c0645a, c2003a2, interfaceC6775b);
        c0979e.m2783r(new C6150a());
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (interfaceC6775b instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        m0.m7367D(new C4327p(this.f29953j), c0979e, c0979e);
        arrayList.addAll(c6148f.f29983j);
        return kf.m10740e(c0979e, this.f29947c, c7379a, j0Var);
    }
}
