package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class DilithiumParameters {
    public static final DilithiumParameters dilithium2 = new DilithiumParameters("dilithium2", 2, false);
    public static final DilithiumParameters dilithium3 = new DilithiumParameters("dilithium3", 3, false);
    public static final DilithiumParameters dilithium5 = new DilithiumParameters("dilithium5", 5, false);

    /* renamed from: k */
    private final int f28007k;
    private final String name;
    private final boolean usingAES;

    private DilithiumParameters(String str, int i10, boolean z6) {
        this.name = str;
        this.f28007k = i10;
        this.usingAES = z6;
    }

    public DilithiumEngine getEngine(SecureRandom secureRandom) {
        return new DilithiumEngine(this.f28007k, secureRandom, this.usingAES);
    }

    public String getName() {
        return this.name;
    }
}
