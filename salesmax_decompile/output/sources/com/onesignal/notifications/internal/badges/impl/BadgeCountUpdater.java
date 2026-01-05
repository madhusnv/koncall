package com.onesignal.notifications.internal.badges.impl;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.ShortcutBadgeException;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.ShortcutBadger;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import p001o.ege;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class BadgeCountUpdater implements IBadgeCountUpdater {
    private final IApplicationService _applicationService;
    private final IDatabaseProvider _databaseProvider;
    private final INotificationQueryHelper _queryHelper;
    private int badgesEnabled;

    /* renamed from: com.onesignal.notifications.internal.badges.impl.BadgeCountUpdater$updateFallback$1 */
    public static final class C117391 extends kf9 implements xk7 {
        final /* synthetic */ ege $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117391(ege egeVar) {
            super(1);
            this.$notificationCount = egeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return y3i.f54824a;
        }

        public final void invoke(ICursor iCursor) {
            sq8.m48649h(iCursor, "it");
            this.$notificationCount.f21602a = iCursor.getCount();
        }
    }

    public BadgeCountUpdater(IApplicationService iApplicationService, INotificationQueryHelper iNotificationQueryHelper, IDatabaseProvider iDatabaseProvider) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationQueryHelper, "_queryHelper");
        sq8.m48649h(iDatabaseProvider, "_databaseProvider");
        this._applicationService = iApplicationService;
        this._queryHelper = iNotificationQueryHelper;
        this._databaseProvider = iDatabaseProvider;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() throws PackageManager.NameNotFoundException {
        int i = this.badgesEnabled;
        if (i != -1) {
            return i == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            sq8.m48648g(applicationInfo, "_applicationService.appC…A_DATA,\n                )");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = sq8.m48644c("DISABLE", bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.badgesEnabled = 0;
            Logging.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        ege egeVar = new ege();
        IDatabase.DefaultImpls.query$default(this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications()), new C117391(egeVar), 122, null);
        updateCount(egeVar.f21602a);
    }

    private final void updateStandard() {
        int i = 0;
        for (StatusBarNotification statusBarNotification : NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!NotificationHelper.INSTANCE.isGroupSummary(statusBarNotification)) {
                i++;
            }
        }
        updateCount(i);
    }

    @Override // com.onesignal.notifications.internal.badges.IBadgeCountUpdater
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // com.onesignal.notifications.internal.badges.IBadgeCountUpdater
    public void updateCount(int i) {
        if (areBadgeSettingsEnabled()) {
            try {
                ShortcutBadger.applyCountOrThrow(this._applicationService.getAppContext(), i);
            } catch (ShortcutBadgeException unused) {
            }
        }
    }
}
