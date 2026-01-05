package yi;

import com.sun.mail.util.AbstractC1452a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.c */
/* loaded from: classes.dex */
public final class C8674c {

    /* renamed from: a */
    public final String f42008a;

    /* renamed from: b */
    public final long f42009b;

    /* renamed from: c */
    public final Map f42010c;

    public C8674c(String str, long j6, Map additionalCustomKeys) {
        AbstractC4154l.m8923f(additionalCustomKeys, "additionalCustomKeys");
        this.f42008a = str;
        this.f42009b = j6;
        this.f42010c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8674c)) {
            return false;
        }
        C8674c c8674c = (C8674c) obj;
        return AbstractC4154l.m8918a(this.f42008a, c8674c.f42008a) && this.f42009b == c8674c.f42009b && AbstractC4154l.m8918a(this.f42010c, c8674c.f42010c);
    }

    public final int hashCode() {
        return this.f42010c.hashCode() + AbstractC1452a.m4557d(this.f42008a.hashCode() * 31, 31, this.f42009b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f42008a + ", timestamp=" + this.f42009b + ", additionalCustomKeys=" + this.f42010c + ')';
    }
}
