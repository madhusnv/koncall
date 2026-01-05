package f2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.List;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import q1.C6080h;
import qw.a0;
import r1.C6426k;
import s1.InterfaceC6728w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.j */
/* loaded from: classes.dex */
public final class C2187j extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f10098a;

    /* renamed from: b */
    public final /* synthetic */ w0 f10099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2187j(w0 w0Var, int i10) {
        super(0);
        this.f10098a = i10;
        this.f10099b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f10098a) {
            case 0:
                return (C2182e) this.f10099b.getValue();
            case 1:
                this.f10099b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.f30746a;
            case 2:
                w0 w0Var = this.f10099b;
                a0 a0Var = a0.f30746a;
                w0Var.setValue(a0Var);
                return a0Var;
            case 3:
                return new C6080h((InterfaceC2139c) this.f10099b.getValue());
            case 4:
                return new C6426k((InterfaceC2139c) this.f10099b.getValue());
            case 5:
                return (InterfaceC6728w) ((InterfaceC2137a) this.f10099b.getValue()).invoke();
            case 6:
                w0 w0Var2 = this.f10099b;
                if (w0Var2 != null) {
                    return (List) w0Var2.getValue();
                }
                return null;
            default:
                Boolean bool = (Boolean) this.f10099b.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
