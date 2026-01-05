package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class LineInputStream extends FilterInputStream {
    private boolean allowutf8;
    private CharsetDecoder decoder;
    private byte[] lineBuffer;
    private static boolean defaultutf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);
    private static int MAX_INCR = 1048576;

    public LineInputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public String readLine() throws IOException {
        int i10;
        byte[] bArr = this.lineBuffer;
        if (bArr == null) {
            bArr = new byte[128];
            this.lineBuffer = bArr;
        }
        int length = bArr.length;
        int i11 = 0;
        while (true) {
            i10 = ((FilterInputStream) this).in.read();
            if (i10 == -1 || i10 == 10) {
                break;
            }
            boolean z6 = true;
            if (i10 == 13) {
                if (((FilterInputStream) this).in.markSupported()) {
                    ((FilterInputStream) this).in.mark(2);
                }
                int i12 = ((FilterInputStream) this).in.read();
                if (i12 == 13) {
                    i12 = ((FilterInputStream) this).in.read();
                } else {
                    z6 = false;
                }
                if (i12 != 10) {
                    if (((FilterInputStream) this).in.markSupported()) {
                        ((FilterInputStream) this).in.reset();
                    } else {
                        if (!(((FilterInputStream) this).in instanceof PushbackInputStream)) {
                            ((FilterInputStream) this).in = new PushbackInputStream(((FilterInputStream) this).in, 2);
                        }
                        if (i12 != -1) {
                            ((PushbackInputStream) ((FilterInputStream) this).in).unread(i12);
                        }
                        if (z6) {
                            ((PushbackInputStream) ((FilterInputStream) this).in).unread(13);
                        }
                    }
                }
            } else {
                length--;
                if (length < 0) {
                    int length2 = bArr.length;
                    int i13 = MAX_INCR;
                    bArr = length2 < i13 ? new byte[bArr.length * 2] : new byte[bArr.length + i13];
                    length = (bArr.length - i11) - 1;
                    System.arraycopy(this.lineBuffer, 0, bArr, 0, i11);
                    this.lineBuffer = bArr;
                }
                bArr[i11] = (byte) i10;
                i11++;
            }
        }
        if (i10 == -1 && i11 == 0) {
            return null;
        }
        if (this.allowutf8) {
            return new String(bArr, 0, i11, StandardCharsets.UTF_8);
        }
        if (defaultutf8) {
            try {
                return this.decoder.decode(ByteBuffer.wrap(bArr, 0, i11)).toString();
            } catch (CharacterCodingException unused) {
            }
        }
        return new String(bArr, 0, 0, i11);
    }

    public LineInputStream(InputStream inputStream, boolean z6) {
        super(inputStream);
        this.lineBuffer = null;
        this.allowutf8 = z6;
        if (z6 || !defaultutf8) {
            return;
        }
        CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
        this.decoder = charsetDecoderNewDecoder;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        charsetDecoderNewDecoder.onMalformedInput(codingErrorAction);
        this.decoder.onUnmappableCharacter(codingErrorAction);
    }
}
