package p001o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public abstract class mh1 {

    /* renamed from: a */
    public static final BigInteger f35453a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    public static final double f35454b = Math.log(10.0d);

    /* renamed from: c */
    public static final double f35455c = Math.log(2.0d);

    /* renamed from: a */
    public static BigInteger m39043a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
