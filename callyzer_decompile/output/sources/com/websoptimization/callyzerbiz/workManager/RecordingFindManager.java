package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4154l;
import po.C5984e;
import rn.q0;
import tx.InterfaceC7266z;
import yv.C8805t;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RecordingFindManager extends CoroutineWorker {

    /* renamed from: a */
    public final Context f7469a;

    /* renamed from: b */
    public final q0 f7470b;

    /* renamed from: c */
    public final C5984e f7471c;

    /* renamed from: d */
    public final C8805t f7472d;

    /* renamed from: e */
    public final InterfaceC7266z f7473e;

    /* renamed from: f */
    public final String f7474f;

    /* renamed from: g */
    public C9097a f7475g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingFindManager(Context context, WorkerParameters workerParams, q0 findCallRecordingUseCase, C5984e notificationUseCase, C8805t traceLogs, InterfaceC7266z ioScope) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(findCallRecordingUseCase, "findCallRecordingUseCase");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        AbstractC4154l.m8923f(ioScope, "ioScope");
        this.f7469a = context;
        this.f7470b = findCallRecordingUseCase;
        this.f7471c = notificationUseCase;
        this.f7472d = traceLogs;
        this.f7473e = ioScope;
        this.f7474f = "FindRecordingWorkManager";
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (r15 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(uw.InterfaceC7559c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RecordingFindManager.doWork(uw.c):java.lang.Object");
    }
}
