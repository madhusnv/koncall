package i00;

import h6.C2853i;
import iz.InterfaceC3371d;
import pg.n6;
import tx.C7251k;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.o */
/* loaded from: classes3.dex */
public final class C3110o extends AbstractC3112q {

    /* renamed from: d */
    public final /* synthetic */ int f16714d;

    /* renamed from: e */
    public final InterfaceC3101f f16715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3110o(o0 o0Var, InterfaceC3371d interfaceC3371d, InterfaceC3106k interfaceC3106k, InterfaceC3101f interfaceC3101f, int i10) {
        super(o0Var, interfaceC3371d, interfaceC3106k);
        this.f16714d = i10;
        this.f16715e = interfaceC3101f;
    }

    @Override // i00.AbstractC3112q
    /* renamed from: a */
    public final Object mo7456a(C3119x c3119x, Object[] objArr) {
        int i10 = this.f16714d;
        InterfaceC3101f interfaceC3101f = this.f16715e;
        switch (i10) {
            case 0:
                return interfaceC3101f.mo2663i(c3119x);
            default:
                InterfaceC3099d interfaceC3099d = (InterfaceC3099d) interfaceC3101f.mo2663i(c3119x);
                InterfaceC7559c interfaceC7559c = (InterfaceC7559c) objArr[objArr.length - 1];
                try {
                    C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
                    c7251k.m13540p();
                    c7251k.m13542t(new C3114s(interfaceC3099d, 2));
                    interfaceC3099d.mo7442j(new C2853i(c7251k));
                    Object objM13539o = c7251k.m13539o();
                    EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                    return objM13539o;
                } catch (Exception e2) {
                    return w0.m7477p(e2, interfaceC7559c);
                }
        }
    }
}
