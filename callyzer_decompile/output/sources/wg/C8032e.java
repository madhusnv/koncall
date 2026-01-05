package wg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import pg.AbstractC5932m;
import qf.InterfaceC6211j;
import sf.g0;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wg.e */
/* loaded from: classes.dex */
public final class C8032e extends AbstractC7149a implements InterfaceC6211j {
    public static final Parcelable.Creator<C8032e> CREATOR = new g0(29);

    /* renamed from: a */
    public final List f38554a;

    /* renamed from: b */
    public final String f38555b;

    public C8032e(String str, ArrayList arrayList) {
        this.f38554a = arrayList;
        this.f38555b = str;
    }

    @Override // qf.InterfaceC6211j
    /* renamed from: a */
    public final Status mo3091a() {
        return this.f38555b != null ? Status.f6002e : Status.f6006j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11780h(parcel, 1, this.f38554a);
        AbstractC5932m.m11778f(parcel, 2, this.f38555b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
