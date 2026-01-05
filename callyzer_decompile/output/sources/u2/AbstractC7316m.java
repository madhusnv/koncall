package u2;

import b2.C0554l;
import e1.k0;
import ex.InterfaceC2139c;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import rw.AbstractC6662l;
import rw.C6668r;
import s1.u0;
import s2.C6732a;
import s2.C6743l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.m */
/* loaded from: classes.dex */
public abstract class AbstractC7316m {

    /* renamed from: a */
    public static final C4367l f34889a = new C4367l(24);

    /* renamed from: b */
    public static final Object f34890b = new Object();

    /* renamed from: c */
    public static C7315l f34891c;

    /* renamed from: d */
    public static long f34892d;

    /* renamed from: e */
    public static final u0 f34893e;

    /* renamed from: f */
    public static final C0554l f34894f;

    /* renamed from: g */
    public static Object f34895g;

    /* renamed from: h */
    public static Object f34896h;

    /* renamed from: i */
    public static final C7306c f34897i;

    /* renamed from: j */
    public static final C6732a f34898j;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    static {
        C7315l c7315l = C7315l.f34884e;
        f34891c = c7315l;
        f34892d = 1 + 1;
        u0 u0Var = new u0();
        u0Var.f32145c = new long[16];
        u0Var.f32146d = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        u0Var.f32147e = iArr;
        f34893e = u0Var;
        C0554l c0554l = new C0554l(11, (char) 0);
        c0554l.f3779c = new int[16];
        c0554l.f3780d = new C6743l[16];
        f34894f = c0554l;
        C6668r c6668r = C6668r.f31943a;
        f34895g = c6668r;
        f34896h = c6668r;
        long j6 = f34892d;
        f34892d = 1 + j6;
        C7306c c7306c = new C7306c(j6, c7315l, null, C7304a.f34835b);
        f34891c = f34891c.m13675r(c7306c.f34874b);
        f34897i = c7306c;
        f34898j = new C6732a(0);
    }

    /* renamed from: a */
    public static final void m13676a() {
        m13681f(C7304a.f34836c);
    }

    /* renamed from: b */
    public static final InterfaceC2139c m13677b(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) {
        return (interfaceC2139c == null || interfaceC2139c2 == null || interfaceC2139c == interfaceC2139c2) ? interfaceC2139c == null ? interfaceC2139c2 : interfaceC2139c : new C7305b(interfaceC2139c, interfaceC2139c2, 2);
    }

    /* renamed from: c */
    public static final HashMap m13678c(long j6, C7307d c7307d, C7315l c7315l) {
        long[] jArr;
        C7315l c7315l2;
        long[] jArr2;
        C7315l c7315l3;
        int i10;
        a0 a0VarM13694s;
        long j10 = j6;
        k0 k0VarMo13659x = c7307d.mo13659x();
        if (k0VarMo13659x != null) {
            C7315l c7315lM13674q = c7307d.mo13649d().m13675r(c7307d.mo13652g()).m13674q(c7307d.f34859j);
            Object[] objArr = k0VarMo13659x.f9006b;
            long[] jArr3 = k0VarMo13659x.f9005a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap map = null;
                while (true) {
                    long j11 = jArr3[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j11 & 255) < 128) {
                                InterfaceC7328y interfaceC7328y = (InterfaceC7328y) objArr[(i11 << 3) + i14];
                                a0 a0VarMo8488b = interfaceC7328y.mo8488b();
                                jArr2 = jArr3;
                                i10 = i12;
                                a0 a0VarM13694s2 = m13694s(a0VarMo8488b, j10, c7315l);
                                if (a0VarM13694s2 == null || (a0VarM13694s = m13694s(a0VarMo8488b, j10, c7315lM13674q)) == null || a0VarM13694s2.equals(a0VarM13694s)) {
                                    c7315l3 = c7315lM13674q;
                                } else {
                                    c7315l3 = c7315lM13674q;
                                    a0 a0VarM13694s3 = m13694s(a0VarMo8488b, c7307d.mo13652g(), c7307d.mo13649d());
                                    if (a0VarM13694s3 == null) {
                                        m13693r();
                                        throw null;
                                    }
                                    a0 a0VarMo8492h = interfaceC7328y.mo8492h(a0VarM13694s, a0VarM13694s2, a0VarM13694s3);
                                    if (a0VarMo8492h == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(a0VarM13694s2, a0VarMo8492h);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                c7315l3 = c7315lM13674q;
                                i10 = i12;
                            }
                            j11 >>= i10;
                            i14++;
                            j10 = j6;
                            i12 = i10;
                            jArr3 = jArr2;
                            c7315lM13674q = c7315l3;
                        }
                        jArr = jArr3;
                        c7315l2 = c7315lM13674q;
                        if (i13 != i12) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c7315l2 = c7315lM13674q;
                    }
                    if (i11 == length) {
                        return map;
                    }
                    i11++;
                    j10 = j6;
                    jArr3 = jArr;
                    c7315lM13674q = c7315l2;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final void m13679d(AbstractC7311h abstractC7311h) {
        long j6;
        if (f34891c.m13673j(abstractC7311h.mo13652g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(abstractC7311h.mo13652g());
        sb2.append(", disposed=");
        sb2.append(abstractC7311h.f34875c);
        sb2.append(", applied=");
        C7307d c7307d = abstractC7311h instanceof C7307d ? (C7307d) abstractC7311h : null;
        sb2.append(c7307d != null ? Boolean.valueOf(c7307d.f34862m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f34890b) {
            u0 u0Var = f34893e;
            j6 = u0Var.f32143a > 0 ? ((long[]) u0Var.f32145c)[0] : -1L;
        }
        sb2.append(j6);
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* renamed from: e */
    public static final C7315l m13680e(C7315l c7315l, long j6, long j10) {
        while (j6 < j10) {
            c7315l = c7315l.m13675r(j6);
            j6++;
        }
        return c7315l;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13681f(ex.InterfaceC2139c r15) {
        /*
            u2.c r0 = u2.AbstractC7316m.f34897i
            java.lang.Object r1 = u2.AbstractC7316m.f34890b
            monitor-enter(r1)
            e1.k0 r2 = r0.f34857h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            s2.a r3 = u2.AbstractC7316m.f34898j     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = m13697v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = u2.AbstractC7316m.f34895g     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            ex.e r7 = (ex.InterfaceC2141e) r7     // Catch: java.lang.Throwable -> L36
            m2.g r8 = new m2.g     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            s2.a r0 = u2.AbstractC7316m.f34898j
            r0.addAndGet(r3)
            goto L44
        L3e:
            s2.a r0 = u2.AbstractC7316m.f34898j
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = u2.AbstractC7316m.f34890b
            monitor-enter(r0)
            m13682g()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f9006b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f9005a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            u2.y r11 = (u2.InterfaceC7328y) r11     // Catch: java.lang.Throwable -> L86
            m13692q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.AbstractC7316m.m13681f(ex.c):java.lang.Object");
    }

    /* renamed from: g */
    public static final void m13682g() {
        C0554l c0554l = f34894f;
        int i10 = c0554l.f3778b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            C6743l c6743l = ((C6743l[]) c0554l.f3780d)[i11];
            Object obj = c6743l != null ? c6743l.get() : null;
            if (obj != null && m13691p((InterfaceC7328y) obj)) {
                if (i12 != i11) {
                    ((C6743l[]) c0554l.f3780d)[i12] = c6743l;
                    int[] iArr = (int[]) c0554l.f3779c;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((C6743l[]) c0554l.f3780d)[i13] = null;
            ((int[]) c0554l.f3779c)[i13] = 0;
        }
        if (i12 != i10) {
            c0554l.f3778b = i12;
        }
    }

    /* renamed from: h */
    public static final AbstractC7311h m13683h(AbstractC7311h abstractC7311h, InterfaceC2139c interfaceC2139c, boolean z6) {
        boolean z10 = abstractC7311h instanceof C7307d;
        if (z10 || abstractC7311h == null) {
            return new c0(z10 ? (C7307d) abstractC7311h : null, interfaceC2139c, null, false, z6);
        }
        return new d0(abstractC7311h, interfaceC2139c, z6);
    }

    /* renamed from: i */
    public static final a0 m13684i(a0 a0Var) {
        a0 a0VarM13694s;
        AbstractC7311h abstractC7311hM13686k = m13686k();
        a0 a0VarM13694s2 = m13694s(a0Var, abstractC7311hM13686k.mo13652g(), abstractC7311hM13686k.mo13649d());
        if (a0VarM13694s2 != null) {
            return a0VarM13694s2;
        }
        synchronized (f34890b) {
            AbstractC7311h abstractC7311hM13686k2 = m13686k();
            a0VarM13694s = m13694s(a0Var, abstractC7311hM13686k2.mo13652g(), abstractC7311hM13686k2.mo13649d());
        }
        if (a0VarM13694s != null) {
            return a0VarM13694s;
        }
        m13693r();
        throw null;
    }

    /* renamed from: j */
    public static final a0 m13685j(a0 a0Var, AbstractC7311h abstractC7311h) {
        a0 a0VarM13694s;
        a0 a0VarM13694s2 = m13694s(a0Var, abstractC7311h.mo13652g(), abstractC7311h.mo13649d());
        if (a0VarM13694s2 != null) {
            return a0VarM13694s2;
        }
        synchronized (f34890b) {
            a0VarM13694s = m13694s(a0Var, abstractC7311h.mo13652g(), abstractC7311h.mo13649d());
        }
        if (a0VarM13694s != null) {
            return a0VarM13694s;
        }
        m13693r();
        throw null;
    }

    /* renamed from: k */
    public static final AbstractC7311h m13686k() {
        AbstractC7311h abstractC7311h = (AbstractC7311h) f34889a.m9138r();
        return abstractC7311h == null ? f34897i : abstractC7311h;
    }

    /* renamed from: l */
    public static final InterfaceC2139c m13687l(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, boolean z6) {
        if (!z6) {
            interfaceC2139c2 = null;
        }
        return (interfaceC2139c == null || interfaceC2139c2 == null || interfaceC2139c == interfaceC2139c2) ? interfaceC2139c == null ? interfaceC2139c2 : interfaceC2139c : new C7305b(interfaceC2139c, interfaceC2139c2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r6 = r0;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u2.a0 m13688m(u2.a0 r16, u2.InterfaceC7328y r17) {
        /*
            u2.a0 r0 = r17.mo8488b()
            long r1 = u2.AbstractC7316m.f34892d
            s1.u0 r3 = u2.AbstractC7316m.f34893e
            int r4 = r3.f32143a
            r5 = 0
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f32145c
            long[] r1 = (long[]) r1
            r2 = r1[r5]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r6 = 0
            r7 = r6
        L19:
            if (r0 == 0) goto L6c
            long r8 = r0.f34838a
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L24
            goto L65
        L24:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L69
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 > 0) goto L69
            long r8 = r8 - r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 64
            r15 = 1
            if (r12 < 0) goto L43
            int r12 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r12 >= 0) goto L43
            int r8 = (int) r8
            long r8 = r3 << r8
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L41
            goto L57
        L41:
            r15 = r5
            goto L57
        L43:
            int r12 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r12 < 0) goto L41
            r12 = 128(0x80, double:6.3E-322)
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 >= 0) goto L41
            int r8 = (int) r8
            int r8 = r8 + (-64)
            long r8 = r3 << r8
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L41
        L57:
            if (r15 != 0) goto L69
            if (r7 != 0) goto L5d
            r7 = r0
            goto L69
        L5d:
            long r1 = r0.f34838a
            long r3 = r7.f34838a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L67
        L65:
            r6 = r0
            goto L6c
        L67:
            r6 = r7
            goto L6c
        L69:
            u2.a0 r0 = r0.f34839b
            goto L19
        L6c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 == 0) goto L76
            r6.f34838a = r0
            return r6
        L76:
            r2 = r16
            u2.a0 r0 = r2.mo8495b(r0)
            u2.a0 r1 = r17.mo8488b()
            r0.f34839b = r1
            r1 = r17
            r1.mo8493j(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.AbstractC7316m.m13688m(u2.a0, u2.y):u2.a0");
    }

    /* renamed from: n */
    public static final void m13689n(AbstractC7311h abstractC7311h, InterfaceC7328y interfaceC7328y) {
        abstractC7311h.mo13658t(abstractC7311h.mo13653h() + 1);
        InterfaceC2139c interfaceC2139cMo13654i = abstractC7311h.mo13654i();
        if (interfaceC2139cMo13654i != null) {
            interfaceC2139cMo13654i.invoke(interfaceC7328y);
        }
    }

    /* renamed from: o */
    public static final a0 m13690o(a0 a0Var, AbstractC7329z abstractC7329z, AbstractC7311h abstractC7311h, a0 a0Var2) {
        a0 a0VarM13688m;
        if (abstractC7311h.mo13651f()) {
            abstractC7311h.mo13655n(abstractC7329z);
        }
        long jMo13652g = abstractC7311h.mo13652g();
        if (a0Var2.f34838a == jMo13652g) {
            return a0Var2;
        }
        synchronized (f34890b) {
            a0VarM13688m = m13688m(a0Var, abstractC7329z);
        }
        a0VarM13688m.f34838a = jMo13652g;
        if (a0Var2.f34838a != 1) {
            abstractC7311h.mo13655n(abstractC7329z);
        }
        return a0VarM13688m;
    }

    /* renamed from: p */
    public static final boolean m13691p(InterfaceC7328y interfaceC7328y) {
        a0 a0Var;
        long j6 = f34892d;
        u0 u0Var = f34893e;
        if (u0Var.f32143a > 0) {
            j6 = ((long[]) u0Var.f32145c)[0];
        }
        a0 a0Var2 = null;
        a0 a0VarMo8488b = null;
        int i10 = 0;
        for (a0 a0VarMo8488b2 = interfaceC7328y.mo8488b(); a0VarMo8488b2 != null; a0VarMo8488b2 = a0VarMo8488b2.f34839b) {
            long j10 = a0VarMo8488b2.f34838a;
            if (j10 != 0) {
                if (j10 >= j6) {
                    i10++;
                } else if (a0Var2 == null) {
                    i10++;
                    a0Var2 = a0VarMo8488b2;
                } else {
                    if (j10 < a0Var2.f34838a) {
                        a0Var = a0Var2;
                        a0Var2 = a0VarMo8488b2;
                    } else {
                        a0Var = a0VarMo8488b2;
                    }
                    if (a0VarMo8488b == null) {
                        a0VarMo8488b = interfaceC7328y.mo8488b();
                        a0 a0Var3 = a0VarMo8488b;
                        while (true) {
                            if (a0VarMo8488b == null) {
                                a0VarMo8488b = a0Var3;
                                break;
                            }
                            long j11 = a0VarMo8488b.f34838a;
                            if (j11 >= j6) {
                                break;
                            }
                            if (a0Var3.f34838a < j11) {
                                a0Var3 = a0VarMo8488b;
                            }
                            a0VarMo8488b = a0VarMo8488b.f34839b;
                        }
                    }
                    a0Var2.f34838a = 0L;
                    a0Var2.mo8494a(a0VarMo8488b);
                    a0Var2 = a0Var;
                }
            }
        }
        return i10 > 1;
    }

    /* renamed from: q */
    public static final void m13692q(InterfaceC7328y interfaceC7328y) {
        if (m13691p(interfaceC7328y)) {
            C0554l c0554l = f34894f;
            int i10 = c0554l.f3778b;
            int iIdentityHashCode = System.identityHashCode(interfaceC7328y);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = c0554l.f3778b - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = ((int[]) c0554l.f3779c)[i14];
                    if (i15 < iIdentityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > iIdentityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        C6743l c6743l = ((C6743l[]) c0554l.f3780d)[i14];
                        if (interfaceC7328y == (c6743l != null ? c6743l.get() : null)) {
                            i11 = i14;
                        } else {
                            for (int i16 = i14 - 1; -1 < i16 && ((int[]) c0554l.f3779c)[i16] == iIdentityHashCode; i16--) {
                                C6743l c6743l2 = ((C6743l[]) c0554l.f3780d)[i16];
                                if ((c6743l2 != null ? c6743l2.get() : null) == interfaceC7328y) {
                                    i11 = i16;
                                    break;
                                }
                            }
                            i14++;
                            int i17 = c0554l.f3778b;
                            while (true) {
                                if (i14 >= i17) {
                                    i11 = -(c0554l.f3778b + 1);
                                    break;
                                } else {
                                    if (((int[]) c0554l.f3779c)[i14] != iIdentityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    C6743l c6743l3 = ((C6743l[]) c0554l.f3780d)[i14];
                                    if ((c6743l3 != null ? c6743l3.get() : null) == interfaceC7328y) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            i11 = i14;
                        }
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            C6743l[] c6743lArr = (C6743l[]) c0554l.f3780d;
            int length = c6743lArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                C6743l[] c6743lArr2 = new C6743l[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(c6743lArr, i18, c6743lArr2, i20, i10 - i18);
                System.arraycopy((C6743l[]) c0554l.f3780d, 0, c6743lArr2, 0, i18);
                AbstractC6662l.m12717g(i20, (int[]) c0554l.f3779c, i18, i10, iArr);
                AbstractC6662l.m12722l(0, (int[]) c0554l.f3779c, i18, 6, iArr);
                c0554l.f3780d = c6743lArr2;
                c0554l.f3779c = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(c6743lArr, i18, c6743lArr, i21, i10 - i18);
                int[] iArr2 = (int[]) c0554l.f3779c;
                AbstractC6662l.m12717g(i21, iArr2, i18, i10, iArr2);
            }
            ((C6743l[]) c0554l.f3780d)[i18] = new C6743l(interfaceC7328y);
            ((int[]) c0554l.f3779c)[i18] = iIdentityHashCode;
            c0554l.f3778b++;
        }
    }

    /* renamed from: r */
    public static final void m13693r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* renamed from: s */
    public static final a0 m13694s(a0 a0Var, long j6, C7315l c7315l) {
        a0 a0Var2 = null;
        while (a0Var != null) {
            long j10 = a0Var.f34838a;
            if (j10 != 0 && j10 <= j6 && !c7315l.m13673j(j10) && (a0Var2 == null || a0Var2.f34838a < a0Var.f34838a)) {
                a0Var2 = a0Var;
            }
            a0Var = a0Var.f34839b;
        }
        if (a0Var2 != null) {
            return a0Var2;
        }
        return null;
    }

    /* renamed from: t */
    public static final a0 m13695t(a0 a0Var, InterfaceC7328y interfaceC7328y) {
        a0 a0VarM13694s;
        AbstractC7311h abstractC7311hM13686k = m13686k();
        InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13686k.mo13650e();
        if (interfaceC2139cMo13650e != null) {
            interfaceC2139cMo13650e.invoke(interfaceC7328y);
        }
        a0 a0VarM13694s2 = m13694s(a0Var, abstractC7311hM13686k.mo13652g(), abstractC7311hM13686k.mo13649d());
        if (a0VarM13694s2 != null) {
            return a0VarM13694s2;
        }
        synchronized (f34890b) {
            AbstractC7311h abstractC7311hM13686k2 = m13686k();
            a0 a0VarMo8488b = interfaceC7328y.mo8488b();
            AbstractC4154l.m8921d(a0VarMo8488b, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            a0VarM13694s = m13694s(a0VarMo8488b, abstractC7311hM13686k2.mo13652g(), abstractC7311hM13686k2.mo13649d());
            if (a0VarM13694s == null) {
                m13693r();
                throw null;
            }
        }
        return a0VarM13694s;
    }

    /* renamed from: u */
    public static final void m13696u(int i10) {
        u0 u0Var = f34893e;
        int i11 = ((int[]) u0Var.f32147e)[i10];
        u0Var.m12866f(i11, u0Var.f32143a - 1);
        u0Var.f32143a--;
        long[] jArr = (long[]) u0Var.f32145c;
        long j6 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (jArr[i13] <= j6) {
                break;
            }
            u0Var.m12866f(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) u0Var.f32145c;
        int i14 = u0Var.f32143a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < u0Var.f32143a) {
                long j10 = jArr2[i15];
                if (j10 < jArr2[i16]) {
                    if (j10 >= jArr2[i11]) {
                        break;
                    }
                    u0Var.m12866f(i15, i11);
                    i11 = i15;
                }
            }
            if (jArr2[i16] >= jArr2[i11]) {
                break;
            }
            u0Var.m12866f(i16, i11);
            i11 = i16;
        }
        ((int[]) u0Var.f32147e)[i10] = u0Var.f32144b;
        u0Var.f32144b = i10;
    }

    /* renamed from: v */
    public static final Object m13697v(C7306c c7306c, InterfaceC2139c interfaceC2139c) {
        long j6 = c7306c.f34874b;
        Object objInvoke = interfaceC2139c.invoke(f34891c.m13672h(j6));
        long j10 = f34892d;
        f34892d = 1 + j10;
        C7315l c7315lM13672h = f34891c.m13672h(j6);
        f34891c = c7315lM13672h;
        c7306c.f34874b = j10;
        c7306c.f34873a = c7315lM13672h;
        c7306c.f34856g = 0;
        c7306c.f34857h = null;
        c7306c.m13670o();
        f34891c = f34891c.m13675r(j10);
        return objInvoke;
    }

    /* renamed from: w */
    public static final a0 m13698w(a0 a0Var, InterfaceC7328y interfaceC7328y, AbstractC7311h abstractC7311h) {
        a0 a0VarM13694s;
        if (abstractC7311h.mo13651f()) {
            abstractC7311h.mo13655n(interfaceC7328y);
        }
        long jMo13652g = abstractC7311h.mo13652g();
        a0 a0VarM13694s2 = m13694s(a0Var, jMo13652g, abstractC7311h.mo13649d());
        if (a0VarM13694s2 == null) {
            m13693r();
            throw null;
        }
        if (a0VarM13694s2.f34838a == abstractC7311h.mo13652g()) {
            return a0VarM13694s2;
        }
        synchronized (f34890b) {
            a0VarM13694s = m13694s(interfaceC7328y.mo8488b(), jMo13652g, abstractC7311h.mo13649d());
            if (a0VarM13694s == null) {
                m13693r();
                throw null;
            }
            if (a0VarM13694s.f34838a != jMo13652g) {
                a0 a0VarM13688m = m13688m(a0VarM13694s, interfaceC7328y);
                a0VarM13688m.mo8494a(a0VarM13694s);
                a0VarM13688m.f34838a = abstractC7311h.mo13652g();
                a0VarM13694s = a0VarM13688m;
            }
        }
        if (a0VarM13694s2.f34838a != 1) {
            abstractC7311h.mo13655n(interfaceC7328y);
        }
        return a0VarM13694s;
    }
}
