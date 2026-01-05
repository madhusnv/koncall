package wx;

import kotlin.jvm.internal.C4168z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.g */
/* loaded from: classes3.dex */
public final class C8206g implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f39224a = 0;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8210k f39225b;

    /* renamed from: c */
    public final /* synthetic */ C4168z f39226c;

    public C8206g(C8207h c8207h, C4168z c4168z, InterfaceC8210k interfaceC8210k) {
        this.f39226c = c4168z;
        this.f39225b = interfaceC8210k;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // wx.InterfaceC8210k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, uw.InterfaceC7559c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f39224a
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof wx.C8222w
            if (r0 == 0) goto L18
            r0 = r8
            wx.w r0 = (wx.C8222w) r0
            int r1 = r0.f39339d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f39339d = r1
            goto L1d
        L18:
            wx.w r0 = new wx.w
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f39337b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39339d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            wx.g r7 = r0.f39336a
            og.od.m10798c(r8)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r8 = move-exception
            goto L4d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            og.od.m10798c(r8)
            wx.k r8 = r6.f39225b     // Catch: java.lang.Throwable -> L4b
            r0.f39336a = r6     // Catch: java.lang.Throwable -> L4b
            r0.f39339d = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r8.emit(r7, r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L48
            goto L4a
        L48:
            qw.a0 r1 = qw.a0.f30746a
        L4a:
            return r1
        L4b:
            r8 = move-exception
            r7 = r6
        L4d:
            kotlin.jvm.internal.z r7 = r7.f39226c
            r7.f21164a = r8
            throw r8
        L52:
            boolean r0 = r8 instanceof wx.C8205f
            if (r0 == 0) goto L65
            r0 = r8
            wx.f r0 = (wx.C8205f) r0
            int r1 = r0.f39218c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f39218c = r1
            goto L6a
        L65:
            wx.f r0 = new wx.f
            r0.<init>(r6, r8)
        L6a:
            java.lang.Object r8 = r0.f39216a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39218c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            if (r2 == 0) goto L84
            if (r2 != r4) goto L7c
            og.od.m10798c(r8)
        L7a:
            r1 = r3
            goto La1
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L84:
            og.od.m10798c(r8)
            kotlin.jvm.internal.z r8 = r6.f39226c
            java.lang.Object r2 = r8.f21164a
            l7.q r5 = xx.AbstractC8496b.f41395b
            if (r2 == r5) goto L95
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r7)
            if (r2 != 0) goto L7a
        L95:
            r8.f21164a = r7
            r0.f39218c = r4
            wx.k r8 = r6.f39225b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L7a
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.C8206g.emit(java.lang.Object, uw.c):java.lang.Object");
    }

    public C8206g(InterfaceC8210k interfaceC8210k, C4168z c4168z) {
        this.f39225b = interfaceC8210k;
        this.f39226c = c4168z;
    }
}
