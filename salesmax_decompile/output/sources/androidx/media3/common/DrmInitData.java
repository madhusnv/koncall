package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p001o.dr1;
import p001o.op0;
import p001o.sqi;
import p001o.xeb;

/* loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C2178a();

    /* renamed from: a */
    public final SchemeData[] f7887a;

    /* renamed from: b */
    public int f7888b;

    /* renamed from: c */
    public final String f7889c;

    /* renamed from: d */
    public final int f7890d;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C2177a();

        /* renamed from: a */
        public int f7891a;

        /* renamed from: b */
        public final UUID f7892b;

        /* renamed from: c */
        public final String f7893c;

        /* renamed from: d */
        public final String f7894d;

        /* renamed from: e */
        public final byte[] f7895e;

        /* renamed from: androidx.media3.common.DrmInitData$SchemeData$a */
        public class C2177a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* renamed from: a */
        public boolean m6685a(SchemeData schemeData) {
            return m6687c() && !schemeData.m6687c() && m6688d(schemeData.f7892b);
        }

        /* renamed from: b */
        public SchemeData m6686b(byte[] bArr) {
            return new SchemeData(this.f7892b, this.f7893c, this.f7894d, bArr);
        }

        /* renamed from: c */
        public boolean m6687c() {
            return this.f7895e != null;
        }

        /* renamed from: d */
        public boolean m6688d(UUID uuid) {
            return dr1.f20423a.equals(this.f7892b) || uuid.equals(this.f7892b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return sqi.m48724c(this.f7893c, schemeData.f7893c) && sqi.m48724c(this.f7894d, schemeData.f7894d) && sqi.m48724c(this.f7892b, schemeData.f7892b) && Arrays.equals(this.f7895e, schemeData.f7895e);
        }

        public int hashCode() {
            if (this.f7891a == 0) {
                int iHashCode = this.f7892b.hashCode() * 31;
                String str = this.f7893c;
                this.f7891a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f7894d.hashCode()) * 31) + Arrays.hashCode(this.f7895e);
            }
            return this.f7891a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7892b.getMostSignificantBits());
            parcel.writeLong(this.f7892b.getLeastSignificantBits());
            parcel.writeString(this.f7893c);
            parcel.writeString(this.f7894d);
            parcel.writeByteArray(this.f7895e);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f7892b = (UUID) op0.m42515e(uuid);
            this.f7893c = str;
            this.f7894d = xeb.m56190r((String) op0.m42515e(str2));
            this.f7895e = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f7892b = new UUID(parcel.readLong(), parcel.readLong());
            this.f7893c = parcel.readString();
            this.f7894d = (String) sqi.m48729h(parcel.readString());
            this.f7895e = parcel.createByteArray();
        }
    }

    /* renamed from: androidx.media3.common.DrmInitData$a */
    public class C2178a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(List list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    /* renamed from: b */
    public static boolean m6680b(ArrayList arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((SchemeData) arrayList.get(i2)).f7892b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static DrmInitData m6681d(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f7889c;
            for (SchemeData schemeData : drmInitData.f7887a) {
                if (schemeData.m6687c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f7889c;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f7887a) {
                if (schemeData2.m6687c() && !m6680b(arrayList, size, schemeData2.f7892b)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = dr1.f20423a;
        return uuid.equals(schemeData.f7892b) ? uuid.equals(schemeData2.f7892b) ? 0 : 1 : schemeData.f7892b.compareTo(schemeData2.f7892b);
    }

    /* renamed from: c */
    public DrmInitData m6683c(String str) {
        return sqi.m48724c(this.f7889c, str) ? this : new DrmInitData(str, false, this.f7887a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public SchemeData m6684e(int i) {
        return this.f7887a[i];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return sqi.m48724c(this.f7889c, drmInitData.f7889c) && Arrays.equals(this.f7887a, drmInitData.f7887a);
    }

    public int hashCode() {
        if (this.f7888b == 0) {
            String str = this.f7889c;
            this.f7888b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7887a);
        }
        return this.f7888b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7889c);
        parcel.writeTypedArray(this.f7887a, 0);
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.f7889c = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f7887a = schemeDataArr;
        this.f7890d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f7889c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) sqi.m48729h((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f7887a = schemeDataArr;
        this.f7890d = schemeDataArr.length;
    }
}
