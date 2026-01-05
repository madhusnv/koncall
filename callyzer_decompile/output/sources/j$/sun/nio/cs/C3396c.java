package j$.sun.nio.cs;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: j$.sun.nio.cs.c */
/* loaded from: classes2.dex */
public final class C3396c extends Charset {

    /* renamed from: a */
    public static final C3396c f18007a;

    static {
        int i10 = AbstractC3397d.f18008a;
        f18007a = new C3396c(LocalizedMessage.DEFAULT_ENCODING, new String[]{"iso-ir-100", "ISO_8859-1", "latin1", "l1", "IBM819", "cp819", "csISOLatin1", "819", "IBM-819", "ISO8859_1", "ISO_8859-1:1987", "ISO_8859_1", "8859_1", "ISO8859-1"});
    }

    @Override // java.nio.charset.Charset
    public final boolean contains(Charset charset) {
        return charset instanceof C3396c;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new C3394a(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new C3395b(this);
    }
}
