package k1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.v */
/* loaded from: classes.dex */
public final class C3947v extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: b */
    public static final C3947v f20271b;

    /* renamed from: c */
    public static final C3947v f20272c;

    /* renamed from: a */
    public final /* synthetic */ int f20273a;

    static {
        int i10 = 0;
        f20271b = new C3947v(i10, 0);
        f20272c = new C3947v(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3947v(int i10, int i11) {
        super(i10);
        this.f20273a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20273a) {
            case 0:
                return qw.a0.f30746a;
            default:
                return Boolean.TRUE;
        }
    }
}
