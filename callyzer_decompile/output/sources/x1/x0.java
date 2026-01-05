package x1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f39742a;

    /* renamed from: b */
    public final /* synthetic */ d1 f39743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(d1 d1Var, int i10) {
        super(0);
        this.f39742a = i10;
        this.f39743b = d1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f39742a) {
            case 0:
                this.f39743b.mo1685b();
                break;
            default:
                this.f39743b.onCancel();
                break;
        }
        return qw.a0.f30746a;
    }
}
