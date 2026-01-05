package b8;

import ex.InterfaceC2141e;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.InterfaceC4024a;
import pg.a9;
import rw.C6661k;
import ww.AbstractC8199i;
import z7.d0;
import z7.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.v */
/* loaded from: classes.dex */
public final class C0627v implements e0, InterfaceC0628w {

    /* renamed from: a */
    public final C0612g f4086a;

    /* renamed from: b */
    public final boolean f4087b;

    /* renamed from: c */
    public final C6661k f4088c = new C6661k();

    /* renamed from: d */
    public final AtomicBoolean f4089d = new AtomicBoolean(false);

    public C0627v(C0612g c0612g, boolean z6) {
        this.f4086a = c0612g;
        this.f4087b = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z7.InterfaceC8888q
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1780a(java.lang.String r7, ex.InterfaceC2139c r8, ww.AbstractC8193c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof b8.C0626u
            if (r0 == 0) goto L13
            r0 = r9
            b8.u r0 = (b8.C0626u) r0
            int r1 = r0.f4085g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4085g = r1
            goto L18
        L13:
            b8.u r0 = new b8.u
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f4083e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f4085g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            b8.g r7 = r0.f4082d
            ex.c r8 = r0.f4081c
            java.lang.String r1 = r0.f4080b
            b8.v r0 = r0.f4079a
            og.od.m10798c(r9)
            r9 = r7
            r7 = r1
            goto L6f
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            og.od.m10798c(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r6.f4089d
            boolean r9 = r9.get()
            r2 = 21
            if (r9 != 0) goto L98
            uw.h r9 = r0.getContext()
            bl.a r5 = b8.C0606a.f3996b
            uw.f r9 = r9.o0(r5)
            b8.a r9 = (b8.C0606a) r9
            if (r9 == 0) goto L92
            b8.v r9 = r9.f3997a
            if (r9 != r6) goto L92
            r0.f4079a = r6
            r0.f4080b = r7
            r0.f4081c = r8
            b8.g r9 = r6.f4086a
            r0.f4082d = r9
            r0.f4085g = r3
            dy.a r2 = r9.f4020b
            java.lang.Object r0 = r2.mo1768h(r0)
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r6
        L6f:
            b8.n r1 = new b8.n     // Catch: java.lang.Throwable -> L85
            b8.g r2 = r0.f4086a     // Catch: java.lang.Throwable -> L85
            k8.c r7 = r2.y0(r7)     // Catch: java.lang.Throwable -> L85
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L87
            og.mb.m10760a(r1, r4)     // Catch: java.lang.Throwable -> L85
            r9.mo1769j(r4)
            return r7
        L85:
            r7 = move-exception
            goto L8e
        L87:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L89
        L89:
            r8 = move-exception
            og.mb.m10760a(r1, r7)     // Catch: java.lang.Throwable -> L85
            throw r8     // Catch: java.lang.Throwable -> L85
        L8e:
            r9.mo1769j(r4)
            throw r7
        L92:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            pg.a9.m11540c(r2, r7)
            throw r4
        L98:
            java.lang.String r7 = "Connection is recycled"
            pg.a9.m11540c(r2, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0627v.mo1780a(java.lang.String, ex.c, ww.c):java.lang.Object");
    }

    @Override // b8.InterfaceC0628w
    /* renamed from: b */
    public final InterfaceC4024a mo1781b() {
        return this.f4086a;
    }

    @Override // z7.e0
    /* renamed from: c */
    public final Object mo1782c(d0 d0Var, InterfaceC2141e interfaceC2141e, AbstractC8199i abstractC8199i) {
        if (this.f4089d.get()) {
            a9.m11540c(21, "Connection is recycled");
            throw null;
        }
        C0606a c0606a = (C0606a) abstractC8199i.getContext().o0(C0606a.f3996b);
        if (c0606a != null && c0606a.f3997a == this) {
            return m1786g(d0Var, interfaceC2141e, abstractC8199i);
        }
        a9.m11540c(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // z7.e0
    /* renamed from: d */
    public final Object mo1783d(AbstractC8199i abstractC8199i) {
        if (this.f4089d.get()) {
            a9.m11540c(21, "Connection is recycled");
            throw null;
        }
        C0606a c0606a = (C0606a) abstractC8199i.getContext().o0(C0606a.f3996b);
        if (c0606a != null && c0606a.f3997a == this) {
            return Boolean.valueOf(!this.f4088c.isEmpty());
        }
        a9.m11540c(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1784e(z7.d0 r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof b8.C0623r
            if (r1 == 0) goto L15
            r1 = r9
            b8.r r1 = (b8.C0623r) r1
            int r2 = r1.f4066f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f4066f = r2
            goto L1a
        L15:
            b8.r r1 = new b8.r
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f4064d
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f4066f
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            b8.g r8 = r1.f4063c
            z7.d0 r2 = r1.f4062b
            b8.v r1 = r1.f4061a
            og.od.m10798c(r9)
            r9 = r8
            r8 = r2
            goto L50
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            og.od.m10798c(r9)
            r1.f4061a = r7
            r1.f4062b = r8
            b8.g r9 = r7.f4086a
            r1.f4063c = r9
            r1.f4066f = r4
            dy.a r3 = r9.f4020b
            java.lang.Object r1 = r3.mo1768h(r1)
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            rw.k r3 = r1.f4088c     // Catch: java.lang.Throwable -> L73
            b8.g r1 = r1.f4086a     // Catch: java.lang.Throwable -> L73
            int r5 = r3.f31941c     // Catch: java.lang.Throwable -> L73
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto L87
            int[] r0 = b8.AbstractC0622q.f4060a     // Catch: java.lang.Throwable -> L73
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L73
            r8 = r0[r8]     // Catch: java.lang.Throwable -> L73
            if (r8 == r4) goto L81
            r0 = 2
            if (r8 == r0) goto L7b
            r0 = 3
            if (r8 != r0) goto L75
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            pg.a9.m11538a(r1, r8)     // Catch: java.lang.Throwable -> L73
            goto L9b
        L73:
            r8 = move-exception
            goto La9
        L75:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L73
            r8.<init>()     // Catch: java.lang.Throwable -> L73
            throw r8     // Catch: java.lang.Throwable -> L73
        L7b:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            pg.a9.m11538a(r1, r8)     // Catch: java.lang.Throwable -> L73
            goto L9b
        L81:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            pg.a9.m11538a(r1, r8)     // Catch: java.lang.Throwable -> L73
            goto L9b
        L87:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L73
            r8.append(r5)     // Catch: java.lang.Throwable -> L73
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L73
            pg.a9.m11538a(r1, r8)     // Catch: java.lang.Throwable -> L73
        L9b:
            b8.p r8 = new b8.p     // Catch: java.lang.Throwable -> L73
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L73
            r3.addLast(r8)     // Catch: java.lang.Throwable -> L73
            qw.a0 r8 = qw.a0.f30746a     // Catch: java.lang.Throwable -> L73
            r9.mo1769j(r2)
            return r8
        La9:
            r9.mo1769j(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0627v.m1784e(z7.d0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1785f(boolean r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof b8.C0624s
            if (r2 == 0) goto L17
            r2 = r9
            b8.s r2 = (b8.C0624s) r2
            int r3 = r2.f4072f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4072f = r3
            goto L1c
        L17:
            b8.s r2 = new b8.s
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f4070d
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f4072f
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            boolean r8 = r2.f4069c
            b8.g r3 = r2.f4068b
            b8.v r2 = r2.f4067a
            og.od.m10798c(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            og.od.m10798c(r9)
            r2.f4067a = r7
            b8.g r9 = r7.f4086a
            r2.f4068b = r9
            r2.f4069c = r8
            r2.f4072f = r5
            dy.a r4 = r9.f4020b
            java.lang.Object r2 = r4.mo1768h(r2)
            if (r2 != r3) goto L4f
            return r3
        L4f:
            r2 = r7
            r3 = r9
        L51:
            r9 = 0
            rw.k r4 = r2.f4088c     // Catch: java.lang.Throwable -> L75
            b8.g r2 = r2.f4086a     // Catch: java.lang.Throwable -> L75
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r5 != 0) goto Lb2
            java.lang.Object r5 = rw.AbstractC6663m.m12757U(r4)     // Catch: java.lang.Throwable -> L75
            b8.p r5 = (b8.C0621p) r5     // Catch: java.lang.Throwable -> L75
            r6 = 39
            if (r8 == 0) goto L8c
            r5.getClass()     // Catch: java.lang.Throwable -> L75
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L77
            java.lang.String r8 = "END TRANSACTION"
            pg.a9.m11538a(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L75:
            r8 = move-exception
            goto Lba
        L77:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f4059a     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            pg.a9.m11538a(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L8c:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L98
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            pg.a9.m11538a(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L98:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f4059a     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            pg.a9.m11538a(r2, r8)     // Catch: java.lang.Throwable -> L75
        Lac:
            qw.a0 r8 = qw.a0.f30746a     // Catch: java.lang.Throwable -> L75
            r3.mo1769j(r9)
            return r8
        Lb2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75
        Lba:
            r3.mo1769j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0627v.m1785f(boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1786g(z7.d0 r10, ex.InterfaceC2141e r11, ww.AbstractC8193c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0627v.m1786g(z7.d0, ex.e, ww.c):java.lang.Object");
    }
}
