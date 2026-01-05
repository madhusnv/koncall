package p001o;

/* loaded from: classes6.dex */
public abstract class b8 {
    /* renamed from: a */
    public static final byte m18263a(char c) {
        if (c < '~') {
            return gh2.f25154c[c];
        }
        return (byte) 0;
    }

    /* renamed from: b */
    public static final char m18264b(int i) {
        if (i < 117) {
            return gh2.f25153b[i];
        }
        return (char) 0;
    }

    /* renamed from: c */
    public static final String m18265c(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }
}
