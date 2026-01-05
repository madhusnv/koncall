package com.sun.mail.handlers;

import a1.C0005d;
import com.amplifyframework.core.model.ModelIdentifier;
import jakarta.mail.internet.AbstractC3670s;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import nw.C5151a;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class text_plain extends handler_base {
    private static C5151a[] myDF = {new C5151a(String.class, "text/plain")};

    private String getCharset(String str) {
        try {
            String strM78w = new C0005d(str).m78w("charset");
            if (strM78w == null) {
                strM78w = "us-ascii";
            }
            return AbstractC3670s.m8249m(strM78w);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public Object getContent(InterfaceC5156f interfaceC5156f) throws IOException {
        String charset = null;
        try {
            charset = getCharset(interfaceC5156f.getContentType());
            InputStreamReader inputStreamReader = new InputStreamReader(interfaceC5156f.getInputStream(), charset);
            try {
                char[] cArr = new char[1024];
                int i10 = 0;
                while (true) {
                    int i11 = inputStreamReader.read(cArr, i10, cArr.length - i10);
                    if (i11 == -1) {
                        break;
                    }
                    i10 += i11;
                    if (i10 >= cArr.length) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length < 262144 ? length + length : length + 262144];
                        System.arraycopy(cArr, 0, cArr2, 0, i10);
                        cArr = cArr2;
                    }
                }
                String str = new String(cArr, 0, i10);
                try {
                    inputStreamReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (Throwable th2) {
                try {
                    inputStreamReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        } catch (IllegalArgumentException unused3) {
            throw new UnsupportedEncodingException(charset);
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public C5151a[] getDataFlavors() {
        return myDF;
    }

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        String charset;
        if (!(obj instanceof String)) {
            throw new IOException(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + getDataFlavors()[0].f25220a + "\" DataContentHandler requires String object, was given object of type " + obj.getClass().toString());
        }
        try {
            charset = getCharset(str);
        } catch (IllegalArgumentException unused) {
            charset = null;
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new NoCloseOutputStream(outputStream), charset);
            String str2 = (String) obj;
            outputStreamWriter.write(str2, 0, str2.length());
            outputStreamWriter.close();
        } catch (IllegalArgumentException unused2) {
            throw new UnsupportedEncodingException(charset);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class NoCloseOutputStream extends FilterOutputStream {
        public NoCloseOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
