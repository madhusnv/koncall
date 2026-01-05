package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {

    /* renamed from: a */
    public final String f8636a;

    /* renamed from: b */
    public final String f8637b;

    /* renamed from: c */
    public final long f8638c;

    /* renamed from: d */
    public final long f8639d;

    /* renamed from: e */
    public final byte[] f8640e;

    /* renamed from: f */
    public int f8641f;

    /* renamed from: g */
    public static final C2181a f8634g = new C2181a.b().o0("application/id3").m6748K();

    /* renamed from: h */
    public static final C2181a f8635h = new C2181a.b().o0("application/x-scte35").m6748K();
    public static final Parcelable.Creator<EventMessage> CREATOR = new C2236a();

    /* renamed from: androidx.media3.extractor.metadata.emsg.EventMessage$a */
    public class C2236a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f8636a = str;
        this.f8637b = str2;
        this.f8638c = j;
        this.f8639d = j2;
        this.f8640e = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* renamed from: T */
    public C2181a mo6698T() {
        String str = this.f8636a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f8635h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f8634g;
            default:
                return null;
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
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f8638c == eventMessage.f8638c && this.f8639d == eventMessage.f8639d && sqi.m48724c(this.f8636a, eventMessage.f8636a) && sqi.m48724c(this.f8637b, eventMessage.f8637b) && Arrays.equals(this.f8640e, eventMessage.f8640e);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public byte[] g3() {
        if (mo6698T() != null) {
            return this.f8640e;
        }
        return null;
    }

    public int hashCode() {
        if (this.f8641f == 0) {
            String str = this.f8636a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f8637b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f8638c;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f8639d;
            this.f8641f = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f8640e);
        }
        return this.f8641f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f8636a + ", id=" + this.f8639d + ", durationMs=" + this.f8638c + ", value=" + this.f8637b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8636a);
        parcel.writeString(this.f8637b);
        parcel.writeLong(this.f8638c);
        parcel.writeLong(this.f8639d);
        parcel.writeByteArray(this.f8640e);
    }

    public EventMessage(Parcel parcel) {
        this.f8636a = (String) sqi.m48729h(parcel.readString());
        this.f8637b = (String) sqi.m48729h(parcel.readString());
        this.f8638c = parcel.readLong();
        this.f8639d = parcel.readLong();
        this.f8640e = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
