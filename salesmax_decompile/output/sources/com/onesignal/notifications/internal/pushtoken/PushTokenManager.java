package com.onesignal.notifications.internal.pushtoken;

import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class PushTokenManager implements IPushTokenManager {
    private final IDeviceService _deviceService;
    private final IPushRegistrator _pushRegistrator;
    private String pushToken;
    private SubscriptionStatus pushTokenStatus;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IDeviceService.JetpackLibraryStatus.values().length];
            iArr[IDeviceService.JetpackLibraryStatus.MISSING.ordinal()] = 1;
            iArr[IDeviceService.JetpackLibraryStatus.OUTDATED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.pushtoken.PushTokenManager", m36648f = "PushTokenManager.kt", m36649l = {um5.CC_ENABLE_ARENAS_FIELD_NUMBER}, m36650m = "retrievePushToken")
    /* renamed from: com.onesignal.notifications.internal.pushtoken.PushTokenManager$retrievePushToken$1 */
    public static final class C118021 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118021(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushTokenManager.this.retrievePushToken(this);
        }
    }

    public PushTokenManager(IPushRegistrator iPushRegistrator, IDeviceService iDeviceService) {
        sq8.m48649h(iPushRegistrator, "_pushRegistrator");
        sq8.m48649h(iDeviceService, "_deviceService");
        this._pushRegistrator = iPushRegistrator;
        this._deviceService = iDeviceService;
        this.pushTokenStatus = SubscriptionStatus.NO_PERMISSION;
    }

    private final boolean pushStatusRuntimeError(SubscriptionStatus subscriptionStatus) {
        return subscriptionStatus.getValue() < -6;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final SubscriptionStatus getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.pushtoken.IPushTokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePushToken(n64 n64Var) {
        C118021 c118021;
        PushTokenManager pushTokenManager;
        SubscriptionStatus subscriptionStatus;
        if (n64Var instanceof C118021) {
            c118021 = (C118021) n64Var;
            int i = c118021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118021.label = i - Integer.MIN_VALUE;
            } else {
                c118021 = new C118021(n64Var);
            }
        }
        Object objRegisterForPush = c118021.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118021.label;
        if (i2 == 0) {
            wre.m54934b(objRegisterForPush);
            int i3 = WhenMappings.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
            if (i3 == 1) {
                Logging.fatal$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                this.pushTokenStatus = SubscriptionStatus.MISSING_JETPACK_LIBRARY;
            } else if (i3 != 2) {
                IPushRegistrator iPushRegistrator = this._pushRegistrator;
                c118021.L$0 = this;
                c118021.label = 1;
                objRegisterForPush = iPushRegistrator.registerForPush(c118021);
                if (objRegisterForPush == objM51918f) {
                    return objM51918f;
                }
                pushTokenManager = this;
            } else {
                Logging.fatal$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                this.pushTokenStatus = SubscriptionStatus.OUTDATED_JETPACK_LIBRARY;
            }
            pushTokenManager = this;
            return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pushTokenManager = (PushTokenManager) c118021.L$0;
        wre.m54934b(objRegisterForPush);
        IPushRegistrator.RegisterResult registerResult = (IPushRegistrator.RegisterResult) objRegisterForPush;
        int value = registerResult.getStatus().getValue();
        SubscriptionStatus subscriptionStatus2 = SubscriptionStatus.SUBSCRIBED;
        if (value == subscriptionStatus2.getValue()) {
            pushTokenManager.pushTokenStatus = registerResult.getStatus();
        } else if (registerResult.getStatus().getValue() < subscriptionStatus2.getValue()) {
            if (pushTokenManager.pushToken == null && ((subscriptionStatus = pushTokenManager.pushTokenStatus) == SubscriptionStatus.NO_PERMISSION || pushTokenManager.pushStatusRuntimeError(subscriptionStatus))) {
                pushTokenManager.pushTokenStatus = registerResult.getStatus();
            }
        } else if (pushTokenManager.pushStatusRuntimeError(pushTokenManager.pushTokenStatus)) {
            pushTokenManager.pushTokenStatus = registerResult.getStatus();
        }
        pushTokenManager.pushToken = registerResult.getId();
        return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(SubscriptionStatus subscriptionStatus) {
        sq8.m48649h(subscriptionStatus, "<set-?>");
        this.pushTokenStatus = subscriptionStatus;
    }
}
