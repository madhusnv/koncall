package b2;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.b */
/* loaded from: classes.dex */
public final class C0544b extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3695a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0557o f3696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0544b(InterfaceC0557o interfaceC0557o, int i10) {
        super(0);
        this.f3695a = i10;
        this.f3696b = interfaceC0557o;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f3695a) {
            case 0:
                return Boolean.valueOf((this.f3696b.mo1652a() & 9223372034707292159L) != 9205357640488583168L);
            default:
                return Boolean.valueOf((this.f3696b.mo1652a() & 9223372034707292159L) != 9205357640488583168L);
        }
    }
}
