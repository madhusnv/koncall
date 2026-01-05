package p001o;

import android.os.Bundle;
import androidx.navigation.C2345l;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
public final class vrb {

    /* renamed from: a */
    public final int f50794a;

    /* renamed from: b */
    public C2345l f50795b;

    /* renamed from: c */
    public Bundle f50796c;

    public vrb(int i, C2345l c2345l, Bundle bundle) {
        this.f50794a = i;
        this.f50795b = c2345l;
        this.f50796c = bundle;
    }

    /* renamed from: a */
    public final Bundle m53345a() {
        return this.f50796c;
    }

    /* renamed from: b */
    public final int m53346b() {
        return this.f50794a;
    }

    /* renamed from: c */
    public final C2345l m53347c() {
        return this.f50795b;
    }

    /* renamed from: d */
    public final void m53348d(Bundle bundle) {
        this.f50796c = bundle;
    }

    /* renamed from: e */
    public final void m53349e(C2345l c2345l) {
        this.f50795b = c2345l;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        Set<String> setKeySet;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vrb)) {
            return false;
        }
        vrb vrbVar = (vrb) obj;
        if (this.f50794a == vrbVar.f50794a && sq8.m48644c(this.f50795b, vrbVar.f50795b)) {
            if (sq8.m48644c(this.f50796c, vrbVar.f50796c)) {
                return true;
            }
            Bundle bundle = this.f50796c;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                z = false;
                if (z) {
                    return true;
                }
            } else {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z2 = true;
                    if (!z2) {
                    }
                    if (z) {
                    }
                } else {
                    for (String str : set) {
                        Bundle bundle2 = this.f50796c;
                        Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                        Bundle bundle3 = vrbVar.f50796c;
                        if (!sq8.m48644c(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                            z2 = false;
                            break;
                        }
                    }
                    z2 = true;
                    if (!z2) {
                        z = true;
                    }
                    if (z) {
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.f50794a) * 31;
        C2345l c2345l = this.f50795b;
        int iHashCode2 = iHashCode + (c2345l != null ? c2345l.hashCode() : 0);
        Bundle bundle = this.f50796c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i = iHashCode2 * 31;
                Bundle bundle2 = this.f50796c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vrb.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f50794a));
        sb.append(")");
        if (this.f50795b != null) {
            sb.append(" navOptions=");
            sb.append(this.f50795b);
        }
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }

    public /* synthetic */ vrb(int i, C2345l c2345l, Bundle bundle, int i2, id5 id5Var) {
        this(i, (i2 & 2) != 0 ? null : c2345l, (i2 & 4) != 0 ? null : bundle);
    }
}
