package p001o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public abstract class o76 {
    /* renamed from: a */
    public static int m41660a(int i) {
        return (((i + 8) - 1) & (-8)) / 8;
    }

    /* renamed from: b */
    public static byte[] m41661b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: c */
    public static RuntimeException m41662c(String str) {
        return new IllegalStateException(str);
    }

    /* renamed from: d */
    public static byte[] m41663d(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw m41662c("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    /* renamed from: e */
    public static byte[] m41664e(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw m41662c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw m41662c(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw m41662c("Inflater did not finish");
            }
            throw m41662c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: f */
    public static String m41665f(InputStream inputStream, int i) {
        return new String(m41663d(inputStream, i), StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    public static long m41666g(InputStream inputStream, int i) throws IOException {
        byte[] bArrM41663d = m41663d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrM41663d[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: h */
    public static int m41667h(InputStream inputStream) {
        return (int) m41666g(inputStream, 2);
    }

    /* renamed from: i */
    public static long m41668i(InputStream inputStream) {
        return m41666g(inputStream, 4);
    }

    /* renamed from: j */
    public static int m41669j(InputStream inputStream) {
        return (int) m41666g(inputStream, 1);
    }

    /* renamed from: k */
    public static int m41670k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* renamed from: l */
    public static void m41671l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (!(fileLock != null && fileLock.isValid())) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* renamed from: m */
    public static void m41672m(OutputStream outputStream, byte[] bArr) throws IOException {
        m41676q(outputStream, bArr.length);
        byte[] bArrM41661b = m41661b(bArr);
        m41676q(outputStream, bArrM41661b.length);
        outputStream.write(bArrM41661b);
    }

    /* renamed from: n */
    public static void m41673n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: o */
    public static void m41674o(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* renamed from: p */
    public static void m41675p(OutputStream outputStream, int i) throws IOException {
        m41674o(outputStream, i, 2);
    }

    /* renamed from: q */
    public static void m41676q(OutputStream outputStream, long j) throws IOException {
        m41674o(outputStream, j, 4);
    }

    /* renamed from: r */
    public static void m41677r(OutputStream outputStream, int i) throws IOException {
        m41674o(outputStream, i, 1);
    }
}
