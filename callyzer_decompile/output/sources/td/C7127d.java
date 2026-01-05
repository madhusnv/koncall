package td;

import com.sun.mail.util.AbstractC1452a;
import pg.AbstractC5930k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.d */
/* loaded from: classes.dex */
public final class C7127d extends AbstractC5930k {

    /* renamed from: a */
    public final int f34347a;

    public C7127d(int i10) {
        this.f34347a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7127d) && this.f34347a == ((C7127d) obj).f34347a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34347a);
    }

    public final String toString() {
        return AbstractC1452a.m4563j(new StringBuilder("incomplete input needed ("), this.f34347a, ')');
    }
}
