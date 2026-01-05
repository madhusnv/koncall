package ik;

import fk.m1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4154l;
import o6.InterfaceC5304f;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.o */
/* loaded from: classes.dex */
public final class C3291o {

    /* renamed from: a */
    public final m1 f17514a;

    /* renamed from: b */
    public final InterfaceC5304f f17515b;

    /* renamed from: c */
    public final AtomicReference f17516c;

    public C3291o(InterfaceC7564h backgroundDispatcher, m1 timeProvider, InterfaceC5304f sessionConfigsDataStore) {
        AbstractC4154l.m8923f(backgroundDispatcher, "backgroundDispatcher");
        AbstractC4154l.m8923f(timeProvider, "timeProvider");
        AbstractC4154l.m8923f(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f17514a = timeProvider;
        this.f17515b = sessionConfigsDataStore;
        this.f17516c = new AtomicReference();
        c0.m13502y(c0.m13479b(backgroundDispatcher), null, null, new C3289m(this, null, 0), 3);
    }

    /* renamed from: a */
    public final C3284h m7635a() throws Throwable {
        AtomicReference atomicReference = this.f17516c;
        if (atomicReference.get() == null) {
            Object objM13468D = c0.m13468D(C7565i.f36440a, new C3289m(this, null, 1));
            while (!atomicReference.compareAndSet(null, objM13468D) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        AbstractC4154l.m8922e(obj, "get(...)");
        return (C3284h) obj;
    }

    /* renamed from: b */
    public final boolean m7636b() {
        Long l9 = m7635a().f17497e;
        Integer num = m7635a().f17496d;
        return l9 == null || num == null || this.f17514a.m5981a().f10455c - l9.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7637c(ik.C3284h r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ik.C3290n
            if (r0 == 0) goto L13
            r0 = r8
            ik.n r0 = (ik.C3290n) r0
            int r1 = r0.f17513c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17513c = r1
            goto L18
        L13:
            ik.n r0 = new ik.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f17511a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17513c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r8)     // Catch: java.io.IOException -> L27
            goto L4a
        L27:
            r7 = move-exception
            goto L47
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            og.od.m10798c(r8)
            o6.f r8 = r6.f17515b     // Catch: java.io.IOException -> L27
            bu.a r2 = new bu.a     // Catch: java.io.IOException -> L27
            r4 = 0
            r5 = 10
            r2.<init>(r7, r4, r5)     // Catch: java.io.IOException -> L27
            r0.f17513c = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r7 = r8.mo10447a(r2, r0)     // Catch: java.io.IOException -> L27
            if (r7 != r1) goto L4a
            return r1
        L47:
            r7.toString()
        L4a:
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.C3291o.m7637c(ik.h, ww.c):java.lang.Object");
    }
}
