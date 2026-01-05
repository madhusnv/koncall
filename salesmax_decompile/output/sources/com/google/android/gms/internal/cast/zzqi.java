package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p001o.zfa;

/* loaded from: classes3.dex */
public abstract class zzqi extends zzqg implements zfa {
    @Override // p001o.zfa
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.cast.zzqg
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract zfa zzc();
}
