package g1;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11034a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11035b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f11036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10, InterfaceC2137a interfaceC2137a, boolean z6) {
        super(1);
        this.f11034a = i10;
        this.f11035b = z6;
        this.f11036c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11034a) {
            case 0:
                ((d3.i0) obj).m5163d(!this.f11035b && ((Boolean) this.f11036c.invoke()).booleanValue());
                break;
            default:
                ((d3.i0) obj).m5161b(this.f11035b ? 1.0f : ((Number) this.f11036c.invoke()).floatValue());
                break;
        }
        return qw.a0.f30746a;
    }
}
