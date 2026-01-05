package ye;

import android.content.Context;
import ph.C5950e;
import ug.C7439j;
import yk.C8687a;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ye.e */
/* loaded from: classes.dex */
public final class C8640e implements InterfaceC8945b {

    /* renamed from: a */
    public final /* synthetic */ int f41922a;

    /* renamed from: b */
    public final Object f41923b;

    public /* synthetic */ C8640e(int i10, Object obj) {
        this.f41922a = i10;
        this.f41923b = obj;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f41922a) {
            case 0:
                return new C7439j(20, (Context) ((C8640e) this.f41923b).f41923b, new C8687a(14), new C5950e(14));
            default:
                return this.f41923b;
        }
    }
}
