package ai.salesmax.ui.service;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class CallStateManagerWorker extends Worker {

    /* renamed from: a */
    public static CallStateManagerRestarterBroadcastReceiver f3589a;

    public CallStateManagerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public final synchronized void m2649a(boolean z) {
        Context applicationContext = getApplicationContext();
        CallStateManagerRestarterBroadcastReceiver callStateManagerRestarterBroadcastReceiver = f3589a;
        if (callStateManagerRestarterBroadcastReceiver == null) {
            f3589a = new CallStateManagerRestarterBroadcastReceiver();
        } else {
            try {
                applicationContext.unregisterReceiver(callStateManagerRestarterBroadcastReceiver);
            } catch (Exception unused) {
            }
        }
        if (!z) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("ai.salesmax.callstatemanager.restarter");
            intentFilter.addAction("ai.salesmax.callstatemanager.stopper");
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    applicationContext.registerReceiver(f3589a, intentFilter, 4);
                } else {
                    applicationContext.registerReceiver(f3589a, intentFilter);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: b */
    public synchronized void m2650b(boolean z) {
        new C1222a(true, z).m2673d(getApplicationContext());
    }

    /* renamed from: c */
    public synchronized void m2651c() {
        new C1222a().m2672c(getApplicationContext());
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        Boolean boolValueOf = Boolean.valueOf(getInputData().getBoolean("STOP_SERVICE_INDICATOR", false));
        Boolean boolValueOf2 = Boolean.valueOf(getInputData().getBoolean("RESTART_FOREGROUND_SERVICE", false));
        m2649a(boolValueOf.booleanValue());
        if (boolValueOf.booleanValue()) {
            m2651c();
        } else {
            m2650b(boolValueOf2.booleanValue());
        }
        return ListenableWorker.Result.success();
    }
}
