package jakarta.mail.util;

import jakarta.mail.internet.InterfaceC3676y;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.util.d */
/* loaded from: classes3.dex */
public class C3693d extends BufferedInputStream implements InterfaceC3676y {
    private static int defaultBufferSize = 2048;
    protected long bufpos;
    protected int bufsize;
    protected long datalen;

    /* renamed from: in, reason: collision with root package name */
    protected RandomAccessFile f44379in;
    private boolean master;

    /* renamed from: sf, reason: collision with root package name */
    private C3692c f44380sf;
    protected long start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3693d(File file) {
        super(null);
        int i10 = defaultBufferSize;
        this.start = 0L;
        this.master = true;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Buffer size <= 0");
        }
        C3692c c3692c = new C3692c();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        c3692c.f19427b = randomAccessFile;
        this.f44380sf = c3692c;
        synchronized (c3692c) {
            c3692c.f19426a++;
        }
        this.f44379in = randomAccessFile;
        this.start = 0L;
        this.datalen = randomAccessFile.length();
        this.bufsize = i10;
        ((BufferedInputStream) this).buf = new byte[i10];
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        int i10;
        m8267h();
        i10 = ((BufferedInputStream) this).count;
        return (i10 - ((BufferedInputStream) this).pos) + ((int) ((this.start + this.datalen) - (this.bufpos + i10)));
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f44379in == null) {
            return;
        }
        try {
            if (this.master) {
                C3692c c3692c = this.f44380sf;
                synchronized (c3692c) {
                    if (c3692c.f19426a > 0) {
                        c3692c.f19426a = 0;
                        c3692c.f19427b.close();
                    } else {
                        try {
                            c3692c.f19427b.close();
                        } catch (IOException unused) {
                        }
                    }
                }
            } else {
                C3692c c3692c2 = this.f44380sf;
                synchronized (c3692c2) {
                    int i10 = c3692c2.f19426a;
                    if (i10 > 0) {
                        int i11 = i10 - 1;
                        c3692c2.f19426a = i11;
                        if (i11 <= 0) {
                            c3692c2.f19427b.close();
                        }
                    }
                }
            }
            this.f44380sf = null;
            this.f44379in = null;
            ((BufferedInputStream) this).buf = null;
        } catch (Throwable th2) {
            this.f44380sf = null;
            this.f44379in = null;
            ((BufferedInputStream) this).buf = null;
            throw th2;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    @Override // jakarta.mail.internet.InterfaceC3676y
    public long getPosition() {
        if (this.f44379in != null) {
            return (this.bufpos + ((BufferedInputStream) this).pos) - this.start;
        }
        throw new RuntimeException("Stream closed");
    }

    /* renamed from: h */
    public final void m8267h() throws IOException {
        if (this.f44379in == null) {
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: j */
    public final void m8268j() {
        if (((BufferedInputStream) this).markpos < 0) {
            ((BufferedInputStream) this).pos = 0;
            this.bufpos += ((BufferedInputStream) this).count;
        } else if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).buf.length) {
            int i10 = ((BufferedInputStream) this).markpos;
            if (i10 > 0) {
                int i11 = ((BufferedInputStream) this).pos - i10;
                System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).markpos, ((BufferedInputStream) this).buf, 0, i11);
                ((BufferedInputStream) this).pos = i11;
                this.bufpos += ((BufferedInputStream) this).markpos;
                ((BufferedInputStream) this).markpos = 0;
            } else {
                int length = ((BufferedInputStream) this).buf.length;
                int i12 = ((BufferedInputStream) this).marklimit;
                if (length >= i12) {
                    ((BufferedInputStream) this).markpos = -1;
                    ((BufferedInputStream) this).pos = 0;
                    this.bufpos += ((BufferedInputStream) this).count;
                } else {
                    int i13 = ((BufferedInputStream) this).pos * 2;
                    if (i13 <= i12) {
                        i12 = i13;
                    }
                    byte[] bArr = new byte[i12];
                    System.arraycopy(((BufferedInputStream) this).buf, 0, bArr, 0, ((BufferedInputStream) this).pos);
                    ((BufferedInputStream) this).buf = bArr;
                }
            }
        }
        ((BufferedInputStream) this).count = ((BufferedInputStream) this).pos;
        int length2 = ((BufferedInputStream) this).buf.length;
        int i14 = ((BufferedInputStream) this).pos;
        int i15 = length2 - i14;
        long j6 = this.bufpos;
        long j10 = this.start;
        long j11 = (j6 - j10) + i14 + i15;
        long j12 = this.datalen;
        if (j11 > j12) {
            i15 = (int) (j12 - ((j6 - j10) + i14));
        }
        synchronized (this.f44379in) {
            try {
                this.f44379in.seek(this.bufpos + ((BufferedInputStream) this).pos);
                int i16 = this.f44379in.read(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, i15);
                if (i16 > 0) {
                    ((BufferedInputStream) this).count = i16 + ((BufferedInputStream) this).pos;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((BufferedInputStream) this).marklimit = i10;
        ((BufferedInputStream) this).markpos = ((BufferedInputStream) this).pos;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    /* renamed from: n */
    public final int m8269n(int i10, int i11, byte[] bArr) {
        int i12 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
        if (i12 <= 0) {
            m8268j();
            i12 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
            if (i12 <= 0) {
                return -1;
            }
        }
        if (i12 < i11) {
            i11 = i12;
        }
        System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, bArr, i10, i11);
        ((BufferedInputStream) this).pos += i11;
        return i11;
    }

    @Override // jakarta.mail.internet.InterfaceC3676y
    public synchronized InputStream newStream(long j6, long j10) {
        C3693d c3693d;
        RandomAccessFile randomAccessFile;
        try {
            if (this.f44379in == null) {
                throw new RuntimeException("Stream closed");
            }
            if (j6 < 0) {
                throw new IllegalArgumentException("start < 0");
            }
            if (j10 == -1) {
                j10 = this.datalen;
            }
            C3692c c3692c = this.f44380sf;
            long j11 = this.start + j6;
            long j12 = j10 - j6;
            int i10 = this.bufsize;
            c3693d = new C3693d((InputStream) null);
            c3693d.start = 0L;
            c3693d.master = false;
            c3693d.f44380sf = c3692c;
            synchronized (c3692c) {
                c3692c.f19426a++;
                randomAccessFile = c3692c.f19427b;
            }
            c3693d.f44379in = randomAccessFile;
            c3693d.start = j11;
            c3693d.bufpos = j11;
            c3693d.datalen = j12;
            c3693d.bufsize = i10;
            ((BufferedInputStream) c3693d).buf = new byte[i10];
        } catch (Throwable th2) {
            throw th2;
        }
        return c3693d;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        m8267h();
        if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).count) {
            m8268j();
            if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).count) {
                return -1;
            }
        }
        byte[] bArr = ((BufferedInputStream) this).buf;
        int i10 = ((BufferedInputStream) this).pos;
        ((BufferedInputStream) this).pos = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        m8267h();
        int i10 = ((BufferedInputStream) this).markpos;
        if (i10 < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        ((BufferedInputStream) this).pos = i10;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j6) {
        m8267h();
        if (j6 <= 0) {
            return 0L;
        }
        long j10 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
        if (j10 <= 0) {
            m8268j();
            j10 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
            if (j10 <= 0) {
                return 0L;
            }
        }
        if (j10 < j6) {
            j6 = j10;
        }
        ((BufferedInputStream) this).pos = (int) (((BufferedInputStream) this).pos + j6);
        return j6;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        m8267h();
        int i12 = i10 + i11;
        if ((i10 | i11 | i12 | (bArr.length - i12)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int iM8269n = m8269n(i10, i11, bArr);
        if (iM8269n <= 0) {
            return iM8269n;
        }
        while (iM8269n < i11) {
            int iM8269n2 = m8269n(i10 + iM8269n, i11 - iM8269n, bArr);
            if (iM8269n2 <= 0) {
                break;
            }
            iM8269n += iM8269n2;
        }
        return iM8269n;
    }
}
