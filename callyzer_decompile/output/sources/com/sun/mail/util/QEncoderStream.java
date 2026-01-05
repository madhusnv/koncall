package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class QEncoderStream extends QPEncoderStream {
    private static String TEXT_SPECIALS = "=_?";
    private static String WORD_SPECIALS = "=_?\"#$%&'(),.:;<>@[\\]^`{|}~";
    private String specials;

    public QEncoderStream(OutputStream outputStream, boolean z6) {
        super(outputStream, Integer.MAX_VALUE);
        this.specials = z6 ? WORD_SPECIALS : TEXT_SPECIALS;
    }

    public static int encodedLength(byte[] bArr, boolean z6) {
        String str = z6 ? WORD_SPECIALS : TEXT_SPECIALS;
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & 255;
            i10 = (i11 < 32 || i11 >= 127 || str.indexOf(i11) >= 0) ? i10 + 3 : i10 + 1;
        }
        return i10;
    }

    @Override // com.sun.mail.util.QPEncoderStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = i10 & 255;
        if (i11 == 32) {
            output(95, false);
        } else if (i11 < 32 || i11 >= 127 || this.specials.indexOf(i11) >= 0) {
            output(i11, true);
        } else {
            output(i11, false);
        }
    }
}
