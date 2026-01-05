package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbt;
import com.google.android.gms.cast.zzbu;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class zzm extends zzv {
    final /* synthetic */ CastSession zza;

    public /* synthetic */ zzm(CastSession castSession, zzl zzlVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.framework.zzw
    public final void zzb(int i) {
        CastSession.zzg(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.zzw
    public final void zzc(final String str, final String str2) {
        CastSession castSession = this.zza;
        if (castSession.zzi == null || !castSession.zzi.zzl()) {
            return;
        }
        final zzbt zzbtVar = (zzbt) this.zza.zzi;
        final zzbu zzbuVar = null;
        zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall(str, str2, zzbuVar) { // from class: com.google.android.gms.cast.zzbg
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzc;

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zzG(this.zzb, this.zzc, null, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(8407).build()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.cast.framework.zzk
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                CastSession.zzh(this.zza.zza, "joinApplication", task);
            }
        });
    }

    @Override // com.google.android.gms.cast.framework.zzw
    public final void zzd(final String str, final LaunchOptions launchOptions) {
        CastSession castSession = this.zza;
        if (castSession.zzi == null || !castSession.zzi.zzl()) {
            return;
        }
        final zzbt zzbtVar = (zzbt) this.zza.zzi;
        zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzaz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzbtVar.zzH(str, launchOptions, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(8406).build()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.cast.framework.zzj
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                CastSession.zzh(this.zza.zza, "launchApplication", task);
            }
        });
    }

    @Override // com.google.android.gms.cast.framework.zzw
    public final void zze(final String str) {
        CastSession castSession = this.zza;
        if (castSession.zzi == null || !castSession.zzi.zzl()) {
            return;
        }
        final zzbt zzbtVar = (zzbt) this.zza.zzi;
        zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzbtVar.zzN(str, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(8409).build());
    }
}
