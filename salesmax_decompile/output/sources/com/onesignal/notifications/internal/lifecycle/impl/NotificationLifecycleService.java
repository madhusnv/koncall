package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.events.CallbackProducer;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.threading.OSPrimaryCoroutineScope;
import com.onesignal.core.internal.application.AppEntryAction;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationServiceExtension;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.internal.INotificationActivityOpener;
import com.onesignal.notifications.internal.NotificationClickEvent;
import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import com.onesignal.notifications.internal.common.GenerateNotificationOpenIntentFromPushPayload;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.common.OSNotificationOpenAppSettings;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.dge;
import p001o.jgg;
import p001o.kf9;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.oo0;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationLifecycleService implements INotificationLifecycleService, INotificationActivityOpener {
    private final IAnalyticsTracker _analyticsTracker;
    private final IApplicationService _applicationService;
    private final INotificationBackendService _backend;
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final IInfluenceManager _influenceManager;
    private final IReceiveReceiptWorkManager _receiveReceiptWorkManager;
    private final ISubscriptionManager _subscriptionManager;
    private final ITime _time;
    private final EventProducer<INotificationClickListener> extOpenedCallback;
    private final CallbackProducer<INotificationServiceExtension> extRemoteReceivedCallback;
    private final EventProducer<INotificationLifecycleListener> extWillShowInForegroundCallback;
    private final CallbackProducer<INotificationLifecycleCallback> intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final oo0 unprocessedOpenedNotifs;

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$addExternalClickListener$1 */
    public static final class C117741 extends kf9 implements xk7 {
        final /* synthetic */ NotificationClickEvent $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117741(NotificationClickEvent notificationClickEvent) {
            super(1);
            this.$openedResult = notificationClickEvent;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((INotificationClickListener) obj);
            return y3i.f54824a;
        }

        public final void invoke(INotificationClickListener iNotificationClickListener) {
            sq8.m48649h(iNotificationClickListener, "it");
            iNotificationClickListener.onClick(this.$openedResult);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", m36648f = "NotificationLifecycleService.kt", m36649l = {120}, m36650m = "canOpenNotification")
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canOpenNotification$1 */
    public static final class C117751 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117751(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationLifecycleService.this.canOpenNotification(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canOpenNotification$2", m36648f = "NotificationLifecycleService.kt", m36649l = {120}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canOpenNotification$2 */
    public static final class C117762 extends jgg implements nl7 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ dge $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117762(dge dgeVar, Activity activity, JSONObject jSONObject, n64 n64Var) {
            super(2, n64Var);
            this.$canOpen = dgeVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C117762 c117762 = new C117762(this.$canOpen, this.$activity, this.$data, n64Var);
            c117762.L$0 = obj;
            return c117762;
        }

        @Override // p001o.nl7
        public final Object invoke(INotificationLifecycleCallback iNotificationLifecycleCallback, n64 n64Var) {
            return ((C117762) create(iNotificationLifecycleCallback, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            dge dgeVar;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationLifecycleCallback iNotificationLifecycleCallback = (INotificationLifecycleCallback) this.L$0;
                dge dgeVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = dgeVar2;
                this.label = 1;
                obj = iNotificationLifecycleCallback.canOpenNotification(activity, jSONObject, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                dgeVar = dgeVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dgeVar = (dge) this.L$0;
                wre.m54934b(obj);
            }
            dgeVar.f19803a = ((Boolean) obj).booleanValue();
            return y3i.f54824a;
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", m36648f = "NotificationLifecycleService.kt", m36649l = {Opcodes.DUP2}, m36650m = "canReceiveNotification")
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canReceiveNotification$1 */
    public static final class C117771 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117771(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationLifecycleService.this.canReceiveNotification(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canReceiveNotification$2", m36648f = "NotificationLifecycleService.kt", m36649l = {Opcodes.DUP2}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canReceiveNotification$2 */
    public static final class C117782 extends jgg implements nl7 {
        final /* synthetic */ dge $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117782(dge dgeVar, JSONObject jSONObject, n64 n64Var) {
            super(2, n64Var);
            this.$canReceive = dgeVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C117782 c117782 = new C117782(this.$canReceive, this.$jsonPayload, n64Var);
            c117782.L$0 = obj;
            return c117782;
        }

        @Override // p001o.nl7
        public final Object invoke(INotificationLifecycleCallback iNotificationLifecycleCallback, n64 n64Var) {
            return ((C117782) create(iNotificationLifecycleCallback, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            dge dgeVar;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationLifecycleCallback iNotificationLifecycleCallback = (INotificationLifecycleCallback) this.L$0;
                dge dgeVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = dgeVar2;
                this.label = 1;
                obj = iNotificationLifecycleCallback.canReceiveNotification(jSONObject, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                dgeVar = dgeVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dgeVar = (dge) this.L$0;
                wre.m54934b(obj);
            }
            dgeVar.f19803a = ((Boolean) obj).booleanValue();
            return y3i.f54824a;
        }
    }

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$externalNotificationWillShowInForeground$1 */
    public static final class C117791 extends kf9 implements xk7 {
        final /* synthetic */ INotificationWillDisplayEvent $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117791(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
            super(1);
            this.$willDisplayEvent = iNotificationWillDisplayEvent;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((INotificationLifecycleListener) obj);
            return y3i.f54824a;
        }

        public final void invoke(INotificationLifecycleListener iNotificationLifecycleListener) {
            sq8.m48649h(iNotificationLifecycleListener, "it");
            iNotificationLifecycleListener.onWillDisplay(this.$willDisplayEvent);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$externalRemoteNotificationReceived$1 */
    public static final class C117801 extends kf9 implements xk7 {
        final /* synthetic */ INotificationReceivedEvent $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117801(INotificationReceivedEvent iNotificationReceivedEvent) {
            super(1);
            this.$notificationReceivedEvent = iNotificationReceivedEvent;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((INotificationServiceExtension) obj);
            return y3i.f54824a;
        }

        public final void invoke(INotificationServiceExtension iNotificationServiceExtension) {
            sq8.m48649h(iNotificationServiceExtension, "it");
            iNotificationServiceExtension.onNotificationReceived(this.$notificationReceivedEvent);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", m36648f = "NotificationLifecycleService.kt", m36649l = {Opcodes.LRETURN}, m36650m = "notificationOpened")
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$1 */
    public static final class C117811 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C117811(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationLifecycleService.this.notificationOpened(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$2", m36648f = "NotificationLifecycleService.kt", m36649l = {Opcodes.D2F}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$2 */
    public static final class C117822 extends jgg implements xk7 {
        final /* synthetic */ String $appId;
        final /* synthetic */ IDeviceService.DeviceType $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117822(String str, String str2, String str3, IDeviceService.DeviceType deviceType, n64 n64Var) {
            super(1, n64Var);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = deviceType;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return NotificationLifecycleService.this.new C117822(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    INotificationBackendService iNotificationBackendService = NotificationLifecycleService.this._backend;
                    String str = this.$appId;
                    String str2 = this.$notificationId;
                    String str3 = this.$subscriptionId;
                    IDeviceService.DeviceType deviceType = this.$deviceType;
                    this.label = 1;
                    if (iNotificationBackendService.updateNotificationAsOpened(str, str2, str3, deviceType, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
            } catch (BackendException e) {
                Logging.error$default("Notification opened confirmation failed with statusCode: " + e.getStatusCode() + " response: " + e.getResponse(), null, 2, null);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117822) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$3 */
    public static final class C117833 extends kf9 implements xk7 {
        final /* synthetic */ NotificationClickEvent $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117833(NotificationClickEvent notificationClickEvent) {
            super(1);
            this.$openResult = notificationClickEvent;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((INotificationClickListener) obj);
            return y3i.f54824a;
        }

        public final void invoke(INotificationClickListener iNotificationClickListener) {
            sq8.m48649h(iNotificationClickListener, "it");
            iNotificationClickListener.onClick(this.$openResult);
        }
    }

    public NotificationLifecycleService(IApplicationService iApplicationService, ITime iTime, ConfigModelStore configModelStore, IInfluenceManager iInfluenceManager, ISubscriptionManager iSubscriptionManager, IDeviceService iDeviceService, INotificationBackendService iNotificationBackendService, IReceiveReceiptWorkManager iReceiveReceiptWorkManager, IAnalyticsTracker iAnalyticsTracker) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iInfluenceManager, "_influenceManager");
        sq8.m48649h(iSubscriptionManager, "_subscriptionManager");
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(iNotificationBackendService, "_backend");
        sq8.m48649h(iReceiveReceiptWorkManager, "_receiveReceiptWorkManager");
        sq8.m48649h(iAnalyticsTracker, "_analyticsTracker");
        this._applicationService = iApplicationService;
        this._time = iTime;
        this._configModelStore = configModelStore;
        this._influenceManager = iInfluenceManager;
        this._subscriptionManager = iSubscriptionManager;
        this._deviceService = iDeviceService;
        this._backend = iNotificationBackendService;
        this._receiveReceiptWorkManager = iReceiveReceiptWorkManager;
        this._analyticsTracker = iAnalyticsTracker;
        this.intLifecycleCallback = new CallbackProducer<>();
        this.extRemoteReceivedCallback = new CallbackProducer<>();
        this.extWillShowInForegroundCallback = new EventProducer<>();
        this.extOpenedCallback = new EventProducer<>();
        this.unprocessedOpenedNotifs = new oo0();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(iApplicationService.getAppContext());
    }

    private final String getLatestNotificationId(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            sq8.m48647f(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return OSNotificationOpenAppSettings.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void addExternalClickListener(INotificationClickListener iNotificationClickListener) {
        sq8.m48649h(iNotificationClickListener, "callback");
        this.extOpenedCallback.subscribe(iNotificationClickListener);
        if (this.extOpenedCallback.getHasSubscribers() && kh3.m35705U(this.unprocessedOpenedNotifs)) {
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new C117741(NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
        }
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void addExternalForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener) {
        sq8.m48649h(iNotificationLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.extWillShowInForegroundCallback.subscribe(iNotificationLifecycleListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, n64 n64Var) {
        C117751 c117751;
        dge dgeVar;
        if (n64Var instanceof C117751) {
            c117751 = (C117751) n64Var;
            int i = c117751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117751.label = i - Integer.MIN_VALUE;
            } else {
                c117751 = new C117751(n64Var);
            }
        }
        Object obj = c117751.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117751.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            dge dgeVar2 = new dge();
            dgeVar2.f19803a = true;
            CallbackProducer<INotificationLifecycleCallback> callbackProducer = this.intLifecycleCallback;
            C117762 c117762 = new C117762(dgeVar2, activity, jSONObject, null);
            c117751.L$0 = dgeVar2;
            c117751.label = 1;
            if (callbackProducer.suspendingFire(c117762, c117751) == objM51918f) {
                return objM51918f;
            }
            dgeVar = dgeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dgeVar = (dge) c117751.L$0;
            wre.m54934b(obj);
        }
        return ml1.m39301a(dgeVar.f19803a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, n64 n64Var) {
        C117771 c117771;
        dge dgeVar;
        if (n64Var instanceof C117771) {
            c117771 = (C117771) n64Var;
            int i = c117771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117771.label = i - Integer.MIN_VALUE;
            } else {
                c117771 = new C117771(n64Var);
            }
        }
        Object obj = c117771.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117771.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            dge dgeVar2 = new dge();
            dgeVar2.f19803a = true;
            CallbackProducer<INotificationLifecycleCallback> callbackProducer = this.intLifecycleCallback;
            C117782 c117782 = new C117782(dgeVar2, jSONObject, null);
            c117771.L$0 = dgeVar2;
            c117771.label = 1;
            if (callbackProducer.suspendingFire(c117782, c117771) == objM51918f) {
                return objM51918f;
            }
            dgeVar = dgeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dgeVar = (dge) c117771.L$0;
            wre.m54934b(obj);
        }
        return ml1.m39301a(dgeVar.f19803a);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void externalNotificationWillShowInForeground(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        sq8.m48649h(iNotificationWillDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new C117791(iNotificationWillDisplayEvent));
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void externalRemoteNotificationReceived(INotificationReceivedEvent iNotificationReceivedEvent) {
        sq8.m48649h(iNotificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new C117801(iNotificationReceivedEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, n64 n64Var) throws JSONException {
        C117811 c117811;
        NotificationLifecycleService notificationLifecycleService;
        JSONArray jSONArray2;
        String str;
        int i;
        if (n64Var instanceof C117811) {
            c117811 = (C117811) n64Var;
            int i2 = c117811.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c117811.label = i2 - Integer.MIN_VALUE;
            } else {
                c117811 = new C117811(n64Var);
            }
        }
        C117811 c1178112 = c117811;
        Object obj = c1178112.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c1178112.label;
        if (i3 == 0) {
            wre.m54934b(obj);
            String appId = this._configModelStore.getModel().getAppId();
            if (appId == null) {
                appId = "";
            }
            String str2 = appId;
            String id = this._subscriptionManager.getSubscriptions().getPush().getId();
            IDeviceService.DeviceType deviceType = this._deviceService.getDeviceType();
            int length = jSONArray.length();
            int i4 = 0;
            while (i4 < length) {
                String oSNotificationIdFromJson = NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i4));
                if (oSNotificationIdFromJson == null || this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                    i = i4;
                    str = str2;
                } else {
                    this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                    str = str2;
                    i = i4;
                    OSPrimaryCoroutineScope.INSTANCE.execute(new C117822(str2, oSNotificationIdFromJson, id, deviceType, null));
                }
                i4 = i + 1;
                str2 = str;
            }
            NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
            NotificationClickEvent notificationClickEventGenerateNotificationOpenedResult$com_onesignal_notifications = notificationHelper.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
            IAnalyticsTracker iAnalyticsTracker = this._analyticsTracker;
            String notificationId = notificationClickEventGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            sq8.m48646e(notificationId);
            iAnalyticsTracker.trackOpenedEvent(notificationId, notificationHelper.getCampaignNameFromNotification(notificationClickEventGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
            String latestNotificationId = getLatestNotificationId(jSONArray);
            if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                this._applicationService.setEntryState(AppEntryAction.NOTIFICATION_CLICK);
                if (latestNotificationId != null) {
                    this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                }
            }
            c1178112.L$0 = this;
            c1178112.L$1 = jSONArray;
            c1178112.label = 1;
            if (openDestinationActivity(activity, jSONArray, c1178112) == objM51918f) {
                return objM51918f;
            }
            notificationLifecycleService = this;
            jSONArray2 = jSONArray;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray2 = (JSONArray) c1178112.L$1;
            notificationLifecycleService = (NotificationLifecycleService) c1178112.L$0;
            wre.m54934b(obj);
        }
        if (notificationLifecycleService.extOpenedCallback.getHasSubscribers()) {
            notificationLifecycleService.extOpenedCallback.fireOnMain(new C117833(NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray2, notificationLifecycleService._time)));
        } else {
            notificationLifecycleService.unprocessedOpenedNotifs.add(jSONArray2);
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public Object notificationReceived(NotificationGenerationJob notificationGenerationJob, n64 n64Var) throws JSONException {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(notificationGenerationJob.getApiNotificationId());
        this._influenceManager.onNotificationReceived(notificationGenerationJob.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(notificationGenerationJob.getJsonPayload().toString());
            jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, notificationGenerationJob.getAndroidId());
            NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
            NotificationClickEvent notificationClickEventGenerateNotificationOpenedResult$com_onesignal_notifications = notificationHelper.generateNotificationOpenedResult$com_onesignal_notifications(JSONUtils.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            IAnalyticsTracker iAnalyticsTracker = this._analyticsTracker;
            String notificationId = notificationClickEventGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            sq8.m48646e(notificationId);
            iAnalyticsTracker.trackReceivedEvent(notificationId, notificationHelper.getCampaignNameFromNotification(notificationClickEventGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.INotificationActivityOpener
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, n64 n64Var) throws JSONException {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            GenerateNotificationOpenIntentFromPushPayload generateNotificationOpenIntentFromPushPayload = GenerateNotificationOpenIntentFromPushPayload.INSTANCE;
            sq8.m48648g(jSONObject, "firstPayloadItem");
            Intent intentVisible = generateNotificationOpenIntentFromPushPayload.create(activity, jSONObject).getIntentVisible();
            if (intentVisible != null) {
                Logging.info$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                activity.startActivity(intentVisible);
            } else {
                Logging.info$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void removeExternalClickListener(INotificationClickListener iNotificationClickListener) {
        sq8.m48649h(iNotificationClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.extOpenedCallback.unsubscribe(iNotificationClickListener);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void removeExternalForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener) {
        sq8.m48649h(iNotificationLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.extWillShowInForegroundCallback.unsubscribe(iNotificationLifecycleListener);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void setInternalNotificationLifecycleCallback(INotificationLifecycleCallback iNotificationLifecycleCallback) {
        this.intLifecycleCallback.set(iNotificationLifecycleCallback);
    }

    public final void setupNotificationServiceExtension(Context context) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException {
        sq8.m48649h(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, NotificationConstants.EXTENSION_SERVICE_META_DATA_TAG_NAME);
        if (manifestMeta == null) {
            Logging.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        Logging.verbose$default("Found class: " + manifestMeta + ", attempting to call constructor", null, 2, null);
        try {
            Object objNewInstance = Class.forName(manifestMeta).newInstance();
            if (!(objNewInstance instanceof INotificationServiceExtension) || this.extRemoteReceivedCallback.getHasCallback()) {
                return;
            }
            this.extRemoteReceivedCallback.set(objNewInstance);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }
}
