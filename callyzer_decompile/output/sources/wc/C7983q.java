package wc;

import aws.smithy.kotlin.runtime.io.ClosedWriteChannelException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tx.C7260t;
import tx.InterfaceC7258r;
import tx.f1;
import xc.C8322c;
import xc.C8323d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.q */
/* loaded from: classes.dex */
public final class C7983q implements InterfaceC7988v {

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38400j = AtomicIntegerFieldUpdater.newUpdater(C7983q.class, "d");

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38401k = AtomicIntegerFieldUpdater.newUpdater(C7983q.class, "e");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38402l = AtomicReferenceFieldUpdater.newUpdater(C7983q.class, Object.class, "f");

    /* renamed from: m */
    public static final /* synthetic */ AtomicLongFieldUpdater f38403m = AtomicLongFieldUpdater.newUpdater(C7983q.class, "g");

    /* renamed from: c */
    public final C8323d f38406c;

    /* renamed from: h */
    public final C8322c f38411h;

    /* renamed from: a */
    public final Object f38404a = new Object();

    /* renamed from: b */
    public final C7985s f38405b = new C7985s();

    /* renamed from: d */
    public volatile /* synthetic */ int f38407d = 0;

    /* renamed from: e */
    public volatile /* synthetic */ int f38408e = 0;

    /* renamed from: f */
    public volatile /* synthetic */ Object f38409f = null;

    /* renamed from: g */
    public volatile /* synthetic */ long f38410g = 0;

    public C7983q(int i10) {
        this.f38406c = new C8323d(i10);
        C8322c c8322c = new C8322c();
        c8322c.f39889a = null;
        this.f38411h = c8322c;
    }

    @Override // wc.InterfaceC7988v
    /* renamed from: Y */
    public final boolean mo15150Y(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!isClosedForWrite()) {
            C7970d c7970d = th2 == null ? AbstractC7984r.f38412a : new C7970d(th2);
            do {
                atomicReferenceFieldUpdater = f38402l;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, c7970d)) {
                    if (th2 == null) {
                        m15156z();
                        return true;
                    }
                    C8322c c8322c = this.f38411h;
                    c8322c.getClass();
                    InterfaceC7258r interfaceC7258r = (InterfaceC7258r) C8322c.f39888b.getAndSet(c8322c, null);
                    if (interfaceC7258r == null) {
                        return true;
                    }
                    ((f1) interfaceC7258r).m13558R(new C7260t(th2, false));
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == null);
        }
        return false;
    }

    @Override // wc.InterfaceC7989w
    public final boolean cancel(Throwable th2) {
        if (isClosedForWrite()) {
            return false;
        }
        if (th2 == null) {
            th2 = new CancellationException("Channel cancelled");
        }
        return mo15150Y(th2);
    }

    @Override // wc.InterfaceC7988v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo15150Y(null);
    }

    @Override // wc.InterfaceC7989w
    public final int getAvailableForRead() {
        return this.f38406c.f39894b;
    }

    @Override // wc.InterfaceC7989w
    public final Throwable getClosedCause() {
        C7970d c7970d = (C7970d) this.f38409f;
        if (c7970d != null) {
            return c7970d.f38342a;
        }
        return null;
    }

    /* renamed from: h */
    public final void m15151h(int i10) {
        C8323d c8323d = this.f38406c;
        c8323d.getClass();
        C8323d.f39891f.getAndAdd(c8323d, -i10);
        C8323d.f39892g.getAndAdd(c8323d, i10);
        f38403m.getAndAdd(this, i10);
        m15156z();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0079 -> B:33:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0083 -> B:58:0x0084). Please report as a decompilation issue!!! */
    @Override // wc.InterfaceC7988v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(wc.C7985s r12, long r13, uw.InterfaceC7559c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C7983q.i0(wc.s, long, uw.c):java.lang.Object");
    }

    @Override // wc.InterfaceC7989w
    public final boolean isClosedForRead() {
        if (getClosedCause() == null) {
            return isClosedForWrite() && this.f38406c.f39894b == 0;
        }
        return true;
    }

    @Override // wc.InterfaceC7989w
    public final boolean isClosedForWrite() {
        return this.f38409f != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15152j(int r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wc.C7978l
            if (r0 == 0) goto L13
            r0 = r7
            wc.l r0 = (wc.C7978l) r0
            int r1 = r0.f38379d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38379d = r1
            goto L18
        L13:
            wc.l r0 = new wc.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38377b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38379d
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            int r6 = r0.f38376a
            goto L2e
        L26:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            og.od.m10798c(r7)
        L31:
            xc.d r7 = r5.f38406c
            int r7 = r7.f39894b
            if (r7 >= r6) goto L50
            boolean r7 = r5.isClosedForRead()
            if (r7 != 0) goto L50
            xc.c r7 = r5.f38411h
            wc.k r2 = new wc.k
            r4 = 1
            r2.<init>(r5, r6, r4)
            r0.f38376a = r6
            r0.f38379d = r3
            java.lang.Object r7 = r7.m15517b(r2, r0)
            if (r7 != r1) goto L31
            return r1
        L50:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C7983q.m15152j(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15153n(int r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wc.C7979m
            if (r0 == 0) goto L13
            r0 = r7
            wc.m r0 = (wc.C7979m) r0
            int r1 = r0.f38383d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38383d = r1
            goto L18
        L13:
            wc.m r0 = new wc.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38381b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38383d
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            int r6 = r0.f38380a
            goto L2e
        L26:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            og.od.m10798c(r7)
        L31:
            xc.d r7 = r5.f38406c
            int r7 = r7.f39895c
            if (r7 >= r6) goto L56
            boolean r7 = r5.isClosedForWrite()
            if (r7 != 0) goto L56
            boolean r7 = r5.m15156z()
            if (r7 != 0) goto L31
            xc.c r7 = r5.f38411h
            wc.k r2 = new wc.k
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f38380a = r6
            r0.f38383d = r3
            java.lang.Object r7 = r7.m15517b(r2, r0)
            if (r7 != r1) goto L31
            return r1
        L56:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C7983q.m15153n(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:37:0x007f, B:39:0x0085, B:41:0x008b, B:45:0x009a), top: B:76:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:37:0x007f, B:39:0x0085, B:41:0x008b, B:45:0x009a), top: B:76:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wc.InterfaceC7989w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object read(wc.C7985s r11, long r12, uw.InterfaceC7559c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C7983q.read(wc.s, long, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15154u(ww.AbstractC8193c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof wc.C7980n
            if (r0 == 0) goto L13
            r0 = r5
            wc.n r0 = (wc.C7980n) r0
            int r1 = r0.f38386c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38386c = r1
            goto L18
        L13:
            wc.n r0 = new wc.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f38384a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38386c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r4.m15156z()
            r0.f38386c = r3
            java.lang.Object r5 = r4.m15153n(r3, r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            r4.m15155w()
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C7983q.m15154u(ww.c):java.lang.Object");
    }

    /* renamed from: w */
    public final void m15155w() throws Throwable {
        if (isClosedForWrite()) {
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            throw new ClosedWriteChannelException("Channel " + this + " is already closed");
        }
    }

    /* renamed from: z */
    public final boolean m15156z() {
        if (this.f38406c.f39896d == 0) {
            this.f38411h.m15516a();
            return false;
        }
        C8323d c8323d = this.f38406c;
        c8323d.getClass();
        int andSet = C8323d.f39892g.getAndSet(c8323d, 0);
        if (andSet != 0) {
            C8323d.f39890e.addAndGet(c8323d, andSet);
        }
        this.f38411h.m15516a();
        return true;
    }
}
