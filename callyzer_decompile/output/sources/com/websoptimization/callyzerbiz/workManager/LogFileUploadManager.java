package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.websoptimization.callyzerbiz.R;
import io.C3330e;
import kn.EnumC4127g;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import po.C5984e;
import t8.C7069o;
import yv.C8805t;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LogFileUploadManager extends CoroutineWorker {

    /* renamed from: a */
    public final Context f7442a;

    /* renamed from: b */
    public final C3330e f7443b;

    /* renamed from: c */
    public final C8805t f7444c;

    /* renamed from: d */
    public final C5984e f7445d;

    /* renamed from: e */
    public final C4494g f7446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogFileUploadManager(Context context, WorkerParameters workerParams, C3330e logfileUploadUseCase, C8805t traceLogs, C5984e notificationUseCase, C4494g sessionConfigurationUseCase) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(logfileUploadUseCase, "logfileUploadUseCase");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        AbstractC4154l.m8923f(sessionConfigurationUseCase, "sessionConfigurationUseCase");
        this.f7442a = context;
        this.f7443b = logfileUploadUseCase;
        this.f7444c = traceLogs;
        this.f7445d = notificationUseCase;
        this.f7446e = sessionConfigurationUseCase;
    }

    /* renamed from: a */
    public static final C7069o m5041a(LogFileUploadManager logFileUploadManager, int i10) {
        Context context = logFileUploadManager.f7442a;
        String string = context.getString(R.string.uploaded___);
        AbstractC4154l.m8922e(string, "getString(...)");
        C5984e c5984e = logFileUploadManager.f7445d;
        String string2 = context.getString(R.string.uploading_log_file);
        AbstractC4154l.m8922e(string2, "getString(...)");
        C9097a c9097aM12016g = C5984e.m12016g(c5984e, 764, string + " " + i10 + "%", string2, EnumC4127g.Normal, null, true, Integer.valueOf(i10), true, null, 560);
        Context applicationContext = logFileUploadManager.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "getApplicationContext(...)");
        return new C7069o(764, c9097aM12016g.m16507a(applicationContext), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(uw.InterfaceC7559c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof aw.C0461a
            if (r0 == 0) goto L13
            r0 = r6
            aw.a r0 = (aw.C0461a) r0
            int r1 = r0.f3306c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3306c = r1
            goto L1a
        L13:
            aw.a r0 = new aw.a
            ww.c r6 = (ww.AbstractC8193c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.f3304a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3306c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            og.od.m10798c(r6)
            ay.f r6 = tx.m0.f34659a
            ay.e r6 = ay.ExecutorC0495e.f3538c
            aw.c r2 = new aw.c
            r4 = 0
            r2.<init>(r5, r4)
            r0.f3306c = r3
            java.lang.Object r6 = tx.c0.m13475K(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.LogFileUploadManager.doWork(uw.c):java.lang.Object");
    }
}
