package og;

import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum oc implements l0 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(NewHope.SENDB_BYTES),
    FORMAT_AZTEC(4096);

    private final int zzp;

    oc(int i10) {
        this.zzp = i10;
    }

    @Override // og.l0
    public final int zza() {
        return this.zzp;
    }
}
