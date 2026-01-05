package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import p020v.a1;
import rw.AbstractC6663m;
import tn.C7174a;
import tx.InterfaceC7266z;
import xm.o4;
import yv.C8803r;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SubmitContactUsFormWorkManager extends CoroutineWorker {

    /* renamed from: a */
    public final C7174a f7502a;

    /* renamed from: b */
    public final C8805t f7503b;

    /* renamed from: c */
    public final C8803r f7504c;

    /* renamed from: d */
    public final o4 f7505d;

    /* renamed from: e */
    public final InterfaceC7266z f7506e;

    /* renamed from: f */
    public final String f7507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitContactUsFormWorkManager(Context context, WorkerParameters workerParams, C7174a contactUsFormUseCase, C8805t traceLogs, C8803r networkState, o4 remoteConfigRepository, InterfaceC7266z ioCoroutineScope) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(contactUsFormUseCase, "contactUsFormUseCase");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        AbstractC4154l.m8923f(networkState, "networkState");
        AbstractC4154l.m8923f(remoteConfigRepository, "remoteConfigRepository");
        AbstractC4154l.m8923f(ioCoroutineScope, "ioCoroutineScope");
        this.f7502a = contactUsFormUseCase;
        this.f7503b = traceLogs;
        this.f7504c = networkState;
        this.f7505d = remoteConfigRepository;
        this.f7506e = ioCoroutineScope;
        this.f7507f = "SubmitContactUsFormWorkManager";
    }

    /* renamed from: a */
    public static final void m5055a(SubmitContactUsFormWorkManager submitContactUsFormWorkManager, List list, StringBuilder sb2) {
        sb2.append("<----- Device Information -----> \n");
        C4802m c4802m = (C4802m) AbstractC6663m.m12743G(list);
        if (c4802m != null) {
            sb2.append("Device Connect Code: ");
            sb2.append(c4802m.f23897i);
            sb2.append("\n");
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            PackageInfo packageInfo = i10 >= 33 ? submitContactUsFormWorkManager.getApplicationContext().getPackageManager().getPackageInfo("com.websoptimization.callyzerbiz", PackageManager.PackageInfoFlags.of(0L)) : submitContactUsFormWorkManager.getApplicationContext().getPackageManager().getPackageInfo("com.websoptimization.callyzerbiz", 0);
            String str = packageInfo.versionName;
            Object objValueOf = i10 >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode);
            sb2.append("Version Name: ");
            sb2.append(str);
            sb2.append("\n");
            sb2.append("Version Code: ");
            sb2.append(objValueOf);
            sb2.append("\n");
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        sb2.append("Model :");
        a1.m14318A(sb2, Build.MODEL, "\n", "Manufacturer: ");
        a1.m14318A(sb2, Build.MANUFACTURER, "\n", "Board: ");
        a1.m14318A(sb2, Build.BOARD, "\n", "Brand: ");
        a1.m14318A(sb2, Build.BRAND, "\n", "Android Version: ");
        a1.m14318A(sb2, Build.VERSION.RELEASE, "\n", "SDK Version: ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\n");
        sb2.append("<------------------------------> \n\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(uw.InterfaceC7559c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof aw.c0
            if (r0 == 0) goto L13
            r0 = r7
            aw.c0 r0 = (aw.c0) r0
            int r1 = r0.f3331c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3331c = r1
            goto L1a
        L13:
            aw.c0 r0 = new aw.c0
            ww.c r7 = (ww.AbstractC8193c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.f3329a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3331c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r7)
            goto L5b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            og.od.m10798c(r7)
            java.lang.String r7 = "start"
            yv.t r2 = r6.f7503b
            java.lang.String r4 = r6.f7507f
            r2.m16232g(r4, r7)
            yv.r r7 = r6.f7504c
            boolean r7 = r7.m16219a()
            if (r7 == 0) goto L61
            aw.d0 r7 = new aw.d0
            r2 = 0
            r7.<init>(r6, r2)
            r4 = 3
            tx.z r5 = r6.f7506e
            tx.g0 r7 = tx.c0.m13482e(r5, r2, r7, r4)
            r0.f3331c = r3
            java.lang.Object r7 = r7.m13563m(r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r7, r0)
            return r7
        L61:
            java.lang.String r7 = "Internet not connected"
            r2.m16232g(r4, r7)
            t8.r r7 = new t8.r
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.SubmitContactUsFormWorkManager.doWork(uw.c):java.lang.Object");
    }
}
