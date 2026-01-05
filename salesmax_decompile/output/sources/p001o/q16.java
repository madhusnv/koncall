package p001o;

/* loaded from: classes6.dex */
public abstract class q16 extends p16 {
    /* renamed from: d */
    public static final o16 m44669d(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return o16.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        }
        if (c == 'H') {
            return o16.HOURS;
        }
        if (c == 'M') {
            return o16.MINUTES;
        }
        if (c == 'S') {
            return o16.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
    }

    /* renamed from: e */
    public static final o16 m44670e(String str) {
        sq8.m48649h(str, "shortName");
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && str.equals("us")) {
                                    return o16.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return o16.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return o16.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return o16.SECONDS;
                    }
                } else if (str.equals("m")) {
                    return o16.MINUTES;
                }
            } else if (str.equals("h")) {
                return o16.HOURS;
            }
        } else if (str.equals("d")) {
            return o16.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
