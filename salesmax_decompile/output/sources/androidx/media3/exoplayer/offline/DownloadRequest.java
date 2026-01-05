package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C2219a();

    /* renamed from: a */
    public final String f8494a;

    /* renamed from: b */
    public final Uri f8495b;

    /* renamed from: c */
    public final String f8496c;

    /* renamed from: d */
    public final List f8497d;

    /* renamed from: e */
    public final byte[] f8498e;

    /* renamed from: f */
    public final String f8499f;

    /* renamed from: g */
    public final byte[] f8500g;

    /* renamed from: androidx.media3.exoplayer.offline.DownloadRequest$a */
    public class C2219a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public DownloadRequest(Parcel parcel) {
        this.f8494a = (String) sqi.m48729h(parcel.readString());
        this.f8495b = Uri.parse((String) sqi.m48729h(parcel.readString()));
        this.f8496c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f8497d = Collections.unmodifiableList(arrayList);
        this.f8498e = parcel.createByteArray();
        this.f8499f = parcel.readString();
        this.f8500g = (byte[]) sqi.m48729h(parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f8494a.equals(downloadRequest.f8494a) && this.f8495b.equals(downloadRequest.f8495b) && sqi.m48724c(this.f8496c, downloadRequest.f8496c) && this.f8497d.equals(downloadRequest.f8497d) && Arrays.equals(this.f8498e, downloadRequest.f8498e) && sqi.m48724c(this.f8499f, downloadRequest.f8499f) && Arrays.equals(this.f8500g, downloadRequest.f8500g);
    }

    public final int hashCode() {
        int iHashCode = ((this.f8494a.hashCode() * 31 * 31) + this.f8495b.hashCode()) * 31;
        String str = this.f8496c;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f8497d.hashCode()) * 31) + Arrays.hashCode(this.f8498e)) * 31;
        String str2 = this.f8499f;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f8500g);
    }

    public String toString() {
        return this.f8496c + ":" + this.f8494a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8494a);
        parcel.writeString(this.f8495b.toString());
        parcel.writeString(this.f8496c);
        parcel.writeInt(this.f8497d.size());
        for (int i2 = 0; i2 < this.f8497d.size(); i2++) {
            parcel.writeParcelable((Parcelable) this.f8497d.get(i2), 0);
        }
        parcel.writeByteArray(this.f8498e);
        parcel.writeString(this.f8499f);
        parcel.writeByteArray(this.f8500g);
    }
}
