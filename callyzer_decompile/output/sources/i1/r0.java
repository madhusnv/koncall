package i1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: b */
    public static final r0 f16980b;

    /* renamed from: c */
    public static final r0 f16981c;

    /* renamed from: a */
    public final /* synthetic */ int f16982a;

    static {
        int i10 = 0;
        f16980b = new r0(i10, 0);
        f16981c = new r0(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i10, int i11) {
        super(i10);
        this.f16982a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16982a) {
            case 0:
                return b0.f16805a;
            case 1:
                return new c1();
            default:
                return new p1(0);
        }
    }
}
