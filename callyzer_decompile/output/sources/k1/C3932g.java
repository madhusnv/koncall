package k1;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tx.C7251k;
import tx.C7265y;
import u1.C7302d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.g */
/* loaded from: classes.dex */
public final class C3932g {

    /* renamed from: a */
    public final C7302d f20100a;

    /* renamed from: b */
    public final C7251k f20101b;

    public C3932g(C7302d c7302d, C7251k c7251k) {
        this.f20100a = c7302d;
        this.f20101b = c7251k;
    }

    public final String toString() {
        String strM11238i;
        C7251k c7251k = this.f20101b;
        C7265y c7265y = (C7265y) c7251k.f34651e.o0(C7265y.f34695c);
        String str = c7265y != null ? c7265y.f34696b : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        og.d2.m10599b(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC4154l.m8922e(string, "toString(...)");
        sb2.append(string);
        if (str == null || (strM11238i = AbstractC5601a.m11238i("[", str, "](")) == null) {
            strM11238i = "(";
        }
        sb2.append(strM11238i);
        sb2.append("currentBounds()=");
        sb2.append(this.f20100a.invoke());
        sb2.append(", continuation=");
        sb2.append(c7251k);
        sb2.append(')');
        return sb2.toString();
    }
}
