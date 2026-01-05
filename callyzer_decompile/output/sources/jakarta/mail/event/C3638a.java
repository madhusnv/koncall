package jakarta.mail.event;

import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.event.a */
/* loaded from: classes3.dex */
public final class C3638a extends AbstractC3642e {

    /* renamed from: a */
    public final /* synthetic */ int f19300a = 0;

    /* renamed from: b */
    public int f19301b;

    public /* synthetic */ C3638a(Object obj) {
        super(obj);
    }

    @Override // jakarta.mail.event.AbstractC3642e
    public final void dispatch(Object obj) {
        switch (this.f19300a) {
            case 0:
                int i10 = this.f19301b;
                if (i10 == 1) {
                    throw m0.m7376i(obj);
                }
                if (i10 == 2) {
                    throw m0.m7376i(obj);
                }
                if (i10 == 3) {
                    throw m0.m7376i(obj);
                }
                return;
            default:
                int i11 = this.f19301b;
                if (i11 == 1) {
                    throw m0.m7376i(obj);
                }
                if (i11 != 2) {
                    throw m0.m7376i(obj);
                }
                throw m0.m7376i(obj);
        }
    }

    public C3638a(AutoCloseable autoCloseable, int i10) {
        super(autoCloseable);
        this.f19301b = i10;
    }
}
