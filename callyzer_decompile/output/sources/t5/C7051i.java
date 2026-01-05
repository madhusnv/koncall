package t5;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t5.i */
/* loaded from: classes.dex */
public final class C7051i {

    /* renamed from: a */
    public final Resources f34086a;

    /* renamed from: b */
    public final Resources.Theme f34087b;

    public C7051i(Resources resources, Resources.Theme theme) {
        this.f34086a = resources;
        this.f34087b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7051i.class == obj.getClass()) {
            C7051i c7051i = (C7051i) obj;
            if (this.f34086a.equals(c7051i.f34086a) && Objects.equals(this.f34087b, c7051i.f34087b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34086a, this.f34087b);
    }
}
