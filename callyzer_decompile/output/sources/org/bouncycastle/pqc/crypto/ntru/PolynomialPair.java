package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: classes3.dex */
class PolynomialPair {

    /* renamed from: a */
    private final Polynomial f28082a;

    /* renamed from: b */
    private final Polynomial f28083b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f28082a = polynomial;
        this.f28083b = polynomial2;
    }

    /* renamed from: f */
    public Polynomial m11258f() {
        return this.f28082a;
    }

    /* renamed from: g */
    public Polynomial m11259g() {
        return this.f28083b;
    }

    /* renamed from: m */
    public Polynomial m11260m() {
        return this.f28083b;
    }

    /* renamed from: r */
    public Polynomial m11261r() {
        return this.f28082a;
    }
}
