package ly;

import hy.InterfaceC3055f;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.AbstractC4281m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.k */
/* loaded from: classes3.dex */
public final class C4587k extends AbstractC4577a {

    /* renamed from: f */
    public final AbstractC4281m f22719f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4587k(AbstractC4271c json, AbstractC4281m value, String str) {
        super(json, str);
        AbstractC4154l.m8923f(json, "json");
        AbstractC4154l.m8923f(value, "value");
        this.f22719f = value;
        this.f22701a.add("primitive");
    }

    @Override // ly.AbstractC4577a
    /* renamed from: E */
    public final AbstractC4281m mo9400E(String tag) {
        AbstractC4154l.m8923f(tag, "tag");
        if (tag == "primitive") {
            return this.f22719f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // ly.AbstractC4577a
    /* renamed from: S */
    public final AbstractC4281m mo9414S() {
        return this.f22719f;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: o */
    public final int mo7685o(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return 0;
    }
}
