package jakarta.mail.event;

import i0.m0;
import jakarta.mail.AbstractC3679k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.event.c */
/* loaded from: classes3.dex */
public final class C3640c extends AbstractC3642e {

    /* renamed from: a */
    public final int f19302a;

    /* renamed from: b */
    public final transient AbstractC3679k f19303b;

    /* renamed from: c */
    public final transient AbstractC3679k f19304c;

    public C3640c(AutoCloseable autoCloseable, AbstractC3679k abstractC3679k, AbstractC3679k abstractC3679k2, int i10) {
        super(autoCloseable);
        this.f19303b = abstractC3679k;
        this.f19304c = abstractC3679k2;
        this.f19302a = i10;
    }

    @Override // jakarta.mail.event.AbstractC3642e
    public final void dispatch(Object obj) {
        int i10 = this.f19302a;
        if (i10 == 1) {
            throw m0.m7376i(obj);
        }
        if (i10 == 2) {
            throw m0.m7376i(obj);
        }
        if (i10 == 3) {
            throw m0.m7376i(obj);
        }
    }
}
