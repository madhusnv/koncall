package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import p001o.h3d;

/* loaded from: classes3.dex */
final class zzco implements zzcl {
    private static zzco zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzco zza(Context context) {
        zzco zzcoVar;
        synchronized (zzco.class) {
            if (zza == null) {
                zza = h3d.m29777b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzco(context) : new zzco();
            }
            zzcoVar = zza;
        }
        return zzcoVar;
    }

    public static synchronized void zze() {
        Context context;
        zzco zzcoVar = zza;
        if (zzcoVar != null && (context = zzcoVar.zzb) != null && zzcoVar.zzc != null) {
            context.getContentResolver().unregisterContentObserver(zza.zzc);
        }
        zza = null;
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.zzb;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                    @Override // com.google.android.gms.internal.auth.zzck
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
        return zzcb.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzco(Context context) {
        this.zzb = context;
        zzcn zzcnVar = new zzcn(this, null);
        this.zzc = zzcnVar;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcnVar);
    }
}
