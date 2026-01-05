package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.mxf;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableLongState extends mxf implements Parcelable {

    /* renamed from: b */
    public static final C1922b f6233b = new C1922b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new C1921a();

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableLongState$a */
    public static final class C1921a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableLongState[] newArray(int i) {
            return new ParcelableSnapshotMutableLongState[i];
        }
    }

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableLongState$b */
    public static final class C1922b {
        public C1922b() {
        }

        public /* synthetic */ C1922b(id5 id5Var) {
            this();
        }
    }

    public ParcelableSnapshotMutableLongState(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "parcel");
        parcel.writeLong(mo32535l());
    }
}
