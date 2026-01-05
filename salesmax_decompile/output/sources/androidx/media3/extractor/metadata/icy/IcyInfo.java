package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2182b;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import p001o.op0;

/* loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C2240a();

    /* renamed from: a */
    public final byte[] f8658a;

    /* renamed from: b */
    public final String f8659b;

    /* renamed from: c */
    public final String f8660c;

    /* renamed from: androidx.media3.extractor.metadata.icy.IcyInfo$a */
    public class C2240a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f8658a = bArr;
        this.f8659b = str;
        this.f8660c = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void Y1(C2182b.b bVar) {
        String str = this.f8659b;
        if (str != null) {
            bVar.n0(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8658a, ((IcyInfo) obj).f8658a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8658a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f8659b, this.f8660c, Integer.valueOf(this.f8658a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f8658a);
        parcel.writeString(this.f8659b);
        parcel.writeString(this.f8660c);
    }

    public IcyInfo(Parcel parcel) {
        this.f8658a = (byte[]) op0.m42515e(parcel.createByteArray());
        this.f8659b = parcel.readString();
        this.f8660c = parcel.readString();
    }
}
