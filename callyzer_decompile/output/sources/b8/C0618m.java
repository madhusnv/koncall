package b8;

import b2.C0558p;
import dy.AbstractC1862j;
import dy.C1860h;
import dy.C1861i;
import ex.InterfaceC2137a;
import f1.AbstractC2176a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import rw.AbstractC6663m;
import sw.C6959c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.m */
/* loaded from: classes.dex */
public final class C0618m {

    /* renamed from: a */
    public final int f4046a;

    /* renamed from: b */
    public final InterfaceC2137a f4047b;

    /* renamed from: c */
    public final ReentrantLock f4048c = new ReentrantLock();

    /* renamed from: d */
    public int f4049d;

    /* renamed from: e */
    public boolean f4050e;

    /* renamed from: f */
    public final C0612g[] f4051f;

    /* renamed from: g */
    public final C1861i f4052g;

    /* renamed from: h */
    public final C0558p f4053h;

    public C0618m(int i10, InterfaceC2137a interfaceC2137a) {
        this.f4046a = i10;
        this.f4047b = interfaceC2137a;
        this.f4051f = new C0612g[i10];
        this.f4052g = AbstractC1862j.m5494a(i10);
        C0558p c0558p = new C0558p(1);
        if (i10 < 1) {
            AbstractC2176a.m5862c("capacity must be >= 1");
            throw null;
        }
        if (i10 > 1073741824) {
            AbstractC2176a.m5862c("capacity must be <= 2^30");
            throw null;
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        c0558p.f3797d = i10 - 1;
        c0558p.f3798e = new Object[i10];
        this.f4053h = c0558p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1771a(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof b8.C0616k
            if (r0 == 0) goto L13
            r0 = r9
            b8.k r0 = (b8.C0616k) r0
            int r1 = r0.f4038d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4038d = r1
            goto L18
        L13:
            b8.k r0 = new b8.k
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f4036b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f4038d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b8.m r0 = r0.f4035a
            og.od.m10798c(r9)
            goto L42
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            og.od.m10798c(r9)
            r0.f4035a = r8
            r0.f4038d = r3
            dy.i r9 = r8.f4052g
            java.lang.Object r9 = r9.m5491a(r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            r0 = r8
        L42:
            java.util.concurrent.locks.ReentrantLock r9 = r0.f4048c     // Catch: java.lang.Throwable -> L8f
            b2.p r1 = r0.f4053h     // Catch: java.lang.Throwable -> L8f
            r9.lock()     // Catch: java.lang.Throwable -> L8f
            boolean r2 = r0.f4050e     // Catch: java.lang.Throwable -> L91
            r4 = 0
            if (r2 != 0) goto L99
            int r2 = r1.f3795b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f3796c     // Catch: java.lang.Throwable -> L91
            if (r2 != r5) goto L75
            int r2 = r0.f4049d     // Catch: java.lang.Throwable -> L91
            int r5 = r0.f4046a     // Catch: java.lang.Throwable -> L91
            if (r2 < r5) goto L5b
            goto L75
        L5b:
            b8.g r2 = new b8.g     // Catch: java.lang.Throwable -> L91
            ex.a r5 = r0.f4047b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L91
            k8.a r5 = (k8.InterfaceC4024a) r5     // Catch: java.lang.Throwable -> L91
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L91
            b8.g[] r5 = r0.f4051f     // Catch: java.lang.Throwable -> L91
            int r6 = r0.f4049d     // Catch: java.lang.Throwable -> L91
            int r7 = r6 + 1
            r0.f4049d = r7     // Catch: java.lang.Throwable -> L91
            r5[r6] = r2     // Catch: java.lang.Throwable -> L91
            r1.m1653a(r2)     // Catch: java.lang.Throwable -> L91
        L75:
            int r2 = r1.f3795b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f3796c     // Catch: java.lang.Throwable -> L91
            if (r2 == r5) goto L93
            java.lang.Object r5 = r1.f3798e     // Catch: java.lang.Throwable -> L91
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L91
            r6 = r5[r2]     // Catch: java.lang.Throwable -> L91
            r5[r2] = r4     // Catch: java.lang.Throwable -> L91
            int r2 = r2 + r3
            int r3 = r1.f3797d     // Catch: java.lang.Throwable -> L91
            r2 = r2 & r3
            r1.f3795b = r2     // Catch: java.lang.Throwable -> L91
            b8.g r6 = (b8.C0612g) r6     // Catch: java.lang.Throwable -> L91
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            return r6
        L8f:
            r9 = move-exception
            goto La5
        L91:
            r1 = move-exception
            goto La1
        L93:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            throw r1     // Catch: java.lang.Throwable -> L91
        L99:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            pg.a9.m11540c(r2, r1)     // Catch: java.lang.Throwable -> L91
            throw r4     // Catch: java.lang.Throwable -> L91
        La1:
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            throw r1     // Catch: java.lang.Throwable -> L8f
        La5:
            dy.i r0 = r0.f4052g
            r0.m5493c()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0618m.m1771a(ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:11|48|12|26|50|33|(1:(1:43)(2:39|(1:41)))(1:35)|42|19|52|20|(2:22|(1:24)(10:25|26|50|33|(0)(0)|42|19|52|20|(2:27|28)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r15 = r15;
        r14 = r14;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:20:0x0043, B:22:0x005d, B:27:0x0072, B:28:0x0079), top: B:52:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:20:0x0043, B:22:0x005d, B:27:0x0072, B:28:0x0079), top: B:52:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:33:0x0086, B:35:0x008a, B:39:0x0092, B:43:0x0099), top: B:50:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v11, types: [ex.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:26:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1772b(long r12, b8.C0609d r14, ww.AbstractC8193c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof b8.C0617l
            if (r0 == 0) goto L13
            r0 = r15
            b8.l r0 = (b8.C0617l) r0
            int r1 = r0.f4045g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4045g = r1
            goto L18
        L13:
            b8.l r0 = new b8.l
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f4043e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f4045g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r12 = r0.f4042d
            kotlin.jvm.internal.z r14 = r0.f4041c
            ex.a r2 = r0.f4040b
            b8.m r5 = r0.f4039a
            og.od.m10798c(r15)     // Catch: java.lang.Throwable -> L30
            goto L6d
        L30:
            r15 = move-exception
            goto L81
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            og.od.m10798c(r15)
            r5 = r11
        L3e:
            kotlin.jvm.internal.z r15 = new kotlin.jvm.internal.z
            r15.<init>()
            aq.i r2 = new aq.i     // Catch: java.lang.Throwable -> L7f
            r6 = 5
            r2.<init>(r15, r5, r4, r6)     // Catch: java.lang.Throwable -> L7f
            r0.f4039a = r5     // Catch: java.lang.Throwable -> L7f
            r0.f4040b = r14     // Catch: java.lang.Throwable -> L7f
            r0.f4041c = r15     // Catch: java.lang.Throwable -> L7f
            r0.f4042d = r12     // Catch: java.lang.Throwable -> L7f
            r0.f4045g = r3     // Catch: java.lang.Throwable -> L7f
            long r6 = tx.c0.m13472H(r12)     // Catch: java.lang.Throwable -> L7f
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L72
            tx.z1 r8 = new tx.z1     // Catch: java.lang.Throwable -> L7f
            r8.<init>(r6, r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = tx.c0.m13470F(r8, r2)     // Catch: java.lang.Throwable -> L7f
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r2 = r14
            r14 = r15
        L6d:
            r15 = r14
            r14 = r2
            r2 = r0
            r0 = r4
            goto L86
        L72:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L7f
            java.lang.String r6 = "Timed out immediately"
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L7f
            throw r2     // Catch: java.lang.Throwable -> L7f
        L7a:
            r10 = r2
            r2 = r14
            r14 = r15
            r15 = r10
            goto L81
        L7f:
            r2 = move-exception
            goto L7a
        L81:
            r10 = r15
            r15 = r14
            r14 = r2
            r2 = r0
            r0 = r10
        L86:
            boolean r6 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L8e
            if (r6 == 0) goto L90
            r14.invoke()     // Catch: java.lang.Throwable -> L8e
            goto L97
        L8e:
            r12 = move-exception
            goto L9a
        L90:
            if (r0 != 0) goto L99
            java.lang.Object r15 = r15.f21164a     // Catch: java.lang.Throwable -> L8e
            if (r15 == 0) goto L97
            return r15
        L97:
            r0 = r2
            goto L3e
        L99:
            throw r0     // Catch: java.lang.Throwable -> L8e
        L9a:
            java.lang.Object r13 = r15.f21164a
            b8.g r13 = (b8.C0612g) r13
            if (r13 == 0) goto La3
            r5.m1775e(r13)
        La3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0618m.m1772b(long, b8.d, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public final void m1773c() {
        ReentrantLock reentrantLock = this.f4048c;
        reentrantLock.lock();
        try {
            this.f4050e = true;
            for (C0612g c0612g : this.f4051f) {
                if (c0612g != null) {
                    c0612g.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final void m1774d(StringBuilder sb2) {
        C0558p c0558p = this.f4053h;
        ReentrantLock reentrantLock = this.f4048c;
        reentrantLock.lock();
        try {
            C6959c c6959cM10829d = pe.m10829d();
            int i10 = (c0558p.f3796c - c0558p.f3795b) & c0558p.f3797d;
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 >= 0) {
                    int i12 = c0558p.f3796c;
                    int i13 = c0558p.f3795b;
                    int i14 = c0558p.f3797d;
                    if (i11 < ((i12 - i13) & i14)) {
                        Object obj = ((Object[]) c0558p.f3798e)[(i13 + i11) & i14];
                        AbstractC4154l.m8920c(obj);
                        c6959cM10829d.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C6959c c6959cM10828c = pe.m10828c(c6959cM10829d);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f4046a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            C1861i c1861i = this.f4052g;
            c1861i.getClass();
            sb3.append(Math.max(C1860h.f8840g.get(c1861i), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + c6959cM10828c.mo10411b() + ")[" + AbstractC6663m.m12748L(c6959cM10828c, null, null, null, null, 63) + "], ");
            sb2.append(")");
            sb2.append('\n');
            C0612g[] c0612gArr = this.f4051f;
            int length = c0612gArr.length;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                C0612g c0612g = c0612gArr[i16];
                i15++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i15);
                sb4.append("] - ");
                sb4.append(c0612g != null ? c0612g.f4019a.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (c0612g != null) {
                    c0612g.m1770n(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: e */
    public final void m1775e(C0612g connection) {
        AbstractC4154l.m8923f(connection, "connection");
        ReentrantLock reentrantLock = this.f4048c;
        reentrantLock.lock();
        try {
            this.f4053h.m1653a(connection);
            reentrantLock.unlock();
            this.f4052g.m5493c();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
