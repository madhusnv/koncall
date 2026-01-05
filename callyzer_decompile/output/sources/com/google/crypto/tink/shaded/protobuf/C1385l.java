package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.l */
/* loaded from: classes.dex */
public final class C1385l implements e1 {

    /* renamed from: a */
    public final C1383j f7066a;

    /* renamed from: b */
    public int f7067b;

    /* renamed from: c */
    public int f7068c;

    /* renamed from: d */
    public int f7069d = 0;

    public C1385l(C1383j c1383j) {
        Charset charset = g0.f7037a;
        this.f7066a = c1383j;
        c1383j.f7063c = this;
    }

    /* renamed from: R */
    public static void m4304R(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.m4153e();
        }
    }

    /* renamed from: S */
    public static void m4305S(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.m4153e();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: A */
    public final void mo4176A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4308O(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: B */
    public final void mo4177B(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4308O(list, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.crypto.tink.shaded.protobuf.C1381h mo4178C() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            r5 = this;
            r0 = 2
            r5.m4310Q(r0)
            com.google.crypto.tink.shaded.protobuf.j r0 = r5.f7066a
            byte[] r1 = r0.f7054d
            int r2 = r0.m4293i()
            if (r2 <= 0) goto L1f
            int r3 = r0.f7055e
            int r4 = r0.f7057g
            int r3 = r3 - r4
            if (r2 > r3) goto L1f
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.AbstractC1382i.m4277c(r4, r2, r1)
            int r3 = r0.f7057g
            int r3 = r3 + r2
            r0.f7057g = r3
            return r1
        L1f:
            if (r2 != 0) goto L24
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.AbstractC1382i.f7044b
            return r0
        L24:
            if (r2 <= 0) goto L35
            int r3 = r0.f7055e
            int r4 = r0.f7057g
            int r3 = r3 - r4
            if (r2 > r3) goto L35
            int r2 = r2 + r4
            r0.f7057g = r2
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r4, r2)
            goto L3b
        L35:
            if (r2 > 0) goto L48
            if (r2 != 0) goto L43
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.g0.f7038b
        L3b:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.AbstractC1382i.f7044b
            com.google.crypto.tink.shaded.protobuf.h r1 = new com.google.crypto.tink.shaded.protobuf.h
            r1.<init>(r0)
            return r1
        L43:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.m4152d()
            throw r0
        L48:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.m4154f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C1385l.mo4178C():com.google.crypto.tink.shaded.protobuf.h");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: D */
    public final void mo4179D(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof AbstractC1395v;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 2) {
                int iM4293i = c1383j.m4293i();
                m4304R(iM4293i);
                int iM4287c = c1383j.m4287c() + iM4293i;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(c1383j.m4291g())));
                } while (c1383j.m4287c() < iM4287c);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.m4150b();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(c1383j.m4291g())));
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l = c1383j.m4296l();
                }
            } while (iM4296l == this.f7067b);
            this.f7069d = iM4296l;
            return;
        }
        AbstractC1395v abstractC1395v = (AbstractC1395v) list;
        int i11 = this.f7067b & 7;
        if (i11 == 2) {
            int iM4293i2 = c1383j.m4293i();
            m4304R(iM4293i2);
            int iM4287c2 = c1383j.m4287c() + iM4293i2;
            do {
                abstractC1395v.m4456b(Float.intBitsToFloat(c1383j.m4291g()));
            } while (c1383j.m4287c() < iM4287c2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.m4150b();
        }
        do {
            abstractC1395v.m4456b(Float.intBitsToFloat(c1383j.m4291g()));
            if (c1383j.m4288d()) {
                return;
            } else {
                iM4296l2 = c1383j.m4296l();
            }
        } while (iM4296l2 == this.f7067b);
        this.f7069d = iM4296l2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: E */
    public final int mo4180E() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return this.f7066a.m4293i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: F */
    public final int mo4181F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(5);
        return this.f7066a.m4291g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: G */
    public final void mo4182G(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iM4296l;
        if ((this.f7067b & 7) != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        do {
            list.add(mo4178C());
            C1383j c1383j = this.f7066a;
            if (c1383j.m4288d()) {
                return;
            } else {
                iM4296l = c1383j.m4296l();
            }
        } while (iM4296l == this.f7067b);
        this.f7069d = iM4296l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: H */
    public final void mo4183H(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof AbstractC1388o;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(c1383j.m4292h())));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4293i = c1383j.m4293i();
            m4305S(iM4293i);
            int iM4287c = c1383j.m4287c() + iM4293i;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(c1383j.m4292h())));
            } while (c1383j.m4287c() < iM4287c);
            return;
        }
        AbstractC1388o abstractC1388o = (AbstractC1388o) list;
        int i11 = this.f7067b & 7;
        if (i11 == 1) {
            do {
                abstractC1388o.m4352b(Double.longBitsToDouble(c1383j.m4292h()));
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4293i2 = c1383j.m4293i();
        m4305S(iM4293i2);
        int iM4287c2 = c1383j.m4287c() + iM4293i2;
        do {
            abstractC1388o.m4352b(Double.longBitsToDouble(c1383j.m4292h()));
        } while (c1383j.m4287c() < iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: I */
    public final void mo4184I(List list, f1 f1Var, C1390q c1390q) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iM4296l;
        int i10 = this.f7067b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.m4150b();
        }
        do {
            list.add(m4306M(f1Var, c1390q));
            C1383j c1383j = this.f7066a;
            if (c1383j.m4288d() || this.f7069d != 0) {
                return;
            } else {
                iM4296l = c1383j.m4296l();
            }
        } while (iM4296l == i10);
        this.f7069d = iM4296l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: J */
    public final long mo4185J() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return this.f7066a.m4294j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: K */
    public final String mo4186K() throws InvalidProtocolBufferException {
        m4310Q(2);
        C1383j c1383j = this.f7066a;
        int iM4293i = c1383j.m4293i();
        if (iM4293i > 0) {
            int i10 = c1383j.f7055e;
            int i11 = c1383j.f7057g;
            if (iM4293i <= i10 - i11) {
                String strMo4394n = u1.f7121a.mo4394n(i11, iM4293i, c1383j.f7054d);
                c1383j.f7057g += iM4293i;
                return strMo4394n;
            }
        }
        if (iM4293i == 0) {
            return "";
        }
        if (iM4293i <= 0) {
            throw InvalidProtocolBufferException.m4152d();
        }
        throw InvalidProtocolBufferException.m4154f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: L */
    public final void mo4187L(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof n0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(c1383j.m4292h()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4293i = c1383j.m4293i();
            m4305S(iM4293i);
            int iM4287c = c1383j.m4287c() + iM4293i;
            do {
                list.add(Long.valueOf(c1383j.m4292h()));
            } while (c1383j.m4287c() < iM4287c);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 1) {
            do {
                n0Var.m4349b(c1383j.m4292h());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4293i2 = c1383j.m4293i();
        m4305S(iM4293i2);
        int iM4287c2 = c1383j.m4287c() + iM4293i2;
        do {
            n0Var.m4349b(c1383j.m4292h());
        } while (c1383j.m4287c() < iM4287c2);
    }

    /* renamed from: M */
    public final Object m4306M(f1 f1Var, C1390q c1390q) {
        int i10 = this.f7068c;
        this.f7068c = ((this.f7067b >>> 3) << 3) | 4;
        try {
            Object objMo4216c = f1Var.mo4216c();
            f1Var.mo4221h(objMo4216c, this, c1390q);
            f1Var.mo4214a(objMo4216c);
            if (this.f7067b == this.f7068c) {
                return objMo4216c;
            }
            throw InvalidProtocolBufferException.m4153e();
        } finally {
            this.f7068c = i10;
        }
    }

    /* renamed from: N */
    public final Object m4307N(f1 f1Var, C1390q c1390q) throws InvalidProtocolBufferException {
        C1383j c1383j = this.f7066a;
        int iM4293i = c1383j.m4293i();
        if (c1383j.f7061a >= c1383j.f7062b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM4289e = c1383j.m4289e(iM4293i);
        Object objMo4216c = f1Var.mo4216c();
        c1383j.f7061a++;
        f1Var.mo4221h(objMo4216c, this, c1390q);
        f1Var.mo4214a(objMo4216c);
        if (c1383j.f7059i != 0) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c1383j.f7061a--;
        c1383j.f7060j = iM4289e;
        c1383j.m4297m();
        return objMo4216c;
    }

    /* renamed from: O */
    public final void m4308O(List list, boolean z6) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iM4296l;
        int iM4296l2;
        if ((this.f7067b & 7) != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        boolean z10 = list instanceof j0;
        C1383j c1383j = this.f7066a;
        if (!z10 || z6) {
            do {
                list.add(z6 ? mo4186K() : mo4212y());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l = c1383j.m4296l();
                }
            } while (iM4296l == this.f7067b);
            this.f7069d = iM4296l;
            return;
        }
        j0 j0Var = (j0) list;
        do {
            j0Var.mo4280l(mo4178C());
            if (c1383j.m4288d()) {
                return;
            } else {
                iM4296l2 = c1383j.m4296l();
            }
        } while (iM4296l2 == this.f7067b);
        this.f7069d = iM4296l2;
    }

    /* renamed from: P */
    public final void m4309P(int i10) throws InvalidProtocolBufferException {
        if (this.f7066a.m4287c() != i10) {
            throw InvalidProtocolBufferException.m4154f();
        }
    }

    /* renamed from: Q */
    public final void m4310Q(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f7067b & 7) != i10) {
            throw InvalidProtocolBufferException.m4150b();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: a */
    public final void mo4188a(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof b0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(AbstractC1384k.m4298a(c1383j.m4293i())));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Integer.valueOf(AbstractC1384k.m4298a(c1383j.m4293i())));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        b0 b0Var = (b0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                b0Var.m4168b(AbstractC1384k.m4298a(c1383j.m4293i()));
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            b0Var.m4168b(AbstractC1384k.m4298a(c1383j.m4293i()));
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: b */
    public final long mo4189b() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return this.f7066a.m4294j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: c */
    public final long mo4190c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(1);
        return this.f7066a.m4292h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: d */
    public final void mo4191d(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof b0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 2) {
                int iM4293i = c1383j.m4293i();
                m4304R(iM4293i);
                int iM4287c = c1383j.m4287c() + iM4293i;
                do {
                    list.add(Integer.valueOf(c1383j.m4291g()));
                } while (c1383j.m4287c() < iM4287c);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.m4150b();
            }
            do {
                list.add(Integer.valueOf(c1383j.m4291g()));
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l = c1383j.m4296l();
                }
            } while (iM4296l == this.f7067b);
            this.f7069d = iM4296l;
            return;
        }
        b0 b0Var = (b0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 2) {
            int iM4293i2 = c1383j.m4293i();
            m4304R(iM4293i2);
            int iM4287c2 = c1383j.m4287c() + iM4293i2;
            do {
                b0Var.m4168b(c1383j.m4291g());
            } while (c1383j.m4287c() < iM4287c2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.m4150b();
        }
        do {
            b0Var.m4168b(c1383j.m4291g());
            if (c1383j.m4288d()) {
                return;
            } else {
                iM4296l2 = c1383j.m4296l();
            }
        } while (iM4296l2 == this.f7067b);
        this.f7069d = iM4296l2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: e */
    public final void mo4192e(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof n0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(AbstractC1384k.m4299b(c1383j.m4294j())));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Long.valueOf(AbstractC1384k.m4299b(c1383j.m4294j())));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                n0Var.m4349b(AbstractC1384k.m4299b(c1383j.m4294j()));
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            n0Var.m4349b(AbstractC1384k.m4299b(c1383j.m4294j()));
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: f */
    public final void mo4193f(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof b0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(c1383j.m4293i()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Integer.valueOf(c1383j.m4293i()));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        b0 b0Var = (b0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                b0Var.m4168b(c1383j.m4293i());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            b0Var.m4168b(c1383j.m4293i());
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: g */
    public final void mo4194g(List list, f1 f1Var, C1390q c1390q) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iM4296l;
        int i10 = this.f7067b;
        if ((i10 & 7) != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        do {
            list.add(m4307N(f1Var, c1390q));
            C1383j c1383j = this.f7066a;
            if (c1383j.m4288d() || this.f7069d != 0) {
                return;
            } else {
                iM4296l = c1383j.m4296l();
            }
        } while (iM4296l == i10);
        this.f7069d = iM4296l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: h */
    public final int mo4195h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(5);
        return this.f7066a.m4291g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: i */
    public final boolean mo4196i() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return this.f7066a.m4290f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: j */
    public final long mo4197j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(1);
        return this.f7066a.m4292h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: k */
    public final void mo4198k(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof n0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(c1383j.m4294j()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Long.valueOf(c1383j.m4294j()));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                n0Var.m4349b(c1383j.m4294j());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            n0Var.m4349b(c1383j.m4294j());
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: l */
    public final int mo4199l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return this.f7066a.m4293i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: m */
    public final void mo4200m(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof n0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(c1383j.m4294j()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Long.valueOf(c1383j.m4294j()));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                n0Var.m4349b(c1383j.m4294j());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            n0Var.m4349b(c1383j.m4294j());
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: n */
    public final void mo4201n(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof n0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(c1383j.m4292h()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4293i = c1383j.m4293i();
            m4305S(iM4293i);
            int iM4287c = c1383j.m4287c() + iM4293i;
            do {
                list.add(Long.valueOf(c1383j.m4292h()));
            } while (c1383j.m4287c() < iM4287c);
            return;
        }
        n0 n0Var = (n0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 1) {
            do {
                n0Var.m4349b(c1383j.m4292h());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4293i2 = c1383j.m4293i();
        m4305S(iM4293i2);
        int iM4287c2 = c1383j.m4287c() + iM4293i2;
        do {
            n0Var.m4349b(c1383j.m4292h());
        } while (c1383j.m4287c() < iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: o */
    public final void mo4202o(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof b0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(c1383j.m4293i()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Integer.valueOf(c1383j.m4293i()));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        b0 b0Var = (b0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                b0Var.m4168b(c1383j.m4293i());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            b0Var.m4168b(c1383j.m4293i());
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: p */
    public final void mo4203p(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof b0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(c1383j.m4293i()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Integer.valueOf(c1383j.m4293i()));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        b0 b0Var = (b0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                b0Var.m4168b(c1383j.m4293i());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            b0Var.m4168b(c1383j.m4293i());
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: q */
    public final Object mo4204q(f1 f1Var, C1390q c1390q) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(3);
        return m4306M(f1Var, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: r */
    public final int mo4205r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return this.f7066a.m4293i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(1);
        return Double.longBitsToDouble(this.f7066a.m4292h());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(5);
        return Float.intBitsToFloat(this.f7066a.m4291g());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: s */
    public final Object mo4206s(f1 f1Var, C1390q c1390q) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(2);
        return m4307N(f1Var, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: t */
    public final int mo4207t() {
        return this.f7067b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: u */
    public final void mo4208u(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof b0;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 2) {
                int iM4293i = c1383j.m4293i();
                m4304R(iM4293i);
                int iM4287c = c1383j.m4287c() + iM4293i;
                do {
                    list.add(Integer.valueOf(c1383j.m4291g()));
                } while (c1383j.m4287c() < iM4287c);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.m4150b();
            }
            do {
                list.add(Integer.valueOf(c1383j.m4291g()));
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l = c1383j.m4296l();
                }
            } while (iM4296l == this.f7067b);
            this.f7069d = iM4296l;
            return;
        }
        b0 b0Var = (b0) list;
        int i11 = this.f7067b & 7;
        if (i11 == 2) {
            int iM4293i2 = c1383j.m4293i();
            m4304R(iM4293i2);
            int iM4287c2 = c1383j.m4287c() + iM4293i2;
            do {
                b0Var.m4168b(c1383j.m4291g());
            } while (c1383j.m4287c() < iM4287c2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.m4150b();
        }
        do {
            b0Var.m4168b(c1383j.m4291g());
            if (c1383j.m4288d()) {
                return;
            } else {
                iM4296l2 = c1383j.m4296l();
            }
        } while (iM4296l2 == this.f7067b);
        this.f7069d = iM4296l2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: v */
    public final int mo4209v() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return AbstractC1384k.m4298a(this.f7066a.m4293i());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: w */
    public final long mo4210w() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m4310Q(0);
        return AbstractC1384k.m4299b(this.f7066a.m4294j());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: x */
    public final void mo4211x(List list) throws InvalidProtocolBufferException {
        int iM4296l;
        int iM4296l2;
        boolean z6 = list instanceof AbstractC1378e;
        C1383j c1383j = this.f7066a;
        if (!z6) {
            int i10 = this.f7067b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(c1383j.m4290f()));
                    if (c1383j.m4288d()) {
                        return;
                    } else {
                        iM4296l = c1383j.m4296l();
                    }
                } while (iM4296l == this.f7067b);
                this.f7069d = iM4296l;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m4150b();
            }
            int iM4287c = c1383j.m4287c() + c1383j.m4293i();
            do {
                list.add(Boolean.valueOf(c1383j.m4290f()));
            } while (c1383j.m4287c() < iM4287c);
            m4309P(iM4287c);
            return;
        }
        AbstractC1378e abstractC1378e = (AbstractC1378e) list;
        int i11 = this.f7067b & 7;
        if (i11 == 0) {
            do {
                abstractC1378e.m4174b(c1383j.m4290f());
                if (c1383j.m4288d()) {
                    return;
                } else {
                    iM4296l2 = c1383j.m4296l();
                }
            } while (iM4296l2 == this.f7067b);
            this.f7069d = iM4296l2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m4150b();
        }
        int iM4287c2 = c1383j.m4287c() + c1383j.m4293i();
        do {
            abstractC1378e.m4174b(c1383j.m4290f());
        } while (c1383j.m4287c() < iM4287c2);
        m4309P(iM4287c2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: y */
    public final String mo4212y() throws InvalidProtocolBufferException {
        m4310Q(2);
        C1383j c1383j = this.f7066a;
        int iM4293i = c1383j.m4293i();
        if (iM4293i > 0) {
            int i10 = c1383j.f7055e;
            int i11 = c1383j.f7057g;
            if (iM4293i <= i10 - i11) {
                String str = new String(c1383j.f7054d, i11, iM4293i, g0.f7037a);
                c1383j.f7057g += iM4293i;
                return str;
            }
        }
        if (iM4293i == 0) {
            return "";
        }
        if (iM4293i < 0) {
            throw InvalidProtocolBufferException.m4152d();
        }
        throw InvalidProtocolBufferException.m4154f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: z */
    public final int mo4213z() {
        int i10 = this.f7069d;
        if (i10 != 0) {
            this.f7067b = i10;
            this.f7069d = 0;
        } else {
            this.f7067b = this.f7066a.m4296l();
        }
        int i11 = this.f7067b;
        if (i11 == 0 || i11 == this.f7068c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }
}
