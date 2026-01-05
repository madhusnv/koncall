package tx;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import uw.AbstractC7557a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.y */
/* loaded from: classes3.dex */
public final class C7265y extends AbstractC7557a {

    /* renamed from: c */
    public static final C7263w f34695c = new C7263w();

    /* renamed from: b */
    public final String f34696b;

    public C7265y(String str) {
        super(f34695c);
        this.f34696b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7265y) && AbstractC4154l.m8918a(this.f34696b, ((C7265y) obj).f34696b);
    }

    public final int hashCode() {
        return this.f34696b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("CoroutineName("), this.f34696b, ')');
    }
}
