package org.apache.http.impl.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriterFactory;
import p001o.sia;

/* loaded from: classes6.dex */
class LoggingManagedHttpClientConnection extends DefaultManagedHttpClientConnection {
    private final sia headerLog;
    private final sia log;
    private final Wire wire;

    public LoggingManagedHttpClientConnection(String str, sia siaVar, sia siaVar2, sia siaVar3, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(str, i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.wire = new Wire(siaVar3, str);
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (super.isOpen()) {
            throw null;
        }
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public InputStream getSocketInputStream(Socket socket) {
        InputStream socketInputStream = super.getSocketInputStream(socket);
        return this.wire.enabled() ? new LoggingInputStream(socketInputStream, this.wire) : socketInputStream;
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public OutputStream getSocketOutputStream(Socket socket) {
        OutputStream socketOutputStream = super.getSocketOutputStream(socket);
        return this.wire.enabled() ? new LoggingOutputStream(socketOutputStream, this.wire) : socketOutputStream;
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onRequestSubmitted(HttpRequest httpRequest) {
        if (httpRequest != null) {
            throw null;
        }
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onResponseReceived(HttpResponse httpResponse) {
        if (httpResponse != null) {
            throw null;
        }
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        throw null;
    }

    @Override // org.apache.http.impl.conn.DefaultManagedHttpClientConnection, org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void shutdown() {
        throw null;
    }
}
