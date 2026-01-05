package jakarta.mail.internet;

import com.sun.mail.util.FolderClosedIOException;
import jakarta.mail.C3683o;
import jakarta.mail.FolderClosedException;
import jakarta.mail.MessagingException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownServiceException;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.q */
/* loaded from: classes3.dex */
public class C3668q implements InterfaceC5156f {
    private C3683o context;
    protected InterfaceC3667p part;

    public C3668q(InterfaceC3667p interfaceC3667p) {
        this.part = interfaceC3667p;
    }

    @Override // nw.InterfaceC5156f
    public String getContentType() {
        try {
            return this.part.getContentType();
        } catch (MessagingException unused) {
            return "application/octet-stream";
        }
    }

    @Override // nw.InterfaceC5156f
    public InputStream getInputStream() throws IOException, MessagingException {
        InputStream contentStream;
        try {
            InterfaceC3667p interfaceC3667p = this.part;
            if (interfaceC3667p instanceof C3663l) {
                contentStream = ((C3663l) interfaceC3667p).getContentStream();
            } else {
                if (!(interfaceC3667p instanceof C3665n)) {
                    throw new MessagingException("Unknown part");
                }
                contentStream = ((C3665n) interfaceC3667p).getContentStream();
            }
            InterfaceC3667p interfaceC3667p2 = this.part;
            String strRestrictEncoding = C3663l.restrictEncoding(interfaceC3667p2, interfaceC3667p2.getEncoding());
            return strRestrictEncoding != null ? AbstractC3670s.m8238b(contentStream, strRestrictEncoding) : contentStream;
        } catch (FolderClosedException e2) {
            throw new FolderClosedIOException(e2.f19277a, e2.getMessage());
        } catch (MessagingException e10) {
            IOException iOException = new IOException(e10.getMessage());
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public synchronized C3683o getMessageContext() {
        try {
            if (this.context == null) {
                InterfaceC3667p interfaceC3667p = this.part;
                C3683o c3683o = new C3683o();
                c3683o.f19411a = interfaceC3667p;
                this.context = c3683o;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.context;
    }

    @Override // nw.InterfaceC5156f
    public String getName() {
        try {
            InterfaceC3667p interfaceC3667p = this.part;
            return interfaceC3667p instanceof C3663l ? ((C3663l) interfaceC3667p).getFileName() : "";
        } catch (MessagingException unused) {
            return "";
        }
    }

    public OutputStream getOutputStream() throws UnknownServiceException {
        throw new UnknownServiceException("Writing not supported");
    }
}
