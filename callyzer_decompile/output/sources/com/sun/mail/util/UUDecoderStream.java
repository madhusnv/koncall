package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.BERTags;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class UUDecoderStream extends FilterInputStream {
    private byte[] buffer;
    private int bufsize;
    private boolean gotEnd;
    private boolean gotPrefix;
    private boolean ignoreErrors;
    private boolean ignoreMissingBeginEnd;
    private int index;
    private LineInputStream lin;
    private int mode;
    private String name;
    private String readAhead;

    public UUDecoderStream(InputStream inputStream) {
        super(inputStream);
        this.buffer = new byte[45];
        this.bufsize = 0;
        this.index = 0;
        this.gotPrefix = false;
        this.gotEnd = false;
        this.lin = new LineInputStream(inputStream);
        this.ignoreErrors = PropUtil.getBooleanSystemProperty("mail.mime.uudecode.ignoreerrors", false);
        this.ignoreMissingBeginEnd = PropUtil.getBooleanSystemProperty("mail.mime.uudecode.ignoremissingbeginend", false);
    }

    private boolean decode() throws IOException {
        if (this.gotEnd) {
            return false;
        }
        this.bufsize = 0;
        while (true) {
            String line = this.readAhead;
            if (line != null) {
                this.readAhead = null;
            } else {
                line = this.lin.readLine();
            }
            if (line == null) {
                if (!this.ignoreMissingBeginEnd) {
                    throw new DecodingException("UUDecoder: Missing end at EOF");
                }
                this.gotEnd = true;
                return false;
            }
            if (line.equals("end")) {
                this.gotEnd = true;
                return false;
            }
            if (line.length() != 0) {
                char cCharAt = line.charAt(0);
                if (cCharAt >= ' ') {
                    int i10 = (cCharAt - ' ') & 63;
                    if (i10 == 0) {
                        String line2 = this.lin.readLine();
                        if ((line2 == null || !line2.equals("end")) && !this.ignoreMissingBeginEnd) {
                            throw new DecodingException("UUDecoder: Missing End after count 0 line");
                        }
                        this.gotEnd = true;
                        return false;
                    }
                    if (line.length() >= (((i10 * 8) + 5) / 6) + 1) {
                        int i11 = 1;
                        while (this.bufsize < i10) {
                            byte bCharAt = (byte) ((line.charAt(i11) - ' ') & 63);
                            int i12 = i11 + 2;
                            byte bCharAt2 = (byte) ((line.charAt(i11 + 1) - ' ') & 63);
                            byte[] bArr = this.buffer;
                            int i13 = this.bufsize;
                            int i14 = i13 + 1;
                            this.bufsize = i14;
                            bArr[i13] = (byte) (((bCharAt << 2) & 252) | ((bCharAt2 >>> 4) & 3));
                            if (i14 < i10) {
                                i11 += 3;
                                byte bCharAt3 = (byte) ((line.charAt(i12) - ' ') & 63);
                                byte[] bArr2 = this.buffer;
                                int i15 = this.bufsize;
                                this.bufsize = i15 + 1;
                                bArr2[i15] = (byte) (((bCharAt2 << 4) & 240) | ((bCharAt3 >>> 2) & 15));
                                bCharAt2 = bCharAt3;
                            } else {
                                i11 = i12;
                            }
                            if (this.bufsize < i10) {
                                int i16 = i11 + 1;
                                byte bCharAt4 = (byte) ((line.charAt(i11) - ' ') & 63);
                                byte[] bArr3 = this.buffer;
                                int i17 = this.bufsize;
                                this.bufsize = i17 + 1;
                                bArr3[i17] = (byte) ((bCharAt4 & 63) | ((bCharAt2 << 6) & BERTags.PRIVATE));
                                i11 = i16;
                            }
                        }
                        return true;
                    }
                    if (!this.ignoreErrors) {
                        throw new DecodingException("UUDecoder: Short buffer error");
                    }
                } else if (!this.ignoreErrors) {
                    throw new DecodingException("UUDecoder: Buffer format error");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        r8.readAhead = r1;
        r8.gotPrefix = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readPrefix() throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.gotPrefix
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 438(0x1b6, float:6.14E-43)
            r8.mode = r0
            java.lang.String r0 = "encoder.buf"
            r8.name = r0
        Ld:
            com.sun.mail.util.LineInputStream r0 = r8.lin
            java.lang.String r1 = r0.readLine()
            r7 = 1
            if (r1 != 0) goto L27
            boolean r0 = r8.ignoreMissingBeginEnd
            if (r0 == 0) goto L1f
            r8.gotPrefix = r7
            r8.gotEnd = r7
            return
        L1f:
            com.sun.mail.util.DecodingException r0 = new com.sun.mail.util.DecodingException
            java.lang.String r1 = "UUDecoder: Missing begin"
            r0.<init>(r1)
            throw r0
        L27:
            r5 = 0
            r6 = 5
            r2 = 0
            r3 = 0
            java.lang.String r4 = "begin"
            boolean r0 = r1.regionMatches(r2, r3, r4, r5, r6)
            r2 = 6
            if (r0 == 0) goto L80
            r0 = 9
            java.lang.String r0 = r1.substring(r2, r0)     // Catch: java.lang.NumberFormatException -> L41
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L41
            r8.mode = r0     // Catch: java.lang.NumberFormatException -> L41
            goto L46
        L41:
            r0 = move-exception
            boolean r2 = r8.ignoreErrors
            if (r2 == 0) goto L68
        L46:
            int r0 = r1.length()
            r2 = 10
            if (r0 <= r2) goto L55
            java.lang.String r0 = r1.substring(r2)
            r8.name = r0
            goto L59
        L55:
            boolean r0 = r8.ignoreErrors
            if (r0 == 0) goto L5c
        L59:
            r8.gotPrefix = r7
            return
        L5c:
            com.sun.mail.util.DecodingException r0 = new com.sun.mail.util.DecodingException
            java.lang.String r2 = "UUDecoder: Missing name: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L68:
            com.sun.mail.util.DecodingException r1 = new com.sun.mail.util.DecodingException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UUDecoder: Error in mode: "
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L80:
            boolean r0 = r8.ignoreMissingBeginEnd
            if (r0 == 0) goto Ld
            int r0 = r1.length()
            if (r0 == 0) goto Ld
            r0 = 0
            char r0 = r1.charAt(r0)
            int r0 = r0 + (-32)
            r0 = r0 & 63
            int r0 = r0 * 8
            int r0 = r0 + 5
            int r0 = r0 / r2
            if (r0 == 0) goto La2
            int r2 = r1.length()
            int r0 = r0 + 1
            if (r2 < r0) goto Ld
        La2:
            r8.readAhead = r1
            r8.gotPrefix = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.UUDecoderStream.readPrefix():void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return (this.bufsize - this.index) + ((((FilterInputStream) this).in.available() * 3) / 4);
    }

    public int getMode() throws IOException {
        readPrefix();
        return this.mode;
    }

    public String getName() throws IOException {
        readPrefix();
        return this.name;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.index >= this.bufsize) {
            readPrefix();
            if (!decode()) {
                return -1;
            }
            this.index = 0;
        }
        byte[] bArr = this.buffer;
        int i10 = this.index;
        this.index = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = read();
            if (i13 != -1) {
                bArr[i10 + i12] = (byte) i13;
                i12++;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    public UUDecoderStream(InputStream inputStream, boolean z6, boolean z10) {
        super(inputStream);
        this.buffer = new byte[45];
        this.bufsize = 0;
        this.index = 0;
        this.gotPrefix = false;
        this.gotEnd = false;
        this.lin = new LineInputStream(inputStream);
        this.ignoreErrors = z6;
        this.ignoreMissingBeginEnd = z10;
    }
}
