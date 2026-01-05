package com.sun.mail.imap.protocol;

import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class RFC822SIZE implements Item {
    static final char[] name = {Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'F', 'C', '8', '2', '2', '.', 'S', 'I', Matrix.MATRIX_TYPE_ZERO, 'E'};
    public int msgno;
    public long size;

    public RFC822SIZE(FetchResponse fetchResponse) {
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        this.size = fetchResponse.readLong();
    }
}
