package p001o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public final class fc2 extends lm3 {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23125c = AtomicIntegerFieldUpdater.newUpdater(fc2.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public fc2(n64 n64Var, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + n64Var + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }

    /* renamed from: e */
    public final boolean m26433e() {
        return f23125c.compareAndSet(this, 0, 1);
    }
}
