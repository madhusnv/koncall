package com.sun.mail.imap;

import com.sun.mail.iap.ByteArray;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.MessageRemovedIOException;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.C3651i;
import jakarta.mail.FolderClosedException;
import jakarta.mail.MessagingException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPInputStream extends InputStream {
    private static final int slop = 64;
    private int blksize;
    private byte[] buf;
    private int bufcount;
    private int bufpos;
    private boolean lastBuffer;
    private int max;
    private IMAPMessage msg;
    private boolean peek;
    private int pos = 0;
    private ByteArray readbuf;
    private String section;

    public IMAPInputStream(IMAPMessage iMAPMessage, String str, int i10, boolean z6) {
        this.msg = iMAPMessage;
        this.section = str;
        this.max = i10;
        this.peek = z6;
        this.blksize = iMAPMessage.getFetchBlockSize();
    }

    private void checkSeen() {
        if (this.peek) {
            return;
        }
        try {
            AbstractC3679k folder = this.msg.getFolder();
            if (folder == null || folder.getMode() == 1) {
                return;
            }
            IMAPMessage iMAPMessage = this.msg;
            C3651i c3651i = C3651i.f19328g;
            if (iMAPMessage.isSet(c3651i)) {
                return;
            }
            this.msg.setFlag(c3651i, true);
        } catch (MessagingException unused) {
        }
    }

    private void fill() {
        int i10;
        int i11;
        BODY bodyPeekBody;
        int i12;
        ByteArray byteArray;
        if (this.lastBuffer || ((i10 = this.max) != -1 && this.pos >= i10)) {
            if (this.pos == 0) {
                checkSeen();
            }
            this.readbuf = null;
            return;
        }
        if (this.readbuf == null) {
            this.readbuf = new ByteArray(this.blksize + 64);
        }
        synchronized (this.msg.getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = this.msg.getProtocol();
                    if (this.msg.isExpunged()) {
                        throw new MessageRemovedIOException("No content for expunged message");
                    }
                    int sequenceNumber = this.msg.getSequenceNumber();
                    int i13 = this.blksize;
                    int i14 = this.max;
                    if (i14 != -1) {
                        int i15 = this.pos;
                        if (i15 + i13 > i14) {
                            i13 = i14 - i15;
                        }
                    }
                    i11 = i13;
                    bodyPeekBody = this.peek ? protocol.peekBody(sequenceNumber, this.section, this.pos, i11, this.readbuf) : protocol.fetchBody(sequenceNumber, this.section, this.pos, i11, this.readbuf);
                    i12 = 0;
                    i12 = 0;
                    if (bodyPeekBody == null || (byteArray = bodyPeekBody.getByteArray()) == null) {
                        forceCheckExpunged();
                        byteArray = new ByteArray(0);
                    }
                } catch (ProtocolException e2) {
                    forceCheckExpunged();
                    throw new IOException(e2.getMessage());
                } catch (FolderClosedException e10) {
                    throw new FolderClosedIOException(e10.f19277a, e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.pos == 0) {
            checkSeen();
        }
        this.buf = byteArray.getBytes();
        this.bufpos = byteArray.getStart();
        int count = byteArray.getCount();
        int origin = bodyPeekBody != null ? bodyPeekBody.getOrigin() : this.pos;
        if (origin < 0) {
            if (this.pos == 0) {
                this.lastBuffer = count != i11;
                i12 = count;
            } else {
                this.lastBuffer = true;
            }
        } else if (origin == this.pos) {
            this.lastBuffer = count < i11;
            i12 = count;
        } else {
            this.lastBuffer = true;
        }
        this.bufcount = this.bufpos + i12;
        this.pos += i12;
    }

    private void forceCheckExpunged() throws MessageRemovedIOException {
        synchronized (this.msg.getMessageCacheLock()) {
            try {
                try {
                    this.msg.getProtocol().noop();
                } catch (FolderClosedException e2) {
                    throw new FolderClosedIOException(e2.f19277a, e2.getMessage());
                }
            } catch (ConnectionException e10) {
                throw new FolderClosedIOException(this.msg.getFolder(), e10.getMessage());
            } catch (ProtocolException unused) {
            }
        }
        if (this.msg.isExpunged()) {
            throw new MessageRemovedIOException();
        }
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.bufcount - this.bufpos;
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        if (this.bufpos >= this.bufcount) {
            fill();
            if (this.bufpos >= this.bufcount) {
                return -1;
            }
        }
        byte[] bArr = this.buf;
        int i10 = this.bufpos;
        this.bufpos = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12 = this.bufcount - this.bufpos;
        if (i12 <= 0) {
            fill();
            i12 = this.bufcount - this.bufpos;
            if (i12 <= 0) {
                return -1;
            }
        }
        if (i12 < i11) {
            i11 = i12;
        }
        System.arraycopy(this.buf, this.bufpos, bArr, i10, i11);
        this.bufpos += i11;
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
