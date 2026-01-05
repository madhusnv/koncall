package p001o;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2139h;

/* loaded from: classes2.dex */
public final class g1f {

    /* renamed from: d */
    public static final C13612a f24466d = new C13612a(null);

    /* renamed from: a */
    public final h1f f24467a;

    /* renamed from: b */
    public final f1f f24468b;

    /* renamed from: c */
    public boolean f24469c;

    /* renamed from: o.g1f$a */
    public static final class C13612a {
        public C13612a() {
        }

        public /* synthetic */ C13612a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final g1f m27980a(h1f h1fVar) {
            sq8.m48649h(h1fVar, "owner");
            return new g1f(h1fVar, null);
        }
    }

    public /* synthetic */ g1f(h1f h1fVar, id5 id5Var) {
        this(h1fVar);
    }

    /* renamed from: a */
    public static final g1f m27975a(h1f h1fVar) {
        return f24466d.m27980a(h1fVar);
    }

    /* renamed from: b */
    public final f1f m27976b() {
        return this.f24468b;
    }

    /* renamed from: c */
    public final void m27977c() {
        AbstractC2139h lifecycle = this.f24467a.getLifecycle();
        if (!(lifecycle.mo6522b() == AbstractC2139h.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.mo6521a(new lfe(this.f24467a));
        this.f24468b.m25943e(lifecycle);
        this.f24469c = true;
    }

    /* renamed from: d */
    public final void m27978d(Bundle bundle) {
        if (!this.f24469c) {
            m27977c();
        }
        AbstractC2139h lifecycle = this.f24467a.getLifecycle();
        if (!lifecycle.mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
            this.f24468b.m25944f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo6522b()).toString());
    }

    /* renamed from: e */
    public final void m27979e(Bundle bundle) {
        sq8.m48649h(bundle, "outBundle");
        this.f24468b.m25945g(bundle);
    }

    public g1f(h1f h1fVar) {
        this.f24467a = h1fVar;
        this.f24468b = new f1f();
    }
}
