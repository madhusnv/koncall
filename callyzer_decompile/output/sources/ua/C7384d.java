package ua;

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
import kc.C4046a;
import kc.C4054i;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import l1.C4327p;
import l7.C4417q;
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
import sc.C6797q;
import sc.C6801u;
import tb.AbstractC7094e;
import tb.AbstractC7107r;
import ug.C7455z;
import ug.g1;
import v0.C7622f;
import va.C7693a;
import vb.AbstractC7694a;
import wc.AbstractC7984r;
import ww.AbstractC8193c;
import ya.C8604c;
import ya.C8605d;
import ya.C8607f;
import ya.C8608g;
import yb.AbstractC8610b;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ua.d */
/* loaded from: classes.dex */
public final class C7384d implements InterfaceC7383c {

    /* renamed from: a */
    public final C7382b f35116a;

    /* renamed from: b */
    public final C7622f f35117b;

    /* renamed from: c */
    public final i0 f35118c;

    /* renamed from: d */
    public final g1 f35119d;

    /* renamed from: e */
    public final Map f35120e;

    /* renamed from: f */
    public final C7693a f35121f;

    /* renamed from: g */
    public final String f35122g;

    /* renamed from: h */
    public final C6801u f35123h;

    /* renamed from: j */
    public final C4980b f35124j;

    public C7384d(C7382b config) {
        AbstractC4154l.m8923f(config, "config");
        this.f35116a = config;
        C7622f c7622f = new C7622f(4);
        this.f35117b = c7622f;
        C4001v c4001v = config.f35100a;
        this.f35118c = new i0((InterfaceC4991b) c4001v.f20704b);
        AbstractC4154l.m8923f(config, "config");
        g1 g1Var = new g1();
        g1Var.f35448a = config;
        this.f35119d = g1Var;
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(config.f35104e, 10));
        LinkedHashMap linkedHashMapM12786n = AbstractC6674x.m12786n(new LinkedHashMap(iM12776d < 16 ? 16 : iM12776d));
        C6489b c6489b = new C6489b("aws.auth#sigv4");
        if (linkedHashMapM12786n.get(c6489b) == null) {
            linkedHashMapM12786n.put(c6489b, new C4054i("cognito-identity", AbstractC7107r.f34293a));
        }
        C6489b c6489b2 = new C6489b("smithy.api#noAuth");
        if (linkedHashMapM12786n.get(c6489b2) == null) {
            linkedHashMapM12786n.put(c6489b2, C4046a.f20888a);
        }
        this.f35120e = AbstractC6674x.m12785m(linkedHashMapM12786n);
        this.f35121f = new C7693a(config, 0);
        this.f35122g = "aws.sdk.kotlin.services.cognitoidentity";
        this.f35123h = new C6801u("aws.sdk.kotlin.services.cognitoidentity", config.f35111m);
        AbstractC7984r.m15157a(c7622f, (InterfaceC4991b) c4001v.f20704b);
        AbstractC7984r.m15157a(c7622f, config.f35105f);
        this.f35124j = s1.m10886a(new C4979a("Cognito Identity", "1.5.0"), config.f35114q);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35117b.m14520y();
    }

    /* renamed from: h */
    public final Object m13794h(C8604c c8604c, AbstractC8193c abstractC8193c) {
        C4147e c4147eM8901a = a0.m8901a(C8604c.class);
        C4147e c4147eM8901a2 = a0.m8901a(C8605d.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C7455z c7455z = new C7455z(25);
        C5866a c5866a = new C5866a(11);
        C7382b c7382b = this.f35116a;
        c0073l.m202L(c7382b.f35111m);
        c0073l.f268e = this.f35122g;
        c0073l.m201K(this.f35123h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f35121f, this.f35120e, this.f35119d);
        c4535g.f22543g = new C7693a(c7382b, 1);
        c4535g.m9393k((C0959n) c7382b.f35101b.f36778a);
        c4535g.m9392j(c7382b.f35110l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "GetCredentialsForIdentity");
        C0979e c0979e = new C0979e(c4535g, c0645a, c7455z, c5866a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity", c4147eM8901a, c4147eM8901a2), c0073l);
        m13796n(c0645a);
        c0979e.m2783r(new C6150a());
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c7382b.f35105f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f35124j), c0979e, c0979e);
        arrayList.addAll(c7382b.f35108j);
        return kf.m10740e(c0979e, this.f35118c, c8604c, abstractC8193c);
    }

    /* renamed from: j */
    public final Object m13795j(C8607f c8607f, AbstractC8193c abstractC8193c) {
        C4147e c4147eM8901a = a0.m8901a(C8607f.class);
        C4147e c4147eM8901a2 = a0.m8901a(C8608g.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        ug.a0 a0Var = new ug.a0(25);
        C5866a c5866a = new C5866a(12);
        C7382b c7382b = this.f35116a;
        c0073l.m202L(c7382b.f35111m);
        c0073l.f268e = this.f35122g;
        c0073l.m201K(this.f35123h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f35121f, this.f35120e, this.f35119d);
        c4535g.f22543g = new C7693a(c7382b, 1);
        c4535g.m9393k((C0959n) c7382b.f35101b.f36778a);
        c4535g.m9392j(c7382b.f35110l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "GetId");
        C0979e c0979e = new C0979e(c4535g, c0645a, a0Var, c5866a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity", c4147eM8901a, c4147eM8901a2), c0073l);
        m13796n(c0645a);
        c0979e.m2783r(new C6150a());
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c7382b.f35105f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f35124j), c0979e, c0979e);
        arrayList.addAll(c7382b.f35108j);
        return kf.m10740e(c0979e, this.f35118c, c8607f, abstractC8193c);
    }

    /* renamed from: n */
    public final void m13796n(C0645a c0645a) {
        C2003a c2003a = AbstractC8923q.f42884c;
        C7382b c7382b = this.f35116a;
        ud.m10981g(c0645a, c2003a, c7382b.f35102c);
        ud.m10981g(c0645a, AbstractC8923q.f42886e, c7382b.f35109k);
        C2003a c2003a2 = AbstractC7694a.f37196a;
        String str = c7382b.f35103d;
        ud.m10982h(c0645a, c2003a2, str);
        ud.m10982h(c0645a, AbstractC7094e.f34211a, str);
        ud.m10981g(c0645a, AbstractC7094e.f34214d, "cognito-identity");
        ud.m10981g(c0645a, AbstractC7094e.f34216f, c7382b.f35105f);
    }
}
