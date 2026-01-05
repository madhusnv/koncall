package i00;

import a9.C0073l;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 implements InvocationHandler {

    /* renamed from: a */
    public final Object[] f16736a = new Object[0];

    /* renamed from: b */
    public final /* synthetic */ Class f16737b;

    /* renamed from: c */
    public final /* synthetic */ C0073l f16738c;

    public q0(C0073l c0073l, Class cls) {
        this.f16738c = c0073l;
        this.f16737b = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r1 = i00.AbstractC3112q.m7459b(r10, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r10.f264a).put(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r9 = (i00.AbstractC3112q) r2;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r7.f16737b
            java.lang.Class r1 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto Lf
            java.lang.Object r8 = r9.invoke(r7, r10)
            return r8
        Lf:
            if (r10 == 0) goto L13
        L11:
            r4 = r10
            goto L16
        L13:
            java.lang.Object[] r10 = r7.f16736a
            goto L11
        L16:
            i00.a r10 = i00.i0.f16667b
            boolean r1 = r10.mo7437f(r9)
            if (r1 == 0) goto L23
            java.lang.Object r8 = r10.mo7436e(r9, r0, r8, r4)
            return r8
        L23:
            a9.l r10 = r7.f16738c
        L25:
            java.lang.Object r1 = r10.f264a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r9)
            boolean r2 = r1 instanceof i00.AbstractC3112q
            if (r2 == 0) goto L35
            i00.q r1 = (i00.AbstractC3112q) r1
        L33:
            r9 = r1
            goto L79
        L35:
            if (r1 != 0) goto L65
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            monitor-enter(r2)
            java.lang.Object r1 = r10.f264a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.putIfAbsent(r9, r2)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L61
            i00.q r1 = i00.AbstractC3112q.m7459b(r10, r0, r9)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r10 = r10.f264a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.put(r9, r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L33
        L54:
            r0 = move-exception
            r8 = r0
            goto L63
        L57:
            r0 = move-exception
            r8 = r0
            java.lang.Object r10 = r10.f264a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.remove(r9)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L65
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r8
        L65:
            monitor-enter(r1)
            java.lang.Object r2 = r10.f264a     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L75
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            goto L25
        L72:
            r0 = move-exception
            r8 = r0
            goto L8a
        L75:
            r9 = r2
            i00.q r9 = (i00.AbstractC3112q) r9     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
        L79:
            i00.x r1 = new i00.x
            i00.o0 r2 = r9.f16733a
            iz.d r5 = r9.f16734b
            i00.k r6 = r9.f16735c
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = r9.mo7456a(r1, r4)
            return r8
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i00.q0.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
