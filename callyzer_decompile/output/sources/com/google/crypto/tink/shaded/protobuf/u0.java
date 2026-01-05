package com.google.crypto.tink.shaded.protobuf;

import a2.AbstractC0030c;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 implements f1 {

    /* renamed from: o */
    public static final int[] f7105o = new int[0];

    /* renamed from: p */
    public static final Unsafe f7106p = r1.m4386i();

    /* renamed from: a */
    public final int[] f7107a;

    /* renamed from: b */
    public final Object[] f7108b;

    /* renamed from: c */
    public final int f7109c;

    /* renamed from: d */
    public final int f7110d;

    /* renamed from: e */
    public final AbstractC1374a f7111e;

    /* renamed from: f */
    public final boolean f7112f;

    /* renamed from: g */
    public final boolean f7113g;

    /* renamed from: h */
    public final int[] f7114h;

    /* renamed from: i */
    public final int f7115i;

    /* renamed from: j */
    public final int f7116j;

    /* renamed from: k */
    public final w0 f7117k;

    /* renamed from: l */
    public final m0 f7118l;

    /* renamed from: m */
    public final h1 f7119m;

    /* renamed from: n */
    public final q0 f7120n;

    public u0(int[] iArr, Object[] objArr, int i10, int i11, AbstractC1374a abstractC1374a, boolean z6, int[] iArr2, int i12, int i13, w0 w0Var, m0 m0Var, h1 h1Var, C1391r c1391r, q0 q0Var) {
        this.f7107a = iArr;
        this.f7108b = objArr;
        this.f7109c = i10;
        this.f7110d = i11;
        this.f7112f = abstractC1374a instanceof a0;
        this.f7113g = z6;
        this.f7114h = iArr2;
        this.f7115i = i12;
        this.f7116j = i13;
        this.f7117k = w0Var;
        this.f7118l = m0Var;
        this.f7119m = h1Var;
        this.f7111e = abstractC1374a;
        this.f7120n = q0Var;
    }

    /* renamed from: A */
    public static long m4419A(int i10) {
        return i10 & 1048575;
    }

    /* renamed from: B */
    public static int m4420B(long j6, Object obj) {
        return ((Integer) r1.f7095d.m4373i(j6, obj)).intValue();
    }

    /* renamed from: C */
    public static long m4421C(long j6, Object obj) {
        return ((Long) r1.f7095d.m4373i(j6, obj)).longValue();
    }

    /* renamed from: J */
    public static Field m4422J(Class cls, String str) {
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

    /* renamed from: N */
    public static int m4423N(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* renamed from: Q */
    public static void m4424Q(int i10, Object obj, C1387n c1387n) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            c1387n.m4333b(i10, (AbstractC1382i) obj);
            return;
        }
        String str = (String) obj;
        C1386m c1386m = (C1386m) c1387n.f7081a;
        c1386m.m4328Q(i10, 2);
        int i11 = c1386m.f7075c;
        byte[] bArr = c1386m.f7074b;
        int i12 = c1386m.f7076d;
        try {
            int iM4318H = C1386m.m4318H(str.length() * 3);
            int iM4318H2 = C1386m.m4318H(str.length());
            if (iM4318H2 != iM4318H) {
                c1386m.m4329R(u1.m4453b(str));
                int i13 = c1386m.f7076d;
                c1386m.f7076d = u1.f7121a.mo4395s(str, bArr, i13, i11 - i13);
                return;
            }
            int i14 = i12 + iM4318H2;
            c1386m.f7076d = i14;
            int iMo4395s = u1.f7121a.mo4395s(str, bArr, i14, i11 - i14);
            c1386m.f7076d = i12;
            c1386m.m4329R((iMo4395s - i12) - iM4318H2);
            c1386m.f7076d = iMo4395s;
        } catch (t1 e2) {
            c1386m.f7076d = i12;
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

    /* renamed from: p */
    public static i1 m4425p(Object obj) {
        a0 a0Var = (a0) obj;
        i1 i1Var = a0Var.unknownFields;
        if (i1Var != i1.f7048f) {
            return i1Var;
        }
        i1 i1VarM4283b = i1.m4283b();
        a0Var.unknownFields = i1VarM4283b;
        return i1VarM4283b;
    }

    /* renamed from: u */
    public static List m4426u(long j6, Object obj) {
        return (List) r1.f7095d.m4373i(j6, obj);
    }

    /* renamed from: y */
    public static u0 m4427y(d1 d1Var, w0 w0Var, m0 m0Var, h1 h1Var, C1391r c1391r, q0 q0Var) {
        if (d1Var instanceof d1) {
            return m4428z(d1Var, w0Var, m0Var, h1Var, c1391r, q0Var);
        }
        d1Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ad  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.crypto.tink.shaded.protobuf.u0 m4428z(com.google.crypto.tink.shaded.protobuf.d1 r35, com.google.crypto.tink.shaded.protobuf.w0 r36, com.google.crypto.tink.shaded.protobuf.m0 r37, com.google.crypto.tink.shaded.protobuf.h1 r38, com.google.crypto.tink.shaded.protobuf.C1391r r39, com.google.crypto.tink.shaded.protobuf.q0 r40) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.m4428z(com.google.crypto.tink.shaded.protobuf.d1, com.google.crypto.tink.shaded.protobuf.w0, com.google.crypto.tink.shaded.protobuf.m0, com.google.crypto.tink.shaded.protobuf.h1, com.google.crypto.tink.shaded.protobuf.r, com.google.crypto.tink.shaded.protobuf.q0):com.google.crypto.tink.shaded.protobuf.u0");
    }

    /* renamed from: D */
    public final void m4429D(int i10, long j6, Object obj) {
        Unsafe unsafe = f7106p;
        Object objM4443n = m4443n(i10);
        Object object = unsafe.getObject(obj, j6);
        this.f7120n.getClass();
        if (!((p0) object).f7086a) {
            p0 p0VarM4365f = p0.f7085b.m4365f();
            q0.m4368b(p0VarM4365f, object);
            unsafe.putObject(obj, j6, p0VarM4365f);
        }
        AbstractC1452a.m4578y(objM4443n);
        throw null;
    }

    /* renamed from: E */
    public final int m4430E(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j6, int i17, C1377d c1377d) throws InvalidProtocolBufferException {
        Object object;
        Unsafe unsafe = f7106p;
        long j10 = this.f7107a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j6, Double.valueOf(Double.longBitsToDouble(t0.m4403g(i10, bArr))));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j10, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j6, Float.valueOf(Float.intBitsToFloat(t0.m4402f(i10, bArr))));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j10, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iM4413r = t0.m4413r(bArr, i10, c1377d);
                unsafe.putObject(obj, j6, Long.valueOf(c1377d.f7028b));
                unsafe.putInt(obj, j10, i13);
                return iM4413r;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iM4411p = t0.m4411p(bArr, i10, c1377d);
                unsafe.putObject(obj, j6, Integer.valueOf(c1377d.f7027a));
                unsafe.putInt(obj, j10, i13);
                return iM4411p;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j6, Long.valueOf(t0.m4403g(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j10, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j6, Integer.valueOf(t0.m4402f(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j10, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iM4413r2 = t0.m4413r(bArr, i10, c1377d);
                unsafe.putObject(obj, j6, Boolean.valueOf(c1377d.f7028b != 0));
                unsafe.putInt(obj, j10, i13);
                return iM4413r2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iM4411p2 = t0.m4411p(bArr, i10, c1377d);
                int i22 = c1377d.f7027a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j6, "");
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (!u1.f7121a.m4418v(iM4411p2, iM4411p2 + i22, bArr)) {
                            throw InvalidProtocolBufferException.m4149a();
                        }
                    }
                    unsafe.putObject(obj, j6, new String(bArr, iM4411p2, i22, g0.f7037a));
                    iM4411p2 += i22;
                }
                unsafe.putInt(obj, j10, i13);
                return iM4411p2;
            case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                if (i14 != 2) {
                    return i10;
                }
                int iM4405i = t0.m4405i(m4444o(i17), bArr, i10, i11, c1377d);
                object = unsafe.getInt(obj, j10) == i13 ? unsafe.getObject(obj, j6) : null;
                if (object == null) {
                    unsafe.putObject(obj, j6, c1377d.f7029c);
                } else {
                    unsafe.putObject(obj, j6, g0.m4230c(object, c1377d.f7029c));
                }
                unsafe.putInt(obj, j10, i13);
                return iM4405i;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iM4401e = t0.m4401e(bArr, i10, c1377d);
                unsafe.putObject(obj, j6, c1377d.f7029c);
                unsafe.putInt(obj, j10, i13);
                return iM4401e;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iM4411p3 = t0.m4411p(bArr, i10, c1377d);
                int i23 = c1377d.f7027a;
                e0 e0VarM4442m = m4442m(i17);
                if (e0VarM4442m != null && !e0VarM4442m.mo4175a(i23)) {
                    m4425p(obj).m4285c(i12, Long.valueOf(i23));
                    return iM4411p3;
                }
                unsafe.putObject(obj, j6, Integer.valueOf(i23));
                unsafe.putInt(obj, j10, i13);
                return iM4411p3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iM4411p4 = t0.m4411p(bArr, i10, c1377d);
                unsafe.putObject(obj, j6, Integer.valueOf(AbstractC1384k.m4298a(c1377d.f7027a)));
                unsafe.putInt(obj, j10, i13);
                return iM4411p4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iM4413r3 = t0.m4413r(bArr, i10, c1377d);
                unsafe.putObject(obj, j6, Long.valueOf(AbstractC1384k.m4299b(c1377d.f7028b)));
                unsafe.putInt(obj, j10, i13);
                return iM4413r3;
            case 68:
                if (i14 == 3) {
                    int iM4404h = t0.m4404h(m4444o(i17), bArr, i10, i11, (i12 & (-8)) | 4, c1377d);
                    object = unsafe.getInt(obj, j10) == i13 ? unsafe.getObject(obj, j6) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j6, c1377d.f7029c);
                    } else {
                        unsafe.putObject(obj, j6, g0.m4230c(object, c1377d.f7029c));
                    }
                    unsafe.putInt(obj, j10, i13);
                    return iM4404h;
                }
                break;
        }
        return i10;
    }

    /* renamed from: F */
    public final int m4431F(Object obj, byte[] bArr, int i10, int i11, int i12, C1377d c1377d) {
        int i13;
        Object obj2;
        Unsafe unsafe;
        Object obj3;
        int i14;
        u0 u0Var;
        int i15;
        int iM4437M;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Unsafe unsafe2;
        int i22;
        int i23;
        int i24;
        Object obj4;
        int i25;
        byte[] bArr2;
        int i26;
        Unsafe unsafe3;
        Unsafe unsafe4;
        byte[] bArr3;
        int i27;
        int i28;
        int i29;
        Object obj5;
        int iM4430E;
        u0 u0Var2 = this;
        Object obj6 = obj;
        byte[] bArr4 = bArr;
        int i30 = i11;
        C1377d c1377d2 = c1377d;
        Unsafe unsafe5 = f7106p;
        int iM4413r = i10;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = -1;
        int i35 = 0;
        while (true) {
            if (iM4413r < i30) {
                int iM4410o = iM4413r + 1;
                int i36 = bArr4[iM4413r];
                if (i36 < 0) {
                    iM4410o = t0.m4410o(i36, bArr4, iM4410o, c1377d2);
                    i36 = c1377d2.f7027a;
                }
                int i37 = iM4410o;
                int i38 = i36;
                iM4413r = i37;
                int i39 = i38 >>> 3;
                int i40 = i38 & 7;
                int i41 = u0Var2.f7110d;
                int i42 = u0Var2.f7109c;
                if (i39 > i31) {
                    iM4437M = (i39 < i42 || i39 > i41) ? -1 : u0Var2.m4437M(i39, i32 / 3);
                    i15 = 0;
                } else if (i39 < i42 || i39 > i41) {
                    i15 = 0;
                    iM4437M = -1;
                } else {
                    i15 = 0;
                    iM4437M = u0Var2.m4437M(i39, 0);
                }
                int i43 = iM4437M;
                if (i43 == -1) {
                    i13 = i12;
                    i14 = -1;
                    unsafe = unsafe5;
                    int i44 = i15;
                    i16 = i39;
                    obj3 = null;
                    u0Var = u0Var2;
                    obj2 = obj6;
                    i17 = i38;
                    i18 = i34;
                    i19 = i44;
                } else {
                    int[] iArr = u0Var2.f7107a;
                    int i45 = iArr[i43 + 1];
                    int iM4423N = m4423N(i45);
                    long j6 = i45 & 1048575;
                    if (iM4423N <= 17) {
                        int i46 = iArr[i43 + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i34) {
                            if (i34 != -1) {
                                unsafe5.putInt(obj6, i34, i35);
                            }
                            i21 = i48;
                            i20 = unsafe5.getInt(obj6, i48);
                        } else {
                            i20 = i35;
                            i21 = i34;
                        }
                        switch (iM4423N) {
                            case 0:
                                unsafe3 = unsafe5;
                                i22 = i38;
                                i24 = iM4413r;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 1) {
                                    obj4 = obj6;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    r1.f7095d.mo4361m(obj6, j6, Double.longBitsToDouble(t0.m4403g(i24, bArr)));
                                    iM4413r = i24 + 8;
                                    obj6 = obj6;
                                    bArr4 = bArr;
                                    i34 = i21;
                                    i35 = i20 | i47;
                                    i30 = i11;
                                    unsafe5 = unsafe3;
                                    i32 = i43;
                                    i33 = i22;
                                    i31 = i39;
                                }
                            case 1:
                                unsafe3 = unsafe5;
                                i22 = i38;
                                i24 = iM4413r;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 5) {
                                    obj4 = obj6;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    r1.f7095d.mo4362n(obj6, j6, Float.intBitsToFloat(t0.m4402f(i24, bArr)));
                                    iM4413r = i24 + 4;
                                    int i49 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr;
                                    i34 = i49;
                                    i30 = i11;
                                    unsafe5 = unsafe3;
                                    i32 = i43;
                                    i33 = i22;
                                    i31 = i39;
                                }
                            case 2:
                            case 3:
                                unsafe4 = unsafe5;
                                i22 = i38;
                                i24 = iM4413r;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 0) {
                                    unsafe3 = unsafe4;
                                    obj4 = obj6;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    int iM4413r2 = t0.m4413r(bArr, i24, c1377d2);
                                    unsafe4.putLong(obj6, j6, c1377d2.f7028b);
                                    unsafe3 = unsafe4;
                                    int i50 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr;
                                    i34 = i50;
                                    i30 = i11;
                                    iM4413r = iM4413r2;
                                    unsafe5 = unsafe3;
                                    i32 = i43;
                                    i33 = i22;
                                    i31 = i39;
                                }
                            case 4:
                            case 11:
                                unsafe4 = unsafe5;
                                i22 = i38;
                                i24 = iM4413r;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 0) {
                                    unsafe3 = unsafe4;
                                    obj4 = obj6;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    int iM4411p = t0.m4411p(bArr, i24, c1377d2);
                                    unsafe4.putInt(obj6, j6, c1377d2.f7027a);
                                    i30 = i11;
                                    unsafe5 = unsafe4;
                                    bArr4 = bArr;
                                    i32 = i43;
                                    i34 = i21;
                                    i33 = i22;
                                    i35 = i20 | i47;
                                    iM4413r = iM4411p;
                                    i31 = i39;
                                }
                            case 5:
                            case 14:
                                unsafe2 = unsafe5;
                                i22 = i38;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 1) {
                                    i24 = iM4413r;
                                    obj4 = obj6;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    unsafe2.putLong(obj6, j6, t0.m4403g(iM4413r, bArr));
                                    iM4413r += 8;
                                    i25 = i20 | i47;
                                    unsafe5 = unsafe2;
                                    bArr4 = bArr;
                                    i32 = i43;
                                    i34 = i21;
                                    i33 = i22;
                                    i31 = i39;
                                    i35 = i25;
                                    i30 = i11;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                unsafe2 = unsafe5;
                                i22 = i38;
                                i26 = iM4413r;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 5) {
                                    obj4 = obj6;
                                    i24 = i26;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    unsafe2.putInt(obj6, j6, t0.m4402f(i26, bArr2));
                                    iM4413r = i26 + 4;
                                    int i51 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr2;
                                    i34 = i51;
                                    unsafe5 = unsafe2;
                                    i32 = i43;
                                    i33 = i22;
                                    i31 = i39;
                                    i30 = i11;
                                }
                            case 7:
                                bArr2 = bArr;
                                unsafe2 = unsafe5;
                                i22 = i38;
                                i26 = iM4413r;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 0) {
                                    obj4 = obj6;
                                    i24 = i26;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    iM4413r = t0.m4413r(bArr2, i26, c1377d2);
                                    r1.f7095d.mo4359k(obj6, j6, c1377d2.f7028b != 0);
                                    int i512 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr2;
                                    i34 = i512;
                                    unsafe5 = unsafe2;
                                    i32 = i43;
                                    i33 = i22;
                                    i31 = i39;
                                    i30 = i11;
                                }
                            case 8:
                                bArr2 = bArr;
                                unsafe2 = unsafe5;
                                i22 = i38;
                                i26 = iM4413r;
                                c1377d2 = c1377d;
                                i23 = -1;
                                if (i40 != 2) {
                                    obj4 = obj6;
                                    i24 = i26;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    iM4413r = (536870912 & i45) == 0 ? t0.m4407k(bArr2, i26, c1377d2) : t0.m4408l(bArr2, i26, c1377d2);
                                    unsafe2.putObject(obj6, j6, c1377d2.f7029c);
                                    int i5122 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr2;
                                    i34 = i5122;
                                    unsafe5 = unsafe2;
                                    i32 = i43;
                                    i33 = i22;
                                    i31 = i39;
                                    i30 = i11;
                                }
                            case 9:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i27 = i38;
                                i28 = iM4413r;
                                i29 = i11;
                                i23 = -1;
                                c1377d2 = c1377d;
                                if (i40 != 2) {
                                    obj4 = obj6;
                                    i24 = i28;
                                    i22 = i27;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    iM4413r = t0.m4405i(u0Var2.m4444o(i43), bArr3, i28, i29, c1377d2);
                                    if ((i20 & i47) == 0) {
                                        unsafe2.putObject(obj6, j6, c1377d2.f7029c);
                                    } else {
                                        unsafe2.putObject(obj6, j6, g0.m4230c(unsafe2.getObject(obj6, j6), c1377d2.f7029c));
                                    }
                                    int i52 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr3;
                                    i34 = i52;
                                    int i53 = i29;
                                    unsafe5 = unsafe2;
                                    i30 = i53;
                                    i33 = i27;
                                    i32 = i43;
                                    i31 = i39;
                                }
                            case 10:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i27 = i38;
                                i28 = iM4413r;
                                i29 = i11;
                                i23 = -1;
                                c1377d2 = c1377d;
                                if (i40 != 2) {
                                    obj4 = obj6;
                                    i24 = i28;
                                    i22 = i27;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    iM4413r = t0.m4401e(bArr3, i28, c1377d2);
                                    unsafe2.putObject(obj6, j6, c1377d2.f7029c);
                                    int i522 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr3;
                                    i34 = i522;
                                    int i532 = i29;
                                    unsafe5 = unsafe2;
                                    i30 = i532;
                                    i33 = i27;
                                    i32 = i43;
                                    i31 = i39;
                                }
                            case 12:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i27 = i38;
                                i28 = iM4413r;
                                i29 = i11;
                                i23 = -1;
                                c1377d2 = c1377d;
                                if (i40 != 0) {
                                    obj4 = obj6;
                                    i24 = i28;
                                    i22 = i27;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    iM4413r = t0.m4411p(bArr3, i28, c1377d2);
                                    int i54 = c1377d2.f7027a;
                                    e0 e0VarM4442m = u0Var2.m4442m(i43);
                                    if (e0VarM4442m == null || e0VarM4442m.mo4175a(i54)) {
                                        unsafe2.putInt(obj6, j6, i54);
                                        int i5222 = i21;
                                        i35 = i20 | i47;
                                        bArr4 = bArr3;
                                        i34 = i5222;
                                        int i5322 = i29;
                                        unsafe5 = unsafe2;
                                        i30 = i5322;
                                        i33 = i27;
                                        i32 = i43;
                                        i31 = i39;
                                    } else {
                                        m4425p(obj6).m4285c(i27, Long.valueOf(i54));
                                        unsafe5 = unsafe2;
                                        i30 = i29;
                                        bArr4 = bArr3;
                                        i33 = i27;
                                        i32 = i43;
                                        i34 = i21;
                                        i35 = i20;
                                        i31 = i39;
                                    }
                                }
                                break;
                            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i27 = i38;
                                i28 = iM4413r;
                                i29 = i11;
                                i23 = -1;
                                c1377d2 = c1377d;
                                if (i40 != 0) {
                                    obj4 = obj6;
                                    i24 = i28;
                                    i22 = i27;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    iM4413r = t0.m4411p(bArr3, i28, c1377d2);
                                    unsafe2.putInt(obj6, j6, AbstractC1384k.m4298a(c1377d2.f7027a));
                                    int i52222 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr3;
                                    i34 = i52222;
                                    int i53222 = i29;
                                    unsafe5 = unsafe2;
                                    i30 = i53222;
                                    i33 = i27;
                                    i32 = i43;
                                    i31 = i39;
                                }
                            case 16:
                                i27 = i38;
                                i28 = iM4413r;
                                i23 = -1;
                                if (i40 != 0) {
                                    unsafe2 = unsafe5;
                                    obj4 = obj6;
                                    i24 = i28;
                                    i22 = i27;
                                    unsafe3 = unsafe2;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    int iM4413r3 = t0.m4413r(bArr, i28, c1377d);
                                    c1377d2 = c1377d;
                                    Unsafe unsafe6 = unsafe5;
                                    unsafe6.putLong(obj6, j6, AbstractC1384k.m4299b(c1377d.f7028b));
                                    int i55 = i21;
                                    i35 = i20 | i47;
                                    bArr4 = bArr;
                                    i34 = i55;
                                    unsafe5 = unsafe6;
                                    i30 = i11;
                                    iM4413r = iM4413r3;
                                    i33 = i27;
                                    i32 = i43;
                                    i31 = i39;
                                }
                            case 17:
                                if (i40 != 3) {
                                    i23 = -1;
                                    obj4 = obj6;
                                    i22 = i38;
                                    unsafe3 = unsafe5;
                                    i24 = iM4413r;
                                    iM4413r = i24;
                                    unsafe = unsafe3;
                                    i19 = i43;
                                    i17 = i22;
                                    i14 = i23;
                                    i16 = i39;
                                    obj3 = null;
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj4;
                                    i18 = i21;
                                    i35 = i20;
                                    break;
                                } else {
                                    iM4413r = t0.m4404h(u0Var2.m4444o(i43), bArr, iM4413r, i11, (i39 << 3) | 4, c1377d);
                                    if ((i20 & i47) == 0) {
                                        unsafe5.putObject(obj6, j6, c1377d.f7029c);
                                    } else {
                                        unsafe5.putObject(obj6, j6, g0.m4230c(unsafe5.getObject(obj6, j6), c1377d.f7029c));
                                    }
                                    i25 = i20 | i47;
                                    c1377d2 = c1377d;
                                    bArr4 = bArr;
                                    i33 = i38;
                                    i32 = i43;
                                    i34 = i21;
                                    i31 = i39;
                                    i35 = i25;
                                    i30 = i11;
                                }
                            default:
                                obj4 = obj6;
                                unsafe3 = unsafe5;
                                i22 = i38;
                                i24 = iM4413r;
                                i23 = -1;
                                iM4413r = i24;
                                unsafe = unsafe3;
                                i19 = i43;
                                i17 = i22;
                                i14 = i23;
                                i16 = i39;
                                obj3 = null;
                                i13 = i12;
                                u0Var = u0Var2;
                                obj2 = obj4;
                                i18 = i21;
                                i35 = i20;
                                break;
                        }
                    } else {
                        Object obj7 = obj6;
                        i17 = i38;
                        Unsafe unsafe7 = unsafe5;
                        if (iM4423N != 27) {
                            if (iM4423N <= 49) {
                                int i56 = i34;
                                i19 = i43;
                                i20 = i35;
                                unsafe = unsafe7;
                                i14 = -1;
                                i16 = i39;
                                obj3 = null;
                                i18 = i56;
                                iM4430E = u0Var2.m4433H(obj, bArr, iM4413r, i11, i17, i16, i40, i19, i45, iM4423N, j6, c1377d);
                                i17 = i17;
                                if (iM4430E != iM4413r) {
                                    i30 = i11;
                                    c1377d2 = c1377d;
                                    i31 = i16;
                                    iM4413r = iM4430E;
                                    i32 = i19;
                                    i34 = i18;
                                    i35 = i20;
                                    unsafe5 = unsafe;
                                    i33 = i17;
                                    obj6 = obj;
                                    bArr4 = bArr;
                                } else {
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj;
                                }
                            } else {
                                obj5 = obj;
                                i20 = i35;
                                unsafe = unsafe7;
                                i14 = -1;
                                i16 = i39;
                                obj3 = null;
                                i18 = i34;
                                i19 = i43;
                                iM4413r = iM4413r;
                                if (iM4423N == 50) {
                                    if (i40 == 2) {
                                        u0Var2.m4429D(i19, j6, obj5);
                                        throw null;
                                    }
                                    i13 = i12;
                                    u0Var = u0Var2;
                                    obj2 = obj5;
                                    i35 = i20;
                                } else {
                                    iM4430E = u0Var2.m4430E(obj5, bArr, iM4413r, i11, i17, i16, i40, i45, iM4423N, j6, i19, c1377d);
                                    u0Var = u0Var2;
                                    obj2 = obj5;
                                    i17 = i17;
                                    i19 = i19;
                                    if (iM4430E != iM4413r) {
                                        bArr4 = bArr;
                                        i30 = i11;
                                        c1377d2 = c1377d;
                                        i31 = i16;
                                        iM4413r = iM4430E;
                                        i32 = i19;
                                        u0Var2 = u0Var;
                                        i34 = i18;
                                        i35 = i20;
                                        unsafe5 = unsafe;
                                        i33 = i17;
                                        obj6 = obj2;
                                    } else {
                                        i13 = i12;
                                    }
                                }
                            }
                            iM4413r = iM4430E;
                            i35 = i20;
                        } else if (i40 == 2) {
                            f0 f0VarMo4173i = (f0) unsafe7.getObject(obj7, j6);
                            if (!((AbstractC1375b) f0VarMo4173i).f7018a) {
                                int size = f0VarMo4173i.size();
                                f0VarMo4173i = f0VarMo4173i.mo4173i(size == 0 ? 10 : size * 2);
                                unsafe7.putObject(obj7, j6, f0VarMo4173i);
                            }
                            i30 = i11;
                            c1377d2 = c1377d;
                            iM4413r = t0.m4406j(u0Var2.m4444o(i43), i17, bArr, iM4413r, i11, f0VarMo4173i, c1377d);
                            i33 = i17;
                            i32 = i43;
                            unsafe5 = unsafe7;
                            i31 = i39;
                            obj6 = obj;
                            bArr4 = bArr;
                        } else {
                            obj5 = obj;
                            iM4413r = iM4413r;
                            i20 = i35;
                            unsafe = unsafe7;
                            i14 = -1;
                            i16 = i39;
                            obj3 = null;
                            i18 = i34;
                            i19 = i43;
                            i13 = i12;
                            u0Var = u0Var2;
                            obj2 = obj5;
                            i35 = i20;
                        }
                    }
                }
                if (i17 != i13 || i13 == 0) {
                    bArr4 = bArr;
                    int i57 = i17;
                    int iM4409m = t0.m4409m(i57, bArr4, iM4413r, i11, m4425p(obj2), c1377d);
                    c1377d2 = c1377d;
                    i30 = i11;
                    i33 = i57;
                    i31 = i16;
                    i32 = i19;
                    u0Var2 = u0Var;
                    i34 = i18;
                    unsafe5 = unsafe;
                    iM4413r = iM4409m;
                    obj6 = obj2;
                } else {
                    i30 = i11;
                    i33 = i17;
                    i34 = i18;
                }
            } else {
                i13 = i12;
                obj2 = obj6;
                unsafe = unsafe5;
                obj3 = null;
                i14 = -1;
                u0Var = u0Var2;
            }
        }
        if (i34 != i14) {
            unsafe.putInt(obj2, i34, i35);
        }
        for (int i58 = u0Var.f7115i; i58 < u0Var.f7116j; i58++) {
            u0Var.m4441l(u0Var.f7114h[i58], obj2, obj3);
        }
        if (i13 == 0) {
            if (iM4413r != i30) {
                throw InvalidProtocolBufferException.m4153e();
            }
        } else if (iM4413r > i30 || i33 != i13) {
            throw InvalidProtocolBufferException.m4153e();
        }
        return iM4413r;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0064. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4432G(java.lang.Object r24, byte[] r25, int r26, int r27, com.google.crypto.tink.shaded.protobuf.C1377d r28) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.m4432G(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.d):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: H */
    public final int m4433H(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j6, int i16, long j10, C1377d c1377d) throws InvalidProtocolBufferException {
        int iM4412q;
        Unsafe unsafe = f7106p;
        f0 f0VarMo4173i = (f0) unsafe.getObject(obj, j10);
        if (!((AbstractC1375b) f0VarMo4173i).f7018a) {
            int size = f0VarMo4173i.size();
            f0VarMo4173i = f0VarMo4173i.mo4173i(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, f0VarMo4173i);
        }
        f0 f0Var = f0VarMo4173i;
        switch (i16) {
            case 18:
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                if (i14 == 2) {
                    AbstractC1388o abstractC1388o = (AbstractC1388o) f0Var;
                    int iM4411p = t0.m4411p(bArr, i10, c1377d);
                    int i17 = c1377d.f7027a + iM4411p;
                    while (iM4411p < i17) {
                        abstractC1388o.m4352b(Double.longBitsToDouble(t0.m4403g(iM4411p, bArr)));
                        iM4411p += 8;
                    }
                    if (iM4411p == i17) {
                        return iM4411p;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 1) {
                    AbstractC1388o abstractC1388o2 = (AbstractC1388o) f0Var;
                    abstractC1388o2.m4352b(Double.longBitsToDouble(t0.m4403g(i10, bArr)));
                    int i18 = i10 + 8;
                    while (i18 < i11) {
                        int iM4411p2 = t0.m4411p(bArr, i18, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return i18;
                        }
                        abstractC1388o2.m4352b(Double.longBitsToDouble(t0.m4403g(iM4411p2, bArr)));
                        i18 = iM4411p2 + 8;
                    }
                    return i18;
                }
                return i10;
            case 19:
            case BERTags.RELATIVE_OID_IRI /* 36 */:
                if (i14 == 2) {
                    AbstractC1395v abstractC1395v = (AbstractC1395v) f0Var;
                    int iM4411p3 = t0.m4411p(bArr, i10, c1377d);
                    int i19 = c1377d.f7027a + iM4411p3;
                    while (iM4411p3 < i19) {
                        abstractC1395v.m4456b(Float.intBitsToFloat(t0.m4402f(iM4411p3, bArr)));
                        iM4411p3 += 4;
                    }
                    if (iM4411p3 == i19) {
                        return iM4411p3;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 5) {
                    AbstractC1395v abstractC1395v2 = (AbstractC1395v) f0Var;
                    abstractC1395v2.m4456b(Float.intBitsToFloat(t0.m4402f(i10, bArr)));
                    int i20 = i10 + 4;
                    while (i20 < i11) {
                        int iM4411p4 = t0.m4411p(bArr, i20, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return i20;
                        }
                        abstractC1395v2.m4456b(Float.intBitsToFloat(t0.m4402f(iM4411p4, bArr)));
                        i20 = iM4411p4 + 4;
                    }
                    return i20;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    n0 n0Var = (n0) f0Var;
                    int iM4411p5 = t0.m4411p(bArr, i10, c1377d);
                    int i21 = c1377d.f7027a + iM4411p5;
                    while (iM4411p5 < i21) {
                        iM4411p5 = t0.m4413r(bArr, iM4411p5, c1377d);
                        n0Var.m4349b(c1377d.f7028b);
                    }
                    if (iM4411p5 == i21) {
                        return iM4411p5;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 0) {
                    n0 n0Var2 = (n0) f0Var;
                    int iM4413r = t0.m4413r(bArr, i10, c1377d);
                    n0Var2.m4349b(c1377d.f7028b);
                    while (iM4413r < i11) {
                        int iM4411p6 = t0.m4411p(bArr, iM4413r, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return iM4413r;
                        }
                        iM4413r = t0.m4413r(bArr, iM4411p6, c1377d);
                        n0Var2.m4349b(c1377d.f7028b);
                    }
                    return iM4413r;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 != 2) {
                    if (i14 == 0) {
                        return t0.m4412q(i12, bArr, i10, i11, f0Var, c1377d);
                    }
                    return i10;
                }
                b0 b0Var = (b0) f0Var;
                int iM4411p7 = t0.m4411p(bArr, i10, c1377d);
                int i22 = c1377d.f7027a + iM4411p7;
                while (iM4411p7 < i22) {
                    iM4411p7 = t0.m4411p(bArr, iM4411p7, c1377d);
                    b0Var.m4168b(c1377d.f7027a);
                }
                if (iM4411p7 == i22) {
                    return iM4411p7;
                }
                throw InvalidProtocolBufferException.m4154f();
            case 23:
            case 32:
            case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
            case 46:
                if (i14 == 2) {
                    n0 n0Var3 = (n0) f0Var;
                    int iM4411p8 = t0.m4411p(bArr, i10, c1377d);
                    int i23 = c1377d.f7027a + iM4411p8;
                    while (iM4411p8 < i23) {
                        n0Var3.m4349b(t0.m4403g(iM4411p8, bArr));
                        iM4411p8 += 8;
                    }
                    if (iM4411p8 == i23) {
                        return iM4411p8;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 1) {
                    n0 n0Var4 = (n0) f0Var;
                    n0Var4.m4349b(t0.m4403g(i10, bArr));
                    int i24 = i10 + 8;
                    while (i24 < i11) {
                        int iM4411p9 = t0.m4411p(bArr, i24, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return i24;
                        }
                        n0Var4.m4349b(t0.m4403g(iM4411p9, bArr));
                        i24 = iM4411p9 + 8;
                    }
                    return i24;
                }
                return i10;
            case 24:
            case BERTags.DATE /* 31 */:
            case 41:
            case 45:
                if (i14 == 2) {
                    b0 b0Var2 = (b0) f0Var;
                    int iM4411p10 = t0.m4411p(bArr, i10, c1377d);
                    int i25 = c1377d.f7027a + iM4411p10;
                    while (iM4411p10 < i25) {
                        b0Var2.m4168b(t0.m4402f(iM4411p10, bArr));
                        iM4411p10 += 4;
                    }
                    if (iM4411p10 == i25) {
                        return iM4411p10;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 5) {
                    b0 b0Var3 = (b0) f0Var;
                    b0Var3.m4168b(t0.m4402f(i10, bArr));
                    int i26 = i10 + 4;
                    while (i26 < i11) {
                        int iM4411p11 = t0.m4411p(bArr, i26, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return i26;
                        }
                        b0Var3.m4168b(t0.m4402f(iM4411p11, bArr));
                        i26 = iM4411p11 + 4;
                    }
                    return i26;
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    AbstractC1378e abstractC1378e = (AbstractC1378e) f0Var;
                    int iM4411p12 = t0.m4411p(bArr, i10, c1377d);
                    int i27 = c1377d.f7027a + iM4411p12;
                    while (iM4411p12 < i27) {
                        iM4411p12 = t0.m4413r(bArr, iM4411p12, c1377d);
                        abstractC1378e.m4174b(c1377d.f7028b != 0);
                    }
                    if (iM4411p12 == i27) {
                        return iM4411p12;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 0) {
                    AbstractC1378e abstractC1378e2 = (AbstractC1378e) f0Var;
                    int iM4413r2 = t0.m4413r(bArr, i10, c1377d);
                    abstractC1378e2.m4174b(c1377d.f7028b != 0);
                    while (iM4413r2 < i11) {
                        int iM4411p13 = t0.m4411p(bArr, iM4413r2, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return iM4413r2;
                        }
                        iM4413r2 = t0.m4413r(bArr, iM4411p13, c1377d);
                        abstractC1378e2.m4174b(c1377d.f7028b != 0);
                    }
                    return iM4413r2;
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    if ((j6 & 536870912) == 0) {
                        int iM4411p14 = t0.m4411p(bArr, i10, c1377d);
                        int i28 = c1377d.f7027a;
                        if (i28 < 0) {
                            throw InvalidProtocolBufferException.m4152d();
                        }
                        if (i28 == 0) {
                            f0Var.add("");
                        } else {
                            f0Var.add(new String(bArr, iM4411p14, i28, g0.f7037a));
                            iM4411p14 += i28;
                        }
                        while (iM4411p14 < i11) {
                            int iM4411p15 = t0.m4411p(bArr, iM4411p14, c1377d);
                            if (i12 != c1377d.f7027a) {
                                return iM4411p14;
                            }
                            iM4411p14 = t0.m4411p(bArr, iM4411p15, c1377d);
                            int i29 = c1377d.f7027a;
                            if (i29 < 0) {
                                throw InvalidProtocolBufferException.m4152d();
                            }
                            if (i29 == 0) {
                                f0Var.add("");
                            } else {
                                f0Var.add(new String(bArr, iM4411p14, i29, g0.f7037a));
                                iM4411p14 += i29;
                            }
                        }
                        return iM4411p14;
                    }
                    int iM4411p16 = t0.m4411p(bArr, i10, c1377d);
                    int i30 = c1377d.f7027a;
                    if (i30 < 0) {
                        throw InvalidProtocolBufferException.m4152d();
                    }
                    if (i30 == 0) {
                        f0Var.add("");
                    } else {
                        int i31 = iM4411p16 + i30;
                        if (!u1.f7121a.m4418v(iM4411p16, i31, bArr)) {
                            throw InvalidProtocolBufferException.m4149a();
                        }
                        f0Var.add(new String(bArr, iM4411p16, i30, g0.f7037a));
                        iM4411p16 = i31;
                    }
                    while (iM4411p16 < i11) {
                        int iM4411p17 = t0.m4411p(bArr, iM4411p16, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return iM4411p16;
                        }
                        iM4411p16 = t0.m4411p(bArr, iM4411p17, c1377d);
                        int i32 = c1377d.f7027a;
                        if (i32 < 0) {
                            throw InvalidProtocolBufferException.m4152d();
                        }
                        if (i32 == 0) {
                            f0Var.add("");
                        } else {
                            int i33 = iM4411p16 + i32;
                            if (!u1.f7121a.m4418v(iM4411p16, i33, bArr)) {
                                throw InvalidProtocolBufferException.m4149a();
                            }
                            f0Var.add(new String(bArr, iM4411p16, i32, g0.f7037a));
                            iM4411p16 = i33;
                        }
                    }
                    return iM4411p16;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return t0.m4406j(m4444o(i15), i12, bArr, i10, i11, f0Var, c1377d);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int iM4411p18 = t0.m4411p(bArr, i10, c1377d);
                    int i34 = c1377d.f7027a;
                    if (i34 < 0) {
                        throw InvalidProtocolBufferException.m4152d();
                    }
                    if (i34 > bArr.length - iM4411p18) {
                        throw InvalidProtocolBufferException.m4154f();
                    }
                    if (i34 == 0) {
                        f0Var.add(AbstractC1382i.f7044b);
                    } else {
                        f0Var.add(AbstractC1382i.m4277c(iM4411p18, i34, bArr));
                        iM4411p18 += i34;
                    }
                    while (iM4411p18 < i11) {
                        int iM4411p19 = t0.m4411p(bArr, iM4411p18, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return iM4411p18;
                        }
                        iM4411p18 = t0.m4411p(bArr, iM4411p19, c1377d);
                        int i35 = c1377d.f7027a;
                        if (i35 < 0) {
                            throw InvalidProtocolBufferException.m4152d();
                        }
                        if (i35 > bArr.length - iM4411p18) {
                            throw InvalidProtocolBufferException.m4154f();
                        }
                        if (i35 == 0) {
                            f0Var.add(AbstractC1382i.f7044b);
                        } else {
                            f0Var.add(AbstractC1382i.m4277c(iM4411p18, i35, bArr));
                            iM4411p18 += i35;
                        }
                    }
                    return iM4411p18;
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iM4412q = t0.m4412q(i12, bArr, i10, i11, f0Var, c1377d);
                    }
                    return i10;
                }
                b0 b0Var4 = (b0) f0Var;
                iM4412q = t0.m4411p(bArr, i10, c1377d);
                int i36 = c1377d.f7027a + iM4412q;
                while (iM4412q < i36) {
                    iM4412q = t0.m4411p(bArr, iM4412q, c1377d);
                    b0Var4.m4168b(c1377d.f7027a);
                }
                if (iM4412q != i36) {
                    throw InvalidProtocolBufferException.m4154f();
                }
                a0 a0Var = (a0) obj;
                i1 i1Var = a0Var.unknownFields;
                if (i1Var == i1.f7048f) {
                    i1Var = null;
                }
                i1 i1Var2 = (i1) g1.m4270v(i13, f0Var, m4442m(i15), i1Var, this.f7119m);
                if (i1Var2 != null) {
                    a0Var.unknownFields = i1Var2;
                }
                return iM4412q;
            case BERTags.DATE_TIME /* 33 */:
            case 47:
                if (i14 == 2) {
                    b0 b0Var5 = (b0) f0Var;
                    int iM4411p20 = t0.m4411p(bArr, i10, c1377d);
                    int i37 = c1377d.f7027a + iM4411p20;
                    while (iM4411p20 < i37) {
                        iM4411p20 = t0.m4411p(bArr, iM4411p20, c1377d);
                        b0Var5.m4168b(AbstractC1384k.m4298a(c1377d.f7027a));
                    }
                    if (iM4411p20 == i37) {
                        return iM4411p20;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 0) {
                    b0 b0Var6 = (b0) f0Var;
                    int iM4411p21 = t0.m4411p(bArr, i10, c1377d);
                    b0Var6.m4168b(AbstractC1384k.m4298a(c1377d.f7027a));
                    while (iM4411p21 < i11) {
                        int iM4411p22 = t0.m4411p(bArr, iM4411p21, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return iM4411p21;
                        }
                        iM4411p21 = t0.m4411p(bArr, iM4411p22, c1377d);
                        b0Var6.m4168b(AbstractC1384k.m4298a(c1377d.f7027a));
                    }
                    return iM4411p21;
                }
                return i10;
            case BERTags.DURATION /* 34 */:
            case 48:
                if (i14 == 2) {
                    n0 n0Var5 = (n0) f0Var;
                    int iM4411p23 = t0.m4411p(bArr, i10, c1377d);
                    int i38 = c1377d.f7027a + iM4411p23;
                    while (iM4411p23 < i38) {
                        iM4411p23 = t0.m4413r(bArr, iM4411p23, c1377d);
                        n0Var5.m4349b(AbstractC1384k.m4299b(c1377d.f7028b));
                    }
                    if (iM4411p23 == i38) {
                        return iM4411p23;
                    }
                    throw InvalidProtocolBufferException.m4154f();
                }
                if (i14 == 0) {
                    n0 n0Var6 = (n0) f0Var;
                    int iM4413r3 = t0.m4413r(bArr, i10, c1377d);
                    n0Var6.m4349b(AbstractC1384k.m4299b(c1377d.f7028b));
                    while (iM4413r3 < i11) {
                        int iM4411p24 = t0.m4411p(bArr, iM4413r3, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return iM4413r3;
                        }
                        iM4413r3 = t0.m4413r(bArr, iM4411p24, c1377d);
                        n0Var6.m4349b(AbstractC1384k.m4299b(c1377d.f7028b));
                    }
                    return iM4413r3;
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    f1 f1VarM4444o = m4444o(i15);
                    int i39 = (i12 & (-8)) | 4;
                    int iM4404h = t0.m4404h(f1VarM4444o, bArr, i10, i11, i39, c1377d);
                    f1 f1Var = f1VarM4444o;
                    f0Var.add(c1377d.f7029c);
                    while (iM4404h < i11) {
                        int iM4411p25 = t0.m4411p(bArr, iM4404h, c1377d);
                        if (i12 != c1377d.f7027a) {
                            return iM4404h;
                        }
                        f1 f1Var2 = f1Var;
                        iM4404h = t0.m4404h(f1Var2, bArr, iM4411p25, i11, i39, c1377d);
                        f0Var.add(c1377d.f7029c);
                        f1Var = f1Var2;
                    }
                    return iM4404h;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* renamed from: I */
    public final void m4434I(Object obj, int i10, e1 e1Var) {
        if ((536870912 & i10) != 0) {
            r1.m4392o(obj, i10 & 1048575, e1Var.mo4186K());
        } else if (this.f7112f) {
            r1.m4392o(obj, i10 & 1048575, e1Var.mo4212y());
        } else {
            r1.m4392o(obj, i10 & 1048575, e1Var.mo4178C());
        }
    }

    /* renamed from: K */
    public final void m4435K(int i10, Object obj) {
        if (this.f7113g) {
            return;
        }
        int i11 = this.f7107a[i10 + 2];
        long j6 = i11 & 1048575;
        r1.m4390m(r1.f7095d.m4371g(j6, obj) | (1 << (i11 >>> 20)), j6, obj);
    }

    /* renamed from: L */
    public final void m4436L(int i10, Object obj, int i11) {
        r1.m4390m(i10, this.f7107a[i11 + 2] & 1048575, obj);
    }

    /* renamed from: M */
    public final int m4437M(int i10, int i11) {
        int[] iArr = this.f7107a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    /* renamed from: O */
    public final int m4438O(int i10) {
        return this.f7107a[i10 + 1];
    }

    /* renamed from: P */
    public final void m4439P(Object obj, C1387n c1387n) throws CodedOutputStream$OutOfSpaceException {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        int[] iArr = this.f7107a;
        int length = iArr.length;
        Unsafe unsafe = f7106p;
        int i14 = -1;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16 = i13 + 3) {
            int iM4438O = m4438O(i16);
            int i17 = iArr[i16];
            int iM4423N = m4423N(iM4438O);
            if (this.f7113g || iM4423N > 17) {
                i10 = i16;
                i11 = 1048575;
                i12 = 0;
            } else {
                int i18 = iArr[i16 + 2];
                i11 = 1048575;
                int i19 = i18 & 1048575;
                i10 = i16;
                if (i19 != i14) {
                    i15 = unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i12 = 1 << (i18 >>> 20);
            }
            long j6 = iM4438O & i11;
            switch (iM4423N) {
                case 0:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4334c(r1.f7095d.mo4357e(j6, obj), i17);
                    }
                case 1:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4338g(r1.f7095d.mo4358f(j6, obj), i17);
                    }
                case 2:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4341j(i17, unsafe.getLong(obj, j6));
                    }
                case 3:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4348q(i17, unsafe.getLong(obj, j6));
                    }
                case 4:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4340i(i17, unsafe.getInt(obj, j6));
                    }
                case 5:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4337f(i17, unsafe.getLong(obj, j6));
                    }
                case 6:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4336e(i17, unsafe.getInt(obj, j6));
                    }
                case 7:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4332a(i17, r1.f7095d.mo4355c(j6, obj));
                    }
                case 8:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        m4424Q(i17, unsafe.getObject(obj, j6), c1387n);
                    }
                case 9:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4342k(i17, unsafe.getObject(obj, j6), m4444o(i13));
                    }
                case 10:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4333b(i17, (AbstractC1382i) unsafe.getObject(obj, j6));
                    }
                case 11:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4347p(i17, unsafe.getInt(obj, j6));
                    }
                case 12:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4335d(i17, unsafe.getInt(obj, j6));
                    }
                case 13:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4343l(i17, unsafe.getInt(obj, j6));
                    }
                case 14:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4344m(i17, unsafe.getLong(obj, j6));
                    }
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4345n(i17, unsafe.getInt(obj, j6));
                    }
                case 16:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4346o(i17, unsafe.getLong(obj, j6));
                    }
                case 17:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        c1387n.m4339h(i17, unsafe.getObject(obj, j6), m4444o(i13));
                    }
                case 18:
                    i13 = i10;
                    g1.m4233C(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 19:
                    i13 = i10;
                    g1.m4237G(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 20:
                    i13 = i10;
                    g1.m4240J(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 21:
                    i13 = i10;
                    g1.m4248R(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 22:
                    i13 = i10;
                    g1.m4239I(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 23:
                    i13 = i10;
                    g1.m4236F(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 24:
                    i13 = i10;
                    g1.m4235E(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 25:
                    i13 = i10;
                    g1.m4231A(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 26:
                    i13 = i10;
                    g1.m4246P(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n);
                case 27:
                    i13 = i10;
                    g1.m4241K(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, m4444o(i13));
                case 28:
                    i13 = i10;
                    g1.m4232B(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n);
                case 29:
                    i13 = i10;
                    z6 = false;
                    g1.m4247Q(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 30:
                    i13 = i10;
                    z6 = false;
                    g1.m4234D(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case BERTags.DATE /* 31 */:
                    i13 = i10;
                    z6 = false;
                    g1.m4242L(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case 32:
                    i13 = i10;
                    z6 = false;
                    g1.m4243M(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case BERTags.DATE_TIME /* 33 */:
                    i13 = i10;
                    z6 = false;
                    g1.m4244N(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case BERTags.DURATION /* 34 */:
                    i13 = i10;
                    z6 = false;
                    g1.m4245O(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, false);
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    i13 = i10;
                    g1.m4233C(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    i13 = i10;
                    g1.m4237G(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 37:
                    i13 = i10;
                    g1.m4240J(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 38:
                    i13 = i10;
                    g1.m4248R(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 39:
                    i13 = i10;
                    g1.m4239I(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    i13 = i10;
                    g1.m4236F(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 41:
                    i13 = i10;
                    g1.m4235E(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 42:
                    i13 = i10;
                    g1.m4231A(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 43:
                    i13 = i10;
                    g1.m4247Q(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 44:
                    i13 = i10;
                    g1.m4234D(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 45:
                    i13 = i10;
                    g1.m4242L(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 46:
                    i13 = i10;
                    g1.m4243M(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 47:
                    i13 = i10;
                    g1.m4244N(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 48:
                    i13 = i10;
                    g1.m4245O(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, true);
                case 49:
                    i13 = i10;
                    g1.m4238H(iArr[i13], (List) unsafe.getObject(obj, j6), c1387n, m4444o(i13));
                case 50:
                    i13 = i10;
                    if (unsafe.getObject(obj, j6) != null) {
                        Object objM4443n = m4443n(i13);
                        this.f7120n.getClass();
                        AbstractC1452a.m4578y(objM4443n);
                        throw null;
                    }
                case 51:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4334c(((Double) r1.f7095d.m4373i(j6, obj)).doubleValue(), i17);
                    }
                case 52:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4338g(((Float) r1.f7095d.m4373i(j6, obj)).floatValue(), i17);
                    }
                case 53:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4341j(i17, m4421C(j6, obj));
                    }
                case 54:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4348q(i17, m4421C(j6, obj));
                    }
                case 55:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4340i(i17, m4420B(j6, obj));
                    }
                case 56:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4337f(i17, m4421C(j6, obj));
                    }
                case 57:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4336e(i17, m4420B(j6, obj));
                    }
                case 58:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4332a(i17, ((Boolean) r1.f7095d.m4373i(j6, obj)).booleanValue());
                    }
                case 59:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        m4424Q(i17, unsafe.getObject(obj, j6), c1387n);
                    }
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4342k(i17, unsafe.getObject(obj, j6), m4444o(i13));
                    }
                case 61:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4333b(i17, (AbstractC1382i) unsafe.getObject(obj, j6));
                    }
                case 62:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4347p(i17, m4420B(j6, obj));
                    }
                case 63:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4335d(i17, m4420B(j6, obj));
                    }
                case 64:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4343l(i17, m4420B(j6, obj));
                    }
                case 65:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4344m(i17, m4421C(j6, obj));
                    }
                case 66:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4345n(i17, m4420B(j6, obj));
                    }
                case 67:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4346o(i17, m4421C(j6, obj));
                    }
                case 68:
                    i13 = i10;
                    if (m4448t(i17, obj, i13)) {
                        c1387n.m4339h(i17, unsafe.getObject(obj, j6), m4444o(i13));
                    }
                default:
                    i13 = i10;
            }
        }
        ((j1) this.f7119m).getClass();
        ((a0) obj).unknownFields.m4286d(c1387n);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: a */
    public final void mo4214a(Object obj) {
        int[] iArr;
        int i10;
        int i11 = this.f7115i;
        while (true) {
            iArr = this.f7114h;
            i10 = this.f7116j;
            if (i11 >= i10) {
                break;
            }
            long jM4438O = m4438O(iArr[i11]) & 1048575;
            Object objM4373i = r1.f7095d.m4373i(jM4438O, obj);
            if (objM4373i != null) {
                this.f7120n.getClass();
                ((p0) objM4373i).f7086a = false;
                r1.m4392o(obj, jM4438O, objM4373i);
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f7118l.mo4301a(iArr[i10], obj);
            i10++;
        }
        ((j1) this.f7119m).getClass();
        ((a0) obj).unknownFields.f7053e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4215b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.mo4215b(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: c */
    public final Object mo4216c() {
        this.f7117k.getClass();
        return ((a0) this.f7111e).mo4165f(EnumC1399z.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4217d(com.google.crypto.tink.shaded.protobuf.a0 r12, com.google.crypto.tink.shaded.protobuf.a0 r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.mo4217d(com.google.crypto.tink.shaded.protobuf.a0, com.google.crypto.tink.shaded.protobuf.a0):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: e */
    public final void mo4218e(Object obj, C1387n c1387n) throws CodedOutputStream$OutOfSpaceException {
        c1387n.getClass();
        v1 v1Var = v1.ASCENDING;
        v1 v1Var2 = v1.DESCENDING;
        q0 q0Var = this.f7120n;
        int[] iArr = this.f7107a;
        h1 h1Var = this.f7119m;
        if (v1Var == v1Var2) {
            ((j1) h1Var).getClass();
            ((a0) obj).unknownFields.m4286d(c1387n);
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int iM4438O = m4438O(length);
                int i10 = iArr[length];
                switch (m4423N(iM4438O)) {
                    case 0:
                        if (m4447s(length, obj)) {
                            c1387n.m4334c(r1.f7095d.mo4357e(iM4438O & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m4447s(length, obj)) {
                            c1387n.m4338g(r1.f7095d.mo4358f(iM4438O & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m4447s(length, obj)) {
                            c1387n.m4341j(i10, r1.f7095d.m4372h(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m4447s(length, obj)) {
                            c1387n.m4348q(i10, r1.f7095d.m4372h(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m4447s(length, obj)) {
                            c1387n.m4340i(i10, r1.f7095d.m4371g(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m4447s(length, obj)) {
                            c1387n.m4337f(i10, r1.f7095d.m4372h(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m4447s(length, obj)) {
                            c1387n.m4336e(i10, r1.f7095d.m4371g(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m4447s(length, obj)) {
                            c1387n.m4332a(i10, r1.f7095d.mo4355c(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m4447s(length, obj)) {
                            m4424Q(i10, r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m4447s(length, obj)) {
                            c1387n.m4342k(i10, r1.f7095d.m4373i(iM4438O & 1048575, obj), m4444o(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m4447s(length, obj)) {
                            c1387n.m4333b(i10, (AbstractC1382i) r1.f7095d.m4373i(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m4447s(length, obj)) {
                            c1387n.m4347p(i10, r1.f7095d.m4371g(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m4447s(length, obj)) {
                            c1387n.m4335d(i10, r1.f7095d.m4371g(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m4447s(length, obj)) {
                            c1387n.m4343l(i10, r1.f7095d.m4371g(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m4447s(length, obj)) {
                            c1387n.m4344m(i10, r1.f7095d.m4372h(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        if (m4447s(length, obj)) {
                            c1387n.m4345n(i10, r1.f7095d.m4371g(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m4447s(length, obj)) {
                            c1387n.m4346o(i10, r1.f7095d.m4372h(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m4447s(length, obj)) {
                            c1387n.m4339h(i10, r1.f7095d.m4373i(iM4438O & 1048575, obj), m4444o(length));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        g1.m4233C(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 19:
                        g1.m4237G(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 20:
                        g1.m4240J(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 21:
                        g1.m4248R(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 22:
                        g1.m4239I(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 23:
                        g1.m4236F(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 24:
                        g1.m4235E(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 25:
                        g1.m4231A(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 26:
                        g1.m4246P(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n);
                        break;
                    case 27:
                        g1.m4241K(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, m4444o(length));
                        break;
                    case 28:
                        g1.m4232B(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n);
                        break;
                    case 29:
                        g1.m4247Q(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 30:
                        g1.m4234D(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case BERTags.DATE /* 31 */:
                        g1.m4242L(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case 32:
                        g1.m4243M(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case BERTags.DATE_TIME /* 33 */:
                        g1.m4244N(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case BERTags.DURATION /* 34 */:
                        g1.m4245O(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, false);
                        break;
                    case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                        g1.m4233C(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case BERTags.RELATIVE_OID_IRI /* 36 */:
                        g1.m4237G(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 37:
                        g1.m4240J(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 38:
                        g1.m4248R(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 39:
                        g1.m4239I(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                        g1.m4236F(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 41:
                        g1.m4235E(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 42:
                        g1.m4231A(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 43:
                        g1.m4247Q(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 44:
                        g1.m4234D(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 45:
                        g1.m4242L(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 46:
                        g1.m4243M(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 47:
                        g1.m4244N(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 48:
                        g1.m4245O(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, true);
                        break;
                    case 49:
                        g1.m4238H(iArr[length], (List) r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n, m4444o(length));
                        break;
                    case 50:
                        if (r1.f7095d.m4373i(iM4438O & 1048575, obj) != null) {
                            Object objM4443n = m4443n(length);
                            q0Var.getClass();
                            AbstractC1452a.m4578y(objM4443n);
                            throw null;
                        }
                        break;
                    case 51:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4334c(((Double) r1.f7095d.m4373i(iM4438O & 1048575, obj)).doubleValue(), i10);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4338g(((Float) r1.f7095d.m4373i(iM4438O & 1048575, obj)).floatValue(), i10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4341j(i10, m4421C(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4348q(i10, m4421C(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4340i(i10, m4420B(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4337f(i10, m4421C(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4336e(i10, m4420B(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4332a(i10, ((Boolean) r1.f7095d.m4373i(iM4438O & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m4448t(i10, obj, length)) {
                            m4424Q(i10, r1.f7095d.m4373i(iM4438O & 1048575, obj), c1387n);
                            break;
                        } else {
                            break;
                        }
                    case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4342k(i10, r1.f7095d.m4373i(iM4438O & 1048575, obj), m4444o(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4333b(i10, (AbstractC1382i) r1.f7095d.m4373i(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4347p(i10, m4420B(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4335d(i10, m4420B(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4343l(i10, m4420B(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4344m(i10, m4421C(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4345n(i10, m4420B(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4346o(i10, m4421C(iM4438O & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m4448t(i10, obj, length)) {
                            c1387n.m4339h(i10, r1.f7095d.m4373i(iM4438O & 1048575, obj), m4444o(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return;
        }
        if (!this.f7113g) {
            m4439P(obj, c1387n);
            return;
        }
        int length2 = iArr.length;
        for (int i11 = 0; i11 < length2; i11 += 3) {
            int iM4438O2 = m4438O(i11);
            int i12 = iArr[i11];
            switch (m4423N(iM4438O2)) {
                case 0:
                    if (m4447s(i11, obj)) {
                        c1387n.m4334c(r1.f7095d.mo4357e(iM4438O2 & 1048575, obj), i12);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m4447s(i11, obj)) {
                        c1387n.m4338g(r1.f7095d.mo4358f(iM4438O2 & 1048575, obj), i12);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m4447s(i11, obj)) {
                        c1387n.m4341j(i12, r1.f7095d.m4372h(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m4447s(i11, obj)) {
                        c1387n.m4348q(i12, r1.f7095d.m4372h(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m4447s(i11, obj)) {
                        c1387n.m4340i(i12, r1.f7095d.m4371g(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m4447s(i11, obj)) {
                        c1387n.m4337f(i12, r1.f7095d.m4372h(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m4447s(i11, obj)) {
                        c1387n.m4336e(i12, r1.f7095d.m4371g(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m4447s(i11, obj)) {
                        c1387n.m4332a(i12, r1.f7095d.mo4355c(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m4447s(i11, obj)) {
                        m4424Q(i12, r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m4447s(i11, obj)) {
                        c1387n.m4342k(i12, r1.f7095d.m4373i(iM4438O2 & 1048575, obj), m4444o(i11));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m4447s(i11, obj)) {
                        c1387n.m4333b(i12, (AbstractC1382i) r1.f7095d.m4373i(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m4447s(i11, obj)) {
                        c1387n.m4347p(i12, r1.f7095d.m4371g(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m4447s(i11, obj)) {
                        c1387n.m4335d(i12, r1.f7095d.m4371g(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m4447s(i11, obj)) {
                        c1387n.m4343l(i12, r1.f7095d.m4371g(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m4447s(i11, obj)) {
                        c1387n.m4344m(i12, r1.f7095d.m4372h(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (m4447s(i11, obj)) {
                        c1387n.m4345n(i12, r1.f7095d.m4371g(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m4447s(i11, obj)) {
                        c1387n.m4346o(i12, r1.f7095d.m4372h(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m4447s(i11, obj)) {
                        c1387n.m4339h(i12, r1.f7095d.m4373i(iM4438O2 & 1048575, obj), m4444o(i11));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    g1.m4233C(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 19:
                    g1.m4237G(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 20:
                    g1.m4240J(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 21:
                    g1.m4248R(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 22:
                    g1.m4239I(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 23:
                    g1.m4236F(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 24:
                    g1.m4235E(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 25:
                    g1.m4231A(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 26:
                    g1.m4246P(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n);
                    break;
                case 27:
                    g1.m4241K(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, m4444o(i11));
                    break;
                case 28:
                    g1.m4232B(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n);
                    break;
                case 29:
                    g1.m4247Q(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 30:
                    g1.m4234D(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case BERTags.DATE /* 31 */:
                    g1.m4242L(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case 32:
                    g1.m4243M(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    g1.m4244N(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case BERTags.DURATION /* 34 */:
                    g1.m4245O(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, false);
                    break;
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    g1.m4233C(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    g1.m4237G(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 37:
                    g1.m4240J(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 38:
                    g1.m4248R(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 39:
                    g1.m4239I(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    g1.m4236F(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 41:
                    g1.m4235E(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 42:
                    g1.m4231A(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 43:
                    g1.m4247Q(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 44:
                    g1.m4234D(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 45:
                    g1.m4242L(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 46:
                    g1.m4243M(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 47:
                    g1.m4244N(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 48:
                    g1.m4245O(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, true);
                    break;
                case 49:
                    g1.m4238H(iArr[i11], (List) r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n, m4444o(i11));
                    break;
                case 50:
                    if (r1.f7095d.m4373i(iM4438O2 & 1048575, obj) != null) {
                        Object objM4443n2 = m4443n(i11);
                        q0Var.getClass();
                        AbstractC1452a.m4578y(objM4443n2);
                        throw null;
                    }
                    break;
                case 51:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4334c(((Double) r1.f7095d.m4373i(iM4438O2 & 1048575, obj)).doubleValue(), i12);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4338g(((Float) r1.f7095d.m4373i(iM4438O2 & 1048575, obj)).floatValue(), i12);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4341j(i12, m4421C(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4348q(i12, m4421C(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4340i(i12, m4420B(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4337f(i12, m4421C(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4336e(i12, m4420B(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4332a(i12, ((Boolean) r1.f7095d.m4373i(iM4438O2 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m4448t(i12, obj, i11)) {
                        m4424Q(i12, r1.f7095d.m4373i(iM4438O2 & 1048575, obj), c1387n);
                        break;
                    } else {
                        break;
                    }
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4342k(i12, r1.f7095d.m4373i(iM4438O2 & 1048575, obj), m4444o(i11));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4333b(i12, (AbstractC1382i) r1.f7095d.m4373i(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4347p(i12, m4420B(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4335d(i12, m4420B(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4343l(i12, m4420B(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4344m(i12, m4421C(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4345n(i12, m4420B(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4346o(i12, m4421C(iM4438O2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m4448t(i12, obj, i11)) {
                        c1387n.m4339h(i12, r1.f7095d.m4373i(iM4438O2 & 1048575, obj), m4444o(i11));
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((j1) h1Var).getClass();
        ((a0) obj).unknownFields.m4286d(c1387n);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4219f(com.google.crypto.tink.shaded.protobuf.a0 r12) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.mo4219f(com.google.crypto.tink.shaded.protobuf.a0):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: g */
    public final void mo4220g(Object obj, byte[] bArr, int i10, int i11, C1377d c1377d) throws InvalidProtocolBufferException {
        if (this.f7113g) {
            m4432G(obj, bArr, i10, i11, c1377d);
        } else {
            m4431F(obj, bArr, i10, i11, 0, c1377d);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:227|54)|(7:59|45|46|177|195|237|236)|61|223|62|63|177|195|237|236) */
    /* JADX WARN: Code restructure failed: missing block: B:247:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        ((com.google.crypto.tink.shaded.protobuf.a0) r20).unknownFields = (com.google.crypto.tink.shaded.protobuf.i1) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06c3 A[Catch: all -> 0x0510, TryCatch #4 {all -> 0x0510, blocks: (B:181:0x06be, B:183:0x06c3, B:185:0x06ca, B:187:0x06d1, B:143:0x0504, B:148:0x051a, B:149:0x0530, B:150:0x0546, B:151:0x055c, B:153:0x056c, B:156:0x0573, B:157:0x057a, B:158:0x0586, B:159:0x059c, B:160:0x05b2, B:162:0x05be, B:163:0x05dd, B:164:0x05f1, B:165:0x05ff, B:166:0x0617, B:167:0x062d, B:168:0x0643, B:169:0x0658, B:170:0x066d, B:171:0x0682, B:172:0x0699, B:174:0x06a5, B:176:0x06aa), top: B:211:0x06be }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06f7 A[LOOP:3: B:198:0x06f5->B:199:0x06f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06d7 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4221h(java.lang.Object r20, com.google.crypto.tink.shaded.protobuf.e1 r21, com.google.crypto.tink.shaded.protobuf.C1390q r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.mo4221h(java.lang.Object, com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.q):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: i */
    public final int mo4222i(AbstractC1374a abstractC1374a) {
        return this.f7113g ? m4446r(abstractC1374a) : m4445q(abstractC1374a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4223j(com.google.crypto.tink.shaded.protobuf.a0 r11, com.google.crypto.tink.shaded.protobuf.a0 r12) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.mo4223j(com.google.crypto.tink.shaded.protobuf.a0, com.google.crypto.tink.shaded.protobuf.a0):void");
    }

    /* renamed from: k */
    public final boolean m4440k(a0 a0Var, Object obj, int i10) {
        return m4447s(i10, a0Var) == m4447s(i10, obj);
    }

    /* renamed from: l */
    public final void m4441l(int i10, Object obj, Object obj2) {
        int i11 = this.f7107a[i10];
        Object objM4373i = r1.f7095d.m4373i(m4438O(i10) & 1048575, obj);
        if (objM4373i == null || m4442m(i10) == null) {
            return;
        }
        this.f7120n.getClass();
        AbstractC1452a.m4578y(m4443n(i10));
        throw null;
    }

    /* renamed from: m */
    public final e0 m4442m(int i10) {
        return (e0) this.f7108b[((i10 / 3) * 2) + 1];
    }

    /* renamed from: n */
    public final Object m4443n(int i10) {
        return this.f7108b[(i10 / 3) * 2];
    }

    /* renamed from: o */
    public final f1 m4444o(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f7108b;
        f1 f1Var = (f1) objArr[i11];
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1VarM4170a = b1.f7019c.m4170a((Class) objArr[i11 + 1]);
        objArr[i11] = f1VarM4170a;
        return f1VarM4170a;
    }

    /* renamed from: q */
    public final int m4445q(Object obj) {
        int i10;
        int iM4317G;
        int iM4319I;
        int iM4317G2;
        int iM4315E;
        int iM4313C;
        int iM4317G3;
        int iM4316F;
        int iM109D;
        int iM4317G4;
        int iM4314D;
        Unsafe unsafe = f7106p;
        int i11 = -1;
        int i12 = 0;
        int iM107B = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f7107a;
            if (i12 >= iArr.length) {
                ((j1) this.f7119m).getClass();
                return ((a0) obj).unknownFields.m4284a() + iM107B;
            }
            int iM4438O = m4438O(i12);
            int i14 = iArr[i12];
            int iM4423N = m4423N(iM4438O);
            if (iM4423N <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & 1048575;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i13 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            long j6 = iM4438O & 1048575;
            switch (iM4423N) {
                case 0:
                    if ((i13 & i10) != 0) {
                        iM107B = AbstractC0030c.m107B(i14, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i10 & i13) != 0) {
                        iM107B = AbstractC0030c.m107B(i14, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i13 & i10) != 0) {
                        long j10 = unsafe.getLong(obj, j6);
                        iM4317G = C1386m.m4317G(i14);
                        iM4319I = C1386m.m4319I(j10);
                        iM4317G4 = iM4319I + iM4317G;
                        iM107B += iM4317G4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i13 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j6);
                        iM4317G = C1386m.m4317G(i14);
                        iM4319I = C1386m.m4319I(j11);
                        iM4317G4 = iM4319I + iM4317G;
                        iM107B += iM4317G4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i13 & i10) != 0) {
                        int i17 = unsafe.getInt(obj, j6);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4315E(i17);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i10) != 0) {
                        iM4313C = C1386m.m4313C(i14);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i10) != 0) {
                        iM4313C = C1386m.m4312B(i14);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i13 & i10) != 0) {
                        iM107B = AbstractC0030c.m107B(i14, 1, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i13 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof AbstractC1382i) {
                            int iM4317G5 = C1386m.m4317G(i14);
                            int size = ((AbstractC1382i) object).size();
                            iM109D = AbstractC0030c.m109D(size, size, iM4317G5, iM107B);
                            iM107B = iM109D;
                            break;
                        } else {
                            iM4317G3 = C1386m.m4317G(i14);
                            iM4316F = C1386m.m4316F((String) object);
                            iM109D = iM4316F + iM4317G3 + iM107B;
                            iM107B = iM109D;
                        }
                    }
                case 9:
                    if ((i13 & i10) != 0) {
                        Object object2 = unsafe.getObject(obj, j6);
                        f1 f1VarM4444o = m4444o(i12);
                        Class cls = g1.f7039a;
                        AbstractC1374a abstractC1374a = (AbstractC1374a) object2;
                        int iM4317G6 = C1386m.m4317G(i14);
                        abstractC1374a.getClass();
                        a0 a0Var = (a0) abstractC1374a;
                        int iMo4222i = a0Var.memoizedSerializedSize;
                        if (iMo4222i == -1) {
                            iMo4222i = f1VarM4444o.mo4222i(abstractC1374a);
                            a0Var.memoizedSerializedSize = iMo4222i;
                        }
                        iM107B = AbstractC0030c.m109D(iMo4222i, iMo4222i, iM4317G6, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i13 & i10) != 0) {
                        iM4313C = C1386m.m4320z(i14, (AbstractC1382i) unsafe.getObject(obj, j6));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i13 & i10) != 0) {
                        int i18 = unsafe.getInt(obj, j6);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4318H(i18);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i13 & i10) != 0) {
                        int i19 = unsafe.getInt(obj, j6);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4315E(i19);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i10 & i13) != 0) {
                        iM107B = AbstractC0030c.m107B(i14, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i10) != 0) {
                        iM107B = AbstractC0030c.m107B(i14, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if ((i13 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j6);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4318H((i20 >> 31) ^ (i20 << 1));
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i13 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j6);
                        iM4317G = C1386m.m4317G(i14);
                        iM4319I = C1386m.m4319I((j12 >> 63) ^ (j12 << 1));
                        iM4317G4 = iM4319I + iM4317G;
                        iM107B += iM4317G4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i13 & i10) != 0) {
                        iM4313C = C1386m.m4314D(i14, (AbstractC1374a) unsafe.getObject(obj, j6), m4444o(i12));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iM4313C = g1.m4254f((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 19:
                    iM4313C = g1.m4252d((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 20:
                    iM4313C = g1.m4258j((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 21:
                    iM4313C = g1.m4268t((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 22:
                    iM4313C = g1.m4256h((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 23:
                    iM4313C = g1.m4254f((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 24:
                    iM4313C = g1.m4252d((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j6);
                    Class cls2 = g1.f7039a;
                    int size2 = list.size();
                    iM4317G4 = size2 == 0 ? 0 : (C1386m.m4317G(i14) + 1) * size2;
                    iM107B += iM4317G4;
                    break;
                case 26:
                    iM4313C = g1.m4265q((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 27:
                    iM4313C = g1.m4260l(i14, (List) unsafe.getObject(obj, j6), m4444o(i12));
                    iM107B += iM4313C;
                    break;
                case 28:
                    iM4313C = g1.m4249a((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 29:
                    iM4313C = g1.m4266r((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 30:
                    iM4313C = g1.m4250b((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case BERTags.DATE /* 31 */:
                    iM4313C = g1.m4252d((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case 32:
                    iM4313C = g1.m4254f((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    iM4313C = g1.m4261m((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case BERTags.DURATION /* 34 */:
                    iM4313C = g1.m4263o((List) unsafe.getObject(obj, j6), i14);
                    iM107B += iM4313C;
                    break;
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    int iM4255g = g1.m4255g((List) unsafe.getObject(obj, j6));
                    if (iM4255g > 0) {
                        iM107B = AbstractC0030c.m109D(iM4255g, C1386m.m4317G(i14), iM4255g, iM107B);
                        break;
                    } else {
                        break;
                    }
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    int iM4253e = g1.m4253e((List) unsafe.getObject(obj, j6));
                    if (iM4253e > 0) {
                        iM107B = AbstractC0030c.m109D(iM4253e, C1386m.m4317G(i14), iM4253e, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iM4259k = g1.m4259k((List) unsafe.getObject(obj, j6));
                    if (iM4259k > 0) {
                        iM107B = AbstractC0030c.m109D(iM4259k, C1386m.m4317G(i14), iM4259k, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iM4269u = g1.m4269u((List) unsafe.getObject(obj, j6));
                    if (iM4269u > 0) {
                        iM107B = AbstractC0030c.m109D(iM4269u, C1386m.m4317G(i14), iM4269u, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int iM4257i = g1.m4257i((List) unsafe.getObject(obj, j6));
                    if (iM4257i > 0) {
                        iM107B = AbstractC0030c.m109D(iM4257i, C1386m.m4317G(i14), iM4257i, iM107B);
                        break;
                    } else {
                        break;
                    }
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    int iM4255g2 = g1.m4255g((List) unsafe.getObject(obj, j6));
                    if (iM4255g2 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4255g2, C1386m.m4317G(i14), iM4255g2, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iM4253e2 = g1.m4253e((List) unsafe.getObject(obj, j6));
                    if (iM4253e2 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4253e2, C1386m.m4317G(i14), iM4253e2, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(obj, j6);
                    Class cls3 = g1.f7039a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iM107B = AbstractC0030c.m109D(size3, C1386m.m4317G(i14), size3, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iM4267s = g1.m4267s((List) unsafe.getObject(obj, j6));
                    if (iM4267s > 0) {
                        iM107B = AbstractC0030c.m109D(iM4267s, C1386m.m4317G(i14), iM4267s, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iM4251c = g1.m4251c((List) unsafe.getObject(obj, j6));
                    if (iM4251c > 0) {
                        iM107B = AbstractC0030c.m109D(iM4251c, C1386m.m4317G(i14), iM4251c, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iM4253e3 = g1.m4253e((List) unsafe.getObject(obj, j6));
                    if (iM4253e3 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4253e3, C1386m.m4317G(i14), iM4253e3, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iM4255g3 = g1.m4255g((List) unsafe.getObject(obj, j6));
                    if (iM4255g3 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4255g3, C1386m.m4317G(i14), iM4255g3, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iM4262n = g1.m4262n((List) unsafe.getObject(obj, j6));
                    if (iM4262n > 0) {
                        iM107B = AbstractC0030c.m109D(iM4262n, C1386m.m4317G(i14), iM4262n, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iM4264p = g1.m4264p((List) unsafe.getObject(obj, j6));
                    if (iM4264p > 0) {
                        iM107B = AbstractC0030c.m109D(iM4264p, C1386m.m4317G(i14), iM4264p, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(obj, j6);
                    f1 f1VarM4444o2 = m4444o(i12);
                    Class cls4 = g1.f7039a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iM4314D = 0;
                    } else {
                        iM4314D = 0;
                        for (int i21 = 0; i21 < size4; i21++) {
                            iM4314D += C1386m.m4314D(i14, (AbstractC1374a) list3.get(i21), f1VarM4444o2);
                        }
                    }
                    iM107B += iM4314D;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j6);
                    Object objM4443n = m4443n(i12);
                    this.f7120n.getClass();
                    q0.m4367a(object3, objM4443n);
                    break;
                case 51:
                    if (m4448t(i14, obj, i12)) {
                        iM107B = AbstractC0030c.m107B(i14, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m4448t(i14, obj, i12)) {
                        iM107B = AbstractC0030c.m107B(i14, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m4448t(i14, obj, i12)) {
                        long jM4421C = m4421C(j6, obj);
                        iM4317G = C1386m.m4317G(i14);
                        iM4319I = C1386m.m4319I(jM4421C);
                        iM4317G4 = iM4319I + iM4317G;
                        iM107B += iM4317G4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m4448t(i14, obj, i12)) {
                        long jM4421C2 = m4421C(j6, obj);
                        iM4317G = C1386m.m4317G(i14);
                        iM4319I = C1386m.m4319I(jM4421C2);
                        iM4317G4 = iM4319I + iM4317G;
                        iM107B += iM4317G4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m4448t(i14, obj, i12)) {
                        int iM4420B = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4315E(iM4420B);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m4448t(i14, obj, i12)) {
                        iM4313C = C1386m.m4313C(i14);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m4448t(i14, obj, i12)) {
                        iM4313C = C1386m.m4312B(i14);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m4448t(i14, obj, i12)) {
                        iM107B = AbstractC0030c.m107B(i14, 1, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m4448t(i14, obj, i12)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(obj, j6);
                        if (object4 instanceof AbstractC1382i) {
                            int iM4317G7 = C1386m.m4317G(i14);
                            int size5 = ((AbstractC1382i) object4).size();
                            iM109D = AbstractC0030c.m109D(size5, size5, iM4317G7, iM107B);
                            iM107B = iM109D;
                            break;
                        } else {
                            iM4317G3 = C1386m.m4317G(i14);
                            iM4316F = C1386m.m4316F((String) object4);
                            iM109D = iM4316F + iM4317G3 + iM107B;
                            iM107B = iM109D;
                        }
                    }
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    if (m4448t(i14, obj, i12)) {
                        Object object5 = unsafe.getObject(obj, j6);
                        f1 f1VarM4444o3 = m4444o(i12);
                        Class cls5 = g1.f7039a;
                        AbstractC1374a abstractC1374a2 = (AbstractC1374a) object5;
                        int iM4317G8 = C1386m.m4317G(i14);
                        abstractC1374a2.getClass();
                        a0 a0Var2 = (a0) abstractC1374a2;
                        int iMo4222i2 = a0Var2.memoizedSerializedSize;
                        if (iMo4222i2 == -1) {
                            iMo4222i2 = f1VarM4444o3.mo4222i(abstractC1374a2);
                            a0Var2.memoizedSerializedSize = iMo4222i2;
                        }
                        iM107B = AbstractC0030c.m109D(iMo4222i2, iMo4222i2, iM4317G8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m4448t(i14, obj, i12)) {
                        iM4313C = C1386m.m4320z(i14, (AbstractC1382i) unsafe.getObject(obj, j6));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m4448t(i14, obj, i12)) {
                        int iM4420B2 = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4318H(iM4420B2);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m4448t(i14, obj, i12)) {
                        int iM4420B3 = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4315E(iM4420B3);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m4448t(i14, obj, i12)) {
                        iM107B = AbstractC0030c.m107B(i14, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m4448t(i14, obj, i12)) {
                        iM107B = AbstractC0030c.m107B(i14, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m4448t(i14, obj, i12)) {
                        int iM4420B4 = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i14);
                        iM4315E = C1386m.m4318H((iM4420B4 >> 31) ^ (iM4420B4 << 1));
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m4448t(i14, obj, i12)) {
                        long jM4421C3 = m4421C(j6, obj);
                        iM4317G = C1386m.m4317G(i14);
                        iM4319I = C1386m.m4319I((jM4421C3 >> 63) ^ (jM4421C3 << 1));
                        iM4317G4 = iM4319I + iM4317G;
                        iM107B += iM4317G4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m4448t(i14, obj, i12)) {
                        iM4313C = C1386m.m4314D(i14, (AbstractC1374a) unsafe.getObject(obj, j6), m4444o(i12));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
        }
    }

    /* renamed from: r */
    public final int m4446r(Object obj) {
        int iM4317G;
        int iM4319I;
        int iM4317G2;
        int iM4315E;
        int iM4313C;
        int iM4317G3;
        int iM4316F;
        int iM4317G4;
        int iM4319I2;
        int iM4317G5;
        int iM4314D;
        Unsafe unsafe = f7106p;
        int i10 = 0;
        int iM107B = 0;
        while (true) {
            int[] iArr = this.f7107a;
            if (i10 >= iArr.length) {
                ((j1) this.f7119m).getClass();
                return ((a0) obj).unknownFields.m4284a() + iM107B;
            }
            int iM4438O = m4438O(i10);
            int iM4423N = m4423N(iM4438O);
            int i11 = iArr[i10];
            long j6 = iM4438O & 1048575;
            if (iM4423N >= EnumC1394u.DOUBLE_LIST_PACKED.id() && iM4423N <= EnumC1394u.SINT64_LIST_PACKED.id()) {
                int i12 = iArr[i10 + 2];
            }
            switch (iM4423N) {
                case 0:
                    if (m4447s(i10, obj)) {
                        iM107B = AbstractC0030c.m107B(i11, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m4447s(i10, obj)) {
                        iM107B = AbstractC0030c.m107B(i11, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m4447s(i10, obj)) {
                        long jM4372h = r1.f7095d.m4372h(j6, obj);
                        iM4317G = C1386m.m4317G(i11);
                        iM4319I = C1386m.m4319I(jM4372h);
                        iM4313C = iM4319I + iM4317G;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m4447s(i10, obj)) {
                        long jM4372h2 = r1.f7095d.m4372h(j6, obj);
                        iM4317G = C1386m.m4317G(i11);
                        iM4319I = C1386m.m4319I(jM4372h2);
                        iM4313C = iM4319I + iM4317G;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m4447s(i10, obj)) {
                        int iM4371g = r1.f7095d.m4371g(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4315E(iM4371g);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m4447s(i10, obj)) {
                        iM4313C = C1386m.m4313C(i11);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m4447s(i10, obj)) {
                        iM4313C = C1386m.m4312B(i11);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m4447s(i10, obj)) {
                        iM107B = AbstractC0030c.m107B(i11, 1, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m4447s(i10, obj)) {
                        Object objM4373i = r1.f7095d.m4373i(j6, obj);
                        if (objM4373i instanceof AbstractC1382i) {
                            int iM4317G6 = C1386m.m4317G(i11);
                            int size = ((AbstractC1382i) objM4373i).size();
                            iM107B = AbstractC0030c.m109D(size, size, iM4317G6, iM107B);
                            break;
                        } else {
                            iM4317G3 = C1386m.m4317G(i11);
                            iM4316F = C1386m.m4316F((String) objM4373i);
                            iM107B = iM4316F + iM4317G3 + iM107B;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (m4447s(i10, obj)) {
                        Object objM4373i2 = r1.f7095d.m4373i(j6, obj);
                        f1 f1VarM4444o = m4444o(i10);
                        Class cls = g1.f7039a;
                        AbstractC1374a abstractC1374a = (AbstractC1374a) objM4373i2;
                        int iM4317G7 = C1386m.m4317G(i11);
                        abstractC1374a.getClass();
                        a0 a0Var = (a0) abstractC1374a;
                        int iMo4222i = a0Var.memoizedSerializedSize;
                        if (iMo4222i == -1) {
                            iMo4222i = f1VarM4444o.mo4222i(abstractC1374a);
                            a0Var.memoizedSerializedSize = iMo4222i;
                        }
                        iM107B = AbstractC0030c.m109D(iMo4222i, iMo4222i, iM4317G7, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m4447s(i10, obj)) {
                        iM4313C = C1386m.m4320z(i11, (AbstractC1382i) r1.f7095d.m4373i(j6, obj));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m4447s(i10, obj)) {
                        int iM4371g2 = r1.f7095d.m4371g(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4318H(iM4371g2);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m4447s(i10, obj)) {
                        int iM4371g3 = r1.f7095d.m4371g(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4315E(iM4371g3);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m4447s(i10, obj)) {
                        iM107B = AbstractC0030c.m107B(i11, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m4447s(i10, obj)) {
                        iM107B = AbstractC0030c.m107B(i11, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (m4447s(i10, obj)) {
                        int iM4371g4 = r1.f7095d.m4371g(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4318H((iM4371g4 >> 31) ^ (iM4371g4 << 1));
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m4447s(i10, obj)) {
                        long jM4372h3 = r1.f7095d.m4372h(j6, obj);
                        iM4317G4 = C1386m.m4317G(i11);
                        iM4319I2 = C1386m.m4319I((jM4372h3 << 1) ^ (jM4372h3 >> 63));
                        iM4317G5 = iM4319I2 + iM4317G4;
                        iM107B += iM4317G5;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m4447s(i10, obj)) {
                        iM4313C = C1386m.m4314D(i11, (AbstractC1374a) r1.f7095d.m4373i(j6, obj), m4444o(i10));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iM4313C = g1.m4254f(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 19:
                    iM4313C = g1.m4252d(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 20:
                    iM4313C = g1.m4258j(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 21:
                    iM4313C = g1.m4268t(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 22:
                    iM4313C = g1.m4256h(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 23:
                    iM4313C = g1.m4254f(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 24:
                    iM4313C = g1.m4252d(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 25:
                    List listM4426u = m4426u(j6, obj);
                    Class cls2 = g1.f7039a;
                    int size2 = listM4426u.size();
                    iM4317G5 = size2 == 0 ? 0 : (C1386m.m4317G(i11) + 1) * size2;
                    iM107B += iM4317G5;
                    break;
                case 26:
                    iM4313C = g1.m4265q(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 27:
                    iM4313C = g1.m4260l(i11, m4426u(j6, obj), m4444o(i10));
                    iM107B += iM4313C;
                    break;
                case 28:
                    iM4313C = g1.m4249a(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 29:
                    iM4313C = g1.m4266r(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 30:
                    iM4313C = g1.m4250b(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case BERTags.DATE /* 31 */:
                    iM4313C = g1.m4252d(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case 32:
                    iM4313C = g1.m4254f(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    iM4313C = g1.m4261m(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case BERTags.DURATION /* 34 */:
                    iM4313C = g1.m4263o(m4426u(j6, obj), i11);
                    iM107B += iM4313C;
                    break;
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    int iM4255g = g1.m4255g((List) unsafe.getObject(obj, j6));
                    if (iM4255g > 0) {
                        iM107B = AbstractC0030c.m109D(iM4255g, C1386m.m4317G(i11), iM4255g, iM107B);
                        break;
                    } else {
                        break;
                    }
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    int iM4253e = g1.m4253e((List) unsafe.getObject(obj, j6));
                    if (iM4253e > 0) {
                        iM107B = AbstractC0030c.m109D(iM4253e, C1386m.m4317G(i11), iM4253e, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iM4259k = g1.m4259k((List) unsafe.getObject(obj, j6));
                    if (iM4259k > 0) {
                        iM107B = AbstractC0030c.m109D(iM4259k, C1386m.m4317G(i11), iM4259k, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iM4269u = g1.m4269u((List) unsafe.getObject(obj, j6));
                    if (iM4269u > 0) {
                        iM107B = AbstractC0030c.m109D(iM4269u, C1386m.m4317G(i11), iM4269u, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int iM4257i = g1.m4257i((List) unsafe.getObject(obj, j6));
                    if (iM4257i > 0) {
                        iM107B = AbstractC0030c.m109D(iM4257i, C1386m.m4317G(i11), iM4257i, iM107B);
                        break;
                    } else {
                        break;
                    }
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    int iM4255g2 = g1.m4255g((List) unsafe.getObject(obj, j6));
                    if (iM4255g2 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4255g2, C1386m.m4317G(i11), iM4255g2, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iM4253e2 = g1.m4253e((List) unsafe.getObject(obj, j6));
                    if (iM4253e2 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4253e2, C1386m.m4317G(i11), iM4253e2, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j6);
                    Class cls3 = g1.f7039a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iM107B = AbstractC0030c.m109D(size3, C1386m.m4317G(i11), size3, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iM4267s = g1.m4267s((List) unsafe.getObject(obj, j6));
                    if (iM4267s > 0) {
                        iM107B = AbstractC0030c.m109D(iM4267s, C1386m.m4317G(i11), iM4267s, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iM4251c = g1.m4251c((List) unsafe.getObject(obj, j6));
                    if (iM4251c > 0) {
                        iM107B = AbstractC0030c.m109D(iM4251c, C1386m.m4317G(i11), iM4251c, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iM4253e3 = g1.m4253e((List) unsafe.getObject(obj, j6));
                    if (iM4253e3 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4253e3, C1386m.m4317G(i11), iM4253e3, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iM4255g3 = g1.m4255g((List) unsafe.getObject(obj, j6));
                    if (iM4255g3 > 0) {
                        iM107B = AbstractC0030c.m109D(iM4255g3, C1386m.m4317G(i11), iM4255g3, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iM4262n = g1.m4262n((List) unsafe.getObject(obj, j6));
                    if (iM4262n > 0) {
                        iM107B = AbstractC0030c.m109D(iM4262n, C1386m.m4317G(i11), iM4262n, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iM4264p = g1.m4264p((List) unsafe.getObject(obj, j6));
                    if (iM4264p > 0) {
                        iM107B = AbstractC0030c.m109D(iM4264p, C1386m.m4317G(i11), iM4264p, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List listM4426u2 = m4426u(j6, obj);
                    f1 f1VarM4444o2 = m4444o(i10);
                    Class cls4 = g1.f7039a;
                    int size4 = listM4426u2.size();
                    if (size4 == 0) {
                        iM4314D = 0;
                    } else {
                        iM4314D = 0;
                        for (int i13 = 0; i13 < size4; i13++) {
                            iM4314D += C1386m.m4314D(i11, (AbstractC1374a) listM4426u2.get(i13), f1VarM4444o2);
                        }
                    }
                    iM107B += iM4314D;
                    break;
                case 50:
                    Object objM4373i3 = r1.f7095d.m4373i(j6, obj);
                    Object objM4443n = m4443n(i10);
                    this.f7120n.getClass();
                    q0.m4367a(objM4373i3, objM4443n);
                    break;
                case 51:
                    if (m4448t(i11, obj, i10)) {
                        iM107B = AbstractC0030c.m107B(i11, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m4448t(i11, obj, i10)) {
                        iM107B = AbstractC0030c.m107B(i11, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m4448t(i11, obj, i10)) {
                        long jM4421C = m4421C(j6, obj);
                        iM4317G = C1386m.m4317G(i11);
                        iM4319I = C1386m.m4319I(jM4421C);
                        iM4313C = iM4319I + iM4317G;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m4448t(i11, obj, i10)) {
                        long jM4421C2 = m4421C(j6, obj);
                        iM4317G = C1386m.m4317G(i11);
                        iM4319I = C1386m.m4319I(jM4421C2);
                        iM4313C = iM4319I + iM4317G;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m4448t(i11, obj, i10)) {
                        int iM4420B = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4315E(iM4420B);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m4448t(i11, obj, i10)) {
                        iM4313C = C1386m.m4313C(i11);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m4448t(i11, obj, i10)) {
                        iM4313C = C1386m.m4312B(i11);
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m4448t(i11, obj, i10)) {
                        iM107B = AbstractC0030c.m107B(i11, 1, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m4448t(i11, obj, i10)) {
                        Object objM4373i4 = r1.f7095d.m4373i(j6, obj);
                        if (objM4373i4 instanceof AbstractC1382i) {
                            int iM4317G8 = C1386m.m4317G(i11);
                            int size5 = ((AbstractC1382i) objM4373i4).size();
                            iM107B = AbstractC0030c.m109D(size5, size5, iM4317G8, iM107B);
                            break;
                        } else {
                            iM4317G3 = C1386m.m4317G(i11);
                            iM4316F = C1386m.m4316F((String) objM4373i4);
                            iM107B = iM4316F + iM4317G3 + iM107B;
                            break;
                        }
                    } else {
                        break;
                    }
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    if (m4448t(i11, obj, i10)) {
                        Object objM4373i5 = r1.f7095d.m4373i(j6, obj);
                        f1 f1VarM4444o3 = m4444o(i10);
                        Class cls5 = g1.f7039a;
                        AbstractC1374a abstractC1374a2 = (AbstractC1374a) objM4373i5;
                        int iM4317G9 = C1386m.m4317G(i11);
                        abstractC1374a2.getClass();
                        a0 a0Var2 = (a0) abstractC1374a2;
                        int iMo4222i2 = a0Var2.memoizedSerializedSize;
                        if (iMo4222i2 == -1) {
                            iMo4222i2 = f1VarM4444o3.mo4222i(abstractC1374a2);
                            a0Var2.memoizedSerializedSize = iMo4222i2;
                        }
                        iM107B = AbstractC0030c.m109D(iMo4222i2, iMo4222i2, iM4317G9, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m4448t(i11, obj, i10)) {
                        iM4313C = C1386m.m4320z(i11, (AbstractC1382i) r1.f7095d.m4373i(j6, obj));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m4448t(i11, obj, i10)) {
                        int iM4420B2 = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4318H(iM4420B2);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m4448t(i11, obj, i10)) {
                        int iM4420B3 = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4315E(iM4420B3);
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m4448t(i11, obj, i10)) {
                        iM107B = AbstractC0030c.m107B(i11, 4, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m4448t(i11, obj, i10)) {
                        iM107B = AbstractC0030c.m107B(i11, 8, iM107B);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m4448t(i11, obj, i10)) {
                        int iM4420B4 = m4420B(j6, obj);
                        iM4317G2 = C1386m.m4317G(i11);
                        iM4315E = C1386m.m4318H((iM4420B4 >> 31) ^ (iM4420B4 << 1));
                        iM4313C = iM4315E + iM4317G2;
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m4448t(i11, obj, i10)) {
                        long jM4421C3 = m4421C(j6, obj);
                        iM4317G4 = C1386m.m4317G(i11);
                        iM4319I2 = C1386m.m4319I((jM4421C3 << 1) ^ (jM4421C3 >> 63));
                        iM4317G5 = iM4319I2 + iM4317G4;
                        iM107B += iM4317G5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m4448t(i11, obj, i10)) {
                        iM4313C = C1386m.m4314D(i11, (AbstractC1374a) r1.f7095d.m4373i(j6, obj), m4444o(i10));
                        iM107B += iM4313C;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    /* renamed from: s */
    public final boolean m4447s(int i10, Object obj) {
        if (this.f7113g) {
            int iM4438O = m4438O(i10);
            long j6 = iM4438O & 1048575;
            switch (m4423N(iM4438O)) {
                case 0:
                    if (r1.f7095d.mo4357e(j6, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (r1.f7095d.mo4358f(j6, obj) == DefinitionKt.NO_Float_VALUE) {
                        return false;
                    }
                    break;
                case 2:
                    if (r1.f7095d.m4372h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (r1.f7095d.m4372h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (r1.f7095d.m4371g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (r1.f7095d.m4372h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (r1.f7095d.m4371g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return r1.f7095d.mo4355c(j6, obj);
                case 8:
                    Object objM4373i = r1.f7095d.m4373i(j6, obj);
                    if (objM4373i instanceof String) {
                        return !((String) objM4373i).isEmpty();
                    }
                    if (objM4373i instanceof AbstractC1382i) {
                        return !AbstractC1382i.f7044b.equals(objM4373i);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (r1.f7095d.m4373i(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC1382i.f7044b.equals(r1.f7095d.m4373i(j6, obj));
                case 11:
                    if (r1.f7095d.m4371g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (r1.f7095d.m4371g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (r1.f7095d.m4371g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (r1.f7095d.m4372h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (r1.f7095d.m4371g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (r1.f7095d.m4372h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (r1.f7095d.m4373i(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((r1.f7095d.m4371g(r6 & 1048575, obj) & (1 << (this.f7107a[i10 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public final boolean m4448t(int i10, Object obj, int i11) {
        return r1.f7095d.m4371g((long) (this.f7107a[i11 + 2] & 1048575), obj) == i10;
    }

    /* renamed from: v */
    public final void m4449v(int i10, Object obj, Object obj2) {
        long jM4438O = m4438O(i10) & 1048575;
        Object objM4373i = r1.f7095d.m4373i(jM4438O, obj);
        q0 q0Var = this.f7120n;
        if (objM4373i != null) {
            q0Var.getClass();
            if (!((p0) objM4373i).f7086a) {
                p0 p0VarM4365f = p0.f7085b.m4365f();
                q0.m4368b(p0VarM4365f, objM4373i);
                r1.m4392o(obj, jM4438O, p0VarM4365f);
                objM4373i = p0VarM4365f;
            }
        } else {
            q0Var.getClass();
            objM4373i = p0.f7085b.m4365f();
            r1.m4392o(obj, jM4438O, objM4373i);
        }
        q0Var.getClass();
        AbstractC1452a.m4578y(obj2);
        throw null;
    }

    /* renamed from: w */
    public final void m4450w(int i10, Object obj, Object obj2) {
        long jM4438O = m4438O(i10) & 1048575;
        if (m4447s(i10, obj2)) {
            q1 q1Var = r1.f7095d;
            Object objM4373i = q1Var.m4373i(jM4438O, obj);
            Object objM4373i2 = q1Var.m4373i(jM4438O, obj2);
            if (objM4373i != null && objM4373i2 != null) {
                r1.m4392o(obj, jM4438O, g0.m4230c(objM4373i, objM4373i2));
                m4435K(i10, obj);
            } else if (objM4373i2 != null) {
                r1.m4392o(obj, jM4438O, objM4373i2);
                m4435K(i10, obj);
            }
        }
    }

    /* renamed from: x */
    public final void m4451x(int i10, Object obj, Object obj2) {
        int iM4438O = m4438O(i10);
        int i11 = this.f7107a[i10];
        long j6 = iM4438O & 1048575;
        if (m4448t(i11, obj2, i10)) {
            q1 q1Var = r1.f7095d;
            Object objM4373i = q1Var.m4373i(j6, obj);
            Object objM4373i2 = q1Var.m4373i(j6, obj2);
            if (objM4373i != null && objM4373i2 != null) {
                r1.m4392o(obj, j6, g0.m4230c(objM4373i, objM4373i2));
                m4436L(i11, obj, i10);
            } else if (objM4373i2 != null) {
                r1.m4392o(obj, j6, objM4373i2);
                m4436L(i11, obj, i10);
            }
        }
    }
}
