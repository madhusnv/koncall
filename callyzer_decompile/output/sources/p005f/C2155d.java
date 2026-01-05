package p005f;

import ex.InterfaceC2137a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.d */
/* loaded from: classes.dex */
public final class C2155d extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: b */
    public static final C2155d f10004b;

    /* renamed from: c */
    public static final C2155d f10005c;

    /* renamed from: d */
    public static final C2155d f10006d;

    /* renamed from: a */
    public final /* synthetic */ int f10007a;

    static {
        int i10 = 0;
        f10004b = new C2155d(i10, 0);
        f10005c = new C2155d(i10, 1);
        f10006d = new C2155d(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2155d(int i10, int i11) {
        super(i10);
        this.f10007a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f10007a) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
