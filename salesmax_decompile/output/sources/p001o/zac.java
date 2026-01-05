package p001o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class zac {

    /* renamed from: a */
    public static final Logger f56855a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final boolean m59085b(AssertionError assertionError) {
        sq8.m48649h(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? f9g.m26306P(message, "getsockname failed", false, 2, null) : false;
    }

    /* renamed from: c */
    public static final dvf m59086c(File file, boolean z) {
        sq8.m48649h(file, "<this>");
        return uac.m51313f(new FileOutputStream(file, z));
    }

    /* renamed from: d */
    public static final dvf m59087d(OutputStream outputStream) {
        sq8.m48649h(outputStream, "<this>");
        return new mgc(outputStream, new nmh());
    }

    /* renamed from: e */
    public static final dvf m59088e(Socket socket) throws IOException {
        sq8.m48649h(socket, "<this>");
        eyf eyfVar = new eyf(socket);
        OutputStream outputStream = socket.getOutputStream();
        sq8.m48648g(outputStream, "getOutputStream(...)");
        return eyfVar.m17746z(new mgc(outputStream, eyfVar));
    }

    /* renamed from: f */
    public static final lzf m59089f(File file) {
        sq8.m48649h(file, "<this>");
        return new qj8(new FileInputStream(file), nmh.f37049e);
    }

    /* renamed from: g */
    public static final lzf m59090g(InputStream inputStream) {
        sq8.m48649h(inputStream, "<this>");
        return new qj8(inputStream, new nmh());
    }

    /* renamed from: h */
    public static final lzf m59091h(Socket socket) throws IOException {
        sq8.m48649h(socket, "<this>");
        eyf eyfVar = new eyf(socket);
        InputStream inputStream = socket.getInputStream();
        sq8.m48648g(inputStream, "getInputStream(...)");
        return eyfVar.m17739A(new qj8(inputStream, eyfVar));
    }
}
