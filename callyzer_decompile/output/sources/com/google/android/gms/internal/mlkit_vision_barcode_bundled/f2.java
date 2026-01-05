package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a */
    public static final z0 f6533a;

    static {
        y1 y1Var = y1.f6701c;
        f6533a = new z0(6);
    }

    /* renamed from: A */
    public static void m3855A(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                s0Var.m3959h(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        s0Var.m3966o(i12);
        while (i11 < list.size()) {
            s0Var.m3960i(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: a */
    public static void m3856a(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!(list instanceof f1)) {
            if (!z6) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    s0Var.m3965n(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            s0Var.m3964m(i10, 2);
            int iM3951a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iM3951a += s0.m3951a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            s0Var.m3966o(iM3951a);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                s0Var.m3966o((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        f1 f1Var = (f1) list;
        if (!z6) {
            while (i11 < f1Var.f6532c) {
                int iM3851b = f1Var.m3851b(i11);
                s0Var.m3965n(i10, (iM3851b >> 31) ^ (iM3851b + iM3851b));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int iM3951a2 = 0;
        for (int i13 = 0; i13 < f1Var.f6532c; i13++) {
            int iM3851b2 = f1Var.m3851b(i13);
            iM3951a2 += s0.m3951a((iM3851b2 >> 31) ^ (iM3851b2 + iM3851b2));
        }
        s0Var.m3966o(iM3951a2);
        while (i11 < f1Var.f6532c) {
            int iM3851b3 = f1Var.m3851b(i11);
            s0Var.m3966o((iM3851b3 >> 31) ^ (iM3851b3 + iM3851b3));
            i11++;
        }
    }

    /* renamed from: b */
    public static void m3857b(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                s0Var.m3967p(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int iM3952b = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM3952b += s0.m3952b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        s0Var.m3966o(iM3952b);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            s0Var.m3968q((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    /* renamed from: c */
    public static void m3858c(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!(list instanceof f1)) {
            if (!z6) {
                while (i11 < list.size()) {
                    s0Var.m3965n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            s0Var.m3964m(i10, 2);
            int iM3951a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3951a += s0.m3951a(((Integer) list.get(i12)).intValue());
            }
            s0Var.m3966o(iM3951a);
            while (i11 < list.size()) {
                s0Var.m3966o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f1 f1Var = (f1) list;
        if (!z6) {
            while (i11 < f1Var.f6532c) {
                s0Var.m3965n(i10, f1Var.m3851b(i11));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int iM3951a2 = 0;
        for (int i13 = 0; i13 < f1Var.f6532c; i13++) {
            iM3951a2 += s0.m3951a(f1Var.m3851b(i13));
        }
        s0Var.m3966o(iM3951a2);
        while (i11 < f1Var.f6532c) {
            s0Var.m3966o(f1Var.m3851b(i11));
            i11++;
        }
    }

    /* renamed from: d */
    public static void m3859d(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                s0Var.m3967p(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int iM3952b = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3952b += s0.m3952b(((Long) list.get(i12)).longValue());
        }
        s0Var.m3966o(iM3952b);
        while (i11 < list.size()) {
            s0Var.m3968q(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: e */
    public static boolean m3860e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: f */
    public static int m3861f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f1)) {
            int iM3952b = 0;
            while (i10 < size) {
                iM3952b += s0.m3952b(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM3952b;
        }
        f1 f1Var = (f1) list;
        int iM3952b2 = 0;
        while (i10 < size) {
            iM3952b2 += s0.m3952b(f1Var.m3851b(i10));
            i10++;
        }
        return iM3952b2;
    }

    /* renamed from: g */
    public static int m3862g(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (s0.m3951a(i10 << 3) + 4) * size;
    }

    /* renamed from: h */
    public static int m3863h(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (s0.m3951a(i10 << 3) + 8) * size;
    }

    /* renamed from: i */
    public static int m3864i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f1)) {
            int iM3952b = 0;
            while (i10 < size) {
                iM3952b += s0.m3952b(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM3952b;
        }
        f1 f1Var = (f1) list;
        int iM3952b2 = 0;
        while (i10 < size) {
            iM3952b2 += s0.m3952b(f1Var.m3851b(i10));
            i10++;
        }
        return iM3952b2;
    }

    /* renamed from: j */
    public static int m3865j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3952b = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM3952b += s0.m3952b(((Long) list.get(i10)).longValue());
        }
        return iM3952b;
    }

    /* renamed from: k */
    public static int m3866k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f1)) {
            int iM3951a = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM3951a += s0.m3951a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iM3951a;
        }
        f1 f1Var = (f1) list;
        int iM3951a2 = 0;
        while (i10 < size) {
            int iM3851b = f1Var.m3851b(i10);
            iM3951a2 += s0.m3951a((iM3851b >> 31) ^ (iM3851b + iM3851b));
            i10++;
        }
        return iM3951a2;
    }

    /* renamed from: l */
    public static int m3867l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3952b = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iM3952b += s0.m3952b((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM3952b;
    }

    /* renamed from: m */
    public static int m3868m(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f1)) {
            int iM3951a = 0;
            while (i10 < size) {
                iM3951a += s0.m3951a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM3951a;
        }
        f1 f1Var = (f1) list;
        int iM3951a2 = 0;
        while (i10 < size) {
            iM3951a2 += s0.m3951a(f1Var.m3851b(i10));
            i10++;
        }
        return iM3951a2;
    }

    /* renamed from: n */
    public static int m3869n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3952b = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM3952b += s0.m3952b(((Long) list.get(i10)).longValue());
        }
        return iM3952b;
    }

    /* renamed from: o */
    public static Object m3870o(Object obj, int i10, Object obj2, int i11) {
        Object obj3 = obj2;
        if (obj2 == null) {
            e1 e1Var = (e1) obj;
            i2 i2Var = e1Var.zzc;
            obj3 = i2Var;
            if (i2Var == i2.f6561f) {
                i2 i2VarM3902b = i2.m3902b();
                e1Var.zzc = i2VarM3902b;
                obj3 = i2VarM3902b;
            }
        }
        ((i2) obj3).m3904c(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    /* renamed from: p */
    public static void m3871p(Object obj, Object obj2) {
        w0 w0Var = ((b1) obj2).zzb;
        if (w0Var.f6691a.isEmpty()) {
            return;
        }
        b1 b1Var = (b1) obj;
        w0 w0Var2 = b1Var.zzb;
        if (w0Var2.f6692b) {
            b1Var.zzb = w0Var2.clone();
        }
        w0 w0Var3 = b1Var.zzb;
        w0Var3.getClass();
        g2 g2Var = w0Var.f6691a;
        int i10 = g2Var.f6538b;
        for (int i11 = 0; i11 < i10; i11++) {
            w0Var3.m4004g(g2Var.m3886f(i11));
        }
        Iterator it = g2Var.m3884b().iterator();
        while (it.hasNext()) {
            w0Var3.m4004g((Map.Entry) it.next());
        }
    }

    /* renamed from: q */
    public static void m3872q(Object obj, Object obj2) {
        e1 e1Var = (e1) obj;
        i2 i2Var = e1Var.zzc;
        i2 i2Var2 = ((e1) obj2).zzc;
        i2 i2Var3 = i2.f6561f;
        if (!i2Var3.equals(i2Var2)) {
            if (i2Var3.equals(i2Var)) {
                int i10 = i2Var.f6562a + i2Var2.f6562a;
                int[] iArrCopyOf = Arrays.copyOf(i2Var.f6563b, i10);
                System.arraycopy(i2Var2.f6563b, 0, iArrCopyOf, i2Var.f6562a, i2Var2.f6562a);
                Object[] objArrCopyOf = Arrays.copyOf(i2Var.f6564c, i10);
                System.arraycopy(i2Var2.f6564c, 0, objArrCopyOf, i2Var.f6562a, i2Var2.f6562a);
                i2Var = new i2(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                i2Var.getClass();
                if (!i2Var2.equals(i2Var3)) {
                    if (!i2Var.f6566e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = i2Var.f6562a + i2Var2.f6562a;
                    i2Var.m3906e(i11);
                    System.arraycopy(i2Var2.f6563b, 0, i2Var.f6563b, i2Var.f6562a, i2Var2.f6562a);
                    System.arraycopy(i2Var2.f6564c, 0, i2Var.f6564c, i2Var.f6562a, i2Var2.f6562a);
                    i2Var.f6562a = i11;
                }
            }
        }
        e1Var.zzc = i2Var;
    }

    /* renamed from: r */
    public static void m3873r(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                s0Var.m3966o(i10 << 3);
                s0Var.m3954c(zBooleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        s0Var.m3966o(i12);
        while (i11 < list.size()) {
            s0Var.m3954c(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    /* renamed from: s */
    public static void m3874s(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                s0Var.m3959h(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        s0Var.m3966o(i12);
        while (i11 < list.size()) {
            s0Var.m3960i(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* renamed from: t */
    public static void m3875t(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!(list instanceof f1)) {
            if (!z6) {
                while (i11 < list.size()) {
                    s0Var.m3961j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            s0Var.m3964m(i10, 2);
            int iM3952b = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3952b += s0.m3952b(((Integer) list.get(i12)).intValue());
            }
            s0Var.m3966o(iM3952b);
            while (i11 < list.size()) {
                s0Var.m3962k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f1 f1Var = (f1) list;
        if (!z6) {
            while (i11 < f1Var.f6532c) {
                s0Var.m3961j(i10, f1Var.m3851b(i11));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int iM3952b2 = 0;
        for (int i13 = 0; i13 < f1Var.f6532c; i13++) {
            iM3952b2 += s0.m3952b(f1Var.m3851b(i13));
        }
        s0Var.m3966o(iM3952b2);
        while (i11 < f1Var.f6532c) {
            s0Var.m3962k(f1Var.m3851b(i11));
            i11++;
        }
    }

    /* renamed from: u */
    public static void m3876u(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!(list instanceof f1)) {
            if (!z6) {
                while (i11 < list.size()) {
                    s0Var.m3957f(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            s0Var.m3964m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            s0Var.m3966o(i12);
            while (i11 < list.size()) {
                s0Var.m3958g(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f1 f1Var = (f1) list;
        if (!z6) {
            while (i11 < f1Var.f6532c) {
                s0Var.m3957f(i10, f1Var.m3851b(i11));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < f1Var.f6532c; i15++) {
            f1Var.m3851b(i15);
            i14 += 4;
        }
        s0Var.m3966o(i14);
        while (i11 < f1Var.f6532c) {
            s0Var.m3958g(f1Var.m3851b(i11));
            i11++;
        }
    }

    /* renamed from: v */
    public static void m3877v(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                s0Var.m3959h(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        s0Var.m3966o(i12);
        while (i11 < list.size()) {
            s0Var.m3960i(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: w */
    public static void m3878w(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!(list instanceof y0)) {
            if (!z6) {
                while (i11 < list.size()) {
                    s0Var.m3957f(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            s0Var.m3964m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            s0Var.m3966o(i12);
            while (i11 < list.size()) {
                s0Var.m3958g(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        y0 y0Var = (y0) list;
        if (!z6) {
            while (i11 < y0Var.f6700c) {
                y0Var.m4006c(i11);
                s0Var.m3957f(i10, Float.floatToRawIntBits(y0Var.f6699b[i11]));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < y0Var.f6700c; i15++) {
            y0Var.m4006c(i15);
            float f6 = y0Var.f6699b[i15];
            i14 += 4;
        }
        s0Var.m3966o(i14);
        while (i11 < y0Var.f6700c) {
            y0Var.m4006c(i11);
            s0Var.m3958g(Float.floatToRawIntBits(y0Var.f6699b[i11]));
            i11++;
        }
    }

    /* renamed from: x */
    public static void m3879x(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!(list instanceof f1)) {
            if (!z6) {
                while (i11 < list.size()) {
                    s0Var.m3961j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            s0Var.m3964m(i10, 2);
            int iM3952b = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM3952b += s0.m3952b(((Integer) list.get(i12)).intValue());
            }
            s0Var.m3966o(iM3952b);
            while (i11 < list.size()) {
                s0Var.m3962k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f1 f1Var = (f1) list;
        if (!z6) {
            while (i11 < f1Var.f6532c) {
                s0Var.m3961j(i10, f1Var.m3851b(i11));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int iM3952b2 = 0;
        for (int i13 = 0; i13 < f1Var.f6532c; i13++) {
            iM3952b2 += s0.m3952b(f1Var.m3851b(i13));
        }
        s0Var.m3966o(iM3952b2);
        while (i11 < f1Var.f6532c) {
            s0Var.m3962k(f1Var.m3851b(i11));
            i11++;
        }
    }

    /* renamed from: y */
    public static void m3880y(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                s0Var.m3967p(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int iM3952b = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3952b += s0.m3952b(((Long) list.get(i12)).longValue());
        }
        s0Var.m3966o(iM3952b);
        while (i11 < list.size()) {
            s0Var.m3968q(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: z */
    public static void m3881z(int i10, List list, p1 p1Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0 s0Var = (s0) p1Var.f6630a;
        int i11 = 0;
        if (!(list instanceof f1)) {
            if (!z6) {
                while (i11 < list.size()) {
                    s0Var.m3957f(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            s0Var.m3964m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            s0Var.m3966o(i12);
            while (i11 < list.size()) {
                s0Var.m3958g(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f1 f1Var = (f1) list;
        if (!z6) {
            while (i11 < f1Var.f6532c) {
                s0Var.m3957f(i10, f1Var.m3851b(i11));
                i11++;
            }
            return;
        }
        s0Var.m3964m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < f1Var.f6532c; i15++) {
            f1Var.m3851b(i15);
            i14 += 4;
        }
        s0Var.m3966o(i14);
        while (i11 < f1Var.f6532c) {
            s0Var.m3958g(f1Var.m3851b(i11));
            i11++;
        }
    }
}
