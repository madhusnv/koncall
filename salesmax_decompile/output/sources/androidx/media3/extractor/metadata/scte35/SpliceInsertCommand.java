package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.umh;
import p001o.zwc;

/* loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C2257a();

    /* renamed from: H */
    public final int f8715H;

    /* renamed from: a */
    public final long f8716a;

    /* renamed from: b */
    public final boolean f8717b;

    /* renamed from: c */
    public final boolean f8718c;

    /* renamed from: d */
    public final boolean f8719d;

    /* renamed from: e */
    public final boolean f8720e;

    /* renamed from: f */
    public final long f8721f;

    /* renamed from: g */
    public final long f8722g;

    /* renamed from: h */
    public final List f8723h;

    /* renamed from: q */
    public final boolean f8724q;

    /* renamed from: s */
    public final long f8725s;

    /* renamed from: x */
    public final int f8726x;

    /* renamed from: y */
    public final int f8727y;

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$a */
    public class C2257a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$b */
    public static final class C2258b {

        /* renamed from: a */
        public final int f8728a;

        /* renamed from: b */
        public final long f8729b;

        /* renamed from: c */
        public final long f8730c;

        public /* synthetic */ C2258b(int i, long j, long j2, C2257a c2257a) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C2258b m7587a(Parcel parcel) {
            return new C2258b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m7588b(Parcel parcel) {
            parcel.writeInt(this.f8728a);
            parcel.writeLong(this.f8729b);
            parcel.writeLong(this.f8730c);
        }

        public C2258b(int i, long j, long j2) {
            this.f8728a = i;
            this.f8729b = j;
            this.f8730c = j2;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C2257a c2257a) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceInsertCommand m7584a(zwc zwcVar, long j, umh umhVar) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int iM60010N;
        int iM60004H;
        int iM60004H2;
        boolean z4;
        boolean z5;
        long jM60006J;
        long jM60006J2 = zwcVar.m60006J();
        boolean z6 = (zwcVar.m60004H() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            iM60010N = 0;
            iM60004H = 0;
            iM60004H2 = 0;
            z4 = false;
        } else {
            int iM60004H3 = zwcVar.m60004H();
            boolean z7 = (iM60004H3 & 128) != 0;
            boolean z8 = (iM60004H3 & 64) != 0;
            boolean z9 = (iM60004H3 & 32) != 0;
            boolean z10 = (iM60004H3 & 16) != 0;
            long jM7605b = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m7605b(zwcVar, j);
            if (!z8) {
                int iM60004H4 = zwcVar.m60004H();
                ArrayList arrayList = new ArrayList(iM60004H4);
                for (int i = 0; i < iM60004H4; i++) {
                    int iM60004H5 = zwcVar.m60004H();
                    long jM7605b2 = !z10 ? TimeSignalCommand.m7605b(zwcVar, j) : -9223372036854775807L;
                    arrayList.add(new C2258b(iM60004H5, jM7605b2, umhVar.m51795b(jM7605b2), null));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jM60004H = zwcVar.m60004H();
                boolean z11 = (128 & jM60004H) != 0;
                jM60006J = ((((jM60004H & 1) << 32) | zwcVar.m60006J()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jM60006J = -9223372036854775807L;
            }
            iM60010N = zwcVar.m60010N();
            z4 = z8;
            iM60004H = zwcVar.m60004H();
            iM60004H2 = zwcVar.m60004H();
            list = listEmptyList;
            long j4 = jM7605b;
            z3 = z5;
            j3 = jM60006J;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new SpliceInsertCommand(jM60006J2, z6, z, z4, z2, j2, umhVar.m51795b(j2), list, z3, j3, iM60010N, iM60004H, iM60004H2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f8721f + ", programSplicePlaybackPositionUs= " + this.f8722g + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8716a);
        parcel.writeByte(this.f8717b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8718c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8719d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8720e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8721f);
        parcel.writeLong(this.f8722g);
        int size = this.f8723h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C2258b) this.f8723h.get(i2)).m7588b(parcel);
        }
        parcel.writeByte(this.f8724q ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8725s);
        parcel.writeInt(this.f8726x);
        parcel.writeInt(this.f8727y);
        parcel.writeInt(this.f8715H);
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f8716a = j;
        this.f8717b = z;
        this.f8718c = z2;
        this.f8719d = z3;
        this.f8720e = z4;
        this.f8721f = j2;
        this.f8722g = j3;
        this.f8723h = Collections.unmodifiableList(list);
        this.f8724q = z5;
        this.f8725s = j4;
        this.f8726x = i;
        this.f8727y = i2;
        this.f8715H = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f8716a = parcel.readLong();
        this.f8717b = parcel.readByte() == 1;
        this.f8718c = parcel.readByte() == 1;
        this.f8719d = parcel.readByte() == 1;
        this.f8720e = parcel.readByte() == 1;
        this.f8721f = parcel.readLong();
        this.f8722g = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C2258b.m7587a(parcel));
        }
        this.f8723h = Collections.unmodifiableList(arrayList);
        this.f8724q = parcel.readByte() == 1;
        this.f8725s = parcel.readLong();
        this.f8726x = parcel.readInt();
        this.f8727y = parcel.readInt();
        this.f8715H = parcel.readInt();
    }
}
