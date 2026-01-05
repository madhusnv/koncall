package mz;

import ex.InterfaceC2137a;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import og.i1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mz.c */
/* loaded from: classes3.dex */
public final class C4919c {

    /* renamed from: a */
    public final C4920d f24465a;

    /* renamed from: b */
    public final String f24466b;

    /* renamed from: c */
    public boolean f24467c;

    /* renamed from: d */
    public AbstractC4917a f24468d;

    /* renamed from: e */
    public final ArrayList f24469e;

    /* renamed from: f */
    public boolean f24470f;

    public C4919c(C4920d c4920d, String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f24465a = c4920d;
        this.f24466b = name;
        this.f24469e = new ArrayList();
    }

    /* renamed from: c */
    public static void m9815c(C4919c c4919c, String name, InterfaceC2137a block) {
        c4919c.getClass();
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(block, "block");
        c4919c.m9818d(new C4918b(0, block, name), 0L);
    }

    /* renamed from: a */
    public final void m9816a() {
        C4920d c4920d = this.f24465a;
        TimeZone timeZone = AbstractC4299e.f21707a;
        synchronized (c4920d) {
            if (m9817b()) {
                this.f24465a.m9823c(this);
            }
        }
    }

    /* renamed from: b */
    public final boolean m9817b() {
        AbstractC4917a abstractC4917a = this.f24468d;
        if (abstractC4917a != null && abstractC4917a.f24460b) {
            this.f24470f = true;
        }
        ArrayList arrayList = this.f24469e;
        boolean z6 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC4917a) arrayList.get(size)).f24460b) {
                Logger logger = this.f24465a.f24474b;
                AbstractC4917a abstractC4917a2 = (AbstractC4917a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    i1.m10695a(logger, abstractC4917a2, this, "canceled");
                }
                arrayList.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: d */
    public final void m9818d(AbstractC4917a task, long j6) {
        AbstractC4154l.m8923f(task, "task");
        synchronized (this.f24465a) {
            if (!this.f24467c) {
                if (m9819e(task, j6, false)) {
                    this.f24465a.m9823c(this);
                }
            } else if (task.f24460b) {
                Logger logger = this.f24465a.f24474b;
                if (logger.isLoggable(Level.FINE)) {
                    i1.m10695a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f24465a.f24474b;
                if (logger2.isLoggable(Level.FINE)) {
                    i1.m10695a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9819e(mz.AbstractC4917a r12, long r13, boolean r15) {
        /*
            r11 = this;
            mz.d r0 = r11.f24465a
            java.util.logging.Logger r0 = r0.f24474b
            java.lang.String r1 = "task"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r12, r1)
            mz.c r1 = r12.f24461c
            if (r1 != r11) goto Le
            goto L12
        Le:
            if (r1 != 0) goto L89
            r12.f24461c = r11
        L12:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f24469e
            int r6 = r5.indexOf(r12)
            r7 = -1
            r8 = 0
            if (r6 == r7) goto L39
            long r9 = r12.f24462d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L36
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L88
            java.lang.String r13 = "already scheduled"
            og.i1.m10695a(r0, r12, r11, r13)
            return r8
        L36:
            r5.remove(r6)
        L39:
            r12.f24462d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r15 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r15 = og.i1.m10696b(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r15 = og.i1.m10696b(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5c:
            og.i1.m10695a(r0, r12, r11, r15)
        L5f:
            int r15 = r5.size()
            r0 = r8
            r3 = r0
        L65:
            if (r3 >= r15) goto L7a
            java.lang.Object r4 = r5.get(r3)
            int r3 = r3 + 1
            mz.a r4 = (mz.AbstractC4917a) r4
            long r9 = r4.f24462d
            long r9 = r9 - r1
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L77
            goto L7b
        L77:
            int r0 = r0 + 1
            goto L65
        L7a:
            r0 = r7
        L7b:
            if (r0 != r7) goto L81
            int r0 = r5.size()
        L81:
            r5.add(r0, r12)
            if (r0 != 0) goto L88
            r12 = 1
            return r12
        L88:
            return r8
        L89:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mz.C4919c.m9819e(mz.a, long, boolean):boolean");
    }

    /* renamed from: f */
    public final void m9820f() {
        C4920d c4920d = this.f24465a;
        TimeZone timeZone = AbstractC4299e.f21707a;
        synchronized (c4920d) {
            this.f24467c = true;
            if (m9817b()) {
                this.f24465a.m9823c(this);
            }
        }
    }

    public final String toString() {
        return this.f24466b;
    }
}
