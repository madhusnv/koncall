package pt;

import ex.InterfaceC2141e;
import qw.a0;
import rn.q0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pt.e */
/* loaded from: classes3.dex */
public final class C6031e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29466a = 0;

    /* renamed from: b */
    public boolean f29467b;

    /* renamed from: c */
    public int f29468c;

    /* renamed from: d */
    public final /* synthetic */ boolean f29469d;

    /* renamed from: e */
    public final /* synthetic */ Object f29470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6031e(C6032f c6032f, boolean z6, boolean z10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f29470e = c6032f;
        this.f29467b = z6;
        this.f29469d = z10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29466a) {
            case 0:
                return new C6031e((C6032f) this.f29470e, this.f29467b, this.f29469d, interfaceC7559c);
            default:
                return new C6031e((q0) this.f29470e, this.f29469d, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f29466a) {
        }
        return ((C6031e) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.C6031e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6031e(q0 q0Var, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f29470e = q0Var;
        this.f29469d = z6;
    }
}
