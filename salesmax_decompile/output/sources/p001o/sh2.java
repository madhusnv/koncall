package p001o;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public final class sh2 {

    /* renamed from: a */
    public static final sh2 f45421a = new sh2();

    /* renamed from: b */
    public static final Charset f45422b;

    /* renamed from: c */
    public static final Charset f45423c;

    /* renamed from: d */
    public static final Charset f45424d;

    /* renamed from: e */
    public static final Charset f45425e;

    /* renamed from: f */
    public static final Charset f45426f;

    /* renamed from: g */
    public static final Charset f45427g;

    /* renamed from: h */
    public static volatile Charset f45428h;

    /* renamed from: i */
    public static volatile Charset f45429i;

    static {
        Charset charsetForName = Charset.forName(HTTP.UTF_8);
        sq8.m48648g(charsetForName, "forName(...)");
        f45422b = charsetForName;
        Charset charsetForName2 = Charset.forName(HTTP.UTF_16);
        sq8.m48648g(charsetForName2, "forName(...)");
        f45423c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        sq8.m48648g(charsetForName3, "forName(...)");
        f45424d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        sq8.m48648g(charsetForName4, "forName(...)");
        f45425e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        sq8.m48648g(charsetForName5, "forName(...)");
        f45426f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        sq8.m48648g(charsetForName6, "forName(...)");
        f45427g = charsetForName6;
    }

    /* renamed from: a */
    public final Charset m48347a() {
        Charset charset = f45429i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        sq8.m48648g(charsetForName, "forName(...)");
        f45429i = charsetForName;
        return charsetForName;
    }

    /* renamed from: b */
    public final Charset m48348b() {
        Charset charset = f45428h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        sq8.m48648g(charsetForName, "forName(...)");
        f45428h = charsetForName;
        return charsetForName;
    }
}
