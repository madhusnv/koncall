package zi;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends c2 {

    /* renamed from: a */
    public final String f43325a;

    /* renamed from: b */
    public final int f43326b;

    /* renamed from: c */
    public final int f43327c;

    /* renamed from: d */
    public final boolean f43328d;

    public z0(String str, int i10, int i11, boolean z6) {
        this.f43325a = str;
        this.f43326b = i10;
        this.f43327c = i11;
        this.f43328d = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            z0 z0Var = (z0) ((c2) obj);
            if (this.f43325a.equals(z0Var.f43325a) && this.f43326b == z0Var.f43326b && this.f43327c == z0Var.f43327c && this.f43328d == z0Var.f43328d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f43325a.hashCode() ^ 1000003) * 1000003) ^ this.f43326b) * 1000003) ^ this.f43327c) * 1000003) ^ (this.f43328d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f43325a);
        sb2.append(", pid=");
        sb2.append(this.f43326b);
        sb2.append(", importance=");
        sb2.append(this.f43327c);
        sb2.append(", defaultProcess=");
        return AbstractC5601a.m11242m(sb2, this.f43328d, "}");
    }
}
