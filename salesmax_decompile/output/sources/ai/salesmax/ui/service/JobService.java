package ai.salesmax.ui.service;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

@SuppressLint({"SpecifyJobSchedulerIdRange"})
/* loaded from: classes.dex */
public class JobService extends android.app.job.JobService {

    /* renamed from: a */
    public static CallStateManagerRestarterBroadcastReceiver f3590a;

    /* renamed from: b */
    public static JobService f3591b;

    /* renamed from: c */
    public static JobParameters f3592c;

    /* renamed from: ai.salesmax.ui.service.JobService$a */
    public class RunnableC1218a implements Runnable {
        public RunnableC1218a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("ai.salesmax.callstatemanager.restarter");
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        JobService.this.registerReceiver(JobService.f3590a, intentFilter, 4);
                    } else {
                        JobService.this.registerReceiver(JobService.f3590a, intentFilter);
                    }
                } catch (Exception unused) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        JobService.this.getApplicationContext().registerReceiver(JobService.f3590a, intentFilter, 4);
                    } else {
                        JobService.this.getApplicationContext().registerReceiver(JobService.f3590a, intentFilter);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: ai.salesmax.ui.service.JobService$b */
    public class RunnableC1219b implements Runnable {
        public RunnableC1219b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobService.this.unregisterReceiver(JobService.f3590a);
        }
    }

    /* renamed from: b */
    public final synchronized void m2653b() {
        CallStateManagerRestarterBroadcastReceiver callStateManagerRestarterBroadcastReceiver = f3590a;
        if (callStateManagerRestarterBroadcastReceiver == null) {
            f3590a = new CallStateManagerRestarterBroadcastReceiver();
        } else {
            try {
                unregisterReceiver(callStateManagerRestarterBroadcastReceiver);
            } catch (Exception unused) {
            }
        }
        new Handler().postDelayed(new RunnableC1218a(), 1000L);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String.format("On start job service started %s", this);
        new C1222a().m2673d(this);
        m2653b();
        f3591b = this;
        f3592c = jobParameters;
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        String.format("On stop job service stopped %s", this);
        Intent intent = new Intent("ai.salesmax.callstatemanager.restarter");
        intent.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent);
        new Handler().postDelayed(new RunnableC1219b(), 1000L);
        return false;
    }
}
