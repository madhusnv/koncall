package g2;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ra {

    /* renamed from: a */
    public final String f12613a;

    /* renamed from: b */
    public final la f12614b;

    public ra(String str, la laVar) {
        this.f12613a = str;
        this.f12614b = laVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ra.class != obj.getClass()) {
            return false;
        }
        ra raVar = (ra) obj;
        return AbstractC4154l.m8918a(this.f12613a, raVar.f12613a) && this.f12614b == raVar.f12614b;
    }

    public final int hashCode() {
        return this.f12614b.hashCode() + AbstractC1452a.m4558e(this.f12613a.hashCode() * 961, 31, false);
    }
}
