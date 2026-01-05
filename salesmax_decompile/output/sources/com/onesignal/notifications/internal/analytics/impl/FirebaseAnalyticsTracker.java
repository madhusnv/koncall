package com.onesignal.notifications.internal.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class FirebaseAnalyticsTracker implements IAnalyticsTracker {
    public static final Companion Companion = new Companion(null);
    private static final String EVENT_NOTIFICATION_INFLUENCE_OPEN = "os_notification_influence_open";
    private static final String EVENT_NOTIFICATION_OPENED = "os_notification_opened";
    private static final String EVENT_NOTIFICATION_RECEIVED = "os_notification_received";
    private static Class<?> firebaseAnalyticsClass;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final ITime _time;
    private AtomicLong lastOpenedTime;
    private String lastReceivedNotificationCampaign;
    private String lastReceivedNotificationId;
    private AtomicLong lastReceivedTime;
    private Object mFirebaseAnalyticsInstance;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getInstanceMethod(Class<?> cls) {
            try {
                sq8.m48646e(cls);
                return cls.getMethod("getInstance", Context.class);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getTrackMethod(Class<?> cls) {
            try {
                sq8.m48646e(cls);
                return cls.getMethod("logEvent", String.class, Bundle.class);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }
        }

        public final boolean canTrack() {
            try {
                FirebaseAnalyticsTracker.firebaseAnalyticsClass = FirebaseAnalytics.class;
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
    }

    public FirebaseAnalyticsTracker(IApplicationService iApplicationService, ConfigModelStore configModelStore, ITime iTime) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iTime, "_time");
        this._applicationService = iApplicationService;
        this._configModelStore = configModelStore;
        this._time = iTime;
    }

    private final Object getFirebaseAnalyticsInstance() {
        if (this.mFirebaseAnalyticsInstance == null) {
            Method instanceMethod = Companion.getInstanceMethod(firebaseAnalyticsClass);
            try {
                sq8.m48646e(instanceMethod);
                this.mFirebaseAnalyticsInstance = instanceMethod.invoke(null, this._applicationService.getAppContext());
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.mFirebaseAnalyticsInstance;
    }

    private final boolean isEnabled() {
        return this._configModelStore.getModel().getFirebaseAnalytics();
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackInfluenceOpenEvent() {
        if (!isEnabled() || this.lastReceivedTime == null || this.lastReceivedNotificationId == null) {
            return;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        AtomicLong atomicLong = this.lastReceivedTime;
        sq8.m48646e(atomicLong);
        if (currentTimeMillis - atomicLong.get() > 120000) {
            return;
        }
        AtomicLong atomicLong2 = this.lastOpenedTime;
        if (atomicLong2 != null) {
            sq8.m48646e(atomicLong2);
            if (currentTimeMillis - atomicLong2.get() < 30000) {
                return;
            }
        }
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
            Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString("source", PreferenceStores.ONESIGNAL);
            bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
            String str = this.lastReceivedNotificationId;
            sq8.m48646e(str);
            bundle.putString("notification_id", str);
            String str2 = this.lastReceivedNotificationCampaign;
            sq8.m48646e(str2);
            bundle.putString("campaign", str2);
            sq8.m48646e(trackMethod);
            trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_INFLUENCE_OPEN, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackOpenedEvent(String str, String str2) {
        sq8.m48649h(str, "notificationId");
        sq8.m48649h(str2, "campaign");
        if (isEnabled()) {
            if (this.lastOpenedTime == null) {
                this.lastOpenedTime = new AtomicLong();
            }
            AtomicLong atomicLong = this.lastOpenedTime;
            sq8.m48646e(atomicLong);
            atomicLong.set(this._time.getCurrentTimeMillis());
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString("source", PreferenceStores.ONESIGNAL);
                bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
                bundle.putString("notification_id", str);
                bundle.putString("campaign", str2);
                sq8.m48646e(trackMethod);
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_OPENED, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackReceivedEvent(String str, String str2) {
        sq8.m48649h(str, "notificationId");
        sq8.m48649h(str2, "campaign");
        if (isEnabled()) {
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString("source", PreferenceStores.ONESIGNAL);
                bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
                bundle.putString("notification_id", str);
                bundle.putString("campaign", str2);
                sq8.m48646e(trackMethod);
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_RECEIVED, bundle);
                if (this.lastReceivedTime == null) {
                    this.lastReceivedTime = new AtomicLong();
                }
                AtomicLong atomicLong = this.lastReceivedTime;
                sq8.m48646e(atomicLong);
                atomicLong.set(this._time.getCurrentTimeMillis());
                this.lastReceivedNotificationId = str;
                this.lastReceivedNotificationCampaign = str2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
