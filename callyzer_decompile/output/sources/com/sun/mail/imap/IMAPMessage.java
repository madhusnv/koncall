package com.sun.mail.imap;

import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.Utility;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.ENVELOPE;
import com.sun.mail.imap.protocol.FetchItem;
import com.sun.mail.imap.protocol.FetchResponse;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.INTERNALDATE;
import com.sun.mail.imap.protocol.Item;
import com.sun.mail.imap.protocol.MODSEQ;
import com.sun.mail.imap.protocol.RFC822DATA;
import com.sun.mail.imap.protocol.RFC822SIZE;
import com.sun.mail.imap.protocol.UID;
import com.sun.mail.util.ReadableMime;
import jakarta.mail.AbstractC3633a;
import jakarta.mail.C3649g;
import jakarta.mail.C3650h;
import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import jakarta.mail.C3680l;
import jakarta.mail.C3681m;
import jakarta.mail.FolderClosedException;
import jakarta.mail.IllegalWriteException;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MessagingException;
import jakarta.mail.c0;
import jakarta.mail.g0;
import jakarta.mail.internet.AbstractC3670s;
import jakarta.mail.internet.C3655d;
import jakarta.mail.internet.C3657f;
import jakarta.mail.internet.C3658g;
import jakarta.mail.internet.C3665n;
import jakarta.mail.internet.C3675x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import nw.C5154d;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPMessage extends C3665n implements ReadableMime {
    static final String EnvelopeCmd = "ENVELOPE INTERNALDATE RFC822.SIZE";
    private volatile boolean bodyLoaded;

    /* renamed from: bs, reason: collision with root package name */
    protected BODYSTRUCTURE f43917bs;
    private String description;
    protected ENVELOPE envelope;
    private volatile boolean headersLoaded;
    protected Map<String, Object> items;
    private Hashtable<String, String> loadedHeaders;
    private volatile long modseq;
    private Boolean peek;
    private Date receivedDate;
    protected String sectionId;
    private long size;
    private String subject;
    private String type;
    private volatile long uid;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class FetchProfileCondition implements Utility.Condition {
        private String[] hdrs;
        private Set<FetchItem> need = new HashSet();
        private boolean needBodyStructure;
        private boolean needEnvelope;
        private boolean needFlags;
        private boolean needHeaders;
        private boolean needMessage;
        private boolean needRDate;
        private boolean needSize;
        private boolean needUID;

        public FetchProfileCondition(C3650h c3650h, FetchItem[] fetchItemArr) {
            this.needEnvelope = false;
            this.needFlags = false;
            this.needBodyStructure = false;
            this.needUID = false;
            this.needHeaders = false;
            this.needSize = false;
            this.needMessage = false;
            this.needRDate = false;
            this.hdrs = null;
            if (c3650h.m8195a(C3649g.ENVELOPE)) {
                this.needEnvelope = true;
            }
            if (c3650h.m8195a(C3649g.FLAGS)) {
                this.needFlags = true;
            }
            if (c3650h.m8195a(C3649g.CONTENT_INFO)) {
                this.needBodyStructure = true;
            }
            if (c3650h.m8195a(C3649g.SIZE)) {
                this.needSize = true;
            }
            if (c3650h.m8195a(g0.f19308a)) {
                this.needUID = true;
            }
            if (c3650h.m8195a(IMAPFolder.FetchProfileItem.HEADERS)) {
                this.needHeaders = true;
            }
            if (c3650h.m8195a(IMAPFolder.FetchProfileItem.SIZE)) {
                this.needSize = true;
            }
            if (c3650h.m8195a(IMAPFolder.FetchProfileItem.MESSAGE)) {
                this.needMessage = true;
            }
            if (c3650h.m8195a(IMAPFolder.FetchProfileItem.INTERNALDATE)) {
                this.needRDate = true;
            }
            this.hdrs = new String[0];
            for (int i10 = 0; i10 < fetchItemArr.length; i10++) {
                if (c3650h.m8195a(fetchItemArr[i10].getFetchProfileItem())) {
                    this.need.add(fetchItemArr[i10]);
                }
            }
        }

        @Override // com.sun.mail.imap.Utility.Condition
        public boolean test(IMAPMessage iMAPMessage) {
            if (this.needEnvelope && iMAPMessage._getEnvelope() == null && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needFlags && iMAPMessage._getFlags() == null) {
                return true;
            }
            if (this.needBodyStructure && iMAPMessage._getBodyStructure() == null && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needUID && iMAPMessage.getUID() == -1) {
                return true;
            }
            if (this.needHeaders && !iMAPMessage.areHeadersLoaded()) {
                return true;
            }
            if (this.needSize && iMAPMessage.size == -1 && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needMessage && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needRDate && iMAPMessage.receivedDate == null) {
                return true;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.hdrs;
                if (i10 >= strArr.length) {
                    for (FetchItem fetchItem : this.need) {
                        Map<String, Object> map = iMAPMessage.items;
                        if (map == null || map.get(fetchItem.getName()) == null) {
                            return true;
                        }
                    }
                    return false;
                }
                if (!iMAPMessage.isHeaderLoaded(strArr[i10])) {
                    return true;
                }
                i10++;
            }
        }
    }

    public IMAPMessage(IMAPFolder iMAPFolder, int i10) {
        super(iMAPFolder, i10);
        this.size = -1L;
        this.uid = -1L;
        this.modseq = -1L;
        this.headersLoaded = false;
        this.bodyLoaded = false;
        this.loadedHeaders = new Hashtable<>(1);
        this.flags = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BODYSTRUCTURE _getBodyStructure() {
        return this.f43917bs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ENVELOPE _getEnvelope() {
        return this.envelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3678j _getFlags() {
        return this.flags;
    }

    private C3655d[] aaclone(C3655d[] c3655dArr) {
        if (c3655dArr == null) {
            return null;
        }
        return (C3655d[]) c3655dArr.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean areHeadersLoaded() {
        return this.headersLoaded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHeaderLoaded(String str) {
        if (this.headersLoaded) {
            return true;
        }
        return this.loadedHeaders.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    private synchronized void loadBODYSTRUCTURE() {
        if (this.f43917bs != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    BODYSTRUCTURE bodystructureFetchBodyStructure = protocol.fetchBodyStructure(getSequenceNumber());
                    this.f43917bs = bodystructureFetchBodyStructure;
                    if (bodystructureFetchBodyStructure == null) {
                        forceCheckExpunged();
                        throw new MessagingException("Unable to load BODYSTRUCTURE");
                    }
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this.folder, e2.getMessage());
                }
            } catch (ProtocolException e10) {
                forceCheckExpunged();
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
    }

    private synchronized void loadEnvelope() {
        if (this.envelope != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    int sequenceNumber = getSequenceNumber();
                    Response[] responseArrFetch = protocol.fetch(sequenceNumber, EnvelopeCmd);
                    for (int i10 = 0; i10 < responseArrFetch.length; i10++) {
                        Response response = responseArrFetch[i10];
                        if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == sequenceNumber) {
                            FetchResponse fetchResponse = (FetchResponse) responseArrFetch[i10];
                            int itemCount = fetchResponse.getItemCount();
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                Item item = fetchResponse.getItem(i11);
                                if (item instanceof ENVELOPE) {
                                    this.envelope = (ENVELOPE) item;
                                } else if (item instanceof INTERNALDATE) {
                                    this.receivedDate = ((INTERNALDATE) item).getDate();
                                } else if (item instanceof RFC822SIZE) {
                                    this.size = ((RFC822SIZE) item).size;
                                }
                            }
                        }
                    }
                    protocol.notifyResponseHandlers(responseArrFetch);
                    protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this.folder, e2.getMessage());
                } catch (ProtocolException e10) {
                    forceCheckExpunged();
                    throw new MessagingException(e10.getMessage(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.envelope == null) {
            throw new MessagingException("Failed to load IMAP envelope");
        }
    }

    private synchronized void loadFlags() {
        if (this.flags != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                C3678j c3678jFetchFlags = protocol.fetchFlags(getSequenceNumber());
                this.flags = c3678jFetchFlags;
                if (c3678jFetchFlags == null) {
                    this.flags = new C3678j();
                }
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this.folder, e2.getMessage());
            } catch (ProtocolException e10) {
                forceCheckExpunged();
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
    }

    private synchronized void loadHeaders() {
        ByteArrayInputStream byteArrayInputStream;
        if (this.headersLoaded) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    byteArrayInputStream = null;
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = protocol.peekBody(getSequenceNumber(), toSection("HEADER"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "HEADER");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        }
                    }
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this.folder, e2.getMessage());
                } catch (ProtocolException e10) {
                    forceCheckExpunged();
                    throw new MessagingException(e10.getMessage(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (byteArrayInputStream == null) {
            throw new MessagingException("Cannot load header");
        }
        this.headers = new C3658g(byteArrayInputStream, false);
        this.headersLoaded = true;
    }

    private void setHeaderLoaded(String str) {
        this.loadedHeaders.put(str.toUpperCase(Locale.ENGLISH), str);
    }

    private void setHeadersLoaded(boolean z6) {
        this.headersLoaded = z6;
    }

    private String toSection(String str) {
        return this.sectionId == null ? str : a1.m14335o(new StringBuilder(), this.sectionId, ".", str);
    }

    public long _getModSeq() {
        return this.modseq;
    }

    public c0 _getSession() {
        return this.session;
    }

    public void _setFlags(C3678j c3678j) {
        this.flags = c3678j;
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public void addFrom(AbstractC3633a[] abstractC3633aArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void addHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void addHeaderLine(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public void addRecipients(C3681m c3681m, AbstractC3633a[] abstractC3633aArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void checkExpunged() throws MessageRemovedException {
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    public Object fetchItem(FetchItem fetchItem) {
        Object obj;
        Object obj2;
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    int sequenceNumber = getSequenceNumber();
                    Response[] responseArrFetch = protocol.fetch(sequenceNumber, fetchItem.getName());
                    obj = null;
                    for (int i10 = 0; i10 < responseArrFetch.length; i10++) {
                        Response response = responseArrFetch[i10];
                        if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == sequenceNumber) {
                            handleExtensionFetchItems(((FetchResponse) responseArrFetch[i10]).getExtensionItems());
                            Map<String, Object> map = this.items;
                            if (map != null && (obj2 = map.get(fetchItem.getName())) != null) {
                                obj = obj2;
                            }
                        }
                    }
                    protocol.notifyResponseHandlers(responseArrFetch);
                    protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this.folder, e2.getMessage());
                } catch (ProtocolException e10) {
                    forceCheckExpunged();
                    throw new MessagingException(e10.getMessage(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void forceCheckExpunged() throws MessageRemovedException {
        synchronized (getMessageCacheLock()) {
            try {
                getProtocol().noop();
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this.folder, e2.getMessage());
            } catch (ProtocolException unused) {
            }
        }
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<String> getAllHeaderLines() throws MessageRemovedException {
        checkExpunged();
        loadHeaders();
        return super.getAllHeaderLines();
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<C3680l> getAllHeaders() throws MessageRemovedException {
        checkExpunged();
        loadHeaders();
        return super.getAllHeaders();
    }

    @Override // jakarta.mail.internet.C3665n
    public String getContentID() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentID();
        }
        loadBODYSTRUCTURE();
        return this.f43917bs.f43919id;
    }

    @Override // jakarta.mail.internet.C3665n
    public String[] getContentLanguage() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentLanguage();
        }
        loadBODYSTRUCTURE();
        String[] strArr = this.f43917bs.language;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return null;
    }

    @Override // jakarta.mail.internet.C3665n
    public String getContentMD5() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentMD5();
        }
        loadBODYSTRUCTURE();
        return this.f43917bs.md5;
    }

    @Override // jakarta.mail.internet.C3665n
    public InputStream getContentStream() throws MessageRemovedException {
        if (this.bodyLoaded) {
            return super.getContentStream();
        }
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    if (protocol.isREV1()) {
                        int i10 = -1;
                        if (getFetchBlockSize() != -1) {
                            String section = toSection("TEXT");
                            if (this.f43917bs != null && !ignoreBodyStructureSize()) {
                                i10 = this.f43917bs.size;
                            }
                            return new IMAPInputStream(this, section, i10, peek);
                        }
                    }
                    ByteArrayInputStream byteArrayInputStream = null;
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), toSection("TEXT")) : protocol.fetchBody(getSequenceNumber(), toSection("TEXT"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "TEXT");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        }
                    }
                    if (byteArrayInputStream != null) {
                        return byteArrayInputStream;
                    }
                    forceCheckExpunged();
                    return new ByteArrayInputStream(new byte[0]);
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this.folder, e2.getMessage());
                } catch (ProtocolException e10) {
                    forceCheckExpunged();
                    throw new MessagingException(e10.getMessage(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public synchronized String getContentType() {
        String string;
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentType();
        }
        if (this.type == null) {
            loadBODYSTRUCTURE();
            BODYSTRUCTURE bodystructure = this.f43917bs;
            String str = bodystructure.type;
            String str2 = bodystructure.subtype;
            C3675x c3675x = bodystructure.cParams;
            if (str == null || str2 == null) {
                string = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                sb2.append(str2);
                if (c3675x != null) {
                    sb2.append(c3675x.m8265i(sb2.length() + 14));
                }
                string = sb2.toString();
            }
            this.type = string;
        }
        return this.type;
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public synchronized C5154d getDataHandler() {
        BODYSTRUCTURE bodystructure;
        ENVELOPE envelope;
        String str;
        String string;
        try {
            checkExpunged();
            if (this.f44378dh == null && !this.bodyLoaded) {
                loadBODYSTRUCTURE();
                if (this.type == null) {
                    BODYSTRUCTURE bodystructure2 = this.f43917bs;
                    String str2 = bodystructure2.type;
                    String str3 = bodystructure2.subtype;
                    C3675x c3675x = bodystructure2.cParams;
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
                if (this.f43917bs.isMulti()) {
                    this.f44378dh = new C5154d(new IMAPMultipartDataSource(this, this.f43917bs.bodies, this.sectionId, this));
                } else if (this.f43917bs.isNested() && isREV1() && (envelope = (bodystructure = this.f43917bs).envelope) != null) {
                    BODYSTRUCTURE bodystructure3 = bodystructure.bodies[0];
                    if (this.sectionId == null) {
                        str = "1";
                    } else {
                        str = this.sectionId + ".1";
                    }
                    this.f44378dh = new C5154d(new IMAPNestedMessage(this, bodystructure3, envelope, str), this.type);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.getDataHandler();
    }

    @Override // jakarta.mail.internet.C3665n
    public String getDescription() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getDescription();
        }
        String str = this.description;
        if (str != null) {
            return str;
        }
        loadBODYSTRUCTURE();
        String str2 = this.f43917bs.description;
        if (str2 == null) {
            return null;
        }
        try {
            this.description = AbstractC3670s.m8240d(str2);
        } catch (UnsupportedEncodingException unused) {
            this.description = this.f43917bs.description;
        }
        return this.description;
    }

    @Override // jakarta.mail.internet.C3665n
    public String getDisposition() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getDisposition();
        }
        loadBODYSTRUCTURE();
        return this.f43917bs.disposition;
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.internet.InterfaceC3667p
    public String getEncoding() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getEncoding();
        }
        loadBODYSTRUCTURE();
        return this.f43917bs.encoding;
    }

    public int getFetchBlockSize() {
        return ((IMAPStore) this.folder.getStore()).getFetchBlockSize();
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public String getFileName() throws MessageRemovedException {
        C3675x c3675x;
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getFileName();
        }
        loadBODYSTRUCTURE();
        C3675x c3675x2 = this.f43917bs.dParams;
        String strM8261e = c3675x2 != null ? c3675x2.m8261e("filename") : null;
        return (strM8261e != null || (c3675x = this.f43917bs.cParams) == null) ? strM8261e : c3675x.m8261e(IMAPStore.ID_NAME);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public synchronized C3678j getFlags() {
        checkExpunged();
        loadFlags();
        return super.getFlags();
    }

    @Override // jakarta.mail.internet.C3665n
    public AbstractC3633a[] getFrom() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getFrom();
        }
        loadEnvelope();
        ENVELOPE envelope = this.envelope;
        C3655d[] c3655dArr = envelope.from;
        if (c3655dArr == null || c3655dArr.length == 0) {
            c3655dArr = envelope.sender;
        }
        return aaclone(c3655dArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] getHeader(java.lang.String r7) throws jakarta.mail.MessagingException {
        /*
            r6 = this;
            java.lang.String r0 = "HEADER.LINES ("
            java.lang.String r1 = "HEADER.FIELDS ("
            r6.checkExpunged()
            boolean r2 = r6.isHeaderLoaded(r7)
            if (r2 == 0) goto L14
            jakarta.mail.internet.g r0 = r6.headers
            java.lang.String[] r7 = r0.m8218d(r7)
            return r7
        L14:
            java.lang.Object r2 = r6.getMessageCacheLock()
            monitor-enter(r2)
            com.sun.mail.imap.protocol.IMAPProtocol r3 = r6.getProtocol()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            r6.checkExpunged()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            boolean r4 = r3.isREV1()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            r5 = 0
            if (r4 == 0) goto L51
            int r0 = r6.getSequenceNumber()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            r4.append(r7)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.lang.String r1 = r6.toSection(r1)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            com.sun.mail.imap.protocol.BODY r0 = r3.peekBody(r0, r1)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            if (r0 == 0) goto L71
            java.io.ByteArrayInputStream r0 = r0.getByteArrayInputStream()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            goto L72
        L4b:
            r7 = move-exception
            goto Laa
        L4d:
            r7 = move-exception
            goto L91
        L4f:
            r7 = move-exception
            goto L9e
        L51:
            int r1 = r6.getSequenceNumber()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            r4.append(r7)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            com.sun.mail.imap.protocol.RFC822DATA r0 = r3.fetchRFC822(r1, r0)     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            if (r0 == 0) goto L71
            java.io.ByteArrayInputStream r0 = r0.getByteArrayInputStream()     // Catch: java.lang.Throwable -> L4b com.sun.mail.iap.ProtocolException -> L4d com.sun.mail.iap.ConnectionException -> L4f
            goto L72
        L71:
            r0 = r5
        L72:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L76
            return r5
        L76:
            jakarta.mail.internet.g r1 = r6.headers
            if (r1 != 0) goto L81
            jakarta.mail.internet.g r1 = new jakarta.mail.internet.g
            r1.<init>()
            r6.headers = r1
        L81:
            jakarta.mail.internet.g r1 = r6.headers
            r2 = 0
            r1.m8220f(r0, r2)
            r6.setHeaderLoaded(r7)
            jakarta.mail.internet.g r0 = r6.headers
            java.lang.String[] r7 = r0.m8218d(r7)
            return r7
        L91:
            r6.forceCheckExpunged()     // Catch: java.lang.Throwable -> L4b
            jakarta.mail.MessagingException r0 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = r7.getMessage()     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L9e:
            jakarta.mail.FolderClosedException r0 = new jakarta.mail.FolderClosedException     // Catch: java.lang.Throwable -> L4b
            jakarta.mail.k r1 = r6.folder     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        Laa:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPMessage.getHeader(java.lang.String):java.lang.String[]");
    }

    public String getInReplyTo() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getHeader("In-Reply-To", " ");
        }
        loadEnvelope();
        return this.envelope.inReplyTo;
    }

    public synchronized Object getItem(FetchItem fetchItem) {
        Object objFetchItem;
        Map<String, Object> map = this.items;
        objFetchItem = map == null ? null : map.get(fetchItem.getName());
        if (objFetchItem == null) {
            objFetchItem = fetchItem(fetchItem);
        }
        return objFetchItem;
    }

    @Override // jakarta.mail.internet.C3665n
    public int getLineCount() throws MessageRemovedException {
        checkExpunged();
        loadBODYSTRUCTURE();
        return this.f43917bs.lines;
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessageRemovedException {
        checkExpunged();
        loadHeaders();
        return super.getMatchingHeaderLines(strArr);
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<C3680l> getMatchingHeaders(String[] strArr) throws MessageRemovedException {
        checkExpunged();
        loadHeaders();
        return super.getMatchingHeaders(strArr);
    }

    public Object getMessageCacheLock() {
        return ((IMAPFolder) this.folder).messageCacheLock;
    }

    @Override // jakarta.mail.internet.C3665n
    public String getMessageID() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getMessageID();
        }
        loadEnvelope();
        return this.envelope.messageId;
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() throws MessageRemovedException {
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                if (protocol.isREV1() && getFetchBlockSize() != -1) {
                    return new IMAPInputStream(this, this.sectionId, -1, peek);
                }
                ByteArrayInputStream byteArrayInputStream = null;
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), this.sectionId) : protocol.fetchBody(getSequenceNumber(), this.sectionId);
                    if (bodyPeekBody != null) {
                        byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    }
                } else {
                    RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), null);
                    if (rfc822dataFetchRFC822 != null) {
                        byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                    }
                }
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this.folder, e2.getMessage());
            } catch (ProtocolException e10) {
                forceCheckExpunged();
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
    }

    public synchronized long getModSeq() {
        if (this.modseq != -1) {
            return this.modseq;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                MODSEQ modseqFetchMODSEQ = protocol.fetchMODSEQ(getSequenceNumber());
                if (modseqFetchMODSEQ != null) {
                    this.modseq = modseqFetchMODSEQ.modseq;
                }
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this.folder, e2.getMessage());
            } catch (ProtocolException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
        return this.modseq;
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.internet.InterfaceC3667p
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessageRemovedException {
        checkExpunged();
        loadHeaders();
        return super.getNonMatchingHeaderLines(strArr);
    }

    @Override // jakarta.mail.internet.C3665n
    public Enumeration<C3680l> getNonMatchingHeaders(String[] strArr) throws MessageRemovedException {
        checkExpunged();
        loadHeaders();
        return super.getNonMatchingHeaders(strArr);
    }

    public synchronized boolean getPeek() {
        Boolean bool = this.peek;
        if (bool == null) {
            return ((IMAPStore) this.folder.getStore()).getPeek();
        }
        return bool.booleanValue();
    }

    public IMAPProtocol getProtocol() throws FolderClosedException, ProtocolException, InterruptedException {
        ((IMAPFolder) this.folder).waitIfIdle();
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol;
        }
        throw new FolderClosedException(this.folder, null);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public Date getReceivedDate() throws MessageRemovedException {
        checkExpunged();
        if (this.receivedDate == null) {
            loadEnvelope();
        }
        if (this.receivedDate == null) {
            return null;
        }
        return new Date(this.receivedDate.getTime());
    }

    @Override // jakarta.mail.internet.C3665n
    public AbstractC3633a[] getRecipients(C3681m c3681m) throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getRecipients(c3681m);
        }
        loadEnvelope();
        return c3681m == C3681m.f19407b ? aaclone(this.envelope.f43921to) : c3681m == C3681m.f19408c ? aaclone(this.envelope.f43920cc) : c3681m == C3681m.f19409d ? aaclone(this.envelope.bcc) : super.getRecipients(c3681m);
    }

    @Override // jakarta.mail.internet.C3665n
    public AbstractC3633a[] getReplyTo() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getReplyTo();
        }
        loadEnvelope();
        C3655d[] c3655dArr = this.envelope.replyTo;
        return (c3655dArr == null || c3655dArr.length == 0) ? getFrom() : aaclone(c3655dArr);
    }

    @Override // jakarta.mail.internet.C3665n
    public AbstractC3633a getSender() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSender();
        }
        loadEnvelope();
        C3655d[] c3655dArr = this.envelope.sender;
        if (c3655dArr == null || c3655dArr.length <= 0) {
            return null;
        }
        return c3655dArr[0];
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public Date getSentDate() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSentDate();
        }
        loadEnvelope();
        if (this.envelope.date == null) {
            return null;
        }
        return new Date(this.envelope.date.getTime());
    }

    public int getSequenceNumber() {
        return ((IMAPFolder) this.folder).messageCache.seqnumOf(getMessageNumber());
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public int getSize() throws MessageRemovedException {
        checkExpunged();
        if (this.size == -1) {
            loadEnvelope();
        }
        long j6 = this.size;
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j6;
    }

    public long getSizeLong() throws MessageRemovedException {
        checkExpunged();
        if (this.size == -1) {
            loadEnvelope();
        }
        return this.size;
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public String getSubject() throws MessageRemovedException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSubject();
        }
        String str = this.subject;
        if (str != null) {
            return str;
        }
        loadEnvelope();
        String str2 = this.envelope.subject;
        if (str2 == null) {
            return null;
        }
        try {
            this.subject = AbstractC3670s.m8240d(AbstractC3670s.m8256t(str2));
        } catch (UnsupportedEncodingException unused) {
            this.subject = this.envelope.subject;
        }
        return this.subject;
    }

    public long getUID() {
        return this.uid;
    }

    public void handleExtensionFetchItems(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.items == null) {
            this.items = new HashMap();
        }
        this.items.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleFetchItem(Item item, String[] strArr, boolean z6) throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        boolean zIsHeader;
        if (item instanceof C3678j) {
            this.flags = (C3678j) item;
            return true;
        }
        if (item instanceof ENVELOPE) {
            this.envelope = (ENVELOPE) item;
            return true;
        }
        if (item instanceof INTERNALDATE) {
            this.receivedDate = ((INTERNALDATE) item).getDate();
            return true;
        }
        if (item instanceof RFC822SIZE) {
            this.size = ((RFC822SIZE) item).size;
            return true;
        }
        if (item instanceof MODSEQ) {
            this.modseq = ((MODSEQ) item).modseq;
            return true;
        }
        if (item instanceof BODYSTRUCTURE) {
            this.f43917bs = (BODYSTRUCTURE) item;
            return true;
        }
        if (item instanceof UID) {
            UID uid = (UID) item;
            this.uid = uid.uid;
            IMAPFolder iMAPFolder = (IMAPFolder) this.folder;
            if (iMAPFolder.uidTable == null) {
                iMAPFolder.uidTable = new Hashtable<>();
            }
            ((IMAPFolder) this.folder).uidTable.put(Long.valueOf(uid.uid), this);
            return true;
        }
        boolean z10 = item instanceof RFC822DATA;
        if (!z10 && !(item instanceof BODY)) {
            return false;
        }
        if (z10) {
            RFC822DATA rfc822data = (RFC822DATA) item;
            byteArrayInputStream = rfc822data.getByteArrayInputStream();
            zIsHeader = rfc822data.isHeader();
        } else {
            BODY body = (BODY) item;
            byteArrayInputStream = body.getByteArrayInputStream();
            zIsHeader = body.isHeader();
        }
        if (zIsHeader) {
            C3658g c3658g = new C3658g();
            if (byteArrayInputStream != null) {
                c3658g.m8220f(byteArrayInputStream, false);
            }
            if (this.headers == null || z6) {
                this.headers = c3658g;
            } else {
                C3657f c3657f = new C3657f(c3658g.f19358a, null, false, false, 0);
                while (c3657f.hasMoreElements()) {
                    C3680l c3680l = (C3680l) c3657f.nextElement();
                    if (!isHeaderLoaded(c3680l.f19405a)) {
                        this.headers.m8215a(c3680l.f19405a, c3680l.mo8212a());
                    }
                }
            }
            if (z6) {
                setHeadersLoaded(true);
            } else {
                for (String str : strArr) {
                    setHeaderLoaded(str);
                }
            }
        } else {
            try {
                this.size = byteArrayInputStream.available();
            } catch (IOException unused) {
            }
            parse(byteArrayInputStream);
            this.bodyLoaded = true;
            setHeadersLoaded(true);
        }
        return true;
    }

    public boolean ignoreBodyStructureSize() {
        return ((IMAPStore) this.folder.getStore()).ignoreBodyStructureSize();
    }

    public synchronized void invalidateHeaders() {
        this.headersLoaded = false;
        this.loadedHeaders.clear();
        this.headers = null;
        this.envelope = null;
        this.f43917bs = null;
        this.receivedDate = null;
        this.size = -1L;
        this.type = null;
        this.subject = null;
        this.description = null;
        this.flags = null;
        this.content = null;
        this.contentStream = null;
        this.bodyLoaded = false;
    }

    public boolean isREV1() throws FolderClosedException {
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol.isREV1();
        }
        throw new FolderClosedException(this.folder, null);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public synchronized boolean isSet(C3651i c3651i) {
        checkExpunged();
        loadFlags();
        return super.isSet(c3651i);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public void removeHeader(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void setContentID(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void setContentLanguage(String[] strArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void setContentMD5(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public void setDataHandler(C5154d c5154d) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void setDescription(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void setDisposition(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.AbstractC3682n
    public void setExpunged(boolean z6) {
        super.setExpunged(z6);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public void setFileName(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public synchronized void setFlags(C3678j c3678j, boolean z6) {
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                protocol.storeFlags(getSequenceNumber(), c3678j, z6);
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this.folder, e2.getMessage());
            } catch (ProtocolException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public void setFrom(AbstractC3633a abstractC3633a) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public void setHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.AbstractC3682n
    public void setMessageNumber(int i10) {
        super.setMessageNumber(i10);
    }

    public void setModSeq(long j6) {
        this.modseq = j6;
    }

    public synchronized void setPeek(boolean z6) {
        this.peek = Boolean.valueOf(z6);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public void setRecipients(C3681m c3681m, AbstractC3633a[] abstractC3633aArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public void setReplyTo(AbstractC3633a[] abstractC3633aArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void setSender(AbstractC3633a abstractC3633a) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public void setSentDate(Date date) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // jakarta.mail.internet.C3665n
    public void setSubject(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setUID(long j6) {
        this.uid = j6;
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public void writeTo(OutputStream outputStream) throws Throwable {
        if (this.bodyLoaded) {
            super.writeTo(outputStream);
            return;
        }
        InputStream mimeStream = getMimeStream();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = mimeStream.read(bArr);
                if (i10 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i10);
                }
            }
        } finally {
            mimeStream.close();
        }
    }

    public IMAPMessage(c0 c0Var) {
        super(c0Var);
        this.size = -1L;
        this.uid = -1L;
        this.modseq = -1L;
        this.headersLoaded = false;
        this.bodyLoaded = false;
        this.loadedHeaders = new Hashtable<>(1);
    }

    @Override // jakarta.mail.internet.C3665n, jakarta.mail.internet.InterfaceC3667p
    public String getHeader(String str, String str2) throws MessageRemovedException {
        checkExpunged();
        if (getHeader(str) == null) {
            return null;
        }
        return this.headers.m8217c(str, str2);
    }
}
