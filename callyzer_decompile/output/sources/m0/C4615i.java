package m0;

import com.sun.mail.util.AbstractC1452a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m0.i */
/* loaded from: classes.dex */
public final class C4615i {

    /* renamed from: a */
    public final Map f22856a;

    /* renamed from: b */
    public final int f22857b;

    public C4615i(Map streamSpecs, int i10) {
        AbstractC4154l.m8923f(streamSpecs, "streamSpecs");
        this.f22856a = streamSpecs;
        this.f22857b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4615i)) {
            return false;
        }
        C4615i c4615i = (C4615i) obj;
        return AbstractC4154l.m8918a(this.f22856a, c4615i.f22856a) && this.f22857b == c4615i.f22857b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22857b) + (this.f22856a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb2.append(this.f22856a);
        sb2.append(", maxSupportedFrameRate=");
        return AbstractC1452a.m4563j(sb2, this.f22857b, ')');
    }
}
