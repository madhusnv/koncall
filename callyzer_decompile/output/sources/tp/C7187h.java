package tp;

import ex.InterfaceC2137a;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7187h implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f34475a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f34476b;

    public /* synthetic */ C7187h(int i10, ArrayList arrayList) {
        this.f34475a = i10;
        this.f34476b = arrayList;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        int size;
        switch (this.f34475a) {
            case 0:
                size = this.f34476b.size();
                break;
            case 1:
                size = this.f34476b.size();
                break;
            default:
                size = this.f34476b.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
