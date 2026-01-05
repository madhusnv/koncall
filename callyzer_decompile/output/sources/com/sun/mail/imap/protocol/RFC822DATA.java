package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ByteArray;
import java.io.ByteArrayInputStream;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class RFC822DATA implements Item {
    static final char[] name = {Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'F', 'C', '8', '2', '2'};
    private final ByteArray data;
    private final boolean isHeader;
    private final int msgno;

    public RFC822DATA(FetchResponse fetchResponse) {
        this(fetchResponse, false);
    }

    public ByteArray getByteArray() {
        return this.data;
    }

    public ByteArrayInputStream getByteArrayInputStream() {
        ByteArray byteArray = this.data;
        if (byteArray != null) {
            return byteArray.toByteArrayInputStream();
        }
        return null;
    }

    public boolean isHeader() {
        return this.isHeader;
    }

    public RFC822DATA(FetchResponse fetchResponse, boolean z6) {
        this.isHeader = z6;
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        this.data = fetchResponse.readByteArray();
    }
}
