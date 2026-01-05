package i9;

import aa.C0080g;
import ex.InterfaceC2137a;
import td.EnumC7143t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f17224a;

    /* renamed from: b */
    public final /* synthetic */ C0080g f17225b;

    public /* synthetic */ o0(C0080g c0080g, int i10) {
        this.f17224a = i10;
        this.f17225b = c0080g;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f17224a) {
            case 0:
                return "obtained assumed credentials; expiration=" + this.f17225b.f296b.m13409b(EnumC7143t.ISO_8601);
            default:
                return "obtained assumed credentials via web identity; expiration=" + this.f17225b.f296b.m13409b(EnumC7143t.ISO_8601);
        }
    }
}
