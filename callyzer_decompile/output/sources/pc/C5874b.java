package pc;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.b */
/* loaded from: classes.dex */
public final class C5874b implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f28655a;

    @Override // ex.InterfaceC2137a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f28655a) {
            case 0:
                return "cache conditional hit";
            case 1:
                return "cache hit";
            case 2:
                return "call complete";
            case 3:
                return "call failed";
            case 4:
                return "call started";
            case 5:
                return "call cancelled";
            case 6:
                return "sending request body";
            case 7:
                return "request failed";
            case 8:
                return "finished sending request headers";
            case 9:
                return "sending request headers";
            case 10:
                return "response body available";
            case 11:
                return "response failed";
            case 12:
                return "response headers start";
            case 13:
                return "cache satisfaction failure";
            default:
                return "initiating TLS connection";
        }
    }
}
