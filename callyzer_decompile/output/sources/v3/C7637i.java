package v3;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.i */
/* loaded from: classes.dex */
public final class C7637i extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: b */
    public static final C7637i f36914b;

    /* renamed from: c */
    public static final C7637i f36915c;

    /* renamed from: a */
    public final /* synthetic */ int f36916a;

    static {
        int i10 = 0;
        f36914b = new C7637i(i10, 0);
        f36915c = new C7637i(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7637i(int i10, int i11) {
        super(i10);
        this.f36916a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f36916a) {
            case 0:
                return new g0(2);
            default:
                return new g0(3);
        }
    }
}
