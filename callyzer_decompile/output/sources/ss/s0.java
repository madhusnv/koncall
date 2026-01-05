package ss;

import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vu.C7788a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C7788a f33485a;

    /* renamed from: b */
    public int f33486b;

    /* renamed from: c */
    public int f33487c;

    /* renamed from: d */
    public int f33488d;

    /* renamed from: e */
    public final /* synthetic */ a0 f33489e;

    /* renamed from: f */
    public final /* synthetic */ z0 f33490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(a0 a0Var, z0 z0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f33489e = a0Var;
        this.f33490f = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new s0(this.f33489e, this.f33490f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
