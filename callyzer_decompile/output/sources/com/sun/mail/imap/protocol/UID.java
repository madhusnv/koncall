package com.sun.mail.imap.protocol;

import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class UID implements Item {
    static final char[] name = {Matrix.MATRIX_TYPE_RANDOM_UT, 'I', 'D'};
    public int seqnum;
    public long uid;

    public UID(FetchResponse fetchResponse) {
        this.seqnum = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        this.uid = fetchResponse.readLong();
    }
}
