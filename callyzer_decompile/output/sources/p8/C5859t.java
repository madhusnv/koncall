package p8;

import e1.C1903e;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.t */
/* loaded from: classes.dex */
public final class C5859t extends AbstractC5858s {

    /* renamed from: a */
    public final /* synthetic */ C1903e f28625a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC5860u f28626b;

    public C5859t(ViewTreeObserverOnPreDrawListenerC5860u viewTreeObserverOnPreDrawListenerC5860u, C1903e c1903e) {
        this.f28626b = viewTreeObserverOnPreDrawListenerC5860u;
        this.f28625a = c1903e;
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: e */
    public final void mo11422e(AbstractC5857r abstractC5857r) {
        ((ArrayList) this.f28625a.get(this.f28626b.f28628b)).remove(abstractC5857r);
        abstractC5857r.m11461y(this);
    }
}
