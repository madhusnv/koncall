package p001o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes6.dex */
public final class eyf extends as0 {

    /* renamed from: o */
    public final Socket f22404o;

    public eyf(Socket socket) {
        sq8.m48649h(socket, "socket");
        this.f22404o = socket;
    }

    @Override // p001o.as0
    /* renamed from: B */
    public void mo17740B() throws IOException {
        try {
            this.f22404o.close();
        } catch (AssertionError e) {
            if (!uac.m51311d(e)) {
                throw e;
            }
            zac.f56855a.log(Level.WARNING, "Failed to close timed out socket " + this.f22404o, (Throwable) e);
        } catch (Exception e2) {
            zac.f56855a.log(Level.WARNING, "Failed to close timed out socket " + this.f22404o, (Throwable) e2);
        }
    }

    @Override // p001o.as0
    /* renamed from: x */
    public IOException mo17744x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
