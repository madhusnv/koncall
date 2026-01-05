package com.amplifyframework.notifications.pushnotifications;

import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class PushNotificationResult {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class AppInForeground extends PushNotificationResult {
        public static final AppInForeground INSTANCE = new AppInForeground();

        private AppInForeground() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotificationPosted extends PushNotificationResult {
        public static final NotificationPosted INSTANCE = new NotificationPosted();

        private NotificationPosted() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class OptedOut extends PushNotificationResult {
        public static final OptedOut INSTANCE = new OptedOut();

        private OptedOut() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Silent extends PushNotificationResult {
        public static final Silent INSTANCE = new Silent();

        private Silent() {
            super(null);
        }
    }

    public /* synthetic */ PushNotificationResult(AbstractC4148f abstractC4148f) {
        this();
    }

    private PushNotificationResult() {
    }
}
