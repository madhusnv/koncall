package ss;

import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33480a;

    /* renamed from: b */
    public int f33481b;

    /* renamed from: c */
    public final /* synthetic */ z0 f33482c;

    /* renamed from: d */
    public final /* synthetic */ a0 f33483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(a0 a0Var, z0 z0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f33480a = 0;
        this.f33483d = a0Var;
        this.f33482c = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33480a) {
            case 0:
                return new r0(this.f33483d, this.f33482c, interfaceC7559c);
            case 1:
                return new r0(this.f33482c, this.f33483d, interfaceC7559c, 1);
            default:
                return new r0(this.f33482c, this.f33483d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f33480a) {
        }
        return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(z0 z0Var, a0 a0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33480a = i10;
        this.f33482c = z0Var;
        this.f33483d = a0Var;
    }
}
