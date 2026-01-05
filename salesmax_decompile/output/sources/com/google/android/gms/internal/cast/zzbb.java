package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import p001o.g32;
import p001o.zfa;

/* loaded from: classes3.dex */
public final class zzbb implements C2319g.e {
    private static final Logger zza = new Logger("MediaRouterOPTListener");
    private final zzbm zzb;
    private final Handler zzc = new zzdy(Looper.getMainLooper());

    public zzbb(zzbm zzbmVar) {
        this.zzb = (zzbm) Preconditions.checkNotNull(zzbmVar);
    }

    @Override // androidx.mediarouter.media.C2319g.e
    public final zfa onPrepareTransfer(final C2319g.h hVar, final C2319g.h hVar2) {
        zza.m13795d("Prepare transfer from Route(%s) to Route(%s)", hVar, hVar2);
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: com.google.android.gms.internal.cast.zzba
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.zza.zza(hVar, hVar2, c13614a);
            }
        });
    }

    public final /* synthetic */ Object zza(final C2319g.h hVar, final C2319g.h hVar2, final g32.C13614a c13614a) {
        return Boolean.valueOf(this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzaz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(hVar, hVar2, c13614a);
            }
        }));
    }

    public final /* synthetic */ void zzb(C2319g.h hVar, C2319g.h hVar2, g32.C13614a c13614a) {
        this.zzb.zzl(hVar, hVar2, c13614a);
    }
}
