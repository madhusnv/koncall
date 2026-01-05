package xm;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import hn.C2987d;
import kotlin.jvm.internal.AbstractC4154l;
import pg.o6;
import vx.C7806h;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r3 {

    /* renamed from: h */
    public static final wx.m1 f40777h = wx.c1.m15372c(new a3(null, null, null));

    /* renamed from: i */
    public static Leads f40778i;

    /* renamed from: j */
    public static final C7806h f40779j;

    /* renamed from: k */
    public static final wx.v0 f40780k;

    /* renamed from: l */
    public static final wx.m1 f40781l;

    /* renamed from: a */
    public final C2987d f40782a;

    /* renamed from: b */
    public final gn.x2 f40783b;

    /* renamed from: c */
    public final y5 f40784c;

    /* renamed from: d */
    public final wx.w0 f40785d;

    /* renamed from: e */
    public final C8810d f40786e;

    /* renamed from: f */
    public final Context f40787f;

    /* renamed from: g */
    public final C8805t f40788g;

    static {
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        f40779j = c7806hM11805a;
        C0496f c0496f = tx.m0.f34659a;
        f40780k = wx.c1.m15390u(wx.c1.m15389t(c7806hM11805a), tx.c0.m13479b(ExecutorC0495e.f3538c));
        f40781l = wx.c1.m15372c(null);
    }

    public r3(C2987d remoteDataSource, gn.x2 localDataSource, y5 simDetailRepository, wx.w0 w0Var, C8810d c8810d, Context context, C8805t c8805t) {
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(simDetailRepository, "simDetailRepository");
        this.f40782a = remoteDataSource;
        this.f40783b = localDataSource;
        this.f40784c = simDetailRepository;
        this.f40785d = w0Var;
        this.f40786e = c8810d;
        this.f40787f = context;
        this.f40788g = c8805t;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15602a(rm.C6571c r6, ww.AbstractC8193c r7) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15602a(rm.c, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15603b(rm.C6571c r6, ww.AbstractC8193c r7) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15603b(rm.c, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15604c(j$.time.LocalDateTime r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xm.d3
            if (r0 == 0) goto L13
            r0 = r7
            xm.d3 r0 = (xm.d3) r0
            int r1 = r0.f40224c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40224c = r1
            goto L18
        L13:
            xm.d3 r0 = new xm.d3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40222a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40224c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            og.od.m10798c(r7)
            r0.f40224c = r3
            gn.x2 r7 = r5.f40783b
            r7.getClass()
            yv.o r2 = yv.C8800o.f42459a
            java.lang.String r6 = yv.C8800o.m16212u(r6)
            an.h3 r7 = r7.f14941a
            z7.w r7 = r7.f899a
            an.v1 r2 = new an.v1
            r4 = 2
            r2.<init>(r6, r4)
            r6 = 0
            java.lang.Object r7 = og.pe.m10839n(r0, r7, r3, r6, r2)
            if (r7 != r1) goto L51
            return r1
        L51:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L5a
            int r6 = r7.intValue()
            goto L5b
        L5a:
            r6 = -1
        L5b:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15604c(j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15605d(rm.C6569a r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15605d(rm.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15606e(com.websoptimization.callyzerbiz.data.model.request.GetLeadByNumberRequest r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15606e(com.websoptimization.callyzerbiz.data.model.request.GetLeadByNumberRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15607f(com.websoptimization.callyzerbiz.data.model.request.LeadCallHistoryRequest r8, ww.AbstractC8193c r9) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15607f(com.websoptimization.callyzerbiz.data.model.request.LeadCallHistoryRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15608g(com.websoptimization.callyzerbiz.data.model.request.LeadSummaryRequest r6, ww.AbstractC8193c r7) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15608g(com.websoptimization.callyzerbiz.data.model.request.LeadSummaryRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15609h(com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadListRequest r10, java.lang.String r11, ww.AbstractC8193c r12) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15609h(com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadListRequest, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[PHI: r10
      0x0067: PHI (r10v1 boolean) = (r10v0 boolean), (r10v2 boolean) binds: [B:20:0x0047, B:25:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[PHI: r10
      0x0072: PHI (r10v3 boolean) = (r10v1 boolean), (r10v2 boolean), (r10v8 boolean) binds: [B:27:0x006f, B:25:0x0065, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15610i(boolean r10, ww.AbstractC8193c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof xm.l3
            if (r0 == 0) goto L13
            r0 = r11
            xm.l3 r0 = (xm.l3) r0
            int r1 = r0.f40537d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40537d = r1
            goto L18
        L13:
            xm.l3 r0 = new xm.l3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f40535b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40537d
            r3 = 0
            gn.x2 r4 = r9.f40783b
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L44
            if (r2 == r7) goto L3e
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            og.od.m10798c(r11)
            return r11
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            boolean r10 = r0.f40534a
            og.od.m10798c(r11)
            goto L72
        L3e:
            boolean r10 = r0.f40534a
            og.od.m10798c(r11)
            goto L5f
        L44:
            og.od.m10798c(r11)
            if (r10 != 0) goto L67
            r0.f40534a = r10
            r0.f40537d = r7
            an.i5 r11 = r4.f14947g
            z7.w r11 = r11.f945a
            ad.h r2 = new ad.h
            r8 = 26
            r2.<init>(r8)
            java.lang.Object r11 = og.pe.m10839n(r0, r11, r7, r3, r2)
            if (r11 != r1) goto L5f
            goto L87
        L5f:
            java.util.List r11 = (java.util.List) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L72
        L67:
            r0.f40534a = r10
            r0.f40537d = r6
            java.lang.Object r11 = r9.m15615n(r0)
            if (r11 != r1) goto L72
            goto L87
        L72:
            r0.f40534a = r10
            r0.f40537d = r5
            an.i5 r10 = r4.f14947g
            z7.w r10 = r10.f945a
            ad.h r11 = new ad.h
            r2 = 26
            r11.<init>(r2)
            java.lang.Object r10 = og.pe.m10839n(r0, r10, r7, r3, r11)
            if (r10 != r1) goto L88
        L87:
            return r1
        L88:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15610i(boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15611j(com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadListRequest r7, java.lang.String r8, ww.AbstractC8193c r9) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15611j(com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadListRequest, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15612k(com.websoptimization.callyzerbiz.data.model.request.TotalDueLeadRequest r6, ww.AbstractC8193c r7) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15612k(com.websoptimization.callyzerbiz.data.model.request.TotalDueLeadRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15613l(com.websoptimization.callyzerbiz.data.model.request.CheckLeadSoftDeleteRequest r8, ww.AbstractC8193c r9) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15613l(com.websoptimization.callyzerbiz.data.model.request.CheckLeadSoftDeleteRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15614m(com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest r10, boolean r11, ww.AbstractC8193c r12) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15614m(com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: Exception -> 0x0036, TRY_ENTER, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0032, B:20:0x0043, B:32:0x0080, B:35:0x0088, B:37:0x0095, B:38:0x00aa, B:40:0x00b0, B:41:0x00cb, B:50:0x00ed, B:52:0x0107, B:55:0x010d, B:57:0x0127, B:21:0x0047, B:27:0x005a, B:29:0x0062, B:24:0x004e), top: B:61:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0032, B:20:0x0043, B:32:0x0080, B:35:0x0088, B:37:0x0095, B:38:0x00aa, B:40:0x00b0, B:41:0x00cb, B:50:0x00ed, B:52:0x0107, B:55:0x010d, B:57:0x0127, B:21:0x0047, B:27:0x005a, B:29:0x0062, B:24:0x004e), top: B:61:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15615n(ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.r3.m15615n(ww.c):java.lang.Object");
    }
}
