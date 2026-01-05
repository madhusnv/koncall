package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.jxf;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableDoubleState extends jxf implements Parcelable {

    /* renamed from: b */
    public static final C1916b f6230b = new C1916b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new C1915a();

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$a */
    public static final class C1915a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableDoubleState[] newArray(int i) {
            return new ParcelableSnapshotMutableDoubleState[i];
        }
    }

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$b */
    public static final class C1916b {
        public C1916b() {
        }

        public /* synthetic */ C1916b(id5 id5Var) {
            this();
        }
    }

    public ParcelableSnapshotMutableDoubleState(double d) {
        super(d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "parcel");
        parcel.writeDouble(mo34663o());
    }
}
