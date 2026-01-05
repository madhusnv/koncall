package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {
    private final EofSensorWatcher eofWatcher;
    private boolean selfClosed;
    protected InputStream wrappedStream;

    public EofSensorInputStream(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        Args.notNull(inputStream, "Wrapped stream");
        this.wrappedStream = inputStream;
        this.selfClosed = false;
        this.eofWatcher = eofSensorWatcher;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        this.selfClosed = true;
        checkAbort();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!isReadAllowed()) {
            return 0;
        }
        try {
            return this.wrappedStream.available();
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    public void checkAbort() {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null ? eofSensorWatcher.streamAbort(inputStream) : true) {
                    inputStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    public void checkClose() {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null ? eofSensorWatcher.streamClosed(inputStream) : true) {
                    inputStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    public void checkEOF(int i) {
        InputStream inputStream = this.wrappedStream;
        if (inputStream == null || i >= 0) {
            return;
        }
        try {
            EofSensorWatcher eofSensorWatcher = this.eofWatcher;
            if (eofSensorWatcher != null ? eofSensorWatcher.eofDetected(inputStream) : true) {
                inputStream.close();
            }
        } finally {
            this.wrappedStream = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.selfClosed = true;
        checkClose();
    }

    public InputStream getWrappedStream() {
        return this.wrappedStream;
    }

    public boolean isReadAllowed() throws IOException {
        if (this.selfClosed) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.wrappedStream != null;
    }

    public boolean isSelfClosed() {
        return this.selfClosed;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int i = this.wrappedStream.read();
            checkEOF(i);
            return i;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int i3 = this.wrappedStream.read(bArr, i, i2);
            checkEOF(i3);
            return i3;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
