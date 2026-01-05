package u0;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u0.a */
/* loaded from: classes.dex */
public final class C7291a {

    /* renamed from: a */
    public final Rect f34771a;

    /* renamed from: b */
    public final Size f34772b;

    /* renamed from: c */
    public final Size f34773c;

    public C7291a(Rect rect, Size childSizeToScale, Size originalSelectedChildSize) {
        AbstractC4154l.m8923f(childSizeToScale, "childSizeToScale");
        AbstractC4154l.m8923f(originalSelectedChildSize, "originalSelectedChildSize");
        this.f34771a = rect;
        this.f34772b = childSizeToScale;
        this.f34773c = originalSelectedChildSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7291a)) {
            return false;
        }
        C7291a c7291a = (C7291a) obj;
        return AbstractC4154l.m8918a(this.f34771a, c7291a.f34771a) && AbstractC4154l.m8918a(this.f34772b, c7291a.f34772b) && AbstractC4154l.m8918a(this.f34773c, c7291a.f34773c);
    }

    public final int hashCode() {
        return this.f34773c.hashCode() + ((this.f34772b.hashCode() + (this.f34771a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f34771a + ", childSizeToScale=" + this.f34772b + ", originalSelectedChildSize=" + this.f34773c + ')';
    }
}
