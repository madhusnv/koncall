package j$.time.temporal;

import j$.time.C3401c;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.temporal.o */
/* loaded from: classes2.dex */
public final class C3485o implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a */
    public final long f18284a;

    /* renamed from: b */
    public final long f18285b;

    /* renamed from: c */
    public final long f18286c;

    /* renamed from: d */
    public final long f18287d;

    /* renamed from: f */
    public static C3485o m8013f(long j6, long j10) {
        if (j6 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C3485o(j6, j6, j10, j10);
    }

    /* renamed from: g */
    public static C3485o m8014g(long j6, long j10, long j11) {
        if (j6 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C3485o(j6, 1L, j10, j11);
    }

    public C3485o(long j6, long j10, long j11, long j12) {
        this.f18284a = j6;
        this.f18285b = j10;
        this.f18286c = j11;
        this.f18287d = j12;
    }

    /* renamed from: d */
    public final boolean m8018d() {
        return this.f18284a >= -2147483648L && this.f18287d <= 2147483647L;
    }

    /* renamed from: e */
    public final boolean m8019e(long j6) {
        return j6 >= this.f18284a && j6 <= this.f18287d;
    }

    /* renamed from: a */
    public final int m8015a(long j6, TemporalField temporalField) {
        if (m8018d() && m8019e(j6)) {
            return (int) j6;
        }
        throw new C3401c(m8017c(j6, temporalField));
    }

    /* renamed from: b */
    public final void m8016b(long j6, TemporalField temporalField) {
        if (!m8019e(j6)) {
            throw new C3401c(m8017c(j6, temporalField));
        }
    }

    /* renamed from: c */
    public final String m8017c(long j6, TemporalField temporalField) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j6;
        }
        return "Invalid value (valid values " + this + "): " + j6;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j6 = this.f18284a;
        long j10 = this.f18285b;
        if (j6 > j10) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j11 = this.f18286c;
        long j12 = this.f18287d;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 > j12) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3485o) {
            C3485o c3485o = (C3485o) obj;
            if (this.f18284a == c3485o.f18284a && this.f18285b == c3485o.f18285b && this.f18286c == c3485o.f18286c && this.f18287d == c3485o.f18287d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f18284a;
        long j10 = this.f18285b;
        long j11 = j6 + (j10 << 16) + (j10 >> 48);
        long j12 = this.f18286c;
        long j13 = j11 + (j12 << 32) + (j12 >> 32);
        long j14 = this.f18287d;
        long j15 = j13 + (j14 << 48) + (j14 >> 16);
        return (int) (j15 ^ (j15 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18284a);
        if (this.f18284a != this.f18285b) {
            sb2.append('/');
            sb2.append(this.f18285b);
        }
        sb2.append(" - ");
        sb2.append(this.f18286c);
        if (this.f18286c != this.f18287d) {
            sb2.append('/');
            sb2.append(this.f18287d);
        }
        return sb2.toString();
    }
}
