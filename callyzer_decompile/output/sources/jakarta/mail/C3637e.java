package jakarta.mail;

import i0.m0;
import jakarta.mail.event.AbstractC3642e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.e */
/* loaded from: classes3.dex */
public final class C3637e extends AbstractC3642e {

    /* renamed from: a */
    public final /* synthetic */ int f19299a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3637e(int i10, Object obj) {
        super(obj);
        this.f19299a = i10;
    }

    @Override // jakarta.mail.event.AbstractC3642e
    public final void dispatch(Object obj) {
        switch (this.f19299a) {
            case 0:
                Thread.currentThread().interrupt();
                return;
            case 1:
                throw m0.m7376i(obj);
            default:
                throw m0.m7376i(obj);
        }
    }
}
