package r2;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r2.a */
/* loaded from: classes.dex */
public final class C6442a {

    /* renamed from: a */
    public int f31097a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6442a) && this.f31097a == ((C6442a) obj).f31097a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31097a);
    }

    public final String toString() {
        return AbstractC1452a.m4563j(new StringBuilder("DeltaCounter(count="), this.f31097a, ')');
    }
}
