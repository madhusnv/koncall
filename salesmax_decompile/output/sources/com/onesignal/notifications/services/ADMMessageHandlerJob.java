package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
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
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    @l75(m36647c = "com.onesignal.notifications.services.ADMMessageHandlerJob$onRegistered$1", m36648f = "ADMMessageHandlerJob.kt", m36649l = {38}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.services.ADMMessageHandlerJob$onRegistered$1 */
    public static final class C118241 extends jgg implements xk7 {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ gge $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118241(gge ggeVar, String str, n64 n64Var) {
            super(1, n64Var);
            this.$registerer = ggeVar;
            this.$newRegistrationId = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C118241(this.$registerer, this.$newRegistrationId, n64Var);
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
            return ((C118241) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.services.ADMMessageHandlerJob$onRegistrationError$1", m36648f = "ADMMessageHandlerJob.kt", m36649l = {62}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.services.ADMMessageHandlerJob$onRegistrationError$1 */
    public static final class C118251 extends jgg implements xk7 {
        final /* synthetic */ gge $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118251(gge ggeVar, n64 n64Var) {
            super(1, n64Var);
            this.$registerer = ggeVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C118251(this.$registerer, n64Var);
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
            return ((C118251) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public void onMessage(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "context.applicationContext");
        if (OneSignal.initWithContext(applicationContext)) {
            INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
            Bundle extras = intent != null ? intent.getExtras() : null;
            sq8.m48646e(extras);
            iNotificationBundleProcessor.processBundleFromReceiver(context, extras);
        }
    }

    public void onRegistered(Context context, String str) {
        Logging.info$default("ADM registration ID: " + str, null, 2, null);
        gge ggeVar = new gge();
        ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118241(ggeVar, str, null), 1, null);
    }

    public void onRegistrationError(Context context, String str) {
        Logging.error$default("ADM:onRegistrationError: " + str, null, 2, null);
        if (sq8.m48644c("INVALID_SENDER", str)) {
            Logging.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        gge ggeVar = new gge();
        ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118251(ggeVar, null), 1, null);
    }

    public void onUnregistered(Context context, String str) {
        Logging.info$default("ADM:onUnregistered: " + str, null, 2, null);
    }
}
