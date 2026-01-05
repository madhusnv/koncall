package p001o;

import com.amazonaws.regions.ServiceAbbreviations;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.message.TokenParser;
import p001o.l8i;

/* loaded from: classes3.dex */
public final class pg5 implements fxe {
    @Override // p001o.f86
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object resolveEndpoint(exe exeVar, n64 n64Var) {
        wyc wycVarM27819a;
        wyc wycVarM27819a2;
        wyc wycVarM27819a3;
        wyc wycVarM27819a4;
        wyc wycVarM27819a5;
        wyc wycVarM27819a6;
        wyc wycVarM27819a7;
        String strM37469d;
        String strM37469d2;
        String strM37469d3;
        if (exeVar.m25729h() != null) {
            if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                throw new g86("Accelerate cannot be used with FIPS");
            }
            if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() != null) {
                throw new g86("Cannot set dual-stack in combination with a custom endpoint.");
            }
            if (exeVar.m25727f() != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                throw new g86("A custom endpoint cannot be combined with FIPS");
            }
            if (exeVar.m25727f() != null && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true))) {
                throw new g86("A custom endpoint cannot be combined with S3 Accelerate");
            }
            wyc wycVarM27819a8 = fzc.m27819a(exeVar.m25729h());
            if (wycVarM27819a8 != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(wycVarM27819a8.m55423c(), "aws-cn")) {
                throw new g86("Partition does not support FIPS");
            }
            String strM37468c = lm7.m37468c(exeVar.m25723b(), 0, 6, true);
            if (strM37468c != null && exeVar.m25723b() != null && sq8.m48644c(strM37468c, "--x-s3")) {
                if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true))) {
                    throw new g86("S3Express does not support Dual-stack.");
                }
                if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true))) {
                    throw new g86("S3Express does not support S3 Accelerate.");
                }
                m8i m8iVarM37467b = lm7.m37467b(exeVar.m25727f());
                if (m8iVarM37467b != null && exeVar.m25727f() != null) {
                    if (exeVar.m25726e() == null || !sq8.m48644c(exeVar.m25726e(), ml1.m39301a(true))) {
                        if ((m8iVarM37467b.m38576e()) && (strM37469d2 = lm7.m37469d(exeVar.m25723b())) != null) {
                            l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b.m38575d() + "://" + m8iVarM37467b.m38572a() + '/' + strM37469d2 + m8iVarM37467b.m38574c(), null, 2, null);
                            rx0 rx0Var = new rx0();
                            rx0Var.m47216b("backend", "S3Express");
                            rx0Var.m47217c(bsf.m19700b(), bh3.m18963e(qrf.m45816c(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar = y3i.f54824a;
                            return new b86(l8iVarM36787m, null, rx0Var.m47215a(), 2, null);
                        }
                        if (!mm7.m39354a(exeVar.m25723b(), false)) {
                            throw new g86("S3Express bucket name is not a valid virtual hostable name.");
                        }
                        l8i l8iVarM36787m2 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b.m38575d() + "://" + exeVar.m25723b() + '.' + m8iVarM37467b.m38572a() + m8iVarM37467b.m38574c(), null, 2, null);
                        rx0 rx0Var2 = new rx0();
                        rx0Var2.m47216b("backend", "S3Express");
                        rx0Var2.m47217c(bsf.m19700b(), bh3.m18963e(qrf.m45816c(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar2 = y3i.f54824a;
                        return new b86(l8iVarM36787m2, null, rx0Var2.m47215a(), 2, null);
                    }
                    if ((m8iVarM37467b.m38576e()) && (strM37469d3 = lm7.m37469d(exeVar.m25723b())) != null) {
                        l8i l8iVarM36787m3 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b.m38575d() + "://" + m8iVarM37467b.m38572a() + '/' + strM37469d3 + m8iVarM37467b.m38574c(), null, 2, null);
                        rx0 rx0Var3 = new rx0();
                        rx0Var3.m47216b("backend", "S3Express");
                        rx0Var3.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar3 = y3i.f54824a;
                        return new b86(l8iVarM36787m3, null, rx0Var3.m47215a(), 2, null);
                    }
                    if (!mm7.m39354a(exeVar.m25723b(), false)) {
                        throw new g86("S3Express bucket name is not a valid virtual hostable name.");
                    }
                    l8i l8iVarM36787m4 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b.m38575d() + "://" + exeVar.m25723b() + '.' + m8iVarM37467b.m38572a() + m8iVarM37467b.m38574c(), null, 2, null);
                    rx0 rx0Var4 = new rx0();
                    rx0Var4.m47216b("backend", "S3Express");
                    rx0Var4.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar4 = y3i.f54824a;
                    return new b86(l8iVarM36787m4, null, rx0Var4.m47215a(), 2, null);
                }
                if (exeVar.m25735n() != null && sq8.m48644c(exeVar.m25735n(), ml1.m39301a(true)) && (strM37469d = lm7.m37469d(exeVar.m25723b())) != null && exeVar.m25727f() == null) {
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                        l8i l8iVarM36787m5 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3express-control-fips." + exeVar.m25729h() + ".amazonaws.com/" + strM37469d, null, 2, null);
                        rx0 rx0Var5 = new rx0();
                        rx0Var5.m47216b("backend", "S3Express");
                        rx0Var5.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar5 = y3i.f54824a;
                        return new b86(l8iVarM36787m5, null, rx0Var5.m47215a(), 2, null);
                    }
                    l8i l8iVarM36787m6 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3express-control." + exeVar.m25729h() + ".amazonaws.com/" + strM37469d, null, 2, null);
                    rx0 rx0Var6 = new rx0();
                    rx0Var6.m47216b("backend", "S3Express");
                    rx0Var6.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar6 = y3i.f54824a;
                    return new b86(l8iVarM36787m6, null, rx0Var6.m47215a(), 2, null);
                }
                if (!mm7.m39354a(exeVar.m25723b(), false)) {
                    throw new g86("S3Express bucket name is not a valid virtual hostable name.");
                }
                if (exeVar.m25726e() == null || !sq8.m48644c(exeVar.m25726e(), ml1.m39301a(true))) {
                    String strM37468c2 = lm7.m37468c(exeVar.m25723b(), 6, 14, true);
                    String strM37468c3 = lm7.m37468c(exeVar.m25723b(), 14, 16, true);
                    if (strM37468c2 != null && strM37468c3 != null && sq8.m48644c(strM37468c3, "--")) {
                        if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m7 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-fips-" + strM37468c2 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                            rx0 rx0Var7 = new rx0();
                            rx0Var7.m47216b("backend", "S3Express");
                            rx0Var7.m47217c(bsf.m19700b(), bh3.m18963e(qrf.m45816c(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar7 = y3i.f54824a;
                            return new b86(l8iVarM36787m7, null, rx0Var7.m47215a(), 2, null);
                        }
                        l8i l8iVarM36787m8 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-" + strM37468c2 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                        rx0 rx0Var8 = new rx0();
                        rx0Var8.m47216b("backend", "S3Express");
                        rx0Var8.m47217c(bsf.m19700b(), bh3.m18963e(qrf.m45816c(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar8 = y3i.f54824a;
                        return new b86(l8iVarM36787m8, null, rx0Var8.m47215a(), 2, null);
                    }
                    String strM37468c4 = lm7.m37468c(exeVar.m25723b(), 6, 15, true);
                    String strM37468c5 = lm7.m37468c(exeVar.m25723b(), 15, 17, true);
                    if (strM37468c4 == null || strM37468c5 == null || !sq8.m48644c(strM37468c5, "--")) {
                        throw new g86("Unrecognized S3Express bucket name format.");
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                        l8i l8iVarM36787m9 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-fips-" + strM37468c4 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                        rx0 rx0Var9 = new rx0();
                        rx0Var9.m47216b("backend", "S3Express");
                        rx0Var9.m47217c(bsf.m19700b(), bh3.m18963e(qrf.m45816c(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar9 = y3i.f54824a;
                        return new b86(l8iVarM36787m9, null, rx0Var9.m47215a(), 2, null);
                    }
                    l8i l8iVarM36787m10 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-" + strM37468c4 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                    rx0 rx0Var10 = new rx0();
                    rx0Var10.m47216b("backend", "S3Express");
                    rx0Var10.m47217c(bsf.m19700b(), bh3.m18963e(qrf.m45816c(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar10 = y3i.f54824a;
                    return new b86(l8iVarM36787m10, null, rx0Var10.m47215a(), 2, null);
                }
                String strM37468c6 = lm7.m37468c(exeVar.m25723b(), 6, 14, true);
                String strM37468c7 = lm7.m37468c(exeVar.m25723b(), 14, 16, true);
                if (strM37468c6 != null && strM37468c7 != null && sq8.m48644c(strM37468c7, "--")) {
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                        l8i l8iVarM36787m11 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-fips-" + strM37468c6 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                        rx0 rx0Var11 = new rx0();
                        rx0Var11.m47216b("backend", "S3Express");
                        rx0Var11.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar11 = y3i.f54824a;
                        return new b86(l8iVarM36787m11, null, rx0Var11.m47215a(), 2, null);
                    }
                    l8i l8iVarM36787m12 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-" + strM37468c6 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                    rx0 rx0Var12 = new rx0();
                    rx0Var12.m47216b("backend", "S3Express");
                    rx0Var12.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar12 = y3i.f54824a;
                    return new b86(l8iVarM36787m12, null, rx0Var12.m47215a(), 2, null);
                }
                String strM37468c8 = lm7.m37468c(exeVar.m25723b(), 6, 15, true);
                String strM37468c9 = lm7.m37468c(exeVar.m25723b(), 15, 17, true);
                if (strM37468c8 == null || strM37468c9 == null || !sq8.m48644c(strM37468c9, "--")) {
                    throw new g86("Unrecognized S3Express bucket name format.");
                }
                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                    l8i l8iVarM36787m13 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-fips-" + strM37468c8 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                    rx0 rx0Var13 = new rx0();
                    rx0Var13.m47216b("backend", "S3Express");
                    rx0Var13.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar13 = y3i.f54824a;
                    return new b86(l8iVarM36787m13, null, rx0Var13.m47215a(), 2, null);
                }
                l8i l8iVarM36787m14 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3express-" + strM37468c8 + '.' + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                rx0 rx0Var14 = new rx0();
                rx0Var14.m47216b("backend", "S3Express");
                rx0Var14.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                y3i y3iVar14 = y3i.f54824a;
                return new b86(l8iVarM36787m14, null, rx0Var14.m47215a(), 2, null);
            }
            if (exeVar.m25723b() == null && exeVar.m25735n() != null && sq8.m48644c(exeVar.m25735n(), ml1.m39301a(true))) {
                m8i m8iVarM37467b2 = lm7.m37467b(exeVar.m25727f());
                if (m8iVarM37467b2 != null && exeVar.m25727f() != null) {
                    l8i l8iVarM36787m15 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b2.m38575d() + "://" + m8iVarM37467b2.m38572a() + m8iVarM37467b2.m38574c(), null, 2, null);
                    rx0 rx0Var15 = new rx0();
                    rx0Var15.m47216b("backend", "S3Express");
                    rx0Var15.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar15 = y3i.f54824a;
                    return new b86(l8iVarM36787m15, null, rx0Var15.m47215a(), 2, null);
                }
                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                    l8i l8iVarM36787m16 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3express-control-fips." + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                    rx0 rx0Var16 = new rx0();
                    rx0Var16.m47216b("backend", "S3Express");
                    rx0Var16.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar16 = y3i.f54824a;
                    return new b86(l8iVarM36787m16, null, rx0Var16.m47215a(), 2, null);
                }
                l8i l8iVarM36787m17 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3express-control." + exeVar.m25729h() + ".amazonaws.com", null, 2, null);
                rx0 rx0Var17 = new rx0();
                rx0Var17.m47216b("backend", "S3Express");
                rx0Var17.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3express", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                y3i y3iVar17 = y3i.f54824a;
                return new b86(l8iVarM36787m17, null, rx0Var17.m47215a(), 2, null);
            }
            String strM37468c10 = lm7.m37468c(exeVar.m25723b(), 49, 50, true);
            String strM37468c11 = lm7.m37468c(exeVar.m25723b(), 8, 12, true);
            String strM37468c12 = lm7.m37468c(exeVar.m25723b(), 0, 7, true);
            String strM37468c13 = lm7.m37468c(exeVar.m25723b(), 32, 49, true);
            wyc wycVarM27819a9 = fzc.m27819a(exeVar.m25729h());
            if (strM37468c10 != null && strM37468c11 != null && strM37468c12 != null && strM37468c13 != null && wycVarM27819a9 != null && exeVar.m25723b() != null && sq8.m48644c(strM37468c12, "--op-s3")) {
                if (!lm7.m37466a(strM37468c13, false)) {
                    throw new g86("Invalid ARN: The outpost Id must only contain a-z, A-Z, 0-9 and `-`.");
                }
                if (sq8.m48644c(strM37468c10, "e")) {
                    if (sq8.m48644c(strM37468c11, "beta")) {
                        if (exeVar.m25727f() == null) {
                            throw new g86("Expected a endpoint to be specified but no endpoint was found");
                        }
                        m8i m8iVarM37467b3 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b3 != null && exeVar.m25727f() != null) {
                            l8i l8iVarM36787m18 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".ec2." + m8iVarM37467b3.m38572a(), null, 2, null);
                            rx0 rx0Var18 = new rx0();
                            rx0Var18.m47217c(bsf.m19700b(), ch3.m21249n(mrf.m39528b(false, "s3-outposts", bh3.m18963e("*"), ml1.m39301a(true), null, 17, null), orf.m42606d(false, "s3-outposts", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar18 = y3i.f54824a;
                            return new b86(l8iVarM36787m18, null, rx0Var18.m47215a(), 2, null);
                        }
                    }
                    l8i l8iVarM36787m19 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".ec2.s3-outposts." + exeVar.m25729h() + '.' + wycVarM27819a9.m55421a(), null, 2, null);
                    rx0 rx0Var19 = new rx0();
                    rx0Var19.m47217c(bsf.m19700b(), ch3.m21249n(mrf.m39528b(false, "s3-outposts", bh3.m18963e("*"), ml1.m39301a(true), null, 17, null), orf.m42606d(false, "s3-outposts", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar19 = y3i.f54824a;
                    return new b86(l8iVarM36787m19, null, rx0Var19.m47215a(), 2, null);
                }
                if (!sq8.m48644c(strM37468c10, NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST)) {
                    throw new g86("Unrecognized hardware type: \"Expected hardware type o or e but got " + strM37468c10 + TokenParser.DQUOTE);
                }
                if (sq8.m48644c(strM37468c11, "beta")) {
                    if (exeVar.m25727f() == null) {
                        throw new g86("Expected a endpoint to be specified but no endpoint was found");
                    }
                    m8i m8iVarM37467b4 = lm7.m37467b(exeVar.m25727f());
                    if (m8iVarM37467b4 != null && exeVar.m25727f() != null) {
                        l8i l8iVarM36787m20 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".op-" + strM37468c13 + '.' + m8iVarM37467b4.m38572a(), null, 2, null);
                        rx0 rx0Var20 = new rx0();
                        rx0Var20.m47217c(bsf.m19700b(), ch3.m21249n(mrf.m39528b(false, "s3-outposts", bh3.m18963e("*"), ml1.m39301a(true), null, 17, null), orf.m42606d(false, "s3-outposts", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar20 = y3i.f54824a;
                        return new b86(l8iVarM36787m20, null, rx0Var20.m47215a(), 2, null);
                    }
                }
                l8i l8iVarM36787m21 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".op-" + strM37468c13 + ".s3-outposts." + exeVar.m25729h() + '.' + wycVarM27819a9.m55421a(), null, 2, null);
                rx0 rx0Var21 = new rx0();
                rx0Var21.m47217c(bsf.m19700b(), ch3.m21249n(mrf.m39528b(false, "s3-outposts", bh3.m18963e("*"), ml1.m39301a(true), null, 17, null), orf.m42606d(false, "s3-outposts", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                y3i y3iVar21 = y3i.f54824a;
                return new b86(l8iVarM36787m21, null, rx0Var21.m47215a(), 2, null);
            }
            if (exeVar.m25723b() != null) {
                if (exeVar.m25727f() != null && lm7.m37467b(exeVar.m25727f()) == null) {
                    throw new g86("Custom endpoint `" + exeVar.m25727f() + "` was not a valid URI");
                }
                if (sq8.m48644c(exeVar.m25728g(), ml1.m39301a(false)) && mm7.m39354a(exeVar.m25723b(), false) && (wycVarM27819a7 = fzc.m27819a(exeVar.m25729h())) != null) {
                    if (lm7.m37466a(exeVar.m25729h(), false)) {
                        if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && sq8.m48644c(wycVarM27819a7.m55423c(), "aws-cn")) {
                            throw new g86("S3 Accelerate cannot be used in this region");
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m22 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-fips.dualstack.us-east-1." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var22 = new rx0();
                            rx0Var22.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar22 = y3i.f54824a;
                            return new b86(l8iVarM36787m22, null, rx0Var22.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m23 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-fips.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var23 = new rx0();
                            rx0Var23.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar23 = y3i.f54824a;
                            return new b86(l8iVarM36787m23, null, rx0Var23.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m24 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-fips.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var24 = new rx0();
                            rx0Var24.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar24 = y3i.f54824a;
                            return new b86(l8iVarM36787m24, null, rx0Var24.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m25 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-fips.us-east-1." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var25 = new rx0();
                            rx0Var25.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar25 = y3i.f54824a;
                            return new b86(l8iVarM36787m25, null, rx0Var25.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m26 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-fips." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var26 = new rx0();
                            rx0Var26.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar26 = y3i.f54824a;
                            return new b86(l8iVarM36787m26, null, rx0Var26.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m27 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-fips." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var27 = new rx0();
                            rx0Var27.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar27 = y3i.f54824a;
                            return new b86(l8iVarM36787m27, null, rx0Var27.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m28 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-accelerate.dualstack.us-east-1." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var28 = new rx0();
                            rx0Var28.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar28 = y3i.f54824a;
                            return new b86(l8iVarM36787m28, null, rx0Var28.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m29 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-accelerate.dualstack." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var29 = new rx0();
                            rx0Var29.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar29 = y3i.f54824a;
                            return new b86(l8iVarM36787m29, null, rx0Var29.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m30 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-accelerate.dualstack." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var30 = new rx0();
                            rx0Var30.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar30 = y3i.f54824a;
                            return new b86(l8iVarM36787m30, null, rx0Var30.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m31 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3.dualstack.us-east-1." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var31 = new rx0();
                            rx0Var31.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar31 = y3i.f54824a;
                            return new b86(l8iVarM36787m31, null, rx0Var31.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m32 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var32 = new rx0();
                            rx0Var32.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar32 = y3i.f54824a;
                            return new b86(l8iVarM36787m32, null, rx0Var32.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m33 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var33 = new rx0();
                            rx0Var33.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar33 = y3i.f54824a;
                            return new b86(l8iVarM36787m33, null, rx0Var33.m47215a(), 2, null);
                        }
                        m8i m8iVarM37467b5 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b5 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() != null) {
                            if ((m8iVarM37467b5.m38576e()) && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                                l8i l8iVarM36787m34 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b5.m38575d() + "://" + m8iVarM37467b5.m38572a() + m8iVarM37467b5.m38573b() + exeVar.m25723b(), null, 2, null);
                                rx0 rx0Var34 = new rx0();
                                rx0Var34.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar34 = y3i.f54824a;
                                return new b86(l8iVarM36787m34, null, rx0Var34.m47215a(), 2, null);
                            }
                        }
                        m8i m8iVarM37467b6 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b6 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() != null && (!m8iVarM37467b6.m38576e()) && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m35 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b6.m38575d() + "://" + exeVar.m25723b() + '.' + m8iVarM37467b6.m38572a() + m8iVarM37467b6.m38574c(), null, 2, null);
                            rx0 rx0Var35 = new rx0();
                            rx0Var35.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar35 = y3i.f54824a;
                            return new b86(l8iVarM36787m35, null, rx0Var35.m47215a(), 2, null);
                        }
                        m8i m8iVarM37467b7 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b7 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() != null) {
                            if ((m8iVarM37467b7.m38576e()) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                                if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                                    l8i l8iVarM36787m36 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b7.m38575d() + "://" + m8iVarM37467b7.m38572a() + m8iVarM37467b7.m38573b() + exeVar.m25723b(), null, 2, null);
                                    rx0 rx0Var36 = new rx0();
                                    rx0Var36.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar36 = y3i.f54824a;
                                    return new b86(l8iVarM36787m36, null, rx0Var36.m47215a(), 2, null);
                                }
                                l8i l8iVarM36787m37 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b7.m38575d() + "://" + m8iVarM37467b7.m38572a() + m8iVarM37467b7.m38573b() + exeVar.m25723b(), null, 2, null);
                                rx0 rx0Var37 = new rx0();
                                rx0Var37.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar37 = y3i.f54824a;
                                return new b86(l8iVarM36787m37, null, rx0Var37.m47215a(), 2, null);
                            }
                        }
                        m8i m8iVarM37467b8 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b8 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() != null && (!m8iVarM37467b8.m38576e()) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                                l8i l8iVarM36787m38 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b8.m38575d() + "://" + exeVar.m25723b() + '.' + m8iVarM37467b8.m38572a() + m8iVarM37467b8.m38574c(), null, 2, null);
                                rx0 rx0Var38 = new rx0();
                                rx0Var38.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar38 = y3i.f54824a;
                                return new b86(l8iVarM36787m38, null, rx0Var38.m47215a(), 2, null);
                            }
                            l8i l8iVarM36787m39 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b8.m38575d() + "://" + exeVar.m25723b() + '.' + m8iVarM37467b8.m38572a() + m8iVarM37467b8.m38574c(), null, 2, null);
                            rx0 rx0Var39 = new rx0();
                            rx0Var39.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar39 = y3i.f54824a;
                            return new b86(l8iVarM36787m39, null, rx0Var39.m47215a(), 2, null);
                        }
                        m8i m8iVarM37467b9 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b9 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() != null) {
                            if ((m8iVarM37467b9.m38576e()) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                                l8i l8iVarM36787m40 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b9.m38575d() + "://" + m8iVarM37467b9.m38572a() + m8iVarM37467b9.m38573b() + exeVar.m25723b(), null, 2, null);
                                rx0 rx0Var40 = new rx0();
                                rx0Var40.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar40 = y3i.f54824a;
                                return new b86(l8iVarM36787m40, null, rx0Var40.m47215a(), 2, null);
                            }
                        }
                        m8i m8iVarM37467b10 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b10 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() != null && (!m8iVarM37467b10.m38576e()) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m41 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b10.m38575d() + "://" + exeVar.m25723b() + '.' + m8iVarM37467b10.m38572a() + m8iVarM37467b10.m38574c(), null, 2, null);
                            rx0 rx0Var41 = new rx0();
                            rx0Var41.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar41 = y3i.f54824a;
                            return new b86(l8iVarM36787m41, null, rx0Var41.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m42 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-accelerate." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var42 = new rx0();
                            rx0Var42.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar42 = y3i.f54824a;
                            return new b86(l8iVarM36787m42, null, rx0Var42.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                                l8i l8iVarM36787m43 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-accelerate." + wycVarM27819a7.m55421a(), null, 2, null);
                                rx0 rx0Var43 = new rx0();
                                rx0Var43.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar43 = y3i.f54824a;
                                return new b86(l8iVarM36787m43, null, rx0Var43.m47215a(), 2, null);
                            }
                            l8i l8iVarM36787m44 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-accelerate." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var44 = new rx0();
                            rx0Var44.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar44 = y3i.f54824a;
                            return new b86(l8iVarM36787m44, null, rx0Var44.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m45 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3-accelerate." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var45 = new rx0();
                            rx0Var45.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar45 = y3i.f54824a;
                            return new b86(l8iVarM36787m45, null, rx0Var45.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m46 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3." + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var46 = new rx0();
                            rx0Var46.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar46 = y3i.f54824a;
                            return new b86(l8iVarM36787m46, null, rx0Var46.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                                l8i l8iVarM36787m47 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3." + wycVarM27819a7.m55421a(), null, 2, null);
                                rx0 rx0Var47 = new rx0();
                                rx0Var47.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar47 = y3i.f54824a;
                                return new b86(l8iVarM36787m47, null, rx0Var47.m47215a(), 2, null);
                            }
                            l8i l8iVarM36787m48 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var48 = new rx0();
                            rx0Var48.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar48 = y3i.f54824a;
                            return new b86(l8iVarM36787m48, null, rx0Var48.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m49 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + exeVar.m25723b() + ".s3." + exeVar.m25729h() + '.' + wycVarM27819a7.m55421a(), null, 2, null);
                            rx0 rx0Var49 = new rx0();
                            rx0Var49.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar49 = y3i.f54824a;
                            return new b86(l8iVarM36787m49, null, rx0Var49.m47215a(), 2, null);
                        }
                    }
                    throw new g86("Invalid region: region was not a valid DNS name.");
                }
                m8i m8iVarM37467b11 = lm7.m37467b(exeVar.m25727f());
                if (m8iVarM37467b11 != null && exeVar.m25727f() != null && sq8.m48644c(m8iVarM37467b11.m38575d(), HttpHost.DEFAULT_SCHEME_NAME) && mm7.m39354a(exeVar.m25723b(), true) && sq8.m48644c(exeVar.m25728g(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false)) && fzc.m27819a(exeVar.m25729h()) != null) {
                    if (!lm7.m37466a(exeVar.m25729h(), false)) {
                        throw new g86("Invalid region: region was not a valid DNS name.");
                    }
                    l8i l8iVarM36787m50 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b11.m38575d() + "://" + exeVar.m25723b() + '.' + m8iVarM37467b11.m38572a() + m8iVarM37467b11.m38574c(), null, 2, null);
                    rx0 rx0Var50 = new rx0();
                    rx0Var50.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar50 = y3i.f54824a;
                    return new b86(l8iVarM36787m50, null, rx0Var50.m47215a(), 2, null);
                }
                io0 io0VarM39356c = mm7.m39356c(exeVar.m25723b());
                if (io0VarM39356c != null && sq8.m48644c(exeVar.m25728g(), ml1.m39301a(false))) {
                    List listM32507d = io0VarM39356c.m32507d();
                    String str = listM32507d != null ? (String) kh3.i0(listM32507d, 0) : null;
                    if (str == null || sq8.m48644c(str, "")) {
                        throw new g86("Invalid ARN: No ARN type specified");
                    }
                    if (sq8.m48644c(io0VarM39356c.m32508e(), "s3-object-lambda")) {
                        if (!sq8.m48644c(str, "accesspoint")) {
                            throw new g86("Invalid ARN: Object Lambda ARNs only support `accesspoint` arn types, but found: `" + str + '`');
                        }
                        List listM32507d2 = io0VarM39356c.m32507d();
                        String str2 = listM32507d2 != null ? (String) kh3.i0(listM32507d2, 1) : null;
                        if (str2 == null || sq8.m48644c(str2, "")) {
                            throw new g86("Invalid ARN: Expected a resource of the format `accesspoint:<accesspoint name>` but no name was provided");
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true))) {
                            throw new g86("S3 Object Lambda does not support Dual-stack");
                        }
                        if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true))) {
                            throw new g86("S3 Object Lambda does not support S3 Accelerate");
                        }
                        if (sq8.m48644c(io0VarM39356c.m32506c(), "")) {
                            throw new g86("Invalid ARN: bucket ARN is missing a region");
                        }
                        if (exeVar.m25724c() != null && sq8.m48644c(exeVar.m25724c(), ml1.m39301a(true))) {
                            throw new g86("Access points are not supported for this operation");
                        }
                        List listM32507d3 = io0VarM39356c.m32507d();
                        if ((listM32507d3 != null ? (String) kh3.i0(listM32507d3, 2) : null) == null) {
                            if (exeVar.m25730i() != null && sq8.m48644c(exeVar.m25730i(), ml1.m39301a(false)) && !sq8.m48644c(io0VarM39356c.m32506c(), String.valueOf(exeVar.m25729h()))) {
                                throw new g86("Invalid configuration: region from ARN `" + io0VarM39356c.m32506c() + "` does not match client region `" + exeVar.m25729h() + "` and UseArnRegion is `false`");
                            }
                            wyc wycVarM27819a10 = fzc.m27819a(io0VarM39356c.m32506c());
                            if (wycVarM27819a10 != null && (wycVarM27819a6 = fzc.m27819a(exeVar.m25729h())) != null) {
                                if (!sq8.m48644c(wycVarM27819a10.m55423c(), wycVarM27819a6.m55423c())) {
                                    throw new g86("Client was configured for partition `" + wycVarM27819a6.m55423c() + "` but ARN (`" + exeVar.m25723b() + "`) has `" + wycVarM27819a10.m55423c() + '`');
                                }
                                if (!lm7.m37466a(io0VarM39356c.m32506c(), true)) {
                                    throw new g86("Invalid region in ARN: `" + io0VarM39356c.m32506c() + "` (invalid DNS name)");
                                }
                                if (sq8.m48644c(io0VarM39356c.m32504a(), "")) {
                                    throw new g86("Invalid ARN: Missing account id");
                                }
                                if (!lm7.m37466a(io0VarM39356c.m32504a(), false)) {
                                    throw new g86("Invalid ARN: The account id may only contain a-z, A-Z, 0-9 and `-`. Found: `" + io0VarM39356c.m32504a() + '`');
                                }
                                if (!lm7.m37466a(str2, false)) {
                                    throw new g86("Invalid ARN: The access point name may only contain a-z, A-Z, 0-9 and `-`. Found: `" + str2 + '`');
                                }
                                m8i m8iVarM37467b12 = lm7.m37467b(exeVar.m25727f());
                                if (m8iVarM37467b12 != null && exeVar.m25727f() != null) {
                                    l8i l8iVarM36787m51 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b12.m38575d() + "://" + str2 + '-' + io0VarM39356c.m32504a() + '.' + m8iVarM37467b12.m38572a() + m8iVarM37467b12.m38574c(), null, 2, null);
                                    rx0 rx0Var51 = new rx0();
                                    rx0Var51.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3-object-lambda", String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar51 = y3i.f54824a;
                                    return new b86(l8iVarM36787m51, null, rx0Var51.m47215a(), 2, null);
                                }
                                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                                    l8i l8iVarM36787m52 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str2 + '-' + io0VarM39356c.m32504a() + ".s3-object-lambda-fips." + io0VarM39356c.m32506c() + '.' + wycVarM27819a10.m55421a(), null, 2, null);
                                    rx0 rx0Var52 = new rx0();
                                    rx0Var52.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3-object-lambda", String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar52 = y3i.f54824a;
                                    return new b86(l8iVarM36787m52, null, rx0Var52.m47215a(), 2, null);
                                }
                                l8i l8iVarM36787m53 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str2 + '-' + io0VarM39356c.m32504a() + ".s3-object-lambda." + io0VarM39356c.m32506c() + '.' + wycVarM27819a10.m55421a(), null, 2, null);
                                rx0 rx0Var53 = new rx0();
                                rx0Var53.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3-object-lambda", String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar53 = y3i.f54824a;
                                return new b86(l8iVarM36787m53, null, rx0Var53.m47215a(), 2, null);
                            }
                        }
                        throw new g86("Invalid ARN: The ARN may only contain a single resource component after `accesspoint`.");
                    }
                    if (!sq8.m48644c(str, "accesspoint")) {
                        if (!sq8.m48644c(io0VarM39356c.m32508e(), "s3-outposts")) {
                            throw new g86("Invalid ARN: Unrecognized format: " + exeVar.m25723b() + " (type: " + str + ')');
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true))) {
                            throw new g86("S3 Outposts does not support Dual-stack");
                        }
                        if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                            throw new g86("S3 Outposts does not support FIPS");
                        }
                        if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true))) {
                            throw new g86("S3 Outposts does not support S3 Accelerate");
                        }
                        List listM32507d4 = io0VarM39356c.m32507d();
                        if ((listM32507d4 != null ? (String) kh3.i0(listM32507d4, 4) : null) != null) {
                            throw new g86("Invalid Arn: Outpost Access Point ARN contains sub resources");
                        }
                        List listM32507d5 = io0VarM39356c.m32507d();
                        String str3 = listM32507d5 != null ? (String) kh3.i0(listM32507d5, 1) : null;
                        if (str3 == null) {
                            throw new g86("Invalid ARN: The Outpost Id was not set");
                        }
                        if (lm7.m37466a(str3, false)) {
                            if (exeVar.m25730i() != null && sq8.m48644c(exeVar.m25730i(), ml1.m39301a(false)) && !sq8.m48644c(io0VarM39356c.m32506c(), String.valueOf(exeVar.m25729h()))) {
                                throw new g86("Invalid configuration: region from ARN `" + io0VarM39356c.m32506c() + "` does not match client region `" + exeVar.m25729h() + "` and UseArnRegion is `false`");
                            }
                            wyc wycVarM27819a11 = fzc.m27819a(io0VarM39356c.m32506c());
                            if (wycVarM27819a11 != null && (wycVarM27819a4 = fzc.m27819a(exeVar.m25729h())) != null) {
                                if (!sq8.m48644c(wycVarM27819a11.m55423c(), wycVarM27819a4.m55423c())) {
                                    throw new g86("Client was configured for partition `" + wycVarM27819a4.m55423c() + "` but ARN (`" + exeVar.m25723b() + "`) has `" + wycVarM27819a11.m55423c() + '`');
                                }
                                if (!lm7.m37466a(io0VarM39356c.m32506c(), true)) {
                                    throw new g86("Invalid region in ARN: `" + io0VarM39356c.m32506c() + "` (invalid DNS name)");
                                }
                                if (!lm7.m37466a(io0VarM39356c.m32504a(), false)) {
                                    throw new g86("Invalid ARN: The account id may only contain a-z, A-Z, 0-9 and `-`. Found: `" + io0VarM39356c.m32504a() + '`');
                                }
                                List listM32507d6 = io0VarM39356c.m32507d();
                                String str4 = listM32507d6 != null ? (String) kh3.i0(listM32507d6, 2) : null;
                                if (str4 == null) {
                                    throw new g86("Invalid ARN: Expected a 4-component resource");
                                }
                                List listM32507d7 = io0VarM39356c.m32507d();
                                String str5 = listM32507d7 != null ? (String) kh3.i0(listM32507d7, 3) : null;
                                if (str5 == null) {
                                    throw new g86("Invalid ARN: expected an access point name");
                                }
                                if (!sq8.m48644c(str4, "accesspoint")) {
                                    throw new g86("Expected an outpost type `accesspoint`, found " + str4);
                                }
                                m8i m8iVarM37467b13 = lm7.m37467b(exeVar.m25727f());
                                if (m8iVarM37467b13 != null && exeVar.m25727f() != null) {
                                    l8i l8iVarM36787m54 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str5 + '-' + io0VarM39356c.m32504a() + '.' + str3 + '.' + m8iVarM37467b13.m38572a(), null, 2, null);
                                    rx0 rx0Var54 = new rx0();
                                    rx0Var54.m47217c(bsf.m19700b(), ch3.m21249n(mrf.m39528b(false, "s3-outposts", bh3.m18963e("*"), ml1.m39301a(true), null, 17, null), orf.m42606d(false, "s3-outposts", String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar54 = y3i.f54824a;
                                    return new b86(l8iVarM36787m54, null, rx0Var54.m47215a(), 2, null);
                                }
                                l8i l8iVarM36787m55 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str5 + '-' + io0VarM39356c.m32504a() + '.' + str3 + ".s3-outposts." + io0VarM39356c.m32506c() + '.' + wycVarM27819a11.m55421a(), null, 2, null);
                                rx0 rx0Var55 = new rx0();
                                rx0Var55.m47217c(bsf.m19700b(), ch3.m21249n(mrf.m39528b(false, "s3-outposts", bh3.m18963e("*"), ml1.m39301a(true), null, 17, null), orf.m42606d(false, "s3-outposts", String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar55 = y3i.f54824a;
                                return new b86(l8iVarM36787m55, null, rx0Var55.m47215a(), 2, null);
                            }
                        }
                        throw new g86("Invalid ARN: The outpost Id may only contain a-z, A-Z, 0-9 and `-`. Found: `" + str3 + '`');
                    }
                    List listM32507d8 = io0VarM39356c.m32507d();
                    String str6 = listM32507d8 != null ? (String) kh3.i0(listM32507d8, 1) : null;
                    if (str6 == null || sq8.m48644c(str6, "")) {
                        throw new g86("Invalid ARN: Expected a resource of the format `accesspoint:<accesspoint name>` but no name was provided");
                    }
                    if (sq8.m48644c(io0VarM39356c.m32506c(), "") || !sq8.m48644c(str, "accesspoint") || sq8.m48644c(io0VarM39356c.m32506c(), "")) {
                        if (lm7.m37466a(str6, true)) {
                            if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true))) {
                                throw new g86("S3 MRAP does not support dual-stack");
                            }
                            if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                                throw new g86("S3 MRAP does not support FIPS");
                            }
                            if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true))) {
                                throw new g86("S3 MRAP does not support S3 Accelerate");
                            }
                            if (sq8.m48644c(exeVar.m25725d(), ml1.m39301a(true))) {
                                throw new g86("Invalid configuration: Multi-Region Access Point ARNs are disabled.");
                            }
                            wyc wycVarM27819a12 = fzc.m27819a(exeVar.m25729h());
                            if (wycVarM27819a12 != null) {
                                if (!sq8.m48644c(wycVarM27819a12.m55423c(), io0VarM39356c.m32505b())) {
                                    throw new g86("Client was configured for partition `" + wycVarM27819a12.m55423c() + "` but bucket referred to partition `" + io0VarM39356c.m32505b() + '`');
                                }
                                l8i l8iVarM36787m56 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str6 + ".accesspoint.s3-global." + wycVarM27819a12.m55421a(), null, 2, null);
                                rx0 rx0Var56 = new rx0();
                                rx0Var56.m47217c(bsf.m19700b(), bh3.m18963e(mrf.m39528b(false, ServiceAbbreviations.S3, bh3.m18963e("*"), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar56 = y3i.f54824a;
                                return new b86(l8iVarM36787m56, null, rx0Var56.m47215a(), 2, null);
                            }
                        }
                        throw new g86("Invalid Access Point Name");
                    }
                    if (exeVar.m25724c() != null && sq8.m48644c(exeVar.m25724c(), ml1.m39301a(true))) {
                        throw new g86("Access points are not supported for this operation");
                    }
                    List listM32507d9 = io0VarM39356c.m32507d();
                    if ((listM32507d9 != null ? (String) kh3.i0(listM32507d9, 2) : null) == null) {
                        if (exeVar.m25730i() != null && sq8.m48644c(exeVar.m25730i(), ml1.m39301a(false)) && !sq8.m48644c(io0VarM39356c.m32506c(), String.valueOf(exeVar.m25729h()))) {
                            throw new g86("Invalid configuration: region from ARN `" + io0VarM39356c.m32506c() + "` does not match client region `" + exeVar.m25729h() + "` and UseArnRegion is `false`");
                        }
                        wyc wycVarM27819a13 = fzc.m27819a(io0VarM39356c.m32506c());
                        if (wycVarM27819a13 != null && (wycVarM27819a5 = fzc.m27819a(exeVar.m25729h())) != null) {
                            if (!sq8.m48644c(wycVarM27819a13.m55423c(), String.valueOf(wycVarM27819a5.m55423c()))) {
                                throw new g86("Client was configured for partition `" + wycVarM27819a5.m55423c() + "` but ARN (`" + exeVar.m25723b() + "`) has `" + wycVarM27819a13.m55423c() + '`');
                            }
                            if (!lm7.m37466a(io0VarM39356c.m32506c(), true)) {
                                throw new g86("Invalid region in ARN: `" + io0VarM39356c.m32506c() + "` (invalid DNS name)");
                            }
                            if (!sq8.m48644c(io0VarM39356c.m32508e(), ServiceAbbreviations.S3)) {
                                throw new g86("Invalid ARN: The ARN was not for the S3 service, found: " + io0VarM39356c.m32508e());
                            }
                            if (!lm7.m37466a(io0VarM39356c.m32504a(), false)) {
                                throw new g86("Invalid ARN: The account id may only contain a-z, A-Z, 0-9 and `-`. Found: `" + io0VarM39356c.m32504a() + '`');
                            }
                            if (lm7.m37466a(str6, false)) {
                                if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true))) {
                                    throw new g86("Access Points do not support S3 Accelerate");
                                }
                                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true))) {
                                    l8i l8iVarM36787m57 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str6 + '-' + io0VarM39356c.m32504a() + ".s3-accesspoint-fips.dualstack." + io0VarM39356c.m32506c() + '.' + wycVarM27819a13.m55421a(), null, 2, null);
                                    rx0 rx0Var57 = new rx0();
                                    rx0Var57.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar57 = y3i.f54824a;
                                    return new b86(l8iVarM36787m57, null, rx0Var57.m47215a(), 2, null);
                                }
                                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false))) {
                                    l8i l8iVarM36787m58 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str6 + '-' + io0VarM39356c.m32504a() + ".s3-accesspoint-fips." + io0VarM39356c.m32506c() + '.' + wycVarM27819a13.m55421a(), null, 2, null);
                                    rx0 rx0Var58 = new rx0();
                                    rx0Var58.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar58 = y3i.f54824a;
                                    return new b86(l8iVarM36787m58, null, rx0Var58.m47215a(), 2, null);
                                }
                                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true))) {
                                    l8i l8iVarM36787m59 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str6 + '-' + io0VarM39356c.m32504a() + ".s3-accesspoint.dualstack." + io0VarM39356c.m32506c() + '.' + wycVarM27819a13.m55421a(), null, 2, null);
                                    rx0 rx0Var59 = new rx0();
                                    rx0Var59.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar59 = y3i.f54824a;
                                    return new b86(l8iVarM36787m59, null, rx0Var59.m47215a(), 2, null);
                                }
                                m8i m8iVarM37467b14 = lm7.m37467b(exeVar.m25727f());
                                if (m8iVarM37467b14 != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() != null) {
                                    l8i l8iVarM36787m60 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b14.m38575d() + "://" + str6 + '-' + io0VarM39356c.m32504a() + '.' + m8iVarM37467b14.m38572a() + m8iVarM37467b14.m38574c(), null, 2, null);
                                    rx0 rx0Var60 = new rx0();
                                    rx0Var60.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar60 = y3i.f54824a;
                                    return new b86(l8iVarM36787m60, null, rx0Var60.m47215a(), 2, null);
                                }
                                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false))) {
                                    l8i l8iVarM36787m61 = l8i.C15037b.m36787m(l8i.f33466k, "https://" + str6 + '-' + io0VarM39356c.m32504a() + ".s3-accesspoint." + io0VarM39356c.m32506c() + '.' + wycVarM27819a13.m55421a(), null, 2, null);
                                    rx0 rx0Var61 = new rx0();
                                    rx0Var61.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(io0VarM39356c.m32506c()), ml1.m39301a(true), null, 17, null)));
                                    y3i y3iVar61 = y3i.f54824a;
                                    return new b86(l8iVarM36787m61, null, rx0Var61.m47215a(), 2, null);
                                }
                            }
                            throw new g86("Invalid ARN: The access point name may only contain a-z, A-Z, 0-9 and `-`. Found: `" + str6 + '`');
                        }
                    }
                    throw new g86("Invalid ARN: The ARN may only contain a single resource component after `accesspoint`.");
                }
                String strM37468c14 = lm7.m37468c(exeVar.m25723b(), 0, 4, false);
                if (strM37468c14 != null && sq8.m48644c(strM37468c14, "arn:") && mm7.m39356c(exeVar.m25723b()) == null) {
                    throw new g86("Invalid ARN: `" + exeVar.m25723b() + "` was not a valid ARN");
                }
                if (sq8.m48644c(exeVar.m25728g(), ml1.m39301a(true)) && mm7.m39356c(exeVar.m25723b()) != null) {
                    throw new g86("Path-style addressing cannot be used with ARN buckets");
                }
                String strM37469d4 = lm7.m37469d(exeVar.m25723b());
                if (strM37469d4 != null && (wycVarM27819a3 = fzc.m27819a(exeVar.m25729h())) != null) {
                    if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(false))) {
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m62 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.dualstack.us-east-1." + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var62 = new rx0();
                            rx0Var62.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar62 = y3i.f54824a;
                            return new b86(l8iVarM36787m62, null, rx0Var62.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m63 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var63 = new rx0();
                            rx0Var63.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar63 = y3i.f54824a;
                            return new b86(l8iVarM36787m63, null, rx0Var63.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m64 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var64 = new rx0();
                            rx0Var64.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar64 = y3i.f54824a;
                            return new b86(l8iVarM36787m64, null, rx0Var64.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m65 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.us-east-1." + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var65 = new rx0();
                            rx0Var65.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar65 = y3i.f54824a;
                            return new b86(l8iVarM36787m65, null, rx0Var65.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m66 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var66 = new rx0();
                            rx0Var66.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar66 = y3i.f54824a;
                            return new b86(l8iVarM36787m66, null, rx0Var66.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m67 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var67 = new rx0();
                            rx0Var67.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar67 = y3i.f54824a;
                            return new b86(l8iVarM36787m67, null, rx0Var67.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m68 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3.dualstack.us-east-1." + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var68 = new rx0();
                            rx0Var68.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar68 = y3i.f54824a;
                            return new b86(l8iVarM36787m68, null, rx0Var68.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            l8i l8iVarM36787m69 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var69 = new rx0();
                            rx0Var69.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar69 = y3i.f54824a;
                            return new b86(l8iVarM36787m69, null, rx0Var69.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m70 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var70 = new rx0();
                            rx0Var70.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar70 = y3i.f54824a;
                            return new b86(l8iVarM36787m70, null, rx0Var70.m47215a(), 2, null);
                        }
                        m8i m8iVarM37467b15 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b15 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m71 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b15.m38575d() + "://" + m8iVarM37467b15.m38572a() + m8iVarM37467b15.m38573b() + strM37469d4, null, 2, null);
                            rx0 rx0Var71 = new rx0();
                            rx0Var71.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar71 = y3i.f54824a;
                            return new b86(l8iVarM36787m71, null, rx0Var71.m47215a(), 2, null);
                        }
                        m8i m8iVarM37467b16 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b16 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                                l8i l8iVarM36787m72 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b16.m38575d() + "://" + m8iVarM37467b16.m38572a() + m8iVarM37467b16.m38573b() + strM37469d4, null, 2, null);
                                rx0 rx0Var72 = new rx0();
                                rx0Var72.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar72 = y3i.f54824a;
                                return new b86(l8iVarM36787m72, null, rx0Var72.m47215a(), 2, null);
                            }
                            l8i l8iVarM36787m73 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b16.m38575d() + "://" + m8iVarM37467b16.m38572a() + m8iVarM37467b16.m38573b() + strM37469d4, null, 2, null);
                            rx0 rx0Var73 = new rx0();
                            rx0Var73.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar73 = y3i.f54824a;
                            return new b86(l8iVarM36787m73, null, rx0Var73.m47215a(), 2, null);
                        }
                        m8i m8iVarM37467b17 = lm7.m37467b(exeVar.m25727f());
                        if (m8iVarM37467b17 != null && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m74 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b17.m38575d() + "://" + m8iVarM37467b17.m38572a() + m8iVarM37467b17.m38573b() + strM37469d4, null, 2, null);
                            rx0 rx0Var74 = new rx0();
                            rx0Var74.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar74 = y3i.f54824a;
                            return new b86(l8iVarM36787m74, null, rx0Var74.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                            l8i l8iVarM36787m75 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var75 = new rx0();
                            rx0Var75.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar75 = y3i.f54824a;
                            return new b86(l8iVarM36787m75, null, rx0Var75.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                            if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                                l8i l8iVarM36787m76 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                                rx0 rx0Var76 = new rx0();
                                rx0Var76.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                                y3i y3iVar76 = y3i.f54824a;
                                return new b86(l8iVarM36787m76, null, rx0Var76.m47215a(), 2, null);
                            }
                            l8i l8iVarM36787m77 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var77 = new rx0();
                            rx0Var77.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar77 = y3i.f54824a;
                            return new b86(l8iVarM36787m77, null, rx0Var77.m47215a(), 2, null);
                        }
                        if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                            l8i l8iVarM36787m78 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + exeVar.m25729h() + '.' + wycVarM27819a3.m55421a() + '/' + strM37469d4, null, 2, null);
                            rx0 rx0Var78 = new rx0();
                            rx0Var78.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar78 = y3i.f54824a;
                            return new b86(l8iVarM36787m78, null, rx0Var78.m47215a(), 2, null);
                        }
                    }
                    throw new g86("Path-style addressing cannot be used with S3 Accelerate");
                }
            }
            if (exeVar.m25734m() != null && sq8.m48644c(exeVar.m25734m(), ml1.m39301a(true)) && (wycVarM27819a2 = fzc.m27819a(exeVar.m25729h())) != null) {
                if (!lm7.m37466a(exeVar.m25729h(), true)) {
                    throw new g86("Invalid region: region was not a valid DNS name.");
                }
                if (sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true))) {
                    throw new g86("S3 Object Lambda does not support Dual-stack");
                }
                if (sq8.m48644c(exeVar.m25722a(), ml1.m39301a(true))) {
                    throw new g86("S3 Object Lambda does not support S3 Accelerate");
                }
                m8i m8iVarM37467b18 = lm7.m37467b(exeVar.m25727f());
                if (m8iVarM37467b18 != null && exeVar.m25727f() != null) {
                    l8i l8iVarM36787m79 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b18.m38575d() + "://" + m8iVarM37467b18.m38572a() + m8iVarM37467b18.m38574c(), null, 2, null);
                    rx0 rx0Var79 = new rx0();
                    rx0Var79.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3-object-lambda", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar79 = y3i.f54824a;
                    return new b86(l8iVarM36787m79, null, rx0Var79.m47215a(), 2, null);
                }
                if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true))) {
                    l8i l8iVarM36787m80 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-object-lambda-fips." + exeVar.m25729h() + '.' + wycVarM27819a2.m55421a(), null, 2, null);
                    rx0 rx0Var80 = new rx0();
                    rx0Var80.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3-object-lambda", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                    y3i y3iVar80 = y3i.f54824a;
                    return new b86(l8iVarM36787m80, null, rx0Var80.m47215a(), 2, null);
                }
                l8i l8iVarM36787m81 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-object-lambda." + exeVar.m25729h() + '.' + wycVarM27819a2.m55421a(), null, 2, null);
                rx0 rx0Var81 = new rx0();
                rx0Var81.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, "s3-object-lambda", String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                y3i y3iVar81 = y3i.f54824a;
                return new b86(l8iVarM36787m81, null, rx0Var81.m47215a(), 2, null);
            }
            if (exeVar.m25723b() == null && (wycVarM27819a = fzc.m27819a(exeVar.m25729h())) != null) {
                if (lm7.m37466a(exeVar.m25729h(), true)) {
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                        l8i l8iVarM36787m82 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.dualstack.us-east-1." + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var82 = new rx0();
                        rx0Var82.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar82 = y3i.f54824a;
                        return new b86(l8iVarM36787m82, null, rx0Var82.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                        l8i l8iVarM36787m83 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var83 = new rx0();
                        rx0Var83.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar83 = y3i.f54824a;
                        return new b86(l8iVarM36787m83, null, rx0Var83.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                        l8i l8iVarM36787m84 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var84 = new rx0();
                        rx0Var84.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar84 = y3i.f54824a;
                        return new b86(l8iVarM36787m84, null, rx0Var84.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                        l8i l8iVarM36787m85 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips.us-east-1." + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var85 = new rx0();
                        rx0Var85.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar85 = y3i.f54824a;
                        return new b86(l8iVarM36787m85, null, rx0Var85.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                        l8i l8iVarM36787m86 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var86 = new rx0();
                        rx0Var86.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar86 = y3i.f54824a;
                        return new b86(l8iVarM36787m86, null, rx0Var86.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(true)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                        l8i l8iVarM36787m87 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3-fips." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var87 = new rx0();
                        rx0Var87.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar87 = y3i.f54824a;
                        return new b86(l8iVarM36787m87, null, rx0Var87.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                        l8i l8iVarM36787m88 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3.dualstack.us-east-1." + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var88 = new rx0();
                        rx0Var88.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar88 = y3i.f54824a;
                        return new b86(l8iVarM36787m88, null, rx0Var88.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                        l8i l8iVarM36787m89 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var89 = new rx0();
                        rx0Var89.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar89 = y3i.f54824a;
                        return new b86(l8iVarM36787m89, null, rx0Var89.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(true)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                        l8i l8iVarM36787m90 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3.dualstack." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var90 = new rx0();
                        rx0Var90.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar90 = y3i.f54824a;
                        return new b86(l8iVarM36787m90, null, rx0Var90.m47215a(), 2, null);
                    }
                    m8i m8iVarM37467b19 = lm7.m37467b(exeVar.m25727f());
                    if (m8iVarM37467b19 != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() != null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                        l8i l8iVarM36787m91 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b19.m38575d() + "://" + m8iVarM37467b19.m38572a() + m8iVarM37467b19.m38574c(), null, 2, null);
                        rx0 rx0Var91 = new rx0();
                        rx0Var91.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar91 = y3i.f54824a;
                        return new b86(l8iVarM36787m91, null, rx0Var91.m47215a(), 2, null);
                    }
                    m8i m8iVarM37467b20 = lm7.m37467b(exeVar.m25727f());
                    if (m8iVarM37467b20 != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() != null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                        if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                            l8i l8iVarM36787m92 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b20.m38575d() + "://" + m8iVarM37467b20.m38572a() + m8iVarM37467b20.m38574c(), null, 2, null);
                            rx0 rx0Var92 = new rx0();
                            rx0Var92.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar92 = y3i.f54824a;
                            return new b86(l8iVarM36787m92, null, rx0Var92.m47215a(), 2, null);
                        }
                        l8i l8iVarM36787m93 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b20.m38575d() + "://" + m8iVarM37467b20.m38572a() + m8iVarM37467b20.m38574c(), null, 2, null);
                        rx0 rx0Var93 = new rx0();
                        rx0Var93.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar93 = y3i.f54824a;
                        return new b86(l8iVarM36787m93, null, rx0Var93.m47215a(), 2, null);
                    }
                    m8i m8iVarM37467b21 = lm7.m37467b(exeVar.m25727f());
                    if (m8iVarM37467b21 != null && sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() != null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                        l8i l8iVarM36787m94 = l8i.C15037b.m36787m(l8i.f33466k, m8iVarM37467b21.m38575d() + "://" + m8iVarM37467b21.m38572a() + m8iVarM37467b21.m38574c(), null, 2, null);
                        rx0 rx0Var94 = new rx0();
                        rx0Var94.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar94 = y3i.f54824a;
                        return new b86(l8iVarM36787m94, null, rx0Var94.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && sq8.m48644c(exeVar.m25729h(), "aws-global")) {
                        l8i l8iVarM36787m95 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var95 = new rx0();
                        rx0Var95.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, "us-east-1", ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar95 = y3i.f54824a;
                        return new b86(l8iVarM36787m95, null, rx0Var95.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(true))) {
                        if (sq8.m48644c(exeVar.m25729h(), "us-east-1")) {
                            l8i l8iVarM36787m96 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + wycVarM27819a.m55421a(), null, 2, null);
                            rx0 rx0Var96 = new rx0();
                            rx0Var96.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                            y3i y3iVar96 = y3i.f54824a;
                            return new b86(l8iVarM36787m96, null, rx0Var96.m47215a(), 2, null);
                        }
                        l8i l8iVarM36787m97 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var97 = new rx0();
                        rx0Var97.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar97 = y3i.f54824a;
                        return new b86(l8iVarM36787m97, null, rx0Var97.m47215a(), 2, null);
                    }
                    if (sq8.m48644c(exeVar.m25732k(), ml1.m39301a(false)) && sq8.m48644c(exeVar.m25731j(), ml1.m39301a(false)) && exeVar.m25727f() == null && !sq8.m48644c(exeVar.m25729h(), "aws-global") && sq8.m48644c(exeVar.m25733l(), ml1.m39301a(false))) {
                        l8i l8iVarM36787m98 = l8i.C15037b.m36787m(l8i.f33466k, "https://s3." + exeVar.m25729h() + '.' + wycVarM27819a.m55421a(), null, 2, null);
                        rx0 rx0Var98 = new rx0();
                        rx0Var98.m47217c(bsf.m19700b(), bh3.m18963e(orf.m42606d(false, ServiceAbbreviations.S3, String.valueOf(exeVar.m25729h()), ml1.m39301a(true), null, 17, null)));
                        y3i y3iVar98 = y3i.f54824a;
                        return new b86(l8iVarM36787m98, null, rx0Var98.m47215a(), 2, null);
                    }
                }
                throw new g86("Invalid region: region was not a valid DNS name.");
            }
        }
        throw new g86("A region must be set when sending requests to S3.");
    }
}
