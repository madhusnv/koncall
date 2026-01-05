package com.onesignal.notifications.internal.permissions.impl;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.Waiter;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.notifications.C11728R;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler;
import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import org.objectweb.asm.Opcodes;
import p001o.cfj;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.rm1;
import p001o.rmh;
import p001o.sq8;
import p001o.uq8;
import p001o.wkh;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationPermissionController implements IRequestPermissionService.PermissionCallback, INotificationPermissionController {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final Companion Companion = new Companion(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final IApplicationService _application;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IPreferencesService _preferenceService;
    private final IRequestPermissionService _requestPermission;
    private final h84 coroutineScope;
    private boolean enabled;
    private final EventProducer<INotificationPermissionChangedHandler> events;
    private long pollingWaitInterval;
    private final Waiter pollingWaiter;
    private final boolean supportsNativePrompt;
    private final WaiterWithValue<Boolean> waiter;

    @l75(m36647c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$1", m36648f = "NotificationPermissionController.kt", m36649l = {Opcodes.AASTORE}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$1 */
    public static final class C117931 extends jgg implements nl7 {
        int label;

        public C117931(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationPermissionController.this.new C117931(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                this.label = 1;
                if (notificationPermissionController.pollForPermission(this) == objM51918f) {
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

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117931) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$permissionPromptCompleted$1 */
    public static final class C117941 extends kf9 implements xk7 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117941(boolean z) {
            super(1);
            this.$enabled = z;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((INotificationPermissionChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(INotificationPermissionChangedHandler iNotificationPermissionChangedHandler) {
            sq8.m48649h(iNotificationPermissionChangedHandler, "it");
            iNotificationPermissionChangedHandler.onNotificationPermissionChanged(this.$enabled);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController", m36648f = "NotificationPermissionController.kt", m36649l = {112}, m36650m = "pollForPermission")
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$pollForPermission$1 */
    public static final class C117951 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117951(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationPermissionController.this.pollForPermission(this);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$pollForPermission$2 */
    public static final class C117962 extends kf9 implements xk7 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117962(boolean z) {
            super(1);
            this.$enabled = z;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((INotificationPermissionChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(INotificationPermissionChangedHandler iNotificationPermissionChangedHandler) {
            sq8.m48649h(iNotificationPermissionChangedHandler, "it");
            iNotificationPermissionChangedHandler.onNotificationPermissionChanged(this.$enabled);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$pollForPermission$3", m36648f = "NotificationPermissionController.kt", m36649l = {Opcodes.LREM}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$pollForPermission$3 */
    public static final class C117973 extends jgg implements nl7 {
        int label;

        public C117973(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationPermissionController.this.new C117973(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                Waiter waiter = NotificationPermissionController.this.pollingWaiter;
                this.label = 1;
                obj = waiter.waitForWake(this);
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
            return ((C117973) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController", m36648f = "NotificationPermissionController.kt", m36649l = {Opcodes.D2F, Opcodes.IF_ACMPEQ}, m36650m = "prompt")
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$prompt$1 */
    public static final class C117981 extends o64 {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C117981(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationPermissionController.this.prompt(false, this);
        }
    }

    public NotificationPermissionController(IApplicationService iApplicationService, IRequestPermissionService iRequestPermissionService, IApplicationService iApplicationService2, IPreferencesService iPreferencesService, ConfigModelStore configModelStore) {
        sq8.m48649h(iApplicationService, "_application");
        sq8.m48649h(iRequestPermissionService, "_requestPermission");
        sq8.m48649h(iApplicationService2, "_applicationService");
        sq8.m48649h(iPreferencesService, "_preferenceService");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._application = iApplicationService;
        this._requestPermission = iRequestPermissionService;
        this._applicationService = iApplicationService2;
        this._preferenceService = iPreferencesService;
        this._configModelStore = configModelStore;
        this.waiter = new WaiterWithValue<>();
        this.pollingWaiter = new Waiter();
        this.events = new EventProducer<>();
        h84 h84VarM31707a = i84.m31707a(wkh.m54673b("NotificationPermissionController"));
        this.coroutineScope = h84VarM31707a;
        this.enabled = notificationsEnabled();
        iRequestPermissionService.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = configModelStore.getModel().getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        rm1.m46952d(h84VarM31707a, null, null, new C117931(null), 3, null);
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(iApplicationService.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z) {
        this.enabled = z;
        this.waiter.wake(Boolean.valueOf(z));
        this.events.fire(new C117941(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(n64 n64Var) {
        C117951 c117951;
        NotificationPermissionController notificationPermissionController;
        long j;
        C117973 c117973;
        if (n64Var instanceof C117951) {
            c117951 = (C117951) n64Var;
            int i = c117951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117951.label = i - Integer.MIN_VALUE;
            } else {
                c117951 = new C117951(n64Var);
            }
        }
        Object obj = c117951.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117951.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            notificationPermissionController = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationPermissionController = (NotificationPermissionController) c117951.L$0;
            wre.m54934b(obj);
        }
        do {
            boolean zNotificationsEnabled = notificationPermissionController.notificationsEnabled();
            if (notificationPermissionController.enabled != zNotificationsEnabled) {
                notificationPermissionController.enabled = zNotificationsEnabled;
                notificationPermissionController.events.fire(new C117962(zNotificationsEnabled));
            }
            j = notificationPermissionController.pollingWaitInterval;
            c117973 = notificationPermissionController.new C117973(null);
            c117951.L$0 = notificationPermissionController;
            c117951.label = 1;
        } while (rmh.m46985d(j, c117973, c117951) != objM51918f);
        return objM51918f;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController.registerPollingLifecycleListener.1
            @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
            public void onFocus(boolean z) throws Exception {
                super.onFocus(z);
                NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                notificationPermissionController.pollingWaitInterval = notificationPermissionController._configModelStore.getModel().getForegroundFetchNotificationPermissionInterval();
                NotificationPermissionController.this.pollingWaiter.wake();
            }

            @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
            public void onUnfocused() {
                super.onUnfocused();
                NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                notificationPermissionController.pollingWaitInterval = notificationPermissionController._configModelStore.getModel().getBackgroundFetchNotificationPermissionInterval();
            }
        });
    }

    private final boolean showFallbackAlertDialog() {
        final Activity current = this._application.getCurrent();
        if (current == null) {
            return false;
        }
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string = current.getString(C11728R.string.notification_permission_name_for_title);
        sq8.m48648g(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(C11728R.string.notification_permission_settings_message);
        sq8.m48648g(string2, "activity.getString(R.str…mission_settings_message)");
        alertDialogPrepromptForAndroidSettings.show(current, string, string2, new AlertDialogPrepromptForAndroidSettings.Callback() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController.showFallbackAlertDialog.1
            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onAccept() {
                IApplicationService iApplicationService = NotificationPermissionController.this._applicationService;
                final NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                iApplicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$showFallbackAlertDialog$1$onAccept$1
                    @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
                    public void onFocus(boolean z) throws PackageManager.NameNotFoundException {
                        if (z) {
                            return;
                        }
                        super.onFocus(false);
                        notificationPermissionController._applicationService.removeApplicationLifecycleHandler(this);
                        notificationPermissionController.permissionPromptCompleted(AndroidUtils.INSTANCE.hasPermission("android.permission.POST_NOTIFICATIONS", true, notificationPermissionController._applicationService));
                    }
                });
                NavigateToAndroidSettingsForNotifications.INSTANCE.show(current);
            }

            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onDecline() {
                NotificationPermissionController.this.permissionPromptCompleted(false);
            }
        });
        return true;
    }

    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionController
    public boolean getCanRequestPermission() {
        sq8.m48646e(this._preferenceService.getBool(PreferenceStores.ONESIGNAL, "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        return !r0.booleanValue();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onReject(boolean z) {
        if (z ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z, n64 n64Var) {
        C117981 c117981;
        NotificationPermissionController notificationPermissionController;
        if (n64Var instanceof C117981) {
            c117981 = (C117981) n64Var;
            int i = c117981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117981.label = i - Integer.MIN_VALUE;
            } else {
                c117981 = new C117981(n64Var);
            }
        }
        Object objWaitForWake = c117981.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117981.label;
        if (i2 == 0) {
            wre.m54934b(objWaitForWake);
            c117981.L$0 = this;
            c117981.Z$0 = z;
            c117981.label = 1;
            if (cfj.m21131a(c117981) == objM51918f) {
                return objM51918f;
            }
            notificationPermissionController = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objWaitForWake);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c117981.Z$0;
            notificationPermissionController = (NotificationPermissionController) c117981.L$0;
            wre.m54934b(objWaitForWake);
        }
        if (notificationPermissionController.notificationsEnabled()) {
            return ml1.m39301a(true);
        }
        if (notificationPermissionController.supportsNativePrompt) {
            notificationPermissionController._requestPermission.startPrompt(z, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, NotificationPermissionController.class);
        } else {
            if (!z) {
                return ml1.m39301a(false);
            }
            notificationPermissionController.showFallbackAlertDialog();
        }
        WaiterWithValue<Boolean> waiterWithValue = notificationPermissionController.waiter;
        c117981.L$0 = null;
        c117981.label = 2;
        objWaitForWake = waiterWithValue.waitForWake(c117981);
        return objWaitForWake == objM51918f ? objM51918f : objWaitForWake;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(INotificationPermissionChangedHandler iNotificationPermissionChangedHandler) {
        sq8.m48649h(iNotificationPermissionChangedHandler, "handler");
        this.events.subscribe(iNotificationPermissionChangedHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(INotificationPermissionChangedHandler iNotificationPermissionChangedHandler) {
        sq8.m48649h(iNotificationPermissionChangedHandler, "handler");
        this.events.subscribe(iNotificationPermissionChangedHandler);
    }
}
