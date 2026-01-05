package ab;

import a2.AbstractC0030c;
import a9.C0073l;
import al.C0174b;
import ba.C0631a;
import bb.C0640a;
import bd.C0645a;
import bl.C0689a;
import cd.C0959n;
import cj.C0979e;
import com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1;
import com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$$inlined$invoke$1;
import com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1;
import com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1;
import com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1;
import com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1;
import eb.C1980d;
import eb.C1982f;
import eb.a1;
import eb.b2;
import eb.c2;
import eb.d2;
import eb.e2;
import eb.n3;
import eb.o3;
import eb.p0;
import eb.q2;
import eb.r0;
import eb.r2;
import eb.t2;
import eb.u2;
import eb.v0;
import eb.x0;
import eb.x2;
import eb.y1;
import eb.y2;
import eb.z0;
import eb.z1;
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
import ng.C5070u;
import oa.C5331c;
import og.kf;
import og.s1;
import og.ud;
import oj.C5392d;
import pa.EnumC5867a;
import qd.EnumC6183c;
import rb.C6489b;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import sc.C6797q;
import sc.C6801u;
import tb.AbstractC7107r;
import v0.C7622f;
import wc.AbstractC7984r;
import ww.AbstractC8193c;
import yb.AbstractC8610b;
import yk.C8687a;
import zb.AbstractC8923q;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ab.e */
/* loaded from: classes.dex */
public final class C0087e implements InterfaceC0086d {

    /* renamed from: a */
    public final C0085c f330a;

    /* renamed from: b */
    public final C7622f f331b;

    /* renamed from: c */
    public final i0 f332c;

    /* renamed from: d */
    public final C0640a f333d;

    /* renamed from: e */
    public final Map f334e;

    /* renamed from: f */
    public final C8986c f335f;

    /* renamed from: g */
    public final String f336g;

    /* renamed from: h */
    public final C6801u f337h;

    /* renamed from: j */
    public final C4980b f338j;

    public C0087e(C0085c config) {
        AbstractC4154l.m8923f(config, "config");
        this.f330a = config;
        C7622f c7622f = new C7622f(4);
        this.f331b = c7622f;
        C4001v c4001v = config.f314a;
        this.f332c = new i0((InterfaceC4991b) c4001v.f20704b);
        this.f333d = new C0640a(config, 0);
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(config.f318e, 10));
        LinkedHashMap linkedHashMapM12786n = AbstractC6674x.m12786n(new LinkedHashMap(iM12776d < 16 ? 16 : iM12776d));
        C6489b c6489b = new C6489b("aws.auth#sigv4");
        if (linkedHashMapM12786n.get(c6489b) == null) {
            linkedHashMapM12786n.put(c6489b, new C4054i("cognito-idp", AbstractC7107r.f34293a));
        }
        C6489b c6489b2 = new C6489b("smithy.api#noAuth");
        if (linkedHashMapM12786n.get(c6489b2) == null) {
            linkedHashMapM12786n.put(c6489b2, C4046a.f20888a);
        }
        this.f334e = AbstractC6674x.m12785m(linkedHashMapM12786n);
        this.f335f = new C8986c(config);
        this.f336g = "aws.sdk.kotlin.services.cognitoidentityprovider";
        this.f337h = new C6801u("aws.sdk.kotlin.services.cognitoidentityprovider", config.f325m);
        AbstractC7984r.m15157a(c7622f, (InterfaceC4991b) c4001v.f20704b);
        AbstractC7984r.m15157a(c7622f, config.f319f);
        this.f338j = s1.m10886a(new C4979a("Cognito Identity Provider", "1.5.0"), config.f328q);
    }

    /* renamed from: A */
    public final Object m250A(d2 d2Var, AbstractC8193c abstractC8193c) {
        C4147e c4147eM8901a = a0.m8901a(d2.class);
        C4147e c4147eM8901a2 = a0.m8901a(e2.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C0689a c0689a = new C0689a(11);
        C0631a c0631a = new C0631a(15);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "InitiateAuth");
        C0979e c0979e = new C0979e(c4535g, c0645a, c0689a, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, d2Var, abstractC8193c);
    }

    /* renamed from: H */
    public final Object m251H(q2 q2Var, AbstractC8193c abstractC8193c) {
        C4147e c4147eM8901a = a0.m8901a(q2.class);
        C4147e c4147eM8901a2 = a0.m8901a(r2.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C8687a c8687a = new C8687a(11);
        C0631a c0631a = new C0631a(19);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "RespondToAuthChallenge");
        C0979e c0979e = new C0979e(c4535g, c0645a, c8687a, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, q2Var, abstractC8193c);
    }

    /* renamed from: J */
    public final Object m252J(t2 t2Var, SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1.C11211 c11211) {
        C4147e c4147eM8901a = a0.m8901a(t2.class);
        C4147e c4147eM8901a2 = a0.m8901a(u2.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C0174b c0174b = new C0174b(12);
        C0631a c0631a = new C0631a(20);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "RevokeToken");
        C0979e c0979e = new C0979e(c4535g, c0645a, c0174b, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, t2Var, c11211);
    }

    /* renamed from: P */
    public final Object m253P(x2 x2Var, SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.C11231 c11231) {
        C4147e c4147eM8901a = a0.m8901a(x2.class);
        C4147e c4147eM8901a2 = a0.m8901a(y2.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C5070u c5070u = new C5070u(12);
        C0631a c0631a = new C0631a(22);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "SignUp");
        C0979e c0979e = new C0979e(c4535g, c0645a, c5070u, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, x2Var, c11231);
    }

    /* renamed from: R */
    public final Object m254R(n3 n3Var, AbstractC8193c abstractC8193c) {
        C4147e c4147eM8901a = a0.m8901a(n3.class);
        C4147e c4147eM8901a2 = a0.m8901a(o3.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C0174b c0174b = new C0174b(13);
        C0631a c0631a = new C0631a(26);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "VerifySoftwareToken");
        C0979e c0979e = new C0979e(c4535g, c0645a, c0174b, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, n3Var, abstractC8193c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f331b.m14520y();
    }

    /* renamed from: h */
    public final Object m255h(C1980d c1980d, AbstractC8193c abstractC8193c) {
        C4147e c4147eM8901a = a0.m8901a(C1980d.class);
        C4147e c4147eM8901a2 = a0.m8901a(C1982f.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C0174b c0174b = new C0174b(9);
        C0631a c0631a = new C0631a(2);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "AssociateSoftwareToken");
        C0979e c0979e = new C0979e(c4535g, c0645a, c0174b, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, c1980d, abstractC8193c);
    }

    /* renamed from: j */
    public final Object m256j(p0 p0Var, SignInCognitoActions$confirmDevice$$inlined$invoke$1.C11121 c11121) {
        C4147e c4147eM8901a = a0.m8901a(p0.class);
        C4147e c4147eM8901a2 = a0.m8901a(r0.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C5392d c5392d = new C5392d(9);
        C0631a c0631a = new C0631a(5);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "ConfirmDevice");
        C0979e c0979e = new C0979e(c4535g, c0645a, c5392d, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, p0Var, c11121);
    }

    /* renamed from: n */
    public final Object m257n(v0 v0Var, SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1.C11221 c11221) {
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
        C8687a c8687a = new C8687a(9);
        C0631a c0631a = new C0631a(7);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "ConfirmSignUp");
        C0979e c0979e = new C0979e(c4535g, c0645a, c8687a, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, v0Var, c11221);
    }

    /* renamed from: u */
    public final Object m258u(z0 z0Var, DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1.C10711 c10711) {
        C4147e c4147eM8901a = a0.m8901a(z0.class);
        C4147e c4147eM8901a2 = a0.m8901a(a1.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C0174b c0174b = new C0174b(10);
        C0631a c0631a = new C0631a(8);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "DeleteUser");
        C0979e c0979e = new C0979e(c4535g, c0645a, c0174b, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, z0Var, c10711);
    }

    /* renamed from: w */
    public final Object m259w(y1 y1Var, AbstractC8193c abstractC8193c) {
        C4147e c4147eM8901a = a0.m8901a(y1.class);
        C4147e c4147eM8901a2 = a0.m8901a(z1.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C8687a c8687a = new C8687a(10);
        C0631a c0631a = new C0631a(13);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "GetUser");
        C0979e c0979e = new C0979e(c4535g, c0645a, c8687a, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, y1Var, abstractC8193c);
    }

    /* renamed from: z */
    public final Object m260z(b2 b2Var, SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1.C11201 c11201) {
        C4147e c4147eM8901a = a0.m8901a(b2.class);
        C4147e c4147eM8901a2 = a0.m8901a(c2.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C0174b c0174b = new C0174b(11);
        C0631a c0631a = new C0631a(14);
        C0085c c0085c = this.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = this.f336g;
        c0073l.m201K(this.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(this.f335f, this.f334e, this.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "GlobalSignOut");
        C0979e c0979e = new C0979e(c4535g, c0645a, c0174b, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(this, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        m0.m7367D(new C4327p(this.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        return kf.m10740e(c0979e, this.f332c, b2Var, c11201);
    }
}
