package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class QDecoderStream extends QPDecoderStream {
    public QDecoderStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.sun.mail.util.QPDecoderStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 == 95) {
            return 32;
        }
        if (i10 != 61) {
            return i10;
        }
        this.f43934ba[0] = (byte) ((FilterInputStream) this).in.read();
        this.f43934ba[1] = (byte) ((FilterInputStream) this).in.read();
        try {
            return ASCIIUtility.parseInt(this.f43934ba, 0, 2, 16);
        } catch (NumberFormatException e2) {
            throw new DecodingException("QDecoder: Error in QP stream " + e2.getMessage());
        }
    }
}
