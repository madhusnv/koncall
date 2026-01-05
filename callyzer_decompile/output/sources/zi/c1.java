package zi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends f2 {

    /* renamed from: a */
    public final String f43033a;

    public c1(String str) {
        this.f43033a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.f43033a.equals(((c1) ((f2) obj)).f43033a);
    }

    public final int hashCode() {
        return this.f43033a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1452a.m4564k(new StringBuilder("Log{content="), this.f43033a, "}");
    }
}
