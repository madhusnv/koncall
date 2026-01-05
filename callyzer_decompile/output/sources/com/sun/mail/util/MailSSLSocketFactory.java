package com.sun.mail.util;

import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class MailSSLSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory adapteeFactory;
    private KeyManager[] keyManagers;
    private SecureRandom secureRandom;
    private SSLContext sslcontext;
    private boolean trustAllHosts;
    private TrustManager[] trustManagers;
    private String[] trustedHosts;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class MailTrustManager implements X509TrustManager {
        private X509TrustManager adapteeTrustManager;

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (MailSSLSocketFactory.this.isTrustAllHosts() || MailSSLSocketFactory.this.getTrustedHosts() != null) {
                return;
            }
            this.adapteeTrustManager.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (MailSSLSocketFactory.this.isTrustAllHosts() || MailSSLSocketFactory.this.getTrustedHosts() != null) {
                return;
            }
            this.adapteeTrustManager.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.adapteeTrustManager.getAcceptedIssuers();
        }

        private MailTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
            this.adapteeTrustManager = null;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            this.adapteeTrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        }
    }

    public MailSSLSocketFactory() {
        this("TLS");
    }

    private synchronized void newAdapteeFactory() {
        this.sslcontext.init(this.keyManagers, this.trustManagers, this.secureRandom);
        this.adapteeFactory = this.sslcontext.getSocketFactory();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public synchronized Socket createSocket(Socket socket, String str, int i10, boolean z6) {
        return this.adapteeFactory.createSocket(socket, str, i10, z6);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public synchronized String[] getDefaultCipherSuites() {
        return this.adapteeFactory.getDefaultCipherSuites();
    }

    public synchronized KeyManager[] getKeyManagers() {
        return (KeyManager[]) this.keyManagers.clone();
    }

    public synchronized SecureRandom getSecureRandom() {
        return this.secureRandom;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public synchronized String[] getSupportedCipherSuites() {
        return this.adapteeFactory.getSupportedCipherSuites();
    }

    public synchronized TrustManager[] getTrustManagers() {
        return this.trustManagers;
    }

    public synchronized String[] getTrustedHosts() {
        String[] strArr = this.trustedHosts;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public synchronized boolean isServerTrusted(String str, SSLSocket sSLSocket) {
        if (this.trustAllHosts) {
            return true;
        }
        String[] strArr = this.trustedHosts;
        if (strArr == null) {
            return true;
        }
        return Arrays.asList(strArr).contains(str);
    }

    public synchronized boolean isTrustAllHosts() {
        return this.trustAllHosts;
    }

    public synchronized void setKeyManagers(KeyManager... keyManagerArr) {
        this.keyManagers = (KeyManager[]) keyManagerArr.clone();
        newAdapteeFactory();
    }

    public synchronized void setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        newAdapteeFactory();
    }

    public synchronized void setTrustAllHosts(boolean z6) {
        this.trustAllHosts = z6;
    }

    public synchronized void setTrustManagers(TrustManager... trustManagerArr) {
        this.trustManagers = trustManagerArr;
        newAdapteeFactory();
    }

    public synchronized void setTrustedHosts(String... strArr) {
        try {
            if (strArr == null) {
                this.trustedHosts = null;
            } else {
                this.trustedHosts = (String[]) strArr.clone();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public MailSSLSocketFactory(String str) {
        this.trustedHosts = null;
        this.adapteeFactory = null;
        this.trustAllHosts = false;
        this.sslcontext = SSLContext.getInstance(str);
        this.keyManagers = null;
        this.trustManagers = new TrustManager[]{new MailTrustManager()};
        this.secureRandom = null;
        newAdapteeFactory();
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket() {
        return this.adapteeFactory.createSocket();
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return this.adapteeFactory.createSocket(inetAddress, i10, inetAddress2, i11);
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(InetAddress inetAddress, int i10) {
        return this.adapteeFactory.createSocket(inetAddress, i10);
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return this.adapteeFactory.createSocket(str, i10, inetAddress, i11);
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(String str, int i10) {
        return this.adapteeFactory.createSocket(str, i10);
    }
}
