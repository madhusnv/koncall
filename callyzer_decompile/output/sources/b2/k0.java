package b2;

import ex.InterfaceC2141e;
import h1.C2772c;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import v4.AbstractC7663i;
import ww.AbstractC8199i;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3773a;

    /* renamed from: b */
    public int f3774b;

    /* renamed from: c */
    public final /* synthetic */ long f3775c;

    /* renamed from: d */
    public final /* synthetic */ Object f3776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(long j6, Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3773a = i10;
        this.f3775c = j6;
        this.f3776d = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3773a) {
            case 0:
                return new k0((C2772c) this.f3776d, this.f3775c, interfaceC7559c, 0);
            case 1:
                return new k0(this.f3775c, (k2.w0) this.f3776d, interfaceC7559c, 1);
            case 2:
                return new k0(this.f3775c, (p3.f0) this.f3776d, interfaceC7559c, 2);
            case 3:
                return new k0((AbstractC7663i) this.f3776d, this.f3775c, interfaceC7559c, 3);
            default:
                return new k0((x1) this.f3776d, this.f3775c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3773a) {
        }
        return ((k0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, long j6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3773a = i10;
        this.f3776d = obj;
        this.f3775c = j6;
    }
}
