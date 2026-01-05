package com.sun.mail.imap;

import com.amplifyframework.storage.ObjectMetadata;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.ReadableMime;
import com.sun.mail.util.SharedByteArrayOutputStream;
import jakarta.mail.AbstractC3684p;
import jakarta.mail.C3680l;
import jakarta.mail.FolderClosedException;
import jakarta.mail.IllegalWriteException;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.AbstractC3670s;
import jakarta.mail.internet.C3657f;
import jakarta.mail.internet.C3658g;
import jakarta.mail.internet.C3663l;
import jakarta.mail.internet.C3675x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import nw.C5154d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPBodyPart extends C3663l implements ReadableMime {
    private static final boolean decodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);

    /* renamed from: bs, reason: collision with root package name */
    private BODYSTRUCTURE f43916bs;
    private String description;
    private boolean headersLoaded = false;
    private IMAPMessage message;
    private String sectionId;
    private String type;

    public IMAPBodyPart(BODYSTRUCTURE bodystructure, String str, IMAPMessage iMAPMessage) {
        String string;
        this.f43916bs = bodystructure;
        this.sectionId = str;
        this.message = iMAPMessage;
        String str2 = bodystructure.type;
        String str3 = bodystructure.subtype;
        C3675x c3675x = bodystructure.cParams;
        if (str2 == null || str3 == null) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append('/');
            sb2.append(str3);
            if (c3675x != null) {
                sb2.append(c3675x.m8265i(sb2.length() + 14));
            }
            string = sb2.toString();
        }
        this.type = string;
    }

    private InputStream getHeaderStream() {
        if (!this.message.isREV1()) {
            loadHeaders();
        }
        synchronized (this.message.getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = this.message.getProtocol();
                this.message.checkExpunged();
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = protocol.peekBody(this.message.getSequenceNumber(), this.sectionId + ".MIME");
                    if (bodyPeekBody == null) {
                        throw new MessagingException("Failed to fetch headers");
                    }
                    ByteArrayInputStream byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    if (byteArrayInputStream != null) {
                        return byteArrayInputStream;
                    }
                    throw new MessagingException("Failed to fetch headers");
                }
                SharedByteArrayOutputStream sharedByteArrayOutputStream = new SharedByteArrayOutputStream(0);
                LineOutputStream lineOutputStream = new LineOutputStream(sharedByteArrayOutputStream);
                try {
                    Enumeration allHeaderLines = super.getAllHeaderLines();
                    while (((C3657f) allHeaderLines).hasMoreElements()) {
                        lineOutputStream.writeln((String) ((C3657f) allHeaderLines).nextElement());
                    }
                    lineOutputStream.writeln();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    try {
                        lineOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
                try {
                    lineOutputStream.close();
                } catch (IOException unused3) {
                }
                return sharedByteArrayOutputStream.toStream();
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this.message.getFolder(), e2.getMessage());
            } catch (ProtocolException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
    }

    private synchronized void loadHeaders() {
        try {
            if (this.headersLoaded) {
                return;
            }
            if (this.headers == null) {
                this.headers = new C3658g();
            }
            synchronized (this.message.getMessageCacheLock()) {
                try {
                    IMAPProtocol protocol = this.message.getProtocol();
                    this.message.checkExpunged();
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = protocol.peekBody(this.message.getSequenceNumber(), this.sectionId + ".MIME");
                        if (bodyPeekBody == null) {
                            throw new MessagingException("Failed to fetch headers");
                        }
                        ByteArrayInputStream byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        if (byteArrayInputStream == null) {
                            throw new MessagingException("Failed to fetch headers");
                        }
                        this.headers.m8220f(byteArrayInputStream, false);
                    } else {
                        this.headers.m8215a(ObjectMetadata.CONTENT_TYPE, this.type);
                        this.headers.m8215a("Content-Transfer-Encoding", this.f43916bs.encoding);
                        String str = this.f43916bs.description;
                        if (str != null) {
                            this.headers.m8215a("Content-Description", str);
                        }
                        String str2 = this.f43916bs.f43919id;
                        if (str2 != null) {
                            this.headers.m8215a("Content-ID", str2);
                        }
                        String str3 = this.f43916bs.md5;
                        if (str3 != null) {
                            this.headers.m8215a(ObjectMetadata.CONTENT_MD5, str3);
                        }
                    }
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this.message.getFolder(), e2.getMessage());
                } catch (ProtocolException e10) {
                    throw new MessagingException(e10.getMessage(), e10);
                }
            }
            this.headersLoaded = true;
        } catch (Throwable th2) {
            throw th2;
        } finally {
        }
    }

    public void addHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void addHeaderLine(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l
    public Enumeration<String> getAllHeaderLines() {
        loadHeaders();
        return super.getAllHeaderLines();
    }

    @Override // jakarta.mail.internet.C3663l
    public Enumeration<C3680l> getAllHeaders() {
        loadHeaders();
        return super.getAllHeaders();
    }

    public String getContentID() {
        return this.f43916bs.f43919id;
    }

    public String getContentMD5() {
        return this.f43916bs.md5;
    }

    @Override // jakarta.mail.internet.C3663l
    public InputStream getContentStream() throws MessageRemovedException {
        boolean peek = this.message.getPeek();
        synchronized (this.message.getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = this.message.getProtocol();
                this.message.checkExpunged();
                if (protocol.isREV1()) {
                    int i10 = -1;
                    if (this.message.getFetchBlockSize() != -1) {
                        IMAPMessage iMAPMessage = this.message;
                        String str = this.sectionId;
                        if (!iMAPMessage.ignoreBodyStructureSize()) {
                            i10 = this.f43916bs.size;
                        }
                        return new IMAPInputStream(iMAPMessage, str, i10, peek);
                    }
                }
                int sequenceNumber = this.message.getSequenceNumber();
                BODY bodyPeekBody = peek ? protocol.peekBody(sequenceNumber, this.sectionId) : protocol.fetchBody(sequenceNumber, this.sectionId);
                ByteArrayInputStream byteArrayInputStream = bodyPeekBody != null ? bodyPeekBody.getByteArrayInputStream() : null;
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                this.message.forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this.message.getFolder(), e2.getMessage());
            } catch (ProtocolException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public String getContentType() {
        return this.type;
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public synchronized C5154d getDataHandler() {
        try {
            if (this.f44377dh == null) {
                if (this.f43916bs.isMulti()) {
                    this.f44377dh = new C5154d(new IMAPMultipartDataSource(this, this.f43916bs.bodies, this.sectionId, this.message));
                } else if (this.f43916bs.isNested() && this.message.isREV1() && this.f43916bs.envelope != null) {
                    IMAPMessage iMAPMessage = this.message;
                    BODYSTRUCTURE bodystructure = this.f43916bs;
                    this.f44377dh = new C5154d(new IMAPNestedMessage(iMAPMessage, bodystructure.bodies[0], bodystructure.envelope, this.sectionId), this.type);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.getDataHandler();
    }

    public String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
        }
        String str2 = this.f43916bs.description;
        if (str2 == null) {
            return null;
        }
        try {
            this.description = AbstractC3670s.m8240d(str2);
        } catch (UnsupportedEncodingException unused) {
            this.description = this.f43916bs.description;
        }
        return this.description;
    }

    public String getDisposition() {
        return this.f43916bs.disposition;
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.internet.InterfaceC3667p
    public String getEncoding() {
        return this.f43916bs.encoding;
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public String getFileName() throws MessagingException {
        C3675x c3675x;
        C3675x c3675x2 = this.f43916bs.dParams;
        String strM8261e = c3675x2 != null ? c3675x2.m8261e("filename") : null;
        if ((strM8261e == null || strM8261e.isEmpty()) && (c3675x = this.f43916bs.cParams) != null) {
            strM8261e = c3675x.m8261e(IMAPStore.ID_NAME);
        }
        if (!decodeFileName || strM8261e == null) {
            return strM8261e;
        }
        try {
            return AbstractC3670s.m8240d(strM8261e);
        } catch (UnsupportedEncodingException e2) {
            throw new MessagingException("Can't decode filename", e2);
        }
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public String[] getHeader(String str) {
        loadHeaders();
        return super.getHeader(str);
    }

    public int getLineCount() {
        return this.f43916bs.lines;
    }

    @Override // jakarta.mail.internet.C3663l
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        loadHeaders();
        return super.getMatchingHeaderLines(strArr);
    }

    @Override // jakarta.mail.internet.C3663l
    public Enumeration<C3680l> getMatchingHeaders(String[] strArr) {
        loadHeaders();
        return super.getMatchingHeaders(strArr);
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() {
        return new SequenceInputStream(getHeaderStream(), getContentStream());
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.internet.InterfaceC3667p
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        loadHeaders();
        return super.getNonMatchingHeaderLines(strArr);
    }

    @Override // jakarta.mail.internet.C3663l
    public Enumeration<C3680l> getNonMatchingHeaders(String[] strArr) {
        loadHeaders();
        return super.getNonMatchingHeaders(strArr);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public int getSize() {
        return this.f43916bs.size;
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public void removeHeader(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public void setContent(Object obj, String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setContentMD5(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public void setDataHandler(C5154d c5154d) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l
    public void setDescription(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l
    public void setDisposition(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public void setFileName(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l, jakarta.mail.InterfaceC3685q
    public void setHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l
    public void setContent(AbstractC3684p abstractC3684p) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // jakarta.mail.internet.C3663l
    public void updateHeaders() {
    }
}
