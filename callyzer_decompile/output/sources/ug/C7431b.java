package ug;

import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.u7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.b */
/* loaded from: classes.dex */
public final class C7431b {

    /* renamed from: a */
    public final String f35265a;

    /* renamed from: b */
    public final int f35266b;

    /* renamed from: c */
    public Boolean f35267c;

    /* renamed from: d */
    public Boolean f35268d;

    /* renamed from: e */
    public Long f35269e;

    /* renamed from: f */
    public Long f35270f;

    /* renamed from: g */
    public final /* synthetic */ int f35271g;

    /* renamed from: h */
    public final /* synthetic */ C7432c f35272h;

    /* renamed from: i */
    public final i5 f35273i;

    public C7431b(C7432c c7432c, String str, int i10, i5 i5Var, int i11) {
        this.f35271g = i11;
        this.f35272h = c7432c;
        this.f35265a = str;
        this.f35266b = i10;
        this.f35273i = i5Var;
    }

    /* renamed from: c */
    public static Boolean m13832c(Boolean bool, boolean z6) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    public static Boolean m13833d(String str, com.google.android.gms.internal.measurement.x1 x1Var, v0 v0Var) {
        List listM3763u;
        AbstractC6840z.m13036g(x1Var);
        if (str != null && x1Var.m3758p() && x1Var.m3765x() != 1 && (x1Var.m3765x() != 7 ? x1Var.m3759q() : x1Var.m3764v() != 0)) {
            int iM3765x = x1Var.m3765x();
            boolean zM3762t = x1Var.m3762t();
            String strM3760r = (zM3762t || iM3765x == 2 || iM3765x == 7) ? x1Var.m3760r() : x1Var.m3760r().toUpperCase(Locale.ENGLISH);
            if (x1Var.m3764v() == 0) {
                listM3763u = null;
            } else {
                listM3763u = x1Var.m3763u();
                if (!zM3762t) {
                    ArrayList arrayList = new ArrayList(listM3763u.size());
                    Iterator it = listM3763u.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listM3763u = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iM3765x == 2 ? strM3760r : null;
            if (iM3765x != 7 ? strM3760r != null : listM3763u != null && !listM3763u.isEmpty()) {
                if (!zM3762t && iM3765x != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iM3765x - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zM3762t ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (v0Var != null) {
                                    v0Var.f35865j.m14141b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strM3760r));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strM3760r));
                    case 4:
                        return Boolean.valueOf(str.contains(strM3760r));
                    case 5:
                        return Boolean.valueOf(str.equals(strM3760r));
                    case 6:
                        if (listM3763u != null) {
                            return Boolean.valueOf(listM3763u.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean m13834e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.u1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7431b.m13834e(java.math.BigDecimal, com.google.android.gms.internal.measurement.u1, double):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:3: B:89:0x0246->B:238:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m13835a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.c3 r24, long r25, ug.C7447r r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7431b.m13835a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.c3, long, ug.r, boolean):boolean");
    }

    /* renamed from: b */
    public boolean m13836b(Long l9, Long l10, com.google.android.gms.internal.measurement.u3 u3Var, boolean z6) {
        boolean z10;
        Boolean boolM13832c;
        Boolean boolM13834e;
        Boolean boolM13834e2;
        Boolean boolM13834e3;
        u7.m3722a();
        n1 n1Var = (n1) this.f35272h.f482a;
        C7436g c7436g = n1Var.f35667d;
        q0 q0Var = n1Var.f35673k;
        v0 v0Var = n1Var.f35669f;
        boolean zM13889W = c7436g.m13889W(this.f35265a, f0.D0);
        com.google.android.gms.internal.measurement.w1 w1Var = (com.google.android.gms.internal.measurement.w1) this.f35273i;
        boolean zM3736t = w1Var.m3736t();
        boolean zM3737u = w1Var.m3737u();
        boolean zM3739w = w1Var.m3739w();
        boolean z11 = zM3736t || zM3737u || zM3739w;
        if (z6 && !z11) {
            n1.m14085m(v0Var);
            v0Var.f35870p.m14142c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f35266b), w1Var.m3732p() ? Integer.valueOf(w1Var.m3733q()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.r1 r1VarM3735s = w1Var.m3735s();
        boolean zM3605u = r1VarM3735s.m3605u();
        if (!u3Var.m3711u()) {
            z10 = zM3739w;
            if (!u3Var.m3715y()) {
                if (!u3Var.m3709s()) {
                    n1.m14085m(v0Var);
                    v0Var.f35865j.m14141b(q0Var.m14115c(u3Var.m3708r()), "User property has no value, property");
                } else if (r1VarM3735s.m3600p()) {
                    String strM3710t = u3Var.m3710t();
                    com.google.android.gms.internal.measurement.x1 x1VarM3601q = r1VarM3735s.m3601q();
                    n1.m14085m(v0Var);
                    boolM13832c = m13832c(m13833d(strM3710t, x1VarM3601q, v0Var), zM3605u);
                } else if (!r1VarM3735s.m3602r()) {
                    n1.m14085m(v0Var);
                    v0Var.f35865j.m14141b(q0Var.m14115c(u3Var.m3708r()), "No string or number filter defined. property");
                } else if (y0.s0(u3Var.m3710t())) {
                    String strM3710t2 = u3Var.m3710t();
                    com.google.android.gms.internal.measurement.u1 u1VarM3603s = r1VarM3735s.m3603s();
                    if (y0.s0(strM3710t2)) {
                        try {
                            boolM13834e = m13834e(new BigDecimal(strM3710t2), u1VarM3603s, 0.0d);
                        } catch (NumberFormatException unused) {
                        }
                        boolM13832c = m13832c(boolM13834e, zM3605u);
                    } else {
                        boolM13834e = null;
                        boolM13832c = m13832c(boolM13834e, zM3605u);
                    }
                } else {
                    n1.m14085m(v0Var);
                    v0Var.f35865j.m14142c("Invalid user property value for Numeric number filter. property, value", q0Var.m14115c(u3Var.m3708r()), u3Var.m3710t());
                }
                boolM13832c = null;
            } else if (r1VarM3735s.m3602r()) {
                double dM3716z = u3Var.m3716z();
                try {
                    boolM13834e2 = m13834e(new BigDecimal(dM3716z), r1VarM3735s.m3603s(), Math.ulp(dM3716z));
                } catch (NumberFormatException unused2) {
                    boolM13834e2 = null;
                }
                boolM13832c = m13832c(boolM13834e2, zM3605u);
            } else {
                n1.m14085m(v0Var);
                v0Var.f35865j.m14141b(q0Var.m14115c(u3Var.m3708r()), "No number filter for double property. property");
                boolM13832c = null;
            }
        } else if (r1VarM3735s.m3602r()) {
            z10 = zM3739w;
            try {
                boolM13834e3 = m13834e(new BigDecimal(u3Var.m3712v()), r1VarM3735s.m3603s(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolM13834e3 = null;
            }
            boolM13832c = m13832c(boolM13834e3, zM3605u);
        } else {
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(q0Var.m14115c(u3Var.m3708r()), "No number filter for long property. property");
            z10 = zM3739w;
            boolM13832c = null;
        }
        n1.m14085m(v0Var);
        v0Var.f35870p.m14141b(boolM13832c == null ? "null" : boolM13832c, "Property filter result");
        if (boolM13832c == null) {
            return false;
        }
        this.f35267c = Boolean.TRUE;
        if (!z10 || boolM13832c.booleanValue()) {
            if (!z6 || w1Var.m3736t()) {
                this.f35268d = boolM13832c;
            }
            if (boolM13832c.booleanValue() && z11 && u3Var.m3706p()) {
                long jM3707q = u3Var.m3707q();
                if (l9 != null) {
                    jM3707q = l9.longValue();
                }
                if (zM13889W && w1Var.m3736t() && !w1Var.m3737u() && l10 != null) {
                    jM3707q = l10.longValue();
                }
                if (w1Var.m3737u()) {
                    this.f35270f = Long.valueOf(jM3707q);
                } else {
                    this.f35269e = Long.valueOf(jM3707q);
                }
            }
        }
        return true;
    }
}
