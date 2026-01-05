package com.google.android.gms.internal.cast;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzm {
    private static final Logger zza = new Logger("ApplicationAnalyticsUtils");
    private static final String zzb = "21.3.0";
    private final String zzc;
    private final Map zzd;
    private final Map zze;

    public zzm(Bundle bundle, String str) {
        this.zzc = str;
        this.zzd = zzag.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.zze = zzag.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    private final zzmp zzh(zzl zzlVar) {
        long jLongValue;
        zzmp zzmpVarZzc = zzmq.zzc();
        zzmpVarZzc.zzl(zzlVar.zzd);
        int i = zzlVar.zze;
        zzlVar.zze = i + 1;
        zzmpVarZzc.zzi(i);
        String str = zzlVar.zzc;
        if (str != null) {
            zzmpVarZzc.zzj(str);
        }
        String str2 = zzlVar.zzh;
        if (str2 != null) {
            zzmpVarZzc.zzh(str2);
        }
        zzmf zzmfVarZza = zzmg.zza();
        zzmfVarZza.zzb(zzb);
        zzmfVarZza.zza(this.zzc);
        zzmpVarZzc.zzb((zzmg) zzmfVarZza.zzp());
        zzmh zzmhVarZza = zzmi.zza();
        if (zzlVar.zzb != null) {
            zznb zznbVarZza = zznc.zza();
            zznbVarZza.zza(zzlVar.zzb);
            zzmhVarZza.zza((zznc) zznbVarZza.zzp());
        }
        zzmhVarZza.zzf(false);
        String str3 = zzlVar.zzf;
        if (str3 != null) {
            try {
                String strReplace = str3.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                zza.m13803w(e, "receiverSessionId %s is not valid for hash", str3);
                jLongValue = 0;
            }
            zzmhVarZza.zzh(jLongValue);
        }
        zzmhVarZza.zzb(zzlVar.zzg);
        zzmhVarZza.zzd(zzlVar.zzi);
        zzmhVarZza.zze(zzlVar.zzj);
        zzmpVarZzc.zzd(zzmhVarZza);
        return zzmpVarZzc;
    }

    private static void zzi(zzmp zzmpVar, boolean z) {
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVar.zza());
        zzmhVarZzc.zzf(z);
        zzmpVar.zzd(zzmhVarZzc);
    }

    public final zzmq zza(zzl zzlVar) {
        return (zzmq) zzh(zzlVar).zzp();
    }

    public final zzmq zzb(zzl zzlVar, boolean z) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzi(zzmpVarZzh, z);
        return (zzmq) zzmpVarZzh.zzp();
    }

    public final zzmq zzc(zzl zzlVar) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
        zzmhVarZzc.zzg(10);
        zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        zzi(zzmpVarZzh, true);
        return (zzmq) zzmpVarZzh.zzp();
    }

    public final zzmq zzd(zzl zzlVar) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        if (zzlVar.zzk == 1) {
            zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
            zzmhVarZzc.zzg(17);
            zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        }
        return (zzmq) zzmpVarZzh.zzp();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzmq zze(zzl zzlVar, int i) {
        int iIntValue;
        int iIntValue2;
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
        Map map = this.zze;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            iIntValue = !map.containsKey(numValueOf) ? i + TransferRecord.MAXIMUM_UPLOAD_PARTS : ((Integer) Preconditions.checkNotNull((Integer) this.zze.get(numValueOf))).intValue();
        }
        zzmhVarZzc.zzg(iIntValue);
        Map map2 = this.zzd;
        if (map2 != null) {
            Integer numValueOf2 = Integer.valueOf(i);
            iIntValue2 = !map2.containsKey(numValueOf2) ? i + TransferRecord.MAXIMUM_UPLOAD_PARTS : ((Integer) Preconditions.checkNotNull((Integer) this.zzd.get(numValueOf2))).intValue();
        }
        zzmhVarZzc.zzc(iIntValue2);
        zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        return (zzmq) zzmpVarZzh.zzp();
    }

    public final zzmq zzf(zzl zzlVar, int i, int i2) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
        zzmhVarZzc.zzj(i);
        zzmhVarZzc.zzi(i2);
        zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        return (zzmq) zzmpVarZzh.zzp();
    }

    public final zzmq zzg(zzl zzlVar, int i) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
        zzmhVarZzc.zzj(i);
        zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        return (zzmq) zzmpVarZzh.zzp();
    }
}
