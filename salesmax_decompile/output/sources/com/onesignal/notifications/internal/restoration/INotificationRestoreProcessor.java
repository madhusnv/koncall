package com.onesignal.notifications.internal.restoration;

import com.onesignal.notifications.internal.data.INotificationRepository;
import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationRestoreProcessor {

    public static final class DefaultImpls {
        public static /* synthetic */ Object processNotification$default(INotificationRestoreProcessor iNotificationRestoreProcessor, INotificationRepository.NotificationData notificationData, int i, n64 n64Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processNotification");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return iNotificationRestoreProcessor.processNotification(notificationData, i, n64Var);
        }
    }

    Object process(n64 n64Var);

    Object processNotification(INotificationRepository.NotificationData notificationData, int i, n64 n64Var);
}
