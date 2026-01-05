package o3;

import a2.C0036i;
import kotlin.jvm.internal.AbstractC4155m;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o3.d */
/* loaded from: classes.dex */
public final class C5281d {

    /* renamed from: a */
    public C5284g f25935a;

    /* renamed from: b */
    public C5284g f25936b;

    /* renamed from: c */
    public AbstractC4155m f25937c = new C0036i(28, this);

    /* renamed from: d */
    public InterfaceC7266z f25938d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10428a(long r10, long r12, ww.AbstractC8193c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof o3.C5279b
            if (r0 == 0) goto L14
            r0 = r14
            o3.b r0 = (o3.C5279b) r0
            int r1 = r0.f25931c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f25931c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            o3.b r0 = new o3.b
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f25929a
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f25931c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            og.od.m10798c(r14)
            goto L83
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            og.od.m10798c(r14)
            goto L5f
        L38:
            og.od.m10798c(r14)
            o3.g r14 = r9.f25935a
            r1 = 0
            if (r14 == 0) goto L4b
            boolean r4 = r14.f37683p
            if (r4 == 0) goto L4b
            v3.a2 r14 = v3.AbstractC7634f.m14549j(r14)
            o3.g r14 = (o3.C5284g) r14
            goto L4c
        L4b:
            r14 = r1
        L4c:
            r4 = 0
            if (r14 != 0) goto L64
            o3.g r1 = r9.f25936b
            if (r1 == 0) goto L89
            r6.f25931c = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.mo6162s(r2, r4, r6)
            if (r14 != r0) goto L5f
            goto L82
        L5f:
            s4.q r14 = (s4.C6761q) r14
            long r4 = r14.f32216a
            goto L89
        L64:
            r7 = r12
            r12 = r2
            r2 = r10
            r10 = r4
            r4 = r7
            o3.g r13 = r9.f25935a
            if (r13 == 0) goto L78
            boolean r14 = r13.f37683p
            if (r14 == 0) goto L78
            v3.a2 r13 = v3.AbstractC7634f.m14549j(r13)
            r1 = r13
            o3.g r1 = (o3.C5284g) r1
        L78:
            if (r1 == 0) goto L88
            r6.f25931c = r12
            java.lang.Object r14 = r1.mo6162s(r2, r4, r6)
            if (r14 != r0) goto L83
        L82:
            return r0
        L83:
            s4.q r14 = (s4.C6761q) r14
            long r4 = r14.f32216a
            goto L89
        L88:
            r4 = r10
        L89:
            s4.q r10 = new s4.q
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C5281d.m10428a(long, long, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10429b(long r6, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o3.C5280c
            if (r0 == 0) goto L13
            r0 = r8
            o3.c r0 = (o3.C5280c) r0
            int r1 = r0.f25934c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25934c = r1
            goto L18
        L13:
            o3.c r0 = new o3.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f25932a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f25934c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            og.od.m10798c(r8)
            o3.g r8 = r5.f25935a
            r2 = 0
            if (r8 == 0) goto L42
            boolean r4 = r8.f37683p
            if (r4 == 0) goto L42
            v3.a2 r8 = v3.AbstractC7634f.m14549j(r8)
            r2 = r8
            o3.g r2 = (o3.C5284g) r2
        L42:
            if (r2 == 0) goto L52
            r0.f25934c = r3
            java.lang.Object r8 = r2.mo6163v(r6, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            s4.q r8 = (s4.C6761q) r8
            long r6 = r8.f32216a
            goto L54
        L52:
            r6 = 0
        L54:
            s4.q r8 = new s4.q
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C5281d.m10429b(long, ww.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: c */
    public final InterfaceC7266z m10430c() {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f25937c.invoke();
        if (interfaceC7266z != null) {
            return interfaceC7266z;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
