package x4;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x4.i */
/* loaded from: classes.dex */
public final class C8299i {

    /* renamed from: a */
    public Object f39844a;

    /* renamed from: b */
    public C8302l f39845b;

    /* renamed from: c */
    public C8304n f39846c;

    /* renamed from: d */
    public boolean f39847d;

    /* renamed from: a */
    public final void m15506a(Runnable runnable, Executor executor) {
        C8304n c8304n = this.f39846c;
        if (c8304n != null) {
            c8304n.mo9026a(runnable, executor);
        }
    }

    /* renamed from: b */
    public final boolean m15507b(Object obj) {
        this.f39847d = true;
        C8302l c8302l = this.f39845b;
        boolean z6 = c8302l != null && c8302l.f39850b.m15504j(obj);
        if (z6) {
            this.f39844a = null;
            this.f39845b = null;
            this.f39846c = null;
        }
        return z6;
    }

    /* renamed from: c */
    public final void m15508c() {
        this.f39847d = true;
        C8302l c8302l = this.f39845b;
        if (c8302l == null || !c8302l.f39850b.cancel(true)) {
            return;
        }
        this.f39844a = null;
        this.f39845b = null;
        this.f39846c = null;
    }

    /* renamed from: d */
    public final boolean m15509d(Throwable th2) {
        this.f39847d = true;
        C8302l c8302l = this.f39845b;
        boolean z6 = c8302l != null && c8302l.f39850b.mo15505k(th2);
        if (z6) {
            this.f39844a = null;
            this.f39845b = null;
            this.f39846c = null;
        }
        return z6;
    }

    public final void finalize() {
        C8304n c8304n;
        C8302l c8302l = this.f39845b;
        if (c8302l != null) {
            C8301k c8301k = c8302l.f39850b;
            if (!c8301k.isDone()) {
                c8301k.mo15505k(new C8292b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f39844a, 1));
            }
        }
        if (this.f39847d || (c8304n = this.f39846c) == null) {
            return;
        }
        c8304n.m15504j(null);
    }
}
