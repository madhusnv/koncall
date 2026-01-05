package p001o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public class t69 implements qbj {

    /* renamed from: a */
    public final Context f46504a;

    /* renamed from: b */
    public final nk6 f46505b;

    /* renamed from: c */
    public final e5f f46506c;

    public t69(Context context, nk6 nk6Var, e5f e5fVar) {
        this.f46504a = context;
        this.f46505b = nk6Var;
        this.f46506c = e5fVar;
    }

    @Override // p001o.qbj
    /* renamed from: a */
    public void mo45068a(qwh qwhVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f46504a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f46504a.getSystemService("jobscheduler");
        int iM49435c = m49435c(qwhVar);
        if (!z && m49436d(jobScheduler, iM49435c, i)) {
            aka.m17333b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", qwhVar);
            return;
        }
        long jMo40727y = this.f46505b.mo40727y(qwhVar);
        JobInfo.Builder builderM24322c = this.f46506c.m24322c(new JobInfo.Builder(iM49435c, componentName), qwhVar.mo45894d(), jMo40727y, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", qwhVar.mo45892b());
        persistableBundle.putInt("priority", iid.m32179a(qwhVar.mo45894d()));
        if (qwhVar.mo45893c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(qwhVar.mo45893c(), 0));
        }
        builderM24322c.setExtras(persistableBundle);
        aka.m17334c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", qwhVar, Integer.valueOf(iM49435c), Long.valueOf(this.f46506c.m24324g(qwhVar.mo45894d(), jMo40727y, i)), Long.valueOf(jMo40727y), Integer.valueOf(i));
        jobScheduler.schedule(builderM24322c.build());
    }

    @Override // p001o.qbj
    /* renamed from: b */
    public void mo45069b(qwh qwhVar, int i) {
        mo45068a(qwhVar, i, false);
    }

    /* renamed from: c */
    public int m49435c(qwh qwhVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f46504a.getPackageName().getBytes(Charset.forName(HTTP.UTF_8)));
        adler32.update(qwhVar.mo45892b().getBytes(Charset.forName(HTTP.UTF_8)));
        adler32.update(ByteBuffer.allocate(4).putInt(iid.m32179a(qwhVar.mo45894d())).array());
        if (qwhVar.mo45893c() != null) {
            adler32.update(qwhVar.mo45893c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean m49436d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
