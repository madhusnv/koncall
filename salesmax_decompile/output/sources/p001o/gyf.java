package p001o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/* loaded from: classes6.dex */
public abstract class gyf extends u6g {

    /* renamed from: c */
    public final Socket f25946c;

    /* renamed from: d */
    public final InetSocketAddress f25947d;

    /* renamed from: e */
    public final InetSocketAddress f25948e;

    public gyf(Socket socket) {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f25946c = socket;
        this.f25947d = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f25948e = (InetSocketAddress) socket.getRemoteSocketAddress();
    }

    @Override // p001o.y76
    /* renamed from: a */
    public Object mo29643a() {
        return this.f25946c;
    }

    @Override // p001o.y76
    /* renamed from: b */
    public String mo29644b() {
        InetSocketAddress inetSocketAddress = this.f25947d;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f25947d.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f25947d.getAddress().getCanonicalHostName();
    }

    @Override // p001o.y76
    public void close() throws IOException {
        this.f25946c.close();
        this.f48432a = null;
        this.f48433b = null;
    }

    @Override // p001o.y76
    /* renamed from: d */
    public String mo29645d() {
        InetSocketAddress inetSocketAddress = this.f25947d;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f25947d.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f25947d.getAddress().getHostAddress();
    }

    @Override // p001o.y76
    public int getLocalPort() {
        InetSocketAddress inetSocketAddress = this.f25947d;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // p001o.u6g, p001o.y76
    public boolean isOpen() {
        Socket socket;
        return (!super.isOpen() || (socket = this.f25946c) == null || socket.isClosed() || this.f25946c.isInputShutdown() || this.f25946c.isOutputShutdown()) ? false : true;
    }

    @Override // p001o.y76
    /* renamed from: k */
    public void mo29646k() throws IOException {
        if (this.f25946c.isClosed() || this.f25946c.isOutputShutdown()) {
            return;
        }
        this.f25946c.shutdownOutput();
    }
}
