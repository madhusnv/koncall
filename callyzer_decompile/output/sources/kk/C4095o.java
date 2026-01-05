package kk;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import mk.AbstractC4770i;
import mk.C4772k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.o */
/* loaded from: classes.dex */
public final class C4095o extends AbstractC4092l {

    /* renamed from: a */
    public final Serializable f20999a;

    public C4095o(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f20999a = bool;
    }

    /* renamed from: k */
    public static boolean m8871k(C4095o c4095o) {
        Serializable serializable = c4095o.f20999a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // kk.AbstractC4092l
    /* renamed from: a */
    public final int mo8867a() {
        return this.f20999a instanceof Number ? m8875j().intValue() : Integer.parseInt(mo8868c());
    }

    @Override // kk.AbstractC4092l
    /* renamed from: c */
    public final String mo8868c() {
        Serializable serializable = this.f20999a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m8875j().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* renamed from: e */
    public final BigInteger m8872e() {
        Serializable serializable = this.f20999a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m8871k(this)) {
            return BigInteger.valueOf(m8875j().longValue());
        }
        String strMo8868c = mo8868c();
        AbstractC4770i.m9691d(strMo8868c);
        return new BigInteger(strMo8868c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4095o.class != obj.getClass()) {
            return false;
        }
        C4095o c4095o = (C4095o) obj;
        Serializable serializable = c4095o.f20999a;
        Serializable serializable2 = this.f20999a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m8871k(this) && m8871k(c4095o)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m8872e().equals(c4095o.m8872e()) : m8875j().longValue() == c4095o.m8875j().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC4770i.m9697j(mo8868c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC4770i.m9697j(c4095o.mo8868c())) == 0;
        }
        double dM8874h = m8874h();
        double dM8874h2 = c4095o.m8874h();
        if (dM8874h != dM8874h2) {
            return Double.isNaN(dM8874h) && Double.isNaN(dM8874h2);
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m8873g() {
        Serializable serializable = this.f20999a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(mo8868c());
    }

    /* renamed from: h */
    public final double m8874h() {
        return this.f20999a instanceof Number ? m8875j().doubleValue() : Double.parseDouble(mo8868c());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f20999a;
        if (serializable == null) {
            return 31;
        }
        if (m8871k(this)) {
            jDoubleToLongBits = m8875j().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m8875j().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    /* renamed from: j */
    public final Number m8875j() {
        Serializable serializable = this.f20999a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C4772k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public C4095o(Number number) {
        Objects.requireNonNull(number);
        this.f20999a = number;
    }

    public C4095o(String str) {
        Objects.requireNonNull(str);
        this.f20999a = str;
    }
}
