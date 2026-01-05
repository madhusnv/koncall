package p001o;

import p001o.uth;

/* loaded from: classes2.dex */
public final class nth {

    /* renamed from: a */
    public final boolean f37299a;

    /* renamed from: b */
    public final String f37300b;

    /* renamed from: c */
    public final uth.C17452a f37301c;

    /* renamed from: d */
    public final int f37302d;

    /* renamed from: e */
    public final byte[] f37303e;

    public nth(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        op0.m42511a((bArr2 == null) ^ (i == 0));
        this.f37299a = z;
        this.f37300b = str;
        this.f37302d = i;
        this.f37303e = bArr2;
        this.f37301c = new uth.C17452a(m41148a(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    public static int m41148a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            default:
                ria.m46824h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
