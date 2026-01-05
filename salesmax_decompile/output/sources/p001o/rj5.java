package p001o;

import p001o.l8i;

/* loaded from: classes3.dex */
public final class rj5 implements zvh {
    @Override // p001o.f86
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object resolveEndpoint(yvh yvhVar, n64 n64Var) {
        wyc wycVarM56964a;
        if (yvhVar.m58377a() != null) {
            if (sq8.m48644c(yvhVar.m58380d(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (sq8.m48644c(yvhVar.m58379c(), ml1.m39301a(true))) {
                throw new g86("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, yvhVar.m58377a(), null, 2, null);
            rx0 rx0Var = new rx0();
            rx0Var.m47217c(po1.m43956e(), ml1.m39301a(true));
            y3i y3iVar = y3i.f54824a;
            return new b86(l8iVarM36787m, null, rx0Var.m47215a(), 2, null);
        }
        if (yvhVar.m58378b() == null || (wycVarM56964a = xyc.m56964a(yvhVar.m58378b())) == null) {
            throw new g86("Invalid Configuration: Missing Region");
        }
        if (sq8.m48644c(yvhVar.m58380d(), ml1.m39301a(true)) && sq8.m48644c(yvhVar.m58379c(), ml1.m39301a(true))) {
            if (!sq8.m48644c(ml1.m39301a(true), wycVarM56964a.m55425e()) || !sq8.m48644c(ml1.m39301a(true), wycVarM56964a.m55424d())) {
                throw new g86("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://translate-fips." + yvhVar.m58378b() + '.' + wycVarM56964a.m55422b(), null, 2, null), null, 2, null);
        }
        if (sq8.m48644c(yvhVar.m58380d(), ml1.m39301a(true))) {
            if (!sq8.m48644c(wycVarM56964a.m55425e(), ml1.m39301a(true))) {
                throw new g86("FIPS is enabled but this partition does not support FIPS");
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://translate-fips." + yvhVar.m58378b() + '.' + wycVarM56964a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(yvhVar.m58379c(), ml1.m39301a(true))) {
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://translate." + yvhVar.m58378b() + '.' + wycVarM56964a.m55421a(), null, 2, null), null, 2, null);
        }
        if (!sq8.m48644c(ml1.m39301a(true), wycVarM56964a.m55424d())) {
            throw new g86("DualStack is enabled but this partition does not support DualStack");
        }
        return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://translate." + yvhVar.m58378b() + '.' + wycVarM56964a.m55422b(), null, 2, null), null, 2, null);
    }
}
