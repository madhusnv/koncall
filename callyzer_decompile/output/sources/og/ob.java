package og;

import c9.C0908c;
import java.util.Arrays;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ob {

    /* renamed from: a */
    public final nb f26706a;

    /* renamed from: b */
    public final Integer f26707b;

    public /* synthetic */ ob(C0908c c0908c) {
        this.f26706a = (nb) c0908c.f5574b;
        this.f26707b = (Integer) c0908c.f5575c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return AbstractC6840z.m13040k(this.f26706a, obVar.f26706a) && AbstractC6840z.m13040k(this.f26707b, obVar.f26707b) && AbstractC6840z.m13040k(null, null) && AbstractC6840z.m13040k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26706a, this.f26707b, null, null});
    }
}
