package com.onesignal.notifications.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.IPermissionObserver;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler;
import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import org.objectweb.asm.Opcodes;
import p001o.eu5;
import p001o.h84;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationsManager implements INotificationsManager, INotificationPermissionChangedHandler, IApplicationLifecycleHandler {
    private final IApplicationService _applicationService;
    private final INotificationRepository _notificationDataController;
    private final INotificationLifecycleService _notificationLifecycleService;
    private final INotificationPermissionController _notificationPermissionController;
    private final INotificationRestoreWorkManager _notificationRestoreWorkManager;
    private final INotificationSummaryManager _summaryManager;
    private boolean permission;
    private final EventProducer<IPermissionObserver> permissionChangedNotifier;

    @l75(m36647c = "com.onesignal.notifications.internal.NotificationsManager$1", m36648f = "NotificationsManager.kt", m36649l = {57}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.NotificationsManager$1 */
    public static final class C117311 extends jgg implements xk7 {
        int label;

        public C117311(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return NotificationsManager.this.new C117311(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationRepository iNotificationRepository = NotificationsManager.this._notificationDataController;
                this.label = 1;
                if (iNotificationRepository.deleteExpiredNotifications(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117311) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.NotificationsManager$clearAllNotifications$1", m36648f = "NotificationsManager.kt", m36649l = {126}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.NotificationsManager$clearAllNotifications$1 */
    public static final class C117321 extends jgg implements xk7 {
        int label;

        public C117321(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return NotificationsManager.this.new C117321(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationRepository iNotificationRepository = NotificationsManager.this._notificationDataController;
                this.label = 1;
                if (iNotificationRepository.markAsDismissedForOutstanding(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117321) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.NotificationsManager$removeGroupedNotifications$1", m36648f = "NotificationsManager.kt", m36649l = {Opcodes.FNEG}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.NotificationsManager$removeGroupedNotifications$1 */
    public static final class C117331 extends jgg implements xk7 {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117331(String str, n64 n64Var) {
            super(1, n64Var);
            this.$group = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return NotificationsManager.this.new C117331(this.$group, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationRepository iNotificationRepository = NotificationsManager.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (iNotificationRepository.markAsDismissedForGroup(str, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117331) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.NotificationsManager$removeNotification$1", m36648f = "NotificationsManager.kt", m36649l = {108, Opcodes.LDIV}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.NotificationsManager$removeNotification$1 */
    public static final class C117341 extends jgg implements xk7 {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117341(int i, n64 n64Var) {
            super(1, n64Var);
            this.$id = i;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return NotificationsManager.this.new C117341(this.$id, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationRepository iNotificationRepository = NotificationsManager.this._notificationDataController;
                int i2 = this.$id;
                this.label = 1;
                obj = iNotificationRepository.markAsDismissed(i2, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                INotificationSummaryManager iNotificationSummaryManager = NotificationsManager.this._summaryManager;
                int i3 = this.$id;
                this.label = 2;
                if (iNotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(i3, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117341) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.NotificationsManager$requestPermission$2", m36648f = "NotificationsManager.kt", m36649l = {Opcodes.DUP_X1}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.NotificationsManager$requestPermission$2 */
    public static final class C117352 extends jgg implements nl7 {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117352(boolean z, n64 n64Var) {
            super(2, n64Var);
            this.$fallbackToSettings = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationsManager.this.new C117352(this.$fallbackToSettings, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationPermissionController iNotificationPermissionController = NotificationsManager.this._notificationPermissionController;
                boolean z = this.$fallbackToSettings;
                this.label = 1;
                obj = iNotificationPermissionController.prompt(z, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117352) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.NotificationsManager$setPermissionStatusAndFire$1 */
    public static final class C117361 extends kf9 implements xk7 {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117361(boolean z) {
            super(1);
            this.$isEnabled = z;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IPermissionObserver) obj);
            return y3i.f54824a;
        }

        public final void invoke(IPermissionObserver iPermissionObserver) {
            sq8.m48649h(iPermissionObserver, "it");
            iPermissionObserver.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public NotificationsManager(IApplicationService iApplicationService, INotificationPermissionController iNotificationPermissionController, INotificationRestoreWorkManager iNotificationRestoreWorkManager, INotificationLifecycleService iNotificationLifecycleService, INotificationRepository iNotificationRepository, INotificationSummaryManager iNotificationSummaryManager) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationPermissionController, "_notificationPermissionController");
        sq8.m48649h(iNotificationRestoreWorkManager, "_notificationRestoreWorkManager");
        sq8.m48649h(iNotificationLifecycleService, "_notificationLifecycleService");
        sq8.m48649h(iNotificationRepository, "_notificationDataController");
        sq8.m48649h(iNotificationSummaryManager, "_summaryManager");
        this._applicationService = iApplicationService;
        this._notificationPermissionController = iNotificationPermissionController;
        this._notificationRestoreWorkManager = iNotificationRestoreWorkManager;
        this._notificationLifecycleService = iNotificationLifecycleService;
        this._notificationDataController = iNotificationRepository;
        this._summaryManager = iNotificationSummaryManager;
        this.permission = NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, iApplicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new EventProducer<>();
        iApplicationService.addApplicationLifecycleHandler(this);
        iNotificationPermissionController.subscribe(this);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C117311(null), 1, null);
    }

    private final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z) {
        boolean zMo68773getPermission = mo68773getPermission();
        setPermission(z);
        if (zMo68773getPermission != z) {
            this.permissionChangedNotifier.fireOnMain(new C117361(z));
        }
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addClickListener */
    public void mo68768addClickListener(INotificationClickListener iNotificationClickListener) {
        sq8.m48649h(iNotificationClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("NotificationsManager.addClickListener(handler: " + iNotificationClickListener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(iNotificationClickListener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addForegroundLifecycleListener */
    public void mo68769addForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener) {
        sq8.m48649h(iNotificationLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + iNotificationLifecycleListener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(iNotificationLifecycleListener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addPermissionObserver */
    public void mo68770addPermissionObserver(IPermissionObserver iPermissionObserver) {
        sq8.m48649h(iPermissionObserver, "observer");
        Logging.debug$default("NotificationsManager.addPermissionObserver(observer: " + iPermissionObserver + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(iPermissionObserver);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: clearAllNotifications */
    public void mo68771clearAllNotifications() {
        Logging.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C117321(null), 1, null);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getCanRequestPermission */
    public boolean mo68772getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getPermission */
    public boolean mo68773getPermission() {
        return this.permission;
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        refreshNotificationState();
    }

    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler
    public void onNotificationPermissionChanged(boolean z) {
        setPermissionStatusAndFire(z);
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeClickListener */
    public void mo68774removeClickListener(INotificationClickListener iNotificationClickListener) {
        sq8.m48649h(iNotificationClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("NotificationsManager.removeClickListener(listener: " + iNotificationClickListener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(iNotificationClickListener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeForegroundLifecycleListener */
    public void mo68775removeForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener) {
        sq8.m48649h(iNotificationLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + iNotificationLifecycleListener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(iNotificationLifecycleListener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeGroupedNotifications */
    public void mo68776removeGroupedNotifications(String str) {
        sq8.m48649h(str, "group");
        Logging.debug$default("NotificationsManager.removeGroupedNotifications(group: " + str + ')', null, 2, null);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C117331(str, null), 1, null);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeNotification */
    public void mo68777removeNotification(int i) {
        Logging.debug$default("NotificationsManager.removeNotification(id: " + i + ')', null, 2, null);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C117341(i, null), 1, null);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removePermissionObserver */
    public void mo68778removePermissionObserver(IPermissionObserver iPermissionObserver) {
        sq8.m48649h(iPermissionObserver, "observer");
        Logging.debug$default("NotificationsManager.removePermissionObserver(observer: " + iPermissionObserver + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(iPermissionObserver);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    public Object requestPermission(boolean z, n64 n64Var) {
        Logging.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        return pm1.m43867g(eu5.m25612c(), new C117352(z, null), n64Var);
    }

    public void setPermission(boolean z) {
        this.permission = z;
    }
}
