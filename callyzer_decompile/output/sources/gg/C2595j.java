package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.j */
/* loaded from: classes.dex */
public final class C2595j extends AbstractC7149a {
    public static final Parcelable.Creator<C2595j> CREATOR = new b0(23);

    /* renamed from: a */
    public final String f14114a;

    public C2595j(String str) {
        AbstractC6840z.m13036g(str);
        this.f14114a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2595j) {
            return this.f14114a.equals(((C2595j) obj).f14114a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14114a});
    }

    public final String toString() {
        return AbstractC1452a.m4564k(new StringBuilder("FidoAppIdExtension{appid='"), this.f14114a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f14114a);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
