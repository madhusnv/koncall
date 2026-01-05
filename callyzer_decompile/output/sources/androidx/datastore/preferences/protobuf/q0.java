package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements a1 {

    /* renamed from: n */
    public static final int[] f2392n = new int[0];

    /* renamed from: o */
    public static final Unsafe f2393o = n1.m1015i();

    /* renamed from: a */
    public final int[] f2394a;

    /* renamed from: b */
    public final Object[] f2395b;

    /* renamed from: c */
    public final int f2396c;

    /* renamed from: d */
    public final int f2397d;

    /* renamed from: e */
    public final AbstractC0306a f2398e;

    /* renamed from: f */
    public final boolean f2399f;

    /* renamed from: g */
    public final int[] f2400g;

    /* renamed from: h */
    public final int f2401h;

    /* renamed from: i */
    public final int f2402i;

    /* renamed from: j */
    public final s0 f2403j;

    /* renamed from: k */
    public final e0 f2404k;

    /* renamed from: l */
    public final g1 f2405l;

    /* renamed from: m */
    public final m0 f2406m;

    public q0(int[] iArr, Object[] objArr, int i10, int i11, AbstractC0306a abstractC0306a, int[] iArr2, int i12, int i13, s0 s0Var, e0 e0Var, g1 g1Var, C0321p c0321p, m0 m0Var) {
        this.f2394a = iArr;
        this.f2395b = objArr;
        this.f2396c = i10;
        this.f2397d = i11;
        this.f2399f = abstractC0306a instanceof AbstractC0335z;
        this.f2400g = iArr2;
        this.f2401h = i12;
        this.f2402i = i13;
        this.f2403j = s0Var;
        this.f2404k = e0Var;
        this.f2405l = g1Var;
        this.f2398e = abstractC0306a;
        this.f2406m = m0Var;
    }

    /* renamed from: F */
    public static Field m1035F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM7383p = i0.m0.m7383p("Field ", str, " for ");
            sbM7383p.append(cls.getName());
            sbM7383p.append(" not found. Known fields are ");
            sbM7383p.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM7383p.toString());
        }
    }

    /* renamed from: K */
    public static int m1036K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* renamed from: O */
    public static void m1037O(int i10, Object obj, i0 i0Var) throws IOException {
        if (!(obj instanceof String)) {
            i0Var.m922a(i10, (C0312g) obj);
        } else {
            ((C0318m) i0Var.f2353a).m972C(i10, (String) obj);
        }
    }

    /* renamed from: p */
    public static boolean m1038p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0335z) {
            return ((AbstractC0335z) obj).m1081g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0384  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.q0 m1039w(androidx.datastore.preferences.protobuf.z0 r33, androidx.datastore.preferences.protobuf.s0 r34, androidx.datastore.preferences.protobuf.e0 r35, androidx.datastore.preferences.protobuf.g1 r36, androidx.datastore.preferences.protobuf.C0321p r37, androidx.datastore.preferences.protobuf.m0 r38) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.m1039w(androidx.datastore.preferences.protobuf.z0, androidx.datastore.preferences.protobuf.s0, androidx.datastore.preferences.protobuf.e0, androidx.datastore.preferences.protobuf.g1, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.m0):androidx.datastore.preferences.protobuf.q0");
    }

    /* renamed from: x */
    public static long m1040x(int i10) {
        return i10 & 1048575;
    }

    /* renamed from: y */
    public static int m1041y(long j6, Object obj) {
        return ((Integer) n1.f2381c.m1002h(j6, obj)).intValue();
    }

    /* renamed from: z */
    public static long m1042z(long j6, Object obj) {
        return ((Long) n1.f2381c.m1002h(j6, obj)).longValue();
    }

    /* renamed from: A */
    public final int m1043A(int i10) {
        if (i10 >= this.f2396c && i10 <= this.f2397d) {
            int[] iArr = this.f2394a;
            int length = (iArr.length / 3) - 1;
            int i11 = 0;
            while (i11 <= length) {
                int i12 = (length + i11) >>> 1;
                int i13 = i12 * 3;
                int i14 = iArr[i13];
                if (i10 == i14) {
                    return i13;
                }
                if (i10 < i14) {
                    length = i12 - 1;
                } else {
                    i11 = i12 + 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final void m1044B(Object obj, long j6, C0317l c0317l, a1 a1Var, C0320o c0320o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo903z;
        this.f2404k.getClass();
        a0 a0VarM862a = e0.m862a(j6, obj);
        AbstractC0315j abstractC0315j = c0317l.f2362a;
        int i10 = c0317l.f2363b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.m804b();
        }
        do {
            AbstractC0335z abstractC0335zMo812c = a1Var.mo812c();
            c0317l.m939b(abstractC0335zMo812c, a1Var, c0320o);
            a1Var.mo810a(abstractC0335zMo812c);
            ((y0) a0VarM862a).add(abstractC0335zMo812c);
            if (abstractC0315j.mo885c() || c0317l.f2365d != 0) {
                return;
            } else {
                iMo903z = abstractC0315j.mo903z();
            }
        } while (iMo903z == i10);
        c0317l.f2365d = iMo903z;
    }

    /* renamed from: C */
    public final void m1045C(Object obj, int i10, C0317l c0317l, a1 a1Var, C0320o c0320o) throws InvalidProtocolBufferException {
        int iMo903z;
        this.f2404k.getClass();
        a0 a0VarM862a = e0.m862a(i10 & 1048575, obj);
        AbstractC0315j abstractC0315j = c0317l.f2362a;
        int i11 = c0317l.f2363b;
        if ((i11 & 7) != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        do {
            AbstractC0335z abstractC0335zMo812c = a1Var.mo812c();
            c0317l.m940c(abstractC0335zMo812c, a1Var, c0320o);
            a1Var.mo810a(abstractC0335zMo812c);
            ((y0) a0VarM862a).add(abstractC0335zMo812c);
            if (abstractC0315j.mo885c() || c0317l.f2365d != 0) {
                return;
            } else {
                iMo903z = abstractC0315j.mo903z();
            }
        } while (iMo903z == i11);
        c0317l.f2365d = iMo903z;
    }

    /* renamed from: D */
    public final void m1046D(int i10, C0317l c0317l, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i10) != 0) {
            c0317l.m960w(2);
            n1.m1021o(obj, i10 & 1048575, c0317l.f2362a.mo902y());
        } else if (!this.f2399f) {
            n1.m1021o(obj, i10 & 1048575, c0317l.m942e());
        } else {
            c0317l.m960w(2);
            n1.m1021o(obj, i10 & 1048575, c0317l.f2362a.mo901x());
        }
    }

    /* renamed from: E */
    public final void m1047E(int i10, C0317l c0317l, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i11 = 536870912 & i10;
        e0 e0Var = this.f2404k;
        if (i11 != 0) {
            e0Var.getClass();
            c0317l.m956s(e0.m862a(i10 & 1048575, obj), true);
        } else {
            e0Var.getClass();
            c0317l.m956s(e0.m862a(i10 & 1048575, obj), false);
        }
    }

    /* renamed from: G */
    public final void m1048G(int i10, Object obj) {
        int i11 = this.f2394a[i10 + 2];
        long j6 = 1048575 & i11;
        if (j6 == 1048575) {
            return;
        }
        n1.m1019m((1 << (i11 >>> 20)) | n1.f2381c.m1000f(j6, obj), j6, obj);
    }

    /* renamed from: H */
    public final void m1049H(int i10, Object obj, int i11) {
        n1.m1019m(i10, this.f2394a[i11 + 2] & 1048575, obj);
    }

    /* renamed from: I */
    public final void m1050I(Object obj, int i10, AbstractC0306a abstractC0306a) {
        f2393o.putObject(obj, m1052L(i10) & 1048575, abstractC0306a);
        m1048G(i10, obj);
    }

    /* renamed from: J */
    public final void m1051J(Object obj, int i10, int i11, AbstractC0306a abstractC0306a) {
        f2393o.putObject(obj, m1052L(i11) & 1048575, abstractC0306a);
        m1049H(i10, obj, i11);
    }

    /* renamed from: L */
    public final int m1052L(int i10) {
        return this.f2394a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: M */
    public final void m1053M(Object obj, i0 i0Var) throws IOException {
        int i10;
        int i11;
        boolean z6;
        q0 q0Var = this;
        int[] iArr = q0Var.f2394a;
        int length = iArr.length;
        Unsafe unsafe = f2393o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iM1052L = q0Var.m1052L(i14);
            int i16 = iArr[i14];
            int iM1036K = m1036K(iM1052L);
            if (iM1036K <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = iM1052L;
                i11 = 1 << (i17 >>> 20);
            } else {
                i10 = iM1052L;
                i11 = 0;
            }
            long j6 = i10 & i12;
            switch (iM1036K) {
                case 0:
                    if (!q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        break;
                    } else {
                        double dMo931d = n1.f2381c.mo931d(j6, obj);
                        C0318m c0318m = (C0318m) i0Var.f2353a;
                        c0318m.getClass();
                        c0318m.m994x(i16, Double.doubleToRawLongBits(dMo931d));
                        break;
                    }
                case 1:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        float fMo932e = n1.f2381c.mo932e(j6, obj);
                        C0318m c0318m2 = (C0318m) i0Var.f2353a;
                        c0318m2.getClass();
                        c0318m2.m992v(i16, Float.floatToRawIntBits(fMo932e));
                    }
                    q0Var = this;
                    break;
                case 2:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m977H(i16, unsafe.getLong(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 3:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m977H(i16, unsafe.getLong(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 4:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m996z(i16, unsafe.getInt(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 5:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m994x(i16, unsafe.getLong(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 6:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m992v(i16, unsafe.getInt(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 7:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m989s(i16, n1.f2381c.mo930c(j6, obj));
                    }
                    q0Var = this;
                    break;
                case 8:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        m1037O(i16, unsafe.getObject(obj, j6), i0Var);
                    }
                    q0Var = this;
                    break;
                case 9:
                    if (!q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        break;
                    } else {
                        ((C0318m) i0Var.f2353a).m971B(i16, (AbstractC0306a) unsafe.getObject(obj, j6), q0Var.m1058m(i14));
                        break;
                    }
                case 10:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        i0Var.m922a(i16, (C0312g) unsafe.getObject(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 11:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m975F(i16, unsafe.getInt(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 12:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m996z(i16, unsafe.getInt(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 13:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m992v(i16, unsafe.getInt(obj, j6));
                    }
                    q0Var = this;
                    break;
                case 14:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        ((C0318m) i0Var.f2353a).m994x(i16, unsafe.getLong(obj, j6));
                    }
                    q0Var = this;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        int i19 = unsafe.getInt(obj, j6);
                        ((C0318m) i0Var.f2353a).m975F(i16, (i19 >> 31) ^ (i19 << 1));
                    }
                    q0Var = this;
                    break;
                case 16:
                    if (q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        long j10 = unsafe.getLong(obj, j6);
                        ((C0318m) i0Var.f2353a).m977H(i16, (j10 >> 63) ^ (j10 << 1));
                    }
                    q0Var = this;
                    break;
                case 17:
                    if (!q0Var.m1060o(obj, i14, i13, i15, i11)) {
                        break;
                    } else {
                        i0Var.m923b(i16, unsafe.getObject(obj, j6), q0Var.m1058m(i14));
                        break;
                    }
                case 18:
                    b1.m840o(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 19:
                    b1.m844s(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 20:
                    b1.m847v(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 21:
                    b1.m825D(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 22:
                    b1.m846u(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 23:
                    b1.m843r(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 24:
                    b1.m842q(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 25:
                    b1.m838m(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 26:
                    b1.m823B(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var);
                    break;
                case 27:
                    b1.m848w(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, q0Var.m1058m(i14));
                    break;
                case 28:
                    b1.m839n(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var);
                    break;
                case 29:
                    z6 = false;
                    b1.m824C(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 30:
                    z6 = false;
                    b1.m841p(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    z6 = false;
                    b1.m849x(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case 32:
                    z6 = false;
                    b1.m850y(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    z6 = false;
                    b1.m851z(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case BERTags.DURATION /* 34 */:
                    z6 = false;
                    b1.m822A(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, false);
                    break;
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    b1.m840o(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    b1.m844s(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 37:
                    b1.m847v(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 38:
                    b1.m825D(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 39:
                    b1.m846u(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    b1.m843r(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 41:
                    b1.m842q(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 42:
                    b1.m838m(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 43:
                    b1.m824C(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 44:
                    b1.m841p(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 45:
                    b1.m849x(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 46:
                    b1.m850y(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 47:
                    b1.m851z(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 48:
                    b1.m822A(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, true);
                    break;
                case 49:
                    b1.m845t(iArr[i14], (List) unsafe.getObject(obj, j6), i0Var, q0Var.m1058m(i14));
                    break;
                case 50:
                    q0Var.m1054N(i0Var, i16, unsafe.getObject(obj, j6), i14);
                    break;
                case 51:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        double dDoubleValue = ((Double) n1.f2381c.m1002h(j6, obj)).doubleValue();
                        C0318m c0318m3 = (C0318m) i0Var.f2353a;
                        c0318m3.getClass();
                        c0318m3.m994x(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        float fFloatValue = ((Float) n1.f2381c.m1002h(j6, obj)).floatValue();
                        C0318m c0318m4 = (C0318m) i0Var.f2353a;
                        c0318m4.getClass();
                        c0318m4.m992v(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m977H(i16, m1042z(j6, obj));
                    }
                    break;
                case 54:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m977H(i16, m1042z(j6, obj));
                    }
                    break;
                case 55:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m996z(i16, m1041y(j6, obj));
                    }
                    break;
                case 56:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m994x(i16, m1042z(j6, obj));
                    }
                    break;
                case 57:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m992v(i16, m1041y(j6, obj));
                    }
                    break;
                case 58:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m989s(i16, ((Boolean) n1.f2381c.m1002h(j6, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        m1037O(i16, unsafe.getObject(obj, j6), i0Var);
                    }
                    break;
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m971B(i16, (AbstractC0306a) unsafe.getObject(obj, j6), q0Var.m1058m(i14));
                    }
                    break;
                case 61:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        i0Var.m922a(i16, (C0312g) unsafe.getObject(obj, j6));
                    }
                    break;
                case 62:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m975F(i16, m1041y(j6, obj));
                    }
                    break;
                case 63:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m996z(i16, m1041y(j6, obj));
                    }
                    break;
                case 64:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m992v(i16, m1041y(j6, obj));
                    }
                    break;
                case 65:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        ((C0318m) i0Var.f2353a).m994x(i16, m1042z(j6, obj));
                    }
                    break;
                case 66:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        int iM1041y = m1041y(j6, obj);
                        ((C0318m) i0Var.f2353a).m975F(i16, (iM1041y >> 31) ^ (iM1041y << 1));
                    }
                    break;
                case 67:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        long jM1042z = m1042z(j6, obj);
                        ((C0318m) i0Var.f2353a).m977H(i16, (jM1042z << 1) ^ (jM1042z >> 63));
                    }
                    break;
                case 68:
                    if (q0Var.m1061q(i16, obj, i14)) {
                        i0Var.m923b(i16, unsafe.getObject(obj, j6), q0Var.m1058m(i14));
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        ((i1) q0Var.f2405l).getClass();
        ((AbstractC0335z) obj).unknownFields.m909d(i0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192 A[SYNTHETIC] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1054N(androidx.datastore.preferences.protobuf.i0 r21, int r22, java.lang.Object r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.m1054N(androidx.datastore.preferences.protobuf.i0, int, java.lang.Object, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo810a(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = m1038p(r10)
            if (r0 != 0) goto L8
            goto La7
        L8:
            boolean r0 = r10 instanceof androidx.datastore.preferences.protobuf.AbstractC0335z
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r10
            androidx.datastore.preferences.protobuf.z r0 = (androidx.datastore.preferences.protobuf.AbstractC0335z) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.m1084k(r2)
            r0.memoizedHashCode = r1
            r0.m1082h()
        L1b:
            int[] r0 = r9.f2394a
            int r2 = r0.length
            r3 = r1
        L1f:
            if (r3 >= r2) goto L96
            int r4 = r9.m1052L(r3)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r4
            long r5 = (long) r5
            int r4 = m1036K(r4)
            r7 = 9
            if (r4 == r7) goto L80
            r7 = 60
            if (r4 == r7) goto L6a
            r7 = 68
            if (r4 == r7) goto L6a
            switch(r4) {
                case 17: goto L80;
                case 18: goto L54;
                case 19: goto L54;
                case 20: goto L54;
                case 21: goto L54;
                case 22: goto L54;
                case 23: goto L54;
                case 24: goto L54;
                case 25: goto L54;
                case 26: goto L54;
                case 27: goto L54;
                case 28: goto L54;
                case 29: goto L54;
                case 30: goto L54;
                case 31: goto L54;
                case 32: goto L54;
                case 33: goto L54;
                case 34: goto L54;
                case 35: goto L54;
                case 36: goto L54;
                case 37: goto L54;
                case 38: goto L54;
                case 39: goto L54;
                case 40: goto L54;
                case 41: goto L54;
                case 42: goto L54;
                case 43: goto L54;
                case 44: goto L54;
                case 45: goto L54;
                case 46: goto L54;
                case 47: goto L54;
                case 48: goto L54;
                case 49: goto L54;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L93
        L3e:
            sun.misc.Unsafe r4 = androidx.datastore.preferences.protobuf.q0.f2393o
            java.lang.Object r7 = r4.getObject(r10, r5)
            if (r7 == 0) goto L93
            androidx.datastore.preferences.protobuf.m0 r8 = r9.f2406m
            r8.getClass()
            r8 = r7
            androidx.datastore.preferences.protobuf.l0 r8 = (androidx.datastore.preferences.protobuf.l0) r8
            r8.f2367a = r1
            r4.putObject(r10, r5, r7)
            goto L93
        L54:
            androidx.datastore.preferences.protobuf.e0 r4 = r9.f2404k
            r4.getClass()
            androidx.datastore.preferences.protobuf.m1 r4 = androidx.datastore.preferences.protobuf.n1.f2381c
            java.lang.Object r4 = r4.m1002h(r5, r10)
            androidx.datastore.preferences.protobuf.a0 r4 = (androidx.datastore.preferences.protobuf.a0) r4
            androidx.datastore.preferences.protobuf.b r4 = (androidx.datastore.preferences.protobuf.AbstractC0307b) r4
            boolean r5 = r4.f2292a
            if (r5 == 0) goto L93
            r4.f2292a = r1
            goto L93
        L6a:
            r4 = r0[r3]
            boolean r4 = r9.m1061q(r4, r10, r3)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.a1 r4 = r9.m1058m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.q0.f2393o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.mo810a(r5)
            goto L93
        L80:
            boolean r4 = r9.m1059n(r3, r10)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.a1 r4 = r9.m1058m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.q0.f2393o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.mo810a(r5)
        L93:
            int r3 = r3 + 3
            goto L1f
        L96:
            androidx.datastore.preferences.protobuf.g1 r0 = r9.f2405l
            androidx.datastore.preferences.protobuf.i1 r0 = (androidx.datastore.preferences.protobuf.i1) r0
            r0.getClass()
            androidx.datastore.preferences.protobuf.z r10 = (androidx.datastore.preferences.protobuf.AbstractC0335z) r10
            androidx.datastore.preferences.protobuf.h1 r10 = r10.unknownFields
            boolean r0 = r10.f2343e
            if (r0 == 0) goto La7
            r10.f2343e = r1
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.mo810a(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: b */
    public final boolean mo811b(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f2401h) {
            int i16 = this.f2400g[i15];
            int[] iArr = this.f2394a;
            int i17 = iArr[i16];
            int iM1052L = m1052L(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f2393o.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & iM1052L) == 0 || m1060o(obj, i11, i10, i12, i20)) {
                int iM1036K = m1036K(iM1052L);
                if (iM1036K == 9 || iM1036K == 17) {
                    if (m1060o(obj, i11, i10, i12, i20)) {
                        if (!m1058m(i11).mo811b(n1.f2381c.m1002h(iM1052L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (iM1036K != 27) {
                        if (iM1036K == 60 || iM1036K == 68) {
                            if (m1061q(i17, obj, i11)) {
                                if (!m1058m(i11).mo811b(n1.f2381c.m1002h(iM1052L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        } else if (iM1036K != 49) {
                            if (iM1036K != 50) {
                                continue;
                            } else {
                                Object objM1002h = n1.f2381c.m1002h(iM1052L & 1048575, obj);
                                this.f2406m.getClass();
                                l0 l0Var = (l0) objM1002h;
                                if (l0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((k0) this.f2395b[(i11 / 3) * 2]).f2360a.f2357b.getJavaType() != t1.MESSAGE) {
                                        continue;
                                    } else {
                                        a1 a1VarM1073a = null;
                                        for (Object obj2 : l0Var.values()) {
                                            if (a1VarM1073a == null) {
                                                a1VarM1073a = x0.f2424c.m1073a(obj2.getClass());
                                            }
                                            if (!a1VarM1073a.mo811b(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        }
                    }
                    List list = (List) n1.f2381c.m1002h(iM1052L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        a1 a1VarM1058m = m1058m(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (a1VarM1058m.mo811b(list.get(i22))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: c */
    public final AbstractC0335z mo812c() {
        this.f2403j.getClass();
        return ((AbstractC0335z) this.f2398e).m1083i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo813d(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.mo813d(java.lang.Object, java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: e */
    public final void mo814e(Object obj, i0 i0Var) throws IOException {
        i0Var.getClass();
        C0318m c0318m = (C0318m) i0Var.f2353a;
        if (u1.ASCENDING != u1.DESCENDING) {
            m1053M(obj, i0Var);
            return;
        }
        ((i1) this.f2405l).getClass();
        ((AbstractC0335z) obj).unknownFields.m909d(i0Var);
        int[] iArr = this.f2394a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iM1052L = m1052L(length);
            int i10 = iArr[length];
            switch (m1036K(iM1052L)) {
                case 0:
                    if (m1059n(length, obj)) {
                        double dMo931d = n1.f2381c.mo931d(iM1052L & 1048575, obj);
                        c0318m.getClass();
                        c0318m.m994x(i10, Double.doubleToRawLongBits(dMo931d));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m1059n(length, obj)) {
                        float fMo932e = n1.f2381c.mo932e(iM1052L & 1048575, obj);
                        c0318m.getClass();
                        c0318m.m992v(i10, Float.floatToRawIntBits(fMo932e));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m1059n(length, obj)) {
                        c0318m.m977H(i10, n1.f2381c.m1001g(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m1059n(length, obj)) {
                        c0318m.m977H(i10, n1.f2381c.m1001g(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m1059n(length, obj)) {
                        c0318m.m996z(i10, n1.f2381c.m1000f(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m1059n(length, obj)) {
                        c0318m.m994x(i10, n1.f2381c.m1001g(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m1059n(length, obj)) {
                        c0318m.m992v(i10, n1.f2381c.m1000f(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m1059n(length, obj)) {
                        c0318m.m989s(i10, n1.f2381c.mo930c(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m1059n(length, obj)) {
                        m1037O(i10, n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m1059n(length, obj)) {
                        c0318m.m971B(i10, (AbstractC0306a) n1.f2381c.m1002h(iM1052L & 1048575, obj), m1058m(length));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m1059n(length, obj)) {
                        i0Var.m922a(i10, (C0312g) n1.f2381c.m1002h(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m1059n(length, obj)) {
                        c0318m.m975F(i10, n1.f2381c.m1000f(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m1059n(length, obj)) {
                        c0318m.m996z(i10, n1.f2381c.m1000f(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m1059n(length, obj)) {
                        c0318m.m992v(i10, n1.f2381c.m1000f(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m1059n(length, obj)) {
                        c0318m.m994x(i10, n1.f2381c.m1001g(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (m1059n(length, obj)) {
                        int iM1000f = n1.f2381c.m1000f(iM1052L & 1048575, obj);
                        c0318m.m975F(i10, (iM1000f >> 31) ^ (iM1000f << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m1059n(length, obj)) {
                        long jM1001g = n1.f2381c.m1001g(iM1052L & 1048575, obj);
                        c0318m.m977H(i10, (jM1001g >> 63) ^ (jM1001g << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m1059n(length, obj)) {
                        i0Var.m923b(i10, n1.f2381c.m1002h(iM1052L & 1048575, obj), m1058m(length));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    b1.m840o(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 19:
                    b1.m844s(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 20:
                    b1.m847v(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 21:
                    b1.m825D(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 22:
                    b1.m846u(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 23:
                    b1.m843r(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 24:
                    b1.m842q(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 25:
                    b1.m838m(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 26:
                    b1.m823B(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var);
                    break;
                case 27:
                    b1.m848w(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, m1058m(length));
                    break;
                case 28:
                    b1.m839n(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var);
                    break;
                case 29:
                    b1.m824C(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 30:
                    b1.m841p(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    b1.m849x(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case 32:
                    b1.m850y(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    b1.m851z(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case BERTags.DURATION /* 34 */:
                    b1.m822A(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, false);
                    break;
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    b1.m840o(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    b1.m844s(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 37:
                    b1.m847v(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 38:
                    b1.m825D(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 39:
                    b1.m846u(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    b1.m843r(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 41:
                    b1.m842q(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 42:
                    b1.m838m(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 43:
                    b1.m824C(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 44:
                    b1.m841p(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 45:
                    b1.m849x(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 46:
                    b1.m850y(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 47:
                    b1.m851z(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 48:
                    b1.m822A(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, true);
                    break;
                case 49:
                    b1.m845t(iArr[length], (List) n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var, m1058m(length));
                    break;
                case 50:
                    m1054N(i0Var, i10, n1.f2381c.m1002h(iM1052L & 1048575, obj), length);
                    break;
                case 51:
                    if (m1061q(i10, obj, length)) {
                        double dDoubleValue = ((Double) n1.f2381c.m1002h(iM1052L & 1048575, obj)).doubleValue();
                        c0318m.getClass();
                        c0318m.m994x(i10, Double.doubleToRawLongBits(dDoubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m1061q(i10, obj, length)) {
                        float fFloatValue = ((Float) n1.f2381c.m1002h(iM1052L & 1048575, obj)).floatValue();
                        c0318m.getClass();
                        c0318m.m992v(i10, Float.floatToRawIntBits(fFloatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m977H(i10, m1042z(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m977H(i10, m1042z(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m996z(i10, m1041y(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m994x(i10, m1042z(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m992v(i10, m1041y(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m989s(i10, ((Boolean) n1.f2381c.m1002h(iM1052L & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m1061q(i10, obj, length)) {
                        m1037O(i10, n1.f2381c.m1002h(iM1052L & 1048575, obj), i0Var);
                        break;
                    } else {
                        break;
                    }
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m971B(i10, (AbstractC0306a) n1.f2381c.m1002h(iM1052L & 1048575, obj), m1058m(length));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m1061q(i10, obj, length)) {
                        i0Var.m922a(i10, (C0312g) n1.f2381c.m1002h(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m975F(i10, m1041y(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m996z(i10, m1041y(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m992v(i10, m1041y(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m1061q(i10, obj, length)) {
                        c0318m.m994x(i10, m1042z(iM1052L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m1061q(i10, obj, length)) {
                        int iM1041y = m1041y(iM1052L & 1048575, obj);
                        c0318m.m975F(i10, (iM1041y >> 31) ^ (iM1041y << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m1061q(i10, obj, length)) {
                        long jM1042z = m1042z(iM1052L & 1048575, obj);
                        c0318m.m977H(i10, (jM1042z >> 63) ^ (jM1042z << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m1061q(i10, obj, length)) {
                        i0Var.m923b(i10, n1.f2381c.m1002h(iM1052L & 1048575, obj), m1058m(length));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05f7 A[PHI: r24 r25
      0x05f7: PHI (r24v19 int) = 
      (r24v2 int)
      (r24v3 int)
      (r24v4 int)
      (r24v8 int)
      (r24v10 int)
      (r24v11 int)
      (r24v12 int)
      (r24v16 int)
      (r24v20 int)
     binds: [B:274:0x07ae, B:270:0x0790, B:266:0x0772, B:249:0x06f5, B:235:0x068c, B:231:0x0670, B:227:0x0654, B:220:0x0616, B:214:0x05f5] A[DONT_GENERATE, DONT_INLINE]
      0x05f7: PHI (r25v18 int) = 
      (r25v2 int)
      (r25v3 int)
      (r25v4 int)
      (r25v8 int)
      (r25v10 int)
      (r25v11 int)
      (r25v12 int)
      (r25v15 int)
      (r25v19 int)
     binds: [B:274:0x07ae, B:270:0x0790, B:266:0x0772, B:249:0x06f5, B:235:0x068c, B:231:0x0670, B:227:0x0654, B:220:0x0616, B:214:0x05f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0330 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo815f(androidx.datastore.preferences.protobuf.AbstractC0335z r30) {
        /*
            Method dump skipped, instructions count: 2634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.mo815f(androidx.datastore.preferences.protobuf.z):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo816g(androidx.datastore.preferences.protobuf.AbstractC0335z r12) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.mo816g(androidx.datastore.preferences.protobuf.z):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo817h(androidx.datastore.preferences.protobuf.AbstractC0335z r12, androidx.datastore.preferences.protobuf.AbstractC0335z r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.mo817h(androidx.datastore.preferences.protobuf.z, androidx.datastore.preferences.protobuf.z):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: i */
    public final void mo818i(java.lang.Object r19, androidx.datastore.preferences.protobuf.C0317l r20, androidx.datastore.preferences.protobuf.C0320o r21) {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.mo818i(java.lang.Object, androidx.datastore.preferences.protobuf.l, androidx.datastore.preferences.protobuf.o):void");
    }

    /* renamed from: j */
    public final boolean m1055j(AbstractC0335z abstractC0335z, AbstractC0335z abstractC0335z2, int i10) {
        return m1059n(i10, abstractC0335z) == m1059n(i10, abstractC0335z2);
    }

    /* renamed from: k */
    public final void m1056k(int i10, Object obj, Object obj2) {
        int i11 = this.f2394a[i10];
        if (n1.f2381c.m1002h(m1052L(i10) & 1048575, obj) == null) {
            return;
        }
        m1057l(i10);
    }

    /* renamed from: l */
    public final void m1057l(int i10) {
        if (this.f2395b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: m */
    public final a1 m1058m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f2395b;
        a1 a1Var = (a1) objArr[i11];
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1VarM1073a = x0.f2424c.m1073a((Class) objArr[i11 + 1]);
        objArr[i11] = a1VarM1073a;
        return a1VarM1073a;
    }

    /* renamed from: n */
    public final boolean m1059n(int i10, Object obj) {
        int i11 = this.f2394a[i10 + 2];
        long j6 = i11 & 1048575;
        if (j6 == 1048575) {
            int iM1052L = m1052L(i10);
            long j10 = iM1052L & 1048575;
            switch (m1036K(iM1052L)) {
                case 0:
                    if (Double.doubleToRawLongBits(n1.f2381c.mo931d(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(n1.f2381c.mo932e(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (n1.f2381c.m1001g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (n1.f2381c.m1001g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (n1.f2381c.m1000f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (n1.f2381c.m1001g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (n1.f2381c.m1000f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return n1.f2381c.mo930c(j10, obj);
                case 8:
                    Object objM1002h = n1.f2381c.m1002h(j10, obj);
                    if (objM1002h instanceof String) {
                        return !((String) objM1002h).isEmpty();
                    }
                    if (objM1002h instanceof C0312g) {
                        return !C0312g.f2325c.equals(objM1002h);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n1.f2381c.m1002h(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0312g.f2325c.equals(n1.f2381c.m1002h(j10, obj));
                case 11:
                    if (n1.f2381c.m1000f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (n1.f2381c.m1000f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (n1.f2381c.m1000f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (n1.f2381c.m1001g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (n1.f2381c.m1000f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (n1.f2381c.m1001g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (n1.f2381c.m1002h(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & n1.f2381c.m1000f(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m1060o(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m1059n(i10, obj) : (i12 & i13) != 0;
    }

    /* renamed from: q */
    public final boolean m1061q(int i10, Object obj, int i11) {
        return n1.f2381c.m1000f((long) (this.f2394a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        r0.mo886i(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        return;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1062r(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0320o r12, androidx.datastore.preferences.protobuf.C0317l r13) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r8 = this;
            int r10 = r8.m1052L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.m1 r10 = androidx.datastore.preferences.protobuf.n1.f2381c
            java.lang.Object r10 = r10.m1002h(r0, r9)
            androidx.datastore.preferences.protobuf.m0 r2 = r8.f2406m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.l0 r10 = androidx.datastore.preferences.protobuf.l0.f2366b
            androidx.datastore.preferences.protobuf.l0 r10 = r10.m963d()
            androidx.datastore.preferences.protobuf.n1.m1021o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.l0 r3 = (androidx.datastore.preferences.protobuf.l0) r3
            boolean r3 = r3.f2367a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.l0 r3 = androidx.datastore.preferences.protobuf.l0.f2366b
            androidx.datastore.preferences.protobuf.l0 r3 = r3.m963d()
            androidx.datastore.preferences.protobuf.m0.m997a(r3, r10)
            androidx.datastore.preferences.protobuf.n1.m1021o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.l0 r10 = (androidx.datastore.preferences.protobuf.l0) r10
            androidx.datastore.preferences.protobuf.k0 r11 = (androidx.datastore.preferences.protobuf.k0) r11
            androidx.datastore.preferences.protobuf.j0 r9 = r11.f2360a
            r11 = 2
            r13.m960w(r11)
            androidx.datastore.preferences.protobuf.j r0 = r13.f2362a
            int r1 = r0.mo873A()
            int r1 = r0.mo887j(r1)
            java.lang.Object r2 = r9.f2358c
            java.lang.String r3 = ""
            r4 = r2
        L53:
            int r5 = r13.m938a()     // Catch: java.lang.Throwable -> L77
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L99
            boolean r6 = r0.mo885c()     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L63
            goto L99
        L63:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L84
            if (r5 == r11) goto L79
            boolean r5 = r13.m961x()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            if (r5 == 0) goto L71
            goto L53
        L71:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            throw r5     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
        L77:
            r9 = move-exception
            goto La0
        L79:
            androidx.datastore.preferences.protobuf.s1 r5 = r9.f2357b     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            java.lang.Object r4 = r13.m946i(r5, r6, r12)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            goto L53
        L84:
            androidx.datastore.preferences.protobuf.s1 r5 = r9.f2356a     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            r6 = 0
            java.lang.Object r3 = r13.m946i(r5, r6, r6)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L8c
            goto L53
        L8c:
            boolean r5 = r13.m961x()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L93
            goto L53
        L93:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L77
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r9     // Catch: java.lang.Throwable -> L77
        L99:
            r10.put(r3, r4)     // Catch: java.lang.Throwable -> L77
            r0.mo886i(r1)
            return
        La0:
            r0.mo886i(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.m1062r(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.l):void");
    }

    /* renamed from: s */
    public final void m1063s(int i10, Object obj, Object obj2) {
        if (m1059n(i10, obj2)) {
            long jM1052L = m1052L(i10) & 1048575;
            Unsafe unsafe = f2393o;
            Object object = unsafe.getObject(obj2, jM1052L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2394a[i10] + " is present but null: " + obj2);
            }
            a1 a1VarM1058m = m1058m(i10);
            if (!m1059n(i10, obj)) {
                if (m1038p(object)) {
                    AbstractC0335z abstractC0335zMo812c = a1VarM1058m.mo812c();
                    a1VarM1058m.mo813d(abstractC0335zMo812c, object);
                    unsafe.putObject(obj, jM1052L, abstractC0335zMo812c);
                } else {
                    unsafe.putObject(obj, jM1052L, object);
                }
                m1048G(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM1052L);
            if (!m1038p(object2)) {
                AbstractC0335z abstractC0335zMo812c2 = a1VarM1058m.mo812c();
                a1VarM1058m.mo813d(abstractC0335zMo812c2, object2);
                unsafe.putObject(obj, jM1052L, abstractC0335zMo812c2);
                object2 = abstractC0335zMo812c2;
            }
            a1VarM1058m.mo813d(object2, object);
        }
    }

    /* renamed from: t */
    public final void m1064t(int i10, Object obj, Object obj2) {
        int[] iArr = this.f2394a;
        int i11 = iArr[i10];
        if (m1061q(i11, obj2, i10)) {
            long jM1052L = m1052L(i10) & 1048575;
            Unsafe unsafe = f2393o;
            Object object = unsafe.getObject(obj2, jM1052L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            a1 a1VarM1058m = m1058m(i10);
            if (!m1061q(i11, obj, i10)) {
                if (m1038p(object)) {
                    AbstractC0335z abstractC0335zMo812c = a1VarM1058m.mo812c();
                    a1VarM1058m.mo813d(abstractC0335zMo812c, object);
                    unsafe.putObject(obj, jM1052L, abstractC0335zMo812c);
                } else {
                    unsafe.putObject(obj, jM1052L, object);
                }
                m1049H(i11, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM1052L);
            if (!m1038p(object2)) {
                AbstractC0335z abstractC0335zMo812c2 = a1VarM1058m.mo812c();
                a1VarM1058m.mo813d(abstractC0335zMo812c2, object2);
                unsafe.putObject(obj, jM1052L, abstractC0335zMo812c2);
                object2 = abstractC0335zMo812c2;
            }
            a1VarM1058m.mo813d(object2, object);
        }
    }

    /* renamed from: u */
    public final Object m1065u(int i10, Object obj) {
        a1 a1VarM1058m = m1058m(i10);
        long jM1052L = m1052L(i10) & 1048575;
        if (!m1059n(i10, obj)) {
            return a1VarM1058m.mo812c();
        }
        Object object = f2393o.getObject(obj, jM1052L);
        if (m1038p(object)) {
            return object;
        }
        AbstractC0335z abstractC0335zMo812c = a1VarM1058m.mo812c();
        if (object != null) {
            a1VarM1058m.mo813d(abstractC0335zMo812c, object);
        }
        return abstractC0335zMo812c;
    }

    /* renamed from: v */
    public final Object m1066v(int i10, Object obj, int i11) {
        a1 a1VarM1058m = m1058m(i11);
        if (!m1061q(i10, obj, i11)) {
            return a1VarM1058m.mo812c();
        }
        Object object = f2393o.getObject(obj, m1052L(i11) & 1048575);
        if (m1038p(object)) {
            return object;
        }
        AbstractC0335z abstractC0335zMo812c = a1VarM1058m.mo812c();
        if (object != null) {
            a1VarM1058m.mo813d(abstractC0335zMo812c, object);
        }
        return abstractC0335zMo812c;
    }
}
