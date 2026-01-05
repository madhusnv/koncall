package org.bouncycastle.util.encoders;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface Encoder {
    int decode(String str, OutputStream outputStream);

    int decode(byte[] bArr, int i10, int i11, OutputStream outputStream);

    int encode(byte[] bArr, int i10, int i11, OutputStream outputStream);

    int getEncodedLength(int i10);

    int getMaxDecodedLength(int i10);
}
