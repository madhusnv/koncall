package com.sun.mail.pop3;

import com.sun.mail.util.ReadableMime;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.C3678j;
import jakarta.mail.C3680l;
import jakarta.mail.FolderClosedException;
import jakarta.mail.IllegalWriteException;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.C3657f;
import jakarta.mail.internet.C3658g;
import jakarta.mail.internet.C3665n;
import jakarta.mail.internet.InterfaceC3676y;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.util.Enumeration;
import java.util.logging.Level;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class POP3Message extends C3665n implements ReadableMime {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String UNKNOWN = "UNKNOWN";
    private POP3Folder folder;
    private int hdrSize;
    private int msgSize;
    private SoftReference<InputStream> rawData;
    String uid;

    public POP3Message(AbstractC3679k abstractC3679k, int i10) {
        super(abstractC3679k, i10);
        this.hdrSize = -1;
        this.msgSize = -1;
        this.uid = UNKNOWN;
        this.rawData = new SoftReference<>(null);
        this.folder = (POP3Folder) abstractC3679k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InputStream getRawStream(boolean z6) throws MessagingException {
        Object obj;
        InputStream inputStreamRetr;
        int i10;
        try {
            synchronized (this) {
                try {
                    InputStream inputStream = this.rawData.get();
                    obj = inputStream;
                    if (inputStream == null) {
                        TempFile fileCache = this.folder.getFileCache();
                        if (fileCache != null) {
                            if (this.folder.logger.isLoggable(Level.FINE)) {
                                this.folder.logger.fine("caching message #" + this.msgnum + " in temp file");
                            }
                            AppendStream appendStream = fileCache.getAppendStream();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(appendStream);
                            try {
                                this.folder.getProtocol().retr(this.msgnum, bufferedOutputStream);
                                bufferedOutputStream.close();
                                inputStreamRetr = appendStream.getInputStream();
                            } catch (Throwable th2) {
                                bufferedOutputStream.close();
                                throw th2;
                            }
                        } else {
                            Protocol protocol = this.folder.getProtocol();
                            int i11 = this.msgnum;
                            int i12 = this.msgSize;
                            inputStreamRetr = protocol.retr(i11, i12 > 0 ? i12 + this.hdrSize : 0);
                        }
                        InputStream inputStream2 = inputStreamRetr;
                        if (inputStream2 == 0) {
                            this.expunged = true;
                            throw new MessageRemovedException("can't retrieve message #" + this.msgnum + " in POP3Message.getContentStream");
                        }
                        if (this.headers == null || ((POP3Store) this.folder.getStore()).forgetTopHeaders) {
                            this.headers = new C3658g(inputStream2, false);
                            this.hdrSize = (int) ((InterfaceC3676y) inputStream2).getPosition();
                        } else {
                            do {
                                i10 = 0;
                                while (true) {
                                    int i13 = inputStream2.read();
                                    if (i13 < 0 || i13 == 10) {
                                        break;
                                    }
                                    if (i13 != 13) {
                                        i10++;
                                    } else if (inputStream2.available() > 0) {
                                        inputStream2.mark(1);
                                        if (inputStream2.read() != 10) {
                                            inputStream2.reset();
                                        }
                                    }
                                }
                                if (inputStream2.available() == 0) {
                                    break;
                                }
                            } while (i10 != 0);
                            this.hdrSize = (int) ((InterfaceC3676y) inputStream2).getPosition();
                        }
                        this.msgSize = inputStream2.available();
                        this.rawData = new SoftReference<>(inputStream2);
                        obj = inputStream2;
                    }
                } finally {
                }
            }
            return ((InterfaceC3676y) obj).newStream(z6 ? this.hdrSize : 0L, -1L);
        } catch (EOFException e2) {
            this.folder.close(false);
            throw new FolderClosedException(this.folder, e2.toString());
        } catch (IOException e10) {
            throw new MessagingException("error fetching POP3 content", e10);
        }
    }

    private void loadHeaders() throws IOException, MessagingException {
        boolean z6;
        InputStream pVar;
        try {
            synchronized (this) {
                try {
                    if (this.headers != null) {
                        return;
                    }
                    if (((POP3Store) this.folder.getStore()).disableTop || (pVar = this.folder.getProtocol().top(this.msgnum, 0)) == null) {
                        z6 = true;
                    } else {
                        try {
                            this.hdrSize = pVar.available();
                            this.headers = new C3658g(pVar, false);
                            pVar.close();
                            z6 = false;
                        } catch (Throwable th2) {
                            pVar.close();
                            throw th2;
                        }
                    }
                    if (z6) {
                        InputStream contentStream = getContentStream();
                        if (contentStream != null) {
                            contentStream.close();
                        }
                    }
                } finally {
                }
            }
        } catch (EOFException e2) {
            this.folder.close(false);
            throw new FolderClosedException(this.folder, e2.toString());
        } catch (IOException e10) {
            throw new MessagingException("error loading POP3 headers", e10);
        }
    }

    @Override // jakarta.mail.internet.C3665n
    public void addHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void addHeaderLine(String str) throws IllegalWriteException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<String> getAllHeaderLines() throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return this.headers.m8219e(null);
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<C3680l> getAllHeaders() throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return new C3657f(this.headers.f19358a, null, false, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jakarta.mail.internet.C3665n
    public synchronized InputStream getContentStream() {
        Closeable closeable = this.contentStream;
        if (closeable != null) {
            return ((InterfaceC3676y) closeable).newStream(0L, -1L);
        }
        InputStream rawStream = getRawStream(true);
        if (this.folder.getFileCache() != null || ((POP3Store) this.folder.getStore()).keepMessageContent) {
            this.contentStream = ((InterfaceC3676y) rawStream).newStream(0L, -1L);
        }
        return rawStream;
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public String[] getHeader(String str) throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return this.headers.m8218d(str);
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return new C3657f(this.headers.f19358a, strArr, true, true, 1);
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<C3680l> getMatchingHeaders(String[] strArr) throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return new C3657f(this.headers.f19358a, strArr, true, false, 0);
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() {
        return getRawStream(false);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.internet.InterfaceC3667p
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return this.headers.m8219e(strArr);
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<C3680l> getNonMatchingHeaders(String[] strArr) throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return new C3657f(this.headers.f19358a, strArr, false, false, 0);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public int getSize() throws MessagingException {
        int i10;
        try {
            synchronized (this) {
                try {
                    int i11 = this.msgSize;
                    if (i11 > 0) {
                        return i11;
                    }
                    if (this.headers == null) {
                        loadHeaders();
                    }
                    synchronized (this) {
                        try {
                            if (this.msgSize < 0) {
                                this.msgSize = this.folder.getProtocol().list(this.msgnum) - this.hdrSize;
                            }
                            i10 = this.msgSize;
                        } finally {
                        }
                    }
                    return i10;
                } finally {
                }
            }
        } catch (EOFException e2) {
            this.folder.close(false);
            throw new FolderClosedException(this.folder, e2.toString());
        } catch (IOException e10) {
            throw new MessagingException("error getting size", e10);
        }
    }

    public synchronized void invalidate(boolean z6) {
        this.content = null;
        InputStream inputStream = this.rawData.get();
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.rawData = new SoftReference<>(null);
        }
        InputStream inputStream2 = this.contentStream;
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
            }
            this.contentStream = null;
        }
        this.msgSize = -1;
        if (z6) {
            this.headers = null;
            this.hdrSize = -1;
        }
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public void removeHeader(String str) throws IllegalWriteException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public void saveChanges() throws IllegalWriteException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public synchronized void setFlags(C3678j c3678j, boolean z6) {
        C3678j c3678j2 = (C3678j) this.flags.clone();
        super.setFlags(c3678j, z6);
        if (!this.flags.equals(c3678j2)) {
            this.folder.notifyMessageChangedListeners(1, this);
        }
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public void setHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    public InputStream top(int i10) throws MessagingException {
        InputStream pVar;
        try {
            synchronized (this) {
                pVar = this.folder.getProtocol().top(this.msgnum, i10);
            }
            return pVar;
        } catch (EOFException e2) {
            this.folder.close(false);
            throw new FolderClosedException(this.folder, e2.toString());
        } catch (IOException e10) {
            throw new MessagingException("error getting size", e10);
        }
    }

    @Override // jakarta.mail.internet.C3665n
    public synchronized void writeTo(OutputStream outputStream, String[] strArr) {
        try {
            Closeable closeable = (InputStream) this.rawData.get();
            if (closeable == null && strArr == null && !((POP3Store) this.folder.getStore()).cacheWriteTo) {
                if (this.folder.logger.isLoggable(Level.FINE)) {
                    this.folder.logger.fine("streaming msg " + this.msgnum);
                }
                if (!this.folder.getProtocol().retr(this.msgnum, outputStream)) {
                    this.expunged = true;
                    throw new MessageRemovedException("can't retrieve message #" + this.msgnum + " in POP3Message.writeTo");
                }
            } else if (closeable == null || strArr != null) {
                super.writeTo(outputStream, strArr);
            } else {
                InputStream inputStreamNewStream = ((InterfaceC3676y) closeable).newStream(0L, -1L);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i10 = inputStreamNewStream.read(bArr);
                        if (i10 > 0) {
                            outputStream.write(bArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    inputStreamNewStream.close();
                } catch (Throwable th2) {
                    if (inputStreamNewStream != null) {
                        try {
                            inputStreamNewStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            }
        } finally {
        }
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.internet.InterfaceC3667p
    public String getHeader(String str, String str2) throws IOException, MessagingException {
        if (this.headers == null) {
            loadHeaders();
        }
        return this.headers.m8217c(str, str2);
    }
}
