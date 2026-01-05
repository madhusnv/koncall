package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class ref extends AtomicReference implements su5 {
    public ref() {
    }

    /* renamed from: a */
    public boolean m46621a(su5 su5Var) {
        return zu5.replace(this, su5Var);
    }

    /* renamed from: b */
    public boolean m46622b(su5 su5Var) {
        return zu5.set(this, su5Var);
    }

    @Override // p001o.su5
    public void dispose() {
        zu5.dispose(this);
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return zu5.isDisposed((su5) get());
    }

    public ref(su5 su5Var) {
        lazySet(su5Var);
    }
}
