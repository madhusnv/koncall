package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a */
    public static final Class f2295a;

    /* renamed from: b */
    public static final g1 f2296b;

    /* renamed from: c */
    public static final i1 f2297c;

    static {
        Class<?> cls;
        Class<?> cls2;
        x0 x0Var = x0.f2424c;
        g1 g1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2295a = cls;
        try {
            x0 x0Var2 = x0.f2424c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                g1Var = (g1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2296b = g1Var;
        f2297c = new i1();
    }

    /* renamed from: A */
    public static void m822A(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                c0318m.m977H(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int iM969n = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM969n += C0318m.m969n((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0318m.m976G(iM969n);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            c0318m.m978I((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    /* renamed from: B */
    public static void m823B(int i10, List list, i0 i0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C0318m) i0Var.f2353a).m972C(i10, (String) list.get(i11));
        }
    }

    /* renamed from: C */
    public static void m824C(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m975F(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int iM968m = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM968m += C0318m.m968m(((Integer) list.get(i12)).intValue());
        }
        c0318m.m976G(iM968m);
        while (i11 < list.size()) {
            c0318m.m976G(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* renamed from: D */
    public static void m825D(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m977H(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int iM969n = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM969n += C0318m.m969n(((Long) list.get(i12)).longValue());
        }
        c0318m.m976G(iM969n);
        while (i11 < list.size()) {
            c0318m.m978I(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: a */
    public static int m826a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM969n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM969n += C0318m.m969n(((Integer) list.get(i10)).intValue());
        }
        return iM969n;
    }

    /* renamed from: b */
    public static int m827b(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0318m.m967l(i10) + 4) * size;
    }

    /* renamed from: c */
    public static int m828c(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0318m.m967l(i10) + 8) * size;
    }

    /* renamed from: d */
    public static int m829d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM969n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM969n += C0318m.m969n(((Integer) list.get(i10)).intValue());
        }
        return iM969n;
    }

    /* renamed from: e */
    public static int m830e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM969n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM969n += C0318m.m969n(((Long) list.get(i10)).longValue());
        }
        return iM969n;
    }

    /* renamed from: f */
    public static int m831f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM968m = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iM968m += C0318m.m968m((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM968m;
    }

    /* renamed from: g */
    public static int m832g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM969n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iM969n += C0318m.m969n((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM969n;
    }

    /* renamed from: h */
    public static int m833h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM968m = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM968m += C0318m.m968m(((Integer) list.get(i10)).intValue());
        }
        return iM968m;
    }

    /* renamed from: i */
    public static int m834i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM969n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM969n += C0318m.m969n(((Long) list.get(i10)).longValue());
        }
        return iM969n;
    }

    /* renamed from: k */
    public static void m836k(g1 g1Var, Object obj, Object obj2) {
        ((i1) g1Var).getClass();
        AbstractC0335z abstractC0335z = (AbstractC0335z) obj;
        h1 h1Var = abstractC0335z.unknownFields;
        h1 h1Var2 = ((AbstractC0335z) obj2).unknownFields;
        h1 h1Var3 = h1.f2338f;
        if (!h1Var3.equals(h1Var2)) {
            if (h1Var3.equals(h1Var)) {
                int i10 = h1Var.f2339a + h1Var2.f2339a;
                int[] iArrCopyOf = Arrays.copyOf(h1Var.f2340b, i10);
                System.arraycopy(h1Var2.f2340b, 0, iArrCopyOf, h1Var.f2339a, h1Var2.f2339a);
                Object[] objArrCopyOf = Arrays.copyOf(h1Var.f2341c, i10);
                System.arraycopy(h1Var2.f2341c, 0, objArrCopyOf, h1Var.f2339a, h1Var2.f2339a);
                h1Var = new h1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                h1Var.getClass();
                if (!h1Var2.equals(h1Var3)) {
                    if (!h1Var.f2343e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = h1Var.f2339a + h1Var2.f2339a;
                    h1Var.m906a(i11);
                    System.arraycopy(h1Var2.f2340b, 0, h1Var.f2340b, h1Var.f2339a, h1Var2.f2339a);
                    System.arraycopy(h1Var2.f2341c, 0, h1Var.f2341c, h1Var.f2339a, h1Var2.f2339a);
                    h1Var.f2339a = i11;
                }
            }
        }
        abstractC0335z.unknownFields = h1Var;
    }

    /* renamed from: l */
    public static boolean m837l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: m */
    public static void m838m(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m989s(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = C0318m.f2368f;
            i12++;
        }
        c0318m.m976G(i12);
        while (i11 < list.size()) {
            c0318m.m987q(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    /* renamed from: n */
    public static void m839n(int i10, List list, i0 i0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C0318m) i0Var.f2353a).m990t(i10, (C0312g) list.get(i11));
        }
    }

    /* renamed from: o */
    public static void m840o(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                c0318m.getClass();
                c0318m.m994x(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = C0318m.f2368f;
            i12 += 8;
        }
        c0318m.m976G(i12);
        while (i11 < list.size()) {
            c0318m.m995y(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* renamed from: p */
    public static void m841p(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m996z(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int iM969n = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM969n += C0318m.m969n(((Integer) list.get(i12)).intValue());
        }
        c0318m.m976G(iM969n);
        while (i11 < list.size()) {
            c0318m.m970A(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* renamed from: q */
    public static void m842q(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m992v(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C0318m.f2368f;
            i12 += 4;
        }
        c0318m.m976G(i12);
        while (i11 < list.size()) {
            c0318m.m993w(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* renamed from: r */
    public static void m843r(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m994x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C0318m.f2368f;
            i12 += 8;
        }
        c0318m.m976G(i12);
        while (i11 < list.size()) {
            c0318m.m995y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: s */
    public static void m844s(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                c0318m.getClass();
                c0318m.m992v(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = C0318m.f2368f;
            i12 += 4;
        }
        c0318m.m976G(i12);
        while (i11 < list.size()) {
            c0318m.m993w(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* renamed from: t */
    public static void m845t(int i10, List list, i0 i0Var, a1 a1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            i0Var.m923b(i10, list.get(i11), a1Var);
        }
    }

    /* renamed from: u */
    public static void m846u(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m996z(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int iM969n = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM969n += C0318m.m969n(((Integer) list.get(i12)).intValue());
        }
        c0318m.m976G(iM969n);
        while (i11 < list.size()) {
            c0318m.m970A(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* renamed from: v */
    public static void m847v(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m977H(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int iM969n = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM969n += C0318m.m969n(((Long) list.get(i12)).longValue());
        }
        c0318m.m976G(iM969n);
        while (i11 < list.size()) {
            c0318m.m978I(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: w */
    public static void m848w(int i10, List list, i0 i0Var, a1 a1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C0318m) i0Var.f2353a).m971B(i10, (AbstractC0306a) list.get(i11), a1Var);
        }
    }

    /* renamed from: x */
    public static void m849x(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m992v(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C0318m.f2368f;
            i12 += 4;
        }
        c0318m.m976G(i12);
        while (i11 < list.size()) {
            c0318m.m993w(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* renamed from: y */
    public static void m850y(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0318m.m994x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C0318m.f2368f;
            i12 += 8;
        }
        c0318m.m976G(i12);
        while (i11 < list.size()) {
            c0318m.m995y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: z */
    public static void m851z(int i10, List list, i0 i0Var, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0318m c0318m = (C0318m) i0Var.f2353a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c0318m.m975F(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        c0318m.m974E(i10, 2);
        int iM968m = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iM968m += C0318m.m968m((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0318m.m976G(iM968m);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            c0318m.m976G((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    /* renamed from: j */
    public static Object m835j(Object obj, int i10, a0 a0Var, Object obj2, g1 g1Var) {
        return obj2;
    }
}
