package jakarta.mail.internet;

import com.amplifyframework.storage.ObjectMetadata;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.MessageRemovedIOException;
import com.sun.mail.util.MimeUtil;
import com.sun.mail.util.PropUtil;
import jakarta.mail.AbstractC3633a;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.AbstractC3684p;
import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import jakarta.mail.C3680l;
import jakarta.mail.C3681m;
import jakarta.mail.FolderClosedException;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MessagingException;
import jakarta.mail.c0;
import jakarta.mail.util.C3691b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import nw.C5154d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.n */
/* loaded from: classes3.dex */
public class C3665n extends AbstractC3682n implements InterfaceC3667p {
    private boolean allowutf8;
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* renamed from: dh, reason: collision with root package name */
    protected C5154d f44378dh;
    protected C3678j flags;
    protected C3658g headers;
    protected boolean modified;
    protected boolean saved;
    private boolean strict;
    private static final C3660i mailDateFormat = new C3660i();
    private static final C3678j answeredFlag = new C3678j(C3651i.f19323b);

    public C3665n(c0 c0Var) {
        super(c0Var);
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.modified = true;
        this.headers = new C3658g();
        this.flags = new C3678j();
        m8228e();
    }

    /* renamed from: b */
    public static AbstractC3633a[] m8224b(ArrayList arrayList, AbstractC3633a[] abstractC3633aArr) {
        boolean z6;
        if (abstractC3633aArr == null) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < abstractC3633aArr.length; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    z6 = false;
                    break;
                }
                if (((C3655d) arrayList.get(i12)).equals(abstractC3633aArr[i11])) {
                    i10++;
                    abstractC3633aArr[i11] = null;
                    z6 = true;
                    break;
                }
                i12++;
            }
            if (!z6) {
                arrayList.add(abstractC3633aArr[i11]);
            }
        }
        if (i10 == 0) {
            return abstractC3633aArr;
        }
        AbstractC3633a[] abstractC3633aArr2 = abstractC3633aArr instanceof C3655d[] ? new C3655d[abstractC3633aArr.length - i10] : new AbstractC3633a[abstractC3633aArr.length - i10];
        int i13 = 0;
        for (AbstractC3633a abstractC3633a : abstractC3633aArr) {
            if (abstractC3633a != null) {
                abstractC3633aArr2[i13] = abstractC3633a;
                i13++;
            }
        }
        return abstractC3633aArr2;
    }

    /* renamed from: d */
    public static String m8225d(C3681m c3681m) throws MessagingException {
        if (c3681m == C3681m.f19407b) {
            return "To";
        }
        if (c3681m == C3681m.f19408c) {
            return "Cc";
        }
        if (c3681m == C3681m.f19409d) {
            return "Bcc";
        }
        if (c3681m == C3664m.f19365e) {
            return "Newsgroups";
        }
        throw new MessagingException("Invalid Recipient Type");
    }

    /* renamed from: a */
    public final void m8226a(String str, AbstractC3633a[] abstractC3633aArr) {
        if (abstractC3633aArr == null || abstractC3633aArr.length == 0) {
            return;
        }
        AbstractC3633a[] abstractC3633aArrM8227c = m8227c(str);
        if (abstractC3633aArrM8227c != null && abstractC3633aArrM8227c.length != 0) {
            AbstractC3633a[] abstractC3633aArr2 = new AbstractC3633a[abstractC3633aArrM8227c.length + abstractC3633aArr.length];
            System.arraycopy(abstractC3633aArrM8227c, 0, abstractC3633aArr2, 0, abstractC3633aArrM8227c.length);
            System.arraycopy(abstractC3633aArr, 0, abstractC3633aArr2, abstractC3633aArrM8227c.length, abstractC3633aArr.length);
            abstractC3633aArr = abstractC3633aArr2;
        }
        String unicodeString = this.allowutf8 ? C3655d.toUnicodeString(abstractC3633aArr, str.length() + 2) : C3655d.toString(abstractC3633aArr, str.length() + 2);
        if (unicodeString == null) {
            return;
        }
        setHeader(str, unicodeString);
    }

    @Override // jakarta.mail.AbstractC3682n
    public void addFrom(AbstractC3633a[] abstractC3633aArr) {
        m8226a("From", abstractC3633aArr);
    }

    public void addHeader(String str, String str2) {
        this.headers.m8215a(str, str2);
    }

    public void addHeaderLine(String str) {
        this.headers.m8216b(str);
    }

    @Override // jakarta.mail.AbstractC3682n
    public void addRecipients(C3681m c3681m, AbstractC3633a[] abstractC3633aArr) {
        if (c3681m != C3664m.f19365e) {
            m8226a(m8225d(c3681m), abstractC3633aArr);
            return;
        }
        String string = C3671t.toString(abstractC3633aArr);
        if (string != null) {
            addHeader("Newsgroups", string);
        }
    }

    /* renamed from: c */
    public final AbstractC3633a[] m8227c(String str) {
        String header = getHeader(str, ",");
        if (header == null) {
            return null;
        }
        return C3655d.parseHeader(header, this.strict);
    }

    public C3658g createInternetHeaders(InputStream inputStream) {
        return new C3658g(inputStream, this.allowutf8);
    }

    public C3665n createMimeMessage(c0 c0Var) {
        return new C3665n(c0Var);
    }

    /* renamed from: e */
    public final void m8228e() {
        c0 c0Var = this.session;
        if (c0Var != null) {
            Properties properties = c0Var.f19287a;
            this.strict = PropUtil.getBooleanProperty(properties, "mail.mime.address.strict", true);
            this.allowutf8 = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        }
    }

    /* renamed from: f */
    public final void m8229f(String str, AbstractC3633a[] abstractC3633aArr) {
        String unicodeString = this.allowutf8 ? C3655d.toUnicodeString(abstractC3633aArr, str.length() + 2) : C3655d.toString(abstractC3633aArr, str.length() + 2);
        if (unicodeString == null) {
            removeHeader(str);
        } else {
            setHeader(str, unicodeString);
        }
    }

    public Enumeration<String> getAllHeaderLines() {
        return this.headers.m8219e(null);
    }

    public Enumeration<C3680l> getAllHeaders() {
        return new C3657f(this.headers.f19358a, null, false, false, 0);
    }

    @Override // jakarta.mail.AbstractC3682n
    public AbstractC3633a[] getAllRecipients() {
        int length;
        AbstractC3633a[] recipients = getRecipients(C3681m.f19407b);
        AbstractC3633a[] recipients2 = getRecipients(C3681m.f19408c);
        AbstractC3633a[] recipients3 = getRecipients(C3681m.f19409d);
        if (recipients2 != null || recipients3 != null) {
            AbstractC3633a[] abstractC3633aArr = new AbstractC3633a[(recipients != null ? recipients.length : 0) + (recipients2 != null ? recipients2.length : 0) + (recipients3 != null ? recipients3.length : 0)];
            if (recipients != null) {
                System.arraycopy(recipients, 0, abstractC3633aArr, 0, recipients.length);
                length = recipients.length;
            } else {
                length = 0;
            }
            if (recipients2 != null) {
                System.arraycopy(recipients2, 0, abstractC3633aArr, length, recipients2.length);
                length += recipients2.length;
            }
            if (recipients3 != null) {
                System.arraycopy(recipients3, 0, abstractC3633aArr, length, recipients3.length);
            }
            recipients = abstractC3633aArr;
        }
        AbstractC3633a[] recipients4 = getRecipients(C3664m.f19365e);
        if (recipients4 == null) {
            return recipients;
        }
        if (recipients == null) {
            return recipients4;
        }
        AbstractC3633a[] abstractC3633aArr2 = new AbstractC3633a[recipients.length + recipients4.length];
        System.arraycopy(recipients, 0, abstractC3633aArr2, 0, recipients.length);
        System.arraycopy(recipients4, 0, abstractC3633aArr2, recipients.length, recipients4.length);
        return abstractC3633aArr2;
    }

    @Override // jakarta.mail.InterfaceC3685q
    public Object getContent() throws FolderClosedException, MessageRemovedException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object objM10062b = getDataHandler().m10062b();
            if (C3663l.cacheMultipart && (((objM10062b instanceof AbstractC3684p) || (objM10062b instanceof AbstractC3682n)) && (this.content != null || this.contentStream != null))) {
                this.cachedContent = objM10062b;
                if (objM10062b instanceof C3666o) {
                    ((C3666o) objM10062b).m8236g();
                }
            }
            return objM10062b;
        } catch (FolderClosedIOException e2) {
            throw new FolderClosedException(e2.getFolder(), e2.getMessage());
        } catch (MessageRemovedIOException e10) {
            throw new MessageRemovedException(e10.getMessage());
        }
    }

    public String getContentID() {
        return getHeader("Content-Id", null);
    }

    public String[] getContentLanguage() {
        return C3663l.getContentLanguage(this);
    }

    public String getContentMD5() {
        return getHeader(ObjectMetadata.CONTENT_MD5, null);
    }

    public InputStream getContentStream() throws MessagingException {
        Closeable closeable = this.contentStream;
        if (closeable != null) {
            return ((InterfaceC3676y) closeable).newStream(0L, -1L);
        }
        if (this.content != null) {
            return new C3691b(this.content);
        }
        throw new MessagingException("No MimeMessage content");
    }

    @Override // jakarta.mail.InterfaceC3685q
    public String getContentType() {
        String strCleanContentType = MimeUtil.cleanContentType(this, getHeader(ObjectMetadata.CONTENT_TYPE, null));
        return strCleanContentType == null ? "text/plain" : strCleanContentType;
    }

    @Override // jakarta.mail.InterfaceC3685q
    public synchronized C5154d getDataHandler() {
        try {
            if (this.f44378dh == null) {
                this.f44378dh = new C3662k(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f44378dh;
    }

    public String getDescription() {
        return C3663l.getDescription(this);
    }

    public String getDisposition() {
        return C3663l.getDisposition(this);
    }

    public String getEncoding() {
        return C3663l.getEncoding(this);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public String getFileName() {
        return C3663l.getFileName(this);
    }

    @Override // jakarta.mail.AbstractC3682n
    public synchronized C3678j getFlags() {
        return (C3678j) this.flags.clone();
    }

    public AbstractC3633a[] getFrom() {
        AbstractC3633a[] abstractC3633aArrM8227c = m8227c("From");
        return abstractC3633aArrM8227c == null ? m8227c("Sender") : abstractC3633aArrM8227c;
    }

    @Override // jakarta.mail.InterfaceC3685q
    public String[] getHeader(String str) {
        return this.headers.m8218d(str);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public InputStream getInputStream() {
        return getDataHandler().m10065e();
    }

    public int getLineCount() {
        return -1;
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        return new C3657f(this.headers.f19358a, strArr, true, true, 1);
    }

    public Enumeration<C3680l> getMatchingHeaders(String[] strArr) {
        return new C3657f(this.headers.f19358a, strArr, true, false, 0);
    }

    public String getMessageID() {
        return getHeader("Message-ID", null);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        return this.headers.m8219e(strArr);
    }

    public Enumeration<C3680l> getNonMatchingHeaders(String[] strArr) {
        return new C3657f(this.headers.f19358a, strArr, false, false, 0);
    }

    public InputStream getRawInputStream() {
        return getContentStream();
    }

    @Override // jakarta.mail.AbstractC3682n
    public Date getReceivedDate() {
        return null;
    }

    public AbstractC3633a[] getRecipients(C3681m c3681m) {
        if (c3681m != C3664m.f19365e) {
            return m8227c(m8225d(c3681m));
        }
        String header = getHeader("Newsgroups", ",");
        if (header == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(header, ",");
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            C3671t c3671t = new C3671t();
            c3671t.f19385a = strNextToken.replaceAll("\\s+", "");
            arrayList.add(c3671t);
        }
        return (C3671t[]) arrayList.toArray(new C3671t[arrayList.size()]);
    }

    public AbstractC3633a[] getReplyTo() {
        AbstractC3633a[] abstractC3633aArrM8227c = m8227c("Reply-To");
        return (abstractC3633aArrM8227c == null || abstractC3633aArrM8227c.length == 0) ? getFrom() : abstractC3633aArrM8227c;
    }

    public AbstractC3633a getSender() {
        AbstractC3633a[] abstractC3633aArrM8227c = m8227c("Sender");
        if (abstractC3633aArrM8227c == null || abstractC3633aArrM8227c.length == 0) {
            return null;
        }
        return abstractC3633aArrM8227c[0];
    }

    @Override // jakarta.mail.AbstractC3682n
    public Date getSentDate() {
        Date date;
        String header = getHeader("Date", null);
        if (header != null) {
            try {
                C3660i c3660i = mailDateFormat;
                synchronized (c3660i) {
                    date = c3660i.parse(header);
                }
                return date;
            } catch (java.text.ParseException unused) {
            }
        }
        return null;
    }

    @Override // jakarta.mail.InterfaceC3685q
    public int getSize() throws IOException {
        byte[] bArr = this.content;
        if (bArr != null) {
            return bArr.length;
        }
        InputStream inputStream = this.contentStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            int iAvailable = inputStream.available();
            if (iAvailable > 0) {
                return iAvailable;
            }
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // jakarta.mail.AbstractC3682n
    public String getSubject() {
        String header = getHeader("Subject", null);
        if (header == null) {
            return null;
        }
        try {
            return AbstractC3670s.m8240d(AbstractC3670s.m8256t(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    @Override // jakarta.mail.InterfaceC3685q
    public boolean isMimeType(String str) {
        return C3663l.isMimeType(this, str);
    }

    @Override // jakarta.mail.AbstractC3682n
    public synchronized boolean isSet(C3651i c3651i) {
        return this.flags.contains(c3651i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parse(InputStream inputStream) throws MessagingException {
        boolean z6 = inputStream instanceof ByteArrayInputStream;
        InputStream bufferedInputStream = inputStream;
        if (!z6) {
            boolean z10 = inputStream instanceof BufferedInputStream;
            bufferedInputStream = inputStream;
            if (!z10) {
                boolean z11 = inputStream instanceof InterfaceC3676y;
                bufferedInputStream = inputStream;
                if (!z11) {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                }
            }
        }
        this.headers = createInternetHeaders(bufferedInputStream);
        if (bufferedInputStream instanceof InterfaceC3676y) {
            InterfaceC3676y interfaceC3676y = (InterfaceC3676y) bufferedInputStream;
            this.contentStream = interfaceC3676y.newStream(interfaceC3676y.getPosition(), -1L);
        } else {
            try {
                this.content = ASCIIUtility.getBytes(bufferedInputStream);
            } catch (IOException e2) {
                throw new MessagingException("IOException", e2);
            }
        }
        this.modified = false;
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void removeHeader(String str) {
        this.headers.m8221g(str);
    }

    public AbstractC3682n reply(boolean z6) {
        return reply(z6, true);
    }

    @Override // jakarta.mail.AbstractC3682n
    public void saveChanges() {
        this.modified = true;
        this.saved = true;
        updateHeaders();
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void setContent(Object obj, String str) {
        if (obj instanceof AbstractC3684p) {
            setContent((AbstractC3684p) obj);
        } else {
            setDataHandler(new C5154d(obj, str));
        }
    }

    public void setContentID(String str) {
        if (str == null) {
            removeHeader("Content-ID");
        } else {
            setHeader("Content-ID", str);
        }
    }

    public void setContentLanguage(String[] strArr) {
        C3663l.setContentLanguage(this, strArr);
    }

    public void setContentMD5(String str) {
        setHeader(ObjectMetadata.CONTENT_MD5, str);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public synchronized void setDataHandler(C5154d c5154d) {
        this.f44378dh = c5154d;
        this.cachedContent = null;
        C3663l.invalidateContentHeaders(this);
    }

    public void setDescription(String str) throws MessagingException {
        setDescription(str, null);
    }

    public void setDisposition(String str) {
        C3663l.setDisposition(this, str);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void setFileName(String str) throws IOException, MessagingException {
        C3663l.setFileName(this, str);
    }

    @Override // jakarta.mail.AbstractC3682n
    public synchronized void setFlags(C3678j c3678j, boolean z6) {
        try {
            if (z6) {
                this.flags.add(c3678j);
            } else {
                this.flags.remove(c3678j);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // jakarta.mail.AbstractC3682n
    public void setFrom(AbstractC3633a abstractC3633a) {
        if (abstractC3633a == null) {
            removeHeader("From");
        } else {
            m8229f("From", new AbstractC3633a[]{abstractC3633a});
        }
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void setHeader(String str, String str2) {
        this.headers.m8222h(str, str2);
    }

    @Override // jakarta.mail.AbstractC3682n
    public void setRecipients(C3681m c3681m, AbstractC3633a[] abstractC3633aArr) {
        if (c3681m != C3664m.f19365e) {
            m8229f(m8225d(c3681m), abstractC3633aArr);
        } else if (abstractC3633aArr == null || abstractC3633aArr.length == 0) {
            removeHeader("Newsgroups");
        } else {
            setHeader("Newsgroups", C3671t.toString(abstractC3633aArr));
        }
    }

    @Override // jakarta.mail.AbstractC3682n
    public void setReplyTo(AbstractC3633a[] abstractC3633aArr) {
        m8229f("Reply-To", abstractC3633aArr);
    }

    public void setSender(AbstractC3633a abstractC3633a) {
        if (abstractC3633a == null) {
            removeHeader("Sender");
        } else {
            m8229f("Sender", new AbstractC3633a[]{abstractC3633a});
        }
    }

    @Override // jakarta.mail.AbstractC3682n
    public void setSentDate(Date date) {
        if (date == null) {
            removeHeader("Date");
            return;
        }
        C3660i c3660i = mailDateFormat;
        synchronized (c3660i) {
            setHeader("Date", c3660i.format(date));
        }
    }

    public void setSubject(String str) throws MessagingException {
        setSubject(str, null);
    }

    public void setText(String str) {
        setText(str, null);
    }

    public synchronized void updateHeaders() {
        try {
            C3663l.updateHeaders(this);
            setHeader("MIME-Version", "1.0");
            if (getHeader("Date") == null) {
                setSentDate(new Date());
            }
            updateMessageID();
            Object obj = this.cachedContent;
            if (obj != null) {
                this.f44378dh = new C5154d(obj, getContentType());
                this.cachedContent = null;
                this.content = null;
                InputStream inputStream = this.contentStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.contentStream = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void updateMessageID() {
        StringBuilder sb2 = new StringBuilder("<");
        c0 c0Var = this.session;
        AtomicInteger atomicInteger = AbstractC3677z.f19403a;
        C3655d localAddress = C3655d.getLocalAddress(c0Var);
        String address = localAddress != null ? localAddress.getAddress() : "jakartamailuser@localhost";
        int iLastIndexOf = address.lastIndexOf(64);
        if (iLastIndexOf >= 0) {
            address = address.substring(iLastIndexOf);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb3.hashCode());
        sb3.append('.');
        sb3.append(AbstractC3677z.f19403a.getAndIncrement());
        sb3.append('.');
        sb3.append(System.currentTimeMillis());
        sb3.append(address);
        sb2.append(sb3.toString());
        sb2.append(">");
        setHeader("Message-ID", sb2.toString());
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void writeTo(OutputStream outputStream) throws Throwable {
        writeTo(outputStream, null);
    }

    public String getHeader(String str, String str2) {
        return this.headers.m8217c(str, str2);
    }

    public AbstractC3682n reply(boolean z6, boolean z10) {
        C3665n c3665nCreateMimeMessage = createMimeMessage(this.session);
        String header = getHeader("Subject", null);
        if (header != null) {
            if (!header.regionMatches(true, 0, "Re: ", 0, 4)) {
                header = "Re: ".concat(header);
            }
            c3665nCreateMimeMessage.setHeader("Subject", header);
        }
        AbstractC3633a[] replyTo = getReplyTo();
        C3681m c3681m = C3681m.f19407b;
        c3665nCreateMimeMessage.setRecipients(c3681m, replyTo);
        if (z6) {
            ArrayList arrayList = new ArrayList();
            C3655d localAddress = C3655d.getLocalAddress(this.session);
            if (localAddress != null) {
                arrayList.add(localAddress);
            }
            c0 c0Var = this.session;
            String property = c0Var != null ? c0Var.f19287a.getProperty("mail.alternates") : null;
            if (property != null) {
                m8224b(arrayList, C3655d.parse(property, false));
            }
            c0 c0Var2 = this.session;
            boolean booleanProperty = c0Var2 != null ? PropUtil.getBooleanProperty(c0Var2.f19287a, "mail.replyallcc", false) : false;
            m8224b(arrayList, replyTo);
            AbstractC3633a[] abstractC3633aArrM8224b = m8224b(arrayList, getRecipients(c3681m));
            C3681m c3681m2 = C3681m.f19408c;
            if (abstractC3633aArrM8224b != null && abstractC3633aArrM8224b.length > 0) {
                if (booleanProperty) {
                    c3665nCreateMimeMessage.addRecipients(c3681m2, abstractC3633aArrM8224b);
                } else {
                    c3665nCreateMimeMessage.addRecipients(c3681m, abstractC3633aArrM8224b);
                }
            }
            AbstractC3633a[] abstractC3633aArrM8224b2 = m8224b(arrayList, getRecipients(c3681m2));
            if (abstractC3633aArrM8224b2 != null && abstractC3633aArrM8224b2.length > 0) {
                c3665nCreateMimeMessage.addRecipients(c3681m2, abstractC3633aArrM8224b2);
            }
            C3664m c3664m = C3664m.f19365e;
            AbstractC3633a[] recipients = getRecipients(c3664m);
            if (recipients != null && recipients.length > 0) {
                c3665nCreateMimeMessage.setRecipients(c3664m, recipients);
            }
        }
        String header2 = getHeader("Message-Id", null);
        if (header2 != null) {
            c3665nCreateMimeMessage.setHeader("In-Reply-To", header2);
        }
        String header3 = getHeader("References", " ");
        if (header3 == null) {
            header3 = getHeader("In-Reply-To", " ");
        }
        if (header2 == null) {
            header2 = header3;
        } else if (header3 != null) {
            header2 = AbstractC3670s.m8256t(header3) + " " + header2;
        }
        if (header2 != null) {
            c3665nCreateMimeMessage.setHeader("References", AbstractC3670s.m8245i(12, header2));
        }
        if (z10) {
            try {
                setFlags(answeredFlag, true);
            } catch (MessagingException unused) {
            }
        }
        return c3665nCreateMimeMessage;
    }

    public void setDescription(String str, String str2) throws MessagingException {
        C3663l.setDescription(this, str, str2);
    }

    public void setSubject(String str, String str2) throws MessagingException {
        if (str == null) {
            removeHeader("Subject");
            return;
        }
        try {
            setHeader("Subject", AbstractC3670s.m8245i(9, AbstractC3670s.m8244h(str, str2, false)));
        } catch (UnsupportedEncodingException e2) {
            throw new MessagingException("Encoding error", e2);
        }
    }

    @Override // jakarta.mail.internet.InterfaceC3667p
    public void setText(String str, String str2) {
        C3663l.setText(this, str, str2, "plain");
    }

    public void writeTo(OutputStream outputStream, String[] strArr) throws Throwable {
        InputStream contentStream;
        if (!this.saved) {
            saveChanges();
        }
        if (this.modified) {
            C3663l.writeTo(this, outputStream, strArr);
            return;
        }
        Enumeration<String> nonMatchingHeaderLines = getNonMatchingHeaderLines(strArr);
        LineOutputStream lineOutputStream = new LineOutputStream(outputStream, this.allowutf8);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        byte[] bArr = this.content;
        if (bArr == null) {
            byte[] bArr2 = new byte[8192];
            try {
                contentStream = getContentStream();
                while (true) {
                    try {
                        int i10 = contentStream.read(bArr2);
                        if (i10 <= 0) {
                            break;
                        } else {
                            outputStream.write(bArr2, 0, i10);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (contentStream != null) {
                            contentStream.close();
                        }
                        throw th;
                    }
                }
                contentStream.close();
            } catch (Throwable th3) {
                th = th3;
                contentStream = null;
            }
        } else {
            outputStream.write(bArr);
        }
        outputStream.flush();
    }

    public void setText(String str, String str2, String str3) {
        C3663l.setText(this, str, str2, str3);
    }

    public void setContent(AbstractC3684p abstractC3684p) {
        String str;
        synchronized (abstractC3684p) {
            str = abstractC3684p.f19413b;
        }
        setDataHandler(new C5154d(abstractC3684p, str));
        synchronized (abstractC3684p) {
            abstractC3684p.f19414c = this;
        }
    }

    public void setFrom(String str) {
        if (str != null) {
            m8229f("From", C3655d.parse(str));
        } else {
            removeHeader("From");
        }
    }

    public void addRecipients(C3681m c3681m, String str) {
        if (c3681m == C3664m.f19365e) {
            if (str == null || str.length() == 0) {
                return;
            }
            addHeader("Newsgroups", str);
            return;
        }
        m8226a(m8225d(c3681m), C3655d.parse(str));
    }

    public void setRecipients(C3681m c3681m, String str) {
        if (c3681m != C3664m.f19365e) {
            m8229f(m8225d(c3681m), str == null ? null : C3655d.parse(str));
        } else if (str != null && str.length() != 0) {
            setHeader("Newsgroups", str);
        } else {
            removeHeader("Newsgroups");
        }
    }

    @Override // jakarta.mail.AbstractC3682n
    public void setFrom() throws MessagingException {
        try {
            C3655d c3655d_getLocalAddress = C3655d._getLocalAddress(this.session);
            if (c3655d_getLocalAddress != null) {
                setFrom(c3655d_getLocalAddress);
                return;
            }
            throw new MessagingException("No From address");
        } catch (Exception e2) {
            throw new MessagingException("No From address", e2);
        }
    }

    public C3665n(c0 c0Var, InputStream inputStream) throws MessagingException {
        super(c0Var);
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.flags = new C3678j();
        m8228e();
        parse(inputStream);
        this.saved = true;
    }

    public C3665n(C3665n c3665n) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        super(c3665n.session);
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        C3678j flags = c3665n.getFlags();
        this.flags = flags;
        if (flags == null) {
            this.flags = new C3678j();
        }
        int size = c3665n.getSize();
        if (size > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(size);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            this.strict = c3665n.strict;
            c3665n.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.close();
            C3691b c3691b = new C3691b(byteArrayOutputStream.toByteArray());
            parse(c3691b);
            c3691b.close();
            this.saved = true;
        } catch (IOException e2) {
            throw new MessagingException("IOException while copying message", e2);
        }
    }

    public C3665n(AbstractC3679k abstractC3679k, int i10) {
        super(abstractC3679k, i10);
        this.modified = false;
        this.strict = true;
        this.allowutf8 = false;
        this.flags = new C3678j();
        this.saved = true;
        m8228e();
    }
}
