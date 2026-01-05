package com.amazonaws.http;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class TLS12SocketFactory extends SSLSocketFactory {
    private final SSLSocketFactory delegate;
    private LoggingHandshakeCompletedListener handshakeCompletedListener;
    private static final Object contextLock = new Object();
    private static final String[] SUPPORTED_PROTOCOLS = {"TLSv1", "TLSv1.1", "TLSv1.2"};
    private static SSLContext sslContext = null;

    private TLS12SocketFactory(SSLContext sSLContext) {
        if (sSLContext != null) {
            this.delegate = sSLContext.getSocketFactory();
        } else {
            synchronized (contextLock) {
                if (sslContext == null) {
                    SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                    sslContext = sSLContext2;
                    sSLContext2.init(null, null, null);
                }
            }
            this.delegate = sslContext.getSocketFactory();
        }
        this.handshakeCompletedListener = new LoggingHandshakeCompletedListener();
    }

    public static TLS12SocketFactory createTLS12SocketFactory(SSLContext sSLContext) {
        return null;
    }

    public static void fixTLSPre21(HttpsURLConnection httpsURLConnection, TLS12SocketFactory tLS12SocketFactory) {
    }

    private Socket updateTLSProtocols(Socket socket) {
        if (socket instanceof SSLSocket) {
            try {
                ((SSLSocket) socket).setEnabledProtocols(SUPPORTED_PROTOCOLS);
            } catch (Exception unused) {
            }
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket();
        sSLSocket.addHandshakeCompletedListener(this.handshakeCompletedListener);
        return updateTLSProtocols(sSLSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public static TLS12SocketFactory createTLS12SocketFactory() {
        return createTLS12SocketFactory(null);
    }

    public static void fixTLSPre21(HttpsURLConnection httpsURLConnection) {
        fixTLSPre21(httpsURLConnection, createTLS12SocketFactory());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(socket, str, i, z);
        sSLSocket.addHandshakeCompletedListener(this.handshakeCompletedListener);
        return updateTLSProtocols(sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i);
        sSLSocket.addHandshakeCompletedListener(this.handshakeCompletedListener);
        return updateTLSProtocols(sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i, inetAddress, i2);
        sSLSocket.addHandshakeCompletedListener(this.handshakeCompletedListener);
        return updateTLSProtocols(sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i);
        sSLSocket.addHandshakeCompletedListener(this.handshakeCompletedListener);
        return updateTLSProtocols(sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i, inetAddress2, i2);
        sSLSocket.addHandshakeCompletedListener(this.handshakeCompletedListener);
        return updateTLSProtocols(sSLSocket);
    }
}
