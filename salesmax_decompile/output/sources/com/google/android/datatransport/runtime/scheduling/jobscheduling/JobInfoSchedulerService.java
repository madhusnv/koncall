package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p001o.cxh;
import p001o.iid;
import p001o.qwh;

/* loaded from: classes5.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m13642b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        cxh.m22043f(getApplicationContext());
        qwh.AbstractC16484a abstractC16484aMo45900d = qwh.m45891a().mo45898b(string).mo45900d(iid.m32180b(i));
        if (string2 != null) {
            abstractC16484aMo45900d.mo45899c(Base64.decode(string2, 0));
        }
        cxh.m22041c().m22046e().m52448v(abstractC16484aMo45900d.mo45897a(), i2, new Runnable() { // from class: o.u69
            @Override // java.lang.Runnable
            public final void run() {
                this.f48392a.m13642b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
