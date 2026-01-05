package androidx.room.util;

import java.nio.ByteBuffer;
import java.util.UUID;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class UUIDUtil {
    public static final UUID convertByteToUUID(byte[] bArr) {
        sq8.m48649h(bArr, "bytes");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public static final byte[] convertUUIDToByte(UUID uuid) {
        sq8.m48649h(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        sq8.m48648g(bArrArray, "buffer.array()");
        return bArrArray;
    }
}
