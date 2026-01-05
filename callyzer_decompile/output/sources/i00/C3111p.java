package i00;

import iz.InterfaceC3371d;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.p */
/* loaded from: classes3.dex */
public final class C3111p extends AbstractC3112q {

    /* renamed from: d */
    public final InterfaceC3101f f16728d;

    /* renamed from: e */
    public final boolean f16729e;

    public C3111p(o0 o0Var, InterfaceC3371d interfaceC3371d, InterfaceC3106k interfaceC3106k, InterfaceC3101f interfaceC3101f, boolean z6) {
        super(o0Var, interfaceC3371d, interfaceC3106k);
        this.f16728d = interfaceC3101f;
        this.f16729e = z6;
    }

    @Override // i00.AbstractC3112q
    /* renamed from: a */
    public final Object mo7456a(C3119x c3119x, Object[] objArr) {
        InterfaceC3099d interfaceC3099d = (InterfaceC3099d) this.f16728d.mo2663i(c3119x);
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) objArr[objArr.length - 1];
        try {
            if (!this.f16729e) {
                return w0.m7463b(interfaceC3099d, interfaceC7559c);
            }
            AbstractC4154l.m8921d(interfaceC3099d, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return w0.m7464c(interfaceC3099d, interfaceC7559c);
        } catch (LinkageError e2) {
            throw e2;
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (VirtualMachineError e11) {
            throw e11;
        } catch (Throwable th2) {
            return w0.m7477p(th2, interfaceC7559c);
        }
    }
}
