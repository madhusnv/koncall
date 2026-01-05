package wx;

import ao.C0381t;
import ex.InterfaceC2141e;
import f9.C2222e;
import l7.C4417q;
import mm.AbstractC4801l;
import ob.C5333a;
import of.C5359n;
import tx.InterfaceC7266z;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.C7806h;
import vx.EnumC7799a;
import xx.AbstractC8496b;
import xx.C8501g;
import xx.C8503i;
import xx.C8506l;
import xx.C8512r;
import xx.InterfaceC8510p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class c1 {

    /* renamed from: a */
    public static final C4417q f39197a;

    /* renamed from: b */
    public static final C4417q f39198b;

    /* renamed from: c */
    public static final C4417q f39199c;

    static {
        int i10 = 3;
        f39197a = new C4417q("NO_VALUE", i10);
        f39198b = new C4417q("NONE", i10);
        f39199c = new C4417q("PENDING", i10);
    }

    /* renamed from: a */
    public static final b1 m15370a(int i10, int i11, EnumC7799a enumC7799a) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "replay cannot be negative, but was ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i11 <= 0 && enumC7799a != EnumC7799a.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC7799a).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new b1(i10, i12, enumC7799a);
    }

    /* renamed from: b */
    public static /* synthetic */ b1 m15371b(int i10, int i11, EnumC7799a enumC7799a, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            enumC7799a = EnumC7799a.SUSPEND;
        }
        return m15370a(i10, i11, enumC7799a);
    }

    /* renamed from: c */
    public static final m1 m15372c(Object obj) {
        if (obj == null) {
            obj = AbstractC8496b.f41395b;
        }
        return new m1(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vw.EnumC7794a m15373d(wx.InterfaceC8210k r4, java.lang.Object r5, java.lang.Object r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof wx.a0
            if (r0 == 0) goto L13
            r0 = r7
            wx.a0 r0 = (wx.a0) r0
            int r1 = r0.f39169c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39169c = r1
            goto L18
        L13:
            wx.a0 r0 = new wx.a0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f39168b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39169c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.f39167a
            og.od.m10798c(r7)
            goto L3f
        L31:
            og.od.m10798c(r7)
            r0.f39167a = r6
            r0.f39169c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15373d(wx.k, java.lang.Object, java.lang.Object, ww.c):vw.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15374e(wx.o1 r4, ex.InterfaceC2142f r5, java.lang.Throwable r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof wx.C8215p
            if (r0 == 0) goto L13
            r0 = r7
            wx.p r0 = (wx.C8215p) r0
            int r1 = r0.f39299c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39299c = r1
            goto L18
        L13:
            wx.p r0 = new wx.p
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f39298b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39299c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f39297a
            og.od.m10798c(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            og.od.m10798c(r7)
            r0.f39297a = r6     // Catch: java.lang.Throwable -> L29
            r0.f39299c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            og.md.m10764a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15374e(wx.o1, ex.f, java.lang.Throwable, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public static final void m15375f(Object[] objArr, long j6, Object obj) {
        objArr[((int) j6) & (objArr.length - 1)] = obj;
    }

    /* renamed from: g */
    public static InterfaceC8209j m15376g(InterfaceC8209j interfaceC8209j, int i10) {
        EnumC7799a enumC7799a = EnumC7799a.SUSPEND;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            enumC7799a = EnumC7799a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        EnumC7799a enumC7799a2 = enumC7799a;
        return interfaceC8209j instanceof InterfaceC8510p ? AbstractC8496b.m15788a((InterfaceC8510p) interfaceC8209j, null, i11, enumC7799a2, 1) : new C8503i(interfaceC8209j, null, i11, enumC7799a2, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m15377h(wx.InterfaceC8209j r4, wx.InterfaceC8210k r5, ww.AbstractC8193c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof wx.C8221v
            if (r0 == 0) goto L13
            r0 = r6
            wx.v r0 = (wx.C8221v) r0
            int r1 = r0.f39334c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39334c = r1
            goto L18
        L13:
            wx.v r0 = new wx.v
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39333b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39334c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.z r4 = r0.f39332a
            og.od.m10798c(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            og.od.m10798c(r6)
            kotlin.jvm.internal.z r6 = new kotlin.jvm.internal.z
            r6.<init>()
            wx.g r2 = new wx.g     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f39332a = r6     // Catch: java.lang.Throwable -> L4d
            r0.f39334c = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f21164a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7d
        L5b:
            uw.h r6 = r0.getContext()
            tx.w r0 = tx.C7263w.f34689b
            uw.f r6 = r6.o0(r0)
            tx.e1 r6 = (tx.e1) r6
            if (r6 == 0) goto L7e
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r6 = r6.mo13507A()
            if (r6 == 0) goto L7e
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            throw r5
        L7e:
            if (r4 != 0) goto L81
            return r5
        L81:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L89
            og.md.m10764a(r4, r5)
            throw r4
        L89:
            og.md.m10764a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15377h(wx.j, wx.k, ww.c):java.io.Serializable");
    }

    /* renamed from: i */
    public static final Object m15378i(InterfaceC8209j interfaceC8209j, InterfaceC7559c interfaceC7559c) {
        Object objCollect = interfaceC8209j.collect(C8512r.f41433a, interfaceC7559c);
        return objCollect == EnumC7794a.COROUTINE_SUSPENDED ? objCollect : qw.a0.f30746a;
    }

    /* renamed from: j */
    public static final Object m15379j(InterfaceC8209j interfaceC8209j, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        int i10 = j0.f39242a;
        Object objM15378i = m15378i(m15376g(new C8506l(new fk.b1(interfaceC2141e, null), interfaceC8209j, C7565i.f36440a, -2, EnumC7799a.SUSPEND), 0), interfaceC7559c);
        return objM15378i == EnumC7794a.COROUTINE_SUSPENDED ? objM15378i : qw.a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final of.C5359n m15380k(wx.InterfaceC8209j r7, int r8) {
        /*
            vx.k r0 = vx.InterfaceC7810l.W0
            r0.getClass()
            int r0 = vx.C7809k.f37517b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof xx.AbstractC8499e
            if (r1 == 0) goto L3b
            r1 = r7
            xx.e r1 = (xx.AbstractC8499e) r1
            vx.a r2 = r1.f41405c
            wx.j r3 = r1.mo15392g()
            if (r3 == 0) goto L3b
            of.n r7 = new of.n
            int r4 = r1.f41404b
            r5 = -3
            if (r4 == r5) goto L29
            r5 = -2
            if (r4 == r5) goto L29
            if (r4 == 0) goto L29
            r0 = r4
            goto L35
        L29:
            vx.a r5 = vx.EnumC7799a.SUSPEND
            r6 = 0
            if (r2 != r5) goto L32
            if (r4 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            uw.h r8 = r1.f41403a
            r7.<init>(r0, r3, r2, r8)
            return r7
        L3b:
            of.n r8 = new of.n
            vx.a r1 = vx.EnumC7799a.SUSPEND
            uw.i r2 = uw.C7565i.f36440a
            r8.<init>(r0, r7, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15380k(wx.j, int):of.n");
    }

    /* renamed from: l */
    public static final InterfaceC8209j m15381l(InterfaceC8209j interfaceC8209j, long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        }
        if (j6 == 0) {
            return interfaceC8209j;
        }
        return new C2222e(7, new C8214o(new C5333a(2, j6), interfaceC8209j, null));
    }

    /* renamed from: m */
    public static final InterfaceC8209j m15382m(InterfaceC8209j interfaceC8209j) {
        return ((interfaceC8209j instanceof k1) || (interfaceC8209j instanceof C8207h)) ? interfaceC8209j : new C8207h(interfaceC8209j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0055, B:29:0x006a, B:31:0x0072, B:20:0x0046, B:24:0x0051), top: B:47:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0084 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15383n(wx.InterfaceC8210k r6, vx.InterfaceC7821w r7, boolean r8, uw.InterfaceC7559c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof wx.C8212m
            if (r0 == 0) goto L13
            r0 = r9
            wx.m r0 = (wx.C8212m) r0
            int r1 = r0.f39270f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39270f = r1
            goto L18
        L13:
            wx.m r0 = new wx.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f39269e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39270f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f39268d
            vx.b r6 = r0.f39267c
            vx.w r7 = r0.f39266b
            wx.k r2 = r0.f39265a
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f39268d
            vx.b r6 = r0.f39267c
            vx.w r7 = r0.f39266b
            wx.k r2 = r0.f39265a
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4a:
            og.od.m10798c(r9)
            boolean r9 = r6 instanceof wx.o1
            if (r9 != 0) goto L98
            vx.b r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.f39265a = r6     // Catch: java.lang.Throwable -> L34
            r0.f39266b = r7     // Catch: java.lang.Throwable -> L34
            r0.f39267c = r9     // Catch: java.lang.Throwable -> L34
            r0.f39268d = r8     // Catch: java.lang.Throwable -> L34
            r0.f39270f = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.m14752b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L66
            goto L86
        L66:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.m14753c()     // Catch: java.lang.Throwable -> L34
            r0.f39265a = r2     // Catch: java.lang.Throwable -> L34
            r0.f39266b = r7     // Catch: java.lang.Throwable -> L34
            r0.f39267c = r6     // Catch: java.lang.Throwable -> L34
            r0.f39268d = r8     // Catch: java.lang.Throwable -> L34
            r0.f39270f = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L86:
            return r1
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            r7.mo14777j(r6)
        L8d:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            pg.p6.m11814a(r7, r6)
        L97:
            throw r9
        L98:
            wx.o1 r6 = (wx.o1) r6
            java.lang.Throwable r6 = r6.f39296a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15383n(wx.k, vx.w, boolean, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15384o(wx.InterfaceC8209j r6, ex.InterfaceC2141e r7, ww.AbstractC8193c r8) {
        /*
            l7.q r0 = xx.AbstractC8496b.f41395b
            boolean r1 = r8 instanceof wx.n0
            if (r1 == 0) goto L15
            r1 = r8
            wx.n0 r1 = (wx.n0) r1
            int r2 = r1.f39283d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f39283d = r2
            goto L1a
        L15:
            wx.n0 r1 = new wx.n0
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.f39282c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f39283d
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            aw.b r6 = r1.f39281b
            kotlin.jvm.internal.z r7 = r1.f39280a
            og.od.m10798c(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L66
        L2d:
            r8 = move-exception
            goto L5b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            og.od.m10798c(r8)
            kotlin.jvm.internal.z r8 = new kotlin.jvm.internal.z
            r8.<init>()
            r8.f21164a = r0
            aw.b r3 = new aw.b
            r5 = 10
            r3.<init>(r5, r7, r8)
            r1.f39280a = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r1.f39281b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r1.f39283d = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r6 = r6.collect(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r6 != r2) goto L55
            return r2
        L55:
            r7 = r8
            goto L66
        L57:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r3
        L5b:
            java.lang.Object r2 = r8.f21168a
            if (r2 != r6) goto L73
            uw.h r6 = r1.getContext()
            tx.c0.m13490m(r6)
        L66:
            java.lang.Object r6 = r7.f21164a
            if (r6 == r0) goto L6b
            return r6
        L6b:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element matching the predicate"
            r6.<init>(r7)
            throw r6
        L73:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15384o(wx.j, ex.e, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15385p(wx.InterfaceC8209j r6, uw.InterfaceC7559c r7) {
        /*
            l7.q r0 = xx.AbstractC8496b.f41395b
            boolean r1 = r7 instanceof wx.m0
            if (r1 == 0) goto L15
            r1 = r7
            wx.m0 r1 = (wx.m0) r1
            int r2 = r1.f39274d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f39274d = r2
            goto L1a
        L15:
            wx.m0 r1 = new wx.m0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f39273c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f39274d
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            wx.k0 r6 = r1.f39272b
            kotlin.jvm.internal.z r2 = r1.f39271a
            og.od.m10798c(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L65
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            og.od.m10798c(r7)
            kotlin.jvm.internal.z r7 = new kotlin.jvm.internal.z
            r7.<init>()
            r7.f21164a = r0
            wx.k0 r3 = new wx.k0
            r5 = 0
            r3.<init>(r7, r5)
            r1.f39271a = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.f39272b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.f39274d = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r6 = r6.collect(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r6 != r2) goto L54
            return r2
        L54:
            r2 = r7
            goto L65
        L56:
            r6 = move-exception
            r2 = r7
            r7 = r6
            r6 = r3
        L5a:
            java.lang.Object r3 = r7.f21168a
            if (r3 != r6) goto L72
            uw.h r6 = r1.getContext()
            tx.c0.m13490m(r6)
        L65:
            java.lang.Object r6 = r2.f21164a
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15385p(wx.j, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15386q(wx.InterfaceC8209j r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof wx.o0
            if (r0 == 0) goto L13
            r0 = r6
            wx.o0 r0 = (wx.o0) r0
            int r1 = r0.f39295d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39295d = r1
            goto L18
        L13:
            wx.o0 r0 = new wx.o0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39294c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39295d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            wx.k0 r5 = r0.f39293b
            kotlin.jvm.internal.z r1 = r0.f39292a
            og.od.m10798c(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L61
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r6)
            kotlin.jvm.internal.z r6 = new kotlin.jvm.internal.z
            r6.<init>()
            wx.k0 r2 = new wx.k0
            r4 = 1
            r2.<init>(r6, r4)
            r0.f39292a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.f39293b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.f39295d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r1 = r6
            goto L61
        L52:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L56:
            java.lang.Object r2 = r6.f21168a
            if (r2 != r5) goto L64
            uw.h r5 = r0.getContext()
            tx.c0.m13490m(r5)
        L61:
            java.lang.Object r5 = r1.f21164a
            return r5
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.c1.m15386q(wx.j, ww.c):java.lang.Object");
    }

    /* renamed from: r */
    public static InterfaceC8209j m15387r(C2222e c2222e) {
        int i10 = j0.f39242a;
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Expected positive concurrency level, but had ").toString());
        }
        if (i10 == 1) {
            return new C2222e(4, c2222e);
        }
        return new C8501g(c2222e, i10, C7565i.f36440a, -2, EnumC7799a.SUSPEND);
    }

    /* renamed from: s */
    public static final InterfaceC8209j m15388s(x0 x0Var, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return ((i10 == 0 || i10 == -3) && enumC7799a == EnumC7799a.SUSPEND) ? x0Var : new C8503i(x0Var, interfaceC7564h, i10, enumC7799a);
    }

    /* renamed from: t */
    public static final C8203d m15389t(C7806h c7806h) {
        return new C8203d(c7806h, false);
    }

    /* renamed from: u */
    public static v0 m15390u(InterfaceC8209j interfaceC8209j, InterfaceC7266z interfaceC7266z) {
        C5359n c5359nM15380k = m15380k(interfaceC8209j, 0);
        b1 b1VarM15370a = m15370a(0, c5359nM15380k.f26303a, (EnumC7799a) c5359nM15380k.f26305c);
        InterfaceC7564h interfaceC7564h = (InterfaceC7564h) c5359nM15380k.f26306d;
        InterfaceC8209j interfaceC8209j2 = (InterfaceC8209j) c5359nM15380k.f26304b;
        h1 h1Var = f1.f39222a;
        h1 h1Var2 = f1.f39223b;
        tx.c0.m13501x(interfaceC7266z, interfaceC7564h, h1Var2.equals(h1Var) ? tx.b0.DEFAULT : tx.b0.UNDISPATCHED, new C0381t(h1Var2, interfaceC8209j2, b1VarM15370a, f39197a, (InterfaceC7559c) null));
        return new v0(b1VarM15370a);
    }
}
