package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.u */
/* loaded from: classes.dex */
public final class C2606u extends AbstractC7149a {
    public static final Parcelable.Creator<C2606u> CREATOR = new b0(8);

    /* renamed from: a */
    public final List f14143a;

    public C2606u(ArrayList arrayList) {
        this.f14143a = arrayList;
    }

    /* renamed from: b */
    public final JSONArray m6587b() throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f14143a;
            if (list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    C2607v c2607v = (C2607v) list.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) c2607v.f14146c);
                    jSONArray2.put((int) c2607v.f14145b);
                    jSONArray2.put((int) c2607v.f14146c);
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2606u)) {
            return false;
        }
        List list = ((C2606u) obj).f14143a;
        List list2 = this.f14143a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f14143a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11782j(parcel, 1, this.f14143a);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
