package vy;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5036p;
import net.schmizz.sshj.transport.TransportException;
import qy.C6382c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vy.g */
/* loaded from: classes3.dex */
public final class C7830g extends Thread {

    /* renamed from: a */
    public final /* synthetic */ int f37562a = 1;

    /* renamed from: b */
    public final InterfaceC2173b f37563b;

    /* renamed from: c */
    public final InterfaceC5036p f37564c;

    public C7830g(C7833j c7833j) {
        this.f37564c = c7833j;
        ((C5033m) c7833j.f37569d.f17616h).getClass();
        this.f37563b = AbstractC2175d.m5852b(C7830g.class);
        setName("sshj-Reader");
        setDaemon(true);
    }

    /* renamed from: a */
    public void m14811a() {
        C7833j c7833j = ((C6382c) this.f37564c).f29508c;
        C5035o c5035o = new C5035o(EnumC5034n.IGNORE);
        byte[] bytes = "".getBytes(StandardCharsets.UTF_8);
        c5035o.m9912g(bytes.length, bytes);
        c7833j.m14819i(c5035o);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        int i10;
        switch (this.f37562a) {
            case 0:
                C7833j c7833j = (C7833j) this.f37564c;
                try {
                    C7825b c7825b = c7833j.f37573h;
                    InputStream inputStream = (InputStream) c7833j.f37582s.f26305c;
                    c7825b.getClass();
                    byte[] bArr = new byte[262144];
                    int iM14804d = 1;
                    while (!isInterrupted()) {
                        try {
                            i10 = inputStream.read(bArr, 0, iM14804d);
                        } catch (SocketTimeoutException e2) {
                            if (isInterrupted()) {
                                throw e2;
                            }
                        }
                        if (i10 == -1) {
                            throw new TransportException("Broken transport; encountered EOF");
                        }
                        iM14804d = c7825b.m14804d(i10, bArr);
                    }
                } catch (Exception e10) {
                    if (!isInterrupted()) {
                        c7833j.m14812a(e10);
                    }
                }
                this.f37563b.debug("Stopping");
                return;
            default:
                this.f37563b.mo5828d("{} Started with interval [{} seconds]", getClass().getSimpleName(), 0);
                while (!isInterrupted()) {
                    try {
                        synchronized (this) {
                        }
                        if (((C6382c) this.f37564c).f29508c.m14814c()) {
                            this.f37563b.mo5828d("{} Sending after interval [{} seconds]", getClass().getSimpleName(), 0);
                            m14811a();
                        }
                        TimeUnit.SECONDS.sleep(0);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f37563b.mo5831g(getClass().getSimpleName(), "{} Interrupted while sleeping");
                    } catch (Exception e11) {
                        if (!isInterrupted()) {
                            ((C6382c) this.f37564c).f29508c.m14812a(e11);
                        }
                    }
                }
                this.f37563b.mo5849y(getClass().getSimpleName(), "{} Stopped");
                return;
        }
    }

    public C7830g(C6382c c6382c, String str) {
        this.f37564c = c6382c;
        C5033m c5033m = (C5033m) c6382c.f29508c.f37569d.f17616h;
        Class<?> cls = getClass();
        c5033m.getClass();
        this.f37563b = AbstractC2175d.m5852b(cls);
        setName(str);
        setDaemon(true);
    }
}
