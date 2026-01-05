package fk;

import ex.InterfaceC2141e;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10385a;

    /* renamed from: b */
    public /* synthetic */ Object f10386b;

    /* renamed from: c */
    public final /* synthetic */ h1 f10387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(h1 h1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f10385a = i10;
        this.f10387c = h1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10385a) {
            case 0:
                f1 f1Var = new f1(this.f10387c, interfaceC7559c, 0);
                f1Var.f10386b = obj;
                return f1Var;
            default:
                f1 f1Var2 = new f1(this.f10387c, interfaceC7559c, 1);
                f1Var2.f10386b = obj;
                return f1Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10385a) {
        }
        return ((f1) create(k0Var, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
