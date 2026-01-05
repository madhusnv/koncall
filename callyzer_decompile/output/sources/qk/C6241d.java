package qk;

import java.sql.Timestamp;
import java.util.Date;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qk.d */
/* loaded from: classes.dex */
public final class C6241d extends AbstractC4103w {

    /* renamed from: b */
    public static final C6240c f30259b = new C6240c();

    /* renamed from: a */
    public final AbstractC4103w f30260a;

    public C6241d(AbstractC4103w abstractC4103w) {
        this.f30260a = abstractC4103w;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        Date date = (Date) this.f30260a.mo8851b(c6564a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) {
        this.f30260a.mo8852c(c6566c, (Timestamp) obj);
    }
}
