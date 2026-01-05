package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.zwc;

/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C2260a();

    /* renamed from: a */
    public final List f8731a;

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$a */
    public class C2260a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C2261b {

        /* renamed from: a */
        public final int f8732a;

        /* renamed from: b */
        public final long f8733b;

        public /* synthetic */ C2261b(int i, long j, C2260a c2260a) {
            this(i, j);
        }

        /* renamed from: c */
        public static C2261b m7596c(Parcel parcel) {
            return new C2261b(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: d */
        public final void m7597d(Parcel parcel) {
            parcel.writeInt(this.f8732a);
            parcel.writeLong(this.f8733b);
        }

        public C2261b(int i, long j) {
            this.f8732a = i;
            this.f8733b = j;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C2260a c2260a) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceScheduleCommand m7591a(zwc zwcVar) {
        int iM60004H = zwcVar.m60004H();
        ArrayList arrayList = new ArrayList(iM60004H);
        for (int i = 0; i < iM60004H; i++) {
            arrayList.add(C2262c.m7602e(zwcVar));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f8731a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C2262c) this.f8731a.get(i2)).m7603f(parcel);
        }
    }

    public SpliceScheduleCommand(List list) {
        this.f8731a = Collections.unmodifiableList(list);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C2262c.m7601d(parcel));
        }
        this.f8731a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C2262c {

        /* renamed from: a */
        public final long f8734a;

        /* renamed from: b */
        public final boolean f8735b;

        /* renamed from: c */
        public final boolean f8736c;

        /* renamed from: d */
        public final boolean f8737d;

        /* renamed from: e */
        public final long f8738e;

        /* renamed from: f */
        public final List f8739f;

        /* renamed from: g */
        public final boolean f8740g;

        /* renamed from: h */
        public final long f8741h;

        /* renamed from: i */
        public final int f8742i;

        /* renamed from: j */
        public final int f8743j;

        /* renamed from: k */
        public final int f8744k;

        public C2262c(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f8734a = j;
            this.f8735b = z;
            this.f8736c = z2;
            this.f8737d = z3;
            this.f8739f = Collections.unmodifiableList(list);
            this.f8738e = j2;
            this.f8740g = z4;
            this.f8741h = j3;
            this.f8742i = i;
            this.f8743j = i2;
            this.f8744k = i3;
        }

        /* renamed from: d */
        public static C2262c m7601d(Parcel parcel) {
            return new C2262c(parcel);
        }

        /* renamed from: e */
        public static C2262c m7602e(zwc zwcVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int iM60004H;
            boolean z3;
            boolean z4;
            long jM60006J;
            long jM60006J2 = zwcVar.m60006J();
            boolean z5 = (zwcVar.m60004H() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                iM60004H = 0;
                z3 = false;
            } else {
                int iM60004H2 = zwcVar.m60004H();
                boolean z6 = (iM60004H2 & 128) != 0;
                boolean z7 = (iM60004H2 & 64) != 0;
                boolean z8 = (iM60004H2 & 32) != 0;
                long jM60006J3 = z7 ? zwcVar.m60006J() : -9223372036854775807L;
                if (!z7) {
                    int iM60004H3 = zwcVar.m60004H();
                    ArrayList arrayList3 = new ArrayList(iM60004H3);
                    for (int i3 = 0; i3 < iM60004H3; i3++) {
                        arrayList3.add(new C2261b(zwcVar.m60004H(), zwcVar.m60006J(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jM60004H = zwcVar.m60004H();
                    boolean z9 = (128 & jM60004H) != 0;
                    jM60006J = ((((jM60004H & 1) << 32) | zwcVar.m60006J()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jM60006J = -9223372036854775807L;
                }
                int iM60010N = zwcVar.m60010N();
                int iM60004H4 = zwcVar.m60004H();
                z3 = z7;
                iM60004H = zwcVar.m60004H();
                j2 = jM60006J;
                arrayList = arrayList2;
                long j3 = jM60006J3;
                i = iM60010N;
                i2 = iM60004H4;
                j = j3;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new C2262c(jM60006J2, z5, z, z3, arrayList, j, z2, j2, i, i2, iM60004H);
        }

        /* renamed from: f */
        public final void m7603f(Parcel parcel) {
            parcel.writeLong(this.f8734a);
            parcel.writeByte(this.f8735b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8736c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8737d ? (byte) 1 : (byte) 0);
            int size = this.f8739f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((C2261b) this.f8739f.get(i)).m7597d(parcel);
            }
            parcel.writeLong(this.f8738e);
            parcel.writeByte(this.f8740g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f8741h);
            parcel.writeInt(this.f8742i);
            parcel.writeInt(this.f8743j);
            parcel.writeInt(this.f8744k);
        }

        public C2262c(Parcel parcel) {
            this.f8734a = parcel.readLong();
            this.f8735b = parcel.readByte() == 1;
            this.f8736c = parcel.readByte() == 1;
            this.f8737d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(C2261b.m7596c(parcel));
            }
            this.f8739f = Collections.unmodifiableList(arrayList);
            this.f8738e = parcel.readLong();
            this.f8740g = parcel.readByte() == 1;
            this.f8741h = parcel.readLong();
            this.f8742i = parcel.readInt();
            this.f8743j = parcel.readInt();
            this.f8744k = parcel.readInt();
        }
    }
}
