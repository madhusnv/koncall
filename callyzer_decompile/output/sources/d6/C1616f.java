package d6;

import android.view.accessibility.AccessibilityNodeInfo;
import mg.AbstractC4723b;
import mg.C4722a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d6.f */
/* loaded from: classes.dex */
public final class C1616f {

    /* renamed from: a */
    public final Object f8060a;

    public /* synthetic */ C1616f(Object obj) {
        this.f8060a = obj;
    }

    /* renamed from: a */
    public static C1616f m5280a(boolean z6, int i10, int i11, int i12, int i13) {
        return new C1616f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z6));
    }

    /* renamed from: b */
    public Object m5281b() {
        if (AbstractC4723b.f23629b == null) {
            AbstractC4723b.f23629b = new C4722a();
        }
        synchronized (AbstractC4723b.f23628a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
