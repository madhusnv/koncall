package o6;

import aw.C0473m;
import dy.AbstractC1856d;
import dy.C1855c;
import f9.C2222e;
import ww.AbstractC8193c;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 implements j0 {

    /* renamed from: a */
    public final C1855c f26002a = AbstractC1856d.m5490a();

    /* renamed from: b */
    public final C5299a f26003b = new C5299a();

    /* renamed from: c */
    public final C2222e f26004c = new C2222e(new C0473m(2, 9, null));

    public a1(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o6.j0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10440a(ex.InterfaceC2139c r8, ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o6.y0
            if (r0 == 0) goto L13
            r0 = r9
            o6.y0 r0 = (o6.y0) r0
            int r1 = r0.f26205e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26205e = r1
            goto L18
        L13:
            o6.y0 r0 = new o6.y0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f26203c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26205e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f26201a
            dy.a r8 = (dy.InterfaceC1853a) r8
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            dy.c r8 = r0.f26202b
            java.lang.Object r2 = r0.f26201a
            ex.c r2 = (ex.InterfaceC2139c) r2
            og.od.m10798c(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            og.od.m10798c(r9)
            r0.f26201a = r8
            dy.c r9 = r7.f26002a
            r0.f26202b = r9
            r0.f26205e = r4
            java.lang.Object r2 = r9.mo1768h(r0)
            if (r2 != r1) goto L57
            goto L63
        L57:
            r0.f26201a = r9     // Catch: java.lang.Throwable -> L6b
            r0.f26202b = r5     // Catch: java.lang.Throwable -> L6b
            r0.f26205e = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            r8.mo1769j(r5)
            return r9
        L6b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            r8.mo1769j(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.a1.mo10440a(ex.c, ww.c):java.lang.Object");
    }

    @Override // o6.j0
    /* renamed from: b */
    public final Object mo10441b(aw.f0 f0Var) {
        return new Integer(this.f26003b.f26000a.incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o6.j0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10442c(ex.InterfaceC2141e r7, ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o6.z0
            if (r0 == 0) goto L13
            r0 = r8
            o6.z0 r0 = (o6.z0) r0
            int r1 = r0.f26213e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26213e = r1
            goto L18
        L13:
            o6.z0 r0 = new o6.z0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f26211c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26213e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f26210b
            dy.c r0 = r0.f26209a
            og.od.m10798c(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            og.od.m10798c(r8)
            dy.c r8 = r6.f26002a
            boolean r2 = r8.m5489e()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f26209a = r8     // Catch: java.lang.Throwable -> L59
            r0.f26210b = r2     // Catch: java.lang.Throwable -> L59
            r0.f26213e = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.mo1769j(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.mo1769j(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.a1.mo10442c(ex.e, ww.c):java.lang.Object");
    }

    @Override // o6.j0
    /* renamed from: d */
    public final InterfaceC8209j mo10443d() {
        return this.f26004c;
    }

    @Override // o6.j0
    /* renamed from: e */
    public final Object mo10444e(AbstractC8193c abstractC8193c) {
        return new Integer(this.f26003b.f26000a.get());
    }
}
