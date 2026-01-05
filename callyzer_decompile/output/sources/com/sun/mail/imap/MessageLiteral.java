package com.sun.mail.imap;

import com.sun.mail.iap.Literal;
import com.sun.mail.util.CRLFOutputStream;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.MessagingException;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class MessageLiteral implements Literal {
    private byte[] buf;
    private AbstractC3682n msg;
    private int msgSize;

    public MessageLiteral(AbstractC3682n abstractC3682n, int i10) throws IOException {
        this.msgSize = -1;
        this.msg = abstractC3682n;
        LengthCounter lengthCounter = new LengthCounter(i10);
        CRLFOutputStream cRLFOutputStream = new CRLFOutputStream(lengthCounter);
        abstractC3682n.writeTo(cRLFOutputStream);
        cRLFOutputStream.flush();
        this.msgSize = lengthCounter.getSize();
        this.buf = lengthCounter.getBytes();
    }

    @Override // com.sun.mail.iap.Literal
    public int size() {
        return this.msgSize;
    }

    @Override // com.sun.mail.iap.Literal
    public void writeTo(OutputStream outputStream) throws IOException {
        try {
            byte[] bArr = this.buf;
            if (bArr != null) {
                outputStream.write(bArr, 0, this.msgSize);
            } else {
                this.msg.writeTo(new CRLFOutputStream(outputStream));
            }
        } catch (MessagingException e2) {
            throw new IOException("MessagingException while appending message: " + e2);
        }
    }
}
