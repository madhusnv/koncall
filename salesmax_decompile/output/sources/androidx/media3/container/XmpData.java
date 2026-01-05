package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator<XmpData> CREATOR = new C2187a();

    /* renamed from: a */
    public final byte[] f8086a;

    /* renamed from: androidx.media3.container.XmpData$a */
    public class C2187a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public XmpData createFromParcel(Parcel parcel) {
            return new XmpData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public XmpData[] newArray(int i) {
            return new XmpData[i];
        }
    }

    public /* synthetic */ XmpData(Parcel parcel, C2187a c2187a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8086a, ((XmpData) obj).f8086a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8086a);
    }

    public String toString() {
        return "XMP: " + sqi.n1(this.f8086a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f8086a);
    }

    public XmpData(Parcel parcel) {
        this.f8086a = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
