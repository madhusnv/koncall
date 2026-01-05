package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;
import p007h.AbstractC2751c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public final class C0360y extends AbstractC2751c {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f2751a;

    public C0360y(AtomicReference atomicReference) {
        this.f2751a = atomicReference;
    }

    @Override // p007h.AbstractC2751c
    /* renamed from: a */
    public final void mo1274a(Object obj) {
        AbstractC2751c abstractC2751c = (AbstractC2751c) this.f2751a.get();
        if (abstractC2751c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC2751c.mo1274a(obj);
    }
}
