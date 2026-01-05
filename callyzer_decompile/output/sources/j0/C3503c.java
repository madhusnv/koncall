package j0;

import android.util.Size;
import java.util.Comparator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j0.c */
/* loaded from: classes.dex */
public final class C3503c implements Comparator {

    /* renamed from: a */
    public final boolean f18372a;

    public C3503c(boolean z6) {
        this.f18372a = z6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f18372a ? iSignum * (-1) : iSignum;
    }
}
