package com.google.android.gms.cast.framework.media;

import android.content.DialogInterface;

/* loaded from: classes5.dex */
final class zzbq implements DialogInterface.OnClickListener {
    final /* synthetic */ TracksChooserDialogFragment zza;

    public zzbq(TracksChooserDialogFragment tracksChooserDialogFragment) {
        this.zza = tracksChooserDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        TracksChooserDialogFragment tracksChooserDialogFragment = this.zza;
        if (tracksChooserDialogFragment.zze != null) {
            tracksChooserDialogFragment.zze.cancel();
            this.zza.zze = null;
        }
    }
}
