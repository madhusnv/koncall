package p001o;

import ai.salesmax.call.recon.CallReconWorker;
import ai.salesmax.call.recon.EngagementCleanupWorker;
import ai.salesmax.call.recon.ReconWorker;
import ai.salesmax.call.recon.RecordingReconWorker;
import ai.salesmax.util.Prefs;
import android.content.Context;
import android.net.Uri;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.User;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wee implements ytb {

    /* renamed from: a */
    public static final C17826a f51856a = new C17826a(null);

    /* renamed from: b */
    public static wee f51857b = new wee();

    /* renamed from: o.wee$a */
    public static final class C17826a {
        public C17826a() {
        }

        public /* synthetic */ C17826a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final wee m54267a() {
            return wee.f51857b;
        }
    }

    /* renamed from: o.wee$b */
    public static final class C17827b implements rl7 {

        /* renamed from: a */
        public static final C17827b f51858a = new C17827b();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.wee$c */
    public static final class C17828c implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ vtb f51859a;

        public C17828c(vtb vtbVar) {
            this.f51859a = vtbVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(mii miiVar) throws Throwable {
            Data.Builder builder = new Data.Builder();
            Account accountM39156f = miiVar.m39156f();
            Data.Builder builderPutString = builder.putString("accountId", accountM39156f != null ? accountM39156f.getId() : null);
            User userM39171u = miiVar.m39171u();
            Data dataBuild = builderPutString.putString("userId", userM39171u != null ? userM39171u.getId() : null).putBoolean("immediate", true).build();
            sq8.m48648g(dataBuild, "build(...)");
            Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            sbj sbjVar = sbj.f45162a;
            mbj mbjVar = mbj.CALL_RECONCILIATION;
            OneTimeWorkRequest.Builder constraints = new OneTimeWorkRequest.Builder(CallReconWorker.class).setInputData(dataBuild).setConstraints(constraintsBuild);
            BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OneTimeWorkRequest.Builder builderAddTag = constraints.setBackoffCriteria(backoffPolicy, 10000L, timeUnit).addTag(mbjVar.name());
            OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            builderAddTag.setExpedited(outOfQuotaPolicy);
            OneTimeWorkRequest oneTimeWorkRequestBuild = builderAddTag.build();
            OneTimeWorkRequest.Builder builderAddTag2 = new OneTimeWorkRequest.Builder(RecordingReconWorker.class).setInputData(dataBuild).setConstraints(constraintsBuild).setBackoffCriteria(backoffPolicy, 10000L, timeUnit).addTag(mbj.RECORDING_RECONCILIATION.name());
            builderAddTag2.setExpedited(outOfQuotaPolicy);
            OneTimeWorkRequest oneTimeWorkRequestBuild2 = builderAddTag2.build();
            OneTimeWorkRequest.Builder builderAddTag3 = new OneTimeWorkRequest.Builder(EngagementCleanupWorker.class).setInputData(dataBuild).setConstraints(Constraints.NONE).setBackoffCriteria(backoffPolicy, 10000L, timeUnit).addTag(mbj.ENGAGEMENT_CLEANUP.name());
            builderAddTag3.setExpedited(outOfQuotaPolicy);
            OneTimeWorkRequest oneTimeWorkRequestBuild3 = builderAddTag3.build();
            sbj sbjVar2 = sbj.f45162a;
            Context contextM53408b = this.f51859a.m53408b();
            sq8.m48646e(contextM53408b);
            Operation operationM48141c = sbj.m48141c(sbjVar2, "RECONCILIATION_CHAIN", contextM53408b, null, new OneTimeWorkRequest[]{oneTimeWorkRequestBuild, oneTimeWorkRequestBuild2, oneTimeWorkRequestBuild3}, 4, null);
            zfa result = operationM48141c != null ? operationM48141c.getResult() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("Result of worker registration is: ");
            sb.append(result);
        }
    }

    /* renamed from: o.wee$d */
    public static final class C17829d implements gu3 {

        /* renamed from: a */
        public static final C17829d f51860a = new C17829d();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    static {
        ztb.f57673d.m59891a(f51857b);
    }

    /* renamed from: e */
    public static /* synthetic */ Operation m54263e(wee weeVar, Context context, Constraints constraints, Data data, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
        }
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy2 = existingPeriodicWorkPolicy;
        if ((i & 16) != 0) {
            j = 2;
        }
        return weeVar.m54265d(context, constraints, data, existingPeriodicWorkPolicy2, j);
    }

    @Override // p001o.ytb
    /* renamed from: b */
    public void mo19750b(vtb vtbVar) {
        sq8.m48649h(vtbVar, "networkEvent");
        if (vtbVar.m53407a() && vtbVar.m53409c()) {
            sq8.m48648g(uni.LB().y0(i5f.m31599c()).h0(of0.m42164c()).d0(C17827b.f51858a).v0(new C17828c(vtbVar), C17829d.f51860a), "subscribe(...)");
        }
    }

    /* renamed from: c */
    public final void m54264c(Context context) {
        sq8.m48649h(context, "context");
        sbj.f45162a.m48142a(context, mbj.RECONCILIATION);
    }

    /* renamed from: d */
    public final Operation m54265d(Context context, Constraints constraints, Data data, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, long j) {
        sbj sbjVar = sbj.f45162a;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        mbj mbjVar = mbj.RECONCILIATION;
        PeriodicWorkRequest periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ReconWorker.class, 15L, timeUnit).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).setInputData(data).setConstraints(constraints).setInitialDelay(j, timeUnit).addTag(mbjVar.name()).build();
        WorkManager workManager = WorkManager.getInstance(context);
        sq8.m48648g(workManager, "getInstance(...)");
        Operation operationEnqueueUniquePeriodicWork = workManager.enqueueUniquePeriodicWork(mbjVar.name(), existingPeriodicWorkPolicy, periodicWorkRequestBuild);
        sq8.m48648g(operationEnqueueUniquePeriodicWork, "enqueueUniquePeriodicWork(...)");
        return operationEnqueueUniquePeriodicWork;
    }

    /* renamed from: f */
    public final void m54266f(Context context, String str, String str2, Prefs prefs, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy) {
        Uri uriM3252n;
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "accountId");
        sq8.m48649h(str2, "userId");
        sq8.m48649h(existingPeriodicWorkPolicy, "existingPeriodicWorkPolicy");
        StringBuilder sb = new StringBuilder();
        sb.append("going to register recon with accountId: ");
        sb.append(str);
        sb.append(" and for user: ");
        sb.append(str2);
        boolean z = true;
        if (!(prefs != null && prefs.m3251m()) || (prefs.m3252n() == null && prefs.m3253o() == null)) {
            z = false;
        }
        Data dataBuild = new Data.Builder().putString("accountId", str).putString("userId", str2).putString("recordingRootUri", (prefs == null || (uriM3252n = prefs.m3252n()) == null) ? null : uriM3252n.toString()).putString("recordingStorage", prefs != null ? prefs.m3253o() : null).putBoolean("recordingEnabled", z).build();
        sq8.m48648g(dataBuild, "build(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Data passed for processing: ");
        sb2.append(dataBuild);
        zfa result = m54263e(this, context, new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build(), dataBuild, existingPeriodicWorkPolicy, 0L, 16, null).getResult();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Result of worker registration is: ");
        sb3.append(result);
    }
}
