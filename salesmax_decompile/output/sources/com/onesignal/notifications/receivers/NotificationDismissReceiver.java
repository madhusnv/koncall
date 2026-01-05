package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.OneSignal;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
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
public final class NotificationDismissReceiver extends BroadcastReceiver {

    @l75(m36647c = "com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1", m36648f = "NotificationDismissReceiver.kt", m36649l = {46}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1 */
    public static final class C118211 extends jgg implements xk7 {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ gge $notificationOpenedProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118211(gge ggeVar, Context context, Intent intent, n64 n64Var) {
            super(1, n64Var);
            this.$notificationOpenedProcessor = ggeVar;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C118211(this.$notificationOpenedProcessor, this.$context, this.$intent, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                INotificationOpenedProcessor iNotificationOpenedProcessor = (INotificationOpenedProcessor) this.$notificationOpenedProcessor.f25106a;
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                if (iNotificationOpenedProcessor.processFromContext(context, intent, this) == objM51918f) {
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
            return ((C118211) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "context.applicationContext");
        if (OneSignal.initWithContext(applicationContext)) {
            gge ggeVar = new gge();
            ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessor.class);
            ThreadUtilsKt.suspendifyBlocking(new C118211(ggeVar, context, intent, null));
        }
    }
}
