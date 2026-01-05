package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11288a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f11289b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(InterfaceC2139c interfaceC2139c, boolean z6, int i10) {
        super(0);
        this.f11288a = i10;
        this.f11289b = interfaceC2139c;
        this.f11290c = z6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f11288a) {
            case 0:
                this.f11289b.invoke(Boolean.valueOf(!this.f11290c));
                break;
            default:
                this.f11289b.invoke(Boolean.valueOf(!this.f11290c));
                break;
        }
        return qw.a0.f30746a;
    }
}
