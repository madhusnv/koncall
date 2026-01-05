package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a */
    public byte f18052a;

    /* renamed from: b */
    public Object f18053b;

    public a0() {
    }

    public a0(byte b10, Object obj) {
        this.f18052a = b10;
        this.f18053b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f18052a;
        Object obj = this.f18053b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((AbstractC3402a) obj).mo7904r());
                return;
            case 2:
                C3406e c3406e = (C3406e) obj;
                objectOutput.writeObject(c3406e.f18059a);
                objectOutput.writeObject(c3406e.f18060b);
                return;
            case 3:
                C3410i c3410i = (C3410i) obj;
                objectOutput.writeObject(c3410i.f18070a);
                objectOutput.writeObject(c3410i.f18071b);
                objectOutput.writeObject(c3410i.f18072c);
                return;
            case 4:
                C3421t c3421t = (C3421t) obj;
                c3421t.getClass();
                objectOutput.writeInt(c3421t.mo7810h(ChronoField.YEAR));
                objectOutput.writeByte(c3421t.mo7810h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(c3421t.mo7810h(ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C3422u) obj).f18100a);
                return;
            case 6:
                C3415n c3415n = (C3415n) obj;
                objectOutput.writeObject(c3415n.f18085a);
                objectOutput.writeInt(c3415n.mo7810h(ChronoField.YEAR));
                objectOutput.writeByte(c3415n.mo7810h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(c3415n.mo7810h(ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                C3426y c3426y = (C3426y) obj;
                c3426y.getClass();
                objectOutput.writeInt(c3426y.mo7810h(ChronoField.YEAR));
                objectOutput.writeByte(c3426y.mo7810h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(c3426y.mo7810h(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                e0 e0Var = (e0) obj;
                e0Var.getClass();
                objectOutput.writeInt(e0Var.mo7810h(ChronoField.YEAR));
                objectOutput.writeByte(e0Var.mo7810h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(e0Var.mo7810h(ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                C3407f c3407f = (C3407f) obj;
                objectOutput.writeUTF(c3407f.f18063a.mo7904r());
                objectOutput.writeInt(c3407f.f18064b);
                objectOutput.writeInt(c3407f.f18065c);
                objectOutput.writeInt(c3407f.f18066d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objOf;
        byte b10 = objectInput.readByte();
        this.f18052a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC3402a.f18049a;
                objOf = Chronology.of(objectInput.readUTF());
                break;
            case 2:
                objOf = ((ChronoLocalDate) objectInput.readObject()).mo7827M((LocalTime) objectInput.readObject());
                break;
            case 3:
                objOf = ((ChronoLocalDateTime) objectInput.readObject()).mo7840H((ZoneOffset) objectInput.readObject()).mo7871G((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = C3421t.f18094d;
                int i10 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                C3419r.f18092d.getClass();
                objOf = new C3421t(LocalDate.of(i10, b11, b12));
                break;
            case 5:
                C3422u c3422u = C3422u.f18098d;
                objOf = C3422u.m7932s(objectInput.readByte());
                break;
            case 6:
                C3413l c3413l = (C3413l) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                c3413l.getClass();
                objOf = new C3415n(c3413l, i11, b13, b14);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                C3424w.f18104d.getClass();
                objOf = new C3426y(LocalDate.of(i12 + 1911, b15, b16));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                c0.f18056d.getClass();
                objOf = new e0(LocalDate.of(i13 - 543, b17, b18));
                break;
            case 9:
                int i14 = C3407f.f18062e;
                objOf = new C3407f(Chronology.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f18053b = objOf;
    }

    private Object readResolve() {
        return this.f18053b;
    }
}
