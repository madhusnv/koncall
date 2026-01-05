package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import ig.BinderC3246b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            "Unknown action sent to RevocationBoundService: ".concat(String.valueOf(intent.getAction()));
            return null;
        }
        if (Log.isLoggable("RevocationService", 2)) {
            "RevocationBoundService handling ".concat(String.valueOf(intent.getAction()));
        }
        return new BinderC3246b(this);
    }
}
