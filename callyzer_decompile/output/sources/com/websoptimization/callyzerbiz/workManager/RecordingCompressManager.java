package com.websoptimization.callyzerbiz.workManager;

import a9.C0073l;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import aq.C0406i;
import aw.C0465e;
import aw.C0466f;
import aw.C0469i;
import aw.C0470j;
import aw.C0471k;
import aw.C0475o;
import aw.C0476p;
import co.C0984a;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.websoptimization.callyzerbiz.R;
import java.io.File;
import kn.C4121a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4166x;
import ng.C5070u;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.bd;
import og.nd;
import pg.n6;
import pn.C5979e;
import po.C5984e;
import qw.C6366p;
import rn.h0;
import t8.C7069o;
import tx.C7251k;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wo.C8134s;
import wx.k1;
import xm.y5;
import yv.C8787b;
import yv.C8805t;
import zk.C8989c;
import zm.EnumC8993c;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RecordingCompressManager extends CoroutineWorker {

    /* renamed from: r */
    public static boolean f7451r;

    /* renamed from: a */
    public final Context f7452a;

    /* renamed from: b */
    public final C8805t f7453b;

    /* renamed from: c */
    public final h0 f7454c;

    /* renamed from: d */
    public final C5979e f7455d;

    /* renamed from: e */
    public final k1 f7456e;

    /* renamed from: f */
    public final C8134s f7457f;

    /* renamed from: g */
    public final C5984e f7458g;

    /* renamed from: h */
    public final C0984a f7459h;

    /* renamed from: i */
    public y5 f7460i;

    /* renamed from: j */
    public boolean f7461j;

    /* renamed from: k */
    public C9097a f7462k;

    /* renamed from: l */
    public final String f7463l;

    /* renamed from: m */
    public boolean f7464m;

    /* renamed from: n */
    public final C0476p f7465n;

    /* renamed from: o */
    public final int f7466o;

    /* renamed from: p */
    public final C6366p f7467p;

    /* renamed from: q */
    public final C6366p f7468q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingCompressManager(Context context, WorkerParameters workerParams, C8805t traceLogs, h0 callRecordingUseCase, C5979e callHistoryUseCase, k1 networkState, C8134s callSyncCallLogUseCase, C5984e notificationUseCase, C0984a fileIOUseCase) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(callHistoryUseCase, "callHistoryUseCase");
        AbstractC4154l.m8923f(networkState, "networkState");
        AbstractC4154l.m8923f(callSyncCallLogUseCase, "callSyncCallLogUseCase");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        AbstractC4154l.m8923f(fileIOUseCase, "fileIOUseCase");
        this.f7452a = context;
        this.f7453b = traceLogs;
        this.f7454c = callRecordingUseCase;
        this.f7455d = callHistoryUseCase;
        this.f7456e = networkState;
        this.f7457f = callSyncCallLogUseCase;
        this.f7458g = notificationUseCase;
        this.f7459h = fileIOUseCase;
        this.f7463l = "RecordingCompressManager";
        this.f7465n = new C0476p(this);
        this.f7466o = 158;
        this.f7467p = nd.m10782c(new C0465e(0, this));
        this.f7468q = nd.m10782c(new C0466f(0));
    }

    /* renamed from: a */
    public static final boolean m5042a(RecordingCompressManager recordingCompressManager, C4121a c4121a) {
        long j6 = c4121a.f21061h;
        C6366p c6366p = recordingCompressManager.f7468q;
        if (j6 < ((Number) c6366p.getValue()).intValue()) {
            return false;
        }
        recordingCompressManager.m5047f(" CompressManager >>>  The compressed file size larger than " + ((Number) c6366p.getValue()).intValue() + " >> compressedFileSize:=" + c4121a.f21061h + " >>> callRecord:=" + c4121a, null);
        c4121a.f21054a.f23836e = EnumC8993c.LARGE_SIZE;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[Catch: Exception -> 0x01ff, TryCatch #0 {Exception -> 0x01ff, blocks: (B:55:0x00fc, B:57:0x0137, B:58:0x013a, B:59:0x01ae, B:64:0x01b8, B:67:0x01bf, B:62:0x01b3), top: B:111:0x00fc, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8 A[Catch: Exception -> 0x01ff, TryCatch #0 {Exception -> 0x01ff, blocks: (B:55:0x00fc, B:57:0x0137, B:58:0x013a, B:59:0x01ae, B:64:0x01b8, B:67:0x01bf, B:62:0x01b3), top: B:111:0x00fc, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0290 A[Catch: Exception -> 0x0294, TryCatch #8 {Exception -> 0x0294, blocks: (B:85:0x028a, B:87:0x0290, B:90:0x0296), top: B:127:0x028a, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c7 A[Catch: Exception -> 0x02c3, TryCatch #9 {Exception -> 0x02c3, blocks: (B:83:0x0248, B:84:0x026c, B:91:0x02b3, B:98:0x02c7, B:100:0x02ce, B:104:0x02ec, B:54:0x00f3, B:77:0x0201, B:79:0x0226, B:105:0x0320, B:106:0x0327, B:85:0x028a, B:87:0x0290, B:90:0x0296), top: B:129:0x00f3, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cd  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5043b(com.websoptimization.callyzerbiz.workManager.RecordingCompressManager r19, kn.C4121a r20, ww.AbstractC8193c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RecordingCompressManager.m5043b(com.websoptimization.callyzerbiz.workManager.RecordingCompressManager, kn.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5044c(kn.C4121a r5, java.lang.String r6, java.io.File r7, ww.AbstractC8193c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof aw.C0468h
            if (r0 == 0) goto L13
            r0 = r8
            aw.h r0 = (aw.C0468h) r0
            int r1 = r0.f3368f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3368f = r1
            goto L18
        L13:
            aw.h r0 = new aw.h
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f3366d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3368f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.File r7 = r0.f3365c
            java.lang.String r6 = r0.f3364b
            kn.a r5 = r0.f3363a
            og.od.m10798c(r8)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r8)
            r5.f21059f = r6
            mm.b r8 = r5.f21054a
            int r8 = r8.f23832a
            r0.f3363a = r5
            r0.f3364b = r6
            r0.f3365c = r7
            r0.f3368f = r3
            rn.h0 r2 = r4.f7454c
            java.lang.Object r8 = r2.m12614O(r8, r6, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            if (r7 != 0) goto L56
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
        L56:
            r5.f21057d = r7
            long r6 = r7.length()
            r5.f21061h = r6
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RecordingCompressManager.m5044c(kn.a, java.lang.String, java.io.File, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public final Object m5045d(Uri uri, String str, String str2, C4121a c4121a, C0475o c0475o) throws Throwable {
        C4121a c4121a2;
        File file;
        C4166x c4166x;
        InterfaceC7559c interfaceC7559c;
        int iIntValue;
        C0471k c0471k;
        int i10;
        String str3;
        String strM3081d;
        RecordingCompressManager recordingCompressManager = this;
        C7251k c7251k = new C7251k(1, n6.m11797c(c0475o));
        c7251k.m13540p();
        recordingCompressManager.f7453b.m16231f(recordingCompressManager.f7463l + " >>> convertWithFFmpeg >>> started >> " + uri);
        int i11 = 0;
        c7251k.m13542t(new C0469i(i11, c7251k, c4121a, recordingCompressManager));
        try {
            file = new File(str);
            c4166x = new C4166x();
            interfaceC7559c = null;
            iIntValue = ((Number) c0.m13468D(C7565i.f36440a, new C0470j(recordingCompressManager, c4121a, interfaceC7559c, 3))).intValue();
            c4166x.f21162a = iIntValue;
            c0471k = new C0471k(i11, recordingCompressManager, file);
            i10 = 2;
            try {
            } catch (Exception e2) {
                e = e2;
                recordingCompressManager = this;
                c4121a2 = c4121a;
            }
        } catch (Exception e10) {
            e = e10;
            c4121a2 = c4121a;
        }
        if (iIntValue < 2) {
            if (!file.exists()) {
                str3 = str;
                c4121a2 = c4121a;
            } else if (C8787b.m16150a(recordingCompressManager.f7452a, null, str, recordingCompressManager.f7463l, uri, recordingCompressManager.f7453b, 2)) {
                recordingCompressManager.m5047f("file already exists >>>> with same duration as source file, skipping compress process", null);
                c0.m13468D(C7565i.f36440a, new C0406i(recordingCompressManager, c4121a, str, interfaceC7559c, 1));
            } else {
                str3 = str;
                if (c4166x.f21162a < 0) {
                    c4166x.f21162a = 0;
                }
                recordingCompressManager = this;
                c4121a2 = c4121a;
                i10 = 2;
                try {
                    c0.m13468D(C7565i.f36440a, new C0406i(recordingCompressManager, c4121a2, c4166x, interfaceC7559c, 2));
                    c0471k.invoke();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    recordingCompressManager.m5047f("CompressManager >>> caught a exception while compress >>> callRecord:=" + c4121a2, e);
                    recordingCompressManager.f7453b.m16238m("CompressManager >>> caught a exception while compress >>> callRecord:=" + c4121a2, e);
                    c7251k.resumeWith(c4121a2);
                    Object objM13539o = c7251k.m13539o();
                    EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                    return objM13539o;
                }
            }
            String strM10136r = (str2 == null || AbstractC5178p.m10101L(str2) || Integer.parseInt(str2) <= 0 || Integer.parseInt(str2) > 32000) ? "32" : AbstractC5185w.m10136r(str2, "0", "");
            AbstractC4154l.m8920c(uri);
            synchronized (this) {
                strM3081d = FFmpegKitConfig.m3081d(recordingCompressManager.getApplicationContext(), uri);
            }
            String str4 = "-i " + strM3081d + " -vn -ar 22050 -acodec libmp3lame -b:a " + strM10136r + "k " + str3;
            recordingCompressManager.f7453b.m16231f("convertWithFFmpeg >>> executing --> for dt: " + c4121a2.f21054a.f23833b.f23849f);
            C0073l c0073l = new C0073l();
            c0073l.f264a = recordingCompressManager;
            c0073l.f265b = c4121a2;
            c0073l.f266c = c7251k;
            c0073l.f267d = str3;
            c0073l.f268e = uri;
            bd.m10555a(str4, c0073l, new C8989c(i10, recordingCompressManager), new C5070u(recordingCompressManager));
            Object objM13539o2 = c7251k.m13539o();
            EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
            return objM13539o2;
        }
        recordingCompressManager.m5047f("file already exists for " + c4121a.f21054a.f23833b.f23849f + " >>>> already retried for 3 times, real file will be uploaded", null);
        c0.m13468D(C7565i.f36440a, new C0470j(recordingCompressManager, c4121a, interfaceC7559c, i11));
        c0471k.invoke();
        c7251k.resumeWith("complete");
        Object objM13539o22 = c7251k.m13539o();
        EnumC7794a enumC7794a22 = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o22;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[Catch: Exception -> 0x0034, InterruptedException -> 0x0037, ForegroundServiceStartNotAllowedException -> 0x003a, TryCatch #2 {ForegroundServiceStartNotAllowedException -> 0x003a, InterruptedException -> 0x0037, Exception -> 0x0034, blocks: (B:12:0x0030, B:22:0x0045, B:33:0x0072, B:35:0x007a, B:37:0x00a5, B:38:0x00aa, B:40:0x00b2, B:41:0x00b9, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:49:0x00f1, B:48:0x00ef, B:50:0x00f4, B:52:0x010a, B:53:0x010f, B:25:0x004c, B:27:0x0054, B:28:0x005b, B:30:0x0066), top: B:69:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a A[Catch: Exception -> 0x0034, InterruptedException -> 0x0037, ForegroundServiceStartNotAllowedException -> 0x003a, TryCatch #2 {ForegroundServiceStartNotAllowedException -> 0x003a, InterruptedException -> 0x0037, Exception -> 0x0034, blocks: (B:12:0x0030, B:22:0x0045, B:33:0x0072, B:35:0x007a, B:37:0x00a5, B:38:0x00aa, B:40:0x00b2, B:41:0x00b9, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:49:0x00f1, B:48:0x00ef, B:50:0x00f4, B:52:0x010a, B:53:0x010f, B:25:0x004c, B:27:0x0054, B:28:0x005b, B:30:0x0066), top: B:69:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(uw.InterfaceC7559c r13) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RecordingCompressManager.doWork(uw.c):java.lang.Object");
    }

    /* renamed from: e */
    public final C7069o m5046e() {
        Context context = this.f7452a;
        String string = context.getString(R.string.cr_compressing_your_call_recording);
        AbstractC4154l.m8922e(string, "getString(...)");
        C5984e c5984e = this.f7458g;
        int i10 = this.f7466o;
        C9097a c9097aM12018j = C5984e.m12018j(c5984e, i10, null, string, 114);
        this.f7462k = c9097aM12018j;
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 29 ? i11 >= 35 ? new C7069o(i10, c9097aM12018j.m16507a(context), 8192) : new C7069o(i10, c9097aM12018j.m16507a(context), 1) : new C7069o(i10, c9097aM12018j.m16507a(context), 0);
    }

    /* renamed from: f */
    public final void m5047f(String str, Exception exc) {
        String str2 = this.f7463l;
        C8805t c8805t = this.f7453b;
        if (exc == null) {
            c8805t.m16231f(str2 + " >>> " + str);
            return;
        }
        c8805t.m16231f(str2 + " >>> " + str + " -- " + exc);
    }

    /* JADX WARN: Path cross not found for [B:13:0x0031, B:25:0x0060], limit reached: 68 */
    /* JADX WARN: Path cross not found for [B:51:0x013d, B:54:0x0149], limit reached: 68 */
    /* JADX WARN: Path cross not found for [B:54:0x0149, B:51:0x013d], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x017c -> B:65:0x017d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0184 -> B:35:0x00c8). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5048g(java.util.List r17, java.util.List r18, ww.AbstractC8193c r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RecordingCompressManager.m5048g(java.util.List, java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void m5049h(int i10, int i11) {
        C9097a c9097a = this.f7462k;
        if (c9097a != null) {
            this.f7458g.m12025l(C9097a.m16506b(c9097a, null, i11 + "/" + i10, "Compressing Recording", false, null, Integer.valueOf((i11 * 100) / i10), 262131), true);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:131|30|31|133|32) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0334, code lost:
    
        if (r9.m12615P(r0, null, r27, r6) == r7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01e8, code lost:
    
        r5.add(r14);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016b, code lost:
    
        if (m5048g(r0, r3, r6) != r7) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x00e4, B:27:0x00ef], limit reached: 134 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0371 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0334 -> B:110:0x0337). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x012c -> B:53:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0130 -> B:53:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x016b -> B:52:0x016f). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5050i(java.util.List r26, ww.AbstractC8193c r27) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.workManager.RecordingCompressManager.m5050i(java.util.List, ww.c):java.lang.Object");
    }
}
