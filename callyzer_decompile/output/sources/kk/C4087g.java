package kk;

import nk.f0;
import rk.C6564a;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.g */
/* loaded from: classes.dex */
public class C4087g extends f0 {

    /* renamed from: a */
    public AbstractC4103w f20968a = null;

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        AbstractC4103w abstractC4103w = this.f20968a;
        if (abstractC4103w != null) {
            return abstractC4103w.mo8851b(c6564a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) {
        AbstractC4103w abstractC4103w = this.f20968a;
        if (abstractC4103w == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC4103w.mo8852c(c6566c, obj);
    }

    @Override // nk.f0
    /* renamed from: d */
    public final AbstractC4103w mo8853d() {
        AbstractC4103w abstractC4103w = this.f20968a;
        if (abstractC4103w != null) {
            return abstractC4103w;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
