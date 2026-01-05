package i00;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.z */
/* loaded from: classes3.dex */
public final class C3121z extends w0 {

    /* renamed from: c */
    public final Method f16774c;

    /* renamed from: d */
    public final int f16775d;

    /* renamed from: e */
    public final InterfaceC3106k f16776e;

    public C3121z(Method method, int i10, InterfaceC3106k interfaceC3106k) {
        this.f16774c = method;
        this.f16775d = i10;
        this.f16776e = interfaceC3106k;
    }

    @Override // i00.w0
    /* renamed from: a */
    public final void mo7438a(m0 m0Var, Object obj) {
        int i10 = this.f16775d;
        Method method = this.f16774c;
        if (obj == null) {
            throw w0.m7474m(method, i10, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            m0Var.f16686k = (iz.i0) this.f16776e.mo2700b(obj);
        } catch (IOException e2) {
            throw w0.m7475n(method, e2, i10, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
