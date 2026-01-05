package org.apache.http.impl.io;

import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        init(socket.getOutputStream(), i < 1024 ? 1024 : i, httpParams);
    }
}
