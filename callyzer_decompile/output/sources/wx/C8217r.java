package wx;

import ex.InterfaceC2142f;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.r */
/* loaded from: classes3.dex */
public final class C8217r implements InterfaceC8209j {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8209j f39308a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC8199i f39309b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8217r(InterfaceC8209j interfaceC8209j, InterfaceC2142f interfaceC2142f) {
        this.f39308a = interfaceC8209j;
        this.f39309b = (AbstractC8199i) interfaceC2142f;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ex.f, ww.i] */
    @Override // wx.InterfaceC8209j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(wx.InterfaceC8210k r9, uw.InterfaceC7559c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof wx.C8216q
            if (r0 == 0) goto L13
            r0 = r10
            wx.q r0 = (wx.C8216q) r0
            int r1 = r0.f39303b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39303b = r1
            goto L18
        L13:
            wx.q r0 = new wx.q
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f39302a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39303b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f39305d
            xx.s r9 = (xx.C8513s) r9
            og.od.m10798c(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f39305d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            og.od.m10798c(r10)
            goto La0
        L44:
            wx.k r9 = r0.f39306e
            java.lang.Object r2 = r0.f39305d
            wx.r r2 = (wx.C8217r) r2
            og.od.m10798c(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            og.od.m10798c(r10)
            wx.j r10 = r8.f39308a     // Catch: java.lang.Throwable -> L8a
            r0.f39305d = r8     // Catch: java.lang.Throwable -> L8a
            r0.f39306e = r9     // Catch: java.lang.Throwable -> L8a
            r0.f39303b = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            xx.s r10 = new xx.s
            uw.h r4 = r0.getContext()
            r10.<init>(r9, r4)
            ww.i r9 = r2.f39309b     // Catch: java.lang.Throwable -> L82
            r0.f39305d = r10     // Catch: java.lang.Throwable -> L82
            r0.f39306e = r6     // Catch: java.lang.Throwable -> L82
            r0.f39303b = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            qw.a0 r9 = qw.a0.f30746a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            wx.o1 r10 = new wx.o1
            r10.<init>(r9)
            ww.i r2 = r2.f39309b
            r0.f39305d = r9
            r0.f39306e = r6
            r0.f39303b = r4
            java.lang.Object r10 = wx.c1.m15374e(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.C8217r.collect(wx.k, uw.c):java.lang.Object");
    }
}
