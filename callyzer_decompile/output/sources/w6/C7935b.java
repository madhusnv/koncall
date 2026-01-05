package w6;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w6.b */
/* loaded from: classes.dex */
public class C7935b extends InputStream implements DataInput {

    /* renamed from: a */
    public final DataInputStream f38153a;

    /* renamed from: b */
    public int f38154b;

    /* renamed from: c */
    public ByteOrder f38155c;

    /* renamed from: d */
    public byte[] f38156d;

    /* renamed from: e */
    public final int f38157e;

    public C7935b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f38157e = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f38153a.available();
    }

    /* renamed from: h */
    public final void m15059h(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.f38153a;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f38156d == null) {
                    this.f38156d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f38156d, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC5601a.m11232c(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f38154b += i11;
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f38154b++;
        return this.f38153a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f38154b++;
        return this.f38153a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f38154b++;
        int i10 = this.f38153a.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f38154b += 2;
        return this.f38153a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f38154b += i11;
        this.f38153a.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f38154b += 4;
        DataInputStream dataInputStream = this.f38153a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f38155c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f38155c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j6;
        long j10;
        this.f38154b += 8;
        DataInputStream dataInputStream = this.f38153a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f38155c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j6 = (i17 << 56) + (i16 << 48) + (i15 << 40) + (i14 << 32) + (i13 << 24) + (i12 << 16) + (i11 << 8);
            j10 = i10;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f38155c);
            }
            j6 = (i10 << 56) + (i11 << 48) + (i12 << 40) + (i13 << 32) + (i14 << 24) + (i15 << 16) + (i16 << 8);
            j10 = i17;
        }
        return j6 + j10;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f38154b += 2;
        DataInputStream dataInputStream = this.f38153a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f38155c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f38155c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f38154b += 2;
        return this.f38153a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f38154b++;
        return this.f38153a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f38154b += 2;
        DataInputStream dataInputStream = this.f38153a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f38155c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f38155c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C7935b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f38153a.read(bArr, i10, i11);
        this.f38154b += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f38154b += bArr.length;
        this.f38153a.readFully(bArr);
    }

    public C7935b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f38153a = dataInputStream;
        dataInputStream.mark(0);
        this.f38154b = 0;
        this.f38155c = byteOrder;
        this.f38157e = inputStream instanceof C7935b ? ((C7935b) inputStream).f38157e : -1;
    }
}
