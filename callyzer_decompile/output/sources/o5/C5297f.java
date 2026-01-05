package o5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.h0;
import l6.AbstractC4400b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o5.f */
/* loaded from: classes.dex */
public final class C5297f extends AbstractC4400b {
    public static final Parcelable.Creator<C5297f> CREATOR = new h0(6);

    /* renamed from: c */
    public SparseArray f25997c;

    public C5297f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f25997c = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25997c.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // l6.AbstractC4400b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.f25997c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f25997c.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f25997c.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
