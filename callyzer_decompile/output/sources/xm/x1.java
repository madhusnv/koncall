package xm;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.common.exception.DataNotFoundException;
import com.websoptimization.callyzerbiz.data.model.db.SyncCallLog;
import com.websoptimization.callyzerbiz.data.model.db.SyncCallLogCallRecording;
import fn.C2336i;
import hn.C2987d;
import im.InterfaceC3307i;
import j$.time.LocalDateTime;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;
import nm.C5107b;
import og.nd;
import pg.o6;
import po.C5984e;
import qw.C6366p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vx.C7806h;
import ww.AbstractC8193c;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x1 {

    /* renamed from: k */
    public static final C6366p f40986k = nd.m10782c(new sq.n2(14));

    /* renamed from: l */
    public static final C7806h f40987l;

    /* renamed from: m */
    public static final wx.b1 f40988m;

    /* renamed from: n */
    public static final wx.v0 f40989n;

    /* renamed from: o */
    public static final wx.v0 f40990o;

    /* renamed from: a */
    public final gn.x2 f40991a;

    /* renamed from: b */
    public final C2336i f40992b;

    /* renamed from: c */
    public final C2987d f40993c;

    /* renamed from: d */
    public final C8810d f40994d;

    /* renamed from: e */
    public final InterfaceC7266z f40995e;

    /* renamed from: f */
    public final Context f40996f;

    /* renamed from: g */
    public final C5984e f40997g;

    /* renamed from: h */
    public final y5 f40998h;

    /* renamed from: i */
    public final q4 f40999i;

    /* renamed from: j */
    public final C8805t f41000j;

    static {
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        f40987l = c7806hM11805a;
        wx.b1 b1VarM15371b = wx.c1.m15371b(0, 0, null, 7);
        f40988m = b1VarM15371b;
        f40989n = new wx.v0(b1VarM15371b);
        C0496f c0496f = tx.m0.f34659a;
        f40990o = wx.c1.m15390u(wx.c1.m15389t(c7806hM11805a), tx.c0.m13479b(ExecutorC0495e.f3538c));
    }

    public x1(gn.x2 localDataSource, C2336i dataStoreSource, C2987d remoteDataSource, C8810d c8810d, InterfaceC7266z syncApiScope, Context context, C5984e c5984e, y5 userSIMRepository, q4 sessionConfigurationRepository, C8805t c8805t) {
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        AbstractC4154l.m8923f(syncApiScope, "syncApiScope");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(sessionConfigurationRepository, "sessionConfigurationRepository");
        this.f40991a = localDataSource;
        this.f40992b = dataStoreSource;
        this.f40993c = remoteDataSource;
        this.f40994d = c8810d;
        this.f40995e = syncApiScope;
        this.f40996f = context;
        this.f40997g = c5984e;
        this.f40998h = userSIMRepository;
        this.f40999i = sessionConfigurationRepository;
        this.f41000j = c8805t;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15641a(xm.x1 r4, java.util.List r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof xm.j0
            if (r0 == 0) goto L13
            r0 = r6
            xm.j0 r0 = (xm.j0) r0
            int r1 = r0.f40440c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40440c = r1
            goto L18
        L13:
            xm.j0 r0 = new xm.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40438a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40440c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            og.od.m10798c(r6)
            r0.f40440c = r3
            java.lang.Object r6 = r4.m15671u(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.util.List r6 = (java.util.List) r6
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L60
            java.util.Iterator r5 = r6.iterator()
        L47:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L60
            java.lang.Object r6 = r5.next()
            com.websoptimization.callyzerbiz.data.model.response.CallLogResponse r6 = (com.websoptimization.callyzerbiz.data.model.response.CallLogResponse) r6
            mm.b r6 = r6.f7375a
            if (r6 == 0) goto L47
            java.lang.String r0 = r6.f23838g
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            r4.m15660h(r0, r6)
            goto L47
        L60:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15641a(xm.x1, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15642b(xm.x1 r14, mm.C4802m r15, com.websoptimization.callyzerbiz.data.model.response.CallSyncSubscriptionExpiredResponse r16, ww.AbstractC8193c r17) {
        /*
            r0 = r17
            r14.getClass()
            boolean r1 = r0 instanceof xm.m0
            if (r1 == 0) goto L18
            r1 = r0
            xm.m0 r1 = (xm.m0) r1
            int r2 = r1.f40561e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f40561e = r2
            goto L1d
        L18:
            xm.m0 r1 = new xm.m0
            r1.<init>(r14, r0)
        L1d:
            java.lang.Object r0 = r1.f40559c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40561e
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            mm.m r2 = r1.f40558b
            com.websoptimization.callyzerbiz.data.model.response.CallSyncSubscriptionExpiredResponse r1 = r1.f40557a
            og.od.m10798c(r0)     // Catch: java.lang.Exception -> L31
            goto Lb4
        L31:
            r0 = move-exception
            r5 = r1
            goto L94
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3c:
            og.od.m10798c(r0)
            java.util.Objects.toString(r16)
            java.util.Objects.toString(r15)
            com.websoptimization.callyzerbiz.data.model.response.Subscription r0 = r16.m4766a()
            j$.time.LocalDateTime r3 = r0.m4841b()
            if (r3 == 0) goto Lb4
            j$.time.LocalDateTime r3 = r0.m4840a()
            if (r3 == 0) goto Lb4
            yv.o r3 = yv.C8800o.f42459a
            j$.time.LocalDateTime r3 = r0.m4841b()
            j$.time.LocalDateTime r9 = yv.C8800o.m16210s(r3)
            j$.time.LocalDateTime r0 = r0.m4840a()
            j$.time.LocalDateTime r10 = yv.C8800o.m16210s(r0)
            j$.time.LocalDateTime r0 = r16.m4767b()
            if (r0 != 0) goto L6f
            j$.time.LocalDateTime r0 = r15.f23899k
        L6f:
            r8 = r0
            r12 = 0
            r13 = 8381439(0x7fe3ff, float:1.1744898E-38)
            r6 = 0
            r7 = 0
            r11 = 0
            r5 = r15
            mm.m r3 = mm.C4802m.m9754b(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            gn.x2 r0 = r14.f40991a     // Catch: java.lang.Exception -> L90
            r5 = r16
            r1.f40557a = r5     // Catch: java.lang.Exception -> L8d
            r1.f40558b = r3     // Catch: java.lang.Exception -> L8d
            r1.f40561e = r4     // Catch: java.lang.Exception -> L8d
            java.lang.Object r14 = r0.Q0(r3, r1)     // Catch: java.lang.Exception -> L8d
            if (r14 != r2) goto Lb4
            return r2
        L8d:
            r0 = move-exception
        L8e:
            r2 = r3
            goto L94
        L90:
            r0 = move-exception
            r5 = r16
            goto L8e
        L94:
            r0.printStackTrace()
            yv.t r14 = r14.f41000j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Db error while updating subscription >>> userSim:="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " >>> response := "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "UserSIM error"
            r14.m16232g(r1, r0)
        Lb4:
            qw.a0 r14 = qw.a0.f30746a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15642b(xm.x1, mm.m, com.websoptimization.callyzerbiz.data.model.response.CallSyncSubscriptionExpiredResponse, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:70:0x0129, B:72:0x0131, B:54:0x00df, B:56:0x00e7, B:59:0x00ee, B:61:0x00f8, B:63:0x0100, B:65:0x010c, B:66:0x010f, B:39:0x00a1, B:41:0x00a5, B:45:0x00ba, B:47:0x00c0, B:49:0x00c4, B:51:0x00ce, B:35:0x0098), top: B:81:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:70:0x0129, B:72:0x0131, B:54:0x00df, B:56:0x00e7, B:59:0x00ee, B:61:0x00f8, B:63:0x0100, B:65:0x010c, B:66:0x010f, B:39:0x00a1, B:41:0x00a5, B:45:0x00ba, B:47:0x00c0, B:49:0x00c4, B:51:0x00ce, B:35:0x0098), top: B:81:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7 A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:70:0x0129, B:72:0x0131, B:54:0x00df, B:56:0x00e7, B:59:0x00ee, B:61:0x00f8, B:63:0x0100, B:65:0x010c, B:66:0x010f, B:39:0x00a1, B:41:0x00a5, B:45:0x00ba, B:47:0x00c0, B:49:0x00c4, B:51:0x00ce, B:35:0x0098), top: B:81:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f A[Catch: Exception -> 0x00b7, PHI: r1 r6 r7 r13
      0x010f: PHI (r1v11 boolean) = (r1v9 boolean), (r1v13 boolean), (r1v13 boolean) binds: [B:55:0x00e5, B:50:0x00cc, B:48:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r6v5 mm.b) = (r6v4 mm.b), (r6v7 mm.b), (r6v7 mm.b) binds: [B:55:0x00e5, B:50:0x00cc, B:48:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r7v4 int) = (r7v3 int), (r7v5 int), (r7v5 int) binds: [B:55:0x00e5, B:50:0x00cc, B:48:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r13v11 com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse) = 
      (r13v10 com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse)
      (r13v12 com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse)
      (r13v12 com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse)
     binds: [B:55:0x00e5, B:50:0x00cc, B:48:0x00c2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00b7, blocks: (B:70:0x0129, B:72:0x0131, B:54:0x00df, B:56:0x00e7, B:59:0x00ee, B:61:0x00f8, B:63:0x0100, B:65:0x010c, B:66:0x010f, B:39:0x00a1, B:41:0x00a5, B:45:0x00ba, B:47:0x00c0, B:49:0x00c4, B:51:0x00ce, B:35:0x0098), top: B:81:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131 A[Catch: Exception -> 0x00b7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b7, blocks: (B:70:0x0129, B:72:0x0131, B:54:0x00df, B:56:0x00e7, B:59:0x00ee, B:61:0x00f8, B:63:0x0100, B:65:0x010c, B:66:0x010f, B:39:0x00a1, B:41:0x00a5, B:45:0x00ba, B:47:0x00c0, B:49:0x00c4, B:51:0x00ce, B:35:0x0098), top: B:81:0x0098 }] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15643c(xm.x1 r17, com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse r18, ww.AbstractC8193c r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15643c(xm.x1, com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bd -> B:31:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c2 -> B:32:0x00bf). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15644d(xm.x1 r16, java.util.List r17, ww.AbstractC8193c r18) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15644d(xm.x1, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:36|(1:95)|37|(2:38|(2:40|(2:110|42)(1:111))(2:109|43))|44|(2:46|(5:48|49|103|50|(1:118)(19:53|105|54|(4:56|57|34|(5:86|88|(1:90)|91|92)(0))|58|59|93|71|72|99|73|74|101|75|(1:119)|85|57|34|(0)(0)))(15:66|59|93|71|72|99|73|74|101|75|(0)|85|57|34|(0)(0)))(3:67|68|69)|62|63|70|58|59|93|71|72|99|73|74|101|75|(0)|85|57|34|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:36|95|37|(2:38|(2:40|(2:110|42)(1:111))(2:109|43))|44|(2:46|(5:48|49|103|50|(1:118)(19:53|105|54|(4:56|57|34|(5:86|88|(1:90)|91|92)(0))|58|59|93|71|72|99|73|74|101|75|(1:119)|85|57|34|(0)(0)))(15:66|59|93|71|72|99|73|74|101|75|(0)|85|57|34|(0)(0)))(3:67|68|69)|62|63|70|58|59|93|71|72|99|73|74|101|75|(0)|85|57|34|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:48|49|103|50|(1:118)(19:53|105|54|(4:56|57|34|(5:86|88|(1:90)|91|92)(0))|58|59|93|71|72|99|73|74|101|75|(1:119)|85|57|34|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0169, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0115 -> B:57:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0161 -> B:85:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x016c -> B:85:0x0185). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15645e(xm.x1 r21, java.util.List r22, com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest r23, ww.AbstractC8193c r24) throws com.websoptimization.callyzerbiz.common.exception.DataNotFoundException {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15645e(xm.x1, java.util.List, com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r19v0, types: [xm.x1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15646f(xm.x1 r19, java.util.List r20, com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest r21, ww.AbstractC8193c r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15646f(xm.x1, java.util.List, com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257  */
    /* JADX WARN: Type inference failed for: r15v10, types: [tx.b0, uw.c, uw.h] */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest, com.websoptimization.callyzerbiz.data.model.response.SyncResponse, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest, com.websoptimization.callyzerbiz.data.model.response.SyncResponse, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, xm.x1] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15647g(xm.x1 r24, com.websoptimization.callyzerbiz.data.model.response.SyncResponse r25, com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest r26, ww.AbstractC8193c r27) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15647g(xm.x1, com.websoptimization.callyzerbiz.data.model.response.SyncResponse, com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest, ww.c):java.lang.Object");
    }

    /* renamed from: j */
    public static SyncCallLogCallRecording m15648j(List list, C5107b c5107b) throws DataNotFoundException {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SyncCallLogCallRecording) next).m4628e(c5107b)) {
                break;
            }
        }
        SyncCallLogCallRecording syncCallLogCallRecording = (SyncCallLogCallRecording) next;
        if (syncCallLogCallRecording != null) {
            return syncCallLogCallRecording;
        }
        throw new DataNotFoundException("No data found with passed parameters:= " + c5107b);
    }

    /* renamed from: l */
    public static SyncCallLog m15649l(List syncRequestCallLogsList, C5107b c5107b) throws DataNotFoundException {
        Object next;
        AbstractC4154l.m8923f(syncRequestCallLogsList, "syncRequestCallLogsList");
        Iterator it = syncRequestCallLogsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SyncCallLog) next).m4622d(c5107b)) {
                break;
            }
        }
        SyncCallLog syncCallLog = (SyncCallLog) next;
        if (syncCallLog != null) {
            return syncCallLog;
        }
        throw new DataNotFoundException("syncRequestCallLog not matched with given details >>> passed details := " + c5107b);
    }

    /* renamed from: A */
    public final Object m15650A(int i10, String str, LocalDateTime localDateTime, AbstractC8193c abstractC8193c) {
        return tx.c0.m13475K(this.f40994d.f42488a, new o1(i10, 0, str, localDateTime, null, this), abstractC8193c);
    }

    /* renamed from: B */
    public final void m15651B(InterfaceC3307i interfaceC3307i) {
        tx.c0.m13502y(this.f40994d, null, null, new C4032f(interfaceC3307i, (InterfaceC7559c) null, 21), 3);
    }

    /* renamed from: C */
    public final void m15652C(im.t1 t1Var) {
        tx.c0.m13502y(this.f40994d, null, null, new C4032f(t1Var, (InterfaceC7559c) null, 22), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15653D(com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest r10, ww.AbstractC8193c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof xm.q1
            if (r0 == 0) goto L13
            r0 = r11
            xm.q1 r0 = (xm.q1) r0
            int r1 = r0.f40732f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40732f = r1
            goto L18
        L13:
            xm.q1 r0 = new xm.q1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f40730d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40732f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            dy.a r10 = r0.f40728b
            og.od.m10798c(r11)     // Catch: java.lang.Throwable -> L2d
            goto L7a
        L2d:
            r11 = move-exception
            goto L84
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            int r10 = r0.f40729c
            dy.a r2 = r0.f40728b
            com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest r4 = r0.f40727a
            og.od.m10798c(r11)
            r11 = r2
            r2 = r10
            r10 = r4
            goto L5b
        L44:
            og.od.m10798c(r11)
            dy.a r11 = ug.C7451v.m14153a()
            r0.f40727a = r10
            r0.f40728b = r11
            r2 = 0
            r0.f40729c = r2
            r0.f40732f = r4
            java.lang.Object r4 = r11.mo1768h(r0)
            if (r4 != r1) goto L5b
            goto L76
        L5b:
            tx.z r4 = r9.f40995e     // Catch: java.lang.Throwable -> L80
            uw.h r4 = r4.mo1865w()     // Catch: java.lang.Throwable -> L80
            o6.s0 r6 = new o6.s0     // Catch: java.lang.Throwable -> L80
            r7 = 23
            r6.<init>(r9, r10, r5, r7)     // Catch: java.lang.Throwable -> L80
            r0.f40727a = r5     // Catch: java.lang.Throwable -> L80
            r0.f40728b = r11     // Catch: java.lang.Throwable -> L80
            r0.f40729c = r2     // Catch: java.lang.Throwable -> L80
            r0.f40732f = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = tx.c0.m13475K(r4, r6, r0)     // Catch: java.lang.Throwable -> L80
            if (r10 != r1) goto L77
        L76:
            return r1
        L77:
            r8 = r11
            r11 = r10
            r10 = r8
        L7a:
            im.k1 r11 = (im.k1) r11     // Catch: java.lang.Throwable -> L2d
            r10.mo1769j(r5)
            return r11
        L80:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L84:
            r10.mo1769j(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15653D(com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15654E(com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest r10, ww.AbstractC8193c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof xm.r1
            if (r0 == 0) goto L13
            r0 = r11
            xm.r1 r0 = (xm.r1) r0
            int r1 = r0.f40772f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40772f = r1
            goto L18
        L13:
            xm.r1 r0 = new xm.r1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f40770d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40772f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            dy.a r10 = r0.f40768b
            og.od.m10798c(r11)     // Catch: java.lang.Throwable -> L2d
            goto L79
        L2d:
            r11 = move-exception
            goto L83
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            int r10 = r0.f40769c
            dy.a r2 = r0.f40768b
            com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest r4 = r0.f40767a
            og.od.m10798c(r11)
            r11 = r2
            r2 = r10
            r10 = r4
            goto L5b
        L44:
            og.od.m10798c(r11)
            dy.a r11 = ug.C7451v.m14153a()
            r0.f40767a = r10
            r0.f40768b = r11
            r2 = 0
            r0.f40769c = r2
            r0.f40772f = r4
            java.lang.Object r4 = r11.mo1768h(r0)
            if (r4 != r1) goto L5b
            goto L75
        L5b:
            tx.z r4 = r9.f40995e     // Catch: java.lang.Throwable -> L7f
            uw.h r4 = r4.mo1865w()     // Catch: java.lang.Throwable -> L7f
            xm.s1 r6 = new xm.s1     // Catch: java.lang.Throwable -> L7f
            r7 = 0
            r6.<init>(r9, r10, r5, r7)     // Catch: java.lang.Throwable -> L7f
            r0.f40767a = r5     // Catch: java.lang.Throwable -> L7f
            r0.f40768b = r11     // Catch: java.lang.Throwable -> L7f
            r0.f40769c = r2     // Catch: java.lang.Throwable -> L7f
            r0.f40772f = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r10 = tx.c0.m13475K(r4, r6, r0)     // Catch: java.lang.Throwable -> L7f
            if (r10 != r1) goto L76
        L75:
            return r1
        L76:
            r8 = r11
            r11 = r10
            r10 = r8
        L79:
            im.k1 r11 = (im.k1) r11     // Catch: java.lang.Throwable -> L2d
            r10.mo1769j(r5)
            return r11
        L7f:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L83:
            r10.mo1769j(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15654E(com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15655F(com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest r24, ww.AbstractC8193c r25) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15655F(com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (r1 == r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15656G(java.util.List r19, java.util.List r20, ww.AbstractC8193c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15656G(java.util.List, java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: H */
    public final Object m15657H(C4791b c4791b, AbstractC8193c abstractC8193c) {
        return tx.c0.m13475K(this.f40994d.f42488a, new i0(this, c4791b, null, 1), abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:27:0x0072, B:29:0x007a), top: B:38:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15658I(kn.C4121a r8, ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof xm.v1
            if (r0 == 0) goto L13
            r0 = r9
            xm.v1 r0 = (xm.v1) r0
            int r1 = r0.f40930f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40930f = r1
            goto L18
        L13:
            xm.v1 r0 = new xm.v1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f40928d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40930f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            dy.a r8 = r0.f40926b
            kn.a r0 = r0.f40925a
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r9 = move-exception
            goto L8f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            int r8 = r0.f40927c
            dy.a r2 = r0.f40926b
            kn.a r4 = r0.f40925a
            og.od.m10798c(r9)
            r9 = r2
            r2 = r8
            r8 = r4
            goto L5d
        L46:
            og.od.m10798c(r9)
            dy.a r9 = ug.C7451v.m14153a()
            r0.f40925a = r8
            r0.f40926b = r9
            r2 = 0
            r0.f40927c = r2
            r0.f40930f = r4
            java.lang.Object r4 = r9.mo1768h(r0)
            if (r4 != r1) goto L5d
            goto L6d
        L5d:
            gn.x2 r4 = r7.f40991a     // Catch: java.lang.Throwable -> L8b
            r0.f40925a = r8     // Catch: java.lang.Throwable -> L8b
            r0.f40926b = r9     // Catch: java.lang.Throwable -> L8b
            r0.f40927c = r2     // Catch: java.lang.Throwable -> L8b
            r0.f40930f = r3     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r4.D0(r8, r0)     // Catch: java.lang.Throwable -> L8b
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L87
            yx.d r1 = r7.f40994d     // Catch: java.lang.Throwable -> L2f
            u7.a r2 = new u7.a     // Catch: java.lang.Throwable -> L2f
            r3 = 26
            r2.<init>(r7, r0, r5, r3)     // Catch: java.lang.Throwable -> L2f
            r0 = 3
            tx.c0.m13502y(r1, r5, r5, r2, r0)     // Catch: java.lang.Throwable -> L2f
        L87:
            r8.mo1769j(r5)
            return r9
        L8b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L8f:
            r8.mo1769j(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15658I(kn.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15659J(int r5, zm.EnumC8993c r6, boolean r7, ww.AbstractC8193c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof xm.w1
            if (r0 == 0) goto L13
            r0 = r8
            xm.w1 r0 = (xm.w1) r0
            int r1 = r0.f40959e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40959e = r1
            goto L18
        L13:
            xm.w1 r0 = new xm.w1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f40957c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40959e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r7 = r0.f40956b
            int r5 = r0.f40955a
            og.od.m10798c(r8)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r8)
            r0.f40955a = r5
            r0.f40956b = r7
            r0.f40959e = r3
            gn.x2 r8 = r4.f40991a
            java.lang.Object r6 = r8.H0(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            if (r7 == 0) goto L53
            xm.r0 r6 = new xm.r0
            r7 = 0
            r6.<init>(r4, r5, r7)
            r5 = 3
            yx.d r8 = r4.f40994d
            tx.c0.m13502y(r8, r7, r7, r6, r5)
        L53:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15659J(int, zm.c, boolean, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void m15660h(String str, C4791b c4791b) {
        if (str.length() <= 0) {
            Objects.toString(c4791b);
            return;
        }
        File file = new File(str);
        if (!file.isFile() || !file.exists()) {
            Objects.toString(c4791b);
            return;
        }
        if (file.delete()) {
            tx.c0.m13502y(this.f40994d, null, null, new i0(this, c4791b, null, 0), 3);
        } else {
            this.f41000j.m16232g("processSyncApiResponse", "compress file doesn't delete for this callLog , callLog := " + c4791b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:28:0x007d). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15661i(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof xm.n0
            if (r0 == 0) goto L13
            r0 = r9
            xm.n0 r0 = (xm.n0) r0
            int r1 = r0.f40606g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40606g = r1
            goto L18
        L13:
            xm.n0 r0 = new xm.n0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f40604e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40606g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            int r2 = r0.f40603d
            java.util.List r4 = r0.f40602c
            java.util.Iterator r6 = r0.f40601b
            java.util.List r7 = r0.f40600a
            og.od.m10798c(r9)
            goto L7d
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.util.List r2 = r0.f40600a
            og.od.m10798c(r9)
            goto L52
        L41:
            java.util.ArrayList r2 = i0.m0.m7386s(r9)
            r0.f40600a = r2
            r0.f40606g = r4
            xm.y5 r9 = r8.f40998h
            java.lang.Object r9 = r9.m15696l(r0)
            if (r9 != r1) goto L52
            goto L7b
        L52:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r6 = r9
            r4 = r2
            r2 = r5
        L5b:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L84
            java.lang.Object r9 = r6.next()
            mm.m r9 = (mm.C4802m) r9
            java.lang.String r9 = r9.f23891c
            if (r9 == 0) goto L5b
            r0.f40600a = r4
            r0.f40601b = r6
            r0.f40602c = r4
            r0.f40603d = r2
            r0.f40606g = r3
            java.lang.Object r9 = r8.m15663m(r9, r0)
            if (r9 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r7 = r4
        L7d:
            java.util.Collection r9 = (java.util.Collection) r9
            r4.addAll(r9)
            r4 = r7
            goto L5b
        L84:
            java.util.Iterator r9 = r4.iterator()
        L88:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r9.next()
            com.websoptimization.callyzerbiz.data.model.db.SyncCallLogCallRecording r0 = (com.websoptimization.callyzerbiz.data.model.db.SyncCallLogCallRecording) r0
            zm.c r0 = r0.m4624a()
            zm.c r1 = zm.EnumC8993c.SUCCESS
            if (r0 != r1) goto L88
            int r5 = r5 + 1
            goto L88
        L9f:
            im.r1 r9 = new im.r1
            r9.<init>(r5)
            r8.m15652C(r9)
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15661i(ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public final Object m15662k(int i10, AbstractC8193c abstractC8193c) {
        return this.f40991a.f14941a.m483i(i10, abstractC8193c);
    }

    /* renamed from: m */
    public final Object m15663m(String str, AbstractC8193c abstractC8193c) {
        return tx.c0.m13475K(this.f40994d.f42488a, new q0(str, this, (InterfaceC7559c) null, 1), abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15664n(rm.C6571c r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.s0
            if (r0 == 0) goto L13
            r0 = r6
            xm.s0 r0 = (xm.s0) r0
            int r1 = r0.f40801c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40801c = r1
            goto L18
        L13:
            xm.s0 r0 = new xm.s0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40799a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40801c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            r0.f40801c = r3
            hn.d r6 = r4.f40993c
            ym.a r6 = r6.f16127a
            java.util.LinkedHashMap r5 = r5.m321I()
            java.lang.Object r6 = r6.m16076i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            im.f1 r6 = (im.f1) r6
            boolean r5 = r6 instanceof im.d1
            if (r5 == 0) goto L56
            im.d1 r6 = (im.d1) r6
            java.lang.Object r5 = r6.f17545a
            com.websoptimization.callyzerbiz.data.model.response.BaseResponse r5 = (com.websoptimization.callyzerbiz.data.model.response.BaseResponse) r5
            java.lang.Object r5 = r5.m4732a()
            com.websoptimization.callyzerbiz.data.model.response.FeatureStatusResponse r5 = (com.websoptimization.callyzerbiz.data.model.response.FeatureStatusResponse) r5
            return r5
        L56:
            com.websoptimization.callyzerbiz.common.exception.RestApiException r5 = r6.m7640a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Error in getting feature status "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            yv.t r6 = r4.f41000j
            java.lang.String r0 = "getCustomerFeatureStatus"
            r6.m16232g(r0, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15664n(rm.c, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15665o(ww.AbstractC8193c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15665o(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15666p(java.util.List r11, mm.C4802m r12, ww.AbstractC8193c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15666p(java.util.List, mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:28|(1:66)|29|30|62|31|(4:34|64|35|(3:37|(1:40)|(6:43|44|45|55|26|(2:56|57)(0)))(4:49|55|26|(0)(0)))|42) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        r2 = r13;
        r3 = r14;
        r5 = r15;
        r13 = r12;
        r12 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f1, blocks: (B:35:0x00bd, B:37:0x00c1), top: B:64:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e3 -> B:44:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f3 -> B:55:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0104 -> B:45:0x00e7). Please report as a decompilation issue!!! */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15667q(java.util.List r19, mm.C4802m r20, ww.AbstractC8193c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15667q(java.util.List, mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15668r(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.z0
            if (r0 == 0) goto L13
            r0 = r6
            xm.z0 r0 = (xm.z0) r0
            int r1 = r0.f41084d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41084d = r1
            goto L18
        L13:
            xm.z0 r0 = new xm.z0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f41082b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f41084d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f41081a
            og.od.m10798c(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f41081a = r5
            r0.f41084d = r3
            fn.i r6 = r4.f40992b
            km.a r6 = r6.f10585a
            java.lang.String r2 = "is_call_recording_attach_through_external_activity"
            km.o r6 = (km.C4120o) r6
            java.lang.Object r6 = r6.m8879a(r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L64
            yv.f r6 = yv.C8791f.f42457a
            boolean r6 = yv.C8791f.m16171d(r5)
            if (r6 == 0) goto L64
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            java.lang.String r6 = "com.google.android.dialer.files"
            boolean r5 = nx.AbstractC5178p.m10116x(r5, r6, r0)
            if (r5 == 0) goto L64
            goto L65
        L64:
            r3 = r0
        L65:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15668r(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:54:0x00d5, B:56:0x00dd, B:58:0x00e3, B:40:0x0098, B:42:0x009d, B:46:0x00b3, B:48:0x00b9, B:50:0x00c3), top: B:80:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:54:0x00d5, B:56:0x00dd, B:58:0x00e3, B:40:0x0098, B:42:0x009d, B:46:0x00b3, B:48:0x00b9, B:50:0x00c3), top: B:80:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:54:0x00d5, B:56:0x00dd, B:58:0x00e3, B:40:0x0098, B:42:0x009d, B:46:0x00b3, B:48:0x00b9, B:50:0x00c3), top: B:80:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3 A[Catch: Exception -> 0x00b0, PHI: r5 r6 r7 r16
      0x00e3: PHI (r5v3 mm.b) = (r5v6 mm.b), (r5v8 mm.b), (r5v8 mm.b) binds: [B:57:0x00e2, B:47:0x00b7, B:49:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r6v2 int) = (r6v3 int), (r6v4 int), (r6v4 int) binds: [B:57:0x00e2, B:47:0x00b7, B:49:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r7v8 com.websoptimization.callyzerbiz.data.model.response.CallLogResponse) = 
      (r7v18 com.websoptimization.callyzerbiz.data.model.response.CallLogResponse)
      (r7v19 com.websoptimization.callyzerbiz.data.model.response.CallLogResponse)
      (r7v20 com.websoptimization.callyzerbiz.data.model.response.CallLogResponse)
     binds: [B:57:0x00e2, B:47:0x00b7, B:49:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r16v6 boolean) = (r16v7 boolean), (r16v9 boolean), (r16v9 boolean) binds: [B:57:0x00e2, B:47:0x00b7, B:49:0x00c1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:54:0x00d5, B:56:0x00dd, B:58:0x00e3, B:40:0x0098, B:42:0x009d, B:46:0x00b3, B:48:0x00b9, B:50:0x00c3), top: B:80:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105 A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #5 {Exception -> 0x0115, blocks: (B:62:0x00fd, B:64:0x0105), top: B:88:0x00fd }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r17v0, types: [xm.x1] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15669s(com.websoptimization.callyzerbiz.data.model.response.CallLogResponse r18, ww.AbstractC8193c r19) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15669s(com.websoptimization.callyzerbiz.data.model.response.CallLogResponse, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15670t(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof xm.d1
            if (r0 == 0) goto L13
            r0 = r8
            xm.d1 r0 = (xm.d1) r0
            int r1 = r0.f40218e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40218e = r1
            goto L18
        L13:
            xm.d1 r0 = new xm.d1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f40216c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40218e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            im.p1 r1 = r0.f40215b
            xm.q4 r0 = r0.f40214a
            og.od.m10798c(r8)
            goto L58
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            og.od.m10798c(r8)
            im.p1 r8 = im.p1.NOT_VERIFIED_CALL_COUNT
            xm.q4 r2 = r7.f40999i
            r0.f40214a = r2
            r0.f40215b = r8
            r0.f40218e = r3
            gn.x2 r4 = r7.f40991a
            an.g4 r4 = r4.f14958r
            z7.w r4 = r4.f860a
            ad.h r5 = new ad.h
            r6 = 13
            r5.<init>(r6)
            r6 = 0
            java.lang.Object r0 = og.pe.m10839n(r0, r4, r3, r6, r5)
            if (r0 != r1) goto L55
            return r1
        L55:
            r1 = r8
            r8 = r0
            r0 = r2
        L58:
            r0.m15601a(r1, r8)
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15670t(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:25:0x0066, B:22:0x0052, B:27:0x006e), top: B:31:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0063 -> B:25:0x0066). Please report as a decompilation issue!!! */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15671u(java.util.List r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof xm.e1
            if (r0 == 0) goto L13
            r0 = r10
            xm.e1 r0 = (xm.e1) r0
            int r1 = r0.f40242g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40242g = r1
            goto L18
        L13:
            xm.e1 r0 = new xm.e1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f40240e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40242g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.f40239d
            com.websoptimization.callyzerbiz.data.model.response.CallLogResponse r2 = r0.f40238c
            java.util.Iterator r4 = r0.f40237b
            java.util.List r5 = r0.f40236a
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L2f
            goto L66
        L2f:
            r10 = move-exception
            goto L72
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.util.ArrayList r10 = i0.m0.m7386s(r10)
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r4 = r9
            r5 = r10
            r9 = r2
        L45:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L8f
            java.lang.Object r10 = r4.next()
            r2 = r10
            com.websoptimization.callyzerbiz.data.model.response.CallLogResponse r2 = (com.websoptimization.callyzerbiz.data.model.response.CallLogResponse) r2
            r0.getClass()     // Catch: java.lang.Exception -> L2f
            r0.f40236a = r5     // Catch: java.lang.Exception -> L2f
            r0.f40237b = r4     // Catch: java.lang.Exception -> L2f
            r0.f40238c = r2     // Catch: java.lang.Exception -> L2f
            r0.f40239d = r9     // Catch: java.lang.Exception -> L2f
            r0.f40242g = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r10 = r8.m15669s(r2, r0)     // Catch: java.lang.Exception -> L2f
            if (r10 != r1) goto L66
            return r1
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L2f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Exception -> L2f
            if (r10 == 0) goto L45
            r5.add(r2)     // Catch: java.lang.Exception -> L2f
            goto L45
        L72:
            r10.printStackTrace()
            java.lang.String r2 = r10.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "exception occurred >>> reason :"
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            yv.t r6 = r8.f41000j
            java.lang.String r7 = "processSyncApiResponse"
            r6.m16233h(r7, r2, r10)
            goto L45
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15671u(java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #3 {Exception -> 0x0037, blocks: (B:13:0x0032, B:38:0x00c3, B:40:0x00cb), top: B:55:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bf -> B:38:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00df -> B:41:0x00d7). Please report as a decompilation issue!!! */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15672v(java.util.List r13, com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15672v(java.util.List, com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|(2:109|13)|89|57|(7:59|60|95|61|62|107|63)(1:70)|71|83|84|25|(7:27|87|28|99|29|(4:32|93|33|(8:35|36|105|37|38|84|25|(2:85|86)(0))(11:43|47|48|97|49|50|51|103|52|53|(9:56|89|57|(0)(0)|71|83|84|25|(0)(0))))|55)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:43|47|48|97|49|50|51|103|52|53|(9:56|89|57|(0)(0)|71|83|84|25|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:27|87|28|99|29|(4:32|93|33|(8:35|36|105|37|38|84|25|(2:85|86)(0))(11:43|47|48|97|49|50|51|103|52|53|(9:56|89|57|(0)(0)|71|83|84|25|(0)(0))))|55) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:59|60|95|61|62|107|63) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:35|36|105|37|38|84|25|(2:85|86)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        r2 = r5;
        r5 = r4;
        r4 = r2;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        r14 = r11;
        r11 = r12;
        r12 = r2;
        r2 = r4;
        r4 = r5;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        r14 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012c, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0155, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #3 {Exception -> 0x00d9, blocks: (B:33:0x00b2, B:35:0x00ba), top: B:93:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116 A[Catch: Exception -> 0x012b, TRY_LEAVE, TryCatch #1 {Exception -> 0x012b, blocks: (B:57:0x010e, B:59:0x0116), top: B:89:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f A[Catch: Exception -> 0x0122, TRY_LEAVE, TryCatch #10 {Exception -> 0x0122, blocks: (B:63:0x011e, B:70:0x012f), top: B:107:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c7 -> B:84:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x010c -> B:89:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0168 -> B:83:0x017a). Please report as a decompilation issue!!! */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15673w(java.util.List r20, com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest r21, ww.AbstractC8193c r22) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15673w(java.util.List, com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15674x(mm.C4802m r9, boolean r10, ww.AbstractC8193c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof xm.k1
            if (r0 == 0) goto L13
            r0 = r11
            xm.k1 r0 = (xm.k1) r0
            int r1 = r0.f40481e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40481e = r1
            goto L18
        L13:
            xm.k1 r0 = new xm.k1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f40479c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40481e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            og.od.m10798c(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            og.od.m10798c(r11)
            return r11
        L3a:
            boolean r10 = r0.f40478b
            mm.m r9 = r0.f40477a
            og.od.m10798c(r11)
            goto L5e
        L42:
            og.od.m10798c(r11)
            java.lang.String r11 = r9.f23891c
            r0.f40477a = r9
            r0.f40478b = r10
            r0.f40481e = r5
            yx.d r2 = r8.f40994d
            uw.h r2 = r2.f42488a
            xm.q0 r5 = new xm.q0
            r7 = 2
            r5.<init>(r8, r11, r6, r7)
            java.lang.Object r11 = tx.c0.m13475K(r2, r5, r0)
            if (r11 != r1) goto L5e
            goto L85
        L5e:
            java.util.List r11 = (java.util.List) r11
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L69
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L69:
            if (r10 == 0) goto L79
            r0.f40477a = r6
            r0.f40478b = r10
            r0.f40481e = r4
            java.lang.Object r9 = r8.m15666p(r11, r9, r0)
            if (r9 != r1) goto L78
            goto L85
        L78:
            return r9
        L79:
            r0.f40477a = r6
            r0.f40478b = r10
            r0.f40481e = r3
            java.lang.Object r9 = r8.m15667q(r11, r9, r0)
            if (r9 != r1) goto L86
        L85:
            return r1
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15674x(mm.m, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:132|193|133|134|225|135|136|207|137|(4:140|187|141|(8:143|144|227|145|146|182|37|(0)(0))(12:152|153|205|161|162|(0)(0)|217|166|167|219|168|(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:121|205|161|162|(1:164)(1:165)|217|166|167|219|168|(6:171|172|181|182|37|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(1:211)|101|102|201|103|104|197|105|106|231|107|(4:110|209|111|(9:113|114|191|115|116|235|182|37|(2:183|184)(0))(11:121|205|161|162|(1:164)(1:165)|217|166|167|219|168|(6:171|172|181|182|37|(0)(0))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:211|101|102|201|103|104|197|105|106|231|107|(4:110|209|111|(9:113|114|191|115|116|235|182|37|(2:183|184)(0))(11:121|205|161|162|(1:164)(1:165)|217|166|167|219|168|(6:171|172|181|182|37|(0)(0))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:58|59|189|68|69|229|70|(1:72)(9:73|74|(0)|223|81|82|215|83|(7:86|87|98|181|182|37|(0)(0)))|233|76|223|81|82|215|83|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:143|144|227|145|146|182|37|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:113|114|191|115|116|235|182|37|(2:183|184)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0514, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0515, code lost:
    
        r15 = r7;
        r7 = r10;
        r17 = r11;
        r11 = r20;
        r10 = r9;
        r9 = r6;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x052c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x052d, code lost:
    
        r7 = r19;
        r17 = r10;
        r10 = r9;
        r9 = r1;
        r1 = r2;
        r2 = r15;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0537, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0538, code lost:
    
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x053b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x053c, code lost:
    
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x053e, code lost:
    
        r10 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x05e5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x05e6, code lost:
    
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x05e8, code lost:
    
        r15 = r10;
        r10 = r9;
        r9 = r6;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x05fe, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05ff, code lost:
    
        r19 = r9;
        r9 = r2;
        r2 = r15;
        r15 = r10;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0606, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0607, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0679, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x067b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x067c, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x040c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x040d, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x040e, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0442, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0443, code lost:
    
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0446, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0447, code lost:
    
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x044a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x044b, code lost:
    
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x044d, code lost:
    
        r24 = r10;
        r10 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0452, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0453, code lost:
    
        r26 = r5;
        r27 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04ed A[Catch: IllegalStateException -> 0x0520, TRY_LEAVE, TryCatch #11 {IllegalStateException -> 0x0520, blocks: (B:111:0x04e5, B:113:0x04ed), top: B:209:0x04e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05b9 A[Catch: Exception -> 0x05ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x05ee, blocks: (B:141:0x05b1, B:143:0x05b9), top: B:187:0x05b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0434  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x05d0 -> B:182:0x06b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x066d -> B:172:0x066f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0686 -> B:181:0x06b1). Please report as a decompilation issue!!! */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15675y(java.util.List r26, com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest r27, ww.AbstractC8193c r28) {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15675y(java.util.List, com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00af -> B:24:0x00b7). Please report as a decompilation issue!!! */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15676z(java.util.List r21, java.lang.String r22, com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest r23, ww.AbstractC8193c r24) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.x1.m15676z(java.util.List, java.lang.String, com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest, ww.c):java.lang.Object");
    }
}
