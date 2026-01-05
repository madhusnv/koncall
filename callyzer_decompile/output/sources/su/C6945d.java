package su;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.d */
/* loaded from: classes3.dex */
public final class C6945d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33579a;

    /* renamed from: b */
    public int f33580b;

    /* renamed from: c */
    public final /* synthetic */ C6952k f33581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6945d(C6952k c6952k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33579a = i10;
        this.f33581c = c6952k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33579a) {
            case 0:
                return new C6945d(this.f33581c, interfaceC7559c, 0);
            case 1:
                return new C6945d(this.f33581c, interfaceC7559c, 1);
            case 2:
                return new C6945d(this.f33581c, interfaceC7559c, 2);
            case 3:
                return new C6945d(this.f33581c, interfaceC7559c, 3);
            case 4:
                return new C6945d(this.f33581c, interfaceC7559c, 4);
            default:
                return new C6945d(this.f33581c, interfaceC7559c, 5);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f33579a) {
        }
        return ((C6945d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0164, code lost:
    
        if (r1 == r9) goto L61;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su.C6945d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
