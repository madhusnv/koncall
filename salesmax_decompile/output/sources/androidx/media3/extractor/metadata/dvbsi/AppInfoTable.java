package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import p001o.op0;

/* loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new C2235a();

    /* renamed from: a */
    public final int f8632a;

    /* renamed from: b */
    public final String f8633b;

    /* renamed from: androidx.media3.extractor.metadata.dvbsi.AppInfoTable$a */
    public class C2235a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) op0.m42515e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.f8632a = i;
        this.f8633b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f8632a + ",url=" + this.f8633b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8633b);
        parcel.writeInt(this.f8632a);
    }
}
