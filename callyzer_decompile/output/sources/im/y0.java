package im;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y0 extends f1 {

    /* renamed from: a */
    public final IOException f17594a;

    public y0(IOException iOException) {
        super(0);
        this.f17594a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && AbstractC4154l.m8918a(this.f17594a, ((y0) obj).f17594a);
    }

    public final int hashCode() {
        return this.f17594a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f17594a + ")";
    }
}
