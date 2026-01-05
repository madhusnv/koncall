package jakarta.mail.internet;

import a1.C0005d;
import bj.C0669a;
import com.amplifyframework.storage.ObjectMetadata;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.MessageRemovedIOException;
import com.sun.mail.util.MimeUtil;
import com.sun.mail.util.PropUtil;
import i0.m0;
import jakarta.mail.AbstractC3635c;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.AbstractC3684p;
import jakarta.mail.FolderClosedException;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MessagingException;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import nw.C5154d;
import nw.C5155e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.l */
/* loaded from: classes3.dex */
public class C3663l extends AbstractC3635c implements InterfaceC3667p {
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* renamed from: dh, reason: collision with root package name */
    protected C5154d f44377dh;
    protected C3658g headers = new C3658g();
    private static final boolean setDefaultTextCharset = PropUtil.getBooleanSystemProperty("mail.mime.setdefaulttextcharset", true);
    private static final boolean setContentTypeFileName = PropUtil.getBooleanSystemProperty("mail.mime.setcontenttypefilename", true);
    private static final boolean encodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.encodefilename", false);
    private static final boolean decodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);
    private static final boolean ignoreMultipartEncoding = PropUtil.getBooleanSystemProperty("mail.mime.ignoremultipartencoding", true);
    private static final boolean allowutf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", true);
    static final boolean cacheMultipart = PropUtil.getBooleanSystemProperty("mail.mime.cachemultipart", true);

    public static String getDescription(InterfaceC3667p interfaceC3667p) {
        String header = interfaceC3667p.getHeader("Content-Description", null);
        if (header == null) {
            return null;
        }
        try {
            return AbstractC3670s.m8240d(AbstractC3670s.m8256t(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    public static String getDisposition(InterfaceC3667p interfaceC3667p) {
        String header = interfaceC3667p.getHeader(ObjectMetadata.CONTENT_DISPOSITION, null);
        if (header == null) {
            return null;
        }
        return new C3653b(header).f19343a;
    }

    public static void invalidateContentHeaders(InterfaceC3667p interfaceC3667p) {
        interfaceC3667p.removeHeader(ObjectMetadata.CONTENT_TYPE);
        interfaceC3667p.removeHeader("Content-Transfer-Encoding");
    }

    public static String restrictEncoding(InterfaceC3667p interfaceC3667p, String str) {
        String contentType;
        if (ignoreMultipartEncoding && str != null && !str.equalsIgnoreCase("7bit") && !str.equalsIgnoreCase("8bit") && !str.equalsIgnoreCase("binary") && (contentType = interfaceC3667p.getContentType()) != null) {
            try {
                C0005d c0005d = new C0005d(contentType);
                if (c0005d.m38E("multipart/*")) {
                    return null;
                }
                if (c0005d.m38E("message/*")) {
                    if (!PropUtil.getBooleanSystemProperty("mail.mime.allowencodedmessages", false)) {
                        return null;
                    }
                }
            } catch (ParseException unused) {
            }
        }
        return str;
    }

    public static void setEncoding(InterfaceC3667p interfaceC3667p, String str) {
        interfaceC3667p.setHeader("Content-Transfer-Encoding", str);
    }

    public void attachFile(File file) throws IOException, MessagingException {
        setDataHandler(new C5154d(new C5155e(file)));
        setFileName(file.getName());
        setDisposition("attachment");
    }

    public Enumeration getAllHeaderLines() {
        return this.headers.m8219e(null);
    }

    public Enumeration getAllHeaders() {
        return new C3657f(this.headers.f19358a, null, false, false, 0);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public Object getContent() throws FolderClosedException, MessageRemovedException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object objM10062b = getDataHandler().m10062b();
            if (cacheMultipart && (((objM10062b instanceof AbstractC3684p) || (objM10062b instanceof AbstractC3682n)) && (this.content != null || this.contentStream != null))) {
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

    public String[] getContentLanguage() {
        return getContentLanguage(this);
    }

    public InputStream getContentStream() throws MessagingException {
        Closeable closeable = this.contentStream;
        if (closeable != null) {
            return ((InterfaceC3676y) closeable).newStream(0L, -1L);
        }
        if (this.content != null) {
            return new ByteArrayInputStream(this.content);
        }
        throw new MessagingException("No MimeBodyPart content");
    }

    @Override // jakarta.mail.InterfaceC3685q
    public String getContentType() {
        String strCleanContentType = MimeUtil.cleanContentType(this, getHeader(ObjectMetadata.CONTENT_TYPE, null));
        return strCleanContentType == null ? "text/plain" : strCleanContentType;
    }

    @Override // jakarta.mail.InterfaceC3685q
    public C5154d getDataHandler() {
        if (this.f44377dh == null) {
            this.f44377dh = new C3662k(this);
        }
        return this.f44377dh;
    }

    public String getEncoding() {
        return getEncoding(this);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public String getFileName() {
        return getFileName(this);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public String[] getHeader(String str) {
        return this.headers.m8218d(str);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public InputStream getInputStream() {
        return getDataHandler().m10065e();
    }

    public Enumeration getMatchingHeaderLines(String[] strArr) {
        return new C3657f(this.headers.f19358a, strArr, true, true, 1);
    }

    public Enumeration getMatchingHeaders(String[] strArr) {
        return new C3657f(this.headers.f19358a, strArr, true, false, 0);
    }

    public Enumeration getNonMatchingHeaderLines(String[] strArr) {
        return this.headers.m8219e(strArr);
    }

    public Enumeration getNonMatchingHeaders(String[] strArr) {
        return new C3657f(this.headers.f19358a, strArr, false, false, 0);
    }

    public InputStream getRawInputStream() {
        return getContentStream();
    }

    @Override // jakarta.mail.InterfaceC3685q
    public boolean isMimeType(String str) {
        return isMimeType(this, str);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void removeHeader(String str) {
        this.headers.m8221g(str);
    }

    public void saveFile(File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        InputStream inputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            inputStream = getInputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 > 0) {
                    bufferedOutputStream.write(bArr, 0, i10);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            inputStream.close();
            try {
                bufferedOutputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            if (bufferedOutputStream == null) {
                throw th;
            }
            try {
                bufferedOutputStream.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
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
        setContentLanguage(this, strArr);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void setDataHandler(C5154d c5154d) {
        this.f44377dh = c5154d;
        this.cachedContent = null;
        invalidateContentHeaders(this);
    }

    public void setDescription(String str) throws MessagingException {
        setDescription(str, null);
    }

    public void setDisposition(String str) {
        setDisposition(this, "attachment");
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void setFileName(String str) throws IOException, MessagingException {
        setFileName(this, str);
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void setHeader(String str, String str2) {
        this.headers.m8222h(str, str2);
    }

    public void setText(String str) {
        setText(str, null);
    }

    public void updateHeaders() throws IOException, MessagingException {
        updateHeaders(this);
        Object obj = this.cachedContent;
        if (obj != null) {
            this.f44377dh = new C5154d(obj, getContentType());
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
    }

    @Override // jakarta.mail.InterfaceC3685q
    public void writeTo(OutputStream outputStream) throws IOException {
        writeTo(this, outputStream, null);
    }

    public static String[] getContentLanguage(InterfaceC3667p interfaceC3667p) {
        String header = interfaceC3667p.getHeader("Content-Language", null);
        if (header != null) {
            C3654c c3654c = new C3654c(header);
            ArrayList arrayList = new ArrayList();
            while (true) {
                C0669a c0669aM8205c = c3654c.m8205c((char) 0, false);
                int i10 = c0669aM8205c.f4225b;
                if (i10 == -4) {
                    break;
                }
                if (i10 == -1) {
                    arrayList.add(c0669aM8205c.f4226c);
                }
            }
            if (!arrayList.isEmpty()) {
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                return strArr;
            }
        }
        return null;
    }

    public static String getEncoding(InterfaceC3667p interfaceC3667p) {
        C0669a c0669aM8205c;
        int i10;
        String header = interfaceC3667p.getHeader("Content-Transfer-Encoding", null);
        if (header != null) {
            String strTrim = header.trim();
            if (strTrim.length() != 0) {
                if (strTrim.equalsIgnoreCase("7bit") || strTrim.equalsIgnoreCase("8bit") || strTrim.equalsIgnoreCase("quoted-printable") || strTrim.equalsIgnoreCase("binary") || strTrim.equalsIgnoreCase("base64")) {
                    return strTrim;
                }
                C3654c c3654c = new C3654c(strTrim);
                do {
                    c0669aM8205c = c3654c.m8205c((char) 0, false);
                    i10 = c0669aM8205c.f4225b;
                    if (i10 == -4) {
                        return strTrim;
                    }
                } while (i10 != -1);
                return c0669aM8205c.f4226c;
            }
        }
        return null;
    }

    public static String getFileName(InterfaceC3667p interfaceC3667p) throws MessagingException {
        String strCleanContentType;
        C3675x c3675x;
        String header = interfaceC3667p.getHeader(ObjectMetadata.CONTENT_DISPOSITION, null);
        String strM8261e = (header == null || (c3675x = new C3653b(header).f19344b) == null) ? null : c3675x.m8261e("filename");
        if (strM8261e == null && (strCleanContentType = MimeUtil.cleanContentType(interfaceC3667p, interfaceC3667p.getHeader(ObjectMetadata.CONTENT_TYPE, null))) != null) {
            try {
                strM8261e = new C0005d(strCleanContentType).m78w(IMAPStore.ID_NAME);
            } catch (ParseException unused) {
            }
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

    public static boolean isMimeType(InterfaceC3667p interfaceC3667p, String str) {
        String contentType = interfaceC3667p.getContentType();
        try {
            return new C0005d(contentType).m38E(str);
        } catch (ParseException unused) {
            try {
                int iIndexOf = contentType.indexOf(59);
                if (iIndexOf > 0) {
                    return new C0005d(contentType.substring(0, iIndexOf)).m38E(str);
                }
            } catch (ParseException unused2) {
            }
            return contentType.equalsIgnoreCase(str);
        }
    }

    public static void setContentLanguage(InterfaceC3667p interfaceC3667p, String[] strArr) {
        StringBuilder sb2 = new StringBuilder(strArr[0]);
        int length = strArr[0].length() + 18;
        for (int i10 = 1; i10 < strArr.length; i10++) {
            sb2.append(',');
            int i11 = length + 1;
            if (i11 > 76) {
                sb2.append("\r\n\t");
                i11 = 8;
            }
            sb2.append(strArr[i10]);
            length = i11 + strArr[i10].length();
        }
        interfaceC3667p.setHeader("Content-Language", sb2.toString());
    }

    public static void setDisposition(InterfaceC3667p interfaceC3667p, String str) {
        if (str == null) {
            interfaceC3667p.removeHeader(ObjectMetadata.CONTENT_DISPOSITION);
            return;
        }
        String header = interfaceC3667p.getHeader(ObjectMetadata.CONTENT_DISPOSITION, null);
        if (header != null) {
            C3653b c3653b = new C3653b(header);
            c3653b.f19343a = str;
            str = c3653b.toString();
        }
        interfaceC3667p.setHeader(ObjectMetadata.CONTENT_DISPOSITION, str);
    }

    public static void setFileName(InterfaceC3667p interfaceC3667p, String str) throws IOException, MessagingException {
        String strCleanContentType;
        boolean z6 = encodeFileName;
        if (z6 && str != null) {
            try {
                str = AbstractC3670s.m8244h(str, null, false);
            } catch (UnsupportedEncodingException e2) {
                throw new MessagingException("Can't encode filename", e2);
            }
        }
        String header = interfaceC3667p.getHeader(ObjectMetadata.CONTENT_DISPOSITION, null);
        if (header == null) {
            header = "attachment";
        }
        C3653b c3653b = new C3653b(header);
        String strM8247k = AbstractC3670s.m8247k();
        C3675x c3675x = c3653b.f19344b;
        if (c3675x == null) {
            c3675x = new C3675x();
            c3653b.f19344b = c3675x;
        }
        if (z6) {
            C3672u c3672u = new C3672u();
            c3672u.f19386a = str;
            c3675x.f19399a.put("filename", c3672u);
        } else {
            c3675x.m8264h("filename", str, strM8247k);
        }
        interfaceC3667p.setHeader(ObjectMetadata.CONTENT_DISPOSITION, c3653b.toString());
        if (!setContentTypeFileName || (strCleanContentType = MimeUtil.cleanContentType(interfaceC3667p, interfaceC3667p.getHeader(ObjectMetadata.CONTENT_TYPE, null))) == null) {
            return;
        }
        try {
            C0005d c0005d = new C0005d(strCleanContentType);
            C3675x c3675x2 = (C3675x) c0005d.f26d;
            if (c3675x2 == null) {
                c3675x2 = new C3675x();
                c0005d.f26d = c3675x2;
            }
            if (z6) {
                C3672u c3672u2 = new C3672u();
                c3672u2.f19386a = str;
                c3675x2.f19399a.put(IMAPStore.ID_NAME, c3672u2);
            } else {
                c3675x2.m8264h(IMAPStore.ID_NAME, str, strM8247k);
            }
            interfaceC3667p.setHeader(ObjectMetadata.CONTENT_TYPE, c0005d.toString());
        } catch (ParseException unused) {
        }
    }

    public static void writeTo(InterfaceC3667p interfaceC3667p, OutputStream outputStream, String[] strArr) throws IOException {
        LineOutputStream lineOutputStream = outputStream instanceof LineOutputStream ? (LineOutputStream) outputStream : new LineOutputStream(outputStream, allowutf8);
        Enumeration nonMatchingHeaderLines = interfaceC3667p.getNonMatchingHeaderLines(strArr);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln((String) nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        InputStream contentStream = null;
        try {
            C5154d dataHandler = interfaceC3667p.getDataHandler();
            if (dataHandler instanceof C3662k) {
                InterfaceC3667p interfaceC3667p2 = ((C3662k) dataHandler).f19364g;
                if (interfaceC3667p2.getEncoding() != null) {
                    if (interfaceC3667p2 instanceof C3663l) {
                        contentStream = ((C3663l) interfaceC3667p2).getContentStream();
                    } else if (interfaceC3667p2 instanceof C3665n) {
                        contentStream = ((C3665n) interfaceC3667p2).getContentStream();
                    }
                }
            }
            if (contentStream != null) {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = contentStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                outputStream = AbstractC3670s.m8243g(outputStream, restrictEncoding(interfaceC3667p, interfaceC3667p.getEncoding()));
                interfaceC3667p.getDataHandler().m10067g(outputStream);
            }
            if (contentStream != null) {
                contentStream.close();
            }
            outputStream.flush();
        } catch (Throwable th2) {
            if (0 != 0) {
                contentStream.close();
            }
            throw th2;
        }
    }

    @Override // jakarta.mail.internet.InterfaceC3667p
    public String getHeader(String str, String str2) {
        return this.headers.m8217c(str, str2);
    }

    public void setDescription(String str, String str2) throws MessagingException {
        setDescription(this, str, null);
    }

    @Override // jakarta.mail.internet.InterfaceC3667p
    public void setText(String str, String str2) {
        setText(this, str, str2, "plain");
    }

    public static void setDescription(InterfaceC3667p interfaceC3667p, String str, String str2) throws MessagingException {
        if (str != null) {
            try {
                interfaceC3667p.setHeader("Content-Description", AbstractC3670s.m8245i(21, AbstractC3670s.m8244h(str, str2, false)));
                return;
            } catch (UnsupportedEncodingException e2) {
                throw new MessagingException("Encoding error", e2);
            }
        }
        interfaceC3667p.removeHeader("Content-Description");
    }

    public void setText(String str, String str2, String str3) {
        setText(this, str, str2, str3);
    }

    public static void setText(InterfaceC3667p interfaceC3667p, String str, String str2, String str3) {
        if (str2 == null) {
            if (AbstractC3670s.m8237a(str) != 1) {
                str2 = AbstractC3670s.m8247k();
            } else {
                str2 = "us-ascii";
            }
        }
        StringBuilder sbM7383p = m0.m7383p("text/", str3, "; charset=");
        sbM7383p.append(AbstractC3670s.m8255s(str2, "()<>@,;:\\\"\t []/?="));
        interfaceC3667p.setContent(str, sbM7383p.toString());
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

    public void attachFile(String str) throws IOException, MessagingException {
        attachFile(new File(str));
    }

    public void attachFile(File file, String str, String str2) throws IOException, MessagingException {
        C3661j c3661j = new C3661j(file);
        c3661j.f19362c = str;
        c3661j.f19363d = str2;
        setDataHandler(new C5154d(c3661j));
        setFileName(file.getName());
        setDisposition("attachment");
    }

    public static void updateHeaders(InterfaceC3667p interfaceC3667p) throws MessagingException {
        String header;
        String strM8247k;
        Object objM10062b;
        C5154d dataHandler = interfaceC3667p.getDataHandler();
        if (dataHandler == null) {
            return;
        }
        try {
            String strM10063c = dataHandler.m10063c();
            boolean z6 = true;
            boolean z10 = interfaceC3667p.getHeader(ObjectMetadata.CONTENT_TYPE) == null;
            C0005d c0005d = new C0005d(strM10063c);
            if (c0005d.m38E("multipart/*")) {
                if (interfaceC3667p instanceof C3663l) {
                    objM10062b = ((C3663l) interfaceC3667p).cachedContent;
                    if (objM10062b == null) {
                        objM10062b = dataHandler.m10062b();
                    }
                } else if (!(interfaceC3667p instanceof C3665n) || (objM10062b = ((C3665n) interfaceC3667p).cachedContent) == null) {
                    objM10062b = dataHandler.m10062b();
                }
                if (!(objM10062b instanceof C3666o)) {
                    throw new MessagingException("MIME part of type \"" + strM10063c + "\" contains object of type " + objM10062b.getClass().getName() + " instead of MimeMultipart");
                }
                C3666o c3666o = (C3666o) objM10062b;
                synchronized (c3666o) {
                    c3666o.m8236g();
                    for (int i10 = 0; i10 < c3666o.f19412a.size(); i10++) {
                        ((C3663l) c3666o.f19412a.elementAt(i10)).updateHeaders();
                    }
                }
            } else if (!c0005d.m38E("message/rfc822")) {
                z6 = false;
            }
            if (dataHandler instanceof C3662k) {
                InterfaceC3667p interfaceC3667p2 = ((C3662k) dataHandler).f19364g;
                if (interfaceC3667p2 == interfaceC3667p) {
                    return;
                }
                if (z10) {
                    interfaceC3667p.setHeader(ObjectMetadata.CONTENT_TYPE, interfaceC3667p2.getContentType());
                }
                String encoding = interfaceC3667p2.getEncoding();
                if (encoding != null) {
                    setEncoding(interfaceC3667p, encoding);
                    return;
                }
            }
            if (!z6) {
                if (interfaceC3667p.getHeader("Content-Transfer-Encoding") == null) {
                    setEncoding(interfaceC3667p, AbstractC3670s.m8248l(dataHandler));
                }
                if (z10 && setDefaultTextCharset && c0005d.m38E("text/*") && c0005d.m78w("charset") == null) {
                    String encoding2 = interfaceC3667p.getEncoding();
                    if (encoding2 != null && encoding2.equalsIgnoreCase("7bit")) {
                        strM8247k = "us-ascii";
                    } else {
                        strM8247k = AbstractC3670s.m8247k();
                    }
                    if (((C3675x) c0005d.f26d) == null) {
                        c0005d.f26d = new C3675x();
                    }
                    ((C3675x) c0005d.f26d).m8263g("charset", strM8247k);
                    strM10063c = c0005d.toString();
                }
            }
            if (z10) {
                if (setContentTypeFileName && (header = interfaceC3667p.getHeader(ObjectMetadata.CONTENT_DISPOSITION, null)) != null) {
                    C3675x c3675x = new C3653b(header).f19344b;
                    String strM8261e = c3675x == null ? null : c3675x.m8261e("filename");
                    if (strM8261e != null) {
                        C3675x c3675x2 = (C3675x) c0005d.f26d;
                        if (c3675x2 == null) {
                            c3675x2 = new C3675x();
                            c0005d.f26d = c3675x2;
                        }
                        if (encodeFileName) {
                            String strM8244h = AbstractC3670s.m8244h(strM8261e, null, false);
                            C3672u c3672u = new C3672u();
                            c3672u.f19386a = strM8244h;
                            c3675x2.f19399a.put(IMAPStore.ID_NAME, c3672u);
                        } else {
                            c3675x2.m8264h(IMAPStore.ID_NAME, strM8261e, AbstractC3670s.m8247k());
                        }
                        strM10063c = c0005d.toString();
                    }
                }
                interfaceC3667p.setHeader(ObjectMetadata.CONTENT_TYPE, strM10063c);
            }
        } catch (IOException e2) {
            throw new MessagingException("IOException updating headers", e2);
        }
    }

    public void saveFile(String str) throws Throwable {
        saveFile(new File(str));
    }

    public void attachFile(String str, String str2, String str3) throws IOException, MessagingException {
        attachFile(new File(str), str2, str3);
    }
}
