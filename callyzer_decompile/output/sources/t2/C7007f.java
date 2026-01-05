package t2;

import ex.InterfaceC2137a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t2.f */
/* loaded from: classes.dex */
public final class C7007f extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: b */
    public static final C7007f f33942b;

    /* renamed from: c */
    public static final C7007f f33943c;

    /* renamed from: a */
    public final /* synthetic */ int f33944a;

    static {
        int i10 = 0;
        f33942b = new C7007f(i10, 0);
        f33943c = new C7007f(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7007f(int i10, int i11) {
        super(i10);
        this.f33944a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f33944a) {
            case 0:
                return new C7006e(new LinkedHashMap());
            default:
                return null;
        }
    }
}
