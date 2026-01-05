package lf;

import android.os.Parcel;
import android.os.Parcelable;
import gg.b0;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.e */
/* loaded from: classes.dex */
public final class C4454e extends AbstractC7149a {
    public static final Parcelable.Creator<C4454e> CREATOR = new b0(27);

    /* renamed from: a */
    public final C4453d f22195a;

    /* renamed from: b */
    public final C4450a f22196b;

    /* renamed from: c */
    public final String f22197c;

    /* renamed from: d */
    public final boolean f22198d;

    /* renamed from: e */
    public final int f22199e;

    /* renamed from: f */
    public final C4452c f22200f;

    /* renamed from: g */
    public final C4451b f22201g;

    /* renamed from: h */
    public final boolean f22202h;

    public C4454e(C4453d c4453d, C4450a c4450a, String str, boolean z6, int i10, C4452c c4452c, C4451b c4451b, boolean z10) {
        AbstractC6840z.m13036g(c4453d);
        this.f22195a = c4453d;
        AbstractC6840z.m13036g(c4450a);
        this.f22196b = c4450a;
        this.f22197c = str;
        this.f22198d = z6;
        this.f22199e = i10;
        this.f22200f = c4452c == null ? new C4452c(null, false, null) : c4452c;
        this.f22201g = c4451b == null ? new C4451b(false, null) : c4451b;
        this.f22202h = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4454e)) {
            return false;
        }
        C4454e c4454e = (C4454e) obj;
        return AbstractC6840z.m13040k(this.f22195a, c4454e.f22195a) && AbstractC6840z.m13040k(this.f22196b, c4454e.f22196b) && AbstractC6840z.m13040k(this.f22200f, c4454e.f22200f) && AbstractC6840z.m13040k(this.f22201g, c4454e.f22201g) && AbstractC6840z.m13040k(this.f22197c, c4454e.f22197c) && this.f22198d == c4454e.f22198d && this.f22199e == c4454e.f22199e && this.f22202h == c4454e.f22202h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22195a, this.f22196b, this.f22200f, this.f22201g, this.f22197c, Boolean.valueOf(this.f22198d), Integer.valueOf(this.f22199e), Boolean.valueOf(this.f22202h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f22195a, i10);
        AbstractC5932m.m11777e(parcel, 2, this.f22196b, i10);
        AbstractC5932m.m11778f(parcel, 3, this.f22197c);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f22198d ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f22199e);
        AbstractC5932m.m11777e(parcel, 6, this.f22200f, i10);
        AbstractC5932m.m11777e(parcel, 7, this.f22201g, i10);
        AbstractC5932m.m11785m(parcel, 8, 4);
        parcel.writeInt(this.f22202h ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
