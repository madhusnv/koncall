package ug;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a4 extends AbstractC7149a {
    public static final Parcelable.Creator<a4> CREATOR = new sf.g0(21);

    /* renamed from: a */
    public final List f35264a;

    public a4(ArrayList arrayList) {
        this.f35264a = arrayList;
    }

    /* renamed from: b */
    public static a4 m13831b(w2... w2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(w2VarArr[0].zza()));
        return new a4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        List list = this.f35264a;
        if (list != null) {
            int iM11783k2 = AbstractC5932m.m11783k(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(((Integer) list.get(i11)).intValue());
            }
            AbstractC5932m.m11784l(parcel, iM11783k2);
        }
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
