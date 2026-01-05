package com.sun.mail.handlers;

import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.util.AbstractC1452a;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import nw.C5151a;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class image_gif extends handler_base {
    private static C5151a[] myDF = {new C5151a(Image.class, "image/gif")};

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public Object getContent(InterfaceC5156f interfaceC5156f) throws IOException {
        InputStream inputStream = interfaceC5156f.getInputStream();
        byte[] bArr = new byte[1024];
        int i10 = 0;
        while (true) {
            int i11 = inputStream.read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                return Toolkit.getDefaultToolkit().createImage(bArr, 0, i10);
            }
            i10 += i11;
            if (i10 >= bArr.length) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length < 262144 ? length + length : length + 262144];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                bArr = bArr2;
            }
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public C5151a[] getDataFlavors() {
        return myDF;
    }

    @Override // com.sun.mail.handlers.handler_base, nw.InterfaceC5153c
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (obj instanceof Image) {
            throw new IOException(AbstractC1452a.m4564k(new StringBuilder(), getDataFlavors()[0].f25220a, " encoding not supported"));
        }
        throw new IOException(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + getDataFlavors()[0].f25220a + "\" DataContentHandler requires Image object, was given object of type " + obj.getClass().toString());
    }
}
