package ay;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C4168z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.b */
/* loaded from: classes3.dex */
public final class C0492b extends Thread {

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3518j = AtomicIntegerFieldUpdater.newUpdater(C0492b.class, "workerCtl$volatile");

    /* renamed from: a */
    public final C0504n f3519a;

    /* renamed from: b */
    public final C4168z f3520b;

    /* renamed from: c */
    public EnumC0493c f3521c;

    /* renamed from: d */
    public long f3522d;

    /* renamed from: e */
    public long f3523e;

    /* renamed from: f */
    public int f3524f;

    /* renamed from: g */
    public boolean f3525g;

    /* renamed from: h */
    public final /* synthetic */ ExecutorC0494d f3526h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C0492b(ExecutorC0494d executorC0494d, int i10) {
        this.f3526h = executorC0494d;
        setDaemon(true);
        setContextClassLoader(ExecutorC0494d.class.getClassLoader());
        this.f3519a = new C0504n();
        this.f3520b = new C4168z();
        this.f3521c = EnumC0493c.DORMANT;
        this.nextParkedWorker = ExecutorC0494d.f3530l;
        int iNanoTime = (int) System.nanoTime();
        this.f3524f = iNanoTime == 0 ? 42 : iNanoTime;
        m1488f(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = ay.C0504n.f3555d.get(r10);
        r0 = ay.C0504n.f3554c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (ay.C0504n.f3556e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.m1500c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ay.AbstractRunnableC0500j m1483a(boolean r12) {
        /*
            r11 = this;
            ay.c r0 = r11.f3521c
            ay.c r1 = ay.EnumC0493c.CPU_ACQUIRED
            ay.d r3 = r11.f3526h
            r8 = 0
            r9 = 1
            ay.n r10 = r11.f3519a
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ay.ExecutorC0494d.f3528j
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L73
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = ay.C0504n.f3553b
            java.lang.Object r0 = r12.get(r10)
            ay.j r0 = (ay.AbstractRunnableC0500j) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f3544b
            if (r1 != r9) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r8)
            if (r1 == 0) goto L3a
            r8 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = ay.C0504n.f3555d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ay.C0504n.f3554c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ay.C0504n.f3556e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            ay.j r1 = r10.m1500c(r0, r9)
            if (r1 == 0) goto L4d
            r8 = r1
        L61:
            if (r8 != 0) goto L72
            ay.g r12 = r3.f3536f
            java.lang.Object r12 = r12.m16268d()
            ay.j r12 = (ay.AbstractRunnableC0500j) r12
            if (r12 != 0) goto L71
            ay.j r12 = r11.m1491i(r9)
        L71:
            return r12
        L72:
            return r8
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = ay.ExecutorC0494d.f3528j
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            ay.c r0 = ay.EnumC0493c.CPU_ACQUIRED
            r11.f3521c = r0
        L86:
            if (r12 == 0) goto Lba
            int r12 = r3.f3531a
            int r12 = r12 * 2
            int r12 = r11.m1486d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r9 = 0
        L94:
            if (r9 == 0) goto L9d
            ay.j r12 = r11.m1487e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = ay.C0504n.f3553b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            ay.j r12 = (ay.AbstractRunnableC0500j) r12
            if (r12 != 0) goto Lae
            ay.j r12 = r10.m1499b()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r9 != 0) goto Lc1
            ay.j r12 = r11.m1487e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            ay.j r12 = r11.m1487e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            ay.j r12 = r11.m1491i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ay.C0492b.m1483a(boolean):ay.j");
    }

    /* renamed from: b */
    public final int m1484b() {
        return this.indexInArray;
    }

    /* renamed from: c */
    public final Object m1485c() {
        return this.nextParkedWorker;
    }

    /* renamed from: d */
    public final int m1486d(int i10) {
        int i11 = this.f3524f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f3524f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    /* renamed from: e */
    public final AbstractRunnableC0500j m1487e() {
        int iM1486d = m1486d(2);
        ExecutorC0494d executorC0494d = this.f3526h;
        if (iM1486d == 0) {
            AbstractRunnableC0500j abstractRunnableC0500j = (AbstractRunnableC0500j) executorC0494d.f3535e.m16268d();
            return abstractRunnableC0500j != null ? abstractRunnableC0500j : (AbstractRunnableC0500j) executorC0494d.f3536f.m16268d();
        }
        AbstractRunnableC0500j abstractRunnableC0500j2 = (AbstractRunnableC0500j) executorC0494d.f3536f.m16268d();
        return abstractRunnableC0500j2 != null ? abstractRunnableC0500j2 : (AbstractRunnableC0500j) executorC0494d.f3535e.m16268d();
    }

    /* renamed from: f */
    public final void m1488f(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3526h.f3534d);
        sb2.append("-worker-");
        sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    /* renamed from: g */
    public final void m1489g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: h */
    public final boolean m1490h(EnumC0493c enumC0493c) {
        EnumC0493c enumC0493c2 = this.f3521c;
        boolean z6 = enumC0493c2 == EnumC0493c.CPU_ACQUIRED;
        if (z6) {
            ExecutorC0494d.f3528j.addAndGet(this.f3526h, 4398046511104L);
        }
        if (enumC0493c2 != enumC0493c) {
            this.f3521c = enumC0493c;
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ay.AbstractRunnableC0500j m1491i(int r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ay.C0492b.m1491i(int):ay.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ay.C0492b.run():void");
    }
}
