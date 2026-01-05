package tx;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.t */
/* loaded from: classes3.dex */
public class C7260t {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34676b = AtomicIntegerFieldUpdater.newUpdater(C7260t.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f34677a;

    public C7260t(Throwable th2, boolean z6) {
        this.f34677a = th2;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f34677a + ']';
    }
}
