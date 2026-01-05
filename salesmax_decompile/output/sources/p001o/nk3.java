package p001o;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class nk3 implements Comparator {

    /* renamed from: a */
    public boolean f36967a;

    public nk3() {
        this(false);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f36967a ? iSignum * (-1) : iSignum;
    }

    public nk3(boolean z) {
        this.f36967a = z;
    }
}
