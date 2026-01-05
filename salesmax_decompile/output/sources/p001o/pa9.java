package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public abstract class pa9 {

    /* renamed from: a */
    public int f39703a;

    /* renamed from: b */
    public int f39704b;

    /* renamed from: a */
    public final int m43269a() {
        int i = this.f39704b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public abstract String mo26380b();

    /* renamed from: c */
    public final int m43270c() {
        return this.f39704b + 1;
    }

    /* renamed from: d */
    public final boolean m43271d() {
        return this.f39703a == 1;
    }

    /* renamed from: e */
    public final boolean m43272e() {
        return this.f39703a == 2;
    }

    /* renamed from: f */
    public final boolean m43273f() {
        return this.f39703a == 0;
    }

    /* renamed from: g */
    public String m43274g() {
        int i = this.f39703a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f39703a;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append('{');
            String strMo26380b = mo26380b();
            if (strMo26380b != null) {
                sb.append(TokenParser.DQUOTE);
                mh2.m39045b(sb, strMo26380b);
                sb.append(TokenParser.DQUOTE);
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(m43269a());
            sb.append(']');
        }
        return sb.toString();
    }
}
