package pc;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.e */
/* loaded from: classes.dex */
public final class C5877e implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f28663a;

    /* renamed from: b */
    public final /* synthetic */ long f28664b;

    public /* synthetic */ C5877e(int i10, long j6) {
        this.f28663a = i10;
        this.f28664b = j6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f28663a) {
            case 0:
                return "finished sending request body: bytesSent=" + this.f28664b;
            default:
                return "response body finished: bytesConsumed=" + this.f28664b;
        }
    }
}
