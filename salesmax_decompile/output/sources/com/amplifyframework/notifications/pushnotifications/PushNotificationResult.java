package com.amplifyframework.notifications.pushnotifications;

import p001o.id5;

/* loaded from: classes5.dex */
public abstract class PushNotificationResult {

    public static final class AppInForeground extends PushNotificationResult {
        public static final AppInForeground INSTANCE = new AppInForeground();

        private AppInForeground() {
            super(null);
        }
    }

    public static final class NotificationPosted extends PushNotificationResult {
        public static final NotificationPosted INSTANCE = new NotificationPosted();

        private NotificationPosted() {
            super(null);
        }
    }

    public static final class OptedOut extends PushNotificationResult {
        public static final OptedOut INSTANCE = new OptedOut();

        private OptedOut() {
            super(null);
        }
    }

    public static final class Silent extends PushNotificationResult {
        public static final Silent INSTANCE = new Silent();

        private Silent() {
            super(null);
        }
    }

    private PushNotificationResult() {
    }

    public /* synthetic */ PushNotificationResult(id5 id5Var) {
        this();
    }
}
