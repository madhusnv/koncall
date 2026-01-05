package rj;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rj.g */
/* loaded from: classes.dex */
public final class C6561g {

    /* renamed from: a */
    public static final byte f31417a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f31418b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public static String m12574a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b10 = bArrArray[0];
        bArrArray[16] = b10;
        bArrArray[0] = (byte) ((b10 & f31418b) | f31417a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
