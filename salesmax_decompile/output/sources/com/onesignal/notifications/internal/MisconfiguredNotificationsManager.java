package com.onesignal.notifications.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.internal.minification.KeepStub;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.IPermissionObserver;
import p001o.id5;
import p001o.n64;
import p001o.sq8;

@KeepStub
/* loaded from: classes6.dex */
public final class MisconfiguredNotificationsManager implements INotificationsManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo68772getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo68773getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    public Object requestPermission(boolean z, n64 n64Var) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo68768addClickListener(INotificationClickListener iNotificationClickListener) throws Exception {
        sq8.m48649h(iNotificationClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo68769addForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener) throws Exception {
        sq8.m48649h(iNotificationLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo68770addPermissionObserver(IPermissionObserver iPermissionObserver) throws Exception {
        sq8.m48649h(iPermissionObserver, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo68771clearAllNotifications() throws Exception {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() throws Exception {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo68774removeClickListener(INotificationClickListener iNotificationClickListener) throws Exception {
        sq8.m48649h(iNotificationClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo68775removeForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener) throws Exception {
        sq8.m48649h(iNotificationLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo68776removeGroupedNotifications(String str) throws Exception {
        sq8.m48649h(str, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo68777removeNotification(int i) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo68778removePermissionObserver(IPermissionObserver iPermissionObserver) throws Exception {
        sq8.m48649h(iPermissionObserver, "observer");
        throw Companion.getEXCEPTION();
    }
}
