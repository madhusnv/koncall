package com.google.android.gms.internal.measurement;

import com.sun.mail.util.AbstractC1452a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import og.ua;
import og.wa;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b6 implements i6 {

    /* renamed from: j */
    public static final int[] f6078j = new int[0];

    /* renamed from: k */
    public static final Unsafe f6079k = r6.m3627l();

    /* renamed from: a */
    public final int[] f6080a;

    /* renamed from: b */
    public final Object[] f6081b;

    /* renamed from: c */
    public final int f6082c;

    /* renamed from: d */
    public final int f6083d;

    /* renamed from: e */
    public final t4 f6084e;

    /* renamed from: f */
    public final int[] f6085f;

    /* renamed from: g */
    public final int f6086g;

    /* renamed from: h */
    public final int f6087h;

    /* renamed from: i */
    public final g5 f6088i;

    public b6(int[] iArr, Object[] objArr, int i10, int i11, t4 t4Var, int[] iArr2, int i12, int i13, g5 g5Var, g5 g5Var2) {
        this.f6080a = iArr;
        this.f6081b = objArr;
        this.f6082c = i10;
        this.f6083d = i11;
        this.f6085f = iArr2;
        this.f6086g = i12;
        this.f6087h = i13;
        this.f6088i = g5Var;
        this.f6084e = t4Var;
    }

    /* renamed from: E */
    public static int m3153E(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* renamed from: a */
    public static boolean m3154a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof i5) {
            return ((i5) obj).m3336e();
        }
        return true;
    }

    /* renamed from: j */
    public static int m3155j(long j6, Object obj) {
        return ((Integer) r6.m3625j(j6, obj)).intValue();
    }

    /* renamed from: k */
    public static long m3156k(long j6, Object obj) {
        return ((Long) r6.m3625j(j6, obj)).longValue();
    }

    /* renamed from: r */
    public static final int m3157r(byte[] bArr, int i10, int i11, u6 u6Var, Class cls, w4 w4Var) {
        u6 u6Var2 = u6.zza;
        switch (u6Var.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                w4Var.f6431c = Double.valueOf(Double.longBitsToDouble(ua.m10959g(i10, bArr)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                w4Var.f6431c = Float.valueOf(Float.intBitsToFloat(ua.m10958f(i10, bArr)));
                return i13;
            case 2:
            case 3:
                int iM10956d = ua.m10956d(bArr, i10, w4Var);
                w4Var.f6431c = Long.valueOf(w4Var.f6430b);
                return iM10956d;
            case 4:
            case 12:
            case 13:
                int iM10954b = ua.m10954b(bArr, i10, w4Var);
                w4Var.f6431c = Integer.valueOf(w4Var.f6429a);
                return iM10954b;
            case 5:
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int i14 = i10 + 8;
                w4Var.f6431c = Long.valueOf(ua.m10959g(i10, bArr));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                w4Var.f6431c = Integer.valueOf(ua.m10958f(i10, bArr));
                return i15;
            case 7:
                int iM10956d2 = ua.m10956d(bArr, i10, w4Var);
                w4Var.f6431c = Boolean.valueOf(w4Var.f6430b != 0);
                return iM10956d2;
            case 8:
                return ua.m10960h(bArr, i10, w4Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                i6 i6VarM3269a = f6.f6193c.m3269a(cls);
                i5 i5VarZza = i6VarM3269a.zza();
                int iM10962j = ua.m10962j(i5VarZza, i6VarM3269a, bArr, i10, i11, w4Var);
                i6VarM3269a.mo3169g(i5VarZza);
                w4Var.f6431c = i5VarZza;
                return iM10962j;
            case 11:
                return ua.m10961i(bArr, i10, w4Var);
            case 16:
                int iM10954b2 = ua.m10954b(bArr, i10, w4Var);
                w4Var.f6431c = Integer.valueOf(wa.m11026a(w4Var.f6429a));
                return iM10954b2;
            case 17:
                int iM10956d3 = ua.m10956d(bArr, i10, w4Var);
                w4Var.f6431c = Long.valueOf(wa.m11027b(w4Var.f6430b));
                return iM10956d3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ab  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.b6 m3158t(com.google.android.gms.internal.measurement.h6 r35, com.google.android.gms.internal.measurement.g5 r36, com.google.android.gms.internal.measurement.g5 r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.m3158t(com.google.android.gms.internal.measurement.h6, com.google.android.gms.internal.measurement.g5, com.google.android.gms.internal.measurement.g5):com.google.android.gms.internal.measurement.b6");
    }

    /* renamed from: u */
    public static Field m3159u(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            p020v.a1.m14319B(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(AbstractC1452a.m4564k(sb2, " not found. Known fields are ", string), e2);
        }
    }

    /* renamed from: A */
    public final void m3160A(int i10, Object obj, Object obj2) {
        f6079k.putObject(obj, m3163D(i10) & 1048575, obj2);
        m3175o(i10, obj);
    }

    /* renamed from: B */
    public final Object m3161B(int i10, Object obj, int i11) {
        i6 i6VarM3181x = m3181x(i11);
        if (!m3176p(i10, obj, i11)) {
            return i6VarM3181x.zza();
        }
        Object object = f6079k.getObject(obj, m3163D(i11) & 1048575);
        if (m3154a(object)) {
            return object;
        }
        i5 i5VarZza = i6VarM3181x.zza();
        if (object != null) {
            i6VarM3181x.mo3165c(i5VarZza, object);
        }
        return i5VarZza;
    }

    /* renamed from: C */
    public final void m3162C(Object obj, int i10, Object obj2, int i11) {
        f6079k.putObject(obj, m3163D(i11) & 1048575, obj2);
        r6.m3622g(i10, this.f6080a[i11 + 2] & 1048575, obj);
    }

    /* renamed from: D */
    public final int m3163D(int i10) {
        return this.f6080a[i10 + 1];
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: b */
    public final boolean mo3164b(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f6086g) {
            int i16 = this.f6085f[i14];
            int[] iArr = this.f6080a;
            int i17 = iArr[i16];
            int iM3163D = m3163D(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = f6079k.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & iM3163D) == 0 || m3173m(obj, i11, i10, i12, i20)) {
                int iM3153E = m3153E(iM3163D);
                if (iM3153E != 9 && iM3153E != 17) {
                    if (iM3153E != 27) {
                        if (iM3153E == 60 || iM3153E == 68) {
                            if (!m3176p(i17, obj, i11) || m3181x(i11).mo3164b(r6.m3625j(iM3163D & 1048575, obj))) {
                                i14++;
                                i15 = i10;
                                i13 = i12;
                            }
                        } else if (iM3153E != 49) {
                            if (iM3153E != 50) {
                                continue;
                            } else {
                                x5 x5Var = (x5) r6.m3625j(iM3163D & 1048575, obj);
                                if (x5Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i22 = i11 / 3;
                                    if (((u6) ((w5) this.f6081b[i22 + i22]).f6433a.f6377b).zza() == v6.MESSAGE) {
                                        i6 i6VarM3269a = null;
                                        for (Object obj2 : x5Var.values()) {
                                            if (i6VarM3269a == null) {
                                                i6VarM3269a = f6.f6193c.m3269a(obj2.getClass());
                                            }
                                            if (!i6VarM3269a.mo3164b(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i14++;
                            i15 = i10;
                            i13 = i12;
                        }
                    }
                    List list = (List) r6.m3625j(iM3163D & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        i6 i6VarM3181x = m3181x(i11);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (i6VarM3181x.mo3164b(list.get(i23))) {
                            }
                        }
                    }
                    i14++;
                    i15 = i10;
                    i13 = i12;
                } else if (!m3173m(obj, i11, i10, i12, i20) || m3181x(i11).mo3164b(r6.m3625j(iM3163D & 1048575, obj))) {
                    i14++;
                    i15 = i10;
                    i13 = i12;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3165c(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.mo3165c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo3166d(com.google.android.gms.internal.measurement.t4 r17) {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.mo3166d(com.google.android.gms.internal.measurement.t4):int");
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: e */
    public final void mo3167e(Object obj, v5 v5Var) throws zzll {
        int i10;
        b6 b6Var = this;
        Unsafe unsafe = f6079k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = b6Var.f6080a;
            if (i12 >= iArr.length) {
                ((i5) obj).zzc.m3495b(v5Var);
                return;
            }
            int iM3163D = b6Var.m3163D(i12);
            int iM3153E = m3153E(iM3163D);
            int i15 = iArr[i12];
            if (iM3153E <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i14) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j6 = iM3163D & i11;
            switch (iM3153E) {
                case 0:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3119h(i15, Double.doubleToRawLongBits(r6.f6355c.mo3536f(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3117f(i15, Float.floatToRawIntBits(r6.f6355c.mo3534d(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3118g(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3118g(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3115d(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3119h(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3117f(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        boolean zMo3532b = r6.f6355c.mo3532b(j6, obj);
                        a5 a5Var = (a5) v5Var.f6423a;
                        a5Var.m3123l(i15 << 3);
                        a5Var.m3121j(zMo3532b ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof String) {
                            a5 a5Var2 = (a5) v5Var.f6423a;
                            a5Var2.m3123l((i15 << 3) | 2);
                            a5Var2.m3128q((String) object);
                            break;
                        } else {
                            a5 a5Var3 = (a5) v5Var.f6423a;
                            a5Var3.m3123l((i15 << 3) | 2);
                            a5Var3.m3120i((z4) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        v5Var.m3728d(i15, unsafe.getObject(obj, j6), b6Var.m3181x(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        z4 z4Var = (z4) unsafe.getObject(obj, j6);
                        a5 a5Var4 = (a5) v5Var.f6423a;
                        a5Var4.m3123l((i15 << 3) | 2);
                        a5Var4.m3120i(z4Var);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3116e(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3115d(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3117f(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        ((a5) v5Var.f6423a).m3119h(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        int i18 = unsafe.getInt(obj, j6);
                        ((a5) v5Var.f6423a).m3116e(i15, (i18 >> 31) ^ (i18 + i18));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        long j10 = unsafe.getLong(obj, j6);
                        ((a5) v5Var.f6423a).m3118g(i15, (j10 >> 63) ^ (j10 + j10));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (b6Var.m3173m(obj, i12, i14, i13, i10)) {
                        v5Var.m3729e(i15, unsafe.getObject(obj, j6), b6Var.m3181x(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j6.m3408c(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 19:
                    j6.m3409d(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 20:
                    j6.m3410e(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 21:
                    j6.m3411f(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 22:
                    j6.m3415j(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 23:
                    j6.m3413h(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 24:
                    j6.m3418m(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 25:
                    j6.m3421p(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 26:
                    int i19 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j6);
                    g5 g5Var = j6.f6258a;
                    if (list != null && !list.isEmpty()) {
                        v5Var.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            a5 a5Var5 = (a5) v5Var.f6423a;
                            String str = (String) list.get(i20);
                            a5Var5.m3123l((i19 << 3) | 2);
                            a5Var5.m3128q(str);
                        }
                        break;
                    } else {
                        break;
                    }
                case 27:
                    int i21 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    i6 i6VarM3181x = b6Var.m3181x(i12);
                    g5 g5Var2 = j6.f6258a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            v5Var.m3728d(i21, list2.get(i22), i6VarM3181x);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 28:
                    int i23 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    g5 g5Var3 = j6.f6258a;
                    if (list3 != null && !list3.isEmpty()) {
                        v5Var.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            a5 a5Var6 = (a5) v5Var.f6423a;
                            z4 z4Var2 = (z4) list3.get(i24);
                            a5Var6.m3123l((i23 << 3) | 2);
                            a5Var6.m3120i(z4Var2);
                        }
                        break;
                    } else {
                        break;
                    }
                case 29:
                    j6.m3416k(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 30:
                    j6.m3420o(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    j6.m3419n(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case 32:
                    j6.m3414i(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    j6.m3417l(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case BERTags.DURATION /* 34 */:
                    j6.m3412g(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, false);
                    break;
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    j6.m3408c(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    j6.m3409d(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 37:
                    j6.m3410e(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 38:
                    j6.m3411f(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 39:
                    j6.m3415j(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    j6.m3413h(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 41:
                    j6.m3418m(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 42:
                    j6.m3421p(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 43:
                    j6.m3416k(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 44:
                    j6.m3420o(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 45:
                    j6.m3419n(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 46:
                    j6.m3414i(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 47:
                    j6.m3417l(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 48:
                    j6.m3412g(iArr[i12], (List) unsafe.getObject(obj, j6), v5Var, true);
                    break;
                case 49:
                    int i25 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    i6 i6VarM3181x2 = b6Var.m3181x(i12);
                    g5 g5Var4 = j6.f6258a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            v5Var.m3729e(i25, list4.get(i26), i6VarM3181x2);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j6);
                    if (object2 != null) {
                        int i27 = i12 / 3;
                        C1304t c1304t = ((w5) b6Var.f6081b[i27 + i27]).f6433a;
                        v5Var.getClass();
                        for (Map.Entry entry : ((x5) object2).entrySet()) {
                            a5 a5Var7 = (a5) v5Var.f6423a;
                            a5Var7.m3114c(i15, 2);
                            a5Var7.m3123l(w5.m3747b(c1304t, entry.getKey(), entry.getValue()));
                            w5.m3746a(a5Var7, c1304t, entry.getKey(), entry.getValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 51:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3119h(i15, Double.doubleToRawLongBits(((Double) r6.m3625j(j6, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3117f(i15, Float.floatToRawIntBits(((Float) r6.m3625j(j6, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3118g(i15, m3156k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3118g(i15, m3156k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3115d(i15, m3155j(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3119h(i15, m3156k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3117f(i15, m3155j(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        boolean zBooleanValue = ((Boolean) r6.m3625j(j6, obj)).booleanValue();
                        a5 a5Var8 = (a5) v5Var.f6423a;
                        a5Var8.m3123l(i15 << 3);
                        a5Var8.m3121j(zBooleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        Object object3 = unsafe.getObject(obj, j6);
                        if (object3 instanceof String) {
                            a5 a5Var9 = (a5) v5Var.f6423a;
                            a5Var9.m3123l((i15 << 3) | 2);
                            a5Var9.m3128q((String) object3);
                            break;
                        } else {
                            a5 a5Var10 = (a5) v5Var.f6423a;
                            a5Var10.m3123l((i15 << 3) | 2);
                            a5Var10.m3120i((z4) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        v5Var.m3728d(i15, unsafe.getObject(obj, j6), b6Var.m3181x(i12));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        z4 z4Var3 = (z4) unsafe.getObject(obj, j6);
                        a5 a5Var11 = (a5) v5Var.f6423a;
                        a5Var11.m3123l((i15 << 3) | 2);
                        a5Var11.m3120i(z4Var3);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3116e(i15, m3155j(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3115d(i15, m3155j(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3117f(i15, m3155j(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        ((a5) v5Var.f6423a).m3119h(i15, m3156k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        int iM3155j = m3155j(j6, obj);
                        ((a5) v5Var.f6423a).m3116e(i15, (iM3155j >> 31) ^ (iM3155j + iM3155j));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        long jM3156k = m3156k(j6, obj);
                        ((a5) v5Var.f6423a).m3118g(i15, (jM3156k >> 63) ^ (jM3156k + jM3156k));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (b6Var.m3176p(i15, obj, i12)) {
                        v5Var.m3729e(i15, unsafe.getObject(obj, j6), b6Var.m3181x(i12));
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
            i11 = 1048575;
            b6Var = this;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: f */
    public final boolean mo3168f(i5 i5Var, i5 i5Var2) {
        boolean zM3406a;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6080a;
            if (i10 < iArr.length) {
                int iM3163D = m3163D(i10);
                long j6 = iM3163D & 1048575;
                switch (m3153E(iM3163D)) {
                    case 0:
                        if (!m3172l(i5Var, i5Var2, i10)) {
                            break;
                        } else {
                            q6 q6Var = r6.f6355c;
                            if (Double.doubleToLongBits(q6Var.mo3536f(j6, i5Var)) != Double.doubleToLongBits(q6Var.mo3536f(j6, i5Var2))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!m3172l(i5Var, i5Var2, i10)) {
                            break;
                        } else {
                            q6 q6Var2 = r6.f6355c;
                            if (Float.floatToIntBits(q6Var2.mo3534d(j6, i5Var)) != Float.floatToIntBits(q6Var2.mo3534d(j6, i5Var2))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3623h(j6, i5Var) != r6.m3623h(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3623h(j6, i5Var) != r6.m3623h(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3621f(j6, i5Var) != r6.m3621f(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3623h(j6, i5Var) != r6.m3623h(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3621f(j6, i5Var) != r6.m3621f(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (!m3172l(i5Var, i5Var2, i10)) {
                            break;
                        } else {
                            q6 q6Var3 = r6.f6355c;
                            if (q6Var3.mo3532b(j6, i5Var) != q6Var3.mo3532b(j6, i5Var2)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 8:
                        if (!m3172l(i5Var, i5Var2, i10) || !j6.m3406a(r6.m3625j(j6, i5Var), r6.m3625j(j6, i5Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (!m3172l(i5Var, i5Var2, i10) || !j6.m3406a(r6.m3625j(j6, i5Var), r6.m3625j(j6, i5Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (!m3172l(i5Var, i5Var2, i10) || !j6.m3406a(r6.m3625j(j6, i5Var), r6.m3625j(j6, i5Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3621f(j6, i5Var) != r6.m3621f(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3621f(j6, i5Var) != r6.m3621f(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3621f(j6, i5Var) != r6.m3621f(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3623h(j6, i5Var) != r6.m3623h(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3621f(j6, i5Var) != r6.m3621f(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (!m3172l(i5Var, i5Var2, i10) || r6.m3623h(j6, i5Var) != r6.m3623h(j6, i5Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (!m3172l(i5Var, i5Var2, i10) || !j6.m3406a(r6.m3625j(j6, i5Var), r6.m3625j(j6, i5Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case BERTags.DATE /* 31 */:
                    case 32:
                    case BERTags.DATE_TIME /* 33 */:
                    case BERTags.DURATION /* 34 */:
                    case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    case BERTags.RELATIVE_OID_IRI /* 36 */:
                    case 37:
                    case 38:
                    case 39:
                    case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zM3406a = j6.m3406a(r6.m3625j(j6, i5Var), r6.m3625j(j6, i5Var2));
                        break;
                    case 50:
                        zM3406a = j6.m3406a(r6.m3625j(j6, i5Var), r6.m3625j(j6, i5Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j10 = iArr[i10 + 2] & 1048575;
                        if (r6.m3621f(j10, i5Var) != r6.m3621f(j10, i5Var2) || !j6.m3406a(r6.m3625j(j6, i5Var), r6.m3625j(j6, i5Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        i10 += 3;
                }
                if (zM3406a) {
                    i10 += 3;
                }
            } else if (i5Var.zzc.equals(i5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3169g(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m3154a(r8)
            if (r0 != 0) goto L8
            goto L96
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.i5
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.measurement.i5 r0 = (com.google.android.gms.internal.measurement.i5) r0
            r0.m3341j()
            r0.zza = r1
            r0.m3337f()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f6080a
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.m3163D(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = m3153E(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L71
            r6 = 60
            if (r3 == r6) goto L5b
            r6 = 68
            if (r3 == r6) goto L5b
            switch(r3) {
                case 17: goto L71;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L84
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.b6.f6079k
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.measurement.x5 r6 = (com.google.android.gms.internal.measurement.x5) r6
            r6.f6447a = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.r6.m3625j(r4, r8)
            com.google.android.gms.internal.measurement.o5 r2 = (com.google.android.gms.internal.measurement.o5) r2
            com.google.android.gms.internal.measurement.u4 r2 = (com.google.android.gms.internal.measurement.u4) r2
            boolean r3 = r2.f6407a
            if (r3 == 0) goto L84
            r2.f6407a = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.m3176p(r2, r8, r0)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.i6 r2 = r7.m3181x(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.b6.f6079k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.mo3169g(r3)
            goto L84
        L71:
            boolean r2 = r7.m3174n(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.i6 r2 = r7.m3181x(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.b6.f6079k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.mo3169g(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.measurement.g5 r0 = r7.f6088i
            r0.getClass()
            com.google.android.gms.internal.measurement.i5 r8 = (com.google.android.gms.internal.measurement.i5) r8
            com.google.android.gms.internal.measurement.m6 r8 = r8.zzc
            boolean r0 = r8.f6300e
            if (r0 == 0) goto L96
            r8.f6300e = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.mo3169g(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: h */
    public final void mo3170h(Object obj, byte[] bArr, int i10, int i11, w4 w4Var) throws zzmr {
        m3178s(obj, bArr, i10, i11, 0, w4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo3171i(com.google.android.gms.internal.measurement.i5 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.mo3171i(com.google.android.gms.internal.measurement.i5):int");
    }

    /* renamed from: l */
    public final boolean m3172l(i5 i5Var, i5 i5Var2, int i10) {
        return m3174n(i10, i5Var) == m3174n(i10, i5Var2);
    }

    /* renamed from: m */
    public final boolean m3173m(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m3174n(i10, obj) : (i12 & i13) != 0;
    }

    /* renamed from: n */
    public final boolean m3174n(int i10, Object obj) {
        int i11 = this.f6080a[i10 + 2];
        long j6 = i11 & 1048575;
        if (j6 == 1048575) {
            int iM3163D = m3163D(i10);
            long j10 = iM3163D & 1048575;
            switch (m3153E(iM3163D)) {
                case 0:
                    if (Double.doubleToRawLongBits(r6.f6355c.mo3536f(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(r6.f6355c.mo3534d(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (r6.m3623h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (r6.m3623h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (r6.m3621f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (r6.m3623h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (r6.m3621f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return r6.f6355c.mo3532b(j10, obj);
                case 8:
                    Object objM3625j = r6.m3625j(j10, obj);
                    if (objM3625j instanceof String) {
                        if (((String) objM3625j).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM3625j instanceof z4)) {
                            throw new IllegalArgumentException();
                        }
                        if (z4.f6468c.equals(objM3625j)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (r6.m3625j(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (z4.f6468c.equals(r6.m3625j(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (r6.m3621f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (r6.m3621f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (r6.m3621f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (r6.m3623h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (r6.m3621f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (r6.m3623h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (r6.m3625j(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & r6.m3621f(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void m3175o(int i10, Object obj) {
        int i11 = this.f6080a[i10 + 2];
        long j6 = 1048575 & i11;
        if (j6 == 1048575) {
            return;
        }
        r6.m3622g((1 << (i11 >>> 20)) | r6.m3621f(j6, obj), j6, obj);
    }

    /* renamed from: p */
    public final boolean m3176p(int i10, Object obj, int i11) {
        return r6.m3621f((long) (this.f6080a[i11 + 2] & 1048575), obj) == i10;
    }

    /* renamed from: q */
    public final int m3177q(int i10, int i11) {
        int[] iArr = this.f6080a;
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

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0373, code lost:
    
        r4 = r13;
        r7 = r15;
        r8 = r12;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03d9, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        r6 = r43;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        r4 = r10;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        r10 = r13;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0c95, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0f68 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0f7b  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0b3a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0f48 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0b4b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0f5d A[SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m3178s(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.w4 r45) throws com.google.android.gms.internal.measurement.zzmr {
        /*
            Method dump skipped, instructions count: 4414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.m3178s(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.w4):int");
    }

    /* renamed from: v */
    public final void m3179v(int i10, Object obj, Object obj2) {
        if (m3174n(i10, obj2)) {
            int iM3163D = m3163D(i10) & 1048575;
            Unsafe unsafe = f6079k;
            long j6 = iM3163D;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i11 = this.f6080a[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            i6 i6VarM3181x = m3181x(i10);
            if (!m3174n(i10, obj)) {
                if (m3154a(object)) {
                    i5 i5VarZza = i6VarM3181x.zza();
                    i6VarM3181x.mo3165c(i5VarZza, object);
                    unsafe.putObject(obj, j6, i5VarZza);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                m3175o(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m3154a(object2)) {
                i5 i5VarZza2 = i6VarM3181x.zza();
                i6VarM3181x.mo3165c(i5VarZza2, object2);
                unsafe.putObject(obj, j6, i5VarZza2);
                object2 = i5VarZza2;
            }
            i6VarM3181x.mo3165c(object2, object);
        }
    }

    /* renamed from: w */
    public final void m3180w(int i10, Object obj, Object obj2) {
        int[] iArr = this.f6080a;
        int i11 = iArr[i10];
        if (m3176p(i11, obj2, i10)) {
            int iM3163D = m3163D(i10) & 1048575;
            Unsafe unsafe = f6079k;
            long j6 = iM3163D;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            i6 i6VarM3181x = m3181x(i10);
            if (!m3176p(i11, obj, i10)) {
                if (m3154a(object)) {
                    i5 i5VarZza = i6VarM3181x.zza();
                    i6VarM3181x.mo3165c(i5VarZza, object);
                    unsafe.putObject(obj, j6, i5VarZza);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                r6.m3622g(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m3154a(object2)) {
                i5 i5VarZza2 = i6VarM3181x.zza();
                i6VarM3181x.mo3165c(i5VarZza2, object2);
                unsafe.putObject(obj, j6, i5VarZza2);
                object2 = i5VarZza2;
            }
            i6VarM3181x.mo3165c(object2, object);
        }
    }

    /* renamed from: x */
    public final i6 m3181x(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f6081b;
        i6 i6Var = (i6) objArr[i12];
        if (i6Var != null) {
            return i6Var;
        }
        i6 i6VarM3269a = f6.f6193c.m3269a((Class) objArr[i12 + 1]);
        objArr[i12] = i6VarM3269a;
        return i6VarM3269a;
    }

    /* renamed from: y */
    public final l5 m3182y(int i10) {
        int i11 = i10 / 3;
        return (l5) this.f6081b[i11 + i11 + 1];
    }

    /* renamed from: z */
    public final Object m3183z(int i10, Object obj) {
        i6 i6VarM3181x = m3181x(i10);
        int iM3163D = m3163D(i10) & 1048575;
        if (!m3174n(i10, obj)) {
            return i6VarM3181x.zza();
        }
        Object object = f6079k.getObject(obj, iM3163D);
        if (m3154a(object)) {
            return object;
        }
        i5 i5VarZza = i6VarM3181x.zza();
        if (object != null) {
            i6VarM3181x.mo3165c(i5VarZza, object);
        }
        return i5VarZza;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final i5 zza() {
        return (i5) ((i5) this.f6084e).mo3102o(4);
    }
}
