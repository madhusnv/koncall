package c00;

import b00.C0521f;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.g */
/* loaded from: classes3.dex */
public final class C0840g extends C0521f {

    /* renamed from: m */
    public final Socket f5313m;

    public C0840g(Socket socket) {
        AbstractC4154l.m8923f(socket, "socket");
        this.f5313m = socket;
    }

    @Override // b00.C0521f
    /* renamed from: j */
    public final void mo1558j() throws IOException {
        Socket socket = this.f5313m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!AbstractC0844k.m2262a(e2)) {
                throw e2;
            }
            AbstractC0844k.f5345a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e10) {
            AbstractC0844k.f5345a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }

    /* renamed from: k */
    public final IOException m2261k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
