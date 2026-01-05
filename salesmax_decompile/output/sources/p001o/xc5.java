package p001o;

import p001o.l8i;

/* loaded from: classes3.dex */
public final class xc5 implements mg3 {
    @Override // p001o.f86
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object resolveEndpoint(lg3 lg3Var, n64 n64Var) {
        wyc wycVarM19983a;
        if (lg3Var.m37139a() != null) {
            if (sq8.m48644c(lg3Var.m37142d(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (sq8.m48644c(lg3Var.m37141c(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, lg3Var.m37139a(), null, 2, null);
            rx0 rx0Var = new rx0();
            rx0Var.m47217c(po1.m43956e(), ml1.m39301a(true));
            y3i y3iVar = y3i.f54824a;
            return new b86(l8iVarM36787m, null, rx0Var.m47215a(), 2, null);
        }
        if (lg3Var.m37140b() == null || (wycVarM19983a = bzc.m19983a(lg3Var.m37140b())) == null) {
            throw new g86("Invalid Configuration: Missing Region");
        }
        if (sq8.m48644c(lg3Var.m37142d(), ml1.m39301a(true)) && sq8.m48644c(lg3Var.m37141c(), ml1.m39301a(true))) {
            if (!sq8.m48644c(ml1.m39301a(true), wycVarM19983a.m55425e()) || !sq8.m48644c(ml1.m39301a(true), wycVarM19983a.m55424d())) {
                throw new g86("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-idp-fips." + lg3Var.m37140b() + '.' + wycVarM19983a.m55422b(), null, 2, null), null, 2, null);
        }
        if (sq8.m48644c(lg3Var.m37142d(), ml1.m39301a(true))) {
            if (!sq8.m48644c(wycVarM19983a.m55425e(), ml1.m39301a(true))) {
                throw new g86("FIPS is enabled but this partition does not support FIPS");
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-idp-fips." + lg3Var.m37140b() + '.' + wycVarM19983a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(lg3Var.m37141c(), ml1.m39301a(true))) {
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-idp." + lg3Var.m37140b() + '.' + wycVarM19983a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(ml1.m39301a(true), wycVarM19983a.m55424d())) {
            throw new g86("DualStack is enabled but this partition does not support DualStack");
        }
        return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-idp." + lg3Var.m37140b() + '.' + wycVarM19983a.m55422b(), null, 2, null), null, 2, null);
    }
}
