package p001o;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes5.dex */
public class cxh implements vwh {

    /* renamed from: e */
    public static volatile dxh f18819e;

    /* renamed from: a */
    public final ib3 f18820a;

    /* renamed from: b */
    public final ib3 f18821b;

    /* renamed from: c */
    public final d5f f18822c;

    /* renamed from: d */
    public final v7i f18823d;

    public cxh(ib3 ib3Var, ib3 ib3Var2, d5f d5fVar, v7i v7iVar, kbj kbjVar) {
        this.f18820a = ib3Var;
        this.f18821b = ib3Var2;
        this.f18822c = d5fVar;
        this.f18823d = v7iVar;
        kbjVar.m35367c();
    }

    /* renamed from: c */
    public static cxh m22041c() {
        dxh dxhVar = f18819e;
        if (dxhVar != null) {
            return dxhVar.mo23928c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set m22042d(fn5 fn5Var) {
        return fn5Var instanceof b76 ? Collections.unmodifiableSet(((b76) fn5Var).mo18214a()) : Collections.singleton(n76.m40202b("proto"));
    }

    /* renamed from: f */
    public static void m22043f(Context context) {
        if (f18819e == null) {
            synchronized (cxh.class) {
                if (f18819e == null) {
                    f18819e = ik4.m32235d().mo23929a(context).build();
                }
            }
        }
    }

    @Override // p001o.vwh
    /* renamed from: a */
    public void mo22044a(zdf zdfVar, fxh fxhVar) {
        this.f18822c.mo22330a(zdfVar.mo34998f().m45896f(zdfVar.mo34996c().mo38283c()), m22045b(zdfVar), fxhVar);
    }

    /* renamed from: b */
    public final ak6 m22045b(zdf zdfVar) {
        return ak6.m17306a().mo17326i(this.f18820a.getTime()).mo17328k(this.f18821b.getTime()).mo17327j(zdfVar.mo34999g()).mo17325h(new d76(zdfVar.mo34995b(), zdfVar.m59260d())).mo17324g(zdfVar.mo34996c().mo38281a()).mo17321d();
    }

    /* renamed from: e */
    public v7i m22046e() {
        return this.f18823d;
    }

    /* renamed from: g */
    public rwh m22047g(fn5 fn5Var) {
        return new swh(m22042d(fn5Var), qwh.m45891a().mo45898b(fn5Var.getName()).mo45899c(fn5Var.getExtras()).mo45897a(), this);
    }
}
