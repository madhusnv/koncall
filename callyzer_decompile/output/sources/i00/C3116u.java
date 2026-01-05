package i00;

import b00.AbstractC0534s;
import b00.C0526k;
import b00.InterfaceC0528m;
import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.u */
/* loaded from: classes3.dex */
public final class C3116u extends AbstractC0534s {

    /* renamed from: b */
    public final /* synthetic */ int f16749b = 1;

    /* renamed from: c */
    public Object f16750c;

    public /* synthetic */ C3116u(b00.i0 i0Var) {
        super(i0Var);
    }

    @Override // b00.AbstractC0534s, b00.i0
    public final long g0(C0526k c0526k, long j6) throws Exception {
        switch (this.f16749b) {
            case 0:
                try {
                    return super.g0(c0526k, j6);
                } catch (IOException e2) {
                    ((C3117v) this.f16750c).f16756e = e2;
                    throw e2;
                }
            default:
                try {
                    return super.g0(c0526k, j6);
                } catch (Exception e10) {
                    this.f16750c = e10;
                    throw e10;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3116u(C3117v c3117v, InterfaceC0528m interfaceC0528m) {
        super(interfaceC0528m);
        this.f16750c = c3117v;
    }
}
