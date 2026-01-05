package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j6 {

    /* renamed from: a */
    public static final g5 f6258a;

    static {
        f6 f6Var = f6.f6193c;
        f6258a = new g5(6);
    }

    /* renamed from: a */
    public static boolean m3406a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: b */
    public static void m3407b(Object obj, Object obj2) {
        i5 i5Var = (i5) obj;
        m6 m6Var = i5Var.zzc;
        m6 m6Var2 = ((i5) obj2).zzc;
        m6 m6Var3 = m6.f6295f;
        if (!m6Var3.equals(m6Var2)) {
            if (m6Var3.equals(m6Var)) {
                int i10 = m6Var.f6296a + m6Var2.f6296a;
                int[] iArrCopyOf = Arrays.copyOf(m6Var.f6297b, i10);
                System.arraycopy(m6Var2.f6297b, 0, iArrCopyOf, m6Var.f6296a, m6Var2.f6296a);
                Object[] objArrCopyOf = Arrays.copyOf(m6Var.f6298c, i10);
                System.arraycopy(m6Var2.f6298c, 0, objArrCopyOf, m6Var.f6296a, m6Var2.f6296a);
                m6Var = new m6(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                m6Var.getClass();
                if (!m6Var2.equals(m6Var3)) {
                    if (!m6Var.f6300e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = m6Var.f6296a + m6Var2.f6296a;
                    m6Var.m3498e(i11);
                    System.arraycopy(m6Var2.f6297b, 0, m6Var.f6297b, m6Var.f6296a, m6Var2.f6296a);
                    System.arraycopy(m6Var2.f6298c, 0, m6Var.f6298c, m6Var.f6296a, m6Var2.f6296a);
                    m6Var.f6296a = i11;
                }
            }
        }
        i5Var.zzc = m6Var;
    }

    /* renamed from: c */
    public static void m3408c(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                a5Var.m3119h(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        a5Var.m3123l(i12);
        while (i11 < list.size()) {
            a5Var.m3126o(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* renamed from: d */
    public static void m3409d(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                a5Var.m3117f(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        a5Var.m3123l(i12);
        while (i11 < list.size()) {
            a5Var.m3124m(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* renamed from: e */
    public static void m3410e(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof u5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3118g(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int iM3111a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3111a += a5.m3111a(((Long) list.get(i12)).longValue());
            }
            a5Var.m3123l(iM3111a);
            while (i11 < list.size()) {
                a5Var.m3125n(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z6) {
            while (i11 < u5Var.f6411c) {
                a5Var.m3118g(i10, u5Var.m3718b(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int iM3111a2 = 0;
        for (int i13 = 0; i13 < u5Var.f6411c; i13++) {
            iM3111a2 += a5.m3111a(u5Var.m3718b(i13));
        }
        a5Var.m3123l(iM3111a2);
        while (i11 < u5Var.f6411c) {
            a5Var.m3125n(u5Var.m3718b(i11));
            i11++;
        }
    }

    /* renamed from: f */
    public static void m3411f(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof u5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3118g(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int iM3111a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3111a += a5.m3111a(((Long) list.get(i12)).longValue());
            }
            a5Var.m3123l(iM3111a);
            while (i11 < list.size()) {
                a5Var.m3125n(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z6) {
            while (i11 < u5Var.f6411c) {
                a5Var.m3118g(i10, u5Var.m3718b(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int iM3111a2 = 0;
        for (int i13 = 0; i13 < u5Var.f6411c; i13++) {
            iM3111a2 += a5.m3111a(u5Var.m3718b(i13));
        }
        a5Var.m3123l(iM3111a2);
        while (i11 < u5Var.f6411c) {
            a5Var.m3125n(u5Var.m3718b(i11));
            i11++;
        }
    }

    /* renamed from: g */
    public static void m3412g(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof u5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    a5Var.m3118g(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int iM3111a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iM3111a += a5.m3111a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            a5Var.m3123l(iM3111a);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                a5Var.m3125n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z6) {
            while (i11 < u5Var.f6411c) {
                long jM3718b = u5Var.m3718b(i11);
                a5Var.m3118g(i10, (jM3718b >> 63) ^ (jM3718b + jM3718b));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int iM3111a2 = 0;
        for (int i13 = 0; i13 < u5Var.f6411c; i13++) {
            long jM3718b2 = u5Var.m3718b(i13);
            iM3111a2 += a5.m3111a((jM3718b2 >> 63) ^ (jM3718b2 + jM3718b2));
        }
        a5Var.m3123l(iM3111a2);
        while (i11 < u5Var.f6411c) {
            long jM3718b3 = u5Var.m3718b(i11);
            a5Var.m3125n((jM3718b3 >> 63) ^ (jM3718b3 + jM3718b3));
            i11++;
        }
    }

    /* renamed from: h */
    public static void m3413h(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof u5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3119h(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            a5Var.m3123l(i12);
            while (i11 < list.size()) {
                a5Var.m3126o(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z6) {
            while (i11 < u5Var.f6411c) {
                a5Var.m3119h(i10, u5Var.m3718b(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u5Var.f6411c; i15++) {
            u5Var.m3718b(i15);
            i14 += 8;
        }
        a5Var.m3123l(i14);
        while (i11 < u5Var.f6411c) {
            a5Var.m3126o(u5Var.m3718b(i11));
            i11++;
        }
    }

    /* renamed from: i */
    public static void m3414i(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof u5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3119h(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            a5Var.m3123l(i12);
            while (i11 < list.size()) {
                a5Var.m3126o(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z6) {
            while (i11 < u5Var.f6411c) {
                a5Var.m3119h(i10, u5Var.m3718b(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u5Var.f6411c; i15++) {
            u5Var.m3718b(i15);
            i14 += 8;
        }
        a5Var.m3123l(i14);
        while (i11 < u5Var.f6411c) {
            a5Var.m3126o(u5Var.m3718b(i11));
            i11++;
        }
    }

    /* renamed from: j */
    public static void m3415j(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof j5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3115d(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int iM3111a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3111a += a5.m3111a(((Integer) list.get(i12)).intValue());
            }
            a5Var.m3123l(iM3111a);
            while (i11 < list.size()) {
                a5Var.m3122k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j5 j5Var = (j5) list;
        if (!z6) {
            while (i11 < j5Var.f6257c) {
                a5Var.m3115d(i10, j5Var.m3403c(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int iM3111a2 = 0;
        for (int i13 = 0; i13 < j5Var.f6257c; i13++) {
            iM3111a2 += a5.m3111a(j5Var.m3403c(i13));
        }
        a5Var.m3123l(iM3111a2);
        while (i11 < j5Var.f6257c) {
            a5Var.m3122k(j5Var.m3403c(i11));
            i11++;
        }
    }

    /* renamed from: k */
    public static void m3416k(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof j5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3116e(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int iM3113r = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3113r += a5.m3113r(((Integer) list.get(i12)).intValue());
            }
            a5Var.m3123l(iM3113r);
            while (i11 < list.size()) {
                a5Var.m3123l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j5 j5Var = (j5) list;
        if (!z6) {
            while (i11 < j5Var.f6257c) {
                a5Var.m3116e(i10, j5Var.m3403c(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int iM3113r2 = 0;
        for (int i13 = 0; i13 < j5Var.f6257c; i13++) {
            iM3113r2 += a5.m3113r(j5Var.m3403c(i13));
        }
        a5Var.m3123l(iM3113r2);
        while (i11 < j5Var.f6257c) {
            a5Var.m3123l(j5Var.m3403c(i11));
            i11++;
        }
    }

    /* renamed from: l */
    public static void m3417l(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof j5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    a5Var.m3116e(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int iM3113r = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iM3113r += a5.m3113r((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            a5Var.m3123l(iM3113r);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                a5Var.m3123l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        j5 j5Var = (j5) list;
        if (!z6) {
            while (i11 < j5Var.f6257c) {
                int iM3403c = j5Var.m3403c(i11);
                a5Var.m3116e(i10, (iM3403c >> 31) ^ (iM3403c + iM3403c));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int iM3113r2 = 0;
        for (int i13 = 0; i13 < j5Var.f6257c; i13++) {
            int iM3403c2 = j5Var.m3403c(i13);
            iM3113r2 += a5.m3113r((iM3403c2 >> 31) ^ (iM3403c2 + iM3403c2));
        }
        a5Var.m3123l(iM3113r2);
        while (i11 < j5Var.f6257c) {
            int iM3403c3 = j5Var.m3403c(i11);
            a5Var.m3123l((iM3403c3 >> 31) ^ (iM3403c3 + iM3403c3));
            i11++;
        }
    }

    /* renamed from: m */
    public static void m3418m(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof j5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3117f(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            a5Var.m3123l(i12);
            while (i11 < list.size()) {
                a5Var.m3124m(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j5 j5Var = (j5) list;
        if (!z6) {
            while (i11 < j5Var.f6257c) {
                a5Var.m3117f(i10, j5Var.m3403c(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < j5Var.f6257c; i15++) {
            j5Var.m3403c(i15);
            i14 += 4;
        }
        a5Var.m3123l(i14);
        while (i11 < j5Var.f6257c) {
            a5Var.m3124m(j5Var.m3403c(i11));
            i11++;
        }
    }

    /* renamed from: n */
    public static void m3419n(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof j5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3117f(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            a5Var.m3123l(i12);
            while (i11 < list.size()) {
                a5Var.m3124m(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j5 j5Var = (j5) list;
        if (!z6) {
            while (i11 < j5Var.f6257c) {
                a5Var.m3117f(i10, j5Var.m3403c(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < j5Var.f6257c; i15++) {
            j5Var.m3403c(i15);
            i14 += 4;
        }
        a5Var.m3123l(i14);
        while (i11 < j5Var.f6257c) {
            a5Var.m3124m(j5Var.m3403c(i11));
            i11++;
        }
    }

    /* renamed from: o */
    public static void m3420o(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!(list instanceof j5)) {
            if (!z6) {
                while (i11 < list.size()) {
                    a5Var.m3115d(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a5Var.m3114c(i10, 2);
            int iM3111a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3111a += a5.m3111a(((Integer) list.get(i12)).intValue());
            }
            a5Var.m3123l(iM3111a);
            while (i11 < list.size()) {
                a5Var.m3122k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j5 j5Var = (j5) list;
        if (!z6) {
            while (i11 < j5Var.f6257c) {
                a5Var.m3115d(i10, j5Var.m3403c(i11));
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int iM3111a2 = 0;
        for (int i13 = 0; i13 < j5Var.f6257c; i13++) {
            iM3111a2 += a5.m3111a(j5Var.m3403c(i13));
        }
        a5Var.m3123l(iM3111a2);
        while (i11 < j5Var.f6257c) {
            a5Var.m3122k(j5Var.m3403c(i11));
            i11++;
        }
    }

    /* renamed from: p */
    public static void m3421p(int i10, List list, v5 v5Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) v5Var.f6423a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                a5Var.m3123l(i10 << 3);
                a5Var.m3121j(zBooleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        a5Var.m3114c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        a5Var.m3123l(i12);
        while (i11 < list.size()) {
            a5Var.m3121j(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    /* renamed from: q */
    public static int m3422q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iM3111a = 0;
            while (i10 < size) {
                iM3111a += a5.m3111a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iM3111a;
        }
        u5 u5Var = (u5) list;
        int iM3111a2 = 0;
        while (i10 < size) {
            iM3111a2 += a5.m3111a(u5Var.m3718b(i10));
            i10++;
        }
        return iM3111a2;
    }

    /* renamed from: r */
    public static int m3423r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iM3111a = 0;
            while (i10 < size) {
                iM3111a += a5.m3111a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iM3111a;
        }
        u5 u5Var = (u5) list;
        int iM3111a2 = 0;
        while (i10 < size) {
            iM3111a2 += a5.m3111a(u5Var.m3718b(i10));
            i10++;
        }
        return iM3111a2;
    }

    /* renamed from: s */
    public static int m3424s(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iM3111a = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iM3111a += a5.m3111a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iM3111a;
        }
        u5 u5Var = (u5) list;
        int iM3111a2 = 0;
        while (i10 < size) {
            long jM3718b = u5Var.m3718b(i10);
            iM3111a2 += a5.m3111a((jM3718b >> 63) ^ (jM3718b + jM3718b));
            i10++;
        }
        return iM3111a2;
    }

    /* renamed from: t */
    public static int m3425t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j5)) {
            int iM3111a = 0;
            while (i10 < size) {
                iM3111a += a5.m3111a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM3111a;
        }
        j5 j5Var = (j5) list;
        int iM3111a2 = 0;
        while (i10 < size) {
            iM3111a2 += a5.m3111a(j5Var.m3403c(i10));
            i10++;
        }
        return iM3111a2;
    }

    /* renamed from: u */
    public static int m3426u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j5)) {
            int iM3111a = 0;
            while (i10 < size) {
                iM3111a += a5.m3111a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM3111a;
        }
        j5 j5Var = (j5) list;
        int iM3111a2 = 0;
        while (i10 < size) {
            iM3111a2 += a5.m3111a(j5Var.m3403c(i10));
            i10++;
        }
        return iM3111a2;
    }

    /* renamed from: v */
    public static int m3427v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j5)) {
            int iM3113r = 0;
            while (i10 < size) {
                iM3113r += a5.m3113r(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM3113r;
        }
        j5 j5Var = (j5) list;
        int iM3113r2 = 0;
        while (i10 < size) {
            iM3113r2 += a5.m3113r(j5Var.m3403c(i10));
            i10++;
        }
        return iM3113r2;
    }

    /* renamed from: w */
    public static int m3428w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j5)) {
            int iM3113r = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM3113r += a5.m3113r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iM3113r;
        }
        j5 j5Var = (j5) list;
        int iM3113r2 = 0;
        while (i10 < size) {
            int iM3403c = j5Var.m3403c(i10);
            iM3113r2 += a5.m3113r((iM3403c >> 31) ^ (iM3403c + iM3403c));
            i10++;
        }
        return iM3113r2;
    }

    /* renamed from: x */
    public static int m3429x(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a5.m3113r(i10 << 3) + 4) * size;
    }

    /* renamed from: y */
    public static int m3430y(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a5.m3113r(i10 << 3) + 8) * size;
    }
}
