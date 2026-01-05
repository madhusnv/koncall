package com.sun.mail.handlers;

import com.amplifyframework.core.model.ModelIdentifier;
import jakarta.mail.AbstractC3635c;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.AbstractC3684p;
import jakarta.mail.C3683o;
import jakarta.mail.InterfaceC3685q;
import jakarta.mail.MessagingException;
import jakarta.mail.c0;
import jakarta.mail.internet.C3665n;
import jakarta.mail.internet.C3668q;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import nw.C5151a;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class message_rfc822 extends handler_base {
    private static C5151a[] ourDataFlavor = {new C5151a(AbstractC3682n.class, "message/rfc822")};

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public Object getContent(InterfaceC5156f interfaceC5156f) throws IOException {
        c0 c0VarM8177d;
        AbstractC3682n abstractC3682n;
        InterfaceC3685q interfaceC3685q;
        try {
            if (interfaceC5156f instanceof C3668q) {
                C3683o messageContext = ((C3668q) interfaceC5156f).getMessageContext();
                messageContext.getClass();
                c0VarM8177d = null;
                try {
                    InterfaceC3685q interfaceC3685q2 = messageContext.f19411a;
                    while (interfaceC3685q2 != null) {
                        if (interfaceC3685q2 instanceof AbstractC3682n) {
                            abstractC3682n = (AbstractC3682n) interfaceC3685q2;
                            break;
                        }
                        AbstractC3684p parent = ((AbstractC3635c) interfaceC3685q2).getParent();
                        if (parent == null) {
                            break;
                        }
                        synchronized (parent) {
                            interfaceC3685q = parent.f19414c;
                        }
                        interfaceC3685q2 = interfaceC3685q;
                    }
                } catch (MessagingException unused) {
                }
                abstractC3682n = null;
                if (abstractC3682n != null) {
                    c0VarM8177d = abstractC3682n.getSession();
                }
            } else {
                c0VarM8177d = c0.m8177d(new Properties());
            }
            return new C3665n(c0VarM8177d, interfaceC5156f.getInputStream());
        } catch (MessagingException e2) {
            IOException iOException = new IOException("Exception creating MimeMessage in message/rfc822 DataContentHandler");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public C5151a[] getDataFlavors() {
        return ourDataFlavor;
    }

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (obj instanceof AbstractC3682n) {
            try {
                ((AbstractC3682n) obj).writeTo(outputStream);
                return;
            } catch (MessagingException e2) {
                IOException iOException = new IOException("Exception writing message");
                iOException.initCause(e2);
                throw iOException;
            }
        }
        throw new IOException(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + getDataFlavors()[0].f25220a + "\" DataContentHandler requires Message object, was given object of type " + obj.getClass().toString() + "; obj.cl " + obj.getClass().getClassLoader() + ", Message.cl " + AbstractC3682n.class.getClassLoader());
    }
}
