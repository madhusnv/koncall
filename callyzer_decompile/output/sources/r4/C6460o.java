package r4;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.o */
/* loaded from: classes.dex */
public final class C6460o extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f31122a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6461p f31123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6460o(InterfaceC6461p interfaceC6461p, int i10) {
        super(0);
        this.f31122a = i10;
        this.f31123b = interfaceC6461p;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f31122a) {
            case 0:
                return Float.valueOf(this.f31123b.mo12437a());
            default:
                return this.f31123b;
        }
    }
}
