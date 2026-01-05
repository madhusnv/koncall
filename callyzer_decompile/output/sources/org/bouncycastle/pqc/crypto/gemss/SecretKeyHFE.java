package org.bouncycastle.pqc.crypto.gemss;

/* loaded from: classes3.dex */
class SecretKeyHFE {
    public Pointer F_HFEv;
    complete_sparse_monic_gf2nx F_struct;

    /* renamed from: S */
    public Pointer f28042S;

    /* renamed from: T */
    public Pointer f28043T;
    public Pointer sk_uncomp;

    public static class complete_sparse_monic_gf2nx {

        /* renamed from: L */
        public int[] f28044L;
        public Pointer poly;
    }

    public SecretKeyHFE(GeMSSEngine geMSSEngine) {
        complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar = new complete_sparse_monic_gf2nx();
        this.F_struct = complete_sparse_monic_gf2nxVar;
        complete_sparse_monic_gf2nxVar.f28044L = new int[geMSSEngine.NB_COEFS_HFEPOLY];
    }
}
