package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
final class zzbv implements com.google.android.gms.cast.framework.media.internal.zza {
    final /* synthetic */ zzbw zza;

    public zzbv(zzbw zzbwVar) {
        this.zza = zzbwVar;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public final void zza(Bitmap bitmap) {
        if (bitmap != null) {
            this.zza.zza.setImageBitmap(bitmap);
        }
    }
}
