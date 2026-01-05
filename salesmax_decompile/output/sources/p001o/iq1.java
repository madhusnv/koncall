package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class iq1 extends FilterOutputStream {

    /* renamed from: a */
    public final OutputStream f29077a;

    /* renamed from: b */
    public ByteOrder f29078b;

    public iq1(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f29077a = outputStream;
        this.f29078b = byteOrder;
    }

    /* renamed from: a */
    public void m32538a(ByteOrder byteOrder) {
        this.f29078b = byteOrder;
    }

    /* renamed from: c */
    public void m32539c(int i) throws IOException {
        this.f29077a.write(i);
    }

    /* renamed from: d */
    public void m32540d(int i) throws IOException {
        ByteOrder byteOrder = this.f29078b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f29077a.write((i >>> 0) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((i >>> 8) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((i >>> 16) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((i >>> 24) & Constants.MAX_HOST_LENGTH);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f29077a.write((i >>> 24) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((i >>> 16) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((i >>> 8) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((i >>> 0) & Constants.MAX_HOST_LENGTH);
        }
    }

    /* renamed from: f */
    public void m32541f(short s) throws IOException {
        ByteOrder byteOrder = this.f29078b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f29077a.write((s >>> 0) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((s >>> 8) & Constants.MAX_HOST_LENGTH);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f29077a.write((s >>> 8) & Constants.MAX_HOST_LENGTH);
            this.f29077a.write((s >>> 0) & Constants.MAX_HOST_LENGTH);
        }
    }

    /* renamed from: g */
    public void m32542g(long j) throws IOException {
        m32540d((int) j);
    }

    /* renamed from: h */
    public void m32543h(int i) throws IOException {
        m32541f((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f29077a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f29077a.write(bArr, i, i2);
    }
}
