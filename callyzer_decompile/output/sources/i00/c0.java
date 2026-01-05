package i00;

import eb.i3;
import iz.C3389v;
import java.lang.reflect.Method;
import pg.ba;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends w0 {

    /* renamed from: c */
    public final /* synthetic */ int f16649c;

    /* renamed from: d */
    public final Method f16650d;

    /* renamed from: e */
    public final int f16651e;

    public /* synthetic */ c0(Method method, int i10, int i11) {
        this.f16649c = i11;
        this.f16650d = method;
        this.f16651e = i10;
    }

    @Override // i00.w0
    /* renamed from: a */
    public final void mo7438a(m0 m0Var, Object obj) {
        switch (this.f16649c) {
            case 0:
                C3389v c3389v = (C3389v) obj;
                if (c3389v == null) {
                    throw w0.m7474m(this.f16650d, this.f16651e, "Headers parameter must not be null.", new Object[0]);
                }
                i3 i3Var = m0Var.f16681f;
                i3Var.getClass();
                int size = c3389v.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ba.m11553a(i3Var, c3389v.m7788h(i10), c3389v.m7790q(i10));
                }
                return;
            default:
                if (obj == null) {
                    throw w0.m7474m(this.f16650d, this.f16651e, "@Url parameter is null.", new Object[0]);
                }
                m0Var.f16678c = obj.toString();
                return;
        }
    }
}
