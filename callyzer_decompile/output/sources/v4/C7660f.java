package v4;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.f */
/* loaded from: classes.dex */
public final class C7660f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f37095a;

    /* renamed from: b */
    public final /* synthetic */ boolean f37096b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7663i f37097c;

    /* renamed from: d */
    public final /* synthetic */ long f37098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7660f(boolean z6, AbstractC7663i abstractC7663i, long j6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f37096b = z6;
        this.f37097c = abstractC7663i;
        this.f37098d = j6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C7660f(this.f37096b, this.f37097c, this.f37098d, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C7660f) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4.m10428a(0, r10.f37098d, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1.m10428a(r10.f37098d, 0, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r0;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r10.f37095a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            og.od.m10798c(r11)
            goto L47
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            og.od.m10798c(r11)
            r6 = r10
            goto L47
        L1d:
            og.od.m10798c(r11)
            boolean r11 = r10.f37096b
            v4.i r1 = r10.f37097c
            if (r11 != 0) goto L37
            o3.d r4 = r1.f37107a
            r10.f37095a = r3
            r5 = 0
            long r7 = r10.f37098d
            r9 = r10
            java.lang.Object r11 = r4.m10428a(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L47
            goto L46
        L37:
            r6 = r10
            o3.d r1 = r1.f37107a
            r6.f37095a = r2
            long r2 = r6.f37098d
            r4 = 0
            java.lang.Object r11 = r1.m10428a(r2, r4, r6)
            if (r11 != r0) goto L47
        L46:
            return r0
        L47:
            qw.a0 r11 = qw.a0.f30746a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C7660f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
