package com.google.android.gms.cast.framework.media.widget;

import com.google.android.gms.cast.Cast;

/* loaded from: classes5.dex */
final class zzl extends Cast.Listener {
    final /* synthetic */ ExpandedControllerActivity zza;

    public zzl(ExpandedControllerActivity expandedControllerActivity) {
        this.zza = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onDeviceNameChanged() {
        this.zza.zzn();
    }
}
