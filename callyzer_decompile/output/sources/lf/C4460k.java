package lf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.k */
/* loaded from: classes.dex */
public final class C4460k extends AbstractC7149a {
    public static final Parcelable.Creator<C4460k> CREATOR = new C4462m(7);

    /* renamed from: a */
    public final String f22223a;

    /* renamed from: b */
    public final String f22224b;

    public C4460k(String str, String str2) {
        AbstractC6840z.m13037h(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        AbstractC6840z.m13034e(strTrim, "Account identifier cannot be empty");
        this.f22223a = strTrim;
        AbstractC6840z.m13033d(str2);
        this.f22224b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4460k)) {
            return false;
        }
        C4460k c4460k = (C4460k) obj;
        return AbstractC6840z.m13040k(this.f22223a, c4460k.f22223a) && AbstractC6840z.m13040k(this.f22224b, c4460k.f22224b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22223a, this.f22224b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f22223a);
        AbstractC5932m.m11778f(parcel, 2, this.f22224b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
