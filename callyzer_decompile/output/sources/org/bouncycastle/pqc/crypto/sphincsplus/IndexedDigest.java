package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes3.dex */
class IndexedDigest {
    final byte[] digest;
    final int idx_leaf;
    final long idx_tree;

    public IndexedDigest(long j6, int i10, byte[] bArr) {
        this.idx_tree = j6;
        this.idx_leaf = i10;
        this.digest = bArr;
    }
}
