package zi;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 extends k2 {

    /* renamed from: a */
    public final int f43120a;

    /* renamed from: b */
    public final String f43121b;

    /* renamed from: c */
    public final String f43122c;

    /* renamed from: d */
    public final boolean f43123d;

    public i1(int i10, String str, String str2, boolean z6) {
        this.f43120a = i10;
        this.f43121b = str;
        this.f43122c = str2;
        this.f43123d = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            i1 i1Var = (i1) ((k2) obj);
            if (this.f43120a == i1Var.f43120a && this.f43121b.equals(i1Var.f43121b) && this.f43122c.equals(i1Var.f43122c) && this.f43123d == i1Var.f43123d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f43120a ^ 1000003) * 1000003) ^ this.f43121b.hashCode()) * 1000003) ^ this.f43122c.hashCode()) * 1000003) ^ (this.f43123d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f43120a);
        sb2.append(", version=");
        sb2.append(this.f43121b);
        sb2.append(", buildVersion=");
        sb2.append(this.f43122c);
        sb2.append(", jailbroken=");
        return AbstractC5601a.m11242m(sb2, this.f43123d, "}");
    }
}
