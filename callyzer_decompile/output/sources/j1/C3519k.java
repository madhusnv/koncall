package j1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j1.k */
/* loaded from: classes.dex */
public final class C3519k extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f18409a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC4155m f18410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3519k(int i10, InterfaceC2137a interfaceC2137a) {
        super(0);
        this.f18409a = i10;
        switch (i10) {
            case 1:
                this.f18410b = (AbstractC4155m) interfaceC2137a;
                super(0);
                break;
            default:
                this.f18410b = (AbstractC4155m) interfaceC2137a;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ex.a, kotlin.jvm.internal.m] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f18409a) {
            case 0:
                this.f18410b.invoke();
                break;
            default:
                this.f18410b.invoke();
                break;
        }
        return a0.f30746a;
    }
}
