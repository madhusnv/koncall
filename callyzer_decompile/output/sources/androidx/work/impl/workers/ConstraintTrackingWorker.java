package androidx.work.impl.workers;

import ab.C0084b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: a */
    public final WorkerParameters f2894a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        AbstractC4154l.m8923f(appContext, "appContext");
        AbstractC4154l.m8923f(workerParameters, "workerParameters");
        this.f2894a = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1383a(androidx.work.impl.workers.ConstraintTrackingWorker r9, t8.AbstractC7076v r10, j3.C3553g r11, c9.C0922q r12, ww.AbstractC8193c r13) {
        /*
            boolean r0 = r13 instanceof f9.C2219b
            if (r0 == 0) goto L13
            r0 = r13
            f9.b r0 = (f9.C2219b) r0
            int r1 = r0.f10197c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10197c = r1
            goto L18
        L13:
            f9.b r0 = new f9.b
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r9 = r0.f10195a
            vw.a r13 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r0.f10197c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            og.od.m10798c(r9)
            goto L45
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            og.od.m10798c(r9)
            bs.g r3 = new bs.g
            r7 = 0
            r8 = 3
            r4 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f10197c = r2
            java.lang.Object r9 = tx.c0.m13488k(r3, r0)
            if (r9 != r13) goto L45
            return r13
        L45:
            java.lang.String r10 = "delegate: ListenableWork….cancel()\n        }\n    }"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.m1383a(androidx.work.impl.workers.ConstraintTrackingWorker, t8.v, j3.g, c9.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1384b(androidx.work.impl.workers.ConstraintTrackingWorker r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.m1384b(androidx.work.impl.workers.ConstraintTrackingWorker, ww.c):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(InterfaceC7559c interfaceC7559c) {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC4154l.m8922e(backgroundExecutor, "backgroundExecutor");
        return c0.m13475K(c0.m13492o(backgroundExecutor), new C0084b(this, null, 11), interfaceC7559c);
    }
}
