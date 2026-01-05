package com.sun.mail.util;

import jakarta.mail.util.C3691b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SharedByteArrayOutputStream extends ByteArrayOutputStream {
    public SharedByteArrayOutputStream(int i10) {
        super(i10);
    }

    public InputStream toStream() {
        return new C3691b(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
    }
}
