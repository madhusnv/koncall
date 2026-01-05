package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p001o.zr0;

/* loaded from: classes5.dex */
public final class zbc extends zr0 implements SignInConnectionListener {
    private final Semaphore zba;
    private final Set zbb;

    public zbc(Context context, Set set) {
        super(context);
        this.zba = new Semaphore(0);
        this.zbb = set;
    }

    @Override // p001o.zr0
    public final /* bridge */ /* synthetic */ Object loadInBackground() throws InterruptedException {
        Iterator it = this.zbb.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.zba.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zba.release();
    }

    @Override // p001o.wga
    public final void onStartLoading() {
        this.zba.drainPermits();
        forceLoad();
    }
}
