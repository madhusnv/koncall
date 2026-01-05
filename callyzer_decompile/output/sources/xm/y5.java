package xm;

import b8.C0615j;
import dy.AbstractC1856d;
import dy.C1855c;
import fn.C2336i;
import hn.C2987d;
import im.EnumC3318t;
import java.util.LinkedHashMap;
import java.util.List;
import km.C4111f;
import km.C4120o;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import og.cf;
import og.pe;
import pg.o6;
import rw.C6669s;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8193c;
import wx.C8203d;
import yv.C8791f;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y5 {

    /* renamed from: a */
    public final gn.x2 f41049a;

    /* renamed from: b */
    public final C2336i f41050b;

    /* renamed from: c */
    public final C2987d f41051c;

    /* renamed from: d */
    public final C8810d f41052d;

    /* renamed from: e */
    public final C8805t f41053e;

    /* renamed from: f */
    public final C7806h f41054f;

    /* renamed from: g */
    public EnumC7204p f41055g;

    /* renamed from: h */
    public int f41056h;

    /* renamed from: i */
    public final h2.f0 f41057i;

    /* renamed from: j */
    public final wx.v0 f41058j;

    /* renamed from: k */
    public final C7806h f41059k;

    /* renamed from: l */
    public final wx.v0 f41060l;

    /* renamed from: m */
    public final C7806h f41061m;

    /* renamed from: n */
    public final C8203d f41062n;

    /* renamed from: o */
    public final wx.b1 f41063o;

    /* renamed from: p */
    public final wx.v0 f41064p;

    /* renamed from: q */
    public volatile u4 f41065q;

    /* renamed from: r */
    public final C1855c f41066r;

    /* renamed from: s */
    public volatile List f41067s;

    /* renamed from: t */
    public volatile Object f41068t;

    public y5(C2336i dataStoreSource, gn.x2 localDataSource, C2987d remoteDataSource, C8805t c8805t, C8810d c8810d) {
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        this.f41049a = localDataSource;
        this.f41050b = dataStoreSource;
        this.f41051c = remoteDataSource;
        this.f41052d = c8810d;
        this.f41053e = c8805t;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f41054f = c7806hM11805a;
        this.f41055g = EnumC7204p.DEFAULT;
        C4120o c4120o = (C4120o) dataStoreSource.f10585a;
        c4120o.getClass();
        this.f41057i = new h2.f0(new C4111f(c4120o.m8881c(c4120o.f21052a).getData(), cf.m10582c("filter_lead_sim_selection"), 1), this, 2);
        this.f41058j = wx.c1.m15390u(wx.c1.m15382m(wx.c1.m15389t(c7806hM11805a)), c8810d);
        C7806h c7806hM11805a2 = o6.m11805a(0, null, null, 7);
        this.f41059k = c7806hM11805a2;
        this.f41060l = wx.c1.m15390u(wx.c1.m15382m(wx.c1.m15389t(c7806hM11805a2)), c8810d);
        C7806h c7806hM11805a3 = o6.m11805a(0, null, null, 7);
        this.f41061m = c7806hM11805a3;
        this.f41062n = wx.c1.m15389t(c7806hM11805a3);
        wx.b1 b1VarM15371b = wx.c1.m15371b(0, 0, null, 6);
        this.f41063o = b1VarM15371b;
        this.f41064p = new wx.v0(b1VarM15371b);
        this.f41065q = u4.FROM_VARIABLE;
        this.f41066r = AbstractC1856d.m5490a();
        this.f41068t = C6669s.f31944a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m15679a(xm.y5 r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof xm.o5
            if (r0 == 0) goto L13
            r0 = r7
            xm.o5 r0 = (xm.o5) r0
            int r1 = r0.f40677c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40677c = r1
            goto L18
        L13:
            xm.o5 r0 = new xm.o5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40675a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40677c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            og.od.m10798c(r7)
            xm.u4 r7 = xm.u4.FORCEFULLY_FETCH_AND_UPDATE
            r6.f41065q = r7
            r0.f40677c = r3
            java.lang.Object r7 = r6.m15696l(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            r0 = r7
            java.util.List r0 = (java.util.List) r0
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L52
            com.websoptimization.callyzerbiz.common.exception.SimStateException r6 = new com.websoptimization.callyzerbiz.common.exception.SimStateException
            com.websoptimization.callyzerbiz.common.exception.SimStateException$a r7 = com.websoptimization.callyzerbiz.common.exception.SimStateException.EnumC1456a.NO_CONNECTED_SIM_FOUND
            java.lang.String r0 = "connected SIM found null while getting minimumSubscriptionStartDateTime"
            r6.<init>(r7, r0)
            return r6
        L52:
            java.lang.Exception r6 = new java.lang.Exception
            r4 = 0
            r5 = 62
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            java.lang.String r7 = rw.AbstractC6663m.m12748L(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "Can't get MinimumSubscriptionStartDateTime even SIM is connected, connectedSIM:= "
            java.lang.String r7 = i0.m0.m7378k(r0, r7)
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15679a(xm.y5, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0109, code lost:
    
        if (r10.m15708x(r3, r0) != r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:45:0x00cb, B:47:0x00d1, B:49:0x00d5, B:54:0x00ec, B:56:0x00f2, B:58:0x00f6, B:41:0x00b0, B:37:0x0090), top: B:79:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [xm.y5] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v3, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15680b(xm.y5 r10, java.util.List r11, ww.AbstractC8193c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15680b(xm.y5, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r6v2, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15681c(xm.y5 r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15681c(xm.y5, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f A[PHI: r1 r5 r11
      0x010f: PHI (r1v15 boolean) = (r1v14 boolean), (r1v23 boolean) binds: [B:45:0x00c1, B:65:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r5v10 int) = (r5v8 ??), (r5v11 ??) binds: [B:45:0x00c1, B:65:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r11v3 boolean) = (r11v2 boolean), (r11v4 boolean) binds: [B:45:0x00c1, B:65:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15682A(ww.AbstractC8193c r17) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15682A(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r3.m6039s(r9, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        if (r4.m6039s(r9, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15683B(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof xm.s5
            if (r0 == 0) goto L13
            r0 = r9
            xm.s5 r0 = (xm.s5) r0
            int r1 = r0.f40836d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40836d = r1
            goto L18
        L13:
            xm.s5 r0 = new xm.s5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f40834b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40836d
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 == r5) goto L32
            if (r2 != r3) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            int r0 = r0.f40833a
            og.od.m10798c(r9)
            goto L8f
        L38:
            og.od.m10798c(r9)
            goto L48
        L3c:
            og.od.m10798c(r9)
            r0.f40836d = r4
            java.lang.Enum r9 = r8.m15698n(r0)
            if (r9 != r1) goto L48
            goto La5
        L48:
            tq.p r9 = (tq.EnumC7204p) r9
            java.util.List r2 = r8.f41067s
            kotlin.jvm.internal.AbstractC4154l.m8920c(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r2.next()
            r7 = r6
            mm.m r7 = (mm.C4802m) r7
            boolean r7 = r7.f23902n
            if (r7 == 0) goto L58
            r4.add(r6)
            goto L58
        L6d:
            int r2 = r4.size()
            if (r2 != r5) goto L91
            tq.p r4 = tq.EnumC7204p.DEFAULT
            if (r9 == r4) goto L7b
            tq.p r6 = r8.f41055g
            if (r9 == r6) goto L91
        L7b:
            if (r9 != r4) goto L7f
            tq.p r9 = tq.EnumC7204p.ALL
        L7f:
            r8.f41055g = r9
            fn.i r3 = r8.f41050b
            r0.f40833a = r2
            r0.f40836d = r5
            java.lang.Object r9 = r3.m6039s(r9, r0)
            if (r9 != r1) goto L8e
            goto La5
        L8e:
            r0 = r2
        L8f:
            r2 = r0
            goto La6
        L91:
            int r9 = r8.f41056h
            if (r9 == r2) goto La6
            tq.p r9 = tq.EnumC7204p.DEFAULT
            r8.f41055g = r9
            fn.i r4 = r8.f41050b
            r0.f40833a = r2
            r0.f40836d = r3
            java.lang.Object r9 = r4.m6039s(r9, r0)
            if (r9 != r1) goto L8e
        La5:
            return r1
        La6:
            r8.f41056h = r2
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15683B(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15684C(java.lang.String r8, boolean r9, j$.time.LocalDateTime r10, j$.time.LocalDateTime r11, ww.AbstractC8193c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof xm.u5
            if (r0 == 0) goto L14
            r0 = r12
            xm.u5 r0 = (xm.u5) r0
            int r1 = r0.f40911g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40911g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xm.u5 r0 = new xm.u5
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f40909e
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f40911g
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            boolean r9 = r6.f40908d
            j$.time.LocalDateTime r11 = r6.f40907c
            j$.time.LocalDateTime r10 = r6.f40906b
            java.lang.String r8 = r6.f40905a
            og.od.m10798c(r12)
            goto L57
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            og.od.m10798c(r12)
            r6.f40905a = r8
            r6.f40906b = r10
            r6.f40907c = r11
            r6.f40908d = r9
            r6.f40911g = r2
            gn.x2 r1 = r7.f41049a
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.O0(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L53
            return r0
        L53:
            r8 = r2
            r9 = r3
            r10 = r4
            r11 = r5
        L57:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 != 0) goto L78
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "updateRecordingFeature for "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = " >>> failed to update recording subscription feature in db"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            yv.t r9 = r7.f41053e
            r9.m16231f(r8)
            goto Lac
        L78:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "updateRecordingFeature "
            r12.<init>(r0)
            r12.append(r8)
            java.lang.String r8 = " >>> updated recording subscription feature to "
            r12.append(r8)
            r12.append(r9)
            java.lang.String r8 = " in db with dates ["
            r12.append(r8)
            r12.append(r10)
            java.lang.String r8 = ", "
            r12.append(r8)
            r12.append(r11)
            java.lang.String r8 = "]"
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.String r9 = "UserSimRepository"
            int r8 = android.util.Log.d(r9, r8)
            ww.AbstractC8196f.m15349b(r8)
        Lac:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15684C(java.lang.String, boolean, j$.time.LocalDateTime, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15685D(java.lang.String r5, j$.time.LocalDateTime r6, j$.time.LocalDateTime r7, ww.AbstractC8193c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof xm.x5
            if (r0 == 0) goto L13
            r0 = r8
            xm.x5 r0 = (xm.x5) r0
            int r1 = r0.f41023f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41023f = r1
            goto L18
        L13:
            xm.x5 r0 = new xm.x5
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f41021d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f41023f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            j$.time.LocalDateTime r7 = r0.f41020c
            j$.time.LocalDateTime r6 = r0.f41019b
            java.lang.String r5 = r0.f41018a
            og.od.m10798c(r8)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r8)
            r0.f41018a = r5
            r0.f41019b = r6
            r0.f41020c = r7
            r0.f41023f = r3
            gn.x2 r8 = r4.f41049a
            java.lang.Object r8 = r8.S0(r5, r6, r7, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L6a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "updateSyncSubscriptionFeature for "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " >>> failed to update sync subscription feature in db"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            yv.t r6 = r4.f41053e
            r6.m16231f(r5)
            goto L96
        L6a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "updateSyncSubscriptionFeature "
            r8.<init>(r0)
            r8.append(r5)
            java.lang.String r5 = " >>> updated sync subscription feature in db to ["
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = ", "
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = "]"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r6 = "UserSimRepository"
            int r5 = android.util.Log.d(r6, r5)
            ww.AbstractC8196f.m15349b(r5)
        L96:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15685D(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15686E(java.lang.String r8, boolean r9, j$.time.LocalDateTime r10, j$.time.LocalDateTime r11, ww.AbstractC8193c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof xm.w5
            if (r0 == 0) goto L14
            r0 = r12
            xm.w5 r0 = (xm.w5) r0
            int r1 = r0.f40976f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40976f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xm.w5 r0 = new xm.w5
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f40974d
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f40976f
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            j$.time.LocalDateTime r11 = r6.f40973c
            j$.time.LocalDateTime r10 = r6.f40972b
            java.lang.String r8 = r6.f40971a
            og.od.m10798c(r12)
            goto L52
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            og.od.m10798c(r12)
            r6.f40971a = r8
            r6.f40972b = r10
            r6.f40973c = r11
            r6.f40976f = r2
            gn.x2 r1 = r7.f41049a
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.T0(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L4f
            return r0
        L4f:
            r8 = r2
            r10 = r4
            r11 = r5
        L52:
            java.lang.Number r12 = (java.lang.Number) r12
            int r9 = r12.intValue()
            if (r9 != 0) goto L73
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "updateSyncSubscriptionFeature for "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = " >>> failed to update sync subscription feature in db"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            yv.t r9 = r7.f41053e
            r9.m16231f(r8)
            goto L9f
        L73:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "updateSyncSubscriptionFeature "
            r9.<init>(r12)
            r9.append(r8)
            java.lang.String r8 = " >>> updated sync subscription feature in db to ["
            r9.append(r8)
            r9.append(r10)
            java.lang.String r8 = ", "
            r9.append(r8)
            r9.append(r11)
            java.lang.String r8 = "]"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "UserSimRepository"
            int r8 = android.util.Log.d(r9, r8)
            ww.AbstractC8196f.m15349b(r8)
        L9f:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15686E(java.lang.String, boolean, j$.time.LocalDateTime, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* renamed from: F */
    public final Object m15687F(C4802m c4802m, AbstractC8193c abstractC8193c) throws Throwable {
        Object objM13475K = tx.c0.m13475K(this.f41052d.f42488a, new l5(this, c4802m, null, 1), abstractC8193c);
        return objM13475K == EnumC7794a.COROUTINE_SUSPENDED ? objM13475K : qw.a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[PHI: r11
      0x0091: PHI (r11v3 im.j) = (r11v2 im.j), (r11v8 im.j) binds: [B:35:0x008e, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[PHI: r11
      0x00a8: PHI (r11v4 im.j) = (r11v3 im.j), (r11v9 im.j) binds: [B:41:0x00a5, B:19:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15688d(im.EnumC3308j r11, ww.AbstractC8193c r12) {
        /*
            r10 = this;
            qw.a0 r0 = qw.a0.f30746a
            boolean r1 = r12 instanceof xm.v4
            if (r1 == 0) goto L15
            r1 = r12
            xm.v4 r1 = (xm.v4) r1
            int r2 = r1.f40942d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f40942d = r2
            goto L1a
        L15:
            xm.v4 r1 = new xm.v4
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.f40940b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40942d
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L57
            if (r3 == r9) goto L51
            if (r3 == r8) goto L4b
            if (r3 == r7) goto L45
            if (r3 == r6) goto L3e
            if (r3 != r5) goto L36
            og.od.m10798c(r12)
            return r0
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            im.j r11 = r1.f40939a
            og.od.m10798c(r12)
            goto La8
        L45:
            im.j r11 = r1.f40939a
            og.od.m10798c(r12)
            goto L91
        L4b:
            im.j r11 = r1.f40939a
            og.od.m10798c(r12)
            goto L7a
        L51:
            im.j r11 = r1.f40939a
            og.od.m10798c(r12)
            goto L65
        L57:
            og.od.m10798c(r12)
            r1.f40939a = r11
            r1.f40942d = r9
            java.lang.Object r12 = r10.m15689e(r1)
            if (r12 != r2) goto L65
            goto Lb7
        L65:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lb8
            tq.p r12 = tq.EnumC7204p.DEFAULT
            r1.f40939a = r11
            r1.f40942d = r8
            java.lang.Object r12 = r10.m15708x(r12, r1)
            if (r12 != r2) goto L7a
            goto Lb7
        L7a:
            fn.i r12 = r10.f41050b
            r1.f40939a = r11
            r1.f40942d = r7
            km.a r12 = r12.f10585a
            java.lang.String r3 = "app_status"
            km.o r12 = (km.C4120o) r12
            java.lang.Object r12 = r12.m8887i(r3, r4, r1)
            if (r12 != r2) goto L8d
            goto L8e
        L8d:
            r12 = r0
        L8e:
            if (r12 != r2) goto L91
            goto Lb7
        L91:
            fn.i r12 = r10.f41050b
            r1.f40939a = r11
            r1.f40942d = r6
            km.a r12 = r12.f10585a
            java.lang.String r3 = "sim_state_change"
            km.o r12 = (km.C4120o) r12
            java.lang.Object r12 = r12.m8887i(r3, r4, r1)
            if (r12 != r2) goto La4
            goto La5
        La4:
            r12 = r0
        La5:
            if (r12 != r2) goto La8
            goto Lb7
        La8:
            r12 = 0
            r10.f41067s = r12
            vx.h r3 = r10.f41061m
            r1.f40939a = r12
            r1.f40942d = r5
            java.lang.Object r11 = r3.mo14775g(r11, r1)
            if (r11 != r2) goto Lb8
        Lb7:
            return r2
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15688d(im.j, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15689e(ww.AbstractC8193c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof xm.w4
            if (r0 == 0) goto L13
            r0 = r10
            xm.w4 r0 = (xm.w4) r0
            int r1 = r0.f40970c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40970c = r1
            goto L18
        L13:
            xm.w4 r0 = new xm.w4
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f40968a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40970c
            r3 = 0
            fn.i r5 = r9.f41050b
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L41
            if (r2 == r8) goto L3d
            if (r2 == r7) goto L39
            if (r2 != r6) goto L31
            og.od.m10798c(r10)
            return r10
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            og.od.m10798c(r10)
            goto L56
        L3d:
            og.od.m10798c(r10)
            goto L4d
        L41:
            og.od.m10798c(r10)
            r0.f40970c = r8
            java.lang.Object r10 = r5.m6040t(r3, r0)
            if (r10 != r1) goto L4d
            goto L60
        L4d:
            r0.f40970c = r7
            java.lang.Object r10 = r5.m6037q(r3, r0)
            if (r10 != r1) goto L56
            goto L60
        L56:
            r0.f40970c = r6
            gn.x2 r10 = r9.f41049a
            java.lang.Object r10 = r10.m6682b(r0)
            if (r10 != r1) goto L61
        L60:
            return r1
        L61:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15689e(ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final C0615j m15690f() {
        return og.z0.m11078a(this.f41049a.f14944d.f1209a, new String[]{"UserSimDetails"}, new an.j5(6));
    }

    /* renamed from: g */
    public final LinkedHashMap m15691g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C4802m> list = this.f41067s;
        if (list != null) {
            for (C4802m c4802m : list) {
                if (c4802m.f23898j) {
                    C8791f c8791f = C8791f.f42457a;
                    if (C8791f.m16171d(c4802m.f23894f)) {
                        String str = c4802m.f23894f;
                        AbstractC4154l.m8920c(str);
                        linkedHashMap.put(str, c4802m);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: h */
    public final Object m15692h(AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f41049a.f14944d.f1209a, true, false, new an.j5(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15693i(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.x4
            if (r0 == 0) goto L13
            r0 = r6
            xm.x4 r0 = (xm.x4) r0
            int r1 = r0.f41017d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41017d = r1
            goto L18
        L13:
            xm.x4 r0 = new xm.x4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f41015b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f41017d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f41014a
            og.od.m10798c(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f41014a = r5
            r0.f41017d = r3
            java.lang.Object r6 = r4.m15692h(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.util.List r6 = (java.util.List) r6
            r0 = 0
            if (r6 == 0) goto L60
            java.util.Iterator r6 = r6.iterator()
        L48:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r6.next()
            r2 = r1
            mm.m r2 = (mm.C4802m) r2
            java.lang.String r2 = r2.f23891c
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r5)
            if (r2 == 0) goto L48
            r0 = r1
        L5e:
            mm.m r0 = (mm.C4802m) r0
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15693i(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m15694j(uw.InterfaceC7559c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xm.z4
            if (r0 == 0) goto L13
            r0 = r5
            xm.z4 r0 = (xm.z4) r0
            int r1 = r0.f41100c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41100c = r1
            goto L18
        L13:
            xm.z4 r0 = new xm.z4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f41098a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f41100c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f41100c = r3
            java.lang.Object r5 = r4.m15696l(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L46:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r5.next()
            r2 = r1
            mm.m r2 = (mm.C4802m) r2
            boolean r2 = r2.f23902n
            if (r2 == 0) goto L46
            r0.add(r1)
            goto L46
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15694j(uw.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15695k(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.a5
            if (r0 == 0) goto L13
            r0 = r6
            xm.a5 r0 = (xm.a5) r0
            int r1 = r0.f40125d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40125d = r1
            goto L18
        L13:
            xm.a5 r0 = new xm.a5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40123b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40125d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f40122a
            og.od.m10798c(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f40122a = r5
            r0.f40125d = r3
            java.lang.Object r6 = r4.m15696l(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r6.next()
            r1 = r0
            mm.m r1 = (mm.C4802m) r1
            java.lang.String r1 = r1.f23891c
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r5)
            if (r1 == 0) goto L45
            return r0
        L5b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15695k(java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: l */
    public final Object m15696l(InterfaceC7559c interfaceC7559c) {
        return tx.c0.m13475K(this.f41052d.f42488a, new b5(this, null, 1), interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15697m(java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15697m(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum m15698n(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xm.f5
            if (r0 == 0) goto L13
            r0 = r7
            xm.f5 r0 = (xm.f5) r0
            int r1 = r0.f40303d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40303d = r1
            goto L18
        L13:
            xm.f5 r0 = new xm.f5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40301b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40303d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r0 = r0.f40300a
            og.od.m10798c(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            og.od.m10798c(r7)
            goto L4c
        L38:
            og.od.m10798c(r7)
            r0.f40303d = r4
            fn.i r7 = r6.f41050b
            km.a r7 = r7.f10585a
            java.lang.String r2 = "filter_lead_sim_selection"
            km.o r7 = (km.C4120o) r7
            java.lang.Object r7 = r7.m8883e(r2, r0)
            if (r7 != r1) goto L4c
            goto L5c
        L4c:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0.f40300a = r7
            r0.f40303d = r3
            java.lang.Object r0 = r6.m15696l(r0)
            if (r0 != r1) goto L5d
        L5c:
            return r1
        L5d:
            r5 = r0
            r0 = r7
            r7 = r5
        L60:
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            tq.p r7 = pg.AbstractC5934o.m11804a(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15698n(ww.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15699o(int r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.g5
            if (r0 == 0) goto L13
            r0 = r6
            xm.g5 r0 = (xm.g5) r0
            int r1 = r0.f40348d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40348d = r1
            goto L18
        L13:
            xm.g5 r0 = new xm.g5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40346b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40348d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.f40345a
            og.od.m10798c(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f40345a = r5
            r0.f40348d = r3
            java.lang.Object r6 = r4.m15696l(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r6.get(r5)
            mm.m r5 = (mm.C4802m) r5
            java.lang.String r5 = r5.f23890b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15699o(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum m15700p(uw.InterfaceC7559c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xm.h5
            if (r0 == 0) goto L13
            r0 = r7
            xm.h5 r0 = (xm.h5) r0
            int r1 = r0.f40390d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40390d = r1
            goto L18
        L13:
            xm.h5 r0 = new xm.h5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40388b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40390d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r0 = r0.f40387a
            og.od.m10798c(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            og.od.m10798c(r7)
            goto L4c
        L38:
            og.od.m10798c(r7)
            r0.f40390d = r4
            fn.i r7 = r6.f41050b
            km.a r7 = r7.f10585a
            java.lang.String r2 = "filter_sim_selection"
            km.o r7 = (km.C4120o) r7
            java.lang.Object r7 = r7.m8883e(r2, r0)
            if (r7 != r1) goto L4c
            goto L5c
        L4c:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0.f40387a = r7
            r0.f40390d = r3
            java.lang.Object r0 = r6.m15696l(r0)
            if (r0 != r1) goto L5d
        L5c:
            return r1
        L5d:
            r5 = r0
            r0 = r7
            r7 = r5
        L60:
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            tq.p r7 = pg.AbstractC5934o.m11804a(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15700p(uw.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15701q(java.lang.String r7, mm.C4802m r8, ww.AbstractC8193c r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15701q(java.lang.String, mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: r */
    public final Object m15702r(String str, InterfaceC7559c interfaceC7559c) {
        return pe.m10839n(interfaceC7559c, this.f41049a.f14944d.f1209a, true, false, new an.v1(str, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r2 != r4) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v10, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r31v0, types: [xm.y5] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15703s(java.lang.String r32, ww.AbstractC8193c r33) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15703s(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15704t(java.lang.String r5, uw.InterfaceC7559c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.k5
            if (r0 == 0) goto L13
            r0 = r6
            xm.k5 r0 = (xm.k5) r0
            int r1 = r0.f40499d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40499d = r1
            goto L18
        L13:
            xm.k5 r0 = new xm.k5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40497b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40499d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f40496a
            og.od.m10798c(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f40496a = r5
            r0.f40499d = r3
            java.lang.Object r6 = r4.m15695k(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            mm.m r6 = (mm.C4802m) r6
            if (r6 != 0) goto L46
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L46:
            yv.o r0 = yv.C8800o.f42459a     // Catch: java.lang.Exception -> L53
            j$.time.LocalDateTime r0 = yv.C8800o.m16204m()     // Catch: java.lang.Exception -> L53
            j$.time.LocalDateTime r6 = r6.f23901m     // Catch: java.lang.Exception -> L53
            boolean r5 = r0.isBefore(r6)     // Catch: java.lang.Exception -> L53
            goto L6d
        L53:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " IsSubscription >>> subscription checked failed for "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " >>>"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            yv.t r0 = r4.f41053e
            r0.m16238m(r5, r6)
            r5 = 0
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15704t(java.lang.String, uw.c):java.lang.Object");
    }

    /* renamed from: u */
    public final Object m15705u(AbstractC8193c abstractC8193c) {
        return tx.c0.m13475K(this.f41052d.f42488a, new y4(this, null, 6), abstractC8193c);
    }

    /* renamed from: v */
    public final void m15706v(EnumC3318t deviceDeleted) {
        AbstractC4154l.m8923f(deviceDeleted, "deviceDeleted");
        tx.c0.m13502y(this.f41052d, null, null, new h3(this, deviceDeleted, null, 10), 3);
    }

    /* renamed from: w */
    public final Object m15707w(boolean z6, AbstractC8193c abstractC8193c) throws Throwable {
        Object objM13475K = tx.c0.m13475K(this.f41052d.f42488a, new m5(this, z6, null, 0), abstractC8193c);
        return objM13475K == EnumC7794a.COROUTINE_SUSPENDED ? objM13475K : qw.a0.f30746a;
    }

    /* renamed from: x */
    public final Object m15708x(EnumC7204p enumC7204p, AbstractC8193c abstractC8193c) {
        Object objM8888j = ((C4120o) this.f41050b.f10585a).m8888j(enumC7204p.ordinal(), "filter_sim_selection", abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM8888j != enumC7794a) {
            objM8888j = a0Var;
        }
        return objM8888j == enumC7794a ? objM8888j : a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15709y(java.lang.String r5, j$.time.LocalDateTime r6, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof xm.p5
            if (r0 == 0) goto L13
            r0 = r7
            xm.p5 r0 = (xm.p5) r0
            int r1 = r0.f40718d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40718d = r1
            goto L18
        L13:
            xm.p5 r0 = new xm.p5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f40716b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40718d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.LocalDateTime r6 = r0.f40715a
            og.od.m10798c(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r7)
            r0.f40715a = r6
            r0.f40718d = r3
            gn.x2 r7 = r4.f41049a
            java.lang.Object r7 = r7.K0(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r7.intValue()
            if (r5 != 0) goto L4a
            goto L4d
        L4a:
            java.util.Objects.toString(r6)
        L4d:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15709y(java.lang.String, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15710z(java.lang.String r5, boolean r6, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof xm.q5
            if (r0 == 0) goto L13
            r0 = r7
            xm.q5 r0 = (xm.q5) r0
            int r1 = r0.f40759e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40759e = r1
            goto L18
        L13:
            xm.q5 r0 = new xm.q5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f40757c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40759e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r6 = r0.f40756b
            java.lang.String r5 = r0.f40755a
            og.od.m10798c(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r7)
            r0.f40755a = r5
            r0.f40756b = r6
            r0.f40759e = r3
            gn.x2 r7 = r4.f41049a
            java.lang.Object r7 = r7.M0(r5, r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L66
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "updateLeadFeature for "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " >>> failed to update lead subscription feature in db"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            yv.t r6 = r4.f41053e
            r6.m16231f(r5)
            goto L85
        L66:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "updateLeadFeature "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " >>> updated lead subscription feature in db to "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "UserSimRepository"
            int r5 = android.util.Log.d(r6, r5)
            ww.AbstractC8196f.m15349b(r5)
        L85:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y5.m15710z(java.lang.String, boolean, ww.c):java.lang.Object");
    }
}
