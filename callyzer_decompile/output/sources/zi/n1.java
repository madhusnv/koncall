package zi;

import android.os.Build;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a */
    public final boolean f43215a;

    public n1(boolean z6) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f43215a = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f43215a == n1Var.f43215a;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f43215a ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", osCodeName=");
        sb2.append(Build.VERSION.CODENAME);
        sb2.append(", isRooted=");
        return AbstractC5601a.m11242m(sb2, this.f43215a, "}");
    }
}
