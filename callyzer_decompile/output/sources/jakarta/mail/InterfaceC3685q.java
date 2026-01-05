package jakarta.mail;

import java.io.InputStream;
import java.io.OutputStream;
import nw.C5154d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.q */
/* loaded from: classes3.dex */
public interface InterfaceC3685q {
    Object getContent();

    String getContentType();

    C5154d getDataHandler();

    String getFileName();

    String[] getHeader(String str);

    InputStream getInputStream();

    int getSize();

    boolean isMimeType(String str);

    void removeHeader(String str);

    void setContent(Object obj, String str);

    void setDataHandler(C5154d c5154d);

    void setFileName(String str);

    void setHeader(String str, String str2);

    void writeTo(OutputStream outputStream);
}
