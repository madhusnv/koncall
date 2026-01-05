package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.zone.b */
/* loaded from: classes2.dex */
public final class C3491b implements Comparable, Serializable {

    /* renamed from: e */
    public static final /* synthetic */ int f18306e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a */
    public final long f18307a;

    /* renamed from: b */
    public final LocalDateTime f18308b;

    /* renamed from: c */
    public final ZoneOffset f18309c;

    /* renamed from: d */
    public final ZoneOffset f18310d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f18307a, ((C3491b) obj).f18307a);
    }

    public C3491b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f18307a = localDateTime.toEpochSecond(zoneOffset);
        this.f18308b = localDateTime;
        this.f18309c = zoneOffset;
        this.f18310d = zoneOffset2;
    }

    public C3491b(long j6, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f18307a = j6;
        this.f18308b = LocalDateTime.m7839I(j6, 0, zoneOffset);
        this.f18309c = zoneOffset;
        this.f18310d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C3490a((byte) 2, this);
    }

    /* renamed from: t */
    public final boolean m8038t() {
        return this.f18310d.f18042b > this.f18309c.f18042b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3491b) {
            C3491b c3491b = (C3491b) obj;
            if (this.f18307a == c3491b.f18307a && this.f18309c.equals(c3491b.f18309c) && this.f18310d.equals(c3491b.f18310d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18308b.hashCode() ^ this.f18309c.f18042b) ^ Integer.rotateLeft(this.f18310d.f18042b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(m8038t() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f18308b);
        sb2.append(this.f18309c);
        sb2.append(" to ");
        sb2.append(this.f18310d);
        sb2.append(']');
        return sb2.toString();
    }
}
