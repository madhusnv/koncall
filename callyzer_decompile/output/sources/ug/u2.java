package ug;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u2 extends h0 {

    /* renamed from: c */
    public JobScheduler f35838c;

    @Override // ug.h0
    /* renamed from: P */
    public final boolean mo13839P() {
        return true;
    }

    /* renamed from: Q */
    public final void m14151Q(long j6) {
        n1 n1Var = (n1) this.f482a;
        m13936N();
        mo325M();
        JobScheduler jobScheduler = this.f35838c;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(n1Var.f35664a.getPackageName())).hashCode()) != null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14140a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.r3 r3VarM14152R = m14152R();
        if (r3VarM14152R != com.google.android.gms.internal.measurement.r3.CLIENT_UPLOAD_ELIGIBLE) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35870p.m14141b(r3VarM14152R.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        v0 v0Var3 = n1Var.f35669f;
        n1.m14085m(v0Var3);
        v0Var3.f35870p.m14141b(Long.valueOf(j6), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(n1Var.f35664a.getPackageName())).hashCode(), new ComponentName(n1Var.f35664a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j6).setOverrideDeadline(j6 + j6).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f35838c;
        AbstractC6840z.m13036g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        v0 v0Var4 = n1Var.f35669f;
        n1.m14085m(v0Var4);
        v0Var4.f35870p.m14141b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    /* renamed from: R */
    public final com.google.android.gms.internal.measurement.r3 m14152R() {
        n1 n1Var = (n1) this.f482a;
        m13936N();
        mo325M();
        if (this.f35838c == null) {
            return com.google.android.gms.internal.measurement.r3.MISSING_JOB_SCHEDULER;
        }
        Boolean boolM13891Y = n1Var.f35667d.m13891Y("google_analytics_sgtm_upload_enabled");
        return boolM13891Y == null ? false : boolM13891Y.booleanValue() ? n1Var.m14095r().f35648k >= 119000 ? !l4.f0(n1Var.f35664a) ? com.google.android.gms.internal.measurement.r3.MEASUREMENT_SERVICE_NOT_ENABLED : !n1Var.m14093p().m14020T() ? com.google.android.gms.internal.measurement.r3.NON_PLAY_MODE : com.google.android.gms.internal.measurement.r3.CLIENT_UPLOAD_ELIGIBLE : com.google.android.gms.internal.measurement.r3.SDK_TOO_OLD : com.google.android.gms.internal.measurement.r3.NOT_ENABLED_IN_MANIFEST;
    }
}
