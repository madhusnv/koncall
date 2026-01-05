package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public class lm3 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34035b = AtomicIntegerFieldUpdater.newUpdater(lm3.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f34036a;

    public lm3(Throwable th, boolean z) {
        this.f34036a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean m37463a() {
        return f34035b.get(this) != 0;
    }

    /* renamed from: c */
    public final boolean m37464c() {
        return f34035b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return o75.m41657a(this) + '[' + this.f34036a + ']';
    }

    public /* synthetic */ lm3(Throwable th, boolean z, int i, id5 id5Var) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
