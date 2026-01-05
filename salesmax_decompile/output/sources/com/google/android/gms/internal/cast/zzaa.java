package com.google.android.gms.internal.cast;

import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import p001o.c7b;

/* loaded from: classes3.dex */
public final class zzaa extends c7b {
    private static zzaa zza;

    public zzaa() {
        zzr.zzd(zzln.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED);
    }

    public static zzaa zza() {
        if (zza == null) {
            zza = new zzaa();
        }
        return zza;
    }

    @Override // p001o.c7b
    public final MediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
        return new zzz();
    }
}
