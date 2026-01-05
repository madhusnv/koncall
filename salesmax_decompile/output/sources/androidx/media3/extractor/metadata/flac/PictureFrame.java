package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2182b;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import p001o.sqi;
import p001o.uh2;
import p001o.xeb;
import p001o.zwc;

/* loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C2237a();

    /* renamed from: a */
    public final int f8642a;

    /* renamed from: b */
    public final String f8643b;

    /* renamed from: c */
    public final String f8644c;

    /* renamed from: d */
    public final int f8645d;

    /* renamed from: e */
    public final int f8646e;

    /* renamed from: f */
    public final int f8647f;

    /* renamed from: g */
    public final int f8648g;

    /* renamed from: h */
    public final byte[] f8649h;

    /* renamed from: androidx.media3.extractor.metadata.flac.PictureFrame$a */
    public class C2237a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f8642a = i;
        this.f8643b = str;
        this.f8644c = str2;
        this.f8645d = i2;
        this.f8646e = i3;
        this.f8647f = i4;
        this.f8648g = i5;
        this.f8649h = bArr;
    }

    /* renamed from: a */
    public static PictureFrame m7537a(zwc zwcVar) {
        int iM60036q = zwcVar.m60036q();
        String strM56190r = xeb.m56190r(zwcVar.m60002F(zwcVar.m60036q(), uh2.f48929a));
        String strM60001E = zwcVar.m60001E(zwcVar.m60036q());
        int iM60036q2 = zwcVar.m60036q();
        int iM60036q3 = zwcVar.m60036q();
        int iM60036q4 = zwcVar.m60036q();
        int iM60036q5 = zwcVar.m60036q();
        int iM60036q6 = zwcVar.m60036q();
        byte[] bArr = new byte[iM60036q6];
        zwcVar.m60031l(bArr, 0, iM60036q6);
        return new PictureFrame(iM60036q, strM56190r, strM60001E, iM60036q2, iM60036q3, iM60036q4, iM60036q5, bArr);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void Y1(C2182b.b bVar) {
        bVar.m6802J(this.f8649h, this.f8642a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f8642a == pictureFrame.f8642a && this.f8643b.equals(pictureFrame.f8643b) && this.f8644c.equals(pictureFrame.f8644c) && this.f8645d == pictureFrame.f8645d && this.f8646e == pictureFrame.f8646e && this.f8647f == pictureFrame.f8647f && this.f8648g == pictureFrame.f8648g && Arrays.equals(this.f8649h, pictureFrame.f8649h);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f8642a) * 31) + this.f8643b.hashCode()) * 31) + this.f8644c.hashCode()) * 31) + this.f8645d) * 31) + this.f8646e) * 31) + this.f8647f) * 31) + this.f8648g) * 31) + Arrays.hashCode(this.f8649h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f8643b + ", description=" + this.f8644c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8642a);
        parcel.writeString(this.f8643b);
        parcel.writeString(this.f8644c);
        parcel.writeInt(this.f8645d);
        parcel.writeInt(this.f8646e);
        parcel.writeInt(this.f8647f);
        parcel.writeInt(this.f8648g);
        parcel.writeByteArray(this.f8649h);
    }

    public PictureFrame(Parcel parcel) {
        this.f8642a = parcel.readInt();
        this.f8643b = (String) sqi.m48729h(parcel.readString());
        this.f8644c = (String) sqi.m48729h(parcel.readString());
        this.f8645d = parcel.readInt();
        this.f8646e = parcel.readInt();
        this.f8647f = parcel.readInt();
        this.f8648g = parcel.readInt();
        this.f8649h = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
