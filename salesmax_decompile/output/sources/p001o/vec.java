package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class vec {
    /* renamed from: a */
    public static List m52664a(byte[] bArr) {
        long jM52674k = m52674k(m52669f(bArr));
        long jM52674k2 = m52674k(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m52665b(jM52674k));
        arrayList.add(m52665b(jM52674k2));
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m52665b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: c */
    public static int m52666c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    public static long m52667d(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = i2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? TransferRecord.MAXIMUM_UPLOAD_PARTS << (r0 & 1) : (i4 & 3) == 3 ? 60000 : TransferRecord.MAXIMUM_UPLOAD_PARTS << r0);
    }

    /* renamed from: e */
    public static long m52668e(byte[] bArr) {
        return m52667d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* renamed from: f */
    public static int m52669f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: g */
    public static boolean m52670g(long j, long j2) {
        return j - j2 <= m52674k(3840L) / 1000;
    }

    /* renamed from: h */
    public static int m52671h(ByteBuffer byteBuffer) {
        int iM52672i = m52672i(byteBuffer);
        int i = byteBuffer.get(iM52672i + 26) + 27 + iM52672i;
        return (int) ((m52667d(byteBuffer.get(i), byteBuffer.limit() - i > 1 ? byteBuffer.get(i + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* renamed from: i */
    public static int m52672i(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b = byteBuffer.get(26);
        int i = 28;
        int i2 = 28;
        for (int i3 = 0; i3 < b; i3++) {
            i2 += byteBuffer.get(i3 + 27);
        }
        byte b2 = byteBuffer.get(i2 + 26);
        for (int i4 = 0; i4 < b2; i4++) {
            i += byteBuffer.get(i2 + 27 + i4);
        }
        return i2 + i;
    }

    /* renamed from: j */
    public static int m52673j(ByteBuffer byteBuffer) {
        return (int) ((m52667d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* renamed from: k */
    public static long m52674k(long j) {
        return (j * 1000000000) / 48000;
    }
}
