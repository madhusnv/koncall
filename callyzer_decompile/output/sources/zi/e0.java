package zi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends o1 {

    /* renamed from: a */
    public final String f43064a;

    /* renamed from: b */
    public final String f43065b;

    /* renamed from: c */
    public final String f43066c;

    public e0(String str, String str2, String str3) {
        this.f43064a = str;
        this.f43065b = str2;
        this.f43066c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            e0 e0Var = (e0) ((o1) obj);
            if (this.f43064a.equals(e0Var.f43064a) && this.f43065b.equals(e0Var.f43065b) && this.f43066c.equals(e0Var.f43066c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f43064a.hashCode() ^ 1000003) * 1000003) ^ this.f43065b.hashCode()) * 1000003) ^ this.f43066c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f43064a);
        sb2.append(", libraryName=");
        sb2.append(this.f43065b);
        sb2.append(", buildId=");
        return AbstractC1452a.m4564k(sb2, this.f43066c, "}");
    }
}
