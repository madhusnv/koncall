package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import p001o.h3d;

/* loaded from: classes3.dex */
final class zzhn implements zzhk {
    private static zzhn zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhn() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzhn zza(Context context) {
        zzhn zzhnVar;
        synchronized (zzhn.class) {
            if (zza == null) {
                zza = h3d.m29777b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhn(context) : new zzhn();
            }
            zzhnVar = zza;
        }
        return zzhnVar;
    }

    public static synchronized void zze() {
        Context context;
        zzhn zzhnVar = zza;
        if (zzhnVar != null && (context = zzhnVar.zzb) != null && zzhnVar.zzc != null) {
            context.getContentResolver().unregisterContentObserver(zza.zzc);
        }
        zza = null;
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.zzb;
        if (context != null && !zzhb.zza(context)) {
            try {
                return (String) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhl
                    @Override // com.google.android.gms.internal.measurement.zzhj
                    public final Object zza() {
                        return this.zza.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzha.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzhn(Context context) {
        this.zzb = context;
        zzhm zzhmVar = new zzhm(this, null);
        this.zzc = zzhmVar;
        context.getContentResolver().registerContentObserver(zzha.zza, true, zzhmVar);
    }
}
