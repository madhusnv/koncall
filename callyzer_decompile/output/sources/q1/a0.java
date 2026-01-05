package q1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import r1.C6440y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29628a;

    /* renamed from: b */
    public final /* synthetic */ int f29629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, int i11) {
        super(0);
        this.f29628a = i11;
        this.f29629b = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f29628a) {
            case 0:
                return new C6097y(this.f29629b, 0);
            default:
                return new C6440y(this.f29629b, 0);
        }
    }
}
