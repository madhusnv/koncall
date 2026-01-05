package com.google.android.gms.internal.cast;

import android.content.Context;
import androidx.mediarouter.media.C2319g;

/* loaded from: classes3.dex */
public final class zzax {
    public C2319g zza;
    private final Context zzb;

    public zzax(Context context) {
        this.zzb = context;
    }

    public final C2319g zza() {
        if (this.zza == null) {
            this.zza = C2319g.m8234j(this.zzb);
        }
        return this.zza;
    }

    public final void zzb(C2319g.a aVar) {
        C2319g c2319gZza = zza();
        if (c2319gZza != null) {
            c2319gZza.m8249s(aVar);
        }
    }
}
