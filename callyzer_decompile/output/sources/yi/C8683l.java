package yi;

import a6.C0058f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.l */
/* loaded from: classes.dex */
public final class C8683l implements Closeable {

    /* renamed from: g */
    public static final Logger f42025g = Logger.getLogger(C8683l.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f42026a;

    /* renamed from: b */
    public int f42027b;

    /* renamed from: c */
    public int f42028c;

    /* renamed from: d */
    public C8680i f42029d;

    /* renamed from: e */
    public C8680i f42030e;

    /* renamed from: f */
    public final byte[] f42031f;

    public C8683l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f42031f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    m16021U(bArr2, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f42026a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM16022z = m16022z(bArr, 0);
        this.f42027b = iM16022z;
        if (iM16022z > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f42027b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f42028c = m16022z(bArr, 4);
        int iM16022z2 = m16022z(bArr, 8);
        int iM16022z3 = m16022z(bArr, 12);
        this.f42029d = m16033w(iM16022z2);
        this.f42030e = m16033w(iM16022z3);
    }

    /* renamed from: U */
    public static void m16021U(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    /* renamed from: z */
    public static int m16022z(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* renamed from: A */
    public final synchronized void m16023A() {
        if (m16032u()) {
            throw new NoSuchElementException();
        }
        if (this.f42028c == 1) {
            synchronized (this) {
                m16028S(4096, 0, 0, 0);
                this.f42028c = 0;
                C8680i c8680i = C8680i.f42019c;
                this.f42029d = c8680i;
                this.f42030e = c8680i;
                if (this.f42027b > 4096) {
                    RandomAccessFile randomAccessFile = this.f42026a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f42027b = 4096;
            }
        } else {
            C8680i c8680i2 = this.f42029d;
            int iM16027R = m16027R(c8680i2.f42020a + 4 + c8680i2.f42021b);
            m16024H(iM16027R, 0, this.f42031f, 4);
            int iM16022z = m16022z(this.f42031f, 0);
            m16028S(this.f42027b, this.f42028c - 1, iM16027R, this.f42030e.f42020a);
            this.f42028c--;
            this.f42029d = new C8680i(iM16027R, iM16022z);
        }
    }

    /* renamed from: H */
    public final void m16024H(int i10, int i11, byte[] bArr, int i12) throws IOException {
        int iM16027R = m16027R(i10);
        int i13 = iM16027R + i12;
        int i14 = this.f42027b;
        RandomAccessFile randomAccessFile = this.f42026a;
        if (i13 <= i14) {
            randomAccessFile.seek(iM16027R);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iM16027R;
        randomAccessFile.seek(iM16027R);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    /* renamed from: J */
    public final void m16025J(int i10, int i11, byte[] bArr) throws IOException {
        int iM16027R = m16027R(i10);
        int i12 = iM16027R + i11;
        int i13 = this.f42027b;
        RandomAccessFile randomAccessFile = this.f42026a;
        if (i12 <= i13) {
            randomAccessFile.seek(iM16027R);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iM16027R;
        randomAccessFile.seek(iM16027R);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    /* renamed from: P */
    public final int m16026P() {
        if (this.f42028c == 0) {
            return 16;
        }
        C8680i c8680i = this.f42030e;
        int i10 = c8680i.f42020a;
        int i11 = this.f42029d.f42020a;
        return i10 >= i11 ? (i10 - i11) + 4 + c8680i.f42021b + 16 : (((i10 + 4) + c8680i.f42021b) + this.f42027b) - i11;
    }

    /* renamed from: R */
    public final int m16027R(int i10) {
        int i11 = this.f42027b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    /* renamed from: S */
    public final void m16028S(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f42031f;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f42026a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                m16021U(bArr, i15, iArr[i14]);
                i15 += 4;
                i14++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f42026a.close();
    }

    /* renamed from: h */
    public final void m16029h(byte[] bArr) {
        int iM16027R;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    m16030j(length);
                    boolean zM16032u = m16032u();
                    if (zM16032u) {
                        iM16027R = 16;
                    } else {
                        C8680i c8680i = this.f42030e;
                        iM16027R = m16027R(c8680i.f42020a + 4 + c8680i.f42021b);
                    }
                    C8680i c8680i2 = new C8680i(iM16027R, length);
                    m16021U(this.f42031f, 0, length);
                    m16025J(iM16027R, 4, this.f42031f);
                    m16025J(iM16027R + 4, length, bArr);
                    m16028S(this.f42027b, this.f42028c + 1, zM16032u ? iM16027R : this.f42029d.f42020a, iM16027R);
                    this.f42030e = c8680i2;
                    this.f42028c++;
                    if (zM16032u) {
                        this.f42029d = c8680i2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: j */
    public final void m16030j(int i10) throws IOException {
        int i11 = i10 + 4;
        int iM16026P = this.f42027b - m16026P();
        if (iM16026P >= i11) {
            return;
        }
        int i12 = this.f42027b;
        do {
            iM16026P += i12;
            i12 <<= 1;
        } while (iM16026P < i11);
        RandomAccessFile randomAccessFile = this.f42026a;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        C8680i c8680i = this.f42030e;
        int iM16027R = m16027R(c8680i.f42020a + 4 + c8680i.f42021b);
        if (iM16027R < this.f42029d.f42020a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f42027b);
            long j6 = iM16027R - 4;
            if (channel.transferTo(16L, j6, channel) != j6) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f42030e.f42020a;
        int i14 = this.f42029d.f42020a;
        if (i13 < i14) {
            int i15 = (this.f42027b + i13) - 16;
            m16028S(i12, this.f42028c, i14, i15);
            this.f42030e = new C8680i(i15, this.f42030e.f42021b);
        } else {
            m16028S(i12, this.f42028c, i14, i13);
        }
        this.f42027b = i12;
    }

    /* renamed from: n */
    public final synchronized void m16031n(InterfaceC8682k interfaceC8682k) {
        int iM16027R = this.f42029d.f42020a;
        for (int i10 = 0; i10 < this.f42028c; i10++) {
            C8680i c8680iM16033w = m16033w(iM16027R);
            interfaceC8682k.mo163a(new C8681j(this, c8680iM16033w), c8680iM16033w.f42021b);
            iM16027R = m16027R(c8680iM16033w.f42020a + 4 + c8680iM16033w.f42021b);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C8683l.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f42027b);
        sb2.append(", size=");
        sb2.append(this.f42028c);
        sb2.append(", first=");
        sb2.append(this.f42029d);
        sb2.append(", last=");
        sb2.append(this.f42030e);
        sb2.append(", element lengths=[");
        try {
            m16031n(new C0058f(sb2));
        } catch (IOException e2) {
            f42025g.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* renamed from: u */
    public final synchronized boolean m16032u() {
        return this.f42028c == 0;
    }

    /* renamed from: w */
    public final C8680i m16033w(int i10) throws IOException {
        if (i10 == 0) {
            return C8680i.f42019c;
        }
        RandomAccessFile randomAccessFile = this.f42026a;
        randomAccessFile.seek(i10);
        return new C8680i(i10, randomAccessFile.readInt());
    }
}
