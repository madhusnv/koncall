package j$.util;

import j$.time.Instant;
import java.util.Date;

/* loaded from: classes9.dex */
public class DesugarDate {
    public static Date from(Instant instant) {
        try {
            return new Date(instant.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}
