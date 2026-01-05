package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS;
import org.objectweb.asm.Opcodes;
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
public final class NotificationOpenedActivityHMS extends Activity {

    @l75(m36647c = "com.onesignal.NotificationOpenedActivityHMS$processOpen$1", m36648f = "NotificationOpenedActivityHMS.kt", m36649l = {Opcodes.DASTORE}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.NotificationOpenedActivityHMS$processOpen$1 */
    public static final class C115701 extends jgg implements xk7 {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ gge $notificationPayloadProcessorHMS;
        final /* synthetic */ NotificationOpenedActivityHMS $self;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115701(gge ggeVar, NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, n64 n64Var) {
            super(1, n64Var);
            this.$notificationPayloadProcessorHMS = ggeVar;
            this.$self = notificationOpenedActivityHMS;
            this.$intent = intent;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C115701(this.$notificationPayloadProcessorHMS, this.$self, this.$intent, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationOpenedProcessorHMS iNotificationOpenedProcessorHMS = (INotificationOpenedProcessorHMS) this.$notificationPayloadProcessorHMS.f25106a;
                NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.$self;
                Intent intent = this.$intent;
                this.label = 1;
                if (iNotificationOpenedProcessorHMS.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, intent, this) == objM51918f) {
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
            return ((C115701) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    private final void processIntent() {
        processOpen(getIntent());
        finish();
    }

    private final void processOpen(Intent intent) {
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "applicationContext");
        if (OneSignal.initWithContext(applicationContext)) {
            gge ggeVar = new gge();
            ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessorHMS.class);
            ThreadUtilsKt.suspendifyBlocking(new C115701(ggeVar, this, intent, null));
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
