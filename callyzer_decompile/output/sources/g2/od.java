package g2;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class od extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f12330a;

    /* renamed from: b */
    public final /* synthetic */ int f12331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(int i10, int i11) {
        super(0);
        this.f12330a = i10;
        this.f12331b = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        return new sd(this.f12330a, this.f12331b, false);
    }
}
