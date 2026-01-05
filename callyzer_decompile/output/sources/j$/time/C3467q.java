package j$.time;

import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* renamed from: j$.time.q */
/* loaded from: classes2.dex */
public final class C3467q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a */
    public byte f18238a;

    /* renamed from: b */
    public Object f18239b;

    public C3467q() {
    }

    public C3467q(byte b10, Object obj) {
        this.f18238a = b10;
        this.f18239b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f18238a;
        Object obj = this.f18239b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f18015a);
                objectOutput.writeInt(duration.f18016b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f18018a);
                objectOutput.writeInt(instant.f18019b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f18020a);
                objectOutput.writeByte(localDate.f18021b);
                objectOutput.writeByte(localDate.f18022c);
                return;
            case 4:
                ((LocalTime) obj).k0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.f18025a;
                objectOutput.writeInt(localDate2.f18020a);
                objectOutput.writeByte(localDate2.f18021b);
                objectOutput.writeByte(localDate2.f18022c);
                localDateTime.f18026b.k0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f18044a;
                LocalDate localDate3 = localDateTime2.f18025a;
                objectOutput.writeInt(localDate3.f18020a);
                objectOutput.writeByte(localDate3.f18021b);
                objectOutput.writeByte(localDate3.f18022c);
                localDateTime2.f18026b.k0(objectOutput);
                zonedDateTime.f18045b.f0(objectOutput);
                zonedDateTime.f18046c.mo7866X(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C3488v) obj).f18301b);
                return;
            case 8:
                ((ZoneOffset) obj).f0(objectOutput);
                return;
            case 9:
                C3465o c3465o = (C3465o) obj;
                c3465o.f18232a.k0(objectOutput);
                c3465o.f18233b.f0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f18035a;
                LocalDate localDate4 = localDateTime3.f18025a;
                objectOutput.writeInt(localDate4.f18020a);
                objectOutput.writeByte(localDate4.f18021b);
                objectOutput.writeByte(localDate4.f18022c);
                localDateTime3.f18026b.k0(objectOutput);
                offsetDateTime.f18036b.f0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((C3469s) obj).f18243a);
                return;
            case 12:
                C3487u c3487u = (C3487u) obj;
                objectOutput.writeInt(c3487u.f18298a);
                objectOutput.writeByte(c3487u.f18299b);
                return;
            case 13:
                C3462l c3462l = (C3462l) obj;
                objectOutput.writeByte(c3462l.f18227a);
                objectOutput.writeByte(c3462l.f18228b);
                return;
            case 14:
                C3466p c3466p = (C3466p) obj;
                objectOutput.writeInt(c3466p.f18235a);
                objectOutput.writeInt(c3466p.f18236b);
                objectOutput.writeInt(c3466p.f18237c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b10 = objectInput.readByte();
        this.f18238a = b10;
        this.f18239b = m7999a(b10, objectInput);
    }

    /* renamed from: a */
    public static Object m7999a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                Duration duration = Duration.f18013c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f18017c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.f0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f18023c;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.f0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f18023c;
                LocalDate localDate3 = LocalDate.MIN;
                LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.f0(objectInput));
                ZoneOffset zoneOffsetE0 = ZoneOffset.e0(objectInput);
                ZoneId zoneId = (ZoneId) m7999a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeOf, "localDateTime");
                Objects.requireNonNull(zoneOffsetE0, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetE0.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeOf, zoneId, zoneOffsetE0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i10 = C3488v.f18300d;
                return ZoneId.m7861I(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.e0(objectInput);
            case 9:
                int i11 = C3465o.f18231c;
                return new C3465o(LocalTime.f0(objectInput), ZoneOffset.e0(objectInput));
            case 10:
                int i12 = OffsetDateTime.f18034c;
                LocalDate localDate4 = LocalDate.MIN;
                return new OffsetDateTime(LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.f0(objectInput)), ZoneOffset.e0(objectInput));
            case 11:
                int i13 = C3469s.f18242b;
                return C3469s.m8000t(objectInput.readInt());
            case 12:
                int i14 = C3487u.f18297c;
                int i15 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                ChronoField.YEAR.a0(i15);
                ChronoField.MONTH_OF_YEAR.a0(b11);
                return new C3487u(i15, b11);
            case 13:
                int i16 = C3462l.f18226c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                Month monthM7854K = Month.m7854K(b12);
                Objects.requireNonNull(monthM7854K, "month");
                ChronoField.DAY_OF_MONTH.a0(b13);
                if (b13 <= monthM7854K.m7856I()) {
                    return new C3462l(monthM7854K.getValue(), b13);
                }
                throw new C3401c("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + monthM7854K.name());
            case 14:
                C3466p c3466p = C3466p.f18234d;
                return C3466p.m7998a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f18239b;
    }
}
