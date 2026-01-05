package com.onesignal.notifications.internal.restoration.impl;

import android.service.notification.StatusBarNotification;
import com.google.api.Service;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p001o.id5;
import p001o.l75;
import p001o.n64;
import p001o.nk5;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationRestoreProcessor implements INotificationRestoreProcessor {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final IApplicationService _applicationService;
    private final IBadgeCountUpdater _badgeCountUpdater;
    private final INotificationRepository _dataController;
    private final INotificationGenerationWorkManager _workManager;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.restoration.impl.NotificationRestoreProcessor", m36648f = "NotificationRestoreProcessor.kt", m36649l = {25, Service.MONITORING_FIELD_NUMBER}, m36650m = "process")
    /* renamed from: com.onesignal.notifications.internal.restoration.impl.NotificationRestoreProcessor$process$1 */
    public static final class C118151 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118151(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRestoreProcessor.this.process(this);
        }
    }

    public NotificationRestoreProcessor(IApplicationService iApplicationService, INotificationGenerationWorkManager iNotificationGenerationWorkManager, INotificationRepository iNotificationRepository, IBadgeCountUpdater iBadgeCountUpdater) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationGenerationWorkManager, "_workManager");
        sq8.m48649h(iNotificationRepository, "_dataController");
        sq8.m48649h(iBadgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = iApplicationService;
        this._workManager = iNotificationGenerationWorkManager;
        this._dataController = iNotificationRepository;
        this._badgeCountUpdater = iBadgeCountUpdater;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:13:0x0030, B:26:0x0067, B:28:0x006d, B:31:0x0082, B:18:0x0040, B:25:0x005f, B:21:0x004d), top: B:37:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(n64 n64Var) {
        C118151 c118151;
        NotificationRestoreProcessor notificationRestoreProcessor;
        NotificationRestoreProcessor notificationRestoreProcessor2;
        Iterator it;
        if (n64Var instanceof C118151) {
            c118151 = (C118151) n64Var;
            int i = c118151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118151.label = i - Integer.MIN_VALUE;
            } else {
                c118151 = new C118151(n64Var);
            }
        }
        Object objListNotificationsForOutstanding = c118151.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118151.label;
        try {
        } catch (Throwable th) {
            Logging.error("Error restoring notification records! ", th);
        }
        if (i2 == 0) {
            wre.m54934b(objListNotificationsForOutstanding);
            Logging.info$default("Restoring notifications", null, 2, null);
            List<Integer> visibleNotifications = getVisibleNotifications();
            INotificationRepository iNotificationRepository = this._dataController;
            c118151.L$0 = this;
            c118151.label = 1;
            objListNotificationsForOutstanding = iNotificationRepository.listNotificationsForOutstanding(visibleNotifications, c118151);
            if (objListNotificationsForOutstanding == objM51918f) {
                return objM51918f;
            }
            notificationRestoreProcessor = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c118151.L$1;
                notificationRestoreProcessor2 = (NotificationRestoreProcessor) c118151.L$0;
                wre.m54934b(objListNotificationsForOutstanding);
                while (it.hasNext()) {
                    INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                    c118151.L$0 = notificationRestoreProcessor2;
                    c118151.L$1 = it;
                    c118151.label = 2;
                    if (notificationRestoreProcessor2.processNotification(notificationData, 200, c118151) == objM51918f) {
                        return objM51918f;
                    }
                }
                notificationRestoreProcessor2._badgeCountUpdater.update();
                return y3i.f54824a;
            }
            notificationRestoreProcessor = (NotificationRestoreProcessor) c118151.L$0;
            wre.m54934b(objListNotificationsForOutstanding);
        }
        notificationRestoreProcessor2 = notificationRestoreProcessor;
        it = ((List) objListNotificationsForOutstanding).iterator();
        while (it.hasNext()) {
        }
        notificationRestoreProcessor2._badgeCountUpdater.update();
        return y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor
    public Object processNotification(INotificationRepository.NotificationData notificationData, int i, n64 n64Var) {
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), notificationData.getId(), notificationData.getAndroidId(), new JSONObject(notificationData.getFullData()), notificationData.getCreatedAt(), true, false);
        if (i <= 0) {
            return y3i.f54824a;
        }
        Object objM40720b = nk5.m40720b(i, n64Var);
        return objM40720b == uq8.m51918f() ? objM40720b : y3i.f54824a;
    }
}
