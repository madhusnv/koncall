package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class ASN1OutputStream {

    /* renamed from: os, reason: collision with root package name */
    private OutputStream f44481os;

    public ASN1OutputStream(OutputStream outputStream) {
        this.f44481os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    public static int getLengthOfDL(int i10) {
        if (i10 < 128) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 8;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public static int getLengthOfEncodingDL(boolean z6, int i10) {
        return getLengthOfDL(i10) + (z6 ? 1 : 0) + i10;
    }

    public static int getLengthOfIdentifier(int i10) {
        if (i10 < 31) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 7;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public void close() throws IOException {
        this.f44481os.close();
    }

    public void flush() throws IOException {
        this.f44481os.flush();
    }

    public DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.f44481os);
    }

    public DLOutputStream getDLSubStream() {
        return new DLOutputStream(this.f44481os);
    }

    public final void write(int i10) throws IOException {
        this.f44481os.write(i10);
    }

    public final void writeDL(int i10) throws IOException {
        if (i10 < 128) {
            write(i10);
            return;
        }
        int i11 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i12 = i11 - 1;
            bArr[i12] = (byte) i10;
            i10 >>>= 8;
            if (i10 == 0) {
                int i13 = i11 - 2;
                bArr[i13] = (byte) ((5 - i12) | 128);
                write(bArr, i13, 6 - i12);
                return;
            }
            i11 = i12;
        }
    }

    public void writeElements(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().encode(this, true);
        }
    }

    public final void writeEncodingDL(boolean z6, int i10, byte b10) throws IOException {
        writeIdentifier(z6, i10);
        writeDL(1);
        write(b10);
    }

    public final void writeEncodingIL(boolean z6, int i10, ASN1Encodable[] aSN1EncodableArr) throws IOException {
        writeIdentifier(z6, i10);
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    public final void writeIdentifier(boolean z6, int i10) throws IOException {
        if (z6) {
            write(i10);
        }
    }

    public final void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Encodable.toASN1Primitive(), true);
        flushInternal();
    }

    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z6) {
        aSN1Primitive.encode(this, z6);
    }

    public void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.encode(this, true);
        }
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        return str.equals(ASN1Encoding.DER) ? new DEROutputStream(outputStream) : str.equals(ASN1Encoding.DL) ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f44481os.write(bArr, i10, i11);
    }

    public final void writeEncodingDL(boolean z6, int i10, byte b10, byte[] bArr, int i11, int i12) throws IOException {
        writeIdentifier(z6, i10);
        writeDL(i12 + 1);
        write(b10);
        write(bArr, i11, i12);
    }

    public final void writeIdentifier(boolean z6, int i10, int i11) throws IOException {
        if (z6) {
            if (i11 < 31) {
                write(i10 | i11);
                return;
            }
            byte[] bArr = new byte[6];
            int i12 = 5;
            bArr[5] = (byte) (i11 & 127);
            while (i11 > 127) {
                i11 >>>= 7;
                i12--;
                bArr[i12] = (byte) ((i11 & 127) | 128);
            }
            int i13 = i12 - 1;
            bArr[i13] = (byte) (31 | i10);
            write(bArr, i13, 6 - i13);
        }
    }

    public final void writeObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Primitive, true);
        flushInternal();
    }

    public final void writeEncodingDL(boolean z6, int i10, int i11, byte[] bArr) throws IOException {
        writeIdentifier(z6, i10, i11);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z6, int i10, byte[] bArr) {
        writeIdentifier(z6, i10);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z6, int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeIdentifier(z6, i10);
        writeDL(i12);
        write(bArr, i11, i12);
    }

    public final void writeEncodingDL(boolean z6, int i10, byte[] bArr, int i11, int i12, byte b10) throws IOException {
        writeIdentifier(z6, i10);
        writeDL(i12 + 1);
        write(bArr, i11, i12);
        write(b10);
    }

    public void flushInternal() {
    }
}
