package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class zzad extends zzaf {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ CastRemoteDisplayClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(CastRemoteDisplayClient castRemoteDisplayClient, TaskCompletionSource taskCompletionSource) {
        super(null);
        this.zzb = castRemoteDisplayClient;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzdr
    public final void zzd(int i) {
        this.zzb.zzc.m13795d("onError: %d", Integer.valueOf(i));
        CastRemoteDisplayClient.zzd(this.zzb);
        TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, this.zza);
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzdr
    public final void zzf() {
        this.zzb.zzc.m13795d("onDisconnected", new Object[0]);
        CastRemoteDisplayClient.zzd(this.zzb);
        TaskUtil.setResultOrApiException(Status.RESULT_SUCCESS, this.zza);
    }
}
