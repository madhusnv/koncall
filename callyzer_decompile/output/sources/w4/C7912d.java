package w4;

import ex.InterfaceC2137a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.d */
/* loaded from: classes.dex */
public final class C7912d extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: b */
    public static final C7912d f38082b;

    /* renamed from: c */
    public static final C7912d f38083c;

    /* renamed from: d */
    public static final C7912d f38084d;

    /* renamed from: a */
    public final /* synthetic */ int f38085a;

    static {
        int i10 = 0;
        f38082b = new C7912d(i10, 0);
        f38083c = new C7912d(i10, 1);
        f38084d = new C7912d(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7912d(int i10, int i11) {
        super(i10);
        this.f38085a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f38085a) {
        }
        return UUID.randomUUID();
    }
}
