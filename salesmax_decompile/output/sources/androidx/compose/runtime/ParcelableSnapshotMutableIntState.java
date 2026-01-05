package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.lxf;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableIntState extends lxf implements Parcelable {

    /* renamed from: b */
    public static final C1920b f6232b = new C1920b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new C1919a();

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableIntState$a */
    public static final class C1919a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState[] newArray(int i) {
            return new ParcelableSnapshotMutableIntState[i];
        }
    }

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableIntState$b */
    public static final class C1920b {
        public C1920b() {
        }

        public /* synthetic */ C1920b(id5 id5Var) {
            this();
        }
    }

    public ParcelableSnapshotMutableIntState(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "parcel");
        parcel.writeInt(mo23664b());
    }
}
