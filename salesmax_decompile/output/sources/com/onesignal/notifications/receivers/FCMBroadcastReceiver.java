package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.onesignal.OneSignal;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class FCMBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static final String FCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String FCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isFCMMessage(Intent intent) {
            if (!sq8.m48644c(FCMBroadcastReceiver.FCM_RECEIVE_ACTION, intent.getAction())) {
                return false;
            }
            String stringExtra = intent.getStringExtra("message_type");
            return stringExtra == null || sq8.m48644c("gcm", stringExtra);
        }
    }

    private final void setAbort() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    private final void setSuccessfulResultCode() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || sq8.m48644c("google.com/iid", extras.getString(Constants.MessagePayloadKeys.FROM))) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "context.applicationContext");
        if (OneSignal.initWithContext(applicationContext)) {
            INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
            if (!Companion.isFCMMessage(intent)) {
                setSuccessfulResultCode();
                return;
            }
            INotificationBundleProcessor.ProcessedBundleResult processedBundleResultProcessBundleFromReceiver = iNotificationBundleProcessor.processBundleFromReceiver(context, extras);
            sq8.m48646e(processedBundleResultProcessBundleFromReceiver);
            if (processedBundleResultProcessBundleFromReceiver.isWorkManagerProcessing()) {
                setAbort();
            } else {
                setSuccessfulResultCode();
            }
        }
    }
}
