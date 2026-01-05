package com.google.android.gms.internal.cast;

import java.util.List;

/* loaded from: classes3.dex */
final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzur zzc;
    private static final zzur zzd;
    private static final zzur zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzW(false);
        zzd = zzW(true);
        zze = new zzut();
    }

    public static zzur zzA() {
        return zze;
    }

    public static void zzB(zzur zzurVar, Object obj, Object obj2) {
        zzurVar.zzf(obj, zzurVar.zzd(zzurVar.zzc(obj), zzurVar.zzc(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzsh.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzc(i, list, z);
    }

    public static void zzE(int i, List list, zzvi zzviVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zze(i, list);
    }

    public static void zzF(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzg(i, list, z);
    }

    public static void zzG(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzi(i, list, z);
    }

    public static void zzH(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzk(i, list, z);
    }

    public static void zzI(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzm(i, list, z);
    }

    public static void zzJ(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzo(i, list, z);
    }

    public static void zzK(int i, List list, zzvi zzviVar, zzua zzuaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzrv) zzviVar).zzp(i, list.get(i2), zzuaVar);
        }
    }

    public static void zzL(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzr(i, list, z);
    }

    public static void zzM(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzt(i, list, z);
    }

    public static void zzN(int i, List list, zzvi zzviVar, zzua zzuaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzrv) zzviVar).zzu(i, list.get(i2), zzuaVar);
        }
    }

    public static void zzO(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzw(i, list, z);
    }

    public static void zzP(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzy(i, list, z);
    }

    public static void zzQ(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzA(i, list, z);
    }

    public static void zzR(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzC(i, list, z);
    }

    public static void zzS(int i, List list, zzvi zzviVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzE(i, list);
    }

    public static void zzT(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzG(i, list, z);
    }

    public static void zzU(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzI(i, list, z);
    }

    public static boolean zzV(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static zzur zzW(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzur) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzru.zzx(i << 3) + 1);
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = size * zzru.zzx(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iZzd = ((zzrm) list.get(i2)).zzd();
            iZzx += zzru.zzx(iZzd) + iZzd;
        }
        return iZzx;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzru.zzx(i << 3));
    }

    public static int zzd(List list) {
        int iZzu;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzu = 0;
            while (i < size) {
                iZzu += zzru.zzu(zzsiVar.zzd(i));
                i++;
            }
        } else {
            iZzu = 0;
            while (i < size) {
                iZzu += zzru.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzu;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzru.zzx(i << 3) + 4);
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzru.zzx(i << 3) + 8);
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzua zzuaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzt = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzt += zzru.zzt(i, (zztp) list.get(i2), zzuaVar);
        }
        return iZzt;
    }

    public static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzru.zzx(i << 3));
    }

    public static int zzk(List list) {
        int iZzu;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzu = 0;
            while (i < size) {
                iZzu += zzru.zzu(zzsiVar.zzd(i));
                i++;
            }
        } else {
            iZzu = 0;
            while (i < size) {
                iZzu += zzru.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzu;
    }

    public static int zzl(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzru.zzx(i << 3));
    }

    public static int zzm(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzte) {
            zzte zzteVar = (zzte) list;
            iZzy = 0;
            while (i < size) {
                iZzy += zzru.zzy(zzteVar.zzd(i));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzru.zzy(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzy;
    }

    public static int zzn(int i, Object obj, zzua zzuaVar) {
        if (!(obj instanceof zzsv)) {
            return zzru.zzx(i << 3) + zzru.zzv((zztp) obj, zzuaVar);
        }
        int i2 = zzru.zzb;
        int iZza = ((zzsv) obj).zza();
        return zzru.zzx(i << 3) + zzru.zzx(iZza) + iZza;
    }

    public static int zzo(int i, List list, zzua zzuaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzru.zzx(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzsv) {
                int iZza = ((zzsv) obj).zza();
                iZzx += zzru.zzx(iZza) + iZza;
            } else {
                iZzx += zzru.zzv((zztp) obj, zzuaVar);
            }
        }
        return iZzx;
    }

    public static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzru.zzx(i << 3));
    }

    public static int zzq(List list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzx = 0;
            while (i < size) {
                int iZzd = zzsiVar.zzd(i);
                iZzx += zzru.zzx((iZzd >> 31) ^ (iZzd + iZzd));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzx += zzru.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzx;
    }

    public static int zzr(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzru.zzx(i << 3));
    }

    public static int zzs(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzte) {
            zzte zzteVar = (zzte) list;
            iZzy = 0;
            while (i < size) {
                long jZzd = zzteVar.zzd(i);
                iZzy += zzru.zzy((jZzd >> 63) ^ (jZzd + jZzd));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzy += zzru.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzy;
    }

    public static int zzt(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = zzru.zzb;
        boolean z = list instanceof zzsx;
        int iZzx = zzru.zzx(i << 3) * size;
        if (z) {
            zzsx zzsxVar = (zzsx) list;
            while (i2 < size) {
                Object objZze = zzsxVar.zze(i2);
                if (objZze instanceof zzrm) {
                    int iZzd = ((zzrm) objZze).zzd();
                    iZzx += zzru.zzx(iZzd) + iZzd;
                } else {
                    iZzx += zzru.zzw((String) objZze);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzrm) {
                    int iZzd2 = ((zzrm) obj).zzd();
                    iZzx += zzru.zzx(iZzd2) + iZzd2;
                } else {
                    iZzx += zzru.zzw((String) obj);
                }
                i2++;
            }
        }
        return iZzx;
    }

    public static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzru.zzx(i << 3));
    }

    public static int zzv(List list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzsi) {
            zzsi zzsiVar = (zzsi) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzru.zzx(zzsiVar.zzd(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzru.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzx;
    }

    public static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzru.zzx(i << 3));
    }

    public static int zzx(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzte) {
            zzte zzteVar = (zzte) list;
            iZzy = 0;
            while (i < size) {
                iZzy += zzru.zzy(zzteVar.zzd(i));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzru.zzy(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzy;
    }

    public static zzur zzy() {
        return zzc;
    }

    public static zzur zzz() {
        return zzd;
    }
}
