package vy;

import az.C0505a;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import javax.crypto.ShortBufferException;
import mm.AbstractC4801l;
import net.schmizz.sshj.common.AbstractC5030j;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.transport.TransportException;
import wy.InterfaceC8228c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vy.b */
/* loaded from: classes3.dex */
public final class C7825b extends AbstractC7824a {

    /* renamed from: g */
    public final InterfaceC2173b f37538g;

    /* renamed from: h */
    public final C7833j f37539h;

    /* renamed from: i */
    public final C5035o f37540i = new C5035o();

    /* renamed from: j */
    public byte[] f37541j;

    /* renamed from: k */
    public int f37542k;

    /* renamed from: l */
    public int f37543l;

    public C7825b(C7833j c7833j) {
        new C5035o();
        this.f37542k = -1;
        this.f37543l = 8;
        this.f37539h = c7833j;
        ((C5033m) c7833j.f37569d.f17616h).getClass();
        this.f37538g = AbstractC2175d.m5852b(C7825b.class);
    }

    @Override // vy.AbstractC7824a
    /* renamed from: a */
    public final void mo14801a(InterfaceC8228c interfaceC8228c, C0505a c0505a) {
        super.mo14801a(interfaceC8228c, c0505a);
        if (c0505a != null) {
            this.f37541j = new byte[c0505a.f3560c];
        }
    }

    /* renamed from: b */
    public final void m14802b(byte[] bArr) throws IllegalStateException, TransportException, ShortBufferException {
        C0505a c0505a = this.f37533b;
        if (c0505a == null) {
            return;
        }
        c0505a.m1503c(this.f37535d);
        int i10 = 0;
        this.f37533b.f3563f.update(bArr, 0, this.f37542k + 4);
        this.f37533b.m1501a(0, this.f37541j);
        byte[] bArr2 = this.f37541j;
        int i11 = this.f37542k + 4;
        int i12 = this.f37533b.f3560c;
        if (bArr2.length >= i12 && bArr.length >= i11 + i12) {
            while (true) {
                int i13 = i12 - 1;
                if (i12 <= 0) {
                    return;
                }
                int i14 = i10 + 1;
                int i15 = i11 + 1;
                if (bArr2[i10] != bArr[i11]) {
                    break;
                }
                i10 = i14;
                i12 = i13;
                i11 = i15;
            }
        }
        throw new TransportException(EnumC5023c.MAC_ERROR, "MAC Error", null);
    }

    /* renamed from: c */
    public final void m14803c(int i10) throws TransportException {
        if (i10 < 5 || i10 > 262144) {
            C5035o c5035o = this.f37540i;
            this.f37538g.mo5843s(AbstractC5030j.m9940e(c5035o.f24776b, c5035o.m9907a(), c5035o.f24775a), "Error decoding packet (invalid length) {}");
            throw new TransportException(EnumC5023c.PROTOCOL_ERROR, AbstractC4801l.m9730d(i10, "invalid packet length: "), null);
        }
    }

    /* renamed from: d */
    public final int m14804d(int i10, byte[] bArr) throws IllegalStateException, SSHException, ShortBufferException {
        int iM9907a;
        int i11;
        C5035o c5035o = this.f37540i;
        c5035o.m9914i(0, i10, bArr);
        int i12 = this.f37543l;
        if (i12 <= i10) {
            while (true) {
                int i13 = this.f37542k;
                if (i13 != -1) {
                    if (this.f37537f) {
                        i11 = this.f37534c;
                    } else {
                        C0505a c0505a = this.f37533b;
                        i11 = c0505a != null ? c0505a.f3560c : 0;
                    }
                    iM9907a = (i13 + i11) - c5035o.m9907a();
                    if (iM9907a > 0) {
                        break;
                    }
                    this.f37535d = 4294967295L & (this.f37535d + 1);
                    if (this.f37537f) {
                        this.f37532a.update(c5035o.f24775a, 4, this.f37542k);
                    } else if (this.f37536e) {
                        m14802b(c5035o.f24775a);
                        this.f37532a.update(c5035o.f24775a, 4, this.f37542k);
                    } else {
                        int i14 = this.f37534c;
                        this.f37532a.update(c5035o.f24775a, i14, (this.f37542k + 4) - i14);
                        if (this.f37533b != null) {
                            m14802b(c5035o.f24775a);
                        }
                    }
                    c5035o.m9931z((this.f37542k + 4) - c5035o.m9924s());
                    InterfaceC2173b interfaceC2173b = this.f37538g;
                    if (interfaceC2173b.mo5836l()) {
                        interfaceC2173b.mo5830f("Received packet #{}: {}", Long.valueOf(this.f37535d), AbstractC5030j.m9940e(c5035o.f24776b, c5035o.m9907a(), c5035o.f24775a));
                    }
                    this.f37539h.mo5498h(EnumC5034n.fromByte(c5035o.m9924s()), c5035o);
                    c5035o.f24776b = 0;
                    c5035o.f24777c = 0;
                    this.f37542k = -1;
                } else {
                    iM9907a = this.f37534c - c5035o.m9907a();
                    if (iM9907a > 0) {
                        break;
                    }
                    if (this.f37537f) {
                        this.f37532a.mo14712e(4294967295L & (this.f37535d + 1));
                        this.f37532a.mo14710b(0, c5035o.f24775a);
                        try {
                            int iM9930y = (int) c5035o.m9930y();
                            m14803c(iM9930y);
                            this.f37542k = iM9930y;
                        } catch (Buffer$BufferException e2) {
                            throw new TransportException(e2);
                        }
                    } else if (this.f37536e) {
                        int iM9930y2 = (int) c5035o.m9930y();
                        this.f37542k = iM9930y2;
                        m14803c(iM9930y2);
                    } else {
                        this.f37532a.update(c5035o.f24775a, 0, this.f37534c);
                        try {
                            int iM9930y3 = (int) c5035o.m9930y();
                            m14803c(iM9930y3);
                            this.f37542k = iM9930y3;
                        } catch (Buffer$BufferException e10) {
                            throw new TransportException(e10);
                        }
                    }
                }
            }
            this.f37543l = iM9907a;
        } else {
            this.f37543l = i12 - i10;
        }
        return this.f37543l;
    }
}
