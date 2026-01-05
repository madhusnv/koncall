package p001o;

import p001o.tn8;
import p001o.ule;

/* loaded from: classes3.dex */
public final class neb implements tn8 {

    /* renamed from: a */
    public static final neb f36754a = new neb();

    @Override // p001o.tn8
    public zqe intercept(tn8.InterfaceC17165a interfaceC17165a) {
        d28 d28VarM18283c;
        sq8.m48649h(interfaceC17165a, "chain");
        ule uleVarRequest = interfaceC17165a.request();
        b8f b8fVar = (b8f) uleVarRequest.m51739j(b8f.class);
        if (b8fVar == null || (d28VarM18283c = b8fVar.m18283c()) == null) {
            return interfaceC17165a.mo20972a(uleVarRequest);
        }
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("server.address", uleVarRequest.m51741l().m53877h() + ':' + uleVarRequest.m51741l().m53882n());
        tob tobVarM47215a = rx0Var.m47215a();
        if (uleVarRequest.m51730a() != null) {
            ule.C17397a c17397aM51738i = uleVarRequest.m51738i();
            String strM51737h = uleVarRequest.m51737h();
            xle xleVarM51730a = uleVarRequest.m51730a();
            uleVarRequest = c17397aM51738i.m51759p(strM51737h, xleVarM51730a != null ? oeb.m42130a(xleVarM51730a, d28VarM18283c.m22268o(), tobVarM47215a) : null).m51746b();
        }
        zqe zqeVarMo20972a = interfaceC17165a.mo20972a(uleVarRequest);
        if (zqeVarMo20972a.m59735c() == null) {
            return zqeVarMo20972a;
        }
        cre creVarM59735c = zqeVarMo20972a.m59735c();
        boolean z = false;
        if (creVarM59735c != null && creVarM59735c.mo21617g() == 0) {
            z = true;
        }
        return z ? zqeVarMo20972a : zqeVarMo20972a.m59728H().m59749b(oeb.m42131b(zqeVarMo20972a.m59735c(), d28VarM18283c.m22267k(), tobVarM47215a)).m59750c();
    }
}
