package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import yo.C8720d;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ReadContactWorker extends CoroutineWorker {

    /* renamed from: a */
    public final C8720d f7447a;

    /* renamed from: b */
    public final C4494g f7448b;

    /* renamed from: c */
    public final C8805t f7449c;

    /* renamed from: d */
    public final String f7450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadContactWorker(Context context, WorkerParameters workerParams, C8720d readContactUseCase, C4494g sessionConfigurationUseCase, C8805t traceLogs) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(readContactUseCase, "readContactUseCase");
        AbstractC4154l.m8923f(sessionConfigurationUseCase, "sessionConfigurationUseCase");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        this.f7447a = readContactUseCase;
        this.f7448b = sessionConfigurationUseCase;
        this.f7449c = traceLogs;
        this.f7450d = "ReadContactWorker";
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:12:0x003e, B:31:0x00a4, B:33:0x00bc, B:35:0x00c8, B:38:0x00d2), top: B:54:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:12:0x003e, B:31:0x00a4, B:33:0x00bc, B:35:0x00c8, B:38:0x00d2), top: B:54:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(uw.InterfaceC7559c r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.ReadContactWorker.doWork(uw.c):java.lang.Object");
    }
}
