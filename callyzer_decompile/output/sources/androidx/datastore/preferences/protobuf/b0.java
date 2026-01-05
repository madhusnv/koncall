package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a */
    public static final Charset f2293a;

    /* renamed from: b */
    public static final byte[] f2294b;

    static {
        Charset.forName("US-ASCII");
        f2293a = Charset.forName("UTF-8");
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f2294b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0313h(bArr, 0, 0, false).mo887j(0);
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static void m820a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: b */
    public static int m821b(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }
}
