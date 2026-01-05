package p001o;

/* loaded from: classes6.dex */
public abstract class kqi {
    /* renamed from: a */
    public static final long m36054a(String str, int i, int i2) {
        int i3;
        sq8.m48649h(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        long j = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i3 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char cCharAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += 4;
                        i += 2;
                    }
                }
                j += i3;
            }
            i++;
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m36055b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m36054a(str, i, i2);
    }
}
