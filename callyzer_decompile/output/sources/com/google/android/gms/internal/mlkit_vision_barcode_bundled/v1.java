package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import a2.AbstractC0030c;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v1 implements e2 {

    /* renamed from: l */
    public static final int[] f6676l = new int[0];

    /* renamed from: m */
    public static final Unsafe f6677m = n2.m3923i();

    /* renamed from: a */
    public final int[] f6678a;

    /* renamed from: b */
    public final Object[] f6679b;

    /* renamed from: c */
    public final int f6680c;

    /* renamed from: d */
    public final int f6681d;

    /* renamed from: e */
    public final j0 f6682e;

    /* renamed from: f */
    public final boolean f6683f;

    /* renamed from: g */
    public final int[] f6684g;

    /* renamed from: h */
    public final int f6685h;

    /* renamed from: i */
    public final int f6686i;

    /* renamed from: j */
    public final z0 f6687j;

    /* renamed from: k */
    public final z0 f6688k;

    public v1(int[] iArr, Object[] objArr, int i10, int i11, j0 j0Var, int[] iArr2, int i12, int i13, z0 z0Var, z0 z0Var2) {
        this.f6678a = iArr;
        this.f6679b = objArr;
        this.f6680c = i10;
        this.f6681d = i11;
        boolean z6 = false;
        if (z0Var2 != null && (j0Var instanceof b1)) {
            z6 = true;
        }
        this.f6683f = z6;
        this.f6684g = iArr2;
        this.f6685h = i12;
        this.f6686i = i13;
        this.f6687j = z0Var;
        this.f6688k = z0Var2;
        this.f6682e = j0Var;
    }

    /* renamed from: A */
    public static long m3973A(long j6, Object obj) {
        return ((Long) n2.m3922h(j6, obj)).longValue();
    }

    /* renamed from: F */
    public static Field m3974F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbM127r = AbstractC0030c.m127r("Field ", str, " for ", name, " not found. Known fields are ");
            sbM127r.append(string);
            throw new RuntimeException(sbM127r.toString());
        }
    }

    /* renamed from: r */
    public static boolean m3975r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof e1) {
            return ((e1) obj).m3840k();
        }
        return true;
    }

    /* renamed from: u */
    public static i2 m3976u(Object obj) {
        e1 e1Var = (e1) obj;
        i2 i2Var = e1Var.zzc;
        if (i2Var != i2.f6561f) {
            return i2Var;
        }
        i2 i2VarM3902b = i2.m3902b();
        e1Var.zzc = i2VarM3902b;
        return i2VarM3902b;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ab  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1 m3977v(com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2 r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0 r36, com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0 r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.m3977v(com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2, com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0):com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1");
    }

    /* renamed from: w */
    public static int m3978w(long j6, Object obj) {
        return ((Integer) n2.m3922h(j6, obj)).intValue();
    }

    /* renamed from: y */
    public static int m3979y(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* renamed from: B */
    public final h1 m3980B(int i10) {
        int i11 = i10 / 3;
        return (h1) this.f6679b[i11 + i11 + 1];
    }

    /* renamed from: C */
    public final e2 m3981C(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f6679b;
        e2 e2Var = (e2) objArr[i12];
        if (e2Var != null) {
            return e2Var;
        }
        e2 e2VarM4007a = y1.f6701c.m4007a((Class) objArr[i12 + 1]);
        objArr[i12] = e2VarM4007a;
        return e2VarM4007a;
    }

    /* renamed from: D */
    public final Object m3982D(int i10, Object obj) {
        e2 e2VarM3981C = m3981C(i10);
        int iM3995z = m3995z(i10) & 1048575;
        if (!m3990p(i10, obj)) {
            return e2VarM3981C.mo3842a();
        }
        Object object = f6677m.getObject(obj, iM3995z);
        if (m3975r(object)) {
            return object;
        }
        Object objMo3842a = e2VarM3981C.mo3842a();
        if (object != null) {
            e2VarM3981C.mo3848g(objMo3842a, object);
        }
        return objMo3842a;
    }

    /* renamed from: E */
    public final Object m3983E(int i10, Object obj, int i11) {
        e2 e2VarM3981C = m3981C(i11);
        if (!m3992s(i10, obj, i11)) {
            return e2VarM3981C.mo3842a();
        }
        Object object = f6677m.getObject(obj, m3995z(i11) & 1048575);
        if (m3975r(object)) {
            return object;
        }
        Object objMo3842a = e2VarM3981C.mo3842a();
        if (object != null) {
            e2VarM3981C.mo3848g(objMo3842a, object);
        }
        return objMo3842a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: a */
    public final Object mo3842a() {
        return (e1) ((e1) this.f6682e).mo3803m(4, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: b */
    public final boolean mo3843b(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        loop0: while (true) {
            if (i14 < this.f6685h) {
                int i16 = this.f6684g[i14];
                int[] iArr = this.f6678a;
                int i17 = iArr[i16];
                int iM3995z = m3995z(i16);
                int i18 = iArr[i16 + 2];
                int i19 = i18 & 1048575;
                int i20 = 1 << (i18 >>> 20);
                if (i19 != i15) {
                    if (i19 != 1048575) {
                        i13 = f6677m.getInt(obj, i19);
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
                if ((268435456 & iM3995z) != 0 && !m3991q(obj, i11, i10, i12, i20)) {
                    break;
                }
                int iM3979y = m3979y(iM3995z);
                if (iM3979y == 9 || iM3979y == 17) {
                    if (m3991q(obj, i11, i10, i12, i20) && !m3981C(i11).mo3843b(n2.m3922h(iM3995z & 1048575, obj))) {
                        break;
                    }
                    i14++;
                    i15 = i10;
                    i13 = i12;
                } else {
                    if (iM3979y != 27) {
                        if (iM3979y == 60 || iM3979y == 68) {
                            if (m3992s(i17, obj, i11) && !m3981C(i11).mo3843b(n2.m3922h(iM3995z & 1048575, obj))) {
                                break;
                            }
                        } else if (iM3979y != 49) {
                            if (iM3979y == 50 && !((q1) n2.m3922h(iM3995z & 1048575, obj)).isEmpty()) {
                                int i22 = i11 / 3;
                                throw i0.m0.m7376i(this.f6679b[i22 + i22]);
                            }
                        }
                        i14++;
                        i15 = i10;
                        i13 = i12;
                    }
                    List list = (List) n2.m3922h(iM3995z & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        e2 e2VarM3981C = m3981C(i11);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (!e2VarM3981C.mo3843b(list.get(i23))) {
                                break loop0;
                            }
                        }
                    }
                    i14++;
                    i15 = i10;
                    i13 = i12;
                }
            } else if (!this.f6683f || ((b1) obj).zzb.m4003f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3844c(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m3975r(r8)
            if (r0 != 0) goto L8
            goto La7
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1 r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1) r0
            r0.m3839i()
            r0.zza = r1
            r0.m3838g()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f6678a
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.m3995z(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = m3979y(r3)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.f6677m
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.q1 r6 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.q1) r6
            r6.f6636a = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.n2.m3922h(r4, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1 r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1) r2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0 r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0) r2
            boolean r3 = r2.f6588a
            if (r3 == 0) goto L84
            r2.f6588a = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.m3992s(r2, r8, r0)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 r2 = r7.m3981C(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.f6677m
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.mo3844c(r3)
            goto L84
        L71:
            boolean r2 = r7.m3990p(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 r2 = r7.m3981C(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.f6677m
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.mo3844c(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0 r0 = r7.f6687j
            r0.getClass()
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1 r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1) r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2 r0 = r0.zzc
            boolean r2 = r0.f6566e
            if (r2 == 0) goto L97
            r0.f6566e = r1
        L97:
            boolean r0 = r7.f6683f
            if (r0 == 0) goto La7
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0 r0 = r7.f6688k
            r0.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.b1 r8 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.b1) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0 r8 = r8.zzb
            r8.m4001d()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.mo3844c(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: d */
    public final void mo3845d(Object obj, byte[] bArr, int i10, int i11, m0 m0Var) {
        m3993t(obj, bArr, i10, i11, 0, m0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo3846e(com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1 r11) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.mo3846e(com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04df  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo3847f(com.google.android.gms.internal.mlkit_vision_barcode_bundled.j0 r19) {
        /*
            Method dump skipped, instructions count: 2032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.mo3847f(com.google.android.gms.internal.mlkit_vision_barcode_bundled.j0):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3848g(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.mo3848g(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: h */
    public final boolean mo3849h(e1 e1Var, e1 e1Var2) {
        boolean zM3860e;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6678a;
            if (i10 < iArr.length) {
                int iM3995z = m3995z(i10);
                long j6 = iM3995z & 1048575;
                switch (m3979y(iM3995z)) {
                    case 0:
                        if (!m3989o(e1Var, e1Var2, i10)) {
                            break;
                        } else {
                            m2 m2Var = n2.f6616c;
                            if (Double.doubleToLongBits(m2Var.mo3908a(j6, e1Var)) != Double.doubleToLongBits(m2Var.mo3908a(j6, e1Var2))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!m3989o(e1Var, e1Var2, i10)) {
                            break;
                        } else {
                            m2 m2Var2 = n2.f6616c;
                            if (Float.floatToIntBits(m2Var2.mo3909b(j6, e1Var)) != Float.floatToIntBits(m2Var2.mo3909b(j6, e1Var2))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3920f(j6, e1Var) != n2.m3920f(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3920f(j6, e1Var) != n2.m3920f(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3919e(j6, e1Var) != n2.m3919e(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3920f(j6, e1Var) != n2.m3920f(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3919e(j6, e1Var) != n2.m3919e(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (!m3989o(e1Var, e1Var2, i10)) {
                            break;
                        } else {
                            m2 m2Var3 = n2.f6616c;
                            if (m2Var3.mo3914g(j6, e1Var) != m2Var3.mo3914g(j6, e1Var2)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 8:
                        if (!m3989o(e1Var, e1Var2, i10) || !f2.m3860e(n2.m3922h(j6, e1Var), n2.m3922h(j6, e1Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (!m3989o(e1Var, e1Var2, i10) || !f2.m3860e(n2.m3922h(j6, e1Var), n2.m3922h(j6, e1Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (!m3989o(e1Var, e1Var2, i10) || !f2.m3860e(n2.m3922h(j6, e1Var), n2.m3922h(j6, e1Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3919e(j6, e1Var) != n2.m3919e(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3919e(j6, e1Var) != n2.m3919e(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3919e(j6, e1Var) != n2.m3919e(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3920f(j6, e1Var) != n2.m3920f(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3919e(j6, e1Var) != n2.m3919e(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (!m3989o(e1Var, e1Var2, i10) || n2.m3920f(j6, e1Var) != n2.m3920f(j6, e1Var2)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (!m3989o(e1Var, e1Var2, i10) || !f2.m3860e(n2.m3922h(j6, e1Var), n2.m3922h(j6, e1Var2))) {
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
                        zM3860e = f2.m3860e(n2.m3922h(j6, e1Var), n2.m3922h(j6, e1Var2));
                        break;
                    case 50:
                        zM3860e = f2.m3860e(n2.m3922h(j6, e1Var), n2.m3922h(j6, e1Var2));
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
                        if (n2.m3919e(j10, e1Var) != n2.m3919e(j10, e1Var2) || !f2.m3860e(n2.m3922h(j6, e1Var), n2.m3922h(j6, e1Var2))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        i10 += 3;
                }
                if (zM3860e) {
                    i10 += 3;
                }
            } else if (e1Var.zzc.equals(e1Var2.zzc)) {
                if (this.f6683f) {
                    return ((b1) e1Var).zzb.equals(((b1) e1Var2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0241  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3850i(java.lang.Object r20, com.google.android.gms.internal.mlkit_vision_barcode_bundled.p1 r21) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdl {
        /*
            Method dump skipped, instructions count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.mo3850i(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.p1):void");
    }

    /* renamed from: j */
    public final void m3984j(int i10, Object obj, Object obj2) {
        if (m3990p(i10, obj2)) {
            int iM3995z = m3995z(i10) & 1048575;
            Unsafe unsafe = f6677m;
            long j6 = iM3995z;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6678a[i10] + " is present but null: " + obj2.toString());
            }
            e2 e2VarM3981C = m3981C(i10);
            if (!m3990p(i10, obj)) {
                if (m3975r(object)) {
                    Object objMo3842a = e2VarM3981C.mo3842a();
                    e2VarM3981C.mo3848g(objMo3842a, object);
                    unsafe.putObject(obj, j6, objMo3842a);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                m3986l(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m3975r(object2)) {
                Object objMo3842a2 = e2VarM3981C.mo3842a();
                e2VarM3981C.mo3848g(objMo3842a2, object2);
                unsafe.putObject(obj, j6, objMo3842a2);
                object2 = objMo3842a2;
            }
            e2VarM3981C.mo3848g(object2, object);
        }
    }

    /* renamed from: k */
    public final void m3985k(int i10, Object obj, Object obj2) {
        int[] iArr = this.f6678a;
        int i11 = iArr[i10];
        if (m3992s(i11, obj2, i10)) {
            int iM3995z = m3995z(i10) & 1048575;
            Unsafe unsafe = f6677m;
            long j6 = iM3995z;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            e2 e2VarM3981C = m3981C(i10);
            if (!m3992s(i11, obj, i10)) {
                if (m3975r(object)) {
                    Object objMo3842a = e2VarM3981C.mo3842a();
                    e2VarM3981C.mo3848g(objMo3842a, object);
                    unsafe.putObject(obj, j6, objMo3842a);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                n2.m3924j(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m3975r(object2)) {
                Object objMo3842a2 = e2VarM3981C.mo3842a();
                e2VarM3981C.mo3848g(objMo3842a2, object2);
                unsafe.putObject(obj, j6, objMo3842a2);
                object2 = objMo3842a2;
            }
            e2VarM3981C.mo3848g(object2, object);
        }
    }

    /* renamed from: l */
    public final void m3986l(int i10, Object obj) {
        int i11 = this.f6678a[i10 + 2];
        long j6 = 1048575 & i11;
        if (j6 == 1048575) {
            return;
        }
        n2.m3924j((1 << (i11 >>> 20)) | n2.m3919e(j6, obj), j6, obj);
    }

    /* renamed from: m */
    public final void m3987m(int i10, Object obj, Object obj2) {
        f6677m.putObject(obj, m3995z(i10) & 1048575, obj2);
        m3986l(i10, obj);
    }

    /* renamed from: n */
    public final void m3988n(Object obj, int i10, Object obj2, int i11) {
        f6677m.putObject(obj, m3995z(i11) & 1048575, obj2);
        n2.m3924j(i10, this.f6678a[i11 + 2] & 1048575, obj);
    }

    /* renamed from: o */
    public final boolean m3989o(e1 e1Var, e1 e1Var2, int i10) {
        return m3990p(i10, e1Var) == m3990p(i10, e1Var2);
    }

    /* renamed from: p */
    public final boolean m3990p(int i10, Object obj) {
        int i11 = this.f6678a[i10 + 2];
        long j6 = i11 & 1048575;
        if (j6 == 1048575) {
            int iM3995z = m3995z(i10);
            long j10 = iM3995z & 1048575;
            switch (m3979y(iM3995z)) {
                case 0:
                    if (Double.doubleToRawLongBits(n2.f6616c.mo3908a(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(n2.f6616c.mo3909b(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (n2.m3920f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (n2.m3920f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (n2.m3919e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (n2.m3920f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (n2.m3919e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return n2.f6616c.mo3914g(j10, obj);
                case 8:
                    Object objM3922h = n2.m3922h(j10, obj);
                    if (objM3922h instanceof String) {
                        if (((String) objM3922h).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM3922h instanceof r0)) {
                            throw new IllegalArgumentException();
                        }
                        if (r0.f6641b.equals(objM3922h)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (n2.m3922h(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (r0.f6641b.equals(n2.m3922h(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (n2.m3919e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (n2.m3919e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (n2.m3919e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (n2.m3920f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    if (n2.m3919e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (n2.m3920f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (n2.m3922h(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & n2.m3919e(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m3991q(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m3990p(i10, obj) : (i12 & i13) != 0;
    }

    /* renamed from: s */
    public final boolean m3992s(int i10, Object obj, int i11) {
        return n2.m3919e((long) (this.f6678a[i11 + 2] & 1048575), obj) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: t */
    public final int m3993t(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 r40) {
        /*
            Method dump skipped, instructions count: 3644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1.m3993t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0):int");
    }

    /* renamed from: x */
    public final int m3994x(int i10, int i11) {
        int[] iArr = this.f6678a;
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

    /* renamed from: z */
    public final int m3995z(int i10) {
        return this.f6678a[i10 + 1];
    }
}
