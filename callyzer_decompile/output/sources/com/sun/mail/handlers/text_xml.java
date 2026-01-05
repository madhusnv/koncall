package com.sun.mail.handlers;

import a1.C0005d;
import jakarta.mail.internet.ParseException;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import nw.C5151a;
import nw.InterfaceC5156f;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class text_xml extends text_plain {
    private static final C5151a[] flavors = {new C5151a(String.class, "text/xml"), new C5151a(String.class, "application/xml"), new C5151a(StreamSource.class, "text/xml"), new C5151a(StreamSource.class, "application/xml")};

    private boolean isXmlType(String str) {
        try {
            C0005d c0005d = new C0005d(str);
            if (((String) c0005d.f25c).equals("xml")) {
                if (((String) c0005d.f24b).equals(TextBundle.TEXT_ENTRY)) {
                    return true;
                }
                if (((String) c0005d.f24b).equals("application")) {
                    return true;
                }
            }
        } catch (ParseException | RuntimeException unused) {
        }
        return false;
    }

    @Override // com.sun.mail.handlers.handler_base
    public Object getData(C5151a c5151a, InterfaceC5156f interfaceC5156f) {
        Class cls = c5151a.f25222c;
        if (cls == String.class) {
            return super.getContent(interfaceC5156f);
        }
        if (cls == StreamSource.class) {
            return new StreamSource(interfaceC5156f.getInputStream());
        }
        return null;
    }

    @Override // com.sun.mail.handlers.text_plain, com.sun.mail.handlers.handler_base
    public C5151a[] getDataFlavors() {
        return flavors;
    }

    @Override // com.sun.mail.handlers.text_plain, com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public void writeTo(Object obj, String str, OutputStream outputStream) throws TransformerException, IOException {
        if (!isXmlType(str)) {
            throw new IOException(AbstractC5601a.m11238i("Invalid content type \"", str, "\" for text/xml DCH"));
        }
        if (obj instanceof String) {
            super.writeTo(obj, str, outputStream);
            return;
        }
        if (!(obj instanceof InterfaceC5156f) && !(obj instanceof Source)) {
            throw new IOException("Invalid Object type = " + obj.getClass() + ". XmlDCH can only convert DataSource or Source to XML.");
        }
        try {
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            StreamResult streamResult = new StreamResult(outputStream);
            if (obj instanceof InterfaceC5156f) {
                transformerNewTransformer.transform(new StreamSource(((InterfaceC5156f) obj).getInputStream()), streamResult);
            } else {
                transformerNewTransformer.transform((Source) obj, streamResult);
            }
        } catch (RuntimeException e2) {
            IOException iOException = new IOException("Unable to run the JAXP transformer on a stream " + e2.getMessage());
            iOException.initCause(e2);
            throw iOException;
        } catch (TransformerException e10) {
            IOException iOException2 = new IOException("Unable to run the JAXP transformer on a stream " + e10.getMessage());
            iOException2.initCause(e10);
            throw iOException2;
        }
    }
}
