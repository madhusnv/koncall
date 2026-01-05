package com.onesignal.notifications.bridges;

import android.content.Context;
import android.os.Bundle;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;
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
public final class OneSignalHmsEventBridge {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final OneSignalHmsEventBridge INSTANCE = new OneSignalHmsEventBridge();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    @l75(m36647c = "com.onesignal.notifications.bridges.OneSignalHmsEventBridge$onNewToken$1", m36648f = "OneSignalHmsEventBridge.kt", m36649l = {SignatureVisitor.EXTENDS}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.bridges.OneSignalHmsEventBridge$onNewToken$1 */
    public static final class C117301 extends jgg implements xk7 {
        final /* synthetic */ gge $registerer;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117301(gge ggeVar, String str, n64 n64Var) {
            super(1, n64Var);
            this.$registerer = ggeVar;
            this.$token = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C117301(this.$registerer, this.$token, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IPushRegistratorCallback iPushRegistratorCallback = (IPushRegistratorCallback) this.$registerer.f25106a;
                String str = this.$token;
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
            return ((C117301) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    private OneSignalHmsEventBridge() {
    }

    public final void onMessageReceived(Context context, RemoteMessage remoteMessage) throws JSONException {
        Bundle bundleJsonStringToBundle;
        sq8.m48649h(context, "context");
        sq8.m48649h(remoteMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (OneSignal.initWithContext(context)) {
            OneSignal oneSignal = OneSignal.INSTANCE;
            ITime iTime = (ITime) oneSignal.getServices().getService(ITime.class);
            INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) oneSignal.getServices().getService(INotificationBundleProcessor.class);
            String data = remoteMessage.getData();
            try {
                JSONObject jSONObject = new JSONObject(remoteMessage.getData());
                if (remoteMessage.getTtl() == 0) {
                    jSONObject.put("hms.ttl", 259200);
                } else {
                    jSONObject.put("hms.ttl", remoteMessage.getTtl());
                }
                if (remoteMessage.getSentTime() == 0) {
                    jSONObject.put("hms.sent_time", iTime.getCurrentTimeMillis());
                } else {
                    jSONObject.put("hms.sent_time", remoteMessage.getSentTime());
                }
                data = jSONObject.toString();
            } catch (JSONException unused) {
                Logging.error$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
            }
            if (data == null || (bundleJsonStringToBundle = JSONUtils.INSTANCE.jsonStringToBundle(data)) == null) {
                return;
            }
            iNotificationBundleProcessor.processBundleFromReceiver(context, bundleJsonStringToBundle);
        }
    }

    public final void onNewToken(Context context, String str, Bundle bundle) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        if (!firstToken.compareAndSet(true, false)) {
            Logging.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
            return;
        }
        Logging.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
        gge ggeVar = new gge();
        ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C117301(ggeVar, str, null), 1, null);
    }

    public final void onNewToken(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        onNewToken(context, str, null);
    }
}
