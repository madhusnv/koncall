package p001o;

import p001o.l8i;

/* loaded from: classes3.dex */
public final class uc5 implements eg3 {
    @Override // p001o.f86
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object resolveEndpoint(dg3 dg3Var, n64 n64Var) {
        wyc wycVarM18046a;
        if (dg3Var.m22999a() != null) {
            if (sq8.m48644c(dg3Var.m23002d(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (sq8.m48644c(dg3Var.m23001c(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, dg3Var.m22999a(), null, 2, null);
            rx0 rx0Var = new rx0();
            rx0Var.m47217c(po1.m43956e(), ml1.m39301a(true));
            y3i y3iVar = y3i.f54824a;
            return new b86(l8iVarM36787m, null, rx0Var.m47215a(), 2, null);
        }
        if (dg3Var.m23000b() == null || (wycVarM18046a = azc.m18046a(dg3Var.m23000b())) == null) {
            throw new g86("Invalid Configuration: Missing Region");
        }
        if (sq8.m48644c(dg3Var.m23002d(), ml1.m39301a(true)) && sq8.m48644c(dg3Var.m23001c(), ml1.m39301a(true))) {
            if (!sq8.m48644c(ml1.m39301a(true), wycVarM18046a.m55425e()) || !sq8.m48644c(ml1.m39301a(true), wycVarM18046a.m55424d())) {
                throw new g86("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-identity-fips." + dg3Var.m23000b() + '.' + wycVarM18046a.m55422b(), null, 2, null), null, 2, null);
        }
        if (sq8.m48644c(dg3Var.m23002d(), ml1.m39301a(true))) {
            if (!sq8.m48644c(wycVarM18046a.m55425e(), ml1.m39301a(true))) {
                throw new g86("FIPS is enabled but this partition does not support FIPS");
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-identity-fips." + dg3Var.m23000b() + '.' + wycVarM18046a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(dg3Var.m23001c(), ml1.m39301a(true))) {
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-identity." + dg3Var.m23000b() + '.' + wycVarM18046a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(ml1.m39301a(true), wycVarM18046a.m55424d())) {
            throw new g86("DualStack is enabled but this partition does not support DualStack");
        }
        return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://cognito-identity." + dg3Var.m23000b() + '.' + wycVarM18046a.m55422b(), null, 2, null), null, 2, null);
    }
}
