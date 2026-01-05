package o3;

import a2.C0036i;
import c3.C0847b;
import kotlin.jvm.internal.C4168z;
import o1.k0;
import tx.InterfaceC7266z;
import v3.AbstractC7634f;
import v3.a2;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o3.g */
/* loaded from: classes.dex */
public final class C5284g extends AbstractC7878q implements a2, InterfaceC5278a {

    /* renamed from: q */
    public InterfaceC5278a f25950q;

    /* renamed from: r */
    public C5281d f25951r;

    /* renamed from: s */
    public C5284g f25952s;

    /* renamed from: t */
    public final String f25953t;

    public C5284g(InterfaceC5278a interfaceC5278a, C5281d c5281d) {
        this.f25950q = interfaceC5278a;
        this.f25951r = c5281d == null ? new C5281d() : c5281d;
        this.f25953t = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // o3.InterfaceC5278a
    /* renamed from: B */
    public final long mo6161B(int i10, long j6) {
        boolean z6 = this.f37683p;
        C5284g c5284g = null;
        if (z6 && z6) {
            c5284g = (C5284g) AbstractC7634f.m14549j(this);
        }
        long jMo6161B = c5284g != null ? c5284g.mo6161B(i10, j6) : 0L;
        return C0847b.m2276g(jMo6161B, this.f25950q.mo6161B(i10, C0847b.m2275f(j6, jMo6161B)));
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        C5281d c5281d = this.f25951r;
        c5281d.f25935a = this;
        c5281d.f25936b = null;
        this.f25952s = null;
        c5281d.f25937c = new C0036i(29, this);
        c5281d.f25938d = z0();
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        C4168z c4168z = new C4168z();
        AbstractC7634f.m14538A(this, new k0(c4168z, 2));
        C5284g c5284g = (C5284g) ((a2) c4168z.f21164a);
        this.f25952s = c5284g;
        C5281d c5281d = this.f25951r;
        c5281d.f25936b = c5284g;
        if (c5281d.f25935a == this) {
            c5281d.f25935a = null;
        }
    }

    public final InterfaceC7266z L0() {
        C5284g c5284g = this.f37683p ? (C5284g) AbstractC7634f.m14549j(this) : null;
        if (c5284g != null) {
            return c5284g.L0();
        }
        InterfaceC7266z interfaceC7266z = this.f25951r.f25938d;
        if (interfaceC7266z != null) {
            return interfaceC7266z;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // o3.InterfaceC5278a
    public final long d0(int i10, long j6, long j10) {
        long jD0 = this.f25950q.d0(i10, j6, j10);
        boolean z6 = this.f37683p;
        C5284g c5284g = null;
        if (z6 && z6) {
            c5284g = (C5284g) AbstractC7634f.m14549j(this);
        }
        C5284g c5284g2 = c5284g;
        return C0847b.m2276g(jD0, c5284g2 != null ? c5284g2.d0(i10, C0847b.m2276g(j6, jD0), C0847b.m2275f(j10, jD0)) : 0L);
    }

    @Override // v3.a2
    /* renamed from: h */
    public final Object mo7492h() {
        return this.f25953t;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // o3.InterfaceC5278a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo6162s(long r11, long r13, uw.InterfaceC7559c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof o3.C5282e
            if (r0 == 0) goto L14
            r0 = r15
            o3.e r0 = (o3.C5282e) r0
            int r1 = r0.f25944f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f25944f = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            o3.e r0 = new o3.e
            ww.c r15 = (ww.AbstractC8193c) r15
            r0.<init>(r10, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r6.f25942d
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f25944f
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 == r2) goto L39
            if (r1 != r7) goto L31
            long r11 = r6.f25940b
            og.od.m10798c(r15)
            goto L8f
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            long r13 = r6.f25941c
            long r11 = r6.f25940b
            o3.g r1 = r6.f25939a
            og.od.m10798c(r15)
            goto L5c
        L43:
            og.od.m10798c(r15)
            o3.a r1 = r10.f25950q
            r6.f25939a = r10
            r6.f25940b = r11
            r6.f25941c = r13
            r6.f25944f = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.mo6162s(r2, r4, r6)
            if (r15 != r0) goto L59
            goto L8d
        L59:
            r1 = r10
            r11 = r2
            r13 = r4
        L5c:
            s4.q r15 = (s4.C6761q) r15
            long r8 = r15.f32216a
            boolean r15 = r1.f37683p
            r2 = 0
            if (r15 == 0) goto L73
            if (r15 == 0) goto L70
            if (r15 == 0) goto L70
            v3.a2 r15 = v3.AbstractC7634f.m14549j(r1)
            o3.g r15 = (o3.C5284g) r15
            goto L71
        L70:
            r15 = r2
        L71:
            r1 = r15
            goto L76
        L73:
            o3.g r15 = r1.f25952s
            goto L71
        L76:
            if (r1 == 0) goto L95
            long r11 = s4.C6761q.m12962e(r11, r8)
            long r4 = s4.C6761q.m12961d(r13, r8)
            r6.f25939a = r2
            r6.f25940b = r8
            r6.f25944f = r7
            r2 = r11
            java.lang.Object r15 = r1.mo6162s(r2, r4, r6)
            if (r15 != r0) goto L8e
        L8d:
            return r0
        L8e:
            r11 = r8
        L8f:
            s4.q r15 = (s4.C6761q) r15
            long r13 = r15.f32216a
            r8 = r11
            goto L97
        L95:
            r13 = 0
        L97:
            long r11 = s4.C6761q.m12962e(r8, r13)
            s4.q r13 = new s4.q
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C5284g.mo6162s(long, long, uw.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r12 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o3.InterfaceC5278a
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo6163v(long r10, uw.InterfaceC7559c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o3.C5283f
            if (r0 == 0) goto L13
            r0 = r12
            o3.f r0 = (o3.C5283f) r0
            int r1 = r0.f25949e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25949e = r1
            goto L1a
        L13:
            o3.f r0 = new o3.f
            ww.c r12 = (ww.AbstractC8193c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.f25947c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f25949e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            long r10 = r0.f25946b
            og.od.m10798c(r12)
            goto L7f
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            long r10 = r0.f25946b
            o3.g r2 = r0.f25945a
            og.od.m10798c(r12)
            goto L60
        L3f:
            og.od.m10798c(r12)
            boolean r12 = r9.f37683p
            if (r12 == 0) goto L4f
            if (r12 == 0) goto L4f
            v3.a2 r12 = v3.AbstractC7634f.m14549j(r9)
            o3.g r12 = (o3.C5284g) r12
            goto L50
        L4f:
            r12 = r3
        L50:
            if (r12 == 0) goto L68
            r0.f25945a = r9
            r0.f25946b = r10
            r0.f25949e = r5
            java.lang.Object r12 = r12.mo6163v(r10, r0)
            if (r12 != r1) goto L5f
            goto L7e
        L5f:
            r2 = r9
        L60:
            s4.q r12 = (s4.C6761q) r12
            long r5 = r12.f32216a
        L64:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L6c
        L68:
            r5 = 0
            r2 = r9
            goto L64
        L6c:
            o3.a r12 = r2.f25950q
            long r5 = s4.C6761q.m12961d(r5, r10)
            r0.f25945a = r3
            r0.f25946b = r10
            r0.f25949e = r4
            java.lang.Object r12 = r12.mo6163v(r5, r0)
            if (r12 != r1) goto L7f
        L7e:
            return r1
        L7f:
            s4.q r12 = (s4.C6761q) r12
            long r0 = r12.f32216a
            long r10 = s4.C6761q.m12962e(r10, r0)
            s4.q r12 = new s4.q
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C5284g.mo6163v(long, uw.c):java.lang.Object");
    }
}
