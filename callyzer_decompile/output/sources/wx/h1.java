package wx;

import f9.C2222e;
import u7.C7351a;
import xx.C8518x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h1 implements g1 {

    /* renamed from: a */
    public final /* synthetic */ int f39234a;

    @Override // wx.g1
    /* renamed from: a */
    public final InterfaceC8209j mo15396a(C8518x c8518x) {
        switch (this.f39234a) {
            case 0:
                return new C2222e(3, e1.START);
            default:
                return new C2222e(new C7351a(c8518x, null, 17));
        }
    }

    public final String toString() {
        switch (this.f39234a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
