package ug;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x3 extends c4 {

    /* renamed from: d */
    public final AlarmManager f35928d;

    /* renamed from: e */
    public r3 f35929e;

    /* renamed from: f */
    public Integer f35930f;

    public x3(h4 h4Var) {
        super(h4Var);
        this.f35928d = (AlarmManager) ((n1) this.f482a).f35664a.getSystemService("alarm");
    }

    @Override // ug.c4
    /* renamed from: P */
    public final void mo13847P() {
        AlarmManager alarmManager = this.f35928d;
        if (alarmManager != null) {
            Context context = ((n1) this.f482a).f35664a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.f6183a));
        }
        m14187S();
    }

    /* renamed from: Q */
    public final void m14185Q() {
        m13858N();
        n1 n1Var = (n1) this.f482a;
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35870p.m14140a("Unscheduling upload");
        AlarmManager alarmManager = this.f35928d;
        if (alarmManager != null) {
            Context context = n1Var.f35664a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.f6183a));
        }
        m14186R().m14097c();
        m14187S();
    }

    /* renamed from: R */
    public final AbstractC7444o m14186R() {
        if (this.f35929e == null) {
            this.f35929e = new r3(this, this.f35959b.f35497m, 1);
        }
        return this.f35929e;
    }

    /* renamed from: S */
    public final void m14187S() {
        JobScheduler jobScheduler = (JobScheduler) ((n1) this.f482a).f35664a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m14188T());
        }
    }

    /* renamed from: T */
    public final int m14188T() {
        if (this.f35930f == null) {
            this.f35930f = Integer.valueOf("measurement".concat(String.valueOf(((n1) this.f482a).f35664a.getPackageName())).hashCode());
        }
        return this.f35930f.intValue();
    }
}
