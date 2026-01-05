package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.Constants;

@TargetApi(19)
/* loaded from: classes3.dex */
public final class zzdi extends zzdh {
    final /* synthetic */ zzdk zza;
    private final zzdp zzb;

    public zzdi(zzdk zzdkVar, zzdp zzdpVar) {
        this.zza = zzdkVar;
        this.zzb = zzdpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzb(int i, int i2, Surface surface) {
        zzdm.zza.m13795d("onConnected", new Object[0]);
        DisplayManager displayManager = (DisplayManager) this.zzb.getContext().getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager == null) {
            zzdm.zza.m13797e("Unable to get the display manager", new Object[0]);
            this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
            return;
        }
        zzdm.zzf(this.zza.zzc);
        this.zza.zzc.zzc = displayManager.createVirtualDisplay("private_display", i, i2, ((i < i2 ? i : i2) * 320) / 1080, surface, 2);
        zzdm zzdmVar = this.zza.zzc;
        if (zzdmVar.zzc == null) {
            zzdm.zza.m13797e("Unable to create virtual display", new Object[0]);
            this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
        } else {
            if (zzdmVar.zzc.getDisplay() == null) {
                zzdm.zza.m13797e("Virtual display does not have a display", new Object[0]);
                this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
                return;
            }
            try {
                ((zzds) this.zzb.getService()).zzf(this, this.zza.zzc.zzc.getDisplay().getDisplayId());
            } catch (RemoteException | IllegalStateException unused) {
                zzdm.zza.m13797e("Unable to provision the route's new virtual Display", new Object[0]);
                this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzc() {
        zzdm.zza.m13795d("onConnectedWithDisplay", new Object[0]);
        zzdm zzdmVar = this.zza.zzc;
        if (zzdmVar.zzc == null) {
            zzdm.zza.m13797e("There is no virtual display", new Object[0]);
            this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
            return;
        }
        Display display = zzdmVar.zzc.getDisplay();
        if (display != null) {
            this.zza.setResult((zzdk) new zzdl(display));
        } else {
            zzdm.zza.m13797e("Virtual display no longer has a display", new Object[0]);
            this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
        }
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzd(int i) {
        zzdm.zza.m13795d("onError: %d", Integer.valueOf(i));
        zzdm.zzf(this.zza.zzc);
        this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
    }
}
