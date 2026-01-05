package j$.time.format;

import j$.time.AbstractC3428d;
import j$.time.temporal.C3485o;
import j$.time.temporal.TemporalField;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* renamed from: j$.time.format.f */
/* loaded from: classes2.dex */
public final class C3436f extends C3439i {

    /* renamed from: g */
    public final boolean f18156g;

    @Override // j$.time.format.C3439i, j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        boolean z6 = c3451u.f18204c;
        DateTimeFormatter dateTimeFormatter = c3451u.f18202a;
        int i11 = (z6 || mo7964b(c3451u)) ? this.f18161b : 0;
        int i12 = (c3451u.f18204c || mo7964b(c3451u)) ? this.f18162c : 9;
        int length = charSequence.length();
        if (i10 != length) {
            if (this.f18156g) {
                if (charSequence.charAt(i10) == dateTimeFormatter.f18113c.f18130c) {
                    i10++;
                } else if (i11 > 0) {
                    return ~i10;
                }
            }
            int i13 = i10;
            int i14 = i11 + i13;
            if (i14 > length) {
                return ~i13;
            }
            int iMin = Math.min(i12 + i13, length);
            int i15 = 0;
            int i16 = i13;
            while (true) {
                if (i16 >= iMin) {
                    break;
                }
                int i17 = i16 + 1;
                int iCharAt = charSequence.charAt(i16) - dateTimeFormatter.f18113c.f18128a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    i15 = (i15 * 10) + iCharAt;
                    i16 = i17;
                } else if (i17 < i14) {
                    return ~i13;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i15).movePointLeft(i16 - i13);
            C3485o c3485oMo8005K = this.f18160a.mo8005K();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c3485oMo8005K.f18284a);
            return c3451u.m7989f(this.f18160a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c3485oMo8005K.f18287d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i13, i16);
        }
        if (i11 > 0) {
            return ~i10;
        }
        return i10;
    }

    @Override // j$.time.format.C3439i
    /* renamed from: b */
    public final boolean mo7964b(C3451u c3451u) {
        return c3451u.f18204c && this.f18161b == this.f18162c && !this.f18156g;
    }

    public C3436f(TemporalField temporalField, int i10, int i11, boolean z6) {
        this(temporalField, i10, i11, z6, 0);
        Objects.requireNonNull(temporalField, "field");
        C3485o c3485oMo8005K = temporalField.mo8005K();
        if (c3485oMo8005K.f18284a != c3485oMo8005K.f18285b || c3485oMo8005K.f18286c != c3485oMo8005K.f18287d) {
            throw new IllegalArgumentException(AbstractC3428d.m7935a("Field must have a fixed set of values: ", temporalField));
        }
        if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
    }

    public C3436f(TemporalField temporalField, int i10, int i11, boolean z6, int i12) {
        super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i12);
        this.f18156g = z6;
    }

    @Override // j$.time.format.C3439i
    /* renamed from: d */
    public final C3439i mo7965d() {
        if (this.f18164e == -1) {
            return this;
        }
        return new C3436f(this.f18160a, this.f18161b, this.f18162c, this.f18156g, -1);
    }

    @Override // j$.time.format.C3439i
    /* renamed from: e */
    public final C3439i mo7966e(int i10) {
        return new C3436f(this.f18160a, this.f18161b, this.f18162c, this.f18156g, this.f18164e + i10);
    }

    @Override // j$.time.format.C3439i, j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        TemporalField temporalField = this.f18160a;
        Long lM7991a = c3453w.m7991a(temporalField);
        if (lM7991a == null) {
            return false;
        }
        DecimalStyle decimalStyle = c3453w.f18212b.f18113c;
        long jLongValue = lM7991a.longValue();
        C3485o c3485oMo8005K = temporalField.mo8005K();
        c3485oMo8005K.m8016b(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c3485oMo8005K.f18284a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c3485oMo8005K.f18287d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z6 = this.f18156g;
        int i10 = this.f18161b;
        if (iScale != 0) {
            String strM7949a = decimalStyle.m7949a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f18162c), roundingMode).toPlainString().substring(2));
            if (z6) {
                sb2.append(decimalStyle.f18130c);
            }
            sb2.append(strM7949a);
            return true;
        }
        if (i10 > 0) {
            if (z6) {
                sb2.append(decimalStyle.f18130c);
            }
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(decimalStyle.f18128a);
            }
        }
        return true;
    }

    @Override // j$.time.format.C3439i
    public final String toString() {
        return "Fraction(" + this.f18160a + "," + this.f18161b + "," + this.f18162c + (this.f18156g ? ",DecimalPoint" : "") + ")";
    }
}
