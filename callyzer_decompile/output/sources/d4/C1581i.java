package d4;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.i */
/* loaded from: classes.dex */
public final class C1581i {

    /* renamed from: a */
    public final AbstractC4155m f7838a;

    /* renamed from: b */
    public final AbstractC4155m f7839b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1581i(InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2) {
        this.f7838a = (AbstractC4155m) interfaceC2137a;
        this.f7839b = (AbstractC4155m) interfaceC2137a2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: a */
    public final InterfaceC2137a m5198a() {
        return this.f7839b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ex.a, kotlin.jvm.internal.m] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f7838a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f7839b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
