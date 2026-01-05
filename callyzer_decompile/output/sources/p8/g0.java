package p8;

import android.view.ViewGroup;
import android.view.WindowId;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final WindowId f28582a;

    public g0(ViewGroup viewGroup) {
        this.f28582a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && ((g0) obj).f28582a.equals(this.f28582a);
    }

    public final int hashCode() {
        return this.f28582a.hashCode();
    }
}
