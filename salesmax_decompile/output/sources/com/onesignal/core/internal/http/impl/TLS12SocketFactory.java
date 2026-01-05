package com.onesignal.core.internal.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class TLS12SocketFactory extends SSLSocketFactory {
    private SSLSocketFactory sslSocketFactory;

    public TLS12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        sq8.m48649h(sSLSocketFactory, "sslSocketFactory");
        this.sslSocketFactory = sSLSocketFactory;
    }

    private final Socket enableTLS(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.sslSocketFactory.createSocket();
        sq8.m48648g(socketCreateSocket, "sslSocketFactory.createSocket()");
        return enableTLS(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.sslSocketFactory.getDefaultCipherSuites();
        sq8.m48648g(defaultCipherSuites, "sslSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.sslSocketFactory.getSupportedCipherSuites();
        sq8.m48648g(supportedCipherSuites, "sslSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    public final void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        sq8.m48649h(sSLSocketFactory, "<set-?>");
        this.sslSocketFactory = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        sq8.m48649h(socket, "s");
        sq8.m48649h(str, "host");
        Socket socketCreateSocket = this.sslSocketFactory.createSocket(socket, str, i, z);
        sq8.m48648g(socketCreateSocket, "sslSocketFactory.createS…s, host, port, autoClose)");
        return enableTLS(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        sq8.m48649h(str, "host");
        Socket socketCreateSocket = this.sslSocketFactory.createSocket(str, i);
        sq8.m48648g(socketCreateSocket, "sslSocketFactory.createSocket(host, port)");
        return enableTLS(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        sq8.m48649h(str, "host");
        sq8.m48649h(inetAddress, "localHost");
        Socket socketCreateSocket = this.sslSocketFactory.createSocket(str, i, inetAddress, i2);
        sq8.m48648g(socketCreateSocket, "sslSocketFactory.createS…rt, localHost, localPort)");
        return enableTLS(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        sq8.m48649h(inetAddress, "host");
        Socket socketCreateSocket = this.sslSocketFactory.createSocket(inetAddress, i);
        sq8.m48648g(socketCreateSocket, "sslSocketFactory.createSocket(host, port)");
        return enableTLS(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        sq8.m48649h(inetAddress, "address");
        sq8.m48649h(inetAddress2, "localAddress");
        Socket socketCreateSocket = this.sslSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        sq8.m48648g(socketCreateSocket, "sslSocketFactory.createS… localAddress, localPort)");
        return enableTLS(socketCreateSocket);
    }
}
