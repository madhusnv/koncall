package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Api;
import com.google.api.Service;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.um5;
import p001o.wm5;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzts<T> implements zzua<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzvb.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zztp zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final zztd zzj;
    private final zzur zzk;
    private final zzrx zzl;
    private final zztu zzm;
    private final zztk zzn;

    private zzts(int[] iArr, Object[] objArr, int i, int i2, zztp zztpVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zztu zztuVar, zztd zztdVar, zzur zzurVar, zzrx zzrxVar, zztk zztkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z;
        boolean z3 = false;
        if (zzrxVar != null && zzrxVar.zzc(zztpVar)) {
            z3 = true;
        }
        this.zzf = z3;
        this.zzh = iArr2;
        this.zzi = i3;
        this.zzm = zztuVar;
        this.zzj = zztdVar;
        this.zzk = zzurVar;
        this.zzl = zzrxVar;
        this.zze = zztpVar;
        this.zzn = zztkVar;
    }

    private final boolean zzA(Object obj, int i) {
        int iZzn = zzn(i);
        long j = iZzn & 1048575;
        if (j != 1048575) {
            return (zzvb.zzc(obj, j) & (1 << (iZzn >>> 20))) != 0;
        }
        int iZzp = zzp(i);
        long j2 = iZzp & 1048575;
        switch (zzo(iZzp)) {
            case 0:
                return Double.doubleToRawLongBits(zzvb.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzvb.zzb(obj, j2)) != 0;
            case 2:
                return zzvb.zzd(obj, j2) != 0;
            case 3:
                return zzvb.zzd(obj, j2) != 0;
            case 4:
                return zzvb.zzc(obj, j2) != 0;
            case 5:
                return zzvb.zzd(obj, j2) != 0;
            case 6:
                return zzvb.zzc(obj, j2) != 0;
            case 7:
                return zzvb.zzw(obj, j2);
            case 8:
                Object objZzf = zzvb.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzrm) {
                    return !zzrm.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzvb.zzf(obj, j2) != null;
            case 10:
                return !zzrm.zzb.equals(zzvb.zzf(obj, j2));
            case 11:
                return zzvb.zzc(obj, j2) != 0;
            case 12:
                return zzvb.zzc(obj, j2) != 0;
            case 13:
                return zzvb.zzc(obj, j2) != 0;
            case 14:
                return zzvb.zzd(obj, j2) != 0;
            case 15:
                return zzvb.zzc(obj, j2) != 0;
            case 16:
                return zzvb.zzd(obj, j2) != 0;
            case 17:
                return zzvb.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzB(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzA(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzC(Object obj, int i, zzua zzuaVar) {
        return zzuaVar.zzh(zzvb.zzf(obj, i & 1048575));
    }

    private static boolean zzD(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzsh) {
            return ((zzsh) obj).zzJ();
        }
        return true;
    }

    private final boolean zzE(Object obj, int i, int i2) {
        return zzvb.zzc(obj, (long) (zzn(i2) & 1048575)) == i;
    }

    private static boolean zzF(Object obj, long j) {
        return ((Boolean) zzvb.zzf(obj, j)).booleanValue();
    }

    private static final void zzG(int i, Object obj, zzvi zzviVar) {
        if (obj instanceof String) {
            zzviVar.zzD(i, (String) obj);
        } else {
            zzviVar.zzd(i, (zzrm) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0372  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzts zzi(Class cls, zztm zztmVar, zztu zztuVar, zztd zztdVar, zzur zzurVar, zzrx zzrxVar, zztk zztkVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        Field fieldZzt;
        char cCharAt9;
        int i19;
        int i20;
        int i21;
        Object obj;
        Field fieldZzt2;
        Object obj2;
        Field fieldZzt3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        if (!(zztmVar instanceof zztz)) {
            throw null;
        }
        zztz zztzVar = (zztz) zztmVar;
        int iZzc = zztzVar.zzc();
        String strZzd = zztzVar.zzd();
        int length = strZzd.length();
        int i26 = 0;
        int i27 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (strZzd.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i30 = iCharAt3 & 8191;
            int i31 = 13;
            while (true) {
                i25 = i29 + 1;
                cCharAt13 = strZzd.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i25;
            }
            iCharAt3 = i30 | (cCharAt13 << i31);
            i29 = i25;
        }
        if (iCharAt3 == 0) {
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i5 = 0;
            i4 = 0;
            iArr = zza;
            i2 = 0;
        } else {
            int i32 = i29 + 1;
            int iCharAt4 = strZzd.charAt(i29);
            if (iCharAt4 >= 55296) {
                int i33 = iCharAt4 & 8191;
                int i34 = 13;
                while (true) {
                    i13 = i32 + 1;
                    cCharAt8 = strZzd.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i13;
                }
                iCharAt4 = i33 | (cCharAt8 << i34);
                i32 = i13;
            }
            int i35 = i32 + 1;
            int iCharAt5 = strZzd.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i12 = i35 + 1;
                    cCharAt7 = strZzd.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i12;
                }
                iCharAt5 = i36 | (cCharAt7 << i37);
                i35 = i12;
            }
            int i38 = i35 + 1;
            int iCharAt6 = strZzd.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i11 = i38 + 1;
                    cCharAt6 = strZzd.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i11;
                }
                iCharAt6 = i39 | (cCharAt6 << i40);
                i38 = i11;
            }
            int i41 = i38 + 1;
            int iCharAt7 = strZzd.charAt(i38);
            if (iCharAt7 >= 55296) {
                int i42 = iCharAt7 & 8191;
                int i43 = 13;
                while (true) {
                    i10 = i41 + 1;
                    cCharAt5 = strZzd.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i10;
                }
                iCharAt7 = i42 | (cCharAt5 << i43);
                i41 = i10;
            }
            int i44 = i41 + 1;
            iCharAt = strZzd.charAt(i41);
            if (iCharAt >= 55296) {
                int i45 = iCharAt & 8191;
                int i46 = 13;
                while (true) {
                    i9 = i44 + 1;
                    cCharAt4 = strZzd.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i9;
                }
                iCharAt = i45 | (cCharAt4 << i46);
                i44 = i9;
            }
            int i47 = i44 + 1;
            iCharAt2 = strZzd.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i8 = i47 + 1;
                    cCharAt3 = strZzd.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i8;
                }
                iCharAt2 = i48 | (cCharAt3 << i49);
                i47 = i8;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strZzd.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i7 = i50 + 1;
                    cCharAt2 = strZzd.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i7;
                }
                iCharAt8 = i51 | (cCharAt2 << i52);
                i50 = i7;
            }
            int i53 = i50 + 1;
            int iCharAt9 = strZzd.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = i53;
                int i56 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt = strZzd.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i55 = i6;
                }
                iCharAt9 = i54 | (cCharAt << i56);
                i53 = i6;
            }
            int i57 = iCharAt9 + iCharAt2 + iCharAt8;
            int i58 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[i57];
            i26 = iCharAt4;
            iArr = iArr2;
            i2 = iCharAt6;
            i3 = i58;
            i4 = iCharAt9;
            i29 = i53;
            i5 = iCharAt7;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zztzVar.zze();
        Class<?> cls2 = zztzVar.zza().getClass();
        int i59 = i4 + iCharAt2;
        int i60 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i60];
        int i61 = i4;
        int i62 = i59;
        int i63 = 0;
        int i64 = 0;
        while (true) {
            boolean z = iZzc == 2;
            if (i29 >= length) {
                return new zzts(iArr3, objArr2, i2, i5, zztzVar.zza(), z, false, iArr, i4, i59, zztuVar, zztdVar, zzurVar, zzrxVar, zztkVar);
            }
            int i65 = i29 + 1;
            int iCharAt10 = strZzd.charAt(i29);
            if (iCharAt10 >= i27) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i24 = i67 + 1;
                    cCharAt12 = strZzd.charAt(i67);
                    i14 = iZzc;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i24;
                    iZzc = i14;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i15 = i24;
            } else {
                i14 = iZzc;
                i15 = i65;
            }
            int i69 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            int i70 = length;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i71 = iCharAt11 & 8191;
                int i72 = 13;
                while (true) {
                    i23 = i69 + 1;
                    cCharAt11 = strZzd.charAt(i69);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i69 = i23;
                    c = 55296;
                }
                iCharAt11 = i71 | (cCharAt11 << i72);
                i69 = i23;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i73 = iCharAt11 & Constants.MAX_HOST_LENGTH;
            int i74 = i5;
            if (i73 >= 51) {
                int i75 = i69 + 1;
                int iCharAt12 = strZzd.charAt(i69);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i22 = i77 + 1;
                        cCharAt10 = strZzd.charAt(i77);
                        i16 = i2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i77 = i22;
                        i2 = i16;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i78);
                    i20 = i22;
                } else {
                    i16 = i2;
                    i20 = i75;
                }
                int i79 = i73 - 51;
                int i80 = i20;
                if (i79 == 9 || i79 == 17) {
                    int i81 = i64 / 3;
                    i21 = i3 + 1;
                    objArr2[i81 + i81 + 1] = objArrZze[i3];
                } else {
                    if (i79 == 12 && !z) {
                        int i82 = i64 / 3;
                        i21 = i3 + 1;
                        objArr2[i82 + i82 + 1] = objArrZze[i3];
                    }
                    int i83 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i83];
                    if (obj instanceof Field) {
                        fieldZzt2 = zzt(cls2, (String) obj);
                        objArrZze[i83] = fieldZzt2;
                    } else {
                        fieldZzt2 = (Field) obj;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzt2);
                    int i84 = i83 + 1;
                    obj2 = objArrZze[i84];
                    if (obj2 instanceof Field) {
                        fieldZzt3 = zzt(cls2, (String) obj2);
                        objArrZze[i84] = fieldZzt3;
                    } else {
                        fieldZzt3 = (Field) obj2;
                    }
                    iObjectFieldOffset = iObjectFieldOffset3;
                    objArr = objArrZze;
                    i17 = i80;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzt3);
                    i18 = 0;
                }
                i3 = i21;
                int i832 = iCharAt12 + iCharAt12;
                obj = objArrZze[i832];
                if (obj instanceof Field) {
                }
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldZzt2);
                int i842 = i832 + 1;
                obj2 = objArrZze[i842];
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset = iObjectFieldOffset32;
                objArr = objArrZze;
                i17 = i80;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzt3);
                i18 = 0;
            } else {
                i16 = i2;
                int i85 = i3 + 1;
                Field fieldZzt4 = zzt(cls2, (String) objArrZze[i3]);
                if (i73 == 9 || i73 == 17) {
                    int i86 = i64 / 3;
                    objArr2[i86 + i86 + 1] = fieldZzt4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i87 = i64 / 3;
                        i19 = i85 + 1;
                        objArr2[i87 + i87 + 1] = objArrZze[i85];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i88 = i64 / 3;
                            i19 = i85 + 1;
                            objArr2[i88 + i88 + 1] = objArrZze[i85];
                        }
                    } else if (i73 == 50) {
                        int i89 = i61 + 1;
                        iArr[i61] = i64;
                        int i90 = i64 / 3;
                        int i91 = i85 + 1;
                        int i92 = i90 + i90;
                        objArr2[i92] = objArrZze[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            i85 = i91 + 1;
                            objArr2[i92 + 1] = objArrZze[i91];
                            i61 = i89;
                        } else {
                            objArr = objArrZze;
                            i85 = i91;
                            i61 = i89;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzt4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt11 & 4096) == 4096 || i73 > 17) {
                                i17 = i69;
                                i18 = 0;
                            } else {
                                int i93 = i69 + 1;
                                int iCharAt13 = strZzd.charAt(i69);
                                if (iCharAt13 >= 55296) {
                                    int i94 = iCharAt13 & 8191;
                                    int i95 = 13;
                                    while (true) {
                                        i17 = i93 + 1;
                                        cCharAt9 = strZzd.charAt(i93);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i94 |= (cCharAt9 & 8191) << i95;
                                        i95 += 13;
                                        i93 = i17;
                                    }
                                    iCharAt13 = i94 | (cCharAt9 << i95);
                                } else {
                                    i17 = i93;
                                }
                                int i96 = i26 + i26 + (iCharAt13 / 32);
                                Object obj3 = objArr[i96];
                                if (obj3 instanceof Field) {
                                    fieldZzt = (Field) obj3;
                                } else {
                                    fieldZzt = zzt(cls2, (String) obj3);
                                    objArr[i96] = fieldZzt;
                                }
                                i18 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzt);
                            }
                            if (i73 >= 18 && i73 <= 49) {
                                iArr[i62] = iObjectFieldOffset;
                                i62++;
                            }
                            i3 = i85;
                        }
                    }
                    i85 = i19;
                }
                objArr = objArrZze;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzt4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) == 4096) {
                    i17 = i69;
                    i18 = 0;
                    if (i73 >= 18) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                    i3 = i85;
                }
            }
            int i97 = i64 + 1;
            iArr3[i64] = iCharAt10;
            int i98 = i97 + 1;
            iArr3[i97] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | iObjectFieldOffset;
            i64 = i98 + 1;
            iArr3[i98] = (i18 << 20) | iObjectFieldOffset2;
            objArrZze = objArr;
            length = i70;
            i29 = i17;
            i5 = i74;
            iZzc = i14;
            i2 = i16;
            i27 = 55296;
        }
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzvb.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzvb.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzl(Object obj) {
        int i;
        int iZzx;
        int iZzx2;
        int iZzy;
        int iZzx3;
        int iZzx4;
        int iZzx5;
        int iZzx6;
        int iZzt;
        boolean z;
        int iZzc;
        int iZzh;
        int iZzx7;
        int iZzx8;
        int iZzx9;
        int iZzx10;
        int iZzx11;
        int iZzx12;
        int iZzx13;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int iZzx14 = 0;
        int i5 = 0;
        while (i4 < this.zzc.length) {
            int iZzp = zzp(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int iZzo = zzo(iZzp);
            if (iZzo <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                int i9 = i7 >>> 20;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << i9;
            } else {
                i = 0;
            }
            long j = iZzp & i2;
            switch (iZzo) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx = zzru.zzx(i6 << 3);
                        iZzx4 = iZzx + 8;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx2 = zzru.zzx(i6 << 3);
                        iZzx4 = iZzx2 + 4;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzy = zzru.zzy(unsafe.getLong(obj, j));
                        iZzx3 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx3 + iZzy;
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzy = zzru.zzy(unsafe.getLong(obj, j));
                        iZzx3 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx3 + iZzy;
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzy = zzru.zzu(unsafe.getInt(obj, j));
                        iZzx3 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx3 + iZzy;
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx = zzru.zzx(i6 << 3);
                        iZzx4 = iZzx + 8;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx2 = zzru.zzx(i6 << 3);
                        iZzx4 = iZzx2 + 4;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx4 = zzru.zzx(i6 << 3) + 1;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzrm)) {
                            iZzy = zzru.zzw((String) object);
                            iZzx3 = zzru.zzx(i6 << 3);
                            iZzx14 += iZzx3 + iZzy;
                            break;
                        } else {
                            int i10 = zzru.zzb;
                            int iZzd = ((zzrm) object).zzd();
                            iZzx5 = zzru.zzx(iZzd) + iZzd;
                            iZzx6 = zzru.zzx(i6 << 3);
                            iZzx4 = iZzx6 + iZzx5;
                            iZzx14 += iZzx4;
                            break;
                        }
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx4 = zzuc.zzn(i6, unsafe.getObject(obj, j), zzr(i4));
                        iZzx14 += iZzx4;
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzrm zzrmVar = (zzrm) unsafe.getObject(obj, j);
                        int i11 = zzru.zzb;
                        int iZzd2 = zzrmVar.zzd();
                        iZzx5 = zzru.zzx(iZzd2) + iZzd2;
                        iZzx6 = zzru.zzx(i6 << 3);
                        iZzx4 = iZzx6 + iZzx5;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzy = zzru.zzx(unsafe.getInt(obj, j));
                        iZzx3 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx3 + iZzy;
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzy = zzru.zzu(unsafe.getInt(obj, j));
                        iZzx3 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx3 + iZzy;
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx2 = zzru.zzx(i6 << 3);
                        iZzx4 = iZzx2 + 4;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx = zzru.zzx(i6 << 3);
                        iZzx4 = iZzx + 8;
                        iZzx14 += iZzx4;
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        iZzx3 = zzru.zzx(i6 << 3);
                        iZzy = zzru.zzx((i12 >> 31) ^ (i12 + i12));
                        iZzx14 += iZzx3 + iZzy;
                        break;
                    }
                case 16:
                    if ((i & i5) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        iZzx14 += zzru.zzx(i6 << 3) + zzru.zzy((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        iZzx4 = zzru.zzt(i6, (zztp) unsafe.getObject(obj, j), zzr(i4));
                        iZzx14 += iZzx4;
                        break;
                    }
                case 18:
                    iZzx4 = zzuc.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 19:
                    iZzx4 = zzuc.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 20:
                    iZzx4 = zzuc.zzl(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 21:
                    iZzx4 = zzuc.zzw(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 22:
                    iZzx4 = zzuc.zzj(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 23:
                    iZzx4 = zzuc.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 24:
                    iZzx4 = zzuc.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 25:
                    iZzx4 = zzuc.zza(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzx4;
                    break;
                case 26:
                    iZzt = zzuc.zzt(i6, (List) unsafe.getObject(obj, j));
                    iZzx14 += iZzt;
                    break;
                case 27:
                    iZzt = zzuc.zzo(i6, (List) unsafe.getObject(obj, j), zzr(i4));
                    iZzx14 += iZzt;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iZzt = zzuc.zzb(i6, (List) unsafe.getObject(obj, j));
                    iZzx14 += iZzt;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iZzt = zzuc.zzu(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzt;
                    break;
                case 30:
                    z = false;
                    iZzc = zzuc.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzc;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z = false;
                    iZzc = zzuc.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzc;
                    break;
                case 32:
                    z = false;
                    iZzc = zzuc.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzc;
                    break;
                case 33:
                    z = false;
                    iZzc = zzuc.zzp(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzc;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z = false;
                    iZzc = zzuc.zzr(i6, (List) unsafe.getObject(obj, j), false);
                    iZzx14 += iZzc;
                    break;
                case 35:
                    iZzh = zzuc.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iZzh = zzuc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 37:
                    iZzh = zzuc.zzm((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 38:
                    iZzh = zzuc.zzx((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iZzh = zzuc.zzk((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 40:
                    iZzh = zzuc.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iZzh = zzuc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzuc.zza;
                    iZzh = list.size();
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    iZzh = zzuc.zzv((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iZzh = zzuc.zzd((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 45:
                    iZzh = zzuc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 46:
                    iZzh = zzuc.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 47:
                    iZzh = zzuc.zzq((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 48:
                    iZzh = zzuc.zzs((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzx7 = zzru.zzx(iZzh);
                        iZzx8 = zzru.zzx(i6 << 3);
                        iZzx9 = iZzx8 + iZzx7;
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 49:
                    iZzt = zzuc.zzi(i6, (List) unsafe.getObject(obj, j), zzr(i4));
                    iZzx14 += iZzt;
                    break;
                case 50:
                    zztk.zza(i6, unsafe.getObject(obj, j), zzs(i4));
                    break;
                case 51:
                    if (zzE(obj, i6, i4)) {
                        iZzx10 = zzru.zzx(i6 << 3);
                        iZzt = iZzx10 + 8;
                        iZzx14 += iZzt;
                    }
                    break;
                case 52:
                    if (zzE(obj, i6, i4)) {
                        iZzx11 = zzru.zzx(i6 << 3);
                        iZzt = iZzx11 + 4;
                        iZzx14 += iZzt;
                    }
                    break;
                case 53:
                    if (zzE(obj, i6, i4)) {
                        iZzh = zzru.zzy(zzq(obj, j));
                        iZzx9 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 54:
                    if (zzE(obj, i6, i4)) {
                        iZzh = zzru.zzy(zzq(obj, j));
                        iZzx9 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 55:
                    if (zzE(obj, i6, i4)) {
                        iZzh = zzru.zzu(zzm(obj, j));
                        iZzx9 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 56:
                    if (zzE(obj, i6, i4)) {
                        iZzx10 = zzru.zzx(i6 << 3);
                        iZzt = iZzx10 + 8;
                        iZzx14 += iZzt;
                    }
                    break;
                case 57:
                    if (zzE(obj, i6, i4)) {
                        iZzx11 = zzru.zzx(i6 << 3);
                        iZzt = iZzx11 + 4;
                        iZzx14 += iZzt;
                    }
                    break;
                case 58:
                    if (zzE(obj, i6, i4)) {
                        iZzt = zzru.zzx(i6 << 3) + 1;
                        iZzx14 += iZzt;
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (zzE(obj, i6, i4)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzrm) {
                            int i14 = zzru.zzb;
                            int iZzd3 = ((zzrm) object2).zzd();
                            iZzx12 = zzru.zzx(iZzd3) + iZzd3;
                            iZzx13 = zzru.zzx(i6 << 3);
                            iZzt = iZzx13 + iZzx12;
                            iZzx14 += iZzt;
                        } else {
                            iZzh = zzru.zzw((String) object2);
                            iZzx9 = zzru.zzx(i6 << 3);
                            iZzx14 += iZzx9 + iZzh;
                        }
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (zzE(obj, i6, i4)) {
                        iZzt = zzuc.zzn(i6, unsafe.getObject(obj, j), zzr(i4));
                        iZzx14 += iZzt;
                    }
                    break;
                case 61:
                    if (zzE(obj, i6, i4)) {
                        zzrm zzrmVar2 = (zzrm) unsafe.getObject(obj, j);
                        int i15 = zzru.zzb;
                        int iZzd4 = zzrmVar2.zzd();
                        iZzx12 = zzru.zzx(iZzd4) + iZzd4;
                        iZzx13 = zzru.zzx(i6 << 3);
                        iZzt = iZzx13 + iZzx12;
                        iZzx14 += iZzt;
                    }
                    break;
                case 62:
                    if (zzE(obj, i6, i4)) {
                        iZzh = zzru.zzx(zzm(obj, j));
                        iZzx9 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 63:
                    if (zzE(obj, i6, i4)) {
                        iZzh = zzru.zzu(zzm(obj, j));
                        iZzx9 = zzru.zzx(i6 << 3);
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case 64:
                    if (zzE(obj, i6, i4)) {
                        iZzx11 = zzru.zzx(i6 << 3);
                        iZzt = iZzx11 + 4;
                        iZzx14 += iZzt;
                    }
                    break;
                case 65:
                    if (zzE(obj, i6, i4)) {
                        iZzx10 = zzru.zzx(i6 << 3);
                        iZzt = iZzx10 + 8;
                        iZzx14 += iZzt;
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzE(obj, i6, i4)) {
                        int iZzm = zzm(obj, j);
                        iZzx9 = zzru.zzx(i6 << 3);
                        iZzh = zzru.zzx((iZzm >> 31) ^ (iZzm + iZzm));
                        iZzx14 += iZzx9 + iZzh;
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzE(obj, i6, i4)) {
                        long jZzq = zzq(obj, j);
                        iZzx14 += zzru.zzx(i6 << 3) + zzru.zzy((jZzq >> 63) ^ (jZzq + jZzq));
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (zzE(obj, i6, i4)) {
                        iZzt = zzru.zzt(i6, (zztp) unsafe.getObject(obj, j), zzr(i4));
                        iZzx14 += iZzt;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzur zzurVar = this.zzk;
        int iZza = iZzx14 + zzurVar.zza(zzurVar.zzc(obj));
        if (!this.zzf) {
            return iZza;
        }
        this.zzl.zza(obj);
        throw null;
    }

    private static int zzm(Object obj, long j) {
        return ((Integer) zzvb.zzf(obj, j)).intValue();
    }

    private final int zzn(int i) {
        return this.zzc[i + 2];
    }

    private static int zzo(int i) {
        return (i >>> 20) & Constants.MAX_HOST_LENGTH;
    }

    private final int zzp(int i) {
        return this.zzc[i + 1];
    }

    private static long zzq(Object obj, long j) {
        return ((Long) zzvb.zzf(obj, j)).longValue();
    }

    private final zzua zzr(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzua zzuaVar = (zzua) this.zzd[i3];
        if (zzuaVar != null) {
            return zzuaVar;
        }
        zzua zzuaVarZzb = zztx.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzuaVarZzb;
        return zzuaVarZzb;
    }

    private final Object zzs(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzt(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzu(Object obj, Object obj2, int i) {
        if (zzA(obj2, i)) {
            int iZzp = zzp(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzua zzuaVarZzr = zzr(i);
            if (!zzA(obj, i)) {
                if (zzD(object)) {
                    Object objZzc = zzuaVarZzr.zzc();
                    zzuaVarZzr.zze(objZzc, object);
                    unsafe.putObject(obj, j, objZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzw(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzD(object2)) {
                Object objZzc2 = zzuaVarZzr.zzc();
                zzuaVarZzr.zze(objZzc2, object2);
                unsafe.putObject(obj, j, objZzc2);
                object2 = objZzc2;
            }
            zzuaVarZzr.zze(object2, object);
        }
    }

    private final void zzv(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzE(obj2, i2, i)) {
            int iZzp = zzp(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzua zzuaVarZzr = zzr(i);
            if (!zzE(obj, i2, i)) {
                if (zzD(object)) {
                    Object objZzc = zzuaVarZzr.zzc();
                    zzuaVarZzr.zze(objZzc, object);
                    unsafe.putObject(obj, j, objZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzx(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzD(object2)) {
                Object objZzc2 = zzuaVarZzr.zzc();
                zzuaVarZzr.zze(objZzc2, object2);
                unsafe.putObject(obj, j, objZzc2);
                object2 = objZzc2;
            }
            zzuaVarZzr.zze(object2, object);
        }
    }

    private final void zzw(Object obj, int i) {
        int iZzn = zzn(i);
        long j = 1048575 & iZzn;
        if (j == 1048575) {
            return;
        }
        zzvb.zzq(obj, j, (1 << (iZzn >>> 20)) | zzvb.zzc(obj, j));
    }

    private final void zzx(Object obj, int i, int i2) {
        zzvb.zzq(obj, zzn(i2) & 1048575, i);
    }

    private final void zzy(zzvi zzviVar, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzz(Object obj, Object obj2, int i) {
        return zzA(obj, i) == zzA(obj2, i);
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final int zza(Object obj) {
        int iZzx;
        int iZzx2;
        int iZzy;
        int iZzx3;
        int iZzx4;
        int iZzx5;
        int iZzx6;
        int iZzn;
        int iZzx7;
        int iZzy2;
        int iZzx8;
        int iZzx9;
        if (!this.zzg) {
            return zzl(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzp = zzp(i2);
            int iZzo = zzo(iZzp);
            int i3 = this.zzc[i2];
            int i4 = iZzp & 1048575;
            if (iZzo >= zzsc.zzJ.zza() && iZzo <= zzsc.zzW.zza()) {
                int i5 = this.zzc[i2 + 2];
            }
            long j = i4;
            switch (iZzo) {
                case 0:
                    if (zzA(obj, i2)) {
                        iZzx = zzru.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj, i2)) {
                        iZzx2 = zzru.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj, i2)) {
                        iZzy = zzru.zzy(zzvb.zzd(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj, i2)) {
                        iZzy = zzru.zzy(zzvb.zzd(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj, i2)) {
                        iZzy = zzru.zzu(zzvb.zzc(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj, i2)) {
                        iZzx = zzru.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj, i2)) {
                        iZzx2 = zzru.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj, i2)) {
                        iZzx4 = zzru.zzx(i3 << 3);
                        iZzn = iZzx4 + 1;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzA(obj, i2)) {
                        Object objZzf = zzvb.zzf(obj, j);
                        if (objZzf instanceof zzrm) {
                            int i6 = i3 << 3;
                            int i7 = zzru.zzb;
                            int iZzd = ((zzrm) objZzf).zzd();
                            iZzx5 = zzru.zzx(iZzd) + iZzd;
                            iZzx6 = zzru.zzx(i6);
                            iZzn = iZzx6 + iZzx5;
                            i += iZzn;
                            break;
                        } else {
                            iZzy = zzru.zzw((String) objZzf);
                            iZzx3 = zzru.zzx(i3 << 3);
                            i += iZzx3 + iZzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzA(obj, i2)) {
                        iZzn = zzuc.zzn(i3, zzvb.zzf(obj, j), zzr(i2));
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzA(obj, i2)) {
                        zzrm zzrmVar = (zzrm) zzvb.zzf(obj, j);
                        int i8 = i3 << 3;
                        int i9 = zzru.zzb;
                        int iZzd2 = zzrmVar.zzd();
                        iZzx5 = zzru.zzx(iZzd2) + iZzd2;
                        iZzx6 = zzru.zzx(i8);
                        iZzn = iZzx6 + iZzx5;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj, i2)) {
                        iZzy = zzru.zzx(zzvb.zzc(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj, i2)) {
                        iZzy = zzru.zzu(zzvb.zzc(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj, i2)) {
                        iZzx2 = zzru.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj, i2)) {
                        iZzx = zzru.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj, i2)) {
                        int iZzc = zzvb.zzc(obj, j);
                        iZzx3 = zzru.zzx(i3 << 3);
                        iZzy = zzru.zzx((iZzc >> 31) ^ (iZzc + iZzc));
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj, i2)) {
                        long jZzd = zzvb.zzd(obj, j);
                        iZzx7 = zzru.zzx(i3 << 3);
                        iZzy2 = zzru.zzy((jZzd + jZzd) ^ (jZzd >> 63));
                        iZzn = iZzx7 + iZzy2;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzA(obj, i2)) {
                        iZzn = zzru.zzt(i3, (zztp) zzvb.zzf(obj, j), zzr(i2));
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iZzn = zzuc.zzg(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 19:
                    iZzn = zzuc.zze(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 20:
                    iZzn = zzuc.zzl(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 21:
                    iZzn = zzuc.zzw(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 22:
                    iZzn = zzuc.zzj(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 23:
                    iZzn = zzuc.zzg(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 24:
                    iZzn = zzuc.zze(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 25:
                    iZzn = zzuc.zza(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 26:
                    iZzn = zzuc.zzt(i3, (List) zzvb.zzf(obj, j));
                    i += iZzn;
                    break;
                case 27:
                    iZzn = zzuc.zzo(i3, (List) zzvb.zzf(obj, j), zzr(i2));
                    i += iZzn;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iZzn = zzuc.zzb(i3, (List) zzvb.zzf(obj, j));
                    i += iZzn;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iZzn = zzuc.zzu(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 30:
                    iZzn = zzuc.zzc(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iZzn = zzuc.zze(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 32:
                    iZzn = zzuc.zzg(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 33:
                    iZzn = zzuc.zzp(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iZzn = zzuc.zzr(i3, (List) zzvb.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 35:
                    iZzy = zzuc.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i10 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i10);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iZzy = zzuc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i11 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i11);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZzy = zzuc.zzm((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i12 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i12);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZzy = zzuc.zzx((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i13 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i13);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iZzy = zzuc.zzk((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i14 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i14);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZzy = zzuc.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i15 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i15);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iZzy = zzuc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i16 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i16);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzuc.zza;
                    iZzy = list.size();
                    if (iZzy > 0) {
                        int i18 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i18);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case SignatureVisitor.EXTENDS /* 43 */:
                    iZzy = zzuc.zzv((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i19 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i19);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iZzy = zzuc.zzd((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i20 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i20);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZzy = zzuc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i21 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i21);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZzy = zzuc.zzh((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i22 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i22);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZzy = zzuc.zzq((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i23 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i23);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZzy = zzuc.zzs((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        int i24 = i3 << 3;
                        iZzx8 = zzru.zzx(iZzy);
                        iZzx9 = zzru.zzx(i24);
                        iZzx3 = iZzx9 + iZzx8;
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iZzn = zzuc.zzi(i3, (List) zzvb.zzf(obj, j), zzr(i2));
                    i += iZzn;
                    break;
                case 50:
                    zztk.zza(i3, zzvb.zzf(obj, j), zzs(i2));
                    break;
                case 51:
                    if (zzE(obj, i3, i2)) {
                        iZzx = zzru.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzE(obj, i3, i2)) {
                        iZzx2 = zzru.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzE(obj, i3, i2)) {
                        iZzy = zzru.zzy(zzq(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzE(obj, i3, i2)) {
                        iZzy = zzru.zzy(zzq(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzE(obj, i3, i2)) {
                        iZzy = zzru.zzu(zzm(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzE(obj, i3, i2)) {
                        iZzx = zzru.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzE(obj, i3, i2)) {
                        iZzx2 = zzru.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzE(obj, i3, i2)) {
                        iZzx4 = zzru.zzx(i3 << 3);
                        iZzn = iZzx4 + 1;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzE(obj, i3, i2)) {
                        Object objZzf2 = zzvb.zzf(obj, j);
                        if (objZzf2 instanceof zzrm) {
                            int i25 = i3 << 3;
                            int i26 = zzru.zzb;
                            int iZzd3 = ((zzrm) objZzf2).zzd();
                            iZzx5 = zzru.zzx(iZzd3) + iZzd3;
                            iZzx6 = zzru.zzx(i25);
                            iZzn = iZzx6 + iZzx5;
                            i += iZzn;
                            break;
                        } else {
                            iZzy = zzru.zzw((String) objZzf2);
                            iZzx3 = zzru.zzx(i3 << 3);
                            i += iZzx3 + iZzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzE(obj, i3, i2)) {
                        iZzn = zzuc.zzn(i3, zzvb.zzf(obj, j), zzr(i2));
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzE(obj, i3, i2)) {
                        zzrm zzrmVar2 = (zzrm) zzvb.zzf(obj, j);
                        int i27 = i3 << 3;
                        int i28 = zzru.zzb;
                        int iZzd4 = zzrmVar2.zzd();
                        iZzx5 = zzru.zzx(iZzd4) + iZzd4;
                        iZzx6 = zzru.zzx(i27);
                        iZzn = iZzx6 + iZzx5;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzE(obj, i3, i2)) {
                        iZzy = zzru.zzx(zzm(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzE(obj, i3, i2)) {
                        iZzy = zzru.zzu(zzm(obj, j));
                        iZzx3 = zzru.zzx(i3 << 3);
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzE(obj, i3, i2)) {
                        iZzx2 = zzru.zzx(i3 << 3);
                        iZzn = iZzx2 + 4;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzE(obj, i3, i2)) {
                        iZzx = zzru.zzx(i3 << 3);
                        iZzn = iZzx + 8;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzE(obj, i3, i2)) {
                        int iZzm = zzm(obj, j);
                        iZzx3 = zzru.zzx(i3 << 3);
                        iZzy = zzru.zzx((iZzm >> 31) ^ (iZzm + iZzm));
                        i += iZzx3 + iZzy;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzE(obj, i3, i2)) {
                        long jZzq = zzq(obj, j);
                        iZzx7 = zzru.zzx(i3 << 3);
                        iZzy2 = zzru.zzy((jZzq + jZzq) ^ (jZzq >> 63));
                        iZzn = iZzx7 + iZzy2;
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzE(obj, i3, i2)) {
                        iZzn = zzru.zzt(i3, (zztp) zzvb.zzf(obj, j), zzr(i2));
                        i += iZzn;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzur zzurVar = this.zzk;
        return i + zzurVar.zza(zzurVar.zzc(obj));
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzp = zzp(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzp;
            int iHashCode = 37;
            switch (zzo(iZzp)) {
                case 0:
                    i = i2 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzvb.zza(obj, j));
                    byte[] bArr = zzsq.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzvb.zzb(obj, j));
                    i2 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    jDoubleToLongBits = zzvb.zzd(obj, j);
                    byte[] bArr2 = zzsq.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    jDoubleToLongBits = zzvb.zzd(obj, j);
                    byte[] bArr3 = zzsq.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    jDoubleToLongBits = zzvb.zzd(obj, j);
                    byte[] bArr4 = zzsq.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    iFloatToIntBits = zzsq.zza(zzvb.zzw(obj, j));
                    i2 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    iFloatToIntBits = ((String) zzvb.zzf(obj, j)).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzvb.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    jDoubleToLongBits = zzvb.zzd(obj, j);
                    byte[] bArr5 = zzsq.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    jDoubleToLongBits = zzvb.zzd(obj, j);
                    byte[] bArr6 = zzsq.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 17:
                    Object objZzf2 = zzvb.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case SignatureVisitor.EXTENDS /* 43 */:
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    iFloatToIntBits = zzvb.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = zzsq.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzk(obj, j));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr8 = zzsq.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr9 = zzsq.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr10 = zzsq.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzsq.zza(zzF(obj, j));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = ((String) zzvb.zzf(obj, j)).hashCode();
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzvb.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzvb.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr11 = zzsq.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr12 = zzsq.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzE(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzvb.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzk.zzc(obj).hashCode();
        if (!this.zzf) {
            return iHashCode2;
        }
        this.zzl.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final Object zzc() {
        return ((zzsh) this.zze).zzw();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Object obj) {
        if (zzD(obj)) {
            if (obj instanceof zzsh) {
                zzsh zzshVar = (zzsh) obj;
                zzshVar.zzH(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzshVar.zza = 0;
                zzshVar.zzF();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzp = zzp(i);
                int i2 = 1048575 & iZzp;
                int iZzo = zzo(iZzp);
                long j = i2;
                if (iZzo != 9) {
                    if (iZzo != 60 && iZzo != 68) {
                        switch (iZzo) {
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
                            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                            case 30:
                            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            case 35:
                            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case 37:
                            case 38:
                            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case 40:
                            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case SignatureVisitor.EXTENDS /* 43 */:
                            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzj.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zztj) object).zzb();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzE(obj, this.zzc[i], i)) {
                        zzr(i).zzd(zzb.getObject(obj, j));
                    }
                } else if (zzA(obj, i)) {
                    zzr(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzk.zze(obj);
            if (this.zzf) {
                this.zzl.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final void zze(Object obj, Object obj2) {
        if (!zzD(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzp = zzp(i);
            int i2 = this.zzc[i];
            long j = 1048575 & iZzp;
            switch (zzo(iZzp)) {
                case 0:
                    if (zzA(obj2, i)) {
                        zzvb.zzo(obj, j, zzvb.zza(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj2, i)) {
                        zzvb.zzp(obj, j, zzvb.zzb(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj2, i)) {
                        zzvb.zzr(obj, j, zzvb.zzd(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj2, i)) {
                        zzvb.zzr(obj, j, zzvb.zzd(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj2, i)) {
                        zzvb.zzq(obj, j, zzvb.zzc(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj2, i)) {
                        zzvb.zzr(obj, j, zzvb.zzd(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj2, i)) {
                        zzvb.zzq(obj, j, zzvb.zzc(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj2, i)) {
                        zzvb.zzm(obj, j, zzvb.zzw(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzA(obj2, i)) {
                        zzvb.zzs(obj, j, zzvb.zzf(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzu(obj, obj2, i);
                    break;
                case 10:
                    if (zzA(obj2, i)) {
                        zzvb.zzs(obj, j, zzvb.zzf(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj2, i)) {
                        zzvb.zzq(obj, j, zzvb.zzc(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj2, i)) {
                        zzvb.zzq(obj, j, zzvb.zzc(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj2, i)) {
                        zzvb.zzq(obj, j, zzvb.zzc(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj2, i)) {
                        zzvb.zzr(obj, j, zzvb.zzd(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj2, i)) {
                        zzvb.zzq(obj, j, zzvb.zzc(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj2, i)) {
                        zzvb.zzr(obj, j, zzvb.zzd(obj2, j));
                        zzw(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzu(obj, obj2, i);
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
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case SignatureVisitor.EXTENDS /* 43 */:
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzj.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzuc.zza;
                    zztj zztjVarZza = (zztj) zzvb.zzf(obj, j);
                    zztj zztjVar = (zztj) zzvb.zzf(obj2, j);
                    if (!zztjVar.isEmpty()) {
                        if (!zztjVarZza.zzd()) {
                            zztjVarZza = zztjVarZza.zza();
                        }
                        zztjVarZza.zzc(zztjVar);
                    }
                    zzvb.zzs(obj, j, zztjVarZza);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case Opcodes.V15 /* 59 */:
                    if (zzE(obj2, i2, i)) {
                        zzvb.zzs(obj, j, zzvb.zzf(obj2, j));
                        zzx(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    zzv(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzE(obj2, i2, i)) {
                        zzvb.zzs(obj, j, zzvb.zzf(obj2, j));
                        zzx(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    zzv(obj, obj2, i);
                    break;
            }
        }
        zzuc.zzB(this.zzk, obj, obj2);
        if (this.zzf) {
            this.zzl.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast.zzua
    public final void zzf(Object obj, zzvi zzviVar) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzg) {
            if (this.zzf) {
                this.zzl.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int iZzp = zzp(i6);
                int i7 = this.zzc[i6];
                switch (zzo(iZzp)) {
                    case 0:
                        if (zzA(obj, i6)) {
                            zzviVar.zzf(i7, zzvb.zza(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzA(obj, i6)) {
                            zzviVar.zzn(i7, zzvb.zzb(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzA(obj, i6)) {
                            zzviVar.zzs(i7, zzvb.zzd(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzA(obj, i6)) {
                            zzviVar.zzH(i7, zzvb.zzd(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzA(obj, i6)) {
                            zzviVar.zzq(i7, zzvb.zzc(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzA(obj, i6)) {
                            zzviVar.zzl(i7, zzvb.zzd(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzA(obj, i6)) {
                            zzviVar.zzj(i7, zzvb.zzc(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzA(obj, i6)) {
                            zzviVar.zzb(i7, zzvb.zzw(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzA(obj, i6)) {
                            zzG(i7, zzvb.zzf(obj, iZzp & 1048575), zzviVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzA(obj, i6)) {
                            zzviVar.zzu(i7, zzvb.zzf(obj, iZzp & 1048575), zzr(i6));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzA(obj, i6)) {
                            zzviVar.zzd(i7, (zzrm) zzvb.zzf(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzA(obj, i6)) {
                            zzviVar.zzF(i7, zzvb.zzc(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzA(obj, i6)) {
                            zzviVar.zzh(i7, zzvb.zzc(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzA(obj, i6)) {
                            zzviVar.zzv(i7, zzvb.zzc(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzA(obj, i6)) {
                            zzviVar.zzx(i7, zzvb.zzd(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzA(obj, i6)) {
                            zzviVar.zzz(i7, zzvb.zzc(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzA(obj, i6)) {
                            zzviVar.zzB(i7, zzvb.zzd(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzA(obj, i6)) {
                            zzviVar.zzp(i7, zzvb.zzf(obj, iZzp & 1048575), zzr(i6));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzuc.zzF(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 19:
                        zzuc.zzJ(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 20:
                        zzuc.zzM(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 21:
                        zzuc.zzU(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 22:
                        zzuc.zzL(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 23:
                        zzuc.zzI(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 24:
                        zzuc.zzH(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 25:
                        zzuc.zzD(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 26:
                        zzuc.zzS(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar);
                        break;
                    case 27:
                        zzuc.zzN(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, zzr(i6));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        zzuc.zzE(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar);
                        break;
                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        zzuc.zzT(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 30:
                        zzuc.zzG(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        zzuc.zzO(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 32:
                        zzuc.zzP(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 33:
                        zzuc.zzQ(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        zzuc.zzR(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, false);
                        break;
                    case 35:
                        zzuc.zzF(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        zzuc.zzJ(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 37:
                        zzuc.zzM(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 38:
                        zzuc.zzU(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        zzuc.zzL(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 40:
                        zzuc.zzI(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        zzuc.zzH(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        zzuc.zzD(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case SignatureVisitor.EXTENDS /* 43 */:
                        zzuc.zzT(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        zzuc.zzG(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 45:
                        zzuc.zzO(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 46:
                        zzuc.zzP(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 47:
                        zzuc.zzQ(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 48:
                        zzuc.zzR(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, true);
                        break;
                    case 49:
                        zzuc.zzK(i7, (List) zzvb.zzf(obj, iZzp & 1048575), zzviVar, zzr(i6));
                        break;
                    case 50:
                        zzy(zzviVar, i7, zzvb.zzf(obj, iZzp & 1048575), i6);
                        break;
                    case 51:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzf(i7, zzj(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzn(i7, zzk(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzs(i7, zzq(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzH(i7, zzq(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzq(i7, zzm(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzl(i7, zzq(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzj(i7, zzm(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzb(i7, zzF(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case Opcodes.V15 /* 59 */:
                        if (zzE(obj, i7, i6)) {
                            zzG(i7, zzvb.zzf(obj, iZzp & 1048575), zzviVar);
                            break;
                        } else {
                            break;
                        }
                    case Opcodes.V16 /* 60 */:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzu(i7, zzvb.zzf(obj, iZzp & 1048575), zzr(i6));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzd(i7, (zzrm) zzvb.zzf(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzF(i7, zzm(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzh(i7, zzm(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzv(i7, zzm(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzx(i7, zzq(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzz(i7, zzm(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case TypeReference.INSTANCEOF /* 67 */:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzB(i7, zzq(obj, iZzp & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case TypeReference.NEW /* 68 */:
                        if (zzE(obj, i7, i6)) {
                            zzviVar.zzp(i7, zzvb.zzf(obj, iZzp & 1048575), zzr(i6));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzur zzurVar = this.zzk;
            zzurVar.zzg(zzurVar.zzc(obj), zzviVar);
            return;
        }
        if (this.zzf) {
            this.zzl.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i8 < length2) {
            int iZzp2 = zzp(i8);
            int[] iArr = this.zzc;
            int i11 = iArr[i8];
            int iZzo = zzo(iZzp2);
            if (iZzo <= 17) {
                int i12 = iArr[i8 + 2];
                int i13 = i12 & i5;
                if (i13 != i10) {
                    i9 = unsafe.getInt(obj, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = i4;
            }
            long j = iZzp2 & i5;
            switch (iZzo) {
                case 0:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzf(i11, zzvb.zza(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzn(i11, zzvb.zzb(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzs(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzH(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzq(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzl(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzj(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzb(i11, zzvb.zzw(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzG(i11, unsafe.getObject(obj, j), zzviVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzu(i11, unsafe.getObject(obj, j), zzr(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzd(i11, (zzrm) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzF(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzh(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzv(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzx(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzz(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzB(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzviVar.zzp(i11, unsafe.getObject(obj, j), zzr(i8));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = 0;
                    zzuc.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 19:
                    i2 = 0;
                    zzuc.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 20:
                    i2 = 0;
                    zzuc.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 21:
                    i2 = 0;
                    zzuc.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 22:
                    i2 = 0;
                    zzuc.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 23:
                    i2 = 0;
                    zzuc.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 24:
                    i2 = 0;
                    zzuc.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 25:
                    i2 = 0;
                    zzuc.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    break;
                case 26:
                    zzuc.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar);
                    i2 = 0;
                    break;
                case 27:
                    zzuc.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, zzr(i8));
                    i2 = 0;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    zzuc.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar);
                    i2 = 0;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    i3 = 0;
                    zzuc.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i2 = i3;
                    break;
                case 30:
                    i3 = 0;
                    zzuc.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i2 = i3;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    i3 = 0;
                    zzuc.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i2 = i3;
                    break;
                case 32:
                    i3 = 0;
                    zzuc.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i2 = i3;
                    break;
                case 33:
                    i3 = 0;
                    zzuc.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i2 = i3;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    i3 = 0;
                    zzuc.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i2 = i3;
                    break;
                case 35:
                    zzuc.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzuc.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 37:
                    zzuc.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 38:
                    zzuc.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zzuc.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 40:
                    zzuc.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    zzuc.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    zzuc.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    zzuc.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zzuc.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 45:
                    zzuc.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 46:
                    zzuc.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 47:
                    zzuc.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 48:
                    zzuc.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, true);
                    i2 = 0;
                    break;
                case 49:
                    zzuc.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzviVar, zzr(i8));
                    i2 = 0;
                    break;
                case 50:
                    zzy(zzviVar, i11, unsafe.getObject(obj, j), i8);
                    i2 = 0;
                    break;
                case 51:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzf(i11, zzj(obj, j));
                    }
                    i2 = 0;
                    break;
                case 52:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzn(i11, zzk(obj, j));
                    }
                    i2 = 0;
                    break;
                case 53:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzs(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 54:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzH(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 55:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzq(i11, zzm(obj, j));
                    }
                    i2 = 0;
                    break;
                case 56:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzl(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 57:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzj(i11, zzm(obj, j));
                    }
                    i2 = 0;
                    break;
                case 58:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzb(i11, zzF(obj, j));
                    }
                    i2 = 0;
                    break;
                case Opcodes.V15 /* 59 */:
                    if (zzE(obj, i11, i8)) {
                        zzG(i11, unsafe.getObject(obj, j), zzviVar);
                    }
                    i2 = 0;
                    break;
                case Opcodes.V16 /* 60 */:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzu(i11, unsafe.getObject(obj, j), zzr(i8));
                    }
                    i2 = 0;
                    break;
                case 61:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzd(i11, (zzrm) unsafe.getObject(obj, j));
                    }
                    i2 = 0;
                    break;
                case 62:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzF(i11, zzm(obj, j));
                    }
                    i2 = 0;
                    break;
                case 63:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzh(i11, zzm(obj, j));
                    }
                    i2 = 0;
                    break;
                case 64:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzv(i11, zzm(obj, j));
                    }
                    i2 = 0;
                    break;
                case 65:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzx(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzz(i11, zzm(obj, j));
                    }
                    i2 = 0;
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzB(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case TypeReference.NEW /* 68 */:
                    if (zzE(obj, i11, i8)) {
                        zzviVar.zzp(i11, unsafe.getObject(obj, j), zzr(i8));
                    }
                    i2 = 0;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            i8 += 3;
            i4 = i2;
            i5 = 1048575;
        }
        zzur zzurVar2 = this.zzk;
        zzurVar2.zzg(zzurVar2.zzc(obj), zzviVar);
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzp = zzp(i);
            long j = iZzp & 1048575;
            switch (zzo(iZzp)) {
                case 0:
                    if (!zzz(obj, obj2, i) || Double.doubleToLongBits(zzvb.zza(obj, j)) != Double.doubleToLongBits(zzvb.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzz(obj, obj2, i) || Float.floatToIntBits(zzvb.zzb(obj, j)) != Float.floatToIntBits(zzvb.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzz(obj, obj2, i) || zzvb.zzd(obj, j) != zzvb.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzz(obj, obj2, i) || zzvb.zzd(obj, j) != zzvb.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzz(obj, obj2, i) || zzvb.zzc(obj, j) != zzvb.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzz(obj, obj2, i) || zzvb.zzd(obj, j) != zzvb.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzz(obj, obj2, i) || zzvb.zzc(obj, j) != zzvb.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzz(obj, obj2, i) || zzvb.zzw(obj, j) != zzvb.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzz(obj, obj2, i) || !zzuc.zzV(zzvb.zzf(obj, j), zzvb.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzz(obj, obj2, i) || !zzuc.zzV(zzvb.zzf(obj, j), zzvb.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzz(obj, obj2, i) || !zzuc.zzV(zzvb.zzf(obj, j), zzvb.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzz(obj, obj2, i) || zzvb.zzc(obj, j) != zzvb.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzz(obj, obj2, i) || zzvb.zzc(obj, j) != zzvb.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzz(obj, obj2, i) || zzvb.zzc(obj, j) != zzvb.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzz(obj, obj2, i) || zzvb.zzd(obj, j) != zzvb.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzz(obj, obj2, i) || zzvb.zzc(obj, j) != zzvb.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzz(obj, obj2, i) || zzvb.zzd(obj, j) != zzvb.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzz(obj, obj2, i) || !zzuc.zzV(zzvb.zzf(obj, j), zzvb.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
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
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case SignatureVisitor.EXTENDS /* 43 */:
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzV = zzuc.zzV(zzvb.zzf(obj, j), zzvb.zzf(obj2, j));
                    break;
                case 50:
                    zZzV = zzuc.zzV(zzvb.zzf(obj, j), zzvb.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case Opcodes.V15 /* 59 */:
                case Opcodes.V16 /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                case TypeReference.NEW /* 68 */:
                    long jZzn = zzn(i) & 1048575;
                    if (zzvb.zzc(obj, jZzn) != zzvb.zzc(obj2, jZzn) || !zzuc.zzV(zzvb.zzf(obj, j), zzvb.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzV) {
                return false;
            }
        }
        if (!this.zzk.zzc(obj).equals(this.zzk.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzl.zza(obj);
        this.zzl.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    @Override // com.google.android.gms.internal.cast.zzua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzh(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzi) {
            int i6 = this.zzh[i4];
            int i7 = this.zzc[i6];
            int iZzp = zzp(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & iZzp) != 0 && !zzB(obj, i6, i, i2, i10)) {
                return false;
            }
            int iZzo = zzo(iZzp);
            if (iZzo == 9 || iZzo == 17) {
                if (zzB(obj, i6, i, i2, i10) && !zzC(obj, iZzp, zzr(i6))) {
                    return false;
                }
            } else if (iZzo == 27) {
                List list = (List) zzvb.zzf(obj, iZzp & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzua zzuaVarZzr = zzr(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzuaVarZzr.zzh(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzo == 60 || iZzo == 68) {
                if (zzE(obj, i7, i6) && !zzC(obj, iZzp, zzr(i6))) {
                    return false;
                }
            } else if (iZzo != 49) {
                if (iZzo == 50 && !((zztj) zzvb.zzf(obj, iZzp & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzl.zza(obj);
        throw null;
    }
}
