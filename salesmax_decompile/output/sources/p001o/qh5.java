package p001o;

import p001o.l8i;

/* loaded from: classes2.dex */
public final class qh5 implements e2g {
    @Override // p001o.f86
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object resolveEndpoint(d2g d2gVar, n64 n64Var) {
        wyc wycVarM58506a;
        if (d2gVar.m22277a() != null) {
            if (sq8.m48644c(d2gVar.m22280d(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (sq8.m48644c(d2gVar.m22279c(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, d2gVar.m22277a(), null, 2, null);
            rx0 rx0Var = new rx0();
            rx0Var.m47217c(po1.m43956e(), ml1.m39301a(true));
            y3i y3iVar = y3i.f54824a;
            return new b86(l8iVarM36787m, null, rx0Var.m47215a(), 2, null);
        }
        if (d2gVar.m22278b() == null || (wycVarM58506a = yyc.m58506a(d2gVar.m22278b())) == null) {
            throw new g86("Invalid Configuration: Missing Region");
        }
        if (sq8.m48644c(d2gVar.m22280d(), ml1.m39301a(true)) && sq8.m48644c(d2gVar.m22279c(), ml1.m39301a(true))) {
            if (!sq8.m48644c(ml1.m39301a(true), wycVarM58506a.m55425e()) || !sq8.m48644c(ml1.m39301a(true), wycVarM58506a.m55424d())) {
                throw new g86("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://oidc-fips." + d2gVar.m22278b() + '.' + wycVarM58506a.m55422b(), null, 2, null), null, 2, null);
        }
        if (sq8.m48644c(d2gVar.m22280d(), ml1.m39301a(true))) {
            if (!sq8.m48644c(wycVarM58506a.m55425e(), ml1.m39301a(true))) {
                throw new g86("FIPS is enabled but this partition does not support FIPS");
            }
            if (sq8.m48644c(wycVarM58506a.m55423c(), "aws-us-gov")) {
                return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://oidc." + d2gVar.m22278b() + ".amazonaws.com", null, 2, null), null, 2, null);
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://oidc-fips." + d2gVar.m22278b() + '.' + wycVarM58506a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(d2gVar.m22279c(), ml1.m39301a(true))) {
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://oidc." + d2gVar.m22278b() + '.' + wycVarM58506a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(ml1.m39301a(true), wycVarM58506a.m55424d())) {
            throw new g86("DualStack is enabled but this partition does not support DualStack");
        }
        return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://oidc." + d2gVar.m22278b() + '.' + wycVarM58506a.m55422b(), null, 2, null), null, 2, null);
    }
}
