package com.onesignal.notifications.internal.listeners;

import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.IPermissionObserver;
import com.onesignal.notifications.internal.channels.INotificationChannelManager;
import com.onesignal.notifications.internal.pushtoken.IPushTokenManager;
import com.onesignal.notifications.internal.pushtoken.PushTokenResponse;
import com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.subscriptions.ISubscription;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class DeviceRegistrationListener implements IStartableService, ISingletonModelStoreChangeHandler<ConfigModel>, IPermissionObserver, ISubscriptionChangedHandler {
    private final INotificationChannelManager _channelManager;
    private final ConfigModelStore _configModelStore;
    private final INotificationsManager _notificationsManager;
    private final IPushTokenManager _pushTokenManager;
    private final ISubscriptionManager _subscriptionManager;

    @l75(m36647c = "com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$onSubscriptionChanged$2", m36648f = "DeviceRegistrationListener.kt", m36649l = {Opcodes.DUP2}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$onSubscriptionChanged$2 */
    public static final class C117862 extends jgg implements xk7 {
        int label;

        public C117862(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return DeviceRegistrationListener.this.new C117862(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationsManager iNotificationsManager = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (iNotificationsManager.requestPermission(true, this) == objM51918f) {
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
            return ((C117862) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1", m36648f = "DeviceRegistrationListener.kt", m36649l = {TypeReference.CAST}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1 */
    public static final class C117871 extends jgg implements xk7 {
        int label;

        public C117871(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return DeviceRegistrationListener.this.new C117871(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IPushTokenManager iPushTokenManager = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = iPushTokenManager.retrievePushToken(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            PushTokenResponse pushTokenResponse = (PushTokenResponse) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(pushTokenResponse.getToken(), DeviceRegistrationListener.this._notificationsManager.mo68773getPermission() ? pushTokenResponse.getStatus() : SubscriptionStatus.NO_PERMISSION);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117871) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public DeviceRegistrationListener(ConfigModelStore configModelStore, INotificationChannelManager iNotificationChannelManager, IPushTokenManager iPushTokenManager, INotificationsManager iNotificationsManager, ISubscriptionManager iSubscriptionManager) {
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iNotificationChannelManager, "_channelManager");
        sq8.m48649h(iPushTokenManager, "_pushTokenManager");
        sq8.m48649h(iNotificationsManager, "_notificationsManager");
        sq8.m48649h(iSubscriptionManager, "_subscriptionManager");
        this._configModelStore = configModelStore;
        this._channelManager = iNotificationChannelManager;
        this._pushTokenManager = iPushTokenManager;
        this._notificationsManager = iNotificationsManager;
        this._subscriptionManager = iSubscriptionManager;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        ThreadUtilsKt.suspendifyOnThread$default(0, new C117871(null), 1, null);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
    }

    @Override // com.onesignal.notifications.IPermissionObserver
    public void onNotificationPermissionChange(boolean z) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionAdded(ISubscription iSubscription) {
        sq8.m48649h(iSubscription, "subscription");
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionChanged(ISubscription iSubscription, ModelChangedArgs modelChangedArgs) {
        sq8.m48649h(iSubscription, "subscription");
        sq8.m48649h(modelChangedArgs, "args");
        if (sq8.m48644c(modelChangedArgs.getPath(), "optedIn") && sq8.m48644c(modelChangedArgs.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo68773getPermission()) {
            ThreadUtilsKt.suspendifyOnThread$default(0, new C117862(null), 1, null);
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionRemoved(ISubscription iSubscription) {
        sq8.m48649h(iSubscription, "subscription");
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
        this._notificationsManager.mo68770addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel configModel, String str) {
        sq8.m48649h(configModel, "model");
        sq8.m48649h(str, "tag");
        if (sq8.m48644c(str, ModelChangeTags.HYDRATE)) {
            this._channelManager.processChannelList(configModel.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
