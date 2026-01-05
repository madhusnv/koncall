package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2182b;
import androidx.media3.common.Metadata;
import java.util.List;
import java.util.Map;
import p001o.op0;
import p001o.ria;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C2239a();

    /* renamed from: a */
    public final int f8652a;

    /* renamed from: b */
    public final String f8653b;

    /* renamed from: c */
    public final String f8654c;

    /* renamed from: d */
    public final String f8655d;

    /* renamed from: e */
    public final boolean f8656e;

    /* renamed from: f */
    public final int f8657f;

    /* renamed from: androidx.media3.extractor.metadata.icy.IcyHeaders$a */
    public class C2239a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        op0.m42511a(i2 == -1 || i2 > 0);
        this.f8652a = i;
        this.f8653b = str;
        this.f8654c = str2;
        this.f8655d = str3;
        this.f8656e = z;
        this.f8657f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IcyHeaders m7542a(Map map) throws NumberFormatException {
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i2;
        List list6 = (List) map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        ria.m46824h("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        ria.m46824h("IcyHeaders", "Invalid bitrate header: " + str4);
                        z = false;
                        i = i2;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        if (z) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            zEquals = ((String) list4.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        ria.m46824h("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        ria.m46824h("IcyHeaders", "Invalid metadata interval: " + str5);
                        if (z) {
                        }
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new IcyHeaders(i, str, str2, str3, zEquals, i3);
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void Y1(C2182b.b bVar) {
        String str = this.f8654c;
        if (str != null) {
            bVar.l0(str);
        }
        String str2 = this.f8653b;
        if (str2 != null) {
            bVar.b0(str2);
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f8652a == icyHeaders.f8652a && sqi.m48724c(this.f8653b, icyHeaders.f8653b) && sqi.m48724c(this.f8654c, icyHeaders.f8654c) && sqi.m48724c(this.f8655d, icyHeaders.f8655d) && this.f8656e == icyHeaders.f8656e && this.f8657f == icyHeaders.f8657f;
    }

    public int hashCode() {
        int i = (527 + this.f8652a) * 31;
        String str = this.f8653b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8654c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8655d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f8656e ? 1 : 0)) * 31) + this.f8657f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f8654c + "\", genre=\"" + this.f8653b + "\", bitrate=" + this.f8652a + ", metadataInterval=" + this.f8657f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8652a);
        parcel.writeString(this.f8653b);
        parcel.writeString(this.f8654c);
        parcel.writeString(this.f8655d);
        sqi.r1(parcel, this.f8656e);
        parcel.writeInt(this.f8657f);
    }

    public IcyHeaders(Parcel parcel) {
        this.f8652a = parcel.readInt();
        this.f8653b = parcel.readString();
        this.f8654c = parcel.readString();
        this.f8655d = parcel.readString();
        this.f8656e = sqi.X0(parcel);
        this.f8657f = parcel.readInt();
    }
}
