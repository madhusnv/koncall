package og;

import android.os.Parcel;
import cg.BinderC0969b;
import com.google.android.gms.internal.measurement.AbstractC1308x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.c */
/* loaded from: classes.dex */
public final class C5362c extends AbstractC1308x {
    /* renamed from: U */
    public final we[] m10568U(BinderC0969b binderC0969b, C5366g c5366g) {
        Parcel parcelM3750Q = m3750Q();
        int i10 = AbstractC5377r.f26775a;
        parcelM3750Q.writeStrongBinder(binderC0969b);
        parcelM3750Q.writeInt(1);
        c5366g.writeToParcel(parcelM3750Q, 0);
        Parcel parcelM3751R = m3751R(parcelM3750Q, 1);
        we[] weVarArr = (we[]) parcelM3751R.createTypedArray(we.CREATOR);
        parcelM3751R.recycle();
        return weVarArr;
    }
}
