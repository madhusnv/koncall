package p001o;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class xbe implements lzf {

    /* renamed from: a */
    public final File f53471a;

    /* renamed from: b */
    public final long f53472b;

    /* renamed from: c */
    public final nmh f53473c;

    /* renamed from: d */
    public final gi9 f53474d;

    /* renamed from: e */
    public long f53475e;

    public xbe(File file, final long j, long j2, nmh nmhVar) {
        sq8.m48649h(file, "fileObject");
        sq8.m48649h(nmhVar, "timeout");
        this.f53471a = file;
        this.f53472b = j2;
        this.f53473c = nmhVar;
        this.f53474d = si9.m48360a(new uk7() { // from class: o.wbe
            @Override // p001o.uk7
            public final Object invoke() {
                return xbe.m55952c(this.f51732a, j);
            }
        });
        this.f53475e = j;
    }

    /* renamed from: c */
    public static final RandomAccessFile m55952c(xbe xbeVar, long j) throws IOException {
        if (!xbeVar.f53471a.exists()) {
            throw new IllegalArgumentException(("cannot create SdkSource, file does not exist: " + xbeVar).toString());
        }
        if (!xbeVar.f53471a.isFile()) {
            throw new IllegalArgumentException(("cannot create a SdkSource from a directory: " + xbeVar).toString());
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("start position should be >= 0, found " + j).toString());
        }
        long j2 = xbeVar.f53472b;
        long j3 = j - 1;
        if (!(j2 >= j3)) {
            throw new IllegalArgumentException(("end index " + xbeVar.f53472b + " must be greater than or equal to the start index minus one (" + j3 + ')').toString());
        }
        if (j2 <= xbeVar.f53471a.length() - 1) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(xbeVar.f53471a, "r");
            if (j > 0) {
                randomAccessFile.seek(j);
            }
            return randomAccessFile;
        }
        throw new IllegalArgumentException(("endInclusive should be less than or equal to the length of the file, was " + xbeVar.f53472b).toString());
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) throws IOException {
        sq8.m48649h(rl1Var, "sink");
        FileChannel channel = m55953d().getChannel();
        if (!channel.isOpen()) {
            throw new IllegalStateException("channel is closed".toString());
        }
        long j2 = this.f53475e;
        long j3 = this.f53472b;
        if (j2 > j3) {
            return -1L;
        }
        long jTransferTo = channel.transferTo(this.f53475e, Math.min(j, (j3 - j2) + 1), rl1Var);
        this.f53475e += jTransferTo;
        return jTransferTo;
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m55953d().close();
    }

    /* renamed from: d */
    public final RandomAccessFile m55953d() {
        return (RandomAccessFile) this.f53474d.getValue();
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f53473c;
    }

    public String toString() {
        return "RandomAccessFileSource(" + this.f53471a + ')';
    }

    public /* synthetic */ xbe(File file, long j, long j2, nmh nmhVar, int i, id5 id5Var) {
        this(file, j, j2, (i & 8) != 0 ? nmh.f37049e : nmhVar);
    }
}
