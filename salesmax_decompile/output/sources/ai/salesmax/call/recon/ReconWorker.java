package ai.salesmax.call.recon;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import p001o.h4e;
import p001o.id5;
import p001o.ke1;
import p001o.mbj;
import p001o.n64;
import p001o.q83;
import p001o.sbj;
import p001o.sq8;
import p001o.zfa;

/* loaded from: classes.dex */
public final class ReconWorker extends CoroutineWorker {
    private static final String TAG = "recon-worker";
    private final Context context;
    private final WorkerParameters workerParameters;
    public static final C0068a Companion = new C0068a(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.call.recon.ReconWorker$a */
    public static final class C0068a {
        public C0068a() {
        }

        public /* synthetic */ C0068a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(n64 n64Var) {
        ke1 ke1VarM35525a;
        mbj mbjVar = mbj.RECONCILIATION;
        StringBuilder sb = new StringBuilder();
        sb.append("Worker start for ");
        sb.append(mbjVar);
        try {
            ke1VarM35525a = ke1.f32003i.m35525a();
        } catch (Throwable unused) {
        }
        if (ke1VarM35525a == null) {
            ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
            sq8.m48648g(resultRetry, "retry(...)");
            return resultRetry;
        }
        String string = this.workerParameters.getInputData().getString("accountId");
        if (string == null) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            sq8.m48648g(resultFailure, "failure(...)");
            return resultFailure;
        }
        String string2 = this.workerParameters.getInputData().getString("userId");
        if (string2 == null) {
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            sq8.m48648g(resultFailure2, "failure(...)");
            return resultFailure2;
        }
        q83 q83VarM35518t = ke1VarM35525a.m35518t(mbjVar.name(), string, string2);
        long jM44966g = q83VarM35518t != null ? q83VarM35518t.m44966g() : System.currentTimeMillis();
        h4e h4eVar = h4e.f26198a;
        long jM29804b = h4eVar.m29804b();
        Data dataBuild = new Data.Builder().putAll(this.workerParameters.getInputData()).putLong("start", jM44966g).putLong("end", jM29804b).putLong("threshold", h4eVar.m29809g()).build();
        sq8.m48648g(dataBuild, "build(...)");
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        sbj sbjVar = sbj.f45162a;
        mbj mbjVar2 = mbj.CALL_RECONCILIATION;
        OneTimeWorkRequest.Builder constraints = new OneTimeWorkRequest.Builder(CallReconWorker.class).setInputData(dataBuild).setConstraints(constraintsBuild);
        BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Operation operationM48141c = sbj.m48141c(sbj.f45162a, "RECONCILIATION_CHAIN", this.context, null, new OneTimeWorkRequest[]{constraints.setBackoffCriteria(backoffPolicy, 10000L, timeUnit).addTag(mbjVar2.name()).build(), new OneTimeWorkRequest.Builder(RecordingReconWorker.class).setInputData(dataBuild).setConstraints(constraintsBuild).setBackoffCriteria(backoffPolicy, 10000L, timeUnit).addTag(mbj.RECORDING_RECONCILIATION.name()).build(), new OneTimeWorkRequest.Builder(EngagementCleanupWorker.class).setInputData(dataBuild).setConstraints(Constraints.NONE).setBackoffCriteria(backoffPolicy, 10000L, timeUnit).addTag(mbj.ENGAGEMENT_CLEANUP.name()).build()}, 4, null);
        zfa result = operationM48141c != null ? operationM48141c.getResult() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result of worker registration is: ");
        sb2.append(result);
        long j = jM29804b - 60000;
        if (q83VarM35518t != null) {
            ke1VarM35525a.m35503G(q83.m44960b(q83VarM35518t, 0, null, null, null, j, 15, null));
        } else {
            ke1VarM35525a.m35524z(new q83(0, mbjVar.name(), string, string2, j, 1, null));
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
