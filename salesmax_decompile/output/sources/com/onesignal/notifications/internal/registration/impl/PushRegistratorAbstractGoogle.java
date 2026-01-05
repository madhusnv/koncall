package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import java.io.IOException;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.l75;
import p001o.n64;
import p001o.nk5;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public abstract class PushRegistratorAbstractGoogle implements IPushRegistrator, IPushRegistratorCallback {
    public static final Companion Companion = new Companion(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final GooglePlayServicesUpgradePrompt _upgradePrompt;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", m36648f = "PushRegistratorAbstractGoogle.kt", m36649l = {128}, m36650m = "attemptRegistration")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle$attemptRegistration$1 */
    public static final class C118071 extends o64 {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118071(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushRegistratorAbstractGoogle.this.attemptRegistration(null, 0, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", m36648f = "PushRegistratorAbstractGoogle.kt", m36649l = {Opcodes.BASTORE, 86}, m36650m = "internalRegisterForPush")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle$internalRegisterForPush$1 */
    public static final class C118081 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118081(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushRegistratorAbstractGoogle.this.internalRegisterForPush(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", m36648f = "PushRegistratorAbstractGoogle.kt", m36649l = {108, Opcodes.LREM}, m36650m = "registerInBackground")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle$registerInBackground$1 */
    public static final class C118091 extends o64 {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118091(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushRegistratorAbstractGoogle.this.registerInBackground(null, this);
        }
    }

    public PushRegistratorAbstractGoogle(IDeviceService iDeviceService, ConfigModelStore configModelStore, GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt) {
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(googlePlayServicesUpgradePrompt, "_upgradePrompt");
        this._deviceService = iDeviceService;
        this._configModelStore = configModelStore;
        this._upgradePrompt = googlePlayServicesUpgradePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptRegistration(String str, int i, n64 n64Var) {
        C118071 c118071;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle;
        String rootCauseMessage;
        if (n64Var instanceof C118071) {
            c118071 = (C118071) n64Var;
            int i2 = c118071.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118071.label = i2 - Integer.MIN_VALUE;
            } else {
                c118071 = new C118071(n64Var);
            }
        }
        Object token = c118071.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c118071.label;
        boolean z = true;
        if (i3 == 0) {
            wre.m54934b(token);
            try {
                c118071.L$0 = this;
                c118071.I$0 = i;
                c118071.label = 1;
                token = getToken(str, c118071);
                if (token == objM51918f) {
                    return objM51918f;
                }
                pushRegistratorAbstractGoogle = this;
            } catch (IOException e) {
                e = e;
                pushRegistratorAbstractGoogle = this;
                SubscriptionStatus subscriptionStatusPushStatusFromThrowable = pushRegistratorAbstractGoogle.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if (!sq8.m48644c("SERVICE_NOT_AVAILABLE", rootCauseMessage)) {
                    z = false;
                }
                if (z) {
                }
            } catch (Throwable th) {
                th = th;
                pushRegistratorAbstractGoogle = this;
                Logging.error("Unknown error getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", th);
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c118071.I$0;
            pushRegistratorAbstractGoogle = (PushRegistratorAbstractGoogle) c118071.L$0;
            try {
                wre.m54934b(token);
            } catch (IOException e2) {
                e = e2;
                SubscriptionStatus subscriptionStatusPushStatusFromThrowable2 = pushRegistratorAbstractGoogle.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if (!sq8.m48644c("SERVICE_NOT_AVAILABLE", rootCauseMessage) && !sq8.m48644c("AUTHENTICATION_FAILED", rootCauseMessage)) {
                    z = false;
                }
                if (z) {
                    Logging.error("Error Getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", new Exception(e));
                    return new IPushRegistrator.RegisterResult(null, subscriptionStatusPushStatusFromThrowable2);
                }
                Exception exc = new Exception(e);
                if (i >= 4) {
                    Logging.error("Retry count of 5 exceed! Could not get a " + pushRegistratorAbstractGoogle.getProviderName() + " Token.", exc);
                } else {
                    Logging.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        return new IPushRegistrator.RegisterResult(null, subscriptionStatusPushStatusFromThrowable2);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                Logging.error("Unknown error getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", th);
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        }
        String str2 = (String) token;
        Logging.info$default("Device registered, push token = " + str2, null, 2, null);
        return new IPushRegistrator.RegisterResult(str2, SubscriptionStatus.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, String str, n64 n64Var) throws Exception {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalRegisterForPush(String str, n64 n64Var) {
        C118081 c118081;
        if (n64Var instanceof C118081) {
            c118081 = (C118081) n64Var;
            int i = c118081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118081.label = i - Integer.MIN_VALUE;
            } else {
                c118081 = new C118081(n64Var);
            }
        }
        Object objRegisterInBackground = c118081.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118081.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    wre.m54934b(objRegisterInBackground);
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objRegisterInBackground);
                Logging.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
            }
            wre.m54934b(objRegisterInBackground);
            try {
                if (this._deviceService.isGMSInstalledAndEnabled()) {
                    c118081.L$0 = this;
                    c118081.label = 1;
                    objRegisterInBackground = registerInBackground(str, c118081);
                    return objRegisterInBackground == objM51918f ? objM51918f : (IPushRegistrator.RegisterResult) objRegisterInBackground;
                }
                GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt = this._upgradePrompt;
                c118081.L$0 = this;
                c118081.label = 2;
                if (googlePlayServicesUpgradePrompt.showUpdateGPSDialog(c118081) == objM51918f) {
                    return objM51918f;
                }
                Logging.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
            } catch (Throwable th) {
                th = th;
                str = this;
                Logging.error("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean isValidProjectNumber(String str) {
        boolean z;
        try {
            sq8.m48646e(str);
            Float.parseFloat(str);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        return z;
    }

    private final SubscriptionStatus pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? sq8.m48644c(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : sq8.m48644c(rootCauseMessage, "AUTHENTICATION_FAILED") ? SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, n64 n64Var) {
        if (!pushRegistratorAbstractGoogle._configModelStore.getModel().isInitializedWithRemote()) {
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
        }
        if (!pushRegistratorAbstractGoogle._deviceService.getHasFCMLibrary()) {
            Logging.fatal$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!pushRegistratorAbstractGoogle.isValidProjectNumber(pushRegistratorAbstractGoogle._configModelStore.getModel().getGoogleProjectNumber())) {
            Logging.error$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = pushRegistratorAbstractGoogle._configModelStore.getModel().getGoogleProjectNumber();
        sq8.m48646e(googleProjectNumber);
        return pushRegistratorAbstractGoogle.internalRegisterForPush(googleProjectNumber, n64Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007e -> B:29:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerInBackground(String str, n64 n64Var) {
        C118091 c118091;
        int i;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle;
        int i2;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle2;
        String str2;
        IPushRegistrator.RegisterResult registerResult;
        if (n64Var instanceof C118091) {
            c118091 = (C118091) n64Var;
            int i3 = c118091.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c118091.label = i3 - Integer.MIN_VALUE;
            } else {
                c118091 = new C118091(n64Var);
            }
        }
        Object obj = c118091.result;
        Object objM51918f = uq8.m51918f();
        int i4 = c118091.label;
        if (i4 == 0) {
            wre.m54934b(obj);
            i = 0;
            pushRegistratorAbstractGoogle = this;
            if (i < 5) {
            }
        } else if (i4 == 1) {
            i2 = c118091.I$0;
            str2 = (String) c118091.L$1;
            pushRegistratorAbstractGoogle2 = (PushRegistratorAbstractGoogle) c118091.L$0;
            wre.m54934b(obj);
            registerResult = (IPushRegistrator.RegisterResult) obj;
            if (registerResult == null) {
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c118091.I$0;
            str2 = (String) c118091.L$1;
            pushRegistratorAbstractGoogle2 = (PushRegistratorAbstractGoogle) c118091.L$0;
            wre.m54934b(obj);
            i = i2 + 1;
            str = str2;
            pushRegistratorAbstractGoogle = pushRegistratorAbstractGoogle2;
            if (i < 5) {
                c118091.L$0 = pushRegistratorAbstractGoogle;
                c118091.L$1 = str;
                c118091.I$0 = i;
                c118091.label = 1;
                Object objAttemptRegistration = pushRegistratorAbstractGoogle.attemptRegistration(str, i, c118091);
                if (objAttemptRegistration == objM51918f) {
                    return objM51918f;
                }
                PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle3 = pushRegistratorAbstractGoogle;
                str2 = str;
                i2 = i;
                obj = objAttemptRegistration;
                pushRegistratorAbstractGoogle2 = pushRegistratorAbstractGoogle3;
                registerResult = (IPushRegistrator.RegisterResult) obj;
                if (registerResult == null) {
                    return registerResult;
                }
                c118091.L$0 = pushRegistratorAbstractGoogle2;
                c118091.L$1 = str2;
                c118091.I$0 = i2;
                c118091.label = 2;
                if (nk5.m40720b((i2 + 1) * 10000, c118091) == objM51918f) {
                    return objM51918f;
                }
                i = i2 + 1;
                str = str2;
                pushRegistratorAbstractGoogle = pushRegistratorAbstractGoogle2;
                if (i < 5) {
                    return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
                }
            }
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, n64 n64Var) {
        return fireCallback$suspendImpl(this, str, n64Var);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, n64 n64Var);

    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    public Object registerForPush(n64 n64Var) {
        return registerForPush$suspendImpl(this, n64Var);
    }
}
