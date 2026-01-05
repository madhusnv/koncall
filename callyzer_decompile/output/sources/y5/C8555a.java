package y5;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y5.a */
/* loaded from: classes.dex */
public final class C8555a {

    /* renamed from: a */
    public String f41533a;

    /* renamed from: b */
    public String f41534b;

    /* renamed from: c */
    public List f41535c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8555a)) {
            return false;
        }
        C8555a c8555a = (C8555a) obj;
        return Objects.equals(this.f41533a, c8555a.f41533a) && Objects.equals(this.f41534b, c8555a.f41534b) && Objects.equals(this.f41535c, c8555a.f41535c);
    }

    public final int hashCode() {
        return Objects.hash(this.f41533a, this.f41534b, this.f41535c);
    }
}
