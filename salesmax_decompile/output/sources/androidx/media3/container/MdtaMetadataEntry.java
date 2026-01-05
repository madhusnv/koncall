package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import p001o.br8;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C2183a();

    /* renamed from: a */
    public final String f8076a;

    /* renamed from: b */
    public final byte[] f8077b;

    /* renamed from: c */
    public final int f8078c;

    /* renamed from: d */
    public final int f8079d;

    /* renamed from: androidx.media3.container.MdtaMetadataEntry$a */
    public class C2183a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, C2183a c2183a) {
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f8076a.equals(mdtaMetadataEntry.f8076a) && Arrays.equals(this.f8077b, mdtaMetadataEntry.f8077b) && this.f8078c == mdtaMetadataEntry.f8078c && this.f8079d == mdtaMetadataEntry.f8079d;
    }

    public int hashCode() {
        return ((((((527 + this.f8076a.hashCode()) * 31) + Arrays.hashCode(this.f8077b)) * 31) + this.f8078c) * 31) + this.f8079d;
    }

    public String toString() {
        int i = this.f8079d;
        return "mdta: key=" + this.f8076a + ", value=" + (i != 1 ? i != 23 ? i != 67 ? sqi.n1(this.f8077b) : String.valueOf(br8.m19640g(this.f8077b)) : String.valueOf(Float.intBitsToFloat(br8.m19640g(this.f8077b))) : sqi.m48703H(this.f8077b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8076a);
        parcel.writeByteArray(this.f8077b);
        parcel.writeInt(this.f8078c);
        parcel.writeInt(this.f8079d);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f8076a = str;
        this.f8077b = bArr;
        this.f8078c = i;
        this.f8079d = i2;
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.f8076a = (String) sqi.m48729h(parcel.readString());
        this.f8077b = (byte[]) sqi.m48729h(parcel.createByteArray());
        this.f8078c = parcel.readInt();
        this.f8079d = parcel.readInt();
    }
}
