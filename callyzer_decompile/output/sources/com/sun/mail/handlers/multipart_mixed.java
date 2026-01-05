package com.sun.mail.handlers;

import com.amplifyframework.core.model.ModelIdentifier;
import jakarta.mail.AbstractC3684p;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.C3666o;
import java.io.IOException;
import java.io.OutputStream;
import nw.C5151a;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class multipart_mixed extends handler_base {
    private static C5151a[] myDF = {new C5151a(AbstractC3684p.class, "multipart/mixed")};

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public Object getContent(InterfaceC5156f interfaceC5156f) throws IOException {
        try {
            return new C3666o(interfaceC5156f);
        } catch (MessagingException e2) {
            IOException iOException = new IOException("Exception while constructing MimeMultipart");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public C5151a[] getDataFlavors() {
        return myDF;
    }

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (obj instanceof AbstractC3684p) {
            try {
                ((AbstractC3684p) obj).mo8232b(outputStream);
                return;
            } catch (MessagingException e2) {
                IOException iOException = new IOException("Exception writing Multipart");
                iOException.initCause(e2);
                throw iOException;
            }
        }
        throw new IOException(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + getDataFlavors()[0].f25220a + "\" DataContentHandler requires Multipart object, was given object of type " + obj.getClass().toString() + "; obj.cl " + obj.getClass().getClassLoader() + ", Multipart.cl " + AbstractC3684p.class.getClassLoader());
    }
}
