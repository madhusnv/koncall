package org.apache.http.impl.io;

import java.net.Socket;
import java.net.SocketException;
import org.apache.http.io.EofSensor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {
    private boolean eof;
    private final Socket socket;

    public SocketInputBuffer(Socket socket, int i, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        this.socket = socket;
        this.eof = false;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        init(socket.getInputStream(), i < 1024 ? 1024 : i, httpParams);
    }

    @Override // org.apache.http.impl.io.AbstractSessionInputBuffer
    public int fillBuffer() {
        int iFillBuffer = super.fillBuffer();
        this.eof = iFillBuffer == -1;
        return iFillBuffer;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws SocketException {
        boolean zHasBufferedData = hasBufferedData();
        if (zHasBufferedData) {
            return zHasBufferedData;
        }
        int soTimeout = this.socket.getSoTimeout();
        try {
            this.socket.setSoTimeout(i);
            fillBuffer();
            return hasBufferedData();
        } finally {
            this.socket.setSoTimeout(soTimeout);
        }
    }

    @Override // org.apache.http.io.EofSensor
    public boolean isEof() {
        return this.eof;
    }
}
