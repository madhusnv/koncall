package dt;

import ex.InterfaceC2141e;
import pg.ma;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.e */
/* loaded from: classes3.dex */
public final class C1799e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8704a;

    /* renamed from: b */
    public int f8705b;

    /* renamed from: c */
    public final /* synthetic */ C1804j f8706c;

    /* renamed from: d */
    public final /* synthetic */ ma f8707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1799e(C1804j c1804j, ma maVar, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8704a = i10;
        this.f8706c = c1804j;
        this.f8707d = maVar;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8704a) {
            case 0:
                return new C1799e(this.f8706c, this.f8707d, interfaceC7559c, 0);
            case 1:
                return new C1799e(this.f8706c, this.f8707d, interfaceC7559c, 1);
            case 2:
                return new C1799e(this.f8706c, this.f8707d, interfaceC7559c, 2);
            case 3:
                return new C1799e(this.f8706c, this.f8707d, interfaceC7559c, 3);
            case 4:
                return new C1799e(this.f8706c, this.f8707d, interfaceC7559c, 4);
            default:
                return new C1799e(this.f8706c, this.f8707d, interfaceC7559c, 5);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8704a) {
        }
        return ((C1799e) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.C1799e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
