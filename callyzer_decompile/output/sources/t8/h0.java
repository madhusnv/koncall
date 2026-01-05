package t8;

import androidx.work.Worker;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f34156a;

    /* renamed from: b */
    public final /* synthetic */ Worker f34157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Worker worker, int i10) {
        super(0);
        this.f34156a = i10;
        this.f34157b = worker;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f34156a) {
            case 0:
                return this.f34157b.getForegroundInfo();
            default:
                return this.f34157b.doWork();
        }
    }
}
