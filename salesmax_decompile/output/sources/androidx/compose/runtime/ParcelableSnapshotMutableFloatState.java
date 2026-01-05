package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.kxf;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableFloatState extends kxf implements Parcelable {

    /* renamed from: b */
    public static final C1918b f6231b = new C1918b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new C1917a();

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableFloatState$a */
    public static final class C1917a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableFloatState[] newArray(int i) {
            return new ParcelableSnapshotMutableFloatState[i];
        }
    }

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableFloatState$b */
    public static final class C1918b {
        public C1918b() {
        }

        public /* synthetic */ C1918b(id5 id5Var) {
            this();
        }
    }

    public ParcelableSnapshotMutableFloatState(float f) {
        super(f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "parcel");
        parcel.writeFloat(mo21573e());
    }
}
