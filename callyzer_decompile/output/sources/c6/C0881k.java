package c6;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.k */
/* loaded from: classes.dex */
public final class C0881k {

    /* renamed from: a */
    public final DisplayCutout f5477a;

    public C0881k(DisplayCutout displayCutout) {
        this.f5477a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0881k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5477a, ((C0881k) obj).f5477a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f5477a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5477a + "}";
    }
}
