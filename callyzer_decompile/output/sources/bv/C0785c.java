package bv;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bv.c */
/* loaded from: classes3.dex */
public final class C0785c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4964a;

    /* renamed from: b */
    public int f4965b;

    /* renamed from: c */
    public final /* synthetic */ C0790h f4966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0785c(C0790h c0790h, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4964a = i10;
        this.f4966c = c0790h;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4964a) {
            case 0:
                return new C0785c(this.f4966c, interfaceC7559c, 0);
            case 1:
                return new C0785c(this.f4966c, interfaceC7559c, 1);
            case 2:
                return new C0785c(this.f4966c, interfaceC7559c, 2);
            case 3:
                return new C0785c(this.f4966c, interfaceC7559c, 3);
            case 4:
                return new C0785c(this.f4966c, interfaceC7559c, 4);
            case 5:
                return new C0785c(this.f4966c, interfaceC7559c, 5);
            case 6:
                return new C0785c(this.f4966c, interfaceC7559c, 6);
            case 7:
                return new C0785c(this.f4966c, interfaceC7559c, 7);
            default:
                return new C0785c(this.f4966c, interfaceC7559c, 8);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f4964a) {
        }
        return ((C0785c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.C0785c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
