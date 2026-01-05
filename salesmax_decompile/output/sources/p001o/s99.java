package p001o;

import java.io.Serializable;
import java.nio.charset.Charset;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public class s99 implements Serializable {

    /* renamed from: f */
    public static final s99 f45026f = new s99(null, -1, -1, -1, -1);

    /* renamed from: a */
    public final long f45027a;

    /* renamed from: b */
    public final long f45028b;

    /* renamed from: c */
    public final int f45029c;

    /* renamed from: d */
    public final int f45030d;

    /* renamed from: e */
    public final transient Object f45031e;

    public s99(Object obj, long j, int i, int i2) {
        this(obj, -1L, j, i, i2);
    }

    /* renamed from: a */
    public final int m48039a(StringBuilder sb, String str) {
        sb.append(TokenParser.DQUOTE);
        sb.append(str);
        sb.append(TokenParser.DQUOTE);
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StringBuilder m48040b(StringBuilder sb) {
        int length;
        int iM48039a;
        Object obj = this.f45031e;
        if (obj == null) {
            sb.append("UNKNOWN");
            return sb;
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (obj instanceof byte[]) {
            name = "byte[]";
        } else if (obj instanceof char[]) {
            name = "char[]";
        }
        sb.append('(');
        sb.append(name);
        sb.append(')');
        int length2 = 0;
        String str = " chars";
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            length = charSequence.length();
            iM48039a = m48039a(sb, charSequence.subSequence(0, Math.min(length, 500)).toString());
        } else {
            if (!(obj instanceof char[])) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int iMin = Math.min(bArr.length, 500);
                    m48039a(sb, new String(bArr, 0, iMin, Charset.forName(HTTP.UTF_8)));
                    length2 = bArr.length - iMin;
                    str = " bytes";
                }
                if (length2 > 0) {
                    sb.append("[truncated ");
                    sb.append(length2);
                    sb.append(str);
                    sb.append(']');
                }
                return sb;
            }
            char[] cArr = (char[]) obj;
            length = cArr.length;
            iM48039a = m48039a(sb, new String(cArr, 0, Math.min(length, 500)));
        }
        length2 = length - iM48039a;
        if (length2 > 0) {
        }
        return sb;
    }

    /* renamed from: c */
    public long m48041c() {
        return this.f45027a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof s99)) {
            return false;
        }
        s99 s99Var = (s99) obj;
        Object obj2 = this.f45031e;
        if (obj2 == null) {
            if (s99Var.f45031e != null) {
                return false;
            }
        } else if (!obj2.equals(s99Var.f45031e)) {
            return false;
        }
        return this.f45029c == s99Var.f45029c && this.f45030d == s99Var.f45030d && this.f45028b == s99Var.f45028b && m48041c() == s99Var.m48041c();
    }

    public int hashCode() {
        Object obj = this.f45031e;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.f45029c) + this.f45030d) ^ ((int) this.f45028b)) + ((int) this.f45027a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        m48040b(sb);
        sb.append("; line: ");
        sb.append(this.f45029c);
        sb.append(", column: ");
        sb.append(this.f45030d);
        sb.append(']');
        return sb.toString();
    }

    public s99(Object obj, long j, long j2, int i, int i2) {
        this.f45031e = obj;
        this.f45027a = j;
        this.f45028b = j2;
        this.f45029c = i;
        this.f45030d = i2;
    }
}
