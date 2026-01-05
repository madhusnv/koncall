package ud;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.s */
/* loaded from: classes.dex */
public final class C7415s extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f35210a;

    /* renamed from: b */
    public final /* synthetic */ String f35211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7415s(String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f35210a = i10;
        this.f35211b = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f35210a) {
            case 0:
                return new C7415s(this.f35211b, interfaceC7559c, 0);
            default:
                return new C7415s(this.f35211b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f35210a) {
        }
        return ((C7415s) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #1 {all -> 0x005b, blocks: (B:9:0x003e, B:13:0x004c, B:15:0x0052, B:22:0x0062, B:23:0x006a, B:26:0x0072, B:28:0x0086, B:31:0x009c, B:32:0x00b5, B:33:0x00b6, B:34:0x00d4), top: B:41:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:9:0x003e, B:13:0x004c, B:15:0x0052, B:22:0x0062, B:23:0x006a, B:26:0x0072, B:28:0x0086, B:31:0x009c, B:32:0x00b5, B:33:0x00b6, B:34:0x00d4), top: B:41:0x003e }] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f35210a
            r1 = 0
            java.lang.String r2 = r9.f35211b
            switch(r0) {
                case 0: goto L2f;
                default: goto L8;
            }
        L8:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            og.od.m10798c(r10)
            java.net.InetAddress[] r10 = java.net.InetAddress.getAllByName(r2)
            java.lang.String r0 = "getAllByName(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r10.length
            r0.<init>(r2)
            int r2 = r10.length
        L1d:
            if (r1 >= r2) goto L2e
            r3 = r10[r1]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r3)
            zc.e r3 = pg.w9.m11918i(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L1d
        L2e:
            return r0
        L2f:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            og.od.m10798c(r10)
            java.io.File r10 = new java.io.File
            r10.<init>(r2)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r2 = r10.length()     // Catch: java.lang.Throwable -> L5b
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.lang.String r5 = "File "
            if (r4 > 0) goto Lb6
            int r2 = (int) r2
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L5b
            r6 = r1
            r4 = r2
        L50:
            if (r4 <= 0) goto L5e
            int r7 = r0.read(r3, r6, r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 < 0) goto L5e
            int r4 = r4 - r7
            int r6 = r6 + r7
            goto L50
        L5b:
            r10 = move-exception
            goto Ld5
        L5e:
            java.lang.String r7 = "copyOf(...)"
            if (r4 <= 0) goto L6a
            byte[] r3 = java.util.Arrays.copyOf(r3, r6)     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.internal.AbstractC4154l.m8922e(r3, r7)     // Catch: java.lang.Throwable -> L5b
            goto L98
        L6a:
            int r4 = r0.read()     // Catch: java.lang.Throwable -> L5b
            r6 = -1
            if (r4 != r6) goto L72
            goto L98
        L72:
            bx.a r6 = new bx.a     // Catch: java.lang.Throwable -> L5b
            r8 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L5b
            r6.write(r4)     // Catch: java.lang.Throwable -> L5b
            og.p1.m10811a(r0, r6)     // Catch: java.lang.Throwable -> L5b
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + r2
            if (r4 < 0) goto L9c
            byte[] r10 = r6.m2122h()     // Catch: java.lang.Throwable -> L5b
            byte[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.internal.AbstractC4154l.m8922e(r3, r7)     // Catch: java.lang.Throwable -> L5b
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L5b
            rw.AbstractC6662l.m12716f(r2, r10, r1, r3, r4)     // Catch: java.lang.Throwable -> L5b
        L98:
            r0.close()
            return r3
        L9c:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            r2.append(r5)     // Catch: java.lang.Throwable -> L5b
            r2.append(r10)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        Lb6:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5b
            r4.append(r10)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = " is too big ("
            r4.append(r10)     // Catch: java.lang.Throwable -> L5b
            r4.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = " bytes) to fit in memory."
            r4.append(r10)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        Ld5:
            throw r10     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            r1 = move-exception
            og.q1.m10844a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.C7415s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
