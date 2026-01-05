package p001o;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class km6 {

    /* renamed from: o.km6$a */
    public static class C14867a {
        /* renamed from: a */
        public static void m35911a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        /* renamed from: b */
        public static FileDescriptor m35912b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* renamed from: c */
        public static long m35913c(FileDescriptor fileDescriptor, long j, int i) {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    /* renamed from: o.km6$b */
    public static class C14868b {
        /* renamed from: a */
        public static void m35914a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* renamed from: a */
    public static String m35904a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m35905b(FileDescriptor fileDescriptor) {
        try {
            C14867a.m35911a(fileDescriptor);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static void m35906c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static long[] m35907d(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* renamed from: e */
    public static int m35908e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return i;
            }
            i += i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    /* renamed from: f */
    public static void m35909f(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    /* renamed from: g */
    public static boolean m35910g(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
