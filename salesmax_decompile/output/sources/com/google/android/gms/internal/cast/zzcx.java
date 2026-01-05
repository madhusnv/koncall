package com.google.android.gms.internal.cast;

import android.content.Context;
import com.google.android.gms.cast.internal.Logger;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class zzcx {
    protected final Logger zza;
    protected final zzcz zzb;

    public zzcx(Context context) {
        zzdc zzdcVar = new zzdc(context, zzqu.zza(Executors.newFixedThreadPool(3)));
        this.zza = new Logger("BaseNetUtils");
        this.zzb = zzdcVar;
        zzdcVar.zza();
    }

    public final boolean zza() {
        zzcz zzczVar = this.zzb;
        return zzczVar != null && zzczVar.zzb();
    }
}
