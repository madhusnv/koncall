package com.onesignal.notifications.internal.data;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import p001o.n64;
import p001o.sq8;

/* loaded from: classes6.dex */
public interface INotificationRepository {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object listNotificationsForOutstanding$default(INotificationRepository iNotificationRepository, List list, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return iNotificationRepository.listNotificationsForOutstanding(list, n64Var);
        }

        public static /* synthetic */ Object markAsConsumed$default(INotificationRepository iNotificationRepository, int i, boolean z, String str, boolean z2, n64 n64Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i2 & 8) != 0) {
                z2 = true;
            }
            return iNotificationRepository.markAsConsumed(i, z, str2, z2, n64Var);
        }
    }

    public static final class NotificationData {
        private final int androidId;
        private final long createdAt;
        private final String fullData;
        private final String id;
        private final String message;
        private final String title;

        public NotificationData(int i, String str, String str2, long j, String str3, String str4) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(str2, "fullData");
            this.androidId = i;
            this.id = str;
            this.fullData = str2;
            this.createdAt = j;
            this.title = str3;
            this.message = str4;
        }

        public final int getAndroidId() {
            return this.androidId;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getFullData() {
            return this.fullData;
        }

        public final String getId() {
            return this.id;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    Object clearOldestOverLimitFallback(int i, int i2, n64 n64Var);

    Object createNotification(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, String str5, long j, String str6, n64 n64Var);

    Object createSummaryNotification(int i, String str, n64 n64Var);

    Object deleteExpiredNotifications(n64 n64Var);

    Object doesNotificationExist(String str, n64 n64Var);

    Object getAndroidIdForGroup(String str, boolean z, n64 n64Var);

    Object getAndroidIdFromCollapseKey(String str, n64 n64Var);

    Object getGroupId(int i, n64 n64Var);

    Object listNotificationsForGroup(String str, n64 n64Var);

    Object listNotificationsForOutstanding(List<Integer> list, n64 n64Var);

    Object markAsConsumed(int i, boolean z, String str, boolean z2, n64 n64Var);

    Object markAsDismissed(int i, n64 n64Var);

    Object markAsDismissedForGroup(String str, n64 n64Var);

    Object markAsDismissedForOutstanding(n64 n64Var);
}
