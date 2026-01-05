package com.sun.mail.util;

import java.io.OutputStream;
import java.util.logging.Level;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class LogOutputStream extends OutputStream {
    protected MailLogger logger;
    private int lastb = -1;
    private byte[] buf = new byte[80];
    private int pos = 0;
    protected Level level = Level.FINEST;

    public LogOutputStream(MailLogger mailLogger) {
        this.logger = mailLogger;
    }

    private void expandCapacity(int i10) {
        while (true) {
            int i11 = this.pos;
            int i12 = i11 + i10;
            byte[] bArr = this.buf;
            if (i12 <= bArr.length) {
                return;
            }
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            this.buf = bArr2;
        }
    }

    private void logBuf() {
        String str = new String(this.buf, 0, this.pos);
        this.pos = 0;
        log(str);
    }

    public void log(String str) {
        this.logger.log(this.level, str);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (this.logger.isLoggable(this.level)) {
            if (i10 == 13) {
                logBuf();
            } else if (i10 != 10) {
                expandCapacity(1);
                byte[] bArr = this.buf;
                int i11 = this.pos;
                this.pos = i11 + 1;
                bArr[i11] = (byte) i10;
            } else if (this.lastb != 13) {
                logBuf();
            }
            this.lastb = i10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (this.logger.isLoggable(this.level)) {
            int i12 = i11 + i10;
            int i13 = i10;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (b10 == 13) {
                    int i14 = i10 - i13;
                    expandCapacity(i14);
                    System.arraycopy(bArr, i13, this.buf, this.pos, i14);
                    this.pos += i14;
                    logBuf();
                } else if (b10 == 10) {
                    if (this.lastb != 13) {
                        int i15 = i10 - i13;
                        expandCapacity(i15);
                        System.arraycopy(bArr, i13, this.buf, this.pos, i15);
                        this.pos += i15;
                        logBuf();
                    }
                } else {
                    this.lastb = bArr[i10];
                    i10++;
                }
                i13 = i10 + 1;
                this.lastb = bArr[i10];
                i10++;
            }
            int i16 = i12 - i13;
            if (i16 > 0) {
                expandCapacity(i16);
                System.arraycopy(bArr, i13, this.buf, this.pos, i16);
                this.pos += i16;
            }
        }
    }
}
