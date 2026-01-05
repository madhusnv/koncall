package com.sun.mail.smtp;

import com.sun.mail.util.CRLFOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SMTPOutputStream extends CRLFOutputStream {
    public SMTPOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public void ensureAtBOL() throws IOException {
        if (this.atBOL) {
            return;
        }
        super.writeln();
    }

    @Override // com.sun.mail.util.CRLFOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = this.lastb;
        if ((i11 == 10 || i11 == 13 || i11 == -1) && i10 == 46) {
            ((FilterOutputStream) this).out.write(46);
        }
        super.write(i10);
    }

    @Override // com.sun.mail.util.CRLFOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.lastb;
        int i13 = i12;
        if (i12 == -1) {
            i13 = 10;
        }
        int i14 = i11 + i10;
        int i15 = i13;
        int i16 = i10;
        while (i10 < i14) {
            if ((i15 == 10 || i15 == 13) && bArr[i10] == 46) {
                super.write(bArr, i16, i10 - i16);
                ((FilterOutputStream) this).out.write(46);
                i16 = i10;
            }
            i15 = bArr[i10];
            i10++;
        }
        int i17 = i14 - i16;
        if (i17 > 0) {
            super.write(bArr, i16, i17);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
