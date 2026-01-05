package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2182b;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C2241a();

    /* renamed from: b */
    public final String f8661b;

    /* renamed from: c */
    public final String f8662c;

    /* renamed from: d */
    public final int f8663d;

    /* renamed from: e */
    public final byte[] f8664e;

    /* renamed from: androidx.media3.extractor.metadata.id3.ApicFrame$a */
    public class C2241a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f8661b = str;
        this.f8662c = str2;
        this.f8663d = i;
        this.f8664e = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void Y1(C2182b.b bVar) {
        bVar.m6802J(this.f8664e, this.f8663d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f8663d == apicFrame.f8663d && sqi.m48724c(this.f8661b, apicFrame.f8661b) && sqi.m48724c(this.f8662c, apicFrame.f8662c) && Arrays.equals(this.f8664e, apicFrame.f8664e);
    }

    public int hashCode() {
        int i = (527 + this.f8663d) * 31;
        String str = this.f8661b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8662c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f8664e);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f8684a + ": mimeType=" + this.f8661b + ", description=" + this.f8662c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8661b);
        parcel.writeString(this.f8662c);
        parcel.writeInt(this.f8663d);
        parcel.writeByteArray(this.f8664e);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f8661b = (String) sqi.m48729h(parcel.readString());
        this.f8662c = parcel.readString();
        this.f8663d = parcel.readInt();
        this.f8664e = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
