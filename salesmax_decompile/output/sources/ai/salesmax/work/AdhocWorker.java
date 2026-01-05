package ai.salesmax.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p001o.sq8;
import p001o.u60;

/* loaded from: classes2.dex */
public final class AdhocWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdhocWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "appContext");
        sq8.m48649h(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        u60 u60VarOfWorkType;
        if (getInputData().getString("ID") == null) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            sq8.m48648g(resultFailure, "failure(...)");
            return resultFailure;
        }
        String string = getInputData().getString("ADHOC_WORK_TYPE");
        String string2 = getInputData().getString("ADHOC_WORK_INPUT_PARAMS");
        StringBuilder sb = new StringBuilder();
        sb.append("Adhoc work started for ");
        sb.append(string);
        sb.append(" with inputs ");
        sb.append(string2);
        if (string == null || (u60VarOfWorkType = u60.ofWorkType(string)) == null) {
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            sq8.m48646e(resultSuccess);
            return resultSuccess;
        }
        try {
            u60VarOfWorkType.execute(string2);
            ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
            sq8.m48648g(resultSuccess2, "success(...)");
            return resultSuccess2;
        } catch (Exception unused) {
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            sq8.m48648g(resultFailure2, "failure(...)");
            return resultFailure2;
        }
    }
}
