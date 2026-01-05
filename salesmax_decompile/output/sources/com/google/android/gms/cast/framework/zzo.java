package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzo extends Cast.Listener {
    final /* synthetic */ CastSession zza;

    public /* synthetic */ zzo(CastSession castSession, zzn zznVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onActiveInputStateChanged(int i) {
        Iterator it = new HashSet(this.zza.zzd).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).onActiveInputStateChanged(i);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onApplicationDisconnected(int i) {
        CastSession.zzg(this.zza, i);
        this.zza.notifySessionEnded(i);
        Iterator it = new HashSet(this.zza.zzd).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).onApplicationDisconnected(i);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onApplicationMetadataChanged(ApplicationMetadata applicationMetadata) {
        Iterator it = new HashSet(this.zza.zzd).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).onApplicationMetadataChanged(applicationMetadata);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onApplicationStatusChanged() {
        Iterator it = new HashSet(this.zza.zzd).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).onApplicationStatusChanged();
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onStandbyStateChanged(int i) {
        Iterator it = new HashSet(this.zza.zzd).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).onStandbyStateChanged(i);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onVolumeChanged() {
        Iterator it = new HashSet(this.zza.zzd).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).onVolumeChanged();
        }
    }
}
