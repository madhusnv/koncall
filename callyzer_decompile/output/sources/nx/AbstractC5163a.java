package nx;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5163a {

    /* renamed from: a */
    public static final Charset f25245a;

    /* renamed from: b */
    public static final Charset f25246b;

    /* renamed from: c */
    public static final Charset f25247c;

    /* renamed from: d */
    public static final Charset f25248d;

    /* renamed from: e */
    public static volatile Charset f25249e;

    /* renamed from: f */
    public static volatile Charset f25250f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC4154l.m8922e(charsetForName, "forName(...)");
        f25245a = charsetForName;
        AbstractC4154l.m8922e(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        AbstractC4154l.m8922e(charsetForName2, "forName(...)");
        f25246b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        AbstractC4154l.m8922e(charsetForName3, "forName(...)");
        f25247c = charsetForName3;
        AbstractC4154l.m8922e(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName4 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        AbstractC4154l.m8922e(charsetForName4, "forName(...)");
        f25248d = charsetForName4;
    }
}
