package ai.salesmax.call.recon;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.fge;
import p001o.h4e;
import p001o.h96;
import p001o.id5;
import p001o.ke1;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.q83;
import p001o.rc7;
import p001o.sq8;
import p001o.ta6;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes.dex */
public final class EngagementCleanupWorker extends CoroutineWorker {
    private static final String TAG = "engagement-cleanup-worker";
    private final Context context;
    private final WorkerParameters workerParameters;
    public static final C0066a Companion = new C0066a(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.call.recon.EngagementCleanupWorker$a */
    public static final class C0066a {
        public C0066a() {
        }

        public /* synthetic */ C0066a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.call.recon.EngagementCleanupWorker$b */
    public static final class C0067b extends o64 {

        /* renamed from: a */
        public Object f272a;

        /* renamed from: b */
        public Object f273b;

        /* renamed from: c */
        public Object f274c;

        /* renamed from: d */
        public Object f275d;

        /* renamed from: e */
        public Object f276e;

        /* renamed from: f */
        public Object f277f;

        /* renamed from: g */
        public Object f278g;

        /* renamed from: h */
        public /* synthetic */ Object f279h;

        /* renamed from: s */
        public int f281s;

        public C0067b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f279h = obj;
            this.f281s |= Integer.MIN_VALUE;
            return EngagementCleanupWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngagementCleanupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
    }

    private final void removeCallLogs() {
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        if (ke1VarM35525a != null) {
            ke1VarM35525a.m35510l(h4e.f26198a.m29809g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeEngagements(ke1 ke1Var, boolean z, long j, n64 n64Var) {
        List listM35521w = ke1Var != null ? ke1Var.m35521w(j) : null;
        Integer numM39304d = listM35521w != null ? ml1.m39304d(listM35521w.size()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("engagement fetched count: ");
        sb.append(numM39304d);
        if (listM35521w != null) {
            ArrayList<h96> arrayList = new ArrayList();
            for (Object obj : listM35521w) {
                h96 h96Var = (h96) obj;
                boolean z2 = true;
                if ((!sq8.m48644c(h96Var.m29985D(), ml1.m39301a(true)) || ((!sq8.m48644c(h96Var.m29988G(), ml1.m39301a(true)) || !sq8.m48644c(h96Var.m29983B(), ml1.m39301a(true))) && z && sq8.m48644c(h96Var.m29999c(), "CONNECTED"))) && !staleEngagement(h96Var)) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            for (h96 h96Var2 : arrayList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("removing processed/stale engagements: ");
                sb2.append(h96Var2);
                ke1Var.m35507i(h96Var2);
            }
        }
        return y3i.f54824a;
    }

    private final void removePersistedOutcomes() {
        List listM35520v;
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        if (ke1VarM35525a == null || (listM35520v = ke1VarM35525a.m35520v()) == null) {
            return;
        }
        Iterator it = listM35520v.iterator();
        while (it.hasNext()) {
            ke1VarM35525a.m35509k((ta6) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean staleEngagement(h96 h96Var) {
        boolean z;
        boolean z2;
        long jM29809g = h4e.f26198a.m29809g();
        Long lM30003g = h96Var.m30003g();
        if (lM30003g == null) {
            z = false;
        } else {
            if (lM30003g.longValue() < jM29809g) {
                z = true;
            }
        }
        if (z) {
            Long lM30014r = h96Var.m30014r();
            if (lM30014r == null) {
                z2 = false;
                if (z2) {
                    return true;
                }
            } else {
                if (lM30014r.longValue() < jM29809g) {
                    z2 = true;
                }
                if (z2) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(n64 n64Var) {
        C0067b c0067b;
        long j;
        C0067b c0067b2;
        long jMin;
        boolean z;
        EngagementCleanupWorker engagementCleanupWorker;
        fge fgeVar;
        ke1 ke1Var;
        q83 q83Var;
        String str;
        String str2;
        String str3;
        if (n64Var instanceof C0067b) {
            c0067b = (C0067b) n64Var;
            int i = c0067b.f281s;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0067b.f281s = i - Integer.MIN_VALUE;
            } else {
                c0067b = new C0067b(n64Var);
            }
        }
        C0067b c0067b3 = c0067b;
        Object obj = c0067b3.f279h;
        Object objM51918f = uq8.m51918f();
        int i2 = c0067b3.f281s;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                StringBuilder sb = new StringBuilder();
                sb.append("Worker start for ");
                sb.append("ENGAGEMENT_CLEANUP");
                Data inputData = this.workerParameters.getInputData();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Data passed for processing: ");
                sb2.append(inputData);
                ke1 ke1VarM35525a = ke1.f32003i.m35525a();
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
                long j2 = this.workerParameters.getInputData().getLong("start", System.currentTimeMillis());
                Data inputData2 = this.workerParameters.getInputData();
                h4e h4eVar = h4e.f26198a;
                long j3 = inputData2.getLong("threshold", h4eVar.m29809g());
                boolean z2 = this.workerParameters.getInputData().getBoolean("recordingEnabled", false);
                q83 q83VarM35518t = ke1VarM35525a.m35518t("ENGAGEMENT_CLEANUP", string, string2);
                q83 q83VarM35518t2 = ke1VarM35525a.m35518t("CALL_RECONCILIATION", string, string2);
                fge fgeVar2 = new fge();
                fgeVar2.f23302a = j2;
                if (q83VarM35518t2 != null) {
                    j = j2;
                    c0067b2 = c0067b3;
                    jMin = Math.min(Math.max(q83VarM35518t2.m44966g(), j3), Math.max(j - h4eVar.m29803a(), j3));
                } else {
                    j = j2;
                    c0067b2 = c0067b3;
                    jMin = j;
                }
                if (q83VarM35518t != null) {
                    z = z2;
                    fgeVar2.f23302a = Math.min(Math.max(q83VarM35518t.m44966g(), j3), Math.min(Math.max(j, j3), jMin));
                } else {
                    z = z2;
                }
                boolean z3 = z;
                long jM29809g = h4eVar.m29809g();
                C0067b c0067b4 = c0067b2;
                c0067b4.f272a = this;
                c0067b4.f273b = "ENGAGEMENT_CLEANUP";
                c0067b4.f274c = ke1VarM35525a;
                c0067b4.f275d = string;
                c0067b4.f276e = string2;
                c0067b4.f277f = q83VarM35518t;
                c0067b4.f278g = fgeVar2;
                c0067b4.f281s = 1;
                if (removeEngagements(ke1VarM35525a, z3, jM29809g, c0067b4) == objM51918f) {
                    return objM51918f;
                }
                engagementCleanupWorker = this;
                fgeVar = fgeVar2;
                ke1Var = ke1VarM35525a;
                q83Var = q83VarM35518t;
                str = string2;
                str2 = string;
                str3 = "ENGAGEMENT_CLEANUP";
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fgeVar = (fge) c0067b3.f278g;
                q83 q83Var2 = (q83) c0067b3.f277f;
                String str4 = (String) c0067b3.f276e;
                String str5 = (String) c0067b3.f275d;
                ke1 ke1Var2 = (ke1) c0067b3.f274c;
                String str6 = (String) c0067b3.f273b;
                engagementCleanupWorker = (EngagementCleanupWorker) c0067b3.f272a;
                wre.m54934b(obj);
                str = str4;
                str2 = str5;
                ke1Var = ke1Var2;
                str3 = str6;
                q83Var = q83Var2;
            }
            engagementCleanupWorker.removeCallLogs();
            engagementCleanupWorker.removePersistedOutcomes();
            if (q83Var != null) {
                ke1Var.m35503G(q83.m44960b(q83Var, 0, null, null, null, fgeVar.f23302a, 15, null));
            } else if (ke1Var != null) {
                ke1Var.m35524z(new q83(0, str3, str2, str, fgeVar.f23302a, 1, null));
            }
        } catch (Throwable unused) {
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(n64 n64Var) {
        rc7 rc7Var = rc7.f43371a;
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        return rc7Var.m46509a(applicationContext);
    }
}
