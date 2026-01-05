package p001o;

/* loaded from: classes3.dex */
public abstract class mqi {
    /* renamed from: a */
    public static final char[] m39513a(eh2 eh2Var, int i) {
        sq8.m48649h(eh2Var, "<this>");
        if (i >= 0 && i < 65536) {
            return new char[]{(char) i};
        }
        if (65536 <= i && i < 1114112) {
            int i2 = i - 65536;
            return new char[]{(char) (((i2 >>> 10) & 1023) + 55296), (char) ((i2 & 1023) + 56320)};
        }
        throw new IllegalArgumentException("invalid codepoint " + i);
    }
}
