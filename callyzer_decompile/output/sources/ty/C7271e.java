package ty;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.sftp.SFTPException;
import ny.C5189c;
import ry.C6686b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.e */
/* loaded from: classes3.dex */
public final class C7271e extends Thread {

    /* renamed from: a */
    public final InterfaceC2173b f34712a;

    /* renamed from: b */
    public final C6686b f34713b;

    /* renamed from: c */
    public final ConcurrentHashMap f34714c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C7281o f34715d = new C7281o();

    /* renamed from: e */
    public final byte[] f34716e = new byte[4];

    /* renamed from: f */
    public final C7279m f34717f;

    public C7271e(C7279m c7279m) {
        this.f34717f = c7279m;
        c7279m.f34734a.getClass();
        this.f34712a = AbstractC2175d.m5852b(C7271e.class);
        this.f34713b = c7279m.f34738e.f33740q;
        setName("sshj-PacketReader");
        setDaemon(true);
    }

    /* renamed from: a */
    public final void m13580a() throws SFTPException {
        C7277k c7277k = new C7277k(this.f34715d, this.f34717f.f34742j);
        long j6 = c7277k.f34731g;
        C5189c c5189c = (C5189c) this.f34714c.remove(Long.valueOf(j6));
        this.f34712a.mo5849y(c7277k.f34730f, "Received {} packet");
        if (c5189c != null) {
            c5189c.m10147b(c7277k);
            return;
        }
        throw new SFTPException("Received [" + c7277k.m13605B() + "] response for request-id " + j6 + ", no such request was made");
    }

    /* renamed from: b */
    public final void m13581b(int i10, byte[] bArr) throws SFTPException {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = this.f34713b.read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i12 == -1) {
            throw new SFTPException("EOF while reading packet");
        }
    }

    /* renamed from: c */
    public final C7281o m13582c() throws SSHException {
        byte[] bArr = this.f34716e;
        m13581b(bArr.length, bArr);
        long j6 = ((bArr[0] << 24) & 4278190080L) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        if (j6 > 1073741824) {
            throw new SSHException(String.format("Indicated packet length %d too large", Long.valueOf(j6)));
        }
        int i10 = (int) j6;
        C7281o c7281o = this.f34715d;
        c7281o.f24776b = 0;
        c7281o.f24777c = 0;
        c7281o.m9909c(i10);
        m13581b(i10, c7281o.f24775a);
        c7281o.m9931z(i10);
        return c7281o;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted()) {
            try {
                m13582c();
                m13580a();
            } catch (IOException e2) {
                Iterator it = this.f34714c.values().iterator();
                while (it.hasNext()) {
                    ((C5189c) it.next()).m10148c(e2);
                }
                return;
            }
        }
    }
}
