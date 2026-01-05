package yx;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8809c {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42486a = AtomicReferenceFieldUpdater.newUpdater(AbstractC8809c.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42487b = AtomicReferenceFieldUpdater.newUpdater(AbstractC8809c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC8809c(AbstractC8823q abstractC8823q) {
        this._prev$volatile = abstractC8823q;
    }

    /* renamed from: a */
    public final void m16257a() {
        f42487b.set(this, null);
    }

    /* renamed from: c */
    public final AbstractC8809c m16258c() {
        Object obj = f42486a.get(this);
        if (obj == AbstractC8808b.f42479a) {
            return null;
        }
        return (AbstractC8809c) obj;
    }

    /* renamed from: d */
    public abstract boolean mo16259d();

    /* renamed from: e */
    public final void m16260e() {
        AbstractC8809c abstractC8809cM16258c;
        if (m16258c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42487b;
            AbstractC8809c abstractC8809c = (AbstractC8809c) atomicReferenceFieldUpdater.get(this);
            while (abstractC8809c != null && abstractC8809c.mo16259d()) {
                abstractC8809c = (AbstractC8809c) atomicReferenceFieldUpdater.get(abstractC8809c);
            }
            AbstractC8809c abstractC8809cM16258c2 = m16258c();
            AbstractC4154l.m8920c(abstractC8809cM16258c2);
            while (abstractC8809cM16258c2.mo16259d() && (abstractC8809cM16258c = abstractC8809cM16258c2.m16258c()) != null) {
                abstractC8809cM16258c2 = abstractC8809cM16258c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC8809cM16258c2);
                AbstractC8809c abstractC8809c2 = ((AbstractC8809c) obj) == null ? null : abstractC8809c;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC8809cM16258c2, obj, abstractC8809c2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC8809cM16258c2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC8809c != null) {
                f42486a.set(abstractC8809c, abstractC8809cM16258c2);
            }
            if (!abstractC8809cM16258c2.mo16259d() || abstractC8809cM16258c2.m16258c() == null) {
                if (abstractC8809c == null || !abstractC8809c.mo16259d()) {
                    return;
                }
            }
        }
    }
}
