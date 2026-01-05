package com.google.android.gms.fido.fido2;

import android.app.Activity;

@Deprecated
/* loaded from: classes5.dex */
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i);
}
