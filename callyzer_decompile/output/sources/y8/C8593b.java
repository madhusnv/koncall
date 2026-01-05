package y8;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y8.b */
/* loaded from: classes.dex */
public final class C8593b extends AbstractC8594c {

    /* renamed from: a */
    public final int f41840a;

    public C8593b(int i10) {
        this.f41840a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8593b) && this.f41840a == ((C8593b) obj).f41840a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41840a);
    }

    public final String toString() {
        return AbstractC1452a.m4563j(new StringBuilder("ConstraintsNotMet(reason="), this.f41840a, ')');
    }
}
