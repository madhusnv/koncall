package com.google.android.gms.internal.auth;

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
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i2, zzfw zzfwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = z;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
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

    private final void zzB(Object obj, Object obj2, int i) {
        long jZzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int iZzv = zzv(i);
        int i2 = this.zzc[i];
        long j = iZzv & 1048575;
        if (zzJ(obj2, i2, i)) {
            Object objZzf = zzJ(obj, i2, i) ? zzhi.zzf(obj, j) : null;
            Object objZzf2 = zzhi.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i2, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j, objZzf2);
                zzE(obj, i2, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzs = zzs(i);
        long j = 1048575 & iZzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzhi.zzn(obj, zzs(i2) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int iZzs = zzs(i);
        long j = iZzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i);
        long j2 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j2)) != 0;
            case 2:
                return zzhi.zzd(obj, j2) != 0;
            case 3:
                return zzhi.zzd(obj, j2) != 0;
            case 4:
                return zzhi.zzc(obj, j2) != 0;
            case 5:
                return zzhi.zzd(obj, j2) != 0;
            case 6:
                return zzhi.zzc(obj, j2) != 0;
            case 7:
                return zzhi.zzt(obj, j2);
            case 8:
                Object objZzf = zzhi.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j2) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j2));
            case 11:
                return zzhi.zzc(obj, j2) != 0;
            case 12:
                return zzhi.zzc(obj, j2) != 0;
            case 13:
                return zzhi.zzc(obj, j2) != 0;
            case 14:
                return zzhi.zzd(obj, j2) != 0;
            case 15:
                return zzhi.zzc(obj, j2) != 0;
            case 16:
                return zzhi.zzd(obj, j2) != 0;
            case 17:
                return zzhi.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzG(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i2) {
        return zzhi.zzc(obj, (long) (zzs(i2) & 1048575)) == i;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
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
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        Object[] objArr;
        String str;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        Field fieldZzA;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzA2;
        Object obj2;
        Field fieldZzA3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = zzggVar.zzc() == 2;
        String strZzd = zzggVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (strZzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt4 = strZzd.charAt(i);
        if (iCharAt4 >= 55296) {
            int i32 = iCharAt4 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = strZzd.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt4 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i4 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt5 = strZzd.charAt(i31);
            if (iCharAt5 >= 55296) {
                int i35 = iCharAt5 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    cCharAt8 = strZzd.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                iCharAt5 = i35 | (cCharAt8 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int iCharAt6 = strZzd.charAt(i34);
            if (iCharAt6 >= 55296) {
                int i38 = iCharAt6 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    cCharAt7 = strZzd.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                iCharAt6 = i38 | (cCharAt7 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            iCharAt = strZzd.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    cCharAt6 = strZzd.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int iCharAt7 = strZzd.charAt(i40);
            if (iCharAt7 >= 55296) {
                int i44 = iCharAt7 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    cCharAt5 = strZzd.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                iCharAt7 = i44 | (cCharAt5 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            iCharAt2 = strZzd.charAt(i43);
            if (iCharAt2 >= 55296) {
                int i47 = iCharAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    cCharAt4 = strZzd.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                iCharAt2 = i47 | (cCharAt4 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int iCharAt8 = strZzd.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    cCharAt3 = strZzd.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                iCharAt8 = i50 | (cCharAt3 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int iCharAt9 = strZzd.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    cCharAt2 = strZzd.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            iCharAt3 = strZzd.charAt(i52);
            if (iCharAt3 >= 55296) {
                int i56 = iCharAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt = strZzd.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                iCharAt3 = i56 | (cCharAt << i57);
                i55 = i6;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i2 = iCharAt5 + iCharAt5 + iCharAt6;
            i3 = iCharAt5;
            i31 = i55;
            int i58 = iCharAt8;
            i4 = iCharAt7;
            i5 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 + iCharAt2];
        int i59 = iCharAt3 + i5;
        int i60 = iCharAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = strZzd.charAt(i31);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    cCharAt12 = strZzd.charAt(i66);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int iCharAt11 = strZzd.charAt(i14);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = strZzd.charAt(i70);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = iCharAt11 & Constants.MAX_HOST_LENGTH;
            int i73 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        cCharAt10 = strZzd.charAt(i76);
                        i18 = i4;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i76 = i26;
                        i4 = i18;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i77);
                    i24 = i26;
                } else {
                    i18 = i4;
                    i24 = i74;
                }
                int i78 = i72 - 51;
                i21 = i24;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i62 / 3;
                    i25 = i2 + 1;
                    objArr2[i79 + i79 + 1] = objArrZze[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i62 / 3;
                        i25 = i2 + 1;
                        objArr2[i80 + i80 + 1] = objArrZze[i2];
                    }
                    int i81 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i81];
                    if (obj instanceof Field) {
                        fieldZzA2 = zzA(cls, (String) obj);
                        objArrZze[i81] = fieldZzA2;
                    } else {
                        fieldZzA2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzA2);
                    int i82 = i81 + 1;
                    obj2 = objArrZze[i82];
                    if (obj2 instanceof Field) {
                        fieldZzA3 = zzA(cls, (String) obj2);
                        objArrZze[i82] = fieldZzA3;
                    } else {
                        fieldZzA3 = (Field) obj2;
                    }
                    str = strZzd;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                    objArr = objArr2;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i22 = 0;
                }
                i2 = i25;
                int i812 = iCharAt12 + iCharAt12;
                obj = objArrZze[i812];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i17 = iCharAt;
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldZzA2);
                int i822 = i812 + 1;
                obj2 = objArrZze[i822];
                if (obj2 instanceof Field) {
                }
                str = strZzd;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                objArr = objArr2;
                iObjectFieldOffset = iObjectFieldOffset32;
                i22 = 0;
            } else {
                iArr2 = iArr3;
                i17 = iCharAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field fieldZzA4 = zzA(cls, (String) objArrZze[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i84 = i62 / 3;
                    objArr2[i84 + i84 + 1] = fieldZzA4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i85 = i62 / 3;
                        i23 = i83 + 1;
                        objArr2[i85 + i85 + 1] = objArrZze[i83];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i86 = i62 / 3;
                            i23 = i83 + 1;
                            objArr2[i86 + i86 + 1] = objArrZze[i83];
                        }
                    } else if (i72 == 50) {
                        int i87 = i60 + 1;
                        iArr[i60] = i62;
                        int i88 = i62 / 3;
                        int i89 = i88 + i88;
                        int i90 = i83 + 1;
                        objArr2[i89] = objArrZze[i83];
                        if ((iCharAt11 & 2048) != 0) {
                            i83 = i90 + 1;
                            objArr2[i89 + 1] = objArrZze[i90];
                            i60 = i87;
                        } else {
                            i60 = i87;
                            i19 = i90;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                            objArr = objArr2;
                            if ((iCharAt11 & 4096) != 4096 || i72 > 17) {
                                str = strZzd;
                                i20 = i19;
                                iObjectFieldOffset2 = 1048575;
                                i21 = i16;
                                i22 = 0;
                            } else {
                                int i91 = i16 + 1;
                                int iCharAt13 = strZzd.charAt(i16);
                                if (iCharAt13 >= 55296) {
                                    int i92 = iCharAt13 & 8191;
                                    int i93 = 13;
                                    while (true) {
                                        i21 = i91 + 1;
                                        cCharAt9 = strZzd.charAt(i91);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i92 |= (cCharAt9 & 8191) << i93;
                                        i93 += 13;
                                        i91 = i21;
                                    }
                                    iCharAt13 = i92 | (cCharAt9 << i93);
                                } else {
                                    i21 = i91;
                                }
                                int i94 = i3 + i3 + (iCharAt13 / 32);
                                Object obj3 = objArrZze[i94];
                                str = strZzd;
                                if (obj3 instanceof Field) {
                                    fieldZzA = (Field) obj3;
                                } else {
                                    fieldZzA = zzA(cls, (String) obj3);
                                    objArrZze[i94] = fieldZzA;
                                }
                                i20 = i19;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA);
                                i22 = iCharAt13 % 32;
                            }
                            if (i72 >= 18 || i72 > 49) {
                                i2 = i20;
                            } else {
                                iArr[i61] = iObjectFieldOffset;
                                i2 = i20;
                                i61++;
                            }
                        }
                    }
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                    objArr = objArr2;
                    if ((iCharAt11 & 4096) != 4096) {
                        str = strZzd;
                        i20 = i19;
                        iObjectFieldOffset2 = 1048575;
                        i21 = i16;
                        i22 = 0;
                        if (i72 >= 18) {
                            i2 = i20;
                        }
                    }
                }
                i19 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                objArr = objArr2;
                if ((iCharAt11 & 4096) != 4096) {
                }
            }
            int i95 = i62 + 1;
            iArr2[i62] = iCharAt10;
            int i96 = i95 + 1;
            iArr2[i95] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | iObjectFieldOffset;
            i62 = i96 + 1;
            iArr2[i96] = (i22 << 20) | iObjectFieldOffset2;
            iCharAt = i17;
            iCharAt3 = i73;
            i31 = i21;
            length = i15;
            objArr2 = objArr;
            strZzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzfz(iArr3, objArr2, iCharAt, i4, zzggVar.zza(), z, false, iArr, iCharAt3, i59, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzds zzdsVar) throws zzfa {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm2;
                }
                break;
            case Opcodes.V15 /* 59 */:
                if (i5 == 2) {
                    int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                    int i9 = zzdsVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i9)) {
                            throw zzfa.zzb();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzez.zzb));
                        iZzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzj2;
                }
                break;
            case Opcodes.V16 /* 60 */:
                if (i5 == 2) {
                    int iZzd = zzdt.zzd(zzy(i8), bArr, i, i2, zzdsVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int iZza = zzdt.zza(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return iZza;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i10 = zzdsVar.zza;
                    zzex zzexVarZzx = zzx(i8);
                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzc(obj).zzf(i3, Long.valueOf(i10));
                    }
                    return iZzj3;
                }
                break;
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                if (i5 == 0) {
                    int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj4;
                }
                break;
            case TypeReference.INSTANCEOF /* 67 */:
                if (i5 == 0) {
                    int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm3;
                }
                break;
            case TypeReference.NEW /* 68 */:
                if (i5 == 3) {
                    int iZzc = zzdt.zzc(zzy(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0080. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws zzfa {
        byte b;
        int iZzk;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzm;
        int iZzd;
        int i10;
        int i11;
        int i12;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i14 = 1048575;
        int i15 = -1;
        int iZzi = i;
        int i16 = -1;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (iZzi < i13) {
            int i20 = iZzi + 1;
            byte b2 = bArr2[iZzi];
            if (b2 < 0) {
                iZzk = zzdt.zzk(b2, bArr2, i20, zzdsVar2);
                b = zzdsVar2.zza;
            } else {
                b = b2;
                iZzk = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            int iZzr = i21 > i16 ? zzfzVar.zzr(i21, i18 / 3) : zzfzVar.zzq(i21);
            if (iZzr == i15) {
                i3 = iZzk;
                i4 = i21;
                i5 = i15;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i23 = iArr[iZzr + 1];
                int iZzu = zzu(i23);
                long j = i23 & i14;
                if (iZzu <= 17) {
                    int i24 = iArr[iZzr + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = i24 & 1048575;
                    if (i26 != i17) {
                        if (i17 != 1048575) {
                            unsafe2.putInt(obj2, i17, i19);
                        }
                        if (i26 != 1048575) {
                            i19 = unsafe2.getInt(obj2, i26);
                        }
                        i17 = i26;
                    }
                    switch (iZzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 1) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i8)));
                                iZzi = i8 + 8;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 5) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i8)));
                                iZzi = i8 + 4;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i8, zzdsVar2);
                                unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                i19 |= i25;
                                iZzi = iZzm;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = zzdt.zzj(bArr2, i8, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 1) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                i8 = iZzk;
                                unsafe2.putLong(obj, j, zzdt.zzn(bArr2, iZzk));
                                iZzi = i8 + 8;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 5) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                zzhi.zzk(obj2, j, zzdsVar2.zzb != 0);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = (536870912 & i23) == 0 ? zzdt.zzg(bArr2, iZzk, zzdsVar2) : zzdt.zzh(bArr2, iZzk, zzdsVar2);
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzd(zzfzVar.zzy(i7), bArr2, iZzk, i13, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zza(bArr2, iZzk, zzdsVar2);
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar2.zza));
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 16:
                            if (i22 != 0) {
                                i4 = i21;
                                i7 = iZzr;
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                iZzm = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                i7 = iZzr;
                                i4 = i21;
                                i9 = 1048575;
                                unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                i19 |= i25;
                                iZzi = iZzm;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        default:
                            i4 = i21;
                            i7 = iZzr;
                            i8 = iZzk;
                            i3 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            i5 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i7 = iZzr;
                    int i27 = iZzk;
                    i9 = 1048575;
                    i4 = i21;
                    if (iZzu == 27) {
                        if (i22 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj2, j);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzeyVarZzd);
                            }
                            iZzi = zzdt.zze(zzfzVar.zzy(i7), b, bArr, i27, i2, zzeyVarZzd, zzdsVar);
                            i19 = i19;
                            i18 = i7;
                            i16 = i4;
                            i14 = i9;
                            i15 = -1;
                        } else {
                            i10 = i27;
                            i11 = i19;
                            i12 = i17;
                            unsafe = unsafe2;
                            i6 = i7;
                            i5 = -1;
                        }
                    } else if (iZzu <= 49) {
                        i11 = i19;
                        i12 = i17;
                        i5 = -1;
                        unsafe = unsafe2;
                        i6 = i7;
                        iZzi = zzp(obj, bArr, i27, i2, b, i4, i22, i7, i23, iZzu, j, zzdsVar);
                        if (iZzi != i27) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i13 = i2;
                            zzdsVar2 = zzdsVar;
                            i17 = i12;
                            i15 = i5;
                            i16 = i4;
                            i19 = i11;
                            i18 = i6;
                            unsafe2 = unsafe;
                            i14 = 1048575;
                            zzfzVar = this;
                        } else {
                            i3 = iZzi;
                            i17 = i12;
                            i19 = i11;
                        }
                    } else {
                        i10 = i27;
                        i11 = i19;
                        i12 = i17;
                        unsafe = unsafe2;
                        i6 = i7;
                        i5 = -1;
                        if (iZzu != 50) {
                            iZzi = zzn(obj, bArr, i10, i2, b, i4, i22, i23, iZzu, j, i6, zzdsVar);
                            if (iZzi != i10) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i13 = i2;
                                zzdsVar2 = zzdsVar;
                                i17 = i12;
                                i15 = i5;
                                i16 = i4;
                                i19 = i11;
                                i18 = i6;
                                unsafe2 = unsafe;
                                i14 = 1048575;
                                zzfzVar = this;
                            } else {
                                i3 = iZzi;
                                i17 = i12;
                                i19 = i11;
                            }
                        } else if (i22 == 2) {
                            iZzi = zzm(obj, bArr, i10, i2, i6, j, zzdsVar);
                            if (iZzi != i10) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i13 = i2;
                                zzdsVar2 = zzdsVar;
                                i17 = i12;
                                i15 = i5;
                                i16 = i4;
                                i19 = i11;
                                i18 = i6;
                                unsafe2 = unsafe;
                                i14 = 1048575;
                                zzfzVar = this;
                            } else {
                                i3 = iZzi;
                                i17 = i12;
                                i19 = i11;
                            }
                        }
                    }
                    i3 = i10;
                    i17 = i12;
                    i19 = i11;
                }
            }
            iZzi = zzdt.zzi(b, bArr, i3, i2, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            zzdsVar2 = zzdsVar;
            i15 = i5;
            i16 = i4;
            i18 = i6;
            unsafe2 = unsafe;
            i14 = 1048575;
        }
        int i28 = i19;
        int i29 = i17;
        Unsafe unsafe3 = unsafe2;
        if (i29 != i14) {
            unsafe3.putInt(obj, i29, i28);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzds zzdsVar) throws zzfa {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = i;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j2);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzeyVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzej zzejVar = (zzej) zzeyVarZzd;
                    int iZzj3 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i12 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i12) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i12) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVarZzd;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    while (true) {
                        i8 = iZzj2 + 8;
                        if (i8 < i2) {
                            iZzj2 = zzdt.zzj(bArr, i8, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZzj2;
            case 19:
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVarZzd;
                    int iZzj4 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i13 = zzdsVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVarZzd;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj2 + 4;
                        if (i9 < i2) {
                            iZzj2 = zzdt.zzj(bArr, i9, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i9;
                }
                return iZzj2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVarZzd;
                    int iZzj5 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i14 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i14) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i14) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVarZzd;
                    int iZzm = zzdt.zzm(bArr, iZzj2, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case SignatureVisitor.EXTENDS /* 43 */:
                if (i5 == 2) {
                    return zzdt.zzf(bArr, iZzj2, zzeyVarZzd, zzdsVar);
                }
                if (i5 == 0) {
                    return zzdt.zzl(i3, bArr, i, i2, zzeyVarZzd, zzdsVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVarZzd;
                    int iZzj7 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i15 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i15) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i15) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVarZzd;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    while (true) {
                        i10 = iZzj2 + 8;
                        if (i10 < i2) {
                            iZzj2 = zzdt.zzj(bArr, i10, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzflVar4.zze(zzdt.zzn(bArr, iZzj2));
                            }
                        }
                    }
                    return i10;
                }
                return iZzj2;
            case 24:
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 45:
                if (i5 == 2) {
                    zzev zzevVar = (zzev) zzeyVarZzd;
                    int iZzj8 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i16 = zzdsVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVarZzd;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj2 + 4;
                        if (i11 < i2) {
                            iZzj2 = zzdt.zzj(bArr, i11, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzevVar2.zze(zzdt.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i11;
                }
                return iZzj2;
            case 25:
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVarZzd;
                    iZzj = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i17 = zzdsVar.zza + iZzj;
                    while (iZzj < i17) {
                        iZzj = zzdt.zzm(bArr, iZzj, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj != i17) {
                        throw zzfa.zzf();
                    }
                    return iZzj;
                }
                if (i5 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVarZzd;
                    int iZzm2 = zzdt.zzm(bArr, iZzj2, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj9 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj9, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj10 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                        int i18 = zzdsVar.zza;
                        if (i18 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i18 == 0) {
                            zzeyVarZzd.add("");
                        } else {
                            zzeyVarZzd.add(new String(bArr, iZzj10, i18, zzez.zzb));
                            iZzj10 += i18;
                        }
                        while (iZzj10 < i2) {
                            int iZzj11 = zzdt.zzj(bArr, iZzj10, zzdsVar);
                            if (i3 != zzdsVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzdt.zzj(bArr, iZzj11, zzdsVar);
                            int i19 = zzdsVar.zza;
                            if (i19 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i19 == 0) {
                                zzeyVarZzd.add("");
                            } else {
                                zzeyVarZzd.add(new String(bArr, iZzj10, i19, zzez.zzb));
                                iZzj10 += i19;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i20 = zzdsVar.zza;
                    if (i20 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i20 == 0) {
                        zzeyVarZzd.add("");
                    } else {
                        int i21 = iZzj12 + i20;
                        if (!zzhm.zzd(bArr, iZzj12, i21)) {
                            throw zzfa.zzb();
                        }
                        zzeyVarZzd.add(new String(bArr, iZzj12, i20, zzez.zzb));
                        iZzj12 = i21;
                    }
                    while (iZzj12 < i2) {
                        int iZzj13 = zzdt.zzj(bArr, iZzj12, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                        int i22 = zzdsVar.zza;
                        if (i22 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i22 == 0) {
                            zzeyVarZzd.add("");
                        } else {
                            int i23 = iZzj12 + i22;
                            if (!zzhm.zzd(bArr, iZzj12, i23)) {
                                throw zzfa.zzb();
                            }
                            zzeyVarZzd.add(new String(bArr, iZzj12, i22, zzez.zzb));
                            iZzj12 = i23;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i5 == 2) {
                    return zzdt.zze(zzy(i6), i3, bArr, i, i2, zzeyVarZzd, zzdsVar);
                }
                return iZzj2;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (i5 == 2) {
                    int iZzj14 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i24 = zzdsVar.zza;
                    if (i24 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i24 > bArr.length - iZzj14) {
                        throw zzfa.zzf();
                    }
                    if (i24 == 0) {
                        zzeyVarZzd.add(zzee.zzb);
                    } else {
                        zzeyVarZzd.add(zzee.zzk(bArr, iZzj14, i24));
                        iZzj14 += i24;
                    }
                    while (iZzj14 < i2) {
                        int iZzj15 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        int i25 = zzdsVar.zza;
                        if (i25 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i25 > bArr.length - iZzj14) {
                            throw zzfa.zzf();
                        }
                        if (i25 == 0) {
                            zzeyVarZzd.add(zzee.zzb);
                        } else {
                            zzeyVarZzd.add(zzee.zzk(bArr, iZzj14, i25));
                            iZzj14 += i25;
                        }
                    }
                    return iZzj14;
                }
                return iZzj2;
            case 30:
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZzj = zzdt.zzl(i3, bArr, i, i2, zzeyVarZzd, zzdsVar);
                    }
                    return iZzj2;
                }
                iZzj = zzdt.zzf(bArr, iZzj2, zzeyVarZzd, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i4, zzeyVarZzd, zzx(i6), zzgzVar, this.zzm);
                if (objZzd != null) {
                    zzeuVar.zzc = (zzgz) objZzd;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVarZzd;
                    int iZzj16 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i26 = zzdsVar.zza + iZzj16;
                    while (iZzj16 < i26) {
                        iZzj16 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj16 == i26) {
                        return iZzj16;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVarZzd;
                    int iZzj17 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj17 < i2) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 48:
                if (i5 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVarZzd;
                    int iZzj19 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i27 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i27) {
                        iZzj19 = zzdt.zzm(bArr, iZzj19, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj19 == i27) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVarZzd;
                    int iZzm3 = zzdt.zzm(bArr, iZzj2, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj20 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj20, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i5 == 3) {
                    zzgh zzghVarZzy = zzy(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i, i2, i28, zzdsVar);
                    zzeyVarZzd.add(zzdsVar.zzc);
                    while (iZzc < i2) {
                        int iZzj21 = zzdt.zzj(bArr, iZzc, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzdt.zzc(zzghVarZzy, bArr, iZzj21, i2, i28, zzdsVar);
                        zzeyVarZzd.add(zzdsVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i2);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & Constants.MAX_HOST_LENGTH;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i) {
        int i2 = i / 3;
        return (zzex) this.zzd[i2 + i2 + 1];
    }

    private final zzgh zzy(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgh zzghVar = (zzgh) this.zzd[i3];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int iZzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzv = zzv(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i2 = i + iZzc;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i2 = i + iZzc;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = zzhi.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = zzhi.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j));
                    i2 = i + iZzc;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i2 = i + iZzc;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = zzhi.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = zzhi.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = zzhi.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = zzhi.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j);
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
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 51:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzl(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzl(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzl(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzl(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzl(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzl(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.zzm.zza(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0335, code lost:
    
        if (r0 != r20) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0337, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r2 = r19;
        r3 = r21;
        r5 = r22;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034f, code lost:
    
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0372, code lost:
    
        if (r0 != r15) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0398, code lost:
    
        if (r0 != r15) goto L115;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(Object obj, byte[] bArr, int i, int i2, int i3, zzds zzdsVar) throws zzfa {
        Unsafe unsafe;
        int i4;
        Object obj2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzg;
        int i17;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i18 = i2;
        int i19 = i3;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 1048575;
        while (true) {
            if (iZzi < i18) {
                int i25 = iZzi + 1;
                byte b = bArr2[iZzi];
                if (b < 0) {
                    int iZzk = zzdt.zzk(b, bArr2, i25, zzdsVar2);
                    i5 = zzdsVar2.zza;
                    i25 = iZzk;
                } else {
                    i5 = b;
                }
                int i26 = i5 >>> 3;
                int i27 = i5 & 7;
                int iZzr = i26 > i23 ? zzfzVar.zzr(i26, i21 / 3) : zzfzVar.zzq(i26);
                if (iZzr == -1) {
                    i6 = i26;
                    i7 = i25;
                    i8 = i5;
                    i9 = i22;
                    unsafe = unsafe2;
                    i4 = i19;
                    i10 = 0;
                } else {
                    int[] iArr = zzfzVar.zzc;
                    int i28 = iArr[iZzr + 1];
                    int iZzu = zzu(i28);
                    i6 = i26;
                    int i29 = i25;
                    long j = i28 & 1048575;
                    if (iZzu <= 17) {
                        int i30 = iArr[iZzr + 2];
                        int i31 = 1 << (i30 >>> 20);
                        int i32 = i30 & 1048575;
                        if (i32 != i24) {
                            i11 = i5;
                            if (i24 != 1048575) {
                                unsafe2.putInt(obj3, i24, i22);
                            }
                            i22 = unsafe2.getInt(obj3, i32);
                            i12 = i32;
                        } else {
                            i11 = i5;
                            i12 = i24;
                        }
                        int i33 = i22;
                        switch (iZzu) {
                            case 0:
                                i13 = iZzr;
                                i14 = i29;
                                if (i27 != 1) {
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    zzhi.zzl(obj3, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i14)));
                                    iZzi = i14 + 8;
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    i21 = i13;
                                    i20 = i11;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 1:
                                i13 = iZzr;
                                i14 = i29;
                                if (i27 != 5) {
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    zzhi.zzm(obj3, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i14)));
                                    iZzi = i14 + 4;
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    i21 = i13;
                                    i20 = i11;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 2:
                            case 3:
                                i13 = iZzr;
                                i14 = i29;
                                if (i27 != 0) {
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    int iZzm = zzdt.zzm(bArr2, i14, zzdsVar2);
                                    unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    iZzi = iZzm;
                                    i21 = i13;
                                    i20 = i11;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 4:
                            case 11:
                                i13 = iZzr;
                                i14 = i29;
                                if (i27 != 0) {
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzi = zzdt.zzj(bArr2, i14, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzdsVar2.zza);
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    i21 = i13;
                                    i20 = i11;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 5:
                            case 14:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 1) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    i11 = i15;
                                    i14 = i16;
                                    unsafe2.putLong(obj, j, zzdt.zzn(bArr2, i16));
                                    iZzi = i14 + 8;
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    i21 = i13;
                                    i20 = i11;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 6:
                            case 13:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 5) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j, zzdt.zzb(bArr2, i16));
                                    iZzi = i16 + 4;
                                    i22 = i33 | i31;
                                    i20 = i15;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 7:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 0) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzi = zzdt.zzm(bArr2, i16, zzdsVar2);
                                    zzhi.zzk(obj3, j, zzdsVar2.zzb != 0);
                                    i22 = i33 | i31;
                                    i20 = i15;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 8:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 2) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzg = (536870912 & i28) == 0 ? zzdt.zzg(bArr2, i16, zzdsVar2) : zzdt.zzh(bArr2, i16, zzdsVar2);
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    i22 = i33 | i31;
                                    iZzi = iZzg;
                                    i20 = i15;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 9:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 2) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzg = zzdt.zzd(zzfzVar.zzy(i13), bArr2, i16, i18, zzdsVar2);
                                    if ((i33 & i31) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    i22 = i33 | i31;
                                    iZzi = iZzg;
                                    i20 = i15;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 10:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 2) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzg = zzdt.zza(bArr2, i16, zzdsVar2);
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    i22 = i33 | i31;
                                    iZzi = iZzg;
                                    i20 = i15;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 12:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 0) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzg = zzdt.zzj(bArr2, i16, zzdsVar2);
                                    int i34 = zzdsVar2.zza;
                                    zzex zzexVarZzx = zzfzVar.zzx(i13);
                                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                                        unsafe2.putInt(obj3, j, i34);
                                        i22 = i33 | i31;
                                        iZzi = iZzg;
                                        i20 = i15;
                                        i21 = i13;
                                        i23 = i6;
                                        i24 = i12;
                                        i19 = i3;
                                    } else {
                                        zzc(obj).zzf(i15, Long.valueOf(i34));
                                        iZzi = iZzg;
                                        i20 = i15;
                                        i22 = i33;
                                        i21 = i13;
                                        i23 = i6;
                                        i24 = i12;
                                        i19 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i13 = iZzr;
                                i15 = i11;
                                i16 = i29;
                                if (i27 != 0) {
                                    i14 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzi = zzdt.zzj(bArr2, i16, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzei.zzb(zzdsVar2.zza));
                                    i22 = i33 | i31;
                                    i20 = i15;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            case 16:
                                if (i27 != 0) {
                                    i13 = iZzr;
                                    i14 = i29;
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    int iZzm2 = zzdt.zzm(bArr2, i29, zzdsVar2);
                                    i13 = iZzr;
                                    unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                    i22 = i33 | i31;
                                    iZzi = iZzm2;
                                    i20 = i11;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                            default:
                                i13 = iZzr;
                                i14 = i29;
                                if (i27 != 3) {
                                    i4 = i3;
                                    i9 = i33;
                                    unsafe = unsafe2;
                                    i10 = i13;
                                    i7 = i14;
                                    i8 = i11;
                                    i24 = i12;
                                    break;
                                } else {
                                    iZzi = zzdt.zzc(zzfzVar.zzy(i13), bArr, i14, i2, (i6 << 3) | 4, zzdsVar);
                                    if ((i33 & i31) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    i21 = i13;
                                    i20 = i11;
                                    i23 = i6;
                                    i24 = i12;
                                    i19 = i3;
                                }
                        }
                    } else {
                        i11 = i5;
                        int i35 = iZzr;
                        if (iZzu != 27) {
                            i10 = i35;
                            i9 = i22;
                            i12 = i24;
                            if (iZzu <= 49) {
                                unsafe = unsafe2;
                                iZzi = zzp(obj, bArr, i29, i2, i11, i6, i27, i10, i28, iZzu, j, zzdsVar);
                            } else {
                                unsafe = unsafe2;
                                i17 = i29;
                                if (iZzu != 50) {
                                    iZzi = zzn(obj, bArr, i17, i2, i11, i6, i27, i28, iZzu, j, i10, zzdsVar);
                                } else if (i27 == 2) {
                                    iZzi = zzm(obj, bArr, i17, i2, i10, j, zzdsVar);
                                }
                            }
                        } else if (i27 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj3, j);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzeyVarZzd);
                            }
                            i20 = i11;
                            iZzi = zzdt.zze(zzfzVar.zzy(i35), i20, bArr, i29, i2, zzeyVarZzd, zzdsVar);
                            i18 = i2;
                            i19 = i3;
                            i23 = i6;
                            i21 = i35;
                            i22 = i22;
                            i24 = i24;
                        } else {
                            i10 = i35;
                            i9 = i22;
                            i12 = i24;
                            unsafe = unsafe2;
                            i17 = i29;
                        }
                        i4 = i3;
                        i7 = i17;
                        i8 = i11;
                        i24 = i12;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    iZzi = zzdt.zzi(i8, bArr, i7, i2, zzc(obj), zzdsVar);
                    zzfzVar = this;
                    obj3 = obj;
                    bArr2 = bArr;
                    i18 = i2;
                    zzdsVar2 = zzdsVar;
                    i19 = i4;
                    i20 = i8;
                    i23 = i6;
                    i21 = i10;
                    i22 = i9;
                    unsafe2 = unsafe;
                } else {
                    iZzi = i7;
                    i20 = i8;
                    i22 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i19;
            }
        }
        if (i24 != 1048575) {
            long j2 = i24;
            obj2 = obj;
            unsafe.putInt(obj2, j2, i22);
        } else {
            obj2 = obj;
        }
        for (int i36 = this.zzj; i36 < this.zzk; i36++) {
            int i37 = this.zzi[i36];
            int i38 = this.zzc[i37];
            Object objZzf = zzhi.zzf(obj2, zzv(i37) & 1048575);
            if (objZzf != null && zzx(i37) != null) {
                throw null;
            }
        }
        if (i4 == 0) {
            if (iZzi != i2) {
                throw zzfa.zzd();
            }
        } else if (iZzi > i2 || i20 != i4) {
            throw zzfa.zzd();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i2 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i2 >= i) {
                break;
            }
            long jZzv = zzv(this.zzi[i2]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i2++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzv = zzv(i);
            long j = 1048575 & iZzv;
            int i2 = this.zzc[i];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j);
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
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws zzfa {
        if (this.zzh) {
            zzo(obj, bArr, i, i2, zzdsVar);
        } else {
            zzb(obj, bArr, i, i2, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzv = zzv(i);
            long j = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j)) != Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j)) != Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j) != zzhi.zzt(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
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
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
                    long jZzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzi(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int i6 = this.zzi[i5];
            int i7 = this.zzc[i6];
            int iZzv = zzv(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iZzv) != 0 && !zzH(obj, i6, i, i2, i10)) {
                return false;
            }
            int iZzu = zzu(iZzv);
            if (iZzu == 9 || iZzu == 17) {
                if (zzH(obj, i6, i, i2, i10) && !zzI(obj, iZzv, zzy(i6))) {
                    return false;
                }
            } else if (iZzu == 27) {
                List list = (List) zzhi.zzf(obj, iZzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzghVarZzy = zzy(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzghVarZzy.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzu == 60 || iZzu == 68) {
                if (zzJ(obj, i7, i6) && !zzI(obj, iZzv, zzy(i6))) {
                    return false;
                }
            } else if (iZzu != 49) {
                if (iZzu == 50 && !((zzfq) zzhi.zzf(obj, iZzv & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return true;
    }
}
