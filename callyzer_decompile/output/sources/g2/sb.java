package g2;

import com.sun.mail.util.AbstractC1452a;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class sb {

    /* renamed from: a */
    public final float f12718a;

    /* renamed from: b */
    public final float f12719b;

    /* renamed from: c */
    public final float f12720c;

    public sb(float f6, float f10, float f11) {
        this.f12718a = f6;
        this.f12719b = f10;
        this.f12720c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        return C6750f.m12935a(this.f12718a, sbVar.f12718a) && C6750f.m12935a(this.f12719b, sbVar.f12719b) && C6750f.m12935a(this.f12720c, sbVar.f12720c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12720c) + AbstractC1452a.m4555b(this.f12719b, Float.hashCode(this.f12718a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f6 = this.f12718a;
        sb2.append((Object) C6750f.m12936b(f6));
        sb2.append(", right=");
        float f10 = this.f12719b;
        sb2.append((Object) C6750f.m12936b(f6 + f10));
        sb2.append(", width=");
        sb2.append((Object) C6750f.m12936b(f10));
        sb2.append(", contentWidth=");
        sb2.append((Object) C6750f.m12936b(this.f12720c));
        sb2.append(')');
        return sb2.toString();
    }
}
