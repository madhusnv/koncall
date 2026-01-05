package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzy {
    private final String zza;
    private final zzw zzb;
    private zzw zzc;

    public /* synthetic */ zzy(String str, zzx zzxVar) {
        zzw zzwVar = new zzw();
        this.zzb = zzwVar;
        this.zzc = zzwVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzw zzwVar = this.zzb.zzc;
        String str = "";
        while (zzwVar != null) {
            Object obj = zzwVar.zzb;
            sb.append(str);
            String str2 = zzwVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzwVar = zzwVar.zzc;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzy zza(String str, Object obj) {
        zzw zzwVar = new zzw();
        this.zzc.zzc = zzwVar;
        this.zzc = zzwVar;
        zzwVar.zzb = obj;
        zzwVar.zza = str;
        return this;
    }

    public final zzy zzb(String str, boolean z) {
        String strValueOf = String.valueOf(z);
        zzv zzvVar = new zzv(null);
        this.zzc.zzc = zzvVar;
        this.zzc = zzvVar;
        zzvVar.zzb = strValueOf;
        zzvVar.zza = "isManifestFile";
        return this;
    }
}
