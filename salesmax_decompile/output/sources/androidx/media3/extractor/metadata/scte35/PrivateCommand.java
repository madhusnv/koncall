package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.sqi;
import p001o.zwc;

/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C2256a();

    /* renamed from: a */
    public final long f8712a;

    /* renamed from: b */
    public final long f8713b;

    /* renamed from: c */
    public final byte[] f8714c;

    /* renamed from: androidx.media3.extractor.metadata.scte35.PrivateCommand$a */
    public class C2256a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C2256a c2256a) {
        this(parcel);
    }

    /* renamed from: a */
    public static PrivateCommand m7581a(zwc zwcVar, int i, long j) {
        long jM60006J = zwcVar.m60006J();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        zwcVar.m60031l(bArr, 0, i2);
        return new PrivateCommand(jM60006J, bArr, j);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f8712a + ", identifier= " + this.f8713b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8712a);
        parcel.writeLong(this.f8713b);
        parcel.writeByteArray(this.f8714c);
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f8712a = j2;
        this.f8713b = j;
        this.f8714c = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f8712a = parcel.readLong();
        this.f8713b = parcel.readLong();
        this.f8714c = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
