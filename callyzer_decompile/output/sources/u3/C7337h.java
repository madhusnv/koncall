package u3;

import k2.C3953b;
import k2.e1;
import pg.AbstractC5940u;
import s3.AbstractC6744a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u3.h */
/* loaded from: classes.dex */
public final class C7337h extends AbstractC5940u {

    /* renamed from: a */
    public final C7336g f34954a;

    /* renamed from: b */
    public final e1 f34955b = C3953b.m8517t(null);

    public C7337h(C7336g c7336g) {
        this.f34954a = c7336g;
    }

    @Override // pg.AbstractC5940u
    /* renamed from: a */
    public final boolean mo11878a(C7336g c7336g) {
        return c7336g == this.f34954a;
    }

    @Override // pg.AbstractC5940u
    /* renamed from: b */
    public final Object mo11879b(C7336g c7336g) {
        if (c7336g != this.f34954a) {
            AbstractC6744a.m12907b("Check failed.");
        }
        Object value = this.f34955b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
