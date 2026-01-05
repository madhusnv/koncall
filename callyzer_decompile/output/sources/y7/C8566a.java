package y7;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.a */
/* loaded from: classes.dex */
public final class C8566a {

    /* renamed from: a */
    public int f41562a;

    /* renamed from: b */
    public int f41563b;

    /* renamed from: c */
    public int f41564c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C8566a.class != obj.getClass()) {
                return false;
            }
            C8566a c8566a = (C8566a) obj;
            int i10 = this.f41562a;
            if (i10 != c8566a.f41562a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.f41564c - this.f41563b) != 1 || this.f41564c != c8566a.f41563b || this.f41563b != c8566a.f41564c) {
                return this.f41564c == c8566a.f41564c && this.f41563b == c8566a.f41563b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f41562a * 31) + this.f41563b) * 31) + this.f41564c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f41562a;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f41563b);
        sb2.append("c:");
        return AbstractC5601a.m11233d(this.f41564c, ",p:null]", sb2);
    }
}
