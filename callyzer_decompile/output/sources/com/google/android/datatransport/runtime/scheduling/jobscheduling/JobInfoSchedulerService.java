package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.RunnableC0012k;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import df.RunnableC1706e;
import hf.AbstractC2919a;
import io.C3328c;
import java.util.concurrent.Executor;
import ug.C7439j;
import xe.C8357i;
import xe.C8365q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a */
    public static final /* synthetic */ int f5957a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        C8365q.m15537b(getApplicationContext());
        C7439j c7439jM15532a = C8357i.m15532a();
        c7439jM15532a.m13997C(string);
        c7439jM15532a.f35539d = AbstractC2919a.m7026b(i10);
        if (string2 != null) {
            c7439jM15532a.f35537b = Base64.decode(string2, 0);
        }
        C3328c c3328c = C8365q.m15536a().f40023d;
        ((Executor) c3328c.f17613e).execute(new RunnableC1706e(c3328c, c7439jM15532a.m14003n(), i11, new RunnableC0012k(16, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
