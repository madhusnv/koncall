package p001o;

import com.amazonaws.regions.ServiceAbbreviations;
import p001o.l8i;

/* loaded from: classes2.dex */
public final class th5 implements bag {
    @Override // p001o.f86
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object resolveEndpoint(aag aagVar, n64 n64Var) {
        wyc wycVarM60138a;
        wyc wycVarM60138a2 = zyc.m60138a(aagVar.m16773b());
        if (wycVarM60138a2 == null || !sq8.m48644c(aagVar.m16776e(), ml1.m39301a(true)) || aagVar.m16772a() != null || aagVar.m16773b() == null || !sq8.m48644c(aagVar.m16775d(), ml1.m39301a(false)) || !sq8.m48644c(aagVar.m16774c(), ml1.m39301a(false))) {
            if (aagVar.m16772a() != null) {
                if (sq8.m48644c(aagVar.m16775d(), ml1.m39301a(true))) {
                    throw new g86("Invalid Configuration: FIPS and custom endpoint are not supported");
                }
                if (sq8.m48644c(aagVar.m16774c(), ml1.m39301a(true))) {
                    throw new g86("Invalid Configuration: Dualstack and custom endpoint are not supported");
                }
                l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, aagVar.m16772a(), null, 2, null);
                rx0 rx0Var = new rx0();
                rx0Var.m47217c(po1.m43956e(), ml1.m39301a(true));
                y3i y3iVar = y3i.f54824a;
                return new b86(l8iVarM36787m, null, rx0Var.m47215a(), 2, null);
            }
            if (aagVar.m16773b() == null || (wycVarM60138a = zyc.m60138a(aagVar.m16773b())) == null) {
                throw new g86("Invalid Configuration: Missing Region");
            }
            if (sq8.m48644c(aagVar.m16775d(), ml1.m39301a(true)) && sq8.m48644c(aagVar.m16774c(), ml1.m39301a(true))) {
                if (!sq8.m48644c(ml1.m39301a(true), wycVarM60138a.m55425e()) || !sq8.m48644c(ml1.m39301a(true), wycVarM60138a.m55424d())) {
                    throw new g86("FIPS and DualStack are enabled, but this partition does not support one or both");
                }
                return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://sts-fips." + aagVar.m16773b() + '.' + wycVarM60138a.m55422b(), null, 2, null), null, 2, null);
            }
            if (sq8.m48644c(aagVar.m16775d(), ml1.m39301a(true))) {
                if (!sq8.m48644c(wycVarM60138a.m55425e(), ml1.m39301a(true))) {
                    throw new g86("FIPS is enabled but this partition does not support FIPS");
                }
                if (sq8.m48644c(wycVarM60138a.m55423c(), "aws-us-gov")) {
                    return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://sts." + aagVar.m16773b() + ".amazonaws.com", null, 2, null), null, 2, null);
                }
                return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://sts-fips." + aagVar.m16773b() + '.' + wycVarM60138a.m55421a(), null, 2, null), null, 2, null);
            }
            if (sq8.m48644c(aagVar.m16774c(), ml1.m39301a(true))) {
                if (!sq8.m48644c(ml1.m39301a(true), wycVarM60138a.m55424d())) {
                    throw new g86("DualStack is enabled but this partition does not support DualStack");
                }
                return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://sts." + aagVar.m16773b() + '.' + wycVarM60138a.m55422b(), null, 2, null), null, 2, null);
            }
            if (sq8.m48644c(aagVar.m16773b(), "aws-global")) {
                l8i l8iVarM36787m2 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
                rx0 rx0Var2 = new rx0();
                rx0Var2.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
                y3i y3iVar2 = y3i.f54824a;
                return new b86(l8iVarM36787m2, null, rx0Var2.m47215a(), 2, null);
            }
            return new b86(l8i.C15037b.m36787m(l8i.f33466k, "https://sts." + aagVar.m16773b() + '.' + wycVarM60138a.m55421a(), null, 2, null), null, 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "ap-northeast-1")) {
            l8i l8iVarM36787m3 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var3 = new rx0();
            rx0Var3.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar3 = y3i.f54824a;
            return new b86(l8iVarM36787m3, null, rx0Var3.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "ap-south-1")) {
            l8i l8iVarM36787m4 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var4 = new rx0();
            rx0Var4.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar4 = y3i.f54824a;
            return new b86(l8iVarM36787m4, null, rx0Var4.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "ap-southeast-1")) {
            l8i l8iVarM36787m5 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var5 = new rx0();
            rx0Var5.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar5 = y3i.f54824a;
            return new b86(l8iVarM36787m5, null, rx0Var5.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "ap-southeast-2")) {
            l8i l8iVarM36787m6 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var6 = new rx0();
            rx0Var6.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar6 = y3i.f54824a;
            return new b86(l8iVarM36787m6, null, rx0Var6.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "aws-global")) {
            l8i l8iVarM36787m7 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var7 = new rx0();
            rx0Var7.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar7 = y3i.f54824a;
            return new b86(l8iVarM36787m7, null, rx0Var7.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "ca-central-1")) {
            l8i l8iVarM36787m8 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var8 = new rx0();
            rx0Var8.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar8 = y3i.f54824a;
            return new b86(l8iVarM36787m8, null, rx0Var8.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "eu-central-1")) {
            l8i l8iVarM36787m9 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var9 = new rx0();
            rx0Var9.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar9 = y3i.f54824a;
            return new b86(l8iVarM36787m9, null, rx0Var9.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "eu-north-1")) {
            l8i l8iVarM36787m10 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var10 = new rx0();
            rx0Var10.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar10 = y3i.f54824a;
            return new b86(l8iVarM36787m10, null, rx0Var10.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "eu-west-1")) {
            l8i l8iVarM36787m11 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var11 = new rx0();
            rx0Var11.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar11 = y3i.f54824a;
            return new b86(l8iVarM36787m11, null, rx0Var11.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "eu-west-2")) {
            l8i l8iVarM36787m12 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var12 = new rx0();
            rx0Var12.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar12 = y3i.f54824a;
            return new b86(l8iVarM36787m12, null, rx0Var12.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "eu-west-3")) {
            l8i l8iVarM36787m13 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var13 = new rx0();
            rx0Var13.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar13 = y3i.f54824a;
            return new b86(l8iVarM36787m13, null, rx0Var13.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "sa-east-1")) {
            l8i l8iVarM36787m14 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var14 = new rx0();
            rx0Var14.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar14 = y3i.f54824a;
            return new b86(l8iVarM36787m14, null, rx0Var14.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "us-east-1")) {
            l8i l8iVarM36787m15 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var15 = new rx0();
            rx0Var15.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar15 = y3i.f54824a;
            return new b86(l8iVarM36787m15, null, rx0Var15.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "us-east-2")) {
            l8i l8iVarM36787m16 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var16 = new rx0();
            rx0Var16.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar16 = y3i.f54824a;
            return new b86(l8iVarM36787m16, null, rx0Var16.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "us-west-1")) {
            l8i l8iVarM36787m17 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var17 = new rx0();
            rx0Var17.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar17 = y3i.f54824a;
            return new b86(l8iVarM36787m17, null, rx0Var17.m47215a(), 2, null);
        }
        if (sq8.m48644c(aagVar.m16773b(), "us-west-2")) {
            l8i l8iVarM36787m18 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts.amazonaws.com", null, 2, null);
            rx0 rx0Var18 = new rx0();
            rx0Var18.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, "us-east-1", ml1.m39301a(false), null, 17, null)));
            y3i y3iVar18 = y3i.f54824a;
            return new b86(l8iVarM36787m18, null, rx0Var18.m47215a(), 2, null);
        }
        l8i l8iVarM36787m19 = l8i.C15037b.m36787m(l8i.f33466k, "https://sts." + aagVar.m16773b() + '.' + wycVarM60138a2.m55421a(), null, 2, null);
        rx0 rx0Var19 = new rx0();
        rx0Var19.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.STS, String.valueOf(aagVar.m16773b()), ml1.m39301a(false), null, 17, null)));
        y3i y3iVar19 = y3i.f54824a;
        return new b86(l8iVarM36787m19, null, rx0Var19.m47215a(), 2, null);
    }
}
