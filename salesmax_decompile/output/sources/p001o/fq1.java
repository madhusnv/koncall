package p001o;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public abstract class fq1 {

    /* renamed from: a */
    public static final AtomicReference f23921a = new AtomicReference();

    /* renamed from: o.fq1$b */
    public static final class C13528b {

        /* renamed from: a */
        public final int f23924a;

        /* renamed from: b */
        public final int f23925b;

        /* renamed from: c */
        public final byte[] f23926c;

        public C13528b(byte[] bArr, int i, int i2) {
            this.f23926c = bArr;
            this.f23924a = i;
            this.f23925b = i2;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m27327a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    public static ByteBuffer m27328b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Opcodes.ACC_ENUM);
        byte[] bArr = (byte[]) f23921a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[Opcodes.ACC_ENUM];
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                f23921a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m27330d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* renamed from: c */
    public static C13528b m27329c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C13528b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static ByteBuffer m27330d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m27331e(ByteBuffer byteBuffer) {
        C13528b c13528bM27329c = m27329c(byteBuffer);
        if (c13528bM27329c != null && c13528bM27329c.f23924a == 0 && c13528bM27329c.f23925b == c13528bM27329c.f23926c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        m27330d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m27332f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m27330d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: g */
    public static InputStream m27333g(ByteBuffer byteBuffer) {
        return new C13527a(byteBuffer);
    }

    /* renamed from: o.fq1$a */
    public static class C13527a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f23922a;

        /* renamed from: b */
        public int f23923b = -1;

        public C13527a(ByteBuffer byteBuffer) {
            this.f23922a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f23922a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f23923b = this.f23922a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f23922a.hasRemaining()) {
                return this.f23922a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i = this.f23923b;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f23922a.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f23922a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            this.f23922a.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!this.f23922a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f23922a.get(bArr, i, iMin);
            return iMin;
        }
    }
}
