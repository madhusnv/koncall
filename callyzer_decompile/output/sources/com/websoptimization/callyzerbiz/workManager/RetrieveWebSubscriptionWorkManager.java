package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ao.c0;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4492e;
import po.C5984e;
import rn.h0;
import tx.InterfaceC7266z;
import wo.C8134s;
import xm.y2;
import yv.C8803r;
import yv.C8805t;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RetrieveWebSubscriptionWorkManager extends CoroutineWorker {

    /* renamed from: a */
    public final Context f7486a;

    /* renamed from: b */
    public final C8805t f7487b;

    /* renamed from: c */
    public final C8803r f7488c;

    /* renamed from: d */
    public final C4492e f7489d;

    /* renamed from: e */
    public final h0 f7490e;

    /* renamed from: f */
    public final c0 f7491f;

    /* renamed from: g */
    public final C8134s f7492g;

    /* renamed from: h */
    public final C9000c f7493h;

    /* renamed from: i */
    public final InterfaceC7266z f7494i;

    /* renamed from: j */
    public final C5984e f7495j;

    /* renamed from: k */
    public final y2 f7496k;

    /* renamed from: l */
    public final String f7497l;

    /* renamed from: m */
    public final boolean f7498m;

    /* renamed from: n */
    public final boolean f7499n;

    /* renamed from: o */
    public final String f7500o;

    /* renamed from: p */
    public final boolean f7501p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrieveWebSubscriptionWorkManager(Context context, WorkerParameters workerParams, C8805t traceLogs, C8803r networkUtil, C4492e detectSubscriptionUseCase, h0 callRecordingUseCase, c0 fetchCallLogUseCase, C8134s syncCallLogUseCase, C9000c workManagerUseCase, InterfaceC7266z ioScope, C5984e notificationUseCase, y2 deviceSettingRepository) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        AbstractC4154l.m8923f(networkUtil, "networkUtil");
        AbstractC4154l.m8923f(detectSubscriptionUseCase, "detectSubscriptionUseCase");
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(fetchCallLogUseCase, "fetchCallLogUseCase");
        AbstractC4154l.m8923f(syncCallLogUseCase, "syncCallLogUseCase");
        AbstractC4154l.m8923f(workManagerUseCase, "workManagerUseCase");
        AbstractC4154l.m8923f(ioScope, "ioScope");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        AbstractC4154l.m8923f(deviceSettingRepository, "deviceSettingRepository");
        this.f7486a = context;
        this.f7487b = traceLogs;
        this.f7488c = networkUtil;
        this.f7489d = detectSubscriptionUseCase;
        this.f7490e = callRecordingUseCase;
        this.f7491f = fetchCallLogUseCase;
        this.f7492g = syncCallLogUseCase;
        this.f7493h = workManagerUseCase;
        this.f7494i = ioScope;
        this.f7495j = notificationUseCase;
        this.f7496k = deviceSettingRepository;
        this.f7497l = "RetrieveWebSubscriptionWorkManager";
        this.f7498m = getInputData().m13365b("isSubscriptionLogs");
        this.f7499n = getInputData().m13365b("isSubscriptionInIdle");
        this.f7500o = getInputData().m13367d("simInSubscriptionUpdate");
        this.f7501p = getInputData().m13365b("isSubscriptionNotifications");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (wx.c1.m15379j((wx.InterfaceC8209j) r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5051a(com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof aw.C0486z
            if (r0 == 0) goto L13
            r0 = r7
            aw.z r0 = (aw.C0486z) r0
            int r1 = r0.f3469c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3469c = r1
            goto L18
        L13:
            aw.z r0 = new aw.z
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3467a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3469c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            og.od.m10798c(r7)
            goto L46
        L36:
            og.od.m10798c(r7)
            ao.c0 r7 = r6.f7491f
            java.lang.String r2 = r6.f7497l
            r0.f3469c = r4
            java.lang.Object r7 = r7.m1394i(r2, r0)
            if (r7 != r1) goto L46
            goto L57
        L46:
            wx.j r7 = (wx.InterfaceC8209j) r7
            ao.k r2 = new ao.k
            r4 = 0
            r5 = 5
            r2.<init>(r6, r4, r5)
            r0.f3469c = r3
            java.lang.Object r6 = wx.c1.m15379j(r7, r2, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager.m5051a(com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r14.m16471g(r9) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5052b(com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager.m5052b(com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5053c(mm.C4802m r29, ww.AbstractC8193c r30) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager.m5053c(mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public final void m5054d(String str) {
        if (this.f7498m) {
            this.f7487b.m16231f(this.f7497l + " >>> " + str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
    
        if (r15 != r1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:82:0x017c, B:91:0x019d, B:92:0x01a2, B:85:0x0188, B:86:0x018c, B:88:0x0192, B:21:0x004a, B:79:0x016f, B:22:0x004f, B:43:0x00c5, B:45:0x00c9, B:46:0x00e2, B:48:0x00e6, B:51:0x00ed, B:54:0x00f7, B:25:0x0058, B:74:0x0156, B:76:0x015c, B:26:0x005d, B:58:0x011a, B:60:0x011e, B:61:0x0127, B:63:0x012d, B:65:0x013e, B:67:0x0143, B:69:0x0147, B:73:0x0150, B:94:0x01a7, B:32:0x009d, B:34:0x00a5, B:37:0x00b2, B:40:0x00b9, B:55:0x010f), top: B:98:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:82:0x017c, B:91:0x019d, B:92:0x01a2, B:85:0x0188, B:86:0x018c, B:88:0x0192, B:21:0x004a, B:79:0x016f, B:22:0x004f, B:43:0x00c5, B:45:0x00c9, B:46:0x00e2, B:48:0x00e6, B:51:0x00ed, B:54:0x00f7, B:25:0x0058, B:74:0x0156, B:76:0x015c, B:26:0x005d, B:58:0x011a, B:60:0x011e, B:61:0x0127, B:63:0x012d, B:65:0x013e, B:67:0x0143, B:69:0x0147, B:73:0x0150, B:94:0x01a7, B:32:0x009d, B:34:0x00a5, B:37:0x00b2, B:40:0x00b9, B:55:0x010f), top: B:98:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:82:0x017c, B:91:0x019d, B:92:0x01a2, B:85:0x0188, B:86:0x018c, B:88:0x0192, B:21:0x004a, B:79:0x016f, B:22:0x004f, B:43:0x00c5, B:45:0x00c9, B:46:0x00e2, B:48:0x00e6, B:51:0x00ed, B:54:0x00f7, B:25:0x0058, B:74:0x0156, B:76:0x015c, B:26:0x005d, B:58:0x011a, B:60:0x011e, B:61:0x0127, B:63:0x012d, B:65:0x013e, B:67:0x0143, B:69:0x0147, B:73:0x0150, B:94:0x01a7, B:32:0x009d, B:34:0x00a5, B:37:0x00b2, B:40:0x00b9, B:55:0x010f), top: B:98:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:82:0x017c, B:91:0x019d, B:92:0x01a2, B:85:0x0188, B:86:0x018c, B:88:0x0192, B:21:0x004a, B:79:0x016f, B:22:0x004f, B:43:0x00c5, B:45:0x00c9, B:46:0x00e2, B:48:0x00e6, B:51:0x00ed, B:54:0x00f7, B:25:0x0058, B:74:0x0156, B:76:0x015c, B:26:0x005d, B:58:0x011a, B:60:0x011e, B:61:0x0127, B:63:0x012d, B:65:0x013e, B:67:0x0143, B:69:0x0147, B:73:0x0150, B:94:0x01a7, B:32:0x009d, B:34:0x00a5, B:37:0x00b2, B:40:0x00b9, B:55:0x010f), top: B:98:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:82:0x017c, B:91:0x019d, B:92:0x01a2, B:85:0x0188, B:86:0x018c, B:88:0x0192, B:21:0x004a, B:79:0x016f, B:22:0x004f, B:43:0x00c5, B:45:0x00c9, B:46:0x00e2, B:48:0x00e6, B:51:0x00ed, B:54:0x00f7, B:25:0x0058, B:74:0x0156, B:76:0x015c, B:26:0x005d, B:58:0x011a, B:60:0x011e, B:61:0x0127, B:63:0x012d, B:65:0x013e, B:67:0x0143, B:69:0x0147, B:73:0x0150, B:94:0x01a7, B:32:0x009d, B:34:0x00a5, B:37:0x00b2, B:40:0x00b9, B:55:0x010f), top: B:98:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(uw.InterfaceC7559c r15) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager.doWork(uw.c):java.lang.Object");
    }
}
