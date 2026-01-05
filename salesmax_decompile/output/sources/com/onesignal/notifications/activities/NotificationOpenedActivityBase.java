package com.onesignal.notifications.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.OneSignal;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public abstract class NotificationOpenedActivityBase extends Activity {

    @l75(m36647c = "com.onesignal.notifications.activities.NotificationOpenedActivityBase$processIntent$1", m36648f = "NotificationOpenedActivityBase.kt", m36649l = {53}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.activities.NotificationOpenedActivityBase$processIntent$1 */
    public static final class C117291 extends jgg implements xk7 {
        int label;

        public C117291(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return NotificationOpenedActivityBase.this.new C117291(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationOpenedProcessor iNotificationOpenedProcessor = (INotificationOpenedProcessor) OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessor.class);
                NotificationOpenedActivityBase notificationOpenedActivityBase = NotificationOpenedActivityBase.this;
                Intent intent = notificationOpenedActivityBase.getIntent();
                sq8.m48648g(intent, "intent");
                this.label = 1;
                if (iNotificationOpenedProcessor.processFromContext(notificationOpenedActivityBase, intent, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            NotificationOpenedActivityBase.this.finish();
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117291) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    private final void processIntent() {
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "applicationContext");
        if (OneSignal.initWithContext(applicationContext)) {
            ThreadUtilsKt.suspendifyOnThread$default(0, new C117291(null), 1, null);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        sq8.m48649h(intent, "intent");
        super.onNewIntent(intent);
        processIntent();
    }
}
