package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class hge extends AtomicReference implements su5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hge(Object obj) {
        super(obj);
        Objects.requireNonNull(obj, "value is null");
    }

    /* renamed from: a */
    public abstract void mo30424a(Object obj);

    @Override // p001o.su5
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo30424a(andSet);
    }

    @Override // p001o.su5
    public final boolean isDisposed() {
        return get() == null;
    }
}
