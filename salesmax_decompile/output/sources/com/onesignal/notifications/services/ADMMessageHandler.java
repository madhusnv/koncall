package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.google.firebase.messaging.Constants;
import com.onesignal.OneSignal;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback;
import p001o.gge;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ADMMessageHandler extends ADMMessageHandlerBase {

    @l75(m36647c = "com.onesignal.notifications.services.ADMMessageHandler$onRegistered$1", m36648f = "ADMMessageHandler.kt", m36649l = {32}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.services.ADMMessageHandler$onRegistered$1 */
    public static final class C118221 extends jgg implements xk7 {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ gge $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118221(gge ggeVar, String str, n64 n64Var) {
            super(1, n64Var);
            this.$registerer = ggeVar;
            this.$newRegistrationId = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C118221(this.$registerer, this.$newRegistrationId, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IPushRegistratorCallback iPushRegistratorCallback = (IPushRegistratorCallback) this.$registerer.f25106a;
                String str = this.$newRegistrationId;
                this.label = 1;
                if (iPushRegistratorCallback.fireCallback(str, this) == objM51918f) {
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
            return ((C118221) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.services.ADMMessageHandler$onRegistrationError$1", m36648f = "ADMMessageHandler.kt", m36649l = {47}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.services.ADMMessageHandler$onRegistrationError$1 */
    public static final class C118231 extends jgg implements xk7 {
        final /* synthetic */ gge $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118231(gge ggeVar, n64 n64Var) {
            super(1, n64Var);
            this.$registerer = ggeVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C118231(this.$registerer, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IPushRegistratorCallback iPushRegistratorCallback = (IPushRegistratorCallback) this.$registerer.f25106a;
                this.label = 1;
                if (iPushRegistratorCallback.fireCallback(null, this) == objM51918f) {
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
            return ((C118231) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        sq8.m48649h(intent, "intent");
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "context");
        if (OneSignal.initWithContext(applicationContext)) {
            Bundle extras = intent.getExtras();
            INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
            sq8.m48646e(extras);
            iNotificationBundleProcessor.processBundleFromReceiver(applicationContext, extras);
        }
    }

    public void onRegistered(String str) {
        sq8.m48649h(str, "newRegistrationId");
        Logging.info$default("ADM registration ID: " + str, null, 2, null);
        gge ggeVar = new gge();
        ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118221(ggeVar, str, null), 1, null);
    }

    public void onRegistrationError(String str) {
        sq8.m48649h(str, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Logging.error$default("ADM:onRegistrationError: " + str, null, 2, null);
        if (sq8.m48644c("INVALID_SENDER", str)) {
            Logging.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        gge ggeVar = new gge();
        ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118231(ggeVar, null), 1, null);
    }

    public void onUnregistered(String str) {
        sq8.m48649h(str, "info");
        Logging.info$default("ADM:onUnregistered: " + str, null, 2, null);
    }
}
