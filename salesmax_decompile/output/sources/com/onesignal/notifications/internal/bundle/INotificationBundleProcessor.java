package com.onesignal.notifications.internal.bundle;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public interface INotificationBundleProcessor {

    public static final class ProcessedBundleResult {
        private boolean isDeniedByLifecycleCallback;
        private boolean isOneSignalPayload;
        private boolean isWorkManagerProcessing;

        public final boolean isProcessed() {
            return !this.isOneSignalPayload || this.isDeniedByLifecycleCallback || this.isWorkManagerProcessing;
        }

        public final boolean isWorkManagerProcessing() {
            return this.isWorkManagerProcessing;
        }

        public final void setDeniedByLifecycleCallback(boolean z) {
            this.isDeniedByLifecycleCallback = z;
        }

        public final void setOneSignalPayload(boolean z) {
            this.isOneSignalPayload = z;
        }

        public final void setWorkManagerProcessing(boolean z) {
            this.isWorkManagerProcessing = z;
        }
    }

    ProcessedBundleResult processBundleFromReceiver(Context context, Bundle bundle);
}
