package com.google.android.gms.internal.measurement;

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
final class zzlp<T> implements zzlx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzla zzm;
    private final zzmo zzn;
    private final zzjs zzo;
    private final zzlr zzp;
    private final zzlh zzq;

    private zzlp(int[] iArr, Object[] objArr, int i, int i2, zzlm zzlmVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjsVar != null && zzjsVar.zzc(zzlmVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlrVar;
        this.zzm = zzlaVar;
        this.zzn = zzmoVar;
        this.zzo = zzjsVar;
        this.zzg = zzlmVar;
        this.zzq = zzlhVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & Constants.MAX_HOST_LENGTH;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmy.zzf(obj, j)).longValue();
    }

    private final zzkj zzD(int i) {
        int i2 = i / 3;
        return (zzkj) this.zzd[i2 + i2 + 1];
    }

    private final zzlx zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlx zzlxVar = (zzlx) this.zzd[i3];
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzlxVarZzb = zzlu.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzlxVarZzb;
        return zzlxVarZzb;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzG(Object obj, int i) {
        zzlx zzlxVarZzE = zzE(i);
        long jZzB = zzB(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzlxVarZzE.zze();
        }
        Object object = zzb.getObject(obj, jZzB);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzlxVarZzE.zze();
        if (object != null) {
            zzlxVarZzE.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzH(Object obj, int i, int i2) {
        zzlx zzlxVarZzE = zzE(i2);
        if (!zzX(obj, i, i2)) {
            return zzlxVarZzE.zze();
        }
        Object object = zzb.getObject(obj, zzB(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzlxVarZzE.zze();
        if (object != null) {
            zzlxVarZzE.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzI(Class cls, String str) {
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

    private static void zzJ(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            long jZzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzlxVarZzE = zzE(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object objZze = zzlxVarZzE.zze();
                    zzlxVarZzE.zzg(objZze, object);
                    unsafe.putObject(obj, jZzB, objZze);
                } else {
                    unsafe.putObject(obj, jZzB, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzB);
            if (!zzW(object2)) {
                Object objZze2 = zzlxVarZzE.zze();
                zzlxVarZzE.zzg(objZze2, object2);
                unsafe.putObject(obj, jZzB, objZze2);
                object2 = objZze2;
            }
            zzlxVarZzE.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            long jZzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzlxVarZzE = zzE(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object objZze = zzlxVarZzE.zze();
                    zzlxVarZzE.zzg(objZze, object);
                    unsafe.putObject(obj, jZzB, objZze);
                } else {
                    unsafe.putObject(obj, jZzB, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzB);
            if (!zzW(object2)) {
                Object objZze2 = zzlxVarZzE.zze();
                zzlxVarZzE.zzg(objZze2, object2);
                unsafe.putObject(obj, jZzB, objZze2);
                object2 = objZze2;
            }
            zzlxVarZzE.zzg(object2, object);
        }
    }

    private final void zzM(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmy.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmy.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzmy.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzB(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzB(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzQ(Object obj, zzng zzngVar) {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iZzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzB & i2;
            switch (iZzA) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzf(i6, zzmy.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzo(i6, zzmy.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzb(i6, zzmy.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 18:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    zzlz.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    z = false;
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 30:
                    z = false;
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z = false;
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 32:
                    z = false;
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 33:
                    z = false;
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z = false;
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 50:
                    zzR(zzngVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzb(i6, zzY(obj, j));
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (zzX(obj, i6, i4)) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    private final void zzR(zzng zzngVar, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzS(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private final boolean zzT(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmy.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i);
        long j2 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmy.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmy.zzb(obj, j2)) != 0;
            case 2:
                return zzmy.zzd(obj, j2) != 0;
            case 3:
                return zzmy.zzd(obj, j2) != 0;
            case 4:
                return zzmy.zzc(obj, j2) != 0;
            case 5:
                return zzmy.zzd(obj, j2) != 0;
            case 6:
                return zzmy.zzc(obj, j2) != 0;
            case 7:
                return zzmy.zzw(obj, j2);
            case 8:
                Object objZzf = zzmy.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzje) {
                    return !zzje.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmy.zzf(obj, j2) != null;
            case 10:
                return !zzje.zzb.equals(zzmy.zzf(obj, j2));
            case 11:
                return zzmy.zzc(obj, j2) != 0;
            case 12:
                return zzmy.zzc(obj, j2) != 0;
            case 13:
                return zzmy.zzc(obj, j2) != 0;
            case 14:
                return zzmy.zzd(obj, j2) != 0;
            case 15:
                return zzmy.zzc(obj, j2) != 0;
            case 16:
                return zzmy.zzd(obj, j2) != 0;
            case 17:
                return zzmy.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzT(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzlx zzlxVar) {
        return zzlxVar.zzk(zzmy.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkf) {
            return ((zzkf) obj).zzbO();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzmy.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzmy.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzng zzngVar) {
        if (obj instanceof String) {
            zzngVar.zzF(i, (String) obj);
        } else {
            zzngVar.zzd(i, (zzje) obj);
        }
    }

    public static zzmp zzd(Object obj) {
        zzkf zzkfVar = (zzkf) obj;
        zzmp zzmpVar = zzkfVar.zzc;
        if (zzmpVar != zzmp.zzc()) {
            return zzmpVar;
        }
        zzmp zzmpVarZzf = zzmp.zzf();
        zzkfVar.zzc = zzmpVarZzf;
        return zzmpVarZzf;
    }

    public static zzlp zzl(Class cls, zzlj zzljVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        if (zzljVar instanceof zzlw) {
            return zzm((zzlw) zzljVar, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar);
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
    public static zzlp zzm(zzlw zzlwVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
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
        Field fieldZzI;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzI2;
        Object obj2;
        Field fieldZzI3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = zzlwVar.zzc() == 2;
        String strZzd = zzlwVar.zzd();
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
        Object[] objArrZze = zzlwVar.zze();
        Class<?> cls = zzlwVar.zza().getClass();
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
                        fieldZzI2 = zzI(cls, (String) obj);
                        objArrZze[i81] = fieldZzI2;
                    } else {
                        fieldZzI2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzI2);
                    int i82 = i81 + 1;
                    obj2 = objArrZze[i82];
                    if (obj2 instanceof Field) {
                        fieldZzI3 = zzI(cls, (String) obj2);
                        objArrZze[i82] = fieldZzI3;
                    } else {
                        fieldZzI3 = (Field) obj2;
                    }
                    str = strZzd;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI3);
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
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldZzI2);
                int i822 = i812 + 1;
                obj2 = objArrZze[i822];
                if (obj2 instanceof Field) {
                }
                str = strZzd;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI3);
                objArr = objArr2;
                iObjectFieldOffset = iObjectFieldOffset32;
                i22 = 0;
            } else {
                iArr2 = iArr3;
                i17 = iCharAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field fieldZzI4 = zzI(cls, (String) objArrZze[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i84 = i62 / 3;
                    objArr2[i84 + i84 + 1] = fieldZzI4.getType();
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
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
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
                                    fieldZzI = (Field) obj3;
                                } else {
                                    fieldZzI = zzI(cls, (String) obj3);
                                    objArrZze[i94] = fieldZzI;
                                }
                                i20 = i19;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
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
        return new zzlp(iArr3, objArr2, iCharAt, i4, zzlwVar.zza(), z, false, iArr, iCharAt3, i59, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmy.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmy.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int i2;
        int iZzu;
        boolean z;
        int iZzd2;
        int iZzi;
        int iZzz;
        int iZzA8;
        int iZzA9;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        int iZzA13;
        int iZzd3;
        int iZzA14;
        int i3;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int iZzA15 = 0;
        int i7 = 0;
        while (i6 < this.zzc.length) {
            int iZzB3 = zzB(i6);
            int[] iArr = this.zzc;
            int i8 = iArr[i6];
            int iZzA16 = zzA(iZzB3);
            if (iZzA16 <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i4;
                i = 1 << (i9 >>> 20);
                if (i10 != i5) {
                    i7 = unsafe.getInt(obj, i10);
                    i5 = i10;
                }
            } else {
                i = 0;
            }
            long j = iZzB3 & i4;
            switch (iZzA16) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA = zzjm.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA2 = zzjm.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA3 = zzjm.zzA(i8 << 3);
                        iZzB = zzjm.zzB(j2);
                        iZzA15 += iZzA3 + iZzB;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA3 = zzjm.zzA(i8 << 3);
                        iZzB = zzjm.zzB(j3);
                        iZzA15 += iZzA3 + iZzB;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i11 = unsafe.getInt(obj, j);
                        iZzA4 = zzjm.zzA(i8 << 3);
                        iZzv = zzjm.zzv(i11);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA = zzjm.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA2 = zzjm.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA5 = zzjm.zzA(i8 << 3) + 1;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzje) {
                            iZzA6 = zzjm.zzA(i8 << 3);
                            iZzd = ((zzje) object).zzd();
                            iZzA7 = zzjm.zzA(iZzd);
                            i2 = iZzA6 + iZzA7 + iZzd;
                            iZzA15 += i2;
                            break;
                        } else {
                            iZzA4 = zzjm.zzA(i8 << 3);
                            iZzv = zzjm.zzy((String) object);
                            i2 = iZzA4 + iZzv;
                            iZzA15 += i2;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA5 = zzlz.zzo(i8, unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzA5;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzje zzjeVar = (zzje) unsafe.getObject(obj, j);
                        iZzA6 = zzjm.zzA(i8 << 3);
                        iZzd = zzjeVar.zzd();
                        iZzA7 = zzjm.zzA(iZzd);
                        i2 = iZzA6 + iZzA7 + iZzd;
                        iZzA15 += i2;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        iZzA4 = zzjm.zzA(i8 << 3);
                        iZzv = zzjm.zzA(i12);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        iZzA4 = zzjm.zzA(i8 << 3);
                        iZzv = zzjm.zzv(i13);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA2 = zzjm.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA = zzjm.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        iZzA4 = zzjm.zzA(i8 << 3);
                        iZzv = zzjm.zzA((i14 >> 31) ^ (i14 + i14));
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        iZzA15 += zzjm.zzA(i8 << 3) + zzjm.zzB((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA5 = zzjm.zzu(i8, (zzlm) unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzA5;
                        break;
                    }
                case 18:
                    iZzA5 = zzlz.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 19:
                    iZzA5 = zzlz.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 20:
                    iZzA5 = zzlz.zzm(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 21:
                    iZzA5 = zzlz.zzx(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 22:
                    iZzA5 = zzlz.zzk(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 23:
                    iZzA5 = zzlz.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 24:
                    iZzA5 = zzlz.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 25:
                    iZzA5 = zzlz.zza(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 26:
                    iZzu = zzlz.zzu(i8, (List) unsafe.getObject(obj, j));
                    iZzA15 += iZzu;
                    break;
                case 27:
                    iZzu = zzlz.zzp(i8, (List) unsafe.getObject(obj, j), zzE(i6));
                    iZzA15 += iZzu;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iZzu = zzlz.zzc(i8, (List) unsafe.getObject(obj, j));
                    iZzA15 += iZzu;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iZzu = zzlz.zzv(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 30:
                    z = false;
                    iZzd2 = zzlz.zzd(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z = false;
                    iZzd2 = zzlz.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case 32:
                    z = false;
                    iZzd2 = zzlz.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case 33:
                    z = false;
                    iZzd2 = zzlz.zzq(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z = false;
                    iZzd2 = zzlz.zzs(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case 35:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 37:
                    iZzi = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 38:
                    iZzi = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iZzi = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 40:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iZzi = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    iZzi = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iZzi = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 45:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 46:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 47:
                    iZzi = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 48:
                    iZzi = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjm.zzz(i8);
                        iZzA8 = zzjm.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 49:
                    iZzu = zzlz.zzj(i8, (List) unsafe.getObject(obj, j), zzE(i6));
                    iZzA15 += iZzu;
                    break;
                case 50:
                    zzlh.zza(i8, unsafe.getObject(obj, j), zzF(i6));
                    break;
                case 51:
                    if (zzX(obj, i8, i6)) {
                        iZzA10 = zzjm.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 52:
                    if (zzX(obj, i8, i6)) {
                        iZzA11 = zzjm.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 53:
                    if (zzX(obj, i8, i6)) {
                        long jZzC = zzC(obj, j);
                        iZzA12 = zzjm.zzA(i8 << 3);
                        iZzB2 = zzjm.zzB(jZzC);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 54:
                    if (zzX(obj, i8, i6)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA12 = zzjm.zzA(i8 << 3);
                        iZzB2 = zzjm.zzB(jZzC2);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 55:
                    if (zzX(obj, i8, i6)) {
                        int iZzr = zzr(obj, j);
                        iZzA9 = zzjm.zzA(i8 << 3);
                        iZzi = zzjm.zzv(iZzr);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 56:
                    if (zzX(obj, i8, i6)) {
                        iZzA10 = zzjm.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 57:
                    if (zzX(obj, i8, i6)) {
                        iZzA11 = zzjm.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 58:
                    if (zzX(obj, i8, i6)) {
                        iZzu = zzjm.zzA(i8 << 3) + 1;
                        iZzA15 += iZzu;
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (zzX(obj, i8, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzje) {
                            iZzA13 = zzjm.zzA(i8 << 3);
                            iZzd3 = ((zzje) object2).zzd();
                            iZzA14 = zzjm.zzA(iZzd3);
                            i3 = iZzA13 + iZzA14 + iZzd3;
                            iZzA15 += i3;
                        } else {
                            iZzA9 = zzjm.zzA(i8 << 3);
                            iZzi = zzjm.zzy((String) object2);
                            i3 = iZzA9 + iZzi;
                            iZzA15 += i3;
                        }
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (zzX(obj, i8, i6)) {
                        iZzu = zzlz.zzo(i8, unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzu;
                    }
                    break;
                case 61:
                    if (zzX(obj, i8, i6)) {
                        zzje zzjeVar2 = (zzje) unsafe.getObject(obj, j);
                        iZzA13 = zzjm.zzA(i8 << 3);
                        iZzd3 = zzjeVar2.zzd();
                        iZzA14 = zzjm.zzA(iZzd3);
                        i3 = iZzA13 + iZzA14 + iZzd3;
                        iZzA15 += i3;
                    }
                    break;
                case 62:
                    if (zzX(obj, i8, i6)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA9 = zzjm.zzA(i8 << 3);
                        iZzi = zzjm.zzA(iZzr2);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 63:
                    if (zzX(obj, i8, i6)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA9 = zzjm.zzA(i8 << 3);
                        iZzi = zzjm.zzv(iZzr3);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 64:
                    if (zzX(obj, i8, i6)) {
                        iZzA11 = zzjm.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 65:
                    if (zzX(obj, i8, i6)) {
                        iZzA10 = zzjm.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzX(obj, i8, i6)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA9 = zzjm.zzA(i8 << 3);
                        iZzi = zzjm.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzX(obj, i8, i6)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA15 += zzjm.zzA(i8 << 3) + zzjm.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (zzX(obj, i8, i6)) {
                        iZzu = zzjm.zzu(i8, (zzlm) unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzu;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        int iZza = iZzA15 + zzmoVar.zza(zzmoVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzB2 = zzB(i3);
            int iZzA9 = zzA(iZzB2);
            int i4 = this.zzc[i3];
            long j = iZzB2 & 1048575;
            if (iZzA9 >= zzjx.zzJ.zza() && iZzA9 <= zzjx.zzW.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (iZzA9) {
                case 0:
                    if (zzT(obj, i3)) {
                        iZzA = zzjm.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i3)) {
                        iZzA2 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i3)) {
                        long jZzd = zzmy.zzd(obj, j);
                        iZzA3 = zzjm.zzA(i4 << 3);
                        iZzB = zzjm.zzB(jZzd);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i3)) {
                        long jZzd2 = zzmy.zzd(obj, j);
                        iZzA3 = zzjm.zzA(i4 << 3);
                        iZzB = zzjm.zzB(jZzd2);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i3)) {
                        int iZzc = zzmy.zzc(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzv(iZzc);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i3)) {
                        iZzA = zzjm.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i3)) {
                        iZzA2 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i3)) {
                        iZzA5 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzT(obj, i3)) {
                        break;
                    } else {
                        Object objZzf = zzmy.zzf(obj, j);
                        if (objZzf instanceof zzje) {
                            iZzA6 = zzjm.zzA(i4 << 3);
                            iZzd = ((zzje) objZzf).zzd();
                            iZzA7 = zzjm.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                            break;
                        } else {
                            iZzA4 = zzjm.zzA(i4 << 3);
                            iZzv = zzjm.zzy((String) objZzf);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzT(obj, i3)) {
                        iZzo = zzlz.zzo(i4, zzmy.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i3)) {
                        zzje zzjeVar = (zzje) zzmy.zzf(obj, j);
                        iZzA6 = zzjm.zzA(i4 << 3);
                        iZzd = zzjeVar.zzd();
                        iZzA7 = zzjm.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj, i3)) {
                        int iZzc2 = zzmy.zzc(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzA(iZzc2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i3)) {
                        int iZzc3 = zzmy.zzc(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzv(iZzc3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i3)) {
                        iZzA2 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i3)) {
                        iZzA = zzjm.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i3)) {
                        int iZzc4 = zzmy.zzc(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i3)) {
                        long jZzd3 = zzmy.zzd(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i3)) {
                        iZzo = zzjm.zzu(i4, (zzlm) zzmy.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iZzo = zzlz.zzh(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 19:
                    iZzo = zzlz.zzf(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 20:
                    iZzo = zzlz.zzm(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 21:
                    iZzo = zzlz.zzx(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 22:
                    iZzo = zzlz.zzk(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 23:
                    iZzo = zzlz.zzh(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 24:
                    iZzo = zzlz.zzf(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 25:
                    iZzo = zzlz.zza(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 26:
                    iZzo = zzlz.zzu(i4, (List) zzmy.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case 27:
                    iZzo = zzlz.zzp(i4, (List) zzmy.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iZzo = zzlz.zzc(i4, (List) zzmy.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iZzo = zzlz.zzv(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 30:
                    iZzo = zzlz.zzd(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iZzo = zzlz.zzf(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 32:
                    iZzo = zzlz.zzh(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 33:
                    iZzo = zzlz.zzq(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iZzo = zzlz.zzs(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 35:
                    iZzv = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iZzv = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZzv = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZzv = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iZzv = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZzv = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iZzv = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iZzv = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case SignatureVisitor.EXTENDS /* 43 */:
                    iZzv = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iZzv = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZzv = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZzv = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZzv = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZzv = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjm.zzz(i4);
                        iZzA8 = zzjm.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iZzo = zzlz.zzj(i4, (List) zzmy.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case 50:
                    zzlh.zza(i4, zzmy.zzf(obj, j), zzF(i3));
                    break;
                case 51:
                    if (zzX(obj, i4, i3)) {
                        iZzA = zzjm.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i4, i3)) {
                        iZzA2 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i4, i3)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjm.zzA(i4 << 3);
                        iZzB = zzjm.zzB(jZzC);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i4, i3)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjm.zzA(i4 << 3);
                        iZzB = zzjm.zzB(jZzC2);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i4, i3)) {
                        int iZzr = zzr(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzv(iZzr);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i4, i3)) {
                        iZzA = zzjm.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i4, i3)) {
                        iZzA2 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i4, i3)) {
                        iZzA5 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (!zzX(obj, i4, i3)) {
                        break;
                    } else {
                        Object objZzf2 = zzmy.zzf(obj, j);
                        if (objZzf2 instanceof zzje) {
                            iZzA6 = zzjm.zzA(i4 << 3);
                            iZzd = ((zzje) objZzf2).zzd();
                            iZzA7 = zzjm.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                            break;
                        } else {
                            iZzA4 = zzjm.zzA(i4 << 3);
                            iZzv = zzjm.zzy((String) objZzf2);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzX(obj, i4, i3)) {
                        iZzo = zzlz.zzo(i4, zzmy.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i4, i3)) {
                        zzje zzjeVar2 = (zzje) zzmy.zzf(obj, j);
                        iZzA6 = zzjm.zzA(i4 << 3);
                        iZzd = zzjeVar2.zzd();
                        iZzA7 = zzjm.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i4, i3)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzA(iZzr2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i4, i3)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzv(iZzr3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i4, i3)) {
                        iZzA2 = zzjm.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i4, i3)) {
                        iZzA = zzjm.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzX(obj, i4, i3)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzX(obj, i4, i3)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA4 = zzjm.zzA(i4 << 3);
                        iZzv = zzjm.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzX(obj, i4, i3)) {
                        iZzo = zzjm.zzu(i4, (zzlm) zzmy.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmo zzmoVar = this.zzn;
        return i2 + zzmoVar.zza(zzmoVar.zzd(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmy.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzir zzirVar) {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlg) object).zze()) {
            zzlg zzlgVarZzb = zzlg.zza().zzb();
            zzlh.zzb(zzlgVarZzb, object);
            unsafe.putObject(obj, j, zzlgVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzirVar) throws zzkp {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzis.zzp(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzis.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iZzm = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzirVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int iZzj = zzis.zzj(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzirVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzis.zzp(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzis.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int iZzm2 = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzirVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm2;
                }
                break;
            case Opcodes.V15 /* 59 */:
                if (i5 == 2) {
                    int iZzj2 = zzis.zzj(bArr, i, zzirVar);
                    int i9 = zzirVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zznd.zzf(bArr, iZzj2, iZzj2 + i9)) {
                            throw zzkp.zzc();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzkn.zzb));
                        iZzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzj2;
                }
                break;
            case Opcodes.V16 /* 60 */:
                if (i5 == 2) {
                    Object objZzH = zzH(obj, i4, i8);
                    int iZzo = zzis.zzo(objZzH, zzE(i8), bArr, i, i2, zzirVar);
                    zzP(obj, i4, i8, objZzH);
                    return iZzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int iZza = zzis.zza(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, zzirVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return iZza;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int iZzj3 = zzis.zzj(bArr, i, zzirVar);
                    int i10 = zzirVar.zza;
                    zzkj zzkjVarZzD = zzD(i8);
                    if (zzkjVarZzD == null || zzkjVarZzD.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzj(i3, Long.valueOf(i10));
                    }
                    return iZzj3;
                }
                break;
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                if (i5 == 0) {
                    int iZzj4 = zzis.zzj(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzji.zzb(zzirVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj4;
                }
                break;
            case TypeReference.INSTANCEOF /* 67 */:
                if (i5 == 0) {
                    int iZzm3 = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzji.zzc(zzirVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm3;
                }
                break;
            case TypeReference.NEW /* 68 */:
                if (i5 == 3) {
                    Object objZzH2 = zzH(obj, i4, i8);
                    int iZzn = zzis.zzn(objZzH2, zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzirVar);
                    zzP(obj, i4, i8, objZzH2);
                    return iZzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x029d, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r8 = r18;
        r2 = r19;
        r1 = r23;
        r7 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b3, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e0, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0304, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029b, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0086. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws zzkp {
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
        int i10;
        int i11;
        int i12;
        int iZza;
        int iZzm;
        zzlp<T> zzlpVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzir zzirVar2 = zzirVar;
        zzJ(obj);
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
                iZzk = zzis.zzk(b2, bArr2, i20, zzirVar2);
                b = zzirVar2.zza;
            } else {
                b = b2;
                iZzk = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            int iZzx = i21 > i16 ? zzlpVar.zzx(i21, i18 / 3) : zzlpVar.zzw(i21);
            if (iZzx == i15) {
                i3 = iZzk;
                i4 = i21;
                i5 = i15;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = zzlpVar.zzc;
                int i23 = iArr[iZzx + 1];
                int iZzA = zzA(i23);
                long j = i23 & i14;
                if (iZzA <= 17) {
                    int i24 = iArr[iZzx + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = 1048575;
                    int i27 = i24 & 1048575;
                    if (i27 != i17) {
                        if (i17 != 1048575) {
                            unsafe2.putInt(obj2, i17, i19);
                            i26 = 1048575;
                        }
                        if (i27 != i26) {
                            i19 = unsafe2.getInt(obj2, i27);
                        }
                        i17 = i27;
                    }
                    switch (iZzA) {
                        case 0:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i19;
                            if (i22 == 1) {
                                zzmy.zzo(obj2, j, Double.longBitsToDouble(zzis.zzp(bArr2, i11)));
                                iZzi = i11 + 8;
                                i19 = i12 | i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 1:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i19;
                            if (i22 == 5) {
                                zzmy.zzp(obj2, j, Float.intBitsToFloat(zzis.zzb(bArr2, i11)));
                                iZzi = i11 + 4;
                                i19 = i12 | i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 2:
                        case 3:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i19;
                            if (i22 != 0) {
                                i19 = i12;
                                unsafe = unsafe2;
                                i6 = i7;
                                i3 = i11;
                                i5 = -1;
                                break;
                            } else {
                                iZzm = zzis.zzm(bArr2, i11, zzirVar2);
                                unsafe2.putLong(obj, j, zzirVar2.zzb);
                                i19 = i12 | i25;
                                i18 = i7;
                                iZzi = iZzm;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                i13 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i19;
                            if (i22 == 0) {
                                iZzi = zzis.zzj(bArr2, i11, zzirVar2);
                                unsafe2.putInt(obj2, j, zzirVar2.zza);
                                i19 = i12 | i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 5:
                        case 14:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            i12 = i19;
                            if (i22 == 1) {
                                i11 = iZzk;
                                unsafe2.putLong(obj, j, zzis.zzp(bArr2, iZzk));
                                iZzi = i11 + 8;
                                i19 = i12 | i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 6:
                        case 13:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            i12 = i19;
                            if (i22 == 5) {
                                unsafe2.putInt(obj2, j, zzis.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i19 = i12 | i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 7:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            boolean z = true;
                            i12 = i19;
                            if (i22 == 0) {
                                int iZzm2 = zzis.zzm(bArr2, iZzk, zzirVar2);
                                if (zzirVar2.zzb == 0) {
                                    z = false;
                                }
                                zzmy.zzm(obj2, j, z);
                                i19 = i12 | i25;
                                i13 = i2;
                                iZzi = iZzm2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 8:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            i12 = i19;
                            if (i22 == 2) {
                                iZzi = (536870912 & i23) == 0 ? zzis.zzg(bArr2, iZzk, zzirVar2) : zzis.zzh(bArr2, iZzk, zzirVar2);
                                unsafe2.putObject(obj2, j, zzirVar2.zzc);
                                i19 = i12 | i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 9:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            if (i22 == 2) {
                                Object objZzG = zzlpVar.zzG(obj2, i7);
                                iZzi = zzis.zzo(objZzG, zzlpVar.zzE(i7), bArr, iZzk, i2, zzirVar);
                                zzlpVar.zzO(obj2, i7, objZzG);
                                i19 |= i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i12 = i19;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 10:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            if (i22 == 2) {
                                iZza = zzis.zza(bArr2, iZzk, zzirVar2);
                                unsafe2.putObject(obj2, j, zzirVar2.zzc);
                                i19 |= i25;
                                i13 = i2;
                                iZzi = iZza;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i12 = i19;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 12:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            if (i22 == 0) {
                                iZza = zzis.zzj(bArr2, iZzk, zzirVar2);
                                unsafe2.putInt(obj2, j, zzirVar2.zza);
                                i19 |= i25;
                                i13 = i2;
                                iZzi = iZza;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i12 = i19;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 15:
                            i4 = i21;
                            zzirVar2 = zzirVar;
                            i7 = iZzx;
                            if (i22 == 0) {
                                iZzi = zzis.zzj(bArr2, iZzk, zzirVar2);
                                unsafe2.putInt(obj2, j, zzji.zzb(zzirVar2.zza));
                                i19 |= i25;
                                i13 = i2;
                                i18 = i7;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                break;
                            }
                            i11 = iZzk;
                            i12 = i19;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                        case 16:
                            if (i22 != 0) {
                                i4 = i21;
                                i7 = iZzx;
                                i11 = iZzk;
                                i12 = i19;
                                i19 = i12;
                                unsafe = unsafe2;
                                i6 = i7;
                                i3 = i11;
                                i5 = -1;
                                break;
                            } else {
                                zzirVar2 = zzirVar;
                                iZzm = zzis.zzm(bArr2, iZzk, zzirVar2);
                                i7 = iZzx;
                                i4 = i21;
                                unsafe2.putLong(obj, j, zzji.zzc(zzirVar2.zzb));
                                i19 |= i25;
                                i18 = i7;
                                iZzi = iZzm;
                                i16 = i4;
                                i15 = -1;
                                i14 = 1048575;
                                i13 = i2;
                                break;
                            }
                        default:
                            i4 = i21;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i19;
                            i19 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i3 = i11;
                            i5 = -1;
                            break;
                    }
                } else {
                    i4 = i21;
                    int i28 = i19;
                    zzirVar2 = zzirVar;
                    i7 = iZzx;
                    if (iZzA != 27) {
                        if (iZzA <= 49) {
                            int i29 = iZzk;
                            i9 = i17;
                            i10 = i28;
                            i5 = -1;
                            unsafe = unsafe2;
                            i6 = i7;
                            iZzi = zzv(obj, bArr, iZzk, i2, b, i4, i22, i7, i23, iZzA, j, zzirVar);
                        } else {
                            i8 = iZzk;
                            i9 = i17;
                            i10 = i28;
                            unsafe = unsafe2;
                            i6 = i7;
                            i5 = -1;
                            if (iZzA != 50) {
                                iZzi = zzt(obj, bArr, i8, i2, b, i4, i22, i23, iZzA, j, i6, zzirVar);
                            } else if (i22 == 2) {
                                iZzi = zzs(obj, bArr, i8, i2, i6, j, zzirVar);
                            }
                        }
                        i14 = 1048575;
                    } else if (i22 == 2) {
                        zzkm zzkmVarZzd = (zzkm) unsafe2.getObject(obj2, j);
                        if (!zzkmVarZzd.zzc()) {
                            int size = zzkmVarZzd.size();
                            zzkmVarZzd = zzkmVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj2, j, zzkmVarZzd);
                        }
                        iZzi = zzis.zze(zzlpVar.zzE(i7), b, bArr, iZzk, i2, zzkmVarZzd, zzirVar);
                        i13 = i2;
                        i19 = i28;
                        i18 = i7;
                        i16 = i4;
                        i15 = -1;
                        i14 = 1048575;
                    } else {
                        i8 = iZzk;
                        i9 = i17;
                        i10 = i28;
                        unsafe = unsafe2;
                        i6 = i7;
                        i5 = -1;
                    }
                    i3 = i8;
                    i17 = i9;
                    i19 = i10;
                }
            }
            iZzi = zzis.zzi(b, bArr, i3, i2, zzd(obj), zzirVar);
            zzlpVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            zzirVar2 = zzirVar;
            i15 = i5;
            i18 = i6;
            i16 = i4;
            unsafe2 = unsafe;
            i14 = 1048575;
        }
        int i30 = i19;
        Unsafe unsafe3 = unsafe2;
        if (i17 != i14) {
            unsafe3.putInt(obj, i17, i30);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zzkp.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzir zzirVar) throws zzkp {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = i;
        Unsafe unsafe = zzb;
        zzkm zzkmVarZzd = (zzkm) unsafe.getObject(obj, j2);
        if (!zzkmVarZzd.zzc()) {
            int size = zzkmVarZzd.size();
            zzkmVarZzd = zzkmVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkmVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjo zzjoVar = (zzjo) zzkmVarZzd;
                    int iZzj3 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i12 = zzirVar.zza + iZzj3;
                    while (iZzj3 < i12) {
                        zzjoVar.zze(Double.longBitsToDouble(zzis.zzp(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i12) {
                        return iZzj3;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzjo zzjoVar2 = (zzjo) zzkmVarZzd;
                    zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, i)));
                    while (true) {
                        i8 = iZzj2 + 8;
                        if (i8 < i2) {
                            iZzj2 = zzis.zzj(bArr, i8, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, iZzj2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZzj2;
            case 19:
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    zzjy zzjyVar = (zzjy) zzkmVarZzd;
                    int iZzj4 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i13 = zzirVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzjyVar.zze(Float.intBitsToFloat(zzis.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzjy zzjyVar2 = (zzjy) zzkmVarZzd;
                    zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj2 + 4;
                        if (i9 < i2) {
                            iZzj2 = zzis.zzj(bArr, i9, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, iZzj2)));
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
                    zzlb zzlbVar = (zzlb) zzkmVarZzd;
                    int iZzj5 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i14 = zzirVar.zza + iZzj5;
                    while (iZzj5 < i14) {
                        iZzj5 = zzis.zzm(bArr, iZzj5, zzirVar);
                        zzlbVar.zzg(zzirVar.zzb);
                    }
                    if (iZzj5 == i14) {
                        return iZzj5;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar2 = (zzlb) zzkmVarZzd;
                    int iZzm = zzis.zzm(bArr, iZzj2, zzirVar);
                    zzlbVar2.zzg(zzirVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzis.zzj(bArr, iZzm, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzis.zzm(bArr, iZzj6, zzirVar);
                        zzlbVar2.zzg(zzirVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case SignatureVisitor.EXTENDS /* 43 */:
                if (i5 == 2) {
                    return zzis.zzf(bArr, iZzj2, zzkmVarZzd, zzirVar);
                }
                if (i5 == 0) {
                    return zzis.zzl(i3, bArr, i, i2, zzkmVarZzd, zzirVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzlb zzlbVar3 = (zzlb) zzkmVarZzd;
                    int iZzj7 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i15 = zzirVar.zza + iZzj7;
                    while (iZzj7 < i15) {
                        zzlbVar3.zzg(zzis.zzp(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i15) {
                        return iZzj7;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzlb zzlbVar4 = (zzlb) zzkmVarZzd;
                    zzlbVar4.zzg(zzis.zzp(bArr, i));
                    while (true) {
                        i10 = iZzj2 + 8;
                        if (i10 < i2) {
                            iZzj2 = zzis.zzj(bArr, i10, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzlbVar4.zzg(zzis.zzp(bArr, iZzj2));
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
                    zzkg zzkgVar = (zzkg) zzkmVarZzd;
                    int iZzj8 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i16 = zzirVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzkgVar.zzh(zzis.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzkg zzkgVar2 = (zzkg) zzkmVarZzd;
                    zzkgVar2.zzh(zzis.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj2 + 4;
                        if (i11 < i2) {
                            iZzj2 = zzis.zzj(bArr, i11, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzkgVar2.zzh(zzis.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i11;
                }
                return iZzj2;
            case 25:
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    zzit zzitVar = (zzit) zzkmVarZzd;
                    iZzj = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i17 = zzirVar.zza + iZzj;
                    while (iZzj < i17) {
                        iZzj = zzis.zzm(bArr, iZzj, zzirVar);
                        zzitVar.zze(zzirVar.zzb != 0);
                    }
                    if (iZzj != i17) {
                        throw zzkp.zzf();
                    }
                    return iZzj;
                }
                if (i5 == 0) {
                    zzit zzitVar2 = (zzit) zzkmVarZzd;
                    int iZzm2 = zzis.zzm(bArr, iZzj2, zzirVar);
                    zzitVar2.zze(zzirVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj9 = zzis.zzj(bArr, iZzm2, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzis.zzm(bArr, iZzj9, zzirVar);
                        zzitVar2.zze(zzirVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj10 = zzis.zzj(bArr, iZzj2, zzirVar);
                        int i18 = zzirVar.zza;
                        if (i18 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i18 == 0) {
                            zzkmVarZzd.add("");
                        } else {
                            zzkmVarZzd.add(new String(bArr, iZzj10, i18, zzkn.zzb));
                            iZzj10 += i18;
                        }
                        while (iZzj10 < i2) {
                            int iZzj11 = zzis.zzj(bArr, iZzj10, zzirVar);
                            if (i3 != zzirVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzis.zzj(bArr, iZzj11, zzirVar);
                            int i19 = zzirVar.zza;
                            if (i19 < 0) {
                                throw zzkp.zzd();
                            }
                            if (i19 == 0) {
                                zzkmVarZzd.add("");
                            } else {
                                zzkmVarZzd.add(new String(bArr, iZzj10, i19, zzkn.zzb));
                                iZzj10 += i19;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i20 = zzirVar.zza;
                    if (i20 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i20 == 0) {
                        zzkmVarZzd.add("");
                    } else {
                        int i21 = iZzj12 + i20;
                        if (!zznd.zzf(bArr, iZzj12, i21)) {
                            throw zzkp.zzc();
                        }
                        zzkmVarZzd.add(new String(bArr, iZzj12, i20, zzkn.zzb));
                        iZzj12 = i21;
                    }
                    while (iZzj12 < i2) {
                        int iZzj13 = zzis.zzj(bArr, iZzj12, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzis.zzj(bArr, iZzj13, zzirVar);
                        int i22 = zzirVar.zza;
                        if (i22 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i22 == 0) {
                            zzkmVarZzd.add("");
                        } else {
                            int i23 = iZzj12 + i22;
                            if (!zznd.zzf(bArr, iZzj12, i23)) {
                                throw zzkp.zzc();
                            }
                            zzkmVarZzd.add(new String(bArr, iZzj12, i22, zzkn.zzb));
                            iZzj12 = i23;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i5 == 2) {
                    return zzis.zze(zzE(i6), i3, bArr, i, i2, zzkmVarZzd, zzirVar);
                }
                return iZzj2;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (i5 == 2) {
                    int iZzj14 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i24 = zzirVar.zza;
                    if (i24 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i24 > bArr.length - iZzj14) {
                        throw zzkp.zzf();
                    }
                    if (i24 == 0) {
                        zzkmVarZzd.add(zzje.zzb);
                    } else {
                        zzkmVarZzd.add(zzje.zzl(bArr, iZzj14, i24));
                        iZzj14 += i24;
                    }
                    while (iZzj14 < i2) {
                        int iZzj15 = zzis.zzj(bArr, iZzj14, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzis.zzj(bArr, iZzj15, zzirVar);
                        int i25 = zzirVar.zza;
                        if (i25 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i25 > bArr.length - iZzj14) {
                            throw zzkp.zzf();
                        }
                        if (i25 == 0) {
                            zzkmVarZzd.add(zzje.zzb);
                        } else {
                            zzkmVarZzd.add(zzje.zzl(bArr, iZzj14, i25));
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
                        iZzj = zzis.zzl(i3, bArr, i, i2, zzkmVarZzd, zzirVar);
                    }
                    return iZzj2;
                }
                iZzj = zzis.zzf(bArr, iZzj2, zzkmVarZzd, zzirVar);
                zzlz.zzC(obj, i4, zzkmVarZzd, zzD(i6), null, this.zzn);
                return iZzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkg zzkgVar3 = (zzkg) zzkmVarZzd;
                    int iZzj16 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i26 = zzirVar.zza + iZzj16;
                    while (iZzj16 < i26) {
                        iZzj16 = zzis.zzj(bArr, iZzj16, zzirVar);
                        zzkgVar3.zzh(zzji.zzb(zzirVar.zza));
                    }
                    if (iZzj16 == i26) {
                        return iZzj16;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzkg zzkgVar4 = (zzkg) zzkmVarZzd;
                    int iZzj17 = zzis.zzj(bArr, iZzj2, zzirVar);
                    zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    while (iZzj17 < i2) {
                        int iZzj18 = zzis.zzj(bArr, iZzj17, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzis.zzj(bArr, iZzj18, zzirVar);
                        zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 48:
                if (i5 == 2) {
                    zzlb zzlbVar5 = (zzlb) zzkmVarZzd;
                    int iZzj19 = zzis.zzj(bArr, iZzj2, zzirVar);
                    int i27 = zzirVar.zza + iZzj19;
                    while (iZzj19 < i27) {
                        iZzj19 = zzis.zzm(bArr, iZzj19, zzirVar);
                        zzlbVar5.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    if (iZzj19 == i27) {
                        return iZzj19;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar6 = (zzlb) zzkmVarZzd;
                    int iZzm3 = zzis.zzm(bArr, iZzj2, zzirVar);
                    zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj20 = zzis.zzj(bArr, iZzm3, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzis.zzm(bArr, iZzj20, zzirVar);
                        zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i5 == 3) {
                    zzlx zzlxVarZzE = zzE(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzis.zzc(zzlxVarZzE, bArr, i, i2, i28, zzirVar);
                    zzkmVarZzd.add(zzirVar.zzc);
                    while (iZzc < i2) {
                        int iZzj21 = zzis.zzj(bArr, iZzc, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzis.zzc(zzlxVarZzE, bArr, iZzj21, i2, i28, zzirVar);
                        zzkmVarZzd.add(zzirVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzB = zzB(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzkn.zzc(Double.doubleToLongBits(zzmy.zza(obj, j)));
                    i2 = i + iZzc;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(zzmy.zzb(obj, j));
                    i2 = i + iZzc;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = zzmy.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = zzmy.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzkn.zza(zzmy.zzw(obj, j));
                    i2 = i + iZzc;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) zzmy.zzf(obj, j)).hashCode();
                    i2 = i + iZzc;
                    break;
                case 9:
                    Object objZzf = zzmy.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = zzmy.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = zzmy.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = zzmy.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = zzmy.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = zzmy.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzmy.zzf(obj, j);
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
                    iZzc = zzmy.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = zzmy.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 51:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkn.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkn.zza(zzY(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) zzmy.zzf(obj, j)).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmy.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmy.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmy.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0429, code lost:
    
        if (r6 == 1048575) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x042b, code lost:
    
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0431, code lost:
    
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0435, code lost:
    
        if (r3 >= r9.zzl) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0437, code lost:
    
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmy.zzf(r12, r9.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0449, code lost:
    
        if (r5 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0450, code lost:
    
        if (r9.zzD(r4) != null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0452, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0455, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzlg) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlf) r9.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x045d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x045e, code lost:
    
        if (r7 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0462, code lost:
    
        if (r0 != r33) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0469, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x046c, code lost:
    
        if (r0 > r33) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x046e, code lost:
    
        if (r1 != r7) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0470, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0475, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzir zzirVar) throws zzkp {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzlp<T> zzlpVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj3;
        int i11;
        zzir zzirVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzlp<T> zzlpVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i23 = i2;
        int i24 = i3;
        zzir zzirVar3 = zzirVar;
        zzJ(obj);
        Unsafe unsafe2 = zzb;
        int iZzi = i;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        int i29 = 1048575;
        while (true) {
            if (iZzi < i23) {
                int i30 = iZzi + 1;
                byte b = bArr2[iZzi];
                if (b < 0) {
                    int iZzk = zzis.zzk(b, bArr2, i30, zzirVar3);
                    i5 = zzirVar3.zza;
                    i30 = iZzk;
                } else {
                    i5 = b;
                }
                int i31 = i5 >>> 3;
                int i32 = i5 & 7;
                int iZzx = i31 > i28 ? zzlpVar2.zzx(i31, i26 / 3) : zzlpVar2.zzw(i31);
                if (iZzx == -1) {
                    i6 = i31;
                    i7 = i30;
                    i8 = i5;
                    i9 = i27;
                    unsafe = unsafe2;
                    i4 = i24;
                    i10 = 0;
                } else {
                    int[] iArr = zzlpVar2.zzc;
                    int i33 = iArr[iZzx + 1];
                    int iZzA = zzA(i33);
                    int i34 = i30;
                    long j = i33 & 1048575;
                    if (iZzA <= 17) {
                        int i35 = iArr[iZzx + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i29) {
                            i12 = i5;
                            if (i29 != 1048575) {
                                unsafe2.putInt(obj4, i29, i27);
                            }
                            i13 = i37;
                            i9 = unsafe2.getInt(obj4, i37);
                        } else {
                            i12 = i5;
                            i9 = i27;
                            i13 = i29;
                        }
                        switch (iZzA) {
                            case 0:
                                i14 = iZzx;
                                i15 = i31;
                                i16 = i34;
                                if (i32 != 1) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    zzmy.zzo(obj4, j, Double.longBitsToDouble(zzis.zzp(bArr2, i16)));
                                    iZzi = i16 + 8;
                                    i27 = i9 | i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 1:
                                i14 = iZzx;
                                i15 = i31;
                                i16 = i34;
                                if (i32 != 5) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    zzmy.zzp(obj4, j, Float.intBitsToFloat(zzis.zzb(bArr2, i16)));
                                    iZzi = i16 + 4;
                                    i27 = i9 | i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 2:
                            case 3:
                                i14 = iZzx;
                                i15 = i31;
                                i16 = i34;
                                if (i32 != 0) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    int iZzm = zzis.zzm(bArr2, i16, zzirVar3);
                                    unsafe2.putLong(obj, j, zzirVar3.zzb);
                                    i27 = i9 | i36;
                                    iZzi = iZzm;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 4:
                            case 11:
                                i14 = iZzx;
                                i15 = i31;
                                i16 = i34;
                                if (i32 != 0) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    iZzi = zzis.zzj(bArr2, i16, zzirVar3);
                                    unsafe2.putInt(obj4, j, zzirVar3.zza);
                                    i27 = i9 | i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 5:
                            case 14:
                                i14 = iZzx;
                                int i38 = i12;
                                i15 = i31;
                                if (i32 != 1) {
                                    i12 = i38;
                                    i16 = i34;
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    i12 = i38;
                                    i16 = i34;
                                    unsafe2.putLong(obj, j, zzis.zzp(bArr2, i34));
                                    iZzi = i16 + 8;
                                    i27 = i9 | i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 6:
                            case 13:
                                i14 = iZzx;
                                i17 = i12;
                                i15 = i31;
                                i18 = i34;
                                if (i32 != 5) {
                                    i8 = i17;
                                    i16 = i18;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, zzis.zzb(bArr2, i18));
                                    iZzi = i18 + 4;
                                    i27 = i9 | i36;
                                    i25 = i17;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 7:
                                i14 = iZzx;
                                i17 = i12;
                                i15 = i31;
                                i18 = i34;
                                if (i32 != 0) {
                                    i8 = i17;
                                    i16 = i18;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    iZzi = zzis.zzm(bArr2, i18, zzirVar3);
                                    zzmy.zzm(obj4, j, zzirVar3.zzb != 0);
                                    i27 = i9 | i36;
                                    i25 = i17;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 8:
                                i14 = iZzx;
                                i17 = i12;
                                i15 = i31;
                                i18 = i34;
                                if (i32 != 2) {
                                    i8 = i17;
                                    i16 = i18;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    iZzi = (536870912 & i33) == 0 ? zzis.zzg(bArr2, i18, zzirVar3) : zzis.zzh(bArr2, i18, zzirVar3);
                                    unsafe2.putObject(obj4, j, zzirVar3.zzc);
                                    i27 = i9 | i36;
                                    i25 = i17;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 9:
                                i14 = iZzx;
                                i19 = i12;
                                i15 = i31;
                                i20 = i34;
                                if (i32 != 2) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    Object objZzG = zzlpVar2.zzG(obj4, i14);
                                    iZzi = zzis.zzo(objZzG, zzlpVar2.zzE(i14), bArr, i20, i2, zzirVar);
                                    zzlpVar2.zzO(obj4, i14, objZzG);
                                    i27 = i9 | i36;
                                    i25 = i19;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 10:
                                i14 = iZzx;
                                i19 = i12;
                                i15 = i31;
                                i20 = i34;
                                if (i32 != 2) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    iZzi = zzis.zza(bArr2, i20, zzirVar3);
                                    unsafe2.putObject(obj4, j, zzirVar3.zzc);
                                    i27 = i9 | i36;
                                    i25 = i19;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 12:
                                i14 = iZzx;
                                i19 = i12;
                                i15 = i31;
                                i20 = i34;
                                if (i32 != 0) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    iZzi = zzis.zzj(bArr2, i20, zzirVar3);
                                    int i39 = zzirVar3.zza;
                                    zzkj zzkjVarZzD = zzlpVar2.zzD(i14);
                                    if (zzkjVarZzD == null || zzkjVarZzD.zza(i39)) {
                                        unsafe2.putInt(obj4, j, i39);
                                        i27 = i9 | i36;
                                        i25 = i19;
                                        i28 = i15;
                                        i26 = i14;
                                        i29 = i13;
                                        i23 = i2;
                                        i24 = i3;
                                    } else {
                                        zzd(obj).zzj(i19, Long.valueOf(i39));
                                        i25 = i19;
                                        i28 = i15;
                                        i26 = i14;
                                        i27 = i9;
                                        i29 = i13;
                                        i23 = i2;
                                        i24 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i14 = iZzx;
                                i19 = i12;
                                i15 = i31;
                                i20 = i34;
                                if (i32 != 0) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    iZzi = zzis.zzj(bArr2, i20, zzirVar3);
                                    unsafe2.putInt(obj4, j, zzji.zzb(zzirVar3.zza));
                                    i27 = i9 | i36;
                                    i25 = i19;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 16:
                                if (i32 != 0) {
                                    i14 = iZzx;
                                    i15 = i31;
                                    i8 = i12;
                                    i16 = i34;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    int iZzm2 = zzis.zzm(bArr2, i34, zzirVar3);
                                    i15 = i31;
                                    i14 = iZzx;
                                    i19 = i12;
                                    unsafe2.putLong(obj, j, zzji.zzc(zzirVar3.zzb));
                                    i27 = i9 | i36;
                                    iZzi = iZzm2;
                                    i25 = i19;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            default:
                                i14 = iZzx;
                                i15 = i31;
                                i16 = i34;
                                if (i32 != 3) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i29 = i13;
                                    break;
                                } else {
                                    Object objZzG2 = zzlpVar2.zzG(obj4, i14);
                                    iZzi = zzis.zzn(objZzG2, zzlpVar2.zzE(i14), bArr, i16, i2, (i15 << 3) | 4, zzirVar);
                                    zzlpVar2.zzO(obj4, i14, objZzG2);
                                    i27 = i9 | i36;
                                    i25 = i12;
                                    i28 = i15;
                                    i26 = i14;
                                    i29 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                        }
                    } else {
                        i14 = iZzx;
                        int i40 = i5;
                        i13 = i29;
                        if (iZzA != 27) {
                            i9 = i27;
                            if (iZzA <= 49) {
                                i6 = i31;
                                i21 = i40;
                                unsafe = unsafe2;
                                i10 = i14;
                                iZzi = zzv(obj, bArr, i34, i2, i40, i6, i32, i14, i33, iZzA, j, zzirVar);
                                if (iZzi != i34) {
                                    zzlpVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i6;
                                    i23 = i2;
                                    i24 = i3;
                                    zzirVar3 = zzirVar;
                                    i25 = i21;
                                    i26 = i10;
                                    i27 = i9;
                                    i29 = i13;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i7 = iZzi;
                                    i8 = i21;
                                }
                            } else {
                                i21 = i40;
                                i6 = i31;
                                i22 = i34;
                                unsafe = unsafe2;
                                i10 = i14;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i22, i2, i21, i6, i32, i33, iZzA, j, i10, zzirVar);
                                    if (iZzi != i22) {
                                        zzlpVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i28 = i6;
                                        i23 = i2;
                                        i24 = i3;
                                        zzirVar3 = zzirVar;
                                        i25 = i21;
                                        i26 = i10;
                                        i27 = i9;
                                        i29 = i13;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = iZzi;
                                        i8 = i21;
                                    }
                                } else if (i32 == 2) {
                                    iZzi = zzs(obj, bArr, i22, i2, i10, j, zzirVar);
                                    if (iZzi != i22) {
                                        zzlpVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i28 = i6;
                                        i23 = i2;
                                        i24 = i3;
                                        zzirVar3 = zzirVar;
                                        i25 = i21;
                                        i26 = i10;
                                        i27 = i9;
                                        i29 = i13;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = iZzi;
                                        i8 = i21;
                                    }
                                }
                            }
                            i29 = i13;
                        } else if (i32 == 2) {
                            zzkm zzkmVarZzd = (zzkm) unsafe2.getObject(obj4, j);
                            if (!zzkmVarZzd.zzc()) {
                                int size = zzkmVarZzd.size();
                                zzkmVarZzd = zzkmVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzkmVarZzd);
                            }
                            i9 = i27;
                            iZzi = zzis.zze(zzlpVar2.zzE(i14), i40, bArr, i34, i2, zzkmVarZzd, zzirVar);
                            i28 = i31;
                            i25 = i40;
                            i26 = i14;
                            i27 = i9;
                            i29 = i13;
                            i23 = i2;
                            i24 = i3;
                        } else {
                            i9 = i27;
                            i6 = i31;
                            i21 = i40;
                            i22 = i34;
                            unsafe = unsafe2;
                            i10 = i14;
                        }
                        i4 = i3;
                        i7 = i22;
                        i8 = i21;
                        i29 = i13;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzirVar2 = zzirVar;
                        zzjr zzjrVar = zzirVar2.zzd;
                        if (zzjrVar != zzjr.zza) {
                            i11 = i6;
                            if (zzjrVar.zzb(this.zzg, i11) != null) {
                                throw null;
                            }
                            iZzi = zzis.zzi(i8, bArr, i7, i2, zzd(obj), zzirVar);
                            obj3 = obj;
                            i23 = i2;
                            i25 = i8;
                            zzlpVar2 = this;
                            zzirVar3 = zzirVar2;
                            i28 = i11;
                            obj4 = obj3;
                            i26 = i10;
                            i27 = i9;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i24 = i4;
                        } else {
                            obj3 = obj;
                            i11 = i6;
                        }
                    } else {
                        obj3 = obj;
                        i11 = i6;
                        zzirVar2 = zzirVar;
                    }
                    iZzi = zzis.zzi(i8, bArr, i7, i2, zzd(obj), zzirVar);
                    i23 = i2;
                    i25 = i8;
                    zzlpVar2 = this;
                    zzirVar3 = zzirVar2;
                    i28 = i11;
                    obj4 = obj3;
                    i26 = i10;
                    i27 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i24 = i4;
                } else {
                    zzlpVar = this;
                    obj2 = obj;
                    iZzi = i7;
                    i25 = i8;
                    i27 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i24;
                obj2 = obj4;
                zzlpVar = zzlpVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return ((zzkf) this.zzg).zzbA();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.google.android.gms.internal.measurement.zzlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzkf) {
                zzkf zzkfVar = (zzkf) obj;
                zzkfVar.zzbM(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzkfVar.zzb = 0;
                zzkfVar.zzbK();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzB = zzB(i);
                long j = 1048575 & iZzB;
                int iZzA = zzA(iZzB);
                if (iZzA != 9) {
                    switch (iZzA) {
                        case 17:
                            if (zzT(obj, i)) {
                                zzE(i).zzf(zzb.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
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
                            this.zzm.zza(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object obj, Object obj2) {
        zzJ(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB = zzB(i);
            long j = 1048575 & iZzB;
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzmy.zzo(obj, j, zzmy.zza(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i)) {
                        zzmy.zzp(obj, j, zzmy.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i)) {
                        zzmy.zzm(obj, j, zzmy.zzw(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzK(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzK(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlz.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    zzL(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    zzL(obj, obj2, i);
                    break;
            }
        }
        zzlz.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlz.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws zzkp {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzirVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object obj, zzng zzngVar) {
        if (!this.zzi) {
            zzQ(obj, zzngVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzT(obj, i)) {
                        zzngVar.zzf(i2, zzmy.zza(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i)) {
                        zzngVar.zzo(i2, zzmy.zzb(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i)) {
                        zzngVar.zzt(i2, zzmy.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i)) {
                        zzngVar.zzJ(i2, zzmy.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i)) {
                        zzngVar.zzr(i2, zzmy.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i)) {
                        zzngVar.zzm(i2, zzmy.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i)) {
                        zzngVar.zzk(i2, zzmy.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i)) {
                        zzngVar.zzb(i2, zzmy.zzw(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj, i)) {
                        zzZ(i2, zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzT(obj, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj, i)) {
                        zzngVar.zzH(i2, zzmy.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i)) {
                        zzngVar.zzi(i2, zzmy.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i)) {
                        zzngVar.zzw(i2, zzmy.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i)) {
                        zzngVar.zzy(i2, zzmy.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i)) {
                        zzngVar.zzA(i2, zzmy.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i)) {
                        zzngVar.zzC(i2, zzmy.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, zzE(i));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    zzlz.zzI(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 30:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 32:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 33:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, zzE(i));
                    break;
                case 50:
                    zzR(zzngVar, i2, zzmy.zzf(obj, iZzB & 1048575), i);
                    break;
                case 51:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzf(i2, zzn(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzo(i2, zzo(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzt(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzJ(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzr(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzm(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzk(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzb(i2, zzY(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzX(obj, i2, i)) {
                        zzZ(i2, zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzH(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzi(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzw(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzy(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzA(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzC(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzS(obj, obj2, i) || Double.doubleToLongBits(zzmy.zza(obj, j)) != Double.doubleToLongBits(zzmy.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzS(obj, obj2, i) || Float.floatToIntBits(zzmy.zzb(obj, j)) != Float.floatToIntBits(zzmy.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzS(obj, obj2, i) || zzmy.zzw(obj, j) != zzmy.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
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
                    zZzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
                    break;
                case 50:
                    zZzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
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
                    long jZzy = zzy(i) & 1048575;
                    if (zzmy.zzc(obj, jZzy) != zzmy.zzc(obj2, jZzy) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    @Override // com.google.android.gms.internal.measurement.zzlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int iZzB = zzB(i6);
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
            if ((268435456 & iZzB) != 0 && !zzU(obj, i6, i, i2, i10)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzU(obj, i6, i, i2, i10) && !zzV(obj, iZzB, zzE(i6))) {
                    return false;
                }
            } else if (iZzA == 27) {
                List list = (List) zzmy.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlx zzlxVarZzE = zzE(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzlxVarZzE.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzX(obj, i7, i6) && !zzV(obj, iZzB, zzE(i6))) {
                    return false;
                }
            } else if (iZzA != 49) {
                if (iZzA == 50 && !((zzlg) zzmy.zzf(obj, iZzB & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
