package k4;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public final AbstractC3988i f20666a;

    /* renamed from: b */
    public final C3998s f20667b;

    /* renamed from: c */
    public final int f20668c;

    /* renamed from: d */
    public final int f20669d;

    /* renamed from: e */
    public final Object f20670e;

    public e0(AbstractC3988i abstractC3988i, C3998s c3998s, int i10, int i11, Object obj) {
        this.f20666a = abstractC3988i;
        this.f20667b = c3998s;
        this.f20668c = i10;
        this.f20669d = i11;
        this.f20670e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC4154l.m8918a(this.f20666a, e0Var.f20666a) && AbstractC4154l.m8918a(this.f20667b, e0Var.f20667b) && this.f20668c == e0Var.f20668c && this.f20669d == e0Var.f20669d && AbstractC4154l.m8918a(this.f20670e, e0Var.f20670e);
    }

    public final int hashCode() {
        AbstractC3988i abstractC3988i = this.f20666a;
        int iM4556c = AbstractC1452a.m4556c(this.f20669d, AbstractC1452a.m4556c(this.f20668c, (((abstractC3988i == null ? 0 : abstractC3988i.hashCode()) * 31) + this.f20667b.f20701a) * 31, 31), 31);
        Object obj = this.f20670e;
        return iM4556c + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f20666a);
        sb2.append(", fontWeight=");
        sb2.append(this.f20667b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i10 = this.f20668c;
        sb2.append((Object) (i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i11 = this.f20669d;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "Weight";
        } else if (i11 == 2) {
            str = "Style";
        } else if (i11 == 65535) {
            str = "All";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f20670e);
        sb2.append(')');
        return sb2.toString();
    }
}
