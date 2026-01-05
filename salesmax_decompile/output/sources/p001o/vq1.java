package p001o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes3.dex */
public abstract class vq1 {

    /* renamed from: a */
    public static final OutputStream f50709a = new C17644a();

    /* renamed from: o.vq1$a */
    public class C17644a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            dgd.m23062o(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            dgd.m23062o(bArr);
            dgd.m23067t(i, i2 + i, bArr.length);
        }
    }

    /* renamed from: a */
    public static byte[] m53198a(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* renamed from: b */
    public static byte[] m53199b() {
        return new byte[8192];
    }

    /* renamed from: c */
    public static long m53200c(InputStream inputStream) {
        byte[] bArrM53199b = m53199b();
        long j = 0;
        while (true) {
            long j2 = inputStream.read(bArrM53199b);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    /* renamed from: d */
    public static byte[] m53201d(InputStream inputStream) {
        dgd.m23062o(inputStream);
        return m53202e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    public static byte[] m53202e(InputStream inputStream, Queue queue, int i) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m53198a(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = fl8.m27022f(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return m53198a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
