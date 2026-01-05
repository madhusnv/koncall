package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import p001o.op0;
import p001o.ria;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iM7464b = new Requirements(extras.getInt("requirements")).m7464b(this);
        if (iM7464b == 0) {
            sqi.l1(this, new Intent((String) op0.m42515e(extras.getString("service_action"))).setPackage((String) op0.m42515e(extras.getString("service_package"))));
            return false;
        }
        ria.m46824h("PlatformScheduler", "Requirements not met: " + iM7464b);
        jobFinished(jobParameters, true);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
