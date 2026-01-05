package com.onesignal.notifications.internal.registration.impl;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import p001o.gge;
import p001o.h84;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.rmh;
import p001o.sq8;
import p001o.uq8;
import p001o.wm5;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class PushRegistratorHMS implements IPushRegistrator, IPushRegistratorCallback {
    public static final Companion Companion = new Companion(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final IApplicationService _applicationService;
    private final IDeviceService _deviceService;
    private WaiterWithValue<String> waiter;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS", m36648f = "PushRegistratorHMS.kt", m36649l = {77}, m36650m = "getHMSTokenTask")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS$getHMSTokenTask$1 */
    public static final class C118101 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118101(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushRegistratorHMS.this.getHMSTokenTask(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS$getHMSTokenTask$2", m36648f = "PushRegistratorHMS.kt", m36649l = {78}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS$getHMSTokenTask$2 */
    public static final class C118112 extends jgg implements nl7 {
        final /* synthetic */ gge $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ PushRegistratorHMS this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118112(gge ggeVar, PushRegistratorHMS pushRegistratorHMS, n64 n64Var) {
            super(2, n64Var);
            this.$pushToken = ggeVar;
            this.this$0 = pushRegistratorHMS;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C118112(this.$pushToken, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            gge ggeVar;
            String str;
            gge ggeVar2;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ggeVar = this.$pushToken;
                WaiterWithValue waiterWithValue = this.this$0.waiter;
                if (waiterWithValue == null) {
                    str = null;
                    ggeVar.f25106a = str;
                    return y3i.f54824a;
                }
                this.L$0 = ggeVar;
                this.label = 1;
                Object objWaitForWake = waiterWithValue.waitForWake(this);
                if (objWaitForWake == objM51918f) {
                    return objM51918f;
                }
                ggeVar2 = ggeVar;
                obj = objWaitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ggeVar2 = (gge) this.L$0;
                wre.m54934b(obj);
            }
            gge ggeVar3 = ggeVar2;
            str = (String) obj;
            ggeVar = ggeVar3;
            ggeVar.f25106a = str;
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118112) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS", m36648f = "PushRegistratorHMS.kt", m36649l = {wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m36650m = "registerForPush")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS$registerForPush$1 */
    public static final class C118121 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118121(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushRegistratorHMS.this.registerForPush(this);
        }
    }

    public PushRegistratorHMS(IDeviceService iDeviceService, IApplicationService iApplicationService) {
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(iApplicationService, "_applicationService");
        this._deviceService = iDeviceService;
        this._applicationService = iApplicationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[Catch: all -> 0x00e6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:12:0x0028, B:30:0x00b0, B:32:0x00b4, B:33:0x00d8, B:13:0x0031, B:14:0x0038, B:15:0x0039, B:17:0x0044, B:20:0x004d, B:22:0x0077, B:25:0x009c, B:8:0x0014), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Object getHMSTokenTask(Context context, n64 n64Var) {
        C118101 c118101;
        gge ggeVar;
        IPushRegistrator.RegisterResult registerResult;
        if (n64Var instanceof C118101) {
            c118101 = (C118101) n64Var;
            int i = c118101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118101.label = i - Integer.MIN_VALUE;
            } else {
                c118101 = new C118101(n64Var);
            }
        }
        Object obj = c118101.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118101.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.MISSING_HMS_PUSHKIT_LIBRARY);
            }
            this.waiter = new WaiterWithValue<>();
            String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
            HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
            gge ggeVar2 = new gge();
            String token = hmsInstanceId.getToken(string, "HCM");
            ggeVar2.f25106a = token;
            if (!TextUtils.isEmpty(token)) {
                Logging.info$default("Device registered for HMS, push token = " + ((String) ggeVar2.f25106a), null, 2, null);
                return new IPushRegistrator.RegisterResult((String) ggeVar2.f25106a, SubscriptionStatus.SUBSCRIBED);
            }
            C118112 c118112 = new C118112(ggeVar2, this, null);
            c118101.L$0 = ggeVar2;
            c118101.label = 1;
            if (rmh.m46984c(30000L, c118112, c118101) == objM51918f) {
                return objM51918f;
            }
            ggeVar = ggeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) c118101.L$0;
            wre.m54934b(obj);
        }
        if (ggeVar.f25106a != null) {
            Logging.error$default("HMS registered with ID:" + ((String) ggeVar.f25106a), null, 2, null);
            registerResult = new IPushRegistrator.RegisterResult((String) ggeVar.f25106a, SubscriptionStatus.SUBSCRIBED);
        } else {
            Logging.error$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
            registerResult = new IPushRegistrator.RegisterResult(null, SubscriptionStatus.HMS_TOKEN_TIMEOUT);
        }
        return registerResult;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, n64 n64Var) {
        WaiterWithValue<String> waiterWithValue = this.waiter;
        if (waiterWithValue != null) {
            waiterWithValue.wake(str);
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(n64 n64Var) {
        C118121 c118121;
        IPushRegistrator.RegisterResult registerResult;
        if (n64Var instanceof C118121) {
            c118121 = (C118121) n64Var;
            int i = c118121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118121.label = i - Integer.MIN_VALUE;
            } else {
                c118121 = new C118121(n64Var);
            }
        }
        Object hMSTokenTask = c118121.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118121.label;
        try {
            if (i2 == 0) {
                wre.m54934b(hMSTokenTask);
                Context appContext = this._applicationService.getAppContext();
                c118121.label = 1;
                hMSTokenTask = getHMSTokenTask(appContext, c118121);
                if (hMSTokenTask == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(hMSTokenTask);
            }
            registerResult = (IPushRegistrator.RegisterResult) hMSTokenTask;
        } catch (ApiException e) {
            Logging.error("HMS ApiException getting Huawei push token!", e);
            registerResult = new IPushRegistrator.RegisterResult(null, e.getStatusCode() == 907135000 ? SubscriptionStatus.HMS_ARGUMENTS_INVALID : SubscriptionStatus.HMS_API_EXCEPTION_OTHER);
        }
        sq8.m48646e(registerResult);
        return registerResult;
    }
}
