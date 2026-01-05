package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ay.C0496f;
import ay.ExecutorC0495e;
import kotlin.jvm.internal.AbstractC4154l;
import po.C5984e;
import rn.h0;
import tx.c0;
import tx.m0;
import wo.C8134s;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RecordingUploadManager extends CoroutineWorker {

    /* renamed from: a */
    public final Context f7476a;

    /* renamed from: b */
    public final C5984e f7477b;

    /* renamed from: c */
    public final h0 f7478c;

    /* renamed from: d */
    public final C8805t f7479d;

    /* renamed from: e */
    public final C8803r f7480e;

    /* renamed from: f */
    public final C8134s f7481f;

    /* renamed from: g */
    public final int f7482g;

    /* renamed from: h */
    public final String f7483h;

    /* renamed from: i */
    public C9097a f7484i;

    /* renamed from: j */
    public final C8810d f7485j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingUploadManager(Context context, WorkerParameters workerParams, C5984e notificationUseCase, h0 recordingUseCase, C8805t traceLogs, C8803r networkState, C8134s syncCallLogUseCase) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        AbstractC4154l.m8923f(recordingUseCase, "recordingUseCase");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        AbstractC4154l.m8923f(networkState, "networkState");
        AbstractC4154l.m8923f(syncCallLogUseCase, "syncCallLogUseCase");
        this.f7476a = context;
        this.f7477b = notificationUseCase;
        this.f7478c = recordingUseCase;
        this.f7479d = traceLogs;
        this.f7480e = networkState;
        this.f7481f = syncCallLogUseCase;
        this.f7482g = 562;
        this.f7483h = "RecordingUploadManager";
        C0496f c0496f = m0.f34659a;
        this.f7485j = c0.m13479b(ExecutorC0495e.f3538c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:174|48|155|49|(1:51)|54|57|(1:60)) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0493, code lost:
    
        if (r0.m12620n(r1) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x054b, code lost:
    
        if (r0.m12620n(r1) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0295, code lost:
    
        if (r7 != r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
    
        java.util.Objects.toString(r12.f21054a.f23833b.f23849f);
        r0.toString();
        r26.f7479d.m16231f(r26.f7483h + " >>> can not delete corrupt compressed file for : " + r12.f21054a.f23833b.f23849f + " >>> " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0291, code lost:
    
        if (r0 != r6) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x0131, B:46:0x0151], limit reached: 168 */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[PHI: r0 r1 r3 r10 r11 r12 r13 r14
      0x009f: PHI (r0v17 java.lang.Object) = (r0v2 java.lang.Object), (r0v31 java.lang.Object) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r1v10 aw.v) = (r1v2 aw.v), (r1v11 aw.v) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r3v21 int) = (r3v20 int), (r3v23 int) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r10v6 int) = (r10v5 int), (r10v8 int) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r11v4 int) = (r11v3 int), (r11v6 int) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r12v3 kn.a) = (r12v2 kn.a), (r12v5 kn.a) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r13v6 java.util.Iterator) = (r13v5 java.util.Iterator), (r13v16 java.util.Iterator) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r14v9 java.util.List) = (r14v8 java.util.List), (r14v14 java.util.List) binds: [B:25:0x008a, B:65:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x038d  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.util.List] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(uw.InterfaceC7559c r27) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RecordingUploadManager.doWork(uw.c):java.lang.Object");
    }
}
