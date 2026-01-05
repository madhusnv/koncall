package j3;

import android.graphics.PathMeasure;
import d3.C1556j;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.h */
/* loaded from: classes.dex */
public final class C3554h extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: b */
    public static final C3554h f19022b;

    /* renamed from: c */
    public static final C3554h f19023c;

    /* renamed from: a */
    public final /* synthetic */ int f19024a;

    static {
        int i10 = 0;
        f19022b = new C3554h(i10, 0);
        f19023c = new C3554h(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3554h(int i10, int i11) {
        super(i10);
        this.f19024a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f19024a) {
            case 0:
                return new C1556j(new PathMeasure());
            default:
                return qw.a0.f30746a;
        }
    }
}
