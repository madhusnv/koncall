package com.onesignal.notifications.internal.common;

import android.content.Context;
import android.content.Intent;
import p001o.sq8;

/* loaded from: classes6.dex */
public class GenerateNotificationOpenIntent {
    private final Context context;
    private final Intent intent;
    private final boolean startApp;

    public GenerateNotificationOpenIntent(Context context, Intent intent, boolean z) {
        sq8.m48649h(context, "context");
        this.context = context;
        this.intent = intent;
        this.startApp = z;
    }

    private final Intent getIntentAppOpen() {
        Intent launchIntentForPackage;
        if (!this.startApp || (launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName())) == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    public final Intent getIntentVisible() {
        Intent intent = this.intent;
        return intent != null ? intent : getIntentAppOpen();
    }
}
