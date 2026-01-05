package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* renamed from: j$.time.zone.a */
/* loaded from: classes2.dex */
public final class C3490a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a */
    public byte f18304a;

    /* renamed from: b */
    public Object f18305b;

    public C3490a() {
    }

    public C3490a(byte b10, Object obj) {
        this.f18304a = b10;
        this.f18305b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f18304a;
        Object obj = this.f18305b;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 == 2) {
                C3491b c3491b = (C3491b) obj;
                m8036c(c3491b.f18307a, objectOutput);
                m8037d(c3491b.f18309c, objectOutput);
                m8037d(c3491b.f18310d, objectOutput);
                return;
            }
            if (b10 == 3) {
                ((C3494e) obj).m8040b(objectOutput);
                return;
            } else {
                if (b10 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((C3495f) obj).f18332g.getID());
                return;
            }
        }
        C3495f c3495f = (C3495f) obj;
        objectOutput.writeInt(c3495f.f18326a.length);
        for (long j6 : c3495f.f18326a) {
            m8036c(j6, objectOutput);
        }
        for (ZoneOffset zoneOffset : c3495f.f18327b) {
            m8037d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(c3495f.f18328c.length);
        for (long j10 : c3495f.f18328c) {
            m8036c(j10, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : c3495f.f18330e) {
            m8037d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(c3495f.f18331f.length);
        for (C3494e c3494e : c3495f.f18331f) {
            c3494e.m8040b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object c3495f;
        byte b10 = objectInput.readByte();
        this.f18304a = b10;
        if (b10 == 1) {
            long[] jArr = C3495f.f18322i;
            int i10 = objectInput.readInt();
            long[] jArr2 = i10 == 0 ? jArr : new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr2[i11] = m8034a(objectInput);
            }
            int i12 = i10 + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                zoneOffsetArr[i13] = m8035b(objectInput);
            }
            int i14 = objectInput.readInt();
            if (i14 != 0) {
                jArr = new long[i14];
            }
            long[] jArr3 = jArr;
            for (int i15 = 0; i15 < i14; i15++) {
                jArr3[i15] = m8034a(objectInput);
            }
            int i16 = i14 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                zoneOffsetArr2[i17] = m8035b(objectInput);
            }
            int i18 = objectInput.readByte();
            C3494e[] c3494eArr = i18 == 0 ? C3495f.f18323j : new C3494e[i18];
            for (int i19 = 0; i19 < i18; i19++) {
                c3494eArr[i19] = C3494e.m8039a(objectInput);
            }
            c3495f = new C3495f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, c3494eArr);
        } else if (b10 == 2) {
            int i20 = C3491b.f18306e;
            long jM8034a = m8034a(objectInput);
            ZoneOffset zoneOffsetM8035b = m8035b(objectInput);
            ZoneOffset zoneOffsetM8035b2 = m8035b(objectInput);
            if (zoneOffsetM8035b.equals(zoneOffsetM8035b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            c3495f = new C3491b(jM8034a, zoneOffsetM8035b, zoneOffsetM8035b2);
        } else if (b10 == 3) {
            c3495f = C3494e.m8039a(objectInput);
        } else {
            if (b10 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            c3495f = new C3495f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f18305b = c3495f;
    }

    private Object readResolve() {
        return this.f18305b;
    }

    /* renamed from: b */
    public static ZoneOffset m8035b(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(b10 * 900);
    }

    /* renamed from: c */
    public static void m8036c(long j6, DataOutput dataOutput) throws IOException {
        if (j6 >= -4575744000L && j6 < 10413792000L && j6 % 900 == 0) {
            int i10 = (int) ((j6 + 4575744000L) / 900);
            dataOutput.writeByte((i10 >>> 16) & 255);
            dataOutput.writeByte((i10 >>> 8) & 255);
            dataOutput.writeByte(i10 & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j6);
    }

    /* renamed from: a */
    public static long m8034a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* renamed from: d */
    public static void m8037d(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int i10 = zoneOffset.f18042b;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }
}
