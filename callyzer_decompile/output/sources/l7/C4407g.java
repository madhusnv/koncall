package l7;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4154l;
import og.eg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.g */
/* loaded from: classes.dex */
public final class C4407g {

    /* renamed from: a */
    public final int f22036a;

    /* renamed from: b */
    public d0 f22037b = null;

    /* renamed from: c */
    public Bundle f22038c = null;

    public C4407g(int i10) {
        this.f22036a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4407g)) {
            return false;
        }
        C4407g c4407g = (C4407g) obj;
        if (this.f22036a != c4407g.f22036a || !AbstractC4154l.m8918a(this.f22037b, c4407g.f22037b)) {
            return false;
        }
        Bundle bundle = this.f22038c;
        Bundle bundle2 = c4407g.f22038c;
        if (AbstractC4154l.m8918a(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !eg.m10634a(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f22036a) * 31;
        d0 d0Var = this.f22037b;
        int iHashCode2 = iHashCode + (d0Var != null ? d0Var.hashCode() : 0);
        Bundle bundle = this.f22038c;
        if (bundle != null) {
            return eg.m10635b(bundle) + (iHashCode2 * 31);
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4407g.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f22036a));
        sb2.append(")");
        if (this.f22037b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f22037b);
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
