package eo;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import ur.C7525r;
import ur.C7526s;
import ur.C7527t;
import ur.C7528u;
import ur.C7530w;
import ur.C7531x;
import ur.C7532y;
import ur.C7533z;
import ur.a0;
import ur.b0;
import ur.c0;
import ur.d0;
import ur.e0;
import ur.g0;
import ur.l0;
import ur.m0;
import ur.n0;
import wj.C8090p;
import wx.c1;
import wx.m1;
import xm.y5;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eo.h */
/* loaded from: classes3.dex */
public final class C2082h {

    /* renamed from: e */
    public static final C7531x f9741e;

    /* renamed from: f */
    public static final C7531x f9742f;

    /* renamed from: g */
    public static final m1 f9743g;

    /* renamed from: h */
    public static final C7530w f9744h;

    /* renamed from: i */
    public static final C7530w f9745i;

    /* renamed from: a */
    public final Context f9746a;

    /* renamed from: b */
    public final y5 f9747b;

    /* renamed from: c */
    public final C8090p f9748c;

    /* renamed from: d */
    public final C8805t f9749d;

    static {
        C7525r c7525r = C7525r.f36257d;
        C7527t c7527t = C7527t.f36261d;
        f9741e = new C7531x(pe.m10835j(c7525r, c7527t, C7526s.f36259d, C7528u.f36263d), new ArrayList());
        f9742f = new C7531x(pe.m10835j(c7525r, c7527t), new ArrayList());
        f9743g = c1.m15372c(new C7530w(0, pe.m10835j(l0.f36239d, m0.f36242d, n0.f36246d), false));
        f9744h = new C7530w(0, pe.m10835j(g0.YES, g0.NO), false);
        f9745i = new C7530w(0, pe.m10835j(b0.f36206b, e0.f36212b, c0.f36208b, a0.f36204b, d0.f36210b, new C7533z(), new C7532y()), false);
    }

    public C2082h(Context context, C8810d c8810d, y5 userSIMRepository, C8090p c8090p, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f9746a = context;
        this.f9747b = userSIMRepository;
        this.f9748c = c8090p;
        this.f9749d = c8805t;
        C0496f c0496f = tx.m0.f34659a;
        tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C2075a(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5792a(eo.C2082h r6, int r7, ww.AbstractC8193c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof eo.C2077c
            if (r0 == 0) goto L16
            r0 = r8
            eo.c r0 = (eo.C2077c) r0
            int r1 = r0.f9716d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f9716d = r1
            goto L1b
        L16:
            eo.c r0 = new eo.c
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f9714b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f9716d
            java.lang.String r3 = "SIM 2"
            java.lang.String r4 = "SIM 1"
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L32
            int r7 = r0.f9713a
            og.od.m10798c(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L30
            goto L4a
        L30:
            r6 = move-exception
            goto L60
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            og.od.m10798c(r8)
            xm.y5 r6 = r6.f9747b     // Catch: java.lang.IndexOutOfBoundsException -> L30
            r0.f9713a = r7     // Catch: java.lang.IndexOutOfBoundsException -> L30
            r0.f9716d = r5     // Catch: java.lang.IndexOutOfBoundsException -> L30
            java.lang.Object r8 = r6.m15699o(r7, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L30
            if (r8 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.IndexOutOfBoundsException -> L30
            if (r8 == 0) goto L5c
            yv.f r6 = yv.C8791f.f42457a     // Catch: java.lang.IndexOutOfBoundsException -> L30
            boolean r6 = yv.C8791f.m16171d(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L30
            if (r6 == 0) goto L57
            goto L58
        L57:
            r8 = 0
        L58:
            if (r8 != 0) goto L5b
            goto L5c
        L5b:
            return r8
        L5c:
            if (r7 != 0) goto L5f
            return r4
        L5f:
            return r3
        L60:
            r6.getStackTrace()
            if (r7 != 0) goto L66
            r3 = r4
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C2082h.m5792a(eo.h, int, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static C7530w m5793b() {
        return C7530w.m14295a(f9745i, null, 0, 7);
    }

    /* renamed from: c */
    public static C7530w m5794c() {
        return C7530w.m14295a(f9744h, null, 0, 7);
    }

    /* renamed from: d */
    public static C7530w m5795d() {
        return C7530w.m14295a((C7530w) f9743g.getValue(), null, 0, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0152, code lost:
    
        if (r1 == r3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:14:0x0037, B:66:0x0155, B:19:0x004a, B:50:0x0102, B:51:0x0112, B:53:0x0118, B:57:0x012d, B:58:0x0132, B:61:0x0137, B:63:0x0142, B:68:0x0161, B:70:0x0166, B:71:0x016e, B:73:0x0174, B:77:0x0187, B:78:0x018c, B:80:0x018f, B:82:0x01b5, B:83:0x01ba, B:84:0x01bb, B:86:0x01d1, B:87:0x01d6, B:22:0x0053, B:47:0x00ec, B:25:0x006b, B:35:0x00ba, B:29:0x0085, B:31:0x008b, B:43:0x00d0, B:88:0x01d7, B:89:0x01dc, B:39:0x00c5, B:40:0x00ca, B:28:0x0079), top: B:92:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102 A[Catch: Exception -> 0x01dd, PHI: r1 r4 r6 r14
      0x0102: PHI (r1v18 java.lang.Object) = (r1v17 java.lang.Object), (r1v1 java.lang.Object) binds: [B:48:0x00ff, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r4v12 ur.f0) = (r4v11 ur.f0), (r4v19 ur.f0) binds: [B:48:0x00ff, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r6v8 long) = (r6v7 long), (r6v10 long) binds: [B:48:0x00ff, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r14v5 qr.r) = (r14v4 qr.r), (r14v8 qr.r) binds: [B:48:0x00ff, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x01dd, blocks: (B:14:0x0037, B:66:0x0155, B:19:0x004a, B:50:0x0102, B:51:0x0112, B:53:0x0118, B:57:0x012d, B:58:0x0132, B:61:0x0137, B:63:0x0142, B:68:0x0161, B:70:0x0166, B:71:0x016e, B:73:0x0174, B:77:0x0187, B:78:0x018c, B:80:0x018f, B:82:0x01b5, B:83:0x01ba, B:84:0x01bb, B:86:0x01d1, B:87:0x01d6, B:22:0x0053, B:47:0x00ec, B:25:0x006b, B:35:0x00ba, B:29:0x0085, B:31:0x008b, B:43:0x00d0, B:88:0x01d7, B:89:0x01dc, B:39:0x00c5, B:40:0x00ca, B:28:0x0079), top: B:92:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:14:0x0037, B:66:0x0155, B:19:0x004a, B:50:0x0102, B:51:0x0112, B:53:0x0118, B:57:0x012d, B:58:0x0132, B:61:0x0137, B:63:0x0142, B:68:0x0161, B:70:0x0166, B:71:0x016e, B:73:0x0174, B:77:0x0187, B:78:0x018c, B:80:0x018f, B:82:0x01b5, B:83:0x01ba, B:84:0x01bb, B:86:0x01d1, B:87:0x01d6, B:22:0x0053, B:47:0x00ec, B:25:0x006b, B:35:0x00ba, B:29:0x0085, B:31:0x008b, B:43:0x00d0, B:88:0x01d7, B:89:0x01dc, B:39:0x00c5, B:40:0x00ca, B:28:0x0079), top: B:92:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137 A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:14:0x0037, B:66:0x0155, B:19:0x004a, B:50:0x0102, B:51:0x0112, B:53:0x0118, B:57:0x012d, B:58:0x0132, B:61:0x0137, B:63:0x0142, B:68:0x0161, B:70:0x0166, B:71:0x016e, B:73:0x0174, B:77:0x0187, B:78:0x018c, B:80:0x018f, B:82:0x01b5, B:83:0x01ba, B:84:0x01bb, B:86:0x01d1, B:87:0x01d6, B:22:0x0053, B:47:0x00ec, B:25:0x006b, B:35:0x00ba, B:29:0x0085, B:31:0x008b, B:43:0x00d0, B:88:0x01d7, B:89:0x01dc, B:39:0x00c5, B:40:0x00ca, B:28:0x0079), top: B:92:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1 A[Catch: Exception -> 0x01dd, TryCatch #0 {Exception -> 0x01dd, blocks: (B:14:0x0037, B:66:0x0155, B:19:0x004a, B:50:0x0102, B:51:0x0112, B:53:0x0118, B:57:0x012d, B:58:0x0132, B:61:0x0137, B:63:0x0142, B:68:0x0161, B:70:0x0166, B:71:0x016e, B:73:0x0174, B:77:0x0187, B:78:0x018c, B:80:0x018f, B:82:0x01b5, B:83:0x01ba, B:84:0x01bb, B:86:0x01d1, B:87:0x01d6, B:22:0x0053, B:47:0x00ec, B:25:0x006b, B:35:0x00ba, B:29:0x0085, B:31:0x008b, B:43:0x00d0, B:88:0x01d7, B:89:0x01dc, B:39:0x00c5, B:40:0x00ca, B:28:0x0079), top: B:92:0x002d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b4 -> B:26:0x006e). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m5796e(qr.C6294r r21, uw.InterfaceC7559c r22) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C2082h.m5796e(qr.r, uw.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5797f(tq.EnumC7204p r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eo.C2080f
            if (r0 == 0) goto L13
            r0 = r7
            eo.f r0 = (eo.C2080f) r0
            int r1 = r0.f9736d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9736d = r1
            goto L18
        L13:
            eo.f r0 = new eo.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f9734b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f9736d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tq.p r6 = r0.f9733a
            og.od.m10798c(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            og.od.m10798c(r7)
            r0.f9733a = r6
            r0.f9736d = r3
            xm.y5 r7 = r5.f9747b
            java.lang.Object r7 = r7.m15696l(r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == r3) goto L8a
            r4 = 2
            if (r0 == r4) goto L65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "connectedSimList :- "
            r6.<init>(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            yv.t r7 = r5.f9749d
            java.lang.String r0 = "FilterUseCase"
            r7.m16232g(r0, r6)
            return r2
        L65:
            int[] r0 = eo.AbstractC2076b.f9712a
            int r6 = r6.ordinal()
            r6 = r0[r6]
            if (r6 == r3) goto L7e
            if (r6 == r4) goto L72
            goto L94
        L72:
            java.lang.Object r6 = r7.get(r3)
            mm.m r6 = (mm.C4802m) r6
            java.lang.String r6 = r6.f23891c
            if (r6 != 0) goto L7d
            goto L94
        L7d:
            return r6
        L7e:
            java.lang.Object r6 = r7.get(r1)
            mm.m r6 = (mm.C4802m) r6
            java.lang.String r6 = r6.f23891c
            if (r6 != 0) goto L89
            goto L94
        L89:
            return r6
        L8a:
            java.lang.Object r6 = r7.get(r1)
            mm.m r6 = (mm.C4802m) r6
            java.lang.String r6 = r6.f23891c
            if (r6 != 0) goto L95
        L94:
            return r2
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C2082h.m5797f(tq.p, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5798g(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof eo.C2079e
            if (r0 == 0) goto L13
            r0 = r9
            eo.e r0 = (eo.C2079e) r0
            int r1 = r0.f9732d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9732d = r1
            goto L18
        L13:
            eo.e r0 = new eo.e
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f9730b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f9732d
            xm.y5 r3 = r8.f9747b
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L37
            if (r2 != r5) goto L2f
            java.util.List r0 = r0.f9729a
            og.od.m10798c(r9)
            goto L69
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            og.od.m10798c(r9)
            goto L47
        L3b:
            og.od.m10798c(r9)
            r0.f9732d = r6
            java.lang.Object r9 = r3.m15696l(r0)
            if (r9 != r1) goto L47
            goto L65
        L47:
            java.util.List r9 = (java.util.List) r9
            int r2 = r9.size()
            if (r2 != r6) goto L5b
            java.lang.Object r9 = r9.get(r4)
            mm.m r9 = (mm.C4802m) r9
            java.lang.String r9 = r9.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r9)
            return r9
        L5b:
            r0.f9729a = r9
            r0.f9732d = r5
            java.lang.Enum r0 = r3.m15700p(r0)
            if (r0 != r1) goto L66
        L65:
            return r1
        L66:
            r7 = r0
            r0 = r9
            r9 = r7
        L69:
            tq.p r9 = (tq.EnumC7204p) r9
            tq.p r1 = tq.EnumC7204p.ALL
            if (r9 == r1) goto L8c
            tq.p r1 = tq.EnumC7204p.DEFAULT
            if (r9 != r1) goto L74
            goto L8c
        L74:
            int r1 = r0.size()
            if (r1 != r5) goto L8c
            tq.p r1 = tq.EnumC7204p.SIM1
            if (r9 != r1) goto L7f
            goto L80
        L7f:
            r4 = r6
        L80:
            java.lang.Object r9 = r0.get(r4)
            mm.m r9 = (mm.C4802m) r9
            java.lang.String r9 = r9.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r9)
            return r9
        L8c:
            java.lang.String r9 = ""
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C2082h.m5798g(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5799h(tq.EnumC7204p r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eo.C2081g
            if (r0 == 0) goto L13
            r0 = r6
            eo.g r0 = (eo.C2081g) r0
            int r1 = r0.f9740d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9740d = r1
            goto L18
        L13:
            eo.g r0 = new eo.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9738b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f9740d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tq.p r5 = r0.f9737a
            og.od.m10798c(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f9737a = r5
            r0.f9740d = r3
            xm.y5 r6 = r4.f9747b
            java.lang.Object r6 = r6.m15708x(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.Objects.toString(r5)
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C2082h.m5799h(tq.p, ww.c):java.lang.Object");
    }
}
