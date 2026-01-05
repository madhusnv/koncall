package com.google.firebase.iid;

import ag.ThreadFactoryC0141a;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import of.RunnableC5354i;
import pg.v6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static SoftReference f7142a;

    /* renamed from: b */
    public static SoftReference f7143b;

    /* renamed from: a */
    public static int m4467a(Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            return 500;
        }
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!v6.m11896d(intentPutExtras)) {
            return -1;
        }
        v6.m11895c("_nd", intentPutExtras.getExtras());
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        boolean zIsOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = f7142a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC0141a("firebase-iid-executor")));
                    f7142a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executorService.execute(new RunnableC5354i(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync));
    }
}
