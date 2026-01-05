package ai.salesmax.ui.service;

import ai.salesmax.ui.call.BaseCallBroadcastReceiver;
import ai.salesmax.ui.call.C0309a;
import ai.salesmax.ui.service.CallStateManagerRestarterBroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p001o.ggd;
import p001o.gu3;
import p001o.i5f;
import p001o.jm;
import p001o.ke1;

/* loaded from: classes.dex */
public class CallStateManagerRestarterBroadcastReceiver extends BaseCallBroadcastReceiver {
    /* renamed from: h */
    public static void m2580h(Context context) {
        Intent intent = new Intent("ai.salesmax.callstatemanager.stopper");
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m2581i(String str, Boolean bool) {
        return bool.booleanValue() || str.equals("ai.salesmax.callstatemanager.stopper");
    }

    /* renamed from: j */
    public static /* synthetic */ void m2582j(String str, Context context, Boolean bool) {
        Data.Builder builder = new Data.Builder();
        builder.putBoolean("STOP_SERVICE_INDICATOR", Objects.equals(str, "ai.salesmax.callstatemanager.stopper"));
        builder.putBoolean("RESTART_FOREGROUND_SERVICE", Objects.equals(str, "ai.salesmax.callstatemanager.NOTIFICATION_DISMISSED"));
        WorkManager.getInstance(context).enqueueUniqueWork("CALL_LOG_LISTENER", ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(CallStateManagerWorker.class).setInitialDelay(0L, TimeUnit.SECONDS).setConstraints(Constraints.NONE).addTag("CALL_STATE_MANGER_WORKER").setInputData(builder.build()).build());
    }

    /* renamed from: k */
    public static /* synthetic */ void m2583k(Throwable th) {
    }

    /* renamed from: l */
    public static /* synthetic */ void m2584l() {
    }

    /* renamed from: m */
    public static void m2585m(Context context) {
        m2586n(context);
    }

    /* renamed from: n */
    public static void m2586n(Context context) {
        m2587o(context, "ai.salesmax.callstatemanager.restarter");
    }

    /* renamed from: o */
    public static void m2587o(final Context context, final String str) {
        CallStateManagerService.m2594L().y0(i5f.m31599c()).m55714J(new ggd() { // from class: o.g02
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return CallStateManagerRestarterBroadcastReceiver.m2581i(str, (Boolean) obj);
            }
        }).w0(new gu3() { // from class: o.h02
            @Override // p001o.gu3
            public final void accept(Object obj) {
                CallStateManagerRestarterBroadcastReceiver.m2582j(str, context, (Boolean) obj);
            }
        }, new gu3() { // from class: o.i02
            @Override // p001o.gu3
            public final void accept(Object obj) {
                CallStateManagerRestarterBroadcastReceiver.m2583k((Throwable) obj);
            }
        }, new jm() { // from class: o.j02
            @Override // p001o.jm
            public final void run() {
                CallStateManagerRestarterBroadcastReceiver.m2584l();
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("about to start call state listener ");
        sb.append(context.toString());
        ke1.f32003i.m35526b(context.getApplicationContext());
        if (!Objects.equals(intent.getAction(), "android.intent.action.PHONE_STATE")) {
            m2587o(context, intent.getAction());
        } else {
            if (C0309a.f469b.m779b() || !m739b(context, intent)) {
                return;
            }
            m740c(context, intent);
        }
    }
}
