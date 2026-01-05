package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a */
    public static final Class f7039a;

    /* renamed from: b */
    public static final h1 f7040b;

    /* renamed from: c */
    public static final h1 f7041c;

    /* renamed from: d */
    public static final j1 f7042d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f7039a = cls;
        f7040b = m4271w(false);
        f7041c = m4271w(true);
        f7042d = new j1();
    }

    /* renamed from: A */
    public static void m4231A(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        if (!z6) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                c1386m.m4328Q(i10, 0);
                c1386m.m4321J(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = C1386m.f7071e;
            i12++;
        }
        c1386m.m4329R(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            c1386m.m4321J(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: B */
    public static void m4232B(int i10, List list, C1387n c1387n) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1387n.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C1386m c1386m = (C1386m) c1387n.f7081a;
            AbstractC1382i abstractC1382i = (AbstractC1382i) list.get(i11);
            c1386m.m4328Q(i10, 2);
            c1386m.m4329R(abstractC1382i.size());
            C1381h c1381h = (C1381h) abstractC1382i;
            c1386m.m4322K(c1381h.f7043d, c1381h.mo4227j(), c1381h.size());
        }
    }

    /* renamed from: C */
    public static void m4233C(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                c1386m.getClass();
                c1386m.m4325N(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = C1386m.f7071e;
            i12 += 8;
        }
        c1386m.m4329R(i12);
        while (i11 < list.size()) {
            c1386m.m4326O(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* renamed from: D */
    public static void m4234D(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        if (!z6) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c1386m.m4328Q(i10, 0);
                c1386m.m4327P(iIntValue);
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int iM4315E = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM4315E += C1386m.m4315E(((Integer) list.get(i12)).intValue());
        }
        c1386m.m4329R(iM4315E);
        for (int i13 = 0; i13 < list.size(); i13++) {
            c1386m.m4327P(((Integer) list.get(i13)).intValue());
        }
    }

    /* renamed from: E */
    public static void m4235E(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c1386m.m4323L(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C1386m.f7071e;
            i12 += 4;
        }
        c1386m.m4329R(i12);
        while (i11 < list.size()) {
            c1386m.m4324M(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* renamed from: F */
    public static void m4236F(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c1386m.m4325N(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C1386m.f7071e;
            i12 += 8;
        }
        c1386m.m4329R(i12);
        while (i11 < list.size()) {
            c1386m.m4326O(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: G */
    public static void m4237G(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                c1386m.getClass();
                c1386m.m4323L(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = C1386m.f7071e;
            i12 += 4;
        }
        c1386m.m4329R(i12);
        while (i11 < list.size()) {
            c1386m.m4324M(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* renamed from: H */
    public static void m4238H(int i10, List list, C1387n c1387n, f1 f1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1387n.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1387n.m4339h(i10, list.get(i11), f1Var);
        }
    }

    /* renamed from: I */
    public static void m4239I(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        if (!z6) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c1386m.m4328Q(i10, 0);
                c1386m.m4327P(iIntValue);
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int iM4315E = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM4315E += C1386m.m4315E(((Integer) list.get(i12)).intValue());
        }
        c1386m.m4329R(iM4315E);
        for (int i13 = 0; i13 < list.size(); i13++) {
            c1386m.m4327P(((Integer) list.get(i13)).intValue());
        }
    }

    /* renamed from: J */
    public static void m4240J(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c1386m.m4330S(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int iM4319I = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM4319I += C1386m.m4319I(((Long) list.get(i12)).longValue());
        }
        c1386m.m4329R(iM4319I);
        while (i11 < list.size()) {
            c1386m.m4331T(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: K */
    public static void m4241K(int i10, List list, C1387n c1387n, f1 f1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1387n.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1387n.m4342k(i10, list.get(i11), f1Var);
        }
    }

    /* renamed from: L */
    public static void m4242L(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c1386m.m4323L(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C1386m.f7071e;
            i12 += 4;
        }
        c1386m.m4329R(i12);
        while (i11 < list.size()) {
            c1386m.m4324M(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* renamed from: M */
    public static void m4243M(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c1386m.m4325N(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C1386m.f7071e;
            i12 += 8;
        }
        c1386m.m4329R(i12);
        while (i11 < list.size()) {
            c1386m.m4326O(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: N */
    public static void m4244N(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        if (!z6) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c1386m.m4328Q(i10, 0);
                c1386m.m4329R((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int iM4318H = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iM4318H += C1386m.m4318H((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1386m.m4329R(iM4318H);
        for (int i13 = 0; i13 < list.size(); i13++) {
            int iIntValue3 = ((Integer) list.get(i13)).intValue();
            c1386m.m4329R((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* renamed from: O */
    public static void m4245O(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                c1386m.m4330S(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int iM4319I = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM4319I += C1386m.m4319I((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1386m.m4329R(iM4319I);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            c1386m.m4331T((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    /* renamed from: P */
    public static void m4246P(int i10, List list, C1387n c1387n) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        if (!(list instanceof j0)) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str = (String) list.get(i11);
                c1386m.m4328Q(i10, 2);
                int i12 = c1386m.f7075c;
                byte[] bArr = c1386m.f7074b;
                int i13 = c1386m.f7076d;
                try {
                    int iM4318H = C1386m.m4318H(str.length() * 3);
                    int iM4318H2 = C1386m.m4318H(str.length());
                    if (iM4318H2 == iM4318H) {
                        int i14 = i13 + iM4318H2;
                        c1386m.f7076d = i14;
                        int iMo4395s = u1.f7121a.mo4395s(str, bArr, i14, i12 - i14);
                        c1386m.f7076d = i13;
                        c1386m.m4329R((iMo4395s - i13) - iM4318H2);
                        c1386m.f7076d = iMo4395s;
                    } else {
                        c1386m.m4329R(u1.m4453b(str));
                        int i15 = c1386m.f7076d;
                        c1386m.f7076d = u1.f7121a.mo4395s(str, bArr, i15, i12 - i15);
                    }
                } catch (t1 e2) {
                    c1386m.f7076d = i13;
                    C1386m.f7071e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(g0.f7037a);
                    try {
                        c1386m.m4329R(bytes.length);
                        c1386m.m4322K(bytes, 0, bytes.length);
                    } catch (CodedOutputStream$OutOfSpaceException e10) {
                        throw e10;
                    } catch (IndexOutOfBoundsException e11) {
                        throw new CodedOutputStream$OutOfSpaceException(e11);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    throw new CodedOutputStream$OutOfSpaceException(e12);
                }
            }
            return;
        }
        j0 j0Var = (j0) list;
        for (int i16 = 0; i16 < list.size(); i16++) {
            Object objMo4282p = j0Var.mo4282p(i16);
            if (objMo4282p instanceof String) {
                String str2 = (String) objMo4282p;
                c1386m.m4328Q(i10, 2);
                int i17 = c1386m.f7075c;
                byte[] bArr2 = c1386m.f7074b;
                int i18 = c1386m.f7076d;
                try {
                    int iM4318H3 = C1386m.m4318H(str2.length() * 3);
                    int iM4318H4 = C1386m.m4318H(str2.length());
                    if (iM4318H4 == iM4318H3) {
                        int i19 = i18 + iM4318H4;
                        c1386m.f7076d = i19;
                        int iMo4395s2 = u1.f7121a.mo4395s(str2, bArr2, i19, i17 - i19);
                        c1386m.f7076d = i18;
                        c1386m.m4329R((iMo4395s2 - i18) - iM4318H4);
                        c1386m.f7076d = iMo4395s2;
                    } else {
                        c1386m.m4329R(u1.m4453b(str2));
                        int i20 = c1386m.f7076d;
                        c1386m.f7076d = u1.f7121a.mo4395s(str2, bArr2, i20, i17 - i20);
                    }
                } catch (t1 e13) {
                    c1386m.f7076d = i18;
                    C1386m.f7071e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e13);
                    byte[] bytes2 = str2.getBytes(g0.f7037a);
                    try {
                        c1386m.m4329R(bytes2.length);
                        c1386m.m4322K(bytes2, 0, bytes2.length);
                    } catch (CodedOutputStream$OutOfSpaceException e14) {
                        throw e14;
                    } catch (IndexOutOfBoundsException e15) {
                        throw new CodedOutputStream$OutOfSpaceException(e15);
                    }
                } catch (IndexOutOfBoundsException e16) {
                    throw new CodedOutputStream$OutOfSpaceException(e16);
                }
            } else {
                AbstractC1382i abstractC1382i = (AbstractC1382i) objMo4282p;
                c1386m.m4328Q(i10, 2);
                c1386m.m4329R(abstractC1382i.size());
                C1381h c1381h = (C1381h) abstractC1382i;
                c1386m.m4322K(c1381h.f7043d, c1381h.mo4227j(), c1381h.size());
            }
        }
    }

    /* renamed from: Q */
    public static void m4247Q(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        if (!z6) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c1386m.m4328Q(i10, 0);
                c1386m.m4329R(iIntValue);
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int iM4318H = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM4318H += C1386m.m4318H(((Integer) list.get(i12)).intValue());
        }
        c1386m.m4329R(iM4318H);
        for (int i13 = 0; i13 < list.size(); i13++) {
            c1386m.m4329R(((Integer) list.get(i13)).intValue());
        }
    }

    /* renamed from: R */
    public static void m4248R(int i10, List list, C1387n c1387n, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1386m c1386m = (C1386m) c1387n.f7081a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c1386m.m4330S(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c1386m.m4328Q(i10, 2);
        int iM4319I = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM4319I += C1386m.m4319I(((Long) list.get(i12)).longValue());
        }
        c1386m.m4329R(iM4319I);
        while (i11 < list.size()) {
            c1386m.m4331T(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* renamed from: a */
    public static int m4249a(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4317G = C1386m.m4317G(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM4317G += C1386m.m4311A((AbstractC1382i) list.get(i11));
        }
        return iM4317G;
    }

    /* renamed from: b */
    public static int m4250b(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1386m.m4317G(i10) * size) + m4251c(list);
    }

    /* renamed from: c */
    public static int m4251c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            if (size <= 0) {
                return 0;
            }
            b0Var.m4169c(0);
            throw null;
        }
        int iM4315E = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM4315E += C1386m.m4315E(((Integer) list.get(i10)).intValue());
        }
        return iM4315E;
    }

    /* renamed from: d */
    public static int m4252d(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1386m.m4312B(i10) * size;
    }

    /* renamed from: e */
    public static int m4253e(List list) {
        return list.size() * 4;
    }

    /* renamed from: f */
    public static int m4254f(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1386m.m4313C(i10) * size;
    }

    /* renamed from: g */
    public static int m4255g(List list) {
        return list.size() * 8;
    }

    /* renamed from: h */
    public static int m4256h(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1386m.m4317G(i10) * size) + m4257i(list);
    }

    /* renamed from: i */
    public static int m4257i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            if (size <= 0) {
                return 0;
            }
            b0Var.m4169c(0);
            throw null;
        }
        int iM4315E = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM4315E += C1386m.m4315E(((Integer) list.get(i10)).intValue());
        }
        return iM4315E;
    }

    /* renamed from: j */
    public static int m4258j(List list, int i10) {
        if (list.size() == 0) {
            return 0;
        }
        return (C1386m.m4317G(i10) * list.size()) + m4259k(list);
    }

    /* renamed from: k */
    public static int m4259k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            if (size <= 0) {
                return 0;
            }
            n0Var.m4350c(0);
            throw null;
        }
        int iM4319I = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM4319I += C1386m.m4319I(((Long) list.get(i10)).longValue());
        }
        return iM4319I;
    }

    /* renamed from: l */
    public static int m4260l(int i10, List list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4317G = C1386m.m4317G(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1374a abstractC1374a = (AbstractC1374a) list.get(i11);
            abstractC1374a.getClass();
            a0 a0Var = (a0) abstractC1374a;
            int iMo4222i = a0Var.memoizedSerializedSize;
            if (iMo4222i == -1) {
                iMo4222i = f1Var.mo4222i(abstractC1374a);
                a0Var.memoizedSerializedSize = iMo4222i;
            }
            iM4317G += C1386m.m4318H(iMo4222i) + iMo4222i;
        }
        return iM4317G;
    }

    /* renamed from: m */
    public static int m4261m(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1386m.m4317G(i10) * size) + m4262n(list);
    }

    /* renamed from: n */
    public static int m4262n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            if (size <= 0) {
                return 0;
            }
            b0Var.m4169c(0);
            throw null;
        }
        int iM4318H = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iM4318H += C1386m.m4318H((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM4318H;
    }

    /* renamed from: o */
    public static int m4263o(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1386m.m4317G(i10) * size) + m4264p(list);
    }

    /* renamed from: p */
    public static int m4264p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            if (size <= 0) {
                return 0;
            }
            n0Var.m4350c(0);
            throw null;
        }
        int iM4319I = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iM4319I += C1386m.m4319I((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM4319I;
    }

    /* renamed from: q */
    public static int m4265q(List list, int i10) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iM4317G = C1386m.m4317G(i10) * size;
        if (!(list instanceof j0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof AbstractC1382i) {
                    int size2 = ((AbstractC1382i) obj).size();
                    iM4317G = C1386m.m4318H(size2) + size2 + iM4317G;
                } else {
                    iM4317G = C1386m.m4316F((String) obj) + iM4317G;
                }
                i11++;
            }
            return iM4317G;
        }
        j0 j0Var = (j0) list;
        while (i11 < size) {
            Object objMo4282p = j0Var.mo4282p(i11);
            if (objMo4282p instanceof AbstractC1382i) {
                int size3 = ((AbstractC1382i) objMo4282p).size();
                iM4317G = C1386m.m4318H(size3) + size3 + iM4317G;
            } else {
                iM4317G = C1386m.m4316F((String) objMo4282p) + iM4317G;
            }
            i11++;
        }
        return iM4317G;
    }

    /* renamed from: r */
    public static int m4266r(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1386m.m4317G(i10) * size) + m4267s(list);
    }

    /* renamed from: s */
    public static int m4267s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            if (size <= 0) {
                return 0;
            }
            b0Var.m4169c(0);
            throw null;
        }
        int iM4318H = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM4318H += C1386m.m4318H(((Integer) list.get(i10)).intValue());
        }
        return iM4318H;
    }

    /* renamed from: t */
    public static int m4268t(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1386m.m4317G(i10) * size) + m4269u(list);
    }

    /* renamed from: u */
    public static int m4269u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            if (size <= 0) {
                return 0;
            }
            n0Var.m4350c(0);
            throw null;
        }
        int iM4319I = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM4319I += C1386m.m4319I(((Long) list.get(i10)).longValue());
        }
        return iM4319I;
    }

    /* renamed from: v */
    public static Object m4270v(int i10, List list, e0 e0Var, Object obj, h1 h1Var) {
        if (e0Var == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!e0Var.mo4175a(iIntValue)) {
                    obj = m4274z(i10, iIntValue, obj, h1Var);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (e0Var.mo4175a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj = m4274z(i10, iIntValue2, obj, h1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj;
    }

    /* renamed from: w */
    public static h1 m4271w(boolean z6) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (h1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: x */
    public static void m4272x(h1 h1Var, Object obj, Object obj2) {
        ((j1) h1Var).getClass();
        a0 a0Var = (a0) obj;
        i1 i1Var = a0Var.unknownFields;
        i1 i1Var2 = ((a0) obj2).unknownFields;
        if (!i1Var2.equals(i1.f7048f)) {
            int i10 = i1Var.f7049a + i1Var2.f7049a;
            int[] iArrCopyOf = Arrays.copyOf(i1Var.f7050b, i10);
            System.arraycopy(i1Var2.f7050b, 0, iArrCopyOf, i1Var.f7049a, i1Var2.f7049a);
            Object[] objArrCopyOf = Arrays.copyOf(i1Var.f7051c, i10);
            System.arraycopy(i1Var2.f7051c, 0, objArrCopyOf, i1Var.f7049a, i1Var2.f7049a);
            i1Var = new i1(i10, iArrCopyOf, objArrCopyOf, true);
        }
        a0Var.unknownFields = i1Var;
    }

    /* renamed from: y */
    public static boolean m4273y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: z */
    public static Object m4274z(int i10, int i11, Object obj, h1 h1Var) {
        if (obj == null) {
            ((j1) h1Var).getClass();
            obj = i1.m4283b();
        }
        ((j1) h1Var).getClass();
        ((i1) obj).m4285c(i10 << 3, Long.valueOf(i11));
        return obj;
    }
}
