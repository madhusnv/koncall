package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class LineOutputStream extends FilterOutputStream {
    private static byte[] newline = {13, 10};
    private boolean allowutf8;

    public LineOutputStream(OutputStream outputStream) {
        this(outputStream, false);
    }

    public void writeln(String str) throws IOException {
        ((FilterOutputStream) this).out.write(this.allowutf8 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str));
        ((FilterOutputStream) this).out.write(newline);
    }

    public LineOutputStream(OutputStream outputStream, boolean z6) {
        super(outputStream);
        this.allowutf8 = z6;
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(newline);
    }
}
