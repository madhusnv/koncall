package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
public class DefaultClientConnection extends SocketHttpClientConnection implements OperatedClientConnection, ManagedHttpClientConnection, HttpContext {
    private final Map<String, Object> attributes;
    private boolean connSecure;
    private final sia headerLog;
    private final sia log;
    private volatile boolean shutdown;
    private volatile Socket socket;
    private HttpHost targetHost;
    private final sia wireLog;

    public DefaultClientConnection() throws IOException {
        eja.m25143k(getClass());
        eja.m25144l("org.apache.http.headers");
        eja.m25144l("org.apache.http.wire");
        this.attributes = new HashMap();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        bind(socket, new BasicHttpParams());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        try {
            super.close();
            throw null;
        } catch (IOException unused) {
            throw null;
        }
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection
    public HttpMessageParser<HttpResponse> createResponseParser(SessionInputBuffer sessionInputBuffer, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        return new DefaultHttpResponseParser(sessionInputBuffer, (LineParser) null, httpResponseFactory, httpParams);
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection
    public SessionInputBuffer createSessionInputBuffer(Socket socket, int i, HttpParams httpParams) {
        if (i <= 0) {
            i = 8192;
        }
        super.createSessionInputBuffer(socket, i, httpParams);
        throw null;
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection
    public SessionOutputBuffer createSessionOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        if (i <= 0) {
            i = 8192;
        }
        super.createSessionOutputBuffer(socket, i, httpParams);
        throw null;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return null;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        if (this.socket instanceof SSLSocket) {
            return ((SSLSocket) this.socket).getSession();
        }
        return null;
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.conn.OperatedClientConnection, org.apache.http.conn.ManagedHttpClientConnection
    public final Socket getSocket() {
        return this.socket;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public final boolean isSecure() {
        return this.connSecure;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void openCompleted(boolean z, HttpParams httpParams) {
        Args.notNull(httpParams, "Parameters");
        assertNotOpen();
        this.connSecure = z;
        bind(this.socket, httpParams);
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void opening(Socket socket, HttpHost httpHost) throws IOException {
        assertNotOpen();
        this.socket = socket;
        this.targetHost = httpHost;
        if (this.shutdown) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection, org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        super.receiveResponseHeader();
        throw null;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.attributes.remove(str);
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection, org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        throw null;
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        this.attributes.put(str, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.HttpConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void shutdown() {
        this.shutdown = true;
        try {
            super.shutdown();
            throw null;
        } catch (IOException unused) {
            throw null;
        }
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void update(Socket socket, HttpHost httpHost, boolean z, HttpParams httpParams) {
        assertOpen();
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpParams, "Parameters");
        if (socket != null) {
            this.socket = socket;
            bind(socket, httpParams);
        }
        this.targetHost = httpHost;
        this.connSecure = z;
    }
}
