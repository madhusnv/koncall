package vy;

import az.C0505a;
import bz.InterfaceC0804c;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.ShortBufferException;
import net.schmizz.sshj.common.AbstractC5030j;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import wy.InterfaceC8228c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vy.c */
/* loaded from: classes3.dex */
public final class C7826c extends AbstractC7824a {

    /* renamed from: g */
    public final InterfaceC2173b f37544g;

    /* renamed from: h */
    public final InterfaceC0804c f37545h;

    /* renamed from: i */
    public final ReentrantLock f37546i;

    public C7826c(InterfaceC0804c interfaceC0804c, ReentrantLock reentrantLock, C5033m c5033m) {
        this.f37545h = interfaceC0804c;
        this.f37546i = reentrantLock;
        c5033m.getClass();
        this.f37544g = AbstractC2175d.m5852b(C7826c.class);
    }

    @Override // vy.AbstractC7824a
    /* renamed from: a */
    public final void mo14801a(InterfaceC8228c interfaceC8228c, C0505a c0505a) {
        ReentrantLock reentrantLock = this.f37546i;
        reentrantLock.lock();
        try {
            super.mo14801a(interfaceC8228c, c0505a);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final long m14805b(C5035o c5035o) {
        InterfaceC2173b interfaceC2173b = this.f37544g;
        ReentrantLock reentrantLock = this.f37546i;
        reentrantLock.lock();
        try {
            if (interfaceC2173b.mo5836l()) {
                interfaceC2173b.mo5830f("Encoding packet #{}: {}", Long.valueOf(this.f37535d + 1), AbstractC5030j.m9940e(c5035o.f24776b, c5035o.m9907a(), c5035o.f24775a));
            }
            int iM9907a = c5035o.m9907a();
            int i10 = this.f37536e ? iM9907a + 1 : iM9907a + 5;
            int i11 = this.f37534c;
            int i12 = i11 - (i10 % i11);
            if (i12 < 4 || (this.f37537f && i12 < i11)) {
                i12 += i11;
            }
            int i13 = c5035o.f24776b;
            int i14 = i13 - 5;
            int i15 = iM9907a + 1;
            int i16 = i15 + i12;
            if (i16 < 16) {
                i12 += i11;
                i16 = i15 + i12;
            }
            if (this.f37537f && i16 % i11 != 0) {
                i12 += i11 - (i16 % i11);
                i16 = i15 + i12;
            }
            int i17 = i13 - 1;
            int i18 = i17 + i16;
            c5035o.m9931z(i14);
            c5035o.m9918m(i16);
            c5035o.m9911f((byte) i12);
            c5035o.m9931z(i18);
            this.f37545h.mo2134a(i18 - i12, i12, c5035o.f24775a);
            this.f37535d = 4294967295L & (this.f37535d + 1);
            if (this.f37537f) {
                c5035o.m9931z(c5035o.f24777c + this.f37534c);
                if (this.f37532a.mo14711d() == 0) {
                    throw new IllegalArgumentException("AEAD mode requires an AEAD cipher");
                }
                byte[] bArr = c5035o.f24775a;
                this.f37532a.mo14712e(this.f37535d);
                this.f37532a.mo15401c(i14, i16, bArr);
            } else if (this.f37536e) {
                this.f37532a.update(c5035o.f24775a, i17, i16);
                m14806c(c5035o, i14, i18);
            } else {
                if (this.f37533b != null) {
                    m14806c(c5035o, i14, i18);
                }
                this.f37532a.update(c5035o.f24775a, i14, i16 + 4);
            }
            c5035o.f24776b = i14;
            long j6 = this.f37535d;
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    public final void m14806c(C5035o c5035o, int i10, int i11) throws IllegalStateException, ShortBufferException {
        c5035o.m9931z(this.f37533b.f3560c + i11);
        this.f37533b.m1503c(this.f37535d);
        C0505a c0505a = this.f37533b;
        c0505a.f3563f.update(c5035o.f24775a, i10, i11);
        this.f37533b.m1501a(i11, c5035o.f24775a);
    }
}
