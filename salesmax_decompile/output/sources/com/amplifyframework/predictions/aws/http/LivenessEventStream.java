package com.amplifyframework.predictions.aws.http;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.util.Constants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import p001o.d1i;
import p001o.j0i;
import p001o.p79;
import p001o.sq8;
import p001o.wzh;
import p001o.zq1;

/* loaded from: classes5.dex */
public final class LivenessEventStream {
    public static final LivenessEventStream INSTANCE = new LivenessEventStream();
    private static final Logger LOG;

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.PREDICTIONS, "amplify:aws-predictions");
        sq8.m48648g(logger, "logger(...)");
        LOG = logger;
    }

    private LivenessEventStream() {
    }

    /* renamed from: toUInt16-OGnWXxg, reason: not valid java name */
    private final int m68736toUInt16OGnWXxg(byte[] bArr) {
        return j0i.m33018c(j0i.m33018c(j0i.m33018c(bArr[1]) & Constants.MAX_HOST_LENGTH) | j0i.m33018c(j0i.m33018c(j0i.m33018c(bArr[0]) & Constants.MAX_HOST_LENGTH) << 8));
    }

    /* renamed from: toUInt32-OGnWXxg, reason: not valid java name */
    private final int m68737toUInt32OGnWXxg(byte[] bArr) {
        return j0i.m33018c(j0i.m33018c(j0i.m33018c(bArr[3]) & Constants.MAX_HOST_LENGTH) | j0i.m33018c(j0i.m33018c(j0i.m33018c(j0i.m33018c(j0i.m33018c(bArr[0]) & Constants.MAX_HOST_LENGTH) << 24) | j0i.m33018c(j0i.m33018c(j0i.m33018c(bArr[1]) & Constants.MAX_HOST_LENGTH) << 16)) | j0i.m33018c(j0i.m33018c(j0i.m33018c(bArr[2]) & Constants.MAX_HOST_LENGTH) << 8)));
    }

    public final LivenessResponseStream decode(zq1 zq1Var, p79 p79Var) {
        sq8.m48649h(zq1Var, "eventData");
        sq8.m48649h(p79Var, "json");
        if (zq1Var.m59694L() < 16) {
            LOG.error("Error decoding liveness event stream data. Size should be at least 16 bytes, actual size is " + zq1Var.m59694L() + ".");
            return null;
        }
        int i = 0;
        int iM68737toUInt32OGnWXxg = m68737toUInt32OGnWXxg(zq1Var.mo38687N(0, 4).mo38689Q());
        if (zq1Var.m59694L() < iM68737toUInt32OGnWXxg) {
            LOG.error("Error decoding liveness event stream data. Prelude specifies data size of " + iM68737toUInt32OGnWXxg + ", actual size is " + zq1Var.m59694L() + ".");
            return null;
        }
        int iM68737toUInt32OGnWXxg2 = m68737toUInt32OGnWXxg(zq1Var.mo38687N(4, 8).mo38689Q());
        int i2 = iM68737toUInt32OGnWXxg2 + 12;
        zq1 zq1VarMo38687N = zq1Var.mo38687N(12, i2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i < iM68737toUInt32OGnWXxg2) {
            byte bM59699h = zq1VarMo38687N.m59699h(i);
            int i3 = i + 1;
            int i4 = bM59699h + i3;
            String strM59696R = zq1VarMo38687N.mo38687N(i3, i4).m59696R();
            int i5 = i4 + 1;
            int i6 = i5 + 2;
            int iM68736toUInt16OGnWXxg = m68736toUInt16OGnWXxg(zq1VarMo38687N.mo38687N(i5, i6).mo38689Q()) + i6;
            linkedHashMap.put(strM59696R, zq1VarMo38687N.mo38687N(i6, iM68736toUInt16OGnWXxg).m59696R());
            i = iM68736toUInt16OGnWXxg;
        }
        String strM59696R2 = zq1Var.mo38687N(i2, ((zq1Var.m59694L() - i2) - 4) + i2).m59696R();
        if (linkedHashMap.keySet().contains(":event-type")) {
            String str = "{\"" + linkedHashMap.get(":event-type") + "\":" + strM59696R2 + "}";
            p79Var.mo43085a();
            return (LivenessResponseStream) p79Var.m43086c(LivenessResponseStream.Event.Companion.serializer(), str);
        }
        if (!linkedHashMap.keySet().contains(":exception-type")) {
            LOG.error("Error deserializing liveness response.");
            return null;
        }
        String str2 = "{\"" + linkedHashMap.get(":exception-type") + "\":" + strM59696R2 + "}";
        p79Var.mo43085a();
        return (LivenessResponseStream) p79Var.m43086c(LivenessResponseStream.Exception.Companion.serializer(), str2);
    }

    public final ByteBuffer encode(byte[] bArr, Map<String, ? extends Object> map) {
        int length;
        sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        sq8.m48649h(map, "headers");
        int i = 0;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            int length2 = i + entry.getKey().length();
            if (entry.getValue() instanceof String) {
                Object value = entry.getValue();
                sq8.m48647f(value, "null cannot be cast to non-null type kotlin.String");
                length = ((String) value).length();
            } else if (entry.getValue() instanceof Date) {
                i = length2 + 8 + 2;
            } else {
                Object value2 = entry.getValue();
                sq8.m48647f(value2, "null cannot be cast to non-null type kotlin.ByteArray");
                length = ((byte[]) value2).length;
            }
            i = length2 + length + 4;
        }
        int length3 = bArr.length + 16 + i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length3);
        byteBufferAllocate.putInt(length3);
        byteBufferAllocate.putInt(i);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(byteBufferAllocate.array(), 0, 8);
        CRC32 crc32 = new CRC32();
        crc32.update(bArrCopyOfRange);
        byteBufferAllocate.putInt((int) crc32.getValue());
        for (Map.Entry<String, ? extends Object> entry2 : map.entrySet()) {
            byteBufferAllocate.put(wzh.m55511c((byte) entry2.getKey().length()));
            zq1.C18692a c18692a = zq1.f57497d;
            byteBufferAllocate.put(c18692a.m59707c(entry2.getKey()).mo38689Q());
            byteBufferAllocate.put((byte) (entry2.getValue() instanceof String ? 7 : entry2.getValue() instanceof Date ? 8 : 6));
            if (entry2.getValue() instanceof String) {
                Object value3 = entry2.getValue();
                sq8.m48647f(value3, "null cannot be cast to non-null type kotlin.String");
                byteBufferAllocate.putShort(d1i.m22246c((short) ((String) value3).length()));
            } else if (entry2.getValue() instanceof byte[]) {
                Object value4 = entry2.getValue();
                sq8.m48647f(value4, "null cannot be cast to non-null type kotlin.ByteArray");
                byteBufferAllocate.putShort(d1i.m22246c((short) ((byte[]) value4).length));
            }
            if (entry2.getValue() instanceof String) {
                Object value5 = entry2.getValue();
                sq8.m48647f(value5, "null cannot be cast to non-null type kotlin.String");
                byteBufferAllocate.put(c18692a.m59707c((String) value5).mo38689Q());
            } else if (entry2.getValue() instanceof Date) {
                Object value6 = entry2.getValue();
                sq8.m48647f(value6, "null cannot be cast to non-null type java.util.Date");
                byteBufferAllocate.putLong(((Date) value6).getTime());
            } else {
                Object value7 = entry2.getValue();
                sq8.m48647f(value7, "null cannot be cast to non-null type kotlin.ByteArray");
                byteBufferAllocate.put((byte[]) value7);
            }
        }
        byteBufferAllocate.put(bArr);
        CRC32 crc322 = new CRC32();
        crc322.update(Arrays.copyOfRange(byteBufferAllocate.array(), 0, length3 - 4));
        byteBufferAllocate.putInt((int) crc322.getValue());
        Buffer bufferPosition = byteBufferAllocate.position(0);
        sq8.m48647f(bufferPosition, "null cannot be cast to non-null type java.nio.ByteBuffer");
        return (ByteBuffer) bufferPosition;
    }
}
