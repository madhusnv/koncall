package ai.salesmax.util;

import ai.salesmax.model.UploadedFileSummary;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import p001o.gq9;
import p001o.gu3;
import p001o.jyg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class CallRecordUploadWorker extends Worker {

    /* renamed from: ai.salesmax.util.CallRecordUploadWorker$a */
    public static final class C1666a implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f4888a;

        public C1666a(String str) {
            this.f4888a = str;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(UploadedFileSummary uploadedFileSummary) {
            sq8.m48649h(uploadedFileSummary, "v");
            jyg.Y0(this.f4888a, uploadedFileSummary.getId());
        }
    }

    /* renamed from: ai.salesmax.util.CallRecordUploadWorker$b */
    public static final class C1667b implements gu3 {
        public C1667b() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "err");
            CallRecordUploadWorker.this.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRecordUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "appContext");
        sq8.m48649h(workerParameters, "workerParams");
    }

    /* renamed from: a */
    public final void m3210a(String str, String str2) {
        File file = new File(str2);
        gq9.m29280E(file, file.getName(), null).v0(new C1666a(str), new C1667b());
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String string = getInputData().getString("ID");
        if (string == null) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            sq8.m48648g(resultFailure, "failure(...)");
            return resultFailure;
        }
        String string2 = getInputData().getString("CALL_RECORDING_FILE_PATH");
        if (string2 == null) {
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            sq8.m48648g(resultFailure2, "failure(...)");
            return resultFailure2;
        }
        m3210a(string, string2);
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
