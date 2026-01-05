package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v7 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f12992a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f12993b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(int i10, InterfaceC2137a interfaceC2137a) {
        super(0);
        this.f12992a = i10;
        this.f12993b = interfaceC2137a;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f12992a) {
            case 0:
                this.f12993b.invoke();
                return Boolean.TRUE;
            case 1:
                this.f12993b.invoke();
                return Boolean.TRUE;
            case 2:
                return Float.valueOf(pg.w9.m11911b(((Number) this.f12993b.invoke()).floatValue(), DefinitionKt.NO_Float_VALUE, 1.0f));
            case 3:
                return Float.valueOf(pg.w9.m11911b(((Number) this.f12993b.invoke()).floatValue(), DefinitionKt.NO_Float_VALUE, 1.0f));
            case 4:
                return Float.valueOf(((Number) this.f12993b.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
            default:
                return this.f12993b.invoke();
        }
    }
}
