package y4;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y4.d */
/* loaded from: classes.dex */
public final class C8543d {

    /* renamed from: a */
    public final Object f41500a;

    /* renamed from: b */
    public final int f41501b;

    /* renamed from: c */
    public final AbstractC8549j f41502c;

    public C8543d(Object obj, int i10, AbstractC8549j abstractC8549j) {
        this.f41500a = obj;
        this.f41501b = i10;
        this.f41502c = abstractC8549j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8543d)) {
            return false;
        }
        C8543d c8543d = (C8543d) obj;
        return AbstractC4154l.m8918a(this.f41500a, c8543d.f41500a) && this.f41501b == c8543d.f41501b && AbstractC4154l.m8918a(this.f41502c, c8543d.f41502c);
    }

    public final int hashCode() {
        return this.f41502c.hashCode() + AbstractC1452a.m4556c(this.f41501b, this.f41500a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.f41500a + ", index=" + this.f41501b + ", reference=" + this.f41502c + ')';
    }
}
