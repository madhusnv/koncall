package com.onesignal.notifications.internal.limiting;

import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationLimitManager {

    public static final class Constants {
        public static final Constants INSTANCE = new Constants();
        private static final int maxNumberOfNotifications = 49;

        private Constants() {
        }

        public final int getMaxNumberOfNotifications() {
            return maxNumberOfNotifications;
        }
    }

    Object clearOldestOverLimit(int i, n64 n64Var);
}
