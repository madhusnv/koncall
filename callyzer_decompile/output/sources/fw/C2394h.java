package fw;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import og.ge;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fw.h */
/* loaded from: classes3.dex */
public final class C2394h {

    /* renamed from: a */
    public final HashSet f10879a = new HashSet();

    /* renamed from: a */
    public final void m6076a() {
        if (ge.f26475a == null) {
            ge.f26475a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != ge.f26475a) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f10879a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
