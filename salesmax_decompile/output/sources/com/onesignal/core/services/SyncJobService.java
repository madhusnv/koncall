package com.onesignal.core.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.OneSignal;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.debug.internal.logging.Logging;
import p001o.gge;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class SyncJobService extends JobService {

    @l75(m36647c = "com.onesignal.core.services.SyncJobService$onStartJob$1", m36648f = "SyncJobService.kt", m36649l = {45}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.services.SyncJobService$onStartJob$1 */
    public static final class C116281 extends jgg implements xk7 {
        final /* synthetic */ gge $backgroundService;
        final /* synthetic */ JobParameters $jobParameters;
        int label;
        final /* synthetic */ SyncJobService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116281(gge ggeVar, SyncJobService syncJobService, JobParameters jobParameters, n64 n64Var) {
            super(1, n64Var);
            this.$backgroundService = ggeVar;
            this.this$0 = syncJobService;
            this.$jobParameters = jobParameters;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C116281(this.$backgroundService, this.this$0, this.$jobParameters, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IBackgroundManager iBackgroundManager = (IBackgroundManager) this.$backgroundService.f25106a;
                this.label = 1;
                if (iBackgroundManager.runBackgroundServices(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            Logging.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + ((IBackgroundManager) this.$backgroundService.f25106a).getNeedsJobReschedule(), null, 2, null);
            boolean needsJobReschedule = ((IBackgroundManager) this.$backgroundService.f25106a).getNeedsJobReschedule();
            ((IBackgroundManager) this.$backgroundService.f25106a).setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, needsJobReschedule);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116281) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        sq8.m48649h(jobParameters, "jobParameters");
        if (!OneSignal.initWithContext(this)) {
            return false;
        }
        gge ggeVar = new gge();
        ggeVar.f25106a = OneSignal.INSTANCE.getServices().getService(IBackgroundManager.class);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116281(ggeVar, this, jobParameters, null), 1, null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        sq8.m48649h(jobParameters, "jobParameters");
        boolean zCancelRunBackgroundServices = ((IBackgroundManager) OneSignal.INSTANCE.getServices().getService(IBackgroundManager.class)).cancelRunBackgroundServices();
        Logging.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + zCancelRunBackgroundServices, null, 2, null);
        return zCancelRunBackgroundServices;
    }
}
