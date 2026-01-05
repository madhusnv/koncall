package b2;

import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1594v;
import d4.C1579g;
import d4.InterfaceC1596x;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4262d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3718a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f3719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i10, InterfaceC2137a interfaceC2137a) {
        super(1);
        this.f3718a = i10;
        this.f3719b = interfaceC2137a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f3718a) {
            case 0:
                break;
            case 1:
                this.f3719b.invoke();
                break;
            case 2:
                long j6 = ((C0847b) obj).f5352a;
                this.f3719b.invoke();
                break;
            case 3:
                AbstractC1594v.m5229g((InterfaceC1596x) obj, new C1579g(((Number) this.f3719b.invoke()).floatValue(), new C4262d(DefinitionKt.NO_Float_VALUE, 1.0f)));
                break;
            case 4:
                AbstractC1594v.m5229g((InterfaceC1596x) obj, new C1579g(((Number) this.f3719b.invoke()).floatValue(), new C4262d(DefinitionKt.NO_Float_VALUE, 1.0f)));
                break;
            case 5:
                AbstractC1594v.m5229g((InterfaceC1596x) obj, new C1579g(((Number) this.f3719b.invoke()).floatValue(), new C4262d(DefinitionKt.NO_Float_VALUE, 1.0f)));
                break;
            default:
                this.f3719b.invoke();
                break;
        }
        return qw.a0.f30746a;
    }
}
