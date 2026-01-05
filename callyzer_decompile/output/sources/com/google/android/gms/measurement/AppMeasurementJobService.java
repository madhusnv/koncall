package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.x0;
import dj.RunnableC1730c;
import java.util.Objects;
import l0.RunnableC4307g;
import sf.AbstractC6840z;
import uf.C7427b;
import ug.h4;
import ug.n3;
import ug.v0;
import yk.C8687a;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements n3 {

    /* renamed from: a */
    public C7427b f6711a;

    @Override // ug.n3
    /* renamed from: a */
    public final boolean mo4012a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // ug.n3
    /* renamed from: c */
    public final void mo4014c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: d */
    public final C7427b m4015d() {
        if (this.f6711a == null) {
            this.f6711a = new C7427b(1, this);
        }
        return this.f6711a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) m4015d().f35231b).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) m4015d().f35231b).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m4015d();
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        C7427b c7427bM4015d = m4015d();
        Service service = (Service) c7427bM4015d.f35231b;
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            AbstractC6840z.m13036g(string);
            h4 h4VarM13938C = h4.m13938C(service);
            v0 v0VarMo326a = h4VarM13938C.mo326a();
            C8687a c8687a = h4VarM13938C.f35497m.f35666c;
            v0VarMo326a.f35870p.m14141b(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            h4VarM13938C.mo327b().m14047V(new RunnableC4307g(c7427bM4015d, h4VarM13938C, new RunnableC1730c(11, c7427bM4015d, v0VarMo326a, jobParameters2, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        AbstractC6840z.m13036g(string);
        l1 l1VarM3479e = l1.m3479e(service, null);
        RunnableC8956c runnableC8956c = new RunnableC8956c(23, c7427bM4015d, jobParameters2);
        l1VarM3479e.getClass();
        l1VarM3479e.m3482c(new x0(l1VarM3479e, runnableC8956c, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m4015d();
        if (intent == null) {
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    @Override // ug.n3
    /* renamed from: b */
    public final void mo4013b(Intent intent) {
    }
}
