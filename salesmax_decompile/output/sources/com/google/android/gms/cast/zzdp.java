package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;

@VisibleForTesting
/* loaded from: classes5.dex */
abstract class zzdp extends com.google.android.gms.cast.internal.zzc {
    private com.google.android.gms.cast.internal.zzat zza;
    protected final WeakReference zzg;
    final /* synthetic */ RemoteMediaPlayer zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzh = remoteMediaPlayer;
        this.zzg = new WeakReference(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzdo(this, status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        com.google.android.gms.cast.internal.zzw zzwVar = (com.google.android.gms.cast.internal.zzw) anyClient;
        synchronized (this.zzh.zza) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zzg.get();
            if (googleApiClient == null) {
                setResult((zzdp) new zzdo(this, new Status(2100)));
                return;
            }
            this.zzh.zzc.zzc(googleApiClient);
            try {
                zza(zzwVar);
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Throwable unused) {
                setResult((zzdp) new zzdo(this, new Status(2100)));
            }
            this.zzh.zzc.zzc(null);
        }
    }

    public abstract void zza(com.google.android.gms.cast.internal.zzw zzwVar);

    public final com.google.android.gms.cast.internal.zzat zzb() {
        if (this.zza == null) {
            this.zza = new zzdn(this);
        }
        return this.zza;
    }
}
