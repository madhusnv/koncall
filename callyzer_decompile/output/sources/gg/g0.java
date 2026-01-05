package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends AbstractC7149a {
    public static final Parcelable.Creator<g0> CREATOR = new b0(21);

    /* renamed from: a */
    public final List f14111a;

    public g0(ArrayList arrayList) {
        AbstractC6840z.m13036g(arrayList);
        this.f14111a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        List list = ((g0) obj).f14111a;
        List list2 = this.f14111a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f14111a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11782j(parcel, 1, this.f14111a);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
