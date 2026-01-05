package com.sun.mail.util;

import a2.AbstractC0030c;
import i0.m0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.PrivilegedAction;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SocketFetcher {
    private static MailLogger logger = new MailLogger(SocketFetcher.class, "socket", "DEBUG SocketFetcher", PropUtil.getBooleanSystemProperty("mail.socket.debug", false), System.out);

    private SocketFetcher() {
    }

    private static void checkServerIdentity(String str, SSLSocket sSLSocket) throws IOException {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            if (peerCertificates != null && peerCertificates.length > 0) {
                Certificate certificate = peerCertificates[0];
                if (certificate instanceof X509Certificate) {
                    if (matchCert(str, (X509Certificate) certificate)) {
                        return;
                    }
                }
            }
            sSLSocket.close();
            throw new IOException(m0.m7378k("Can't verify identity of server: ", str));
        } catch (SSLPeerUnverifiedException e2) {
            sSLSocket.close();
            IOException iOException = new IOException(m0.m7378k("Can't verify identity of server: ", str));
            iOException.initCause(e2);
            throw iOException;
        }
    }

    private static IOException cleanupAndThrow(Socket socket, IOException iOException) {
        try {
            socket.close();
            return iOException;
        } catch (Throwable th2) {
            if (isRecoverable(th2)) {
                iOException.addSuppressed(th2);
                return iOException;
            }
            th2.addSuppressed(iOException);
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw new RuntimeException("unexpected exception", th2);
        }
    }

    private static void configureSSLSocket(Socket socket, String str, Properties properties, String str2, SocketFactory socketFactory) throws IOException {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String property = properties.getProperty(str2 + ".ssl.protocols", null);
            if (property != null) {
                sSLSocket.setEnabledProtocols(stringArray(property));
            } else {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                if (logger.isLoggable(Level.FINER)) {
                    logger.finer("SSL enabled protocols before " + Arrays.asList(enabledProtocols));
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < enabledProtocols.length; i10++) {
                    String str3 = enabledProtocols[i10];
                    if (str3 != null && !str3.startsWith("SSL")) {
                        arrayList.add(enabledProtocols[i10]);
                    }
                }
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            String property2 = properties.getProperty(str2 + ".ssl.ciphersuites", null);
            if (property2 != null) {
                sSLSocket.setEnabledCipherSuites(stringArray(property2));
            }
            if (logger.isLoggable(Level.FINER)) {
                logger.finer("SSL enabled protocols after " + Arrays.asList(sSLSocket.getEnabledProtocols()));
                logger.finer("SSL enabled ciphers after " + Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            }
            sSLSocket.startHandshake();
            if (PropUtil.getBooleanProperty(properties, str2 + ".ssl.checkserveridentity", false)) {
                checkServerIdentity(str, sSLSocket);
            }
            if ((socketFactory instanceof MailSSLSocketFactory) && !((MailSSLSocketFactory) socketFactory).isServerTrusted(str, sSLSocket)) {
                throw cleanupAndThrow(sSLSocket, new IOException(m0.m7378k("Server is not trusted: ", str)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.net.Proxy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    private static Socket createSocket(InetAddress inetAddress, int i10, String str, int i11, int i12, int i13, Properties properties, String str2, SocketFactory socketFactory, boolean z6) throws NumberFormatException, IOException {
        ?? r62;
        String property;
        int i14;
        String str3;
        String str4;
        String str5;
        Socket socket;
        int i15;
        String str6;
        int i16;
        String str7;
        int i17;
        Socket socket2;
        ?? r12;
        Socket socketCreateSocket;
        String str8;
        SocketFactory socketFactory2 = socketFactory;
        if (logger.isLoggable(Level.FINEST)) {
            MailLogger mailLogger = logger;
            StringBuilder sb2 = new StringBuilder("create socket: prefix ");
            sb2.append(str2);
            sb2.append(", localaddr ");
            sb2.append(inetAddress);
            sb2.append(", localport ");
            AbstractC1452a.m4550A(sb2, i10, ", host ", str, ", port ");
            sb2.append(i11);
            sb2.append(", connection timeout ");
            sb2.append(i12);
            sb2.append(", timeout ");
            sb2.append(i13);
            sb2.append(", socket factory ");
            sb2.append(socketFactory2);
            sb2.append(", useSSL ");
            sb2.append(z6);
            mailLogger.finest(sb2.toString());
        }
        String property2 = properties.getProperty(str2 + ".proxy.host", null);
        String property3 = properties.getProperty(str2 + ".proxy.user", null);
        String property4 = properties.getProperty(str2 + ".proxy.password", null);
        int i18 = 80;
        int i19 = 1080;
        if (property2 != null) {
            int iIndexOf = property2.indexOf(58);
            if (iIndexOf >= 0) {
                try {
                    i18 = Integer.parseInt(property2.substring(iIndexOf + 1));
                } catch (NumberFormatException unused) {
                }
                property2 = property2.substring(0, iIndexOf);
            }
            int intProperty = PropUtil.getIntProperty(properties, str2 + ".proxy.port", i18);
            String str9 = "Using web proxy host, port: " + property2 + ", " + intProperty;
            if (logger.isLoggable(Level.FINER)) {
                str3 = str9;
                logger.finer("web proxy host " + property2 + ", port " + intProperty);
                str8 = "web proxy host ";
                if (property3 != null) {
                    MailLogger mailLogger2 = logger;
                    StringBuilder sbM7383p = m0.m7383p("web proxy user ", property3, ", password ");
                    sbM7383p.append(property4 == null ? "<null>" : "<non-null>");
                    String string = sbM7383p.toString();
                    mailLogger2.finer(string);
                    str8 = string;
                }
            } else {
                str3 = str9;
                str8 = str9;
            }
            i18 = intProperty;
            i14 = 1080;
            property = null;
            r62 = str8;
        } else {
            r62 = 0;
            property = properties.getProperty(str2 + ".socks.host", null);
            if (property != null) {
                int iIndexOf2 = property.indexOf(58);
                if (iIndexOf2 >= 0) {
                    try {
                        i19 = Integer.parseInt(property.substring(iIndexOf2 + 1));
                    } catch (NumberFormatException unused2) {
                    }
                    property = property.substring(0, iIndexOf2);
                }
                int intProperty2 = PropUtil.getIntProperty(properties, str2 + ".socks.port", i19);
                String str10 = "Using SOCKS host, port: " + property + ", " + intProperty2;
                if (logger.isLoggable(Level.FINER)) {
                    str4 = str10;
                    logger.finer("socks host " + property + ", port " + intProperty2);
                    str5 = "socks host ";
                } else {
                    str4 = str10;
                    str5 = str10;
                }
                i14 = intProperty2;
                property2 = property2;
                str3 = str4;
                r62 = str5;
            } else {
                i14 = 1080;
                str3 = null;
            }
        }
        if (socketFactory2 == null || (r62 = socketFactory2 instanceof SSLSocketFactory) != 0) {
            socket = null;
            i15 = r62;
        } else {
            socket = socketFactory2.createSocket();
            i15 = r62;
        }
        if (socket != null) {
            str6 = property2;
            i16 = i15;
        } else if (property != null) {
            str6 = property2;
            ?? proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(property, i14));
            socket = new Socket((Proxy) proxy);
            i16 = proxy;
        } else {
            str6 = property2;
            i16 = 0;
            i16 = 0;
            if (PropUtil.getBooleanProperty(properties, str2 + ".usesocketchannels", false)) {
                logger.finer("using SocketChannels");
                socket = SocketChannel.open().socket();
            } else {
                socket = new Socket();
            }
        }
        if (i13 >= 0) {
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("set socket read timeout " + i13);
            }
            socket.setSoTimeout(i13);
        }
        ?? r32 = -1;
        int intProperty3 = PropUtil.getIntProperty(properties, str2 + ".writetimeout", -1);
        if (intProperty3 != -1) {
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("set socket write timeout " + intProperty3);
            }
            WriteTimeoutSocket writeTimeoutSocket = new WriteTimeoutSocket(socket, intProperty3);
            socket = writeTimeoutSocket;
            r32 = writeTimeoutSocket;
        }
        if (inetAddress != null) {
            socket.bind(new InetSocketAddress(inetAddress, i10));
        }
        try {
            logger.finest("connecting...");
            try {
                if (str6 != null) {
                    int i20 = i11;
                    socket2 = socket;
                    try {
                        proxyConnect(socket2, str6, i18, property3, property4, str, i20 == true ? 1 : 0, i12);
                        r32 = str;
                        i16 = i20;
                    } catch (IOException e2) {
                        e = e2;
                        str7 = str;
                        i17 = i20;
                        IOException iOException = e;
                        logger.log(Level.FINEST, "connection failed", (Throwable) iOException);
                        throw new SocketConnectException(str3, iOException, str7, i17, i12);
                    }
                } else {
                    String str11 = str;
                    int i21 = i11;
                    socket2 = socket;
                    if (i12 >= 0) {
                        socket2.connect(new InetSocketAddress(str11, i21 == true ? 1 : 0), i12);
                        r32 = str11;
                        i16 = i21;
                    } else {
                        socket2.connect(new InetSocketAddress(str11, i21 == true ? 1 : 0));
                        r32 = str11;
                        i16 = i21;
                    }
                }
                logger.finest("success!");
                if ((z6 || (socketFactory2 instanceof SSLSocketFactory)) && !(socket2 instanceof SSLSocket)) {
                    String property5 = properties.getProperty(str2 + ".ssl.trust");
                    if (property5 != null) {
                        try {
                            MailSSLSocketFactory mailSSLSocketFactory = new MailSSLSocketFactory();
                            if (property5.equals("*")) {
                                mailSSLSocketFactory.setTrustAllHosts(true);
                            } else {
                                mailSSLSocketFactory.setTrustedHosts(property5.split("\\s+"));
                            }
                            r12 = mailSSLSocketFactory;
                        } catch (GeneralSecurityException e10) {
                            IOException iOException2 = new IOException("Can't create MailSSLSocketFactory");
                            iOException2.initCause(e10);
                            throw iOException2;
                        }
                    } else {
                        r12 = socketFactory2 instanceof SSLSocketFactory ? (SSLSocketFactory) socketFactory2 : (SSLSocketFactory) SSLSocketFactory.getDefault();
                    }
                    socketCreateSocket = r12.createSocket(socket2, r32, i16 == true ? 1 : 0, true);
                    socketFactory2 = r12;
                } else {
                    socketCreateSocket = socket2;
                }
                configureSSLSocket(socketCreateSocket, r32, properties, str2, socketFactory2);
                return socketCreateSocket;
            } catch (IOException e11) {
                e = e11;
                str7 = r32;
                i17 = i16;
            }
        } catch (IOException e12) {
            e = e12;
            str7 = str;
            i17 = i11;
        }
    }

    private static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: com.sun.mail.util.SocketFetcher.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.Socket getSocket(java.lang.String r21, int r22, java.util.Properties r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.SocketFetcher.getSocket(java.lang.String, int, java.util.Properties, java.lang.String, boolean):java.net.Socket");
    }

    private static SocketFactory getSocketFactory(String str) throws ClassNotFoundException {
        Class<?> cls;
        if (str == null || str.length() == 0) {
            return null;
        }
        ClassLoader contextClassLoader = getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                cls = Class.forName(str, false, contextClassLoader);
            } catch (ClassNotFoundException unused) {
            }
        } else {
            cls = null;
        }
        if (cls == null) {
            cls = Class.forName(str);
        }
        return (SocketFactory) cls.getMethod("getDefault", null).invoke(new Object(), null);
    }

    private static boolean isRecoverable(Throwable th2) {
        return (th2 instanceof Exception) || (th2 instanceof LinkageError);
    }

    private static boolean matchCert(String str, X509Certificate x509Certificate) throws IllegalAccessException, CertificateParsingException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        MailLogger mailLogger = logger;
        Level level = Level.FINER;
        if (mailLogger.isLoggable(level)) {
            logger.finer("matchCert server " + str + ", cert " + x509Certificate);
        }
        try {
            Class<?> cls = Class.forName("sun.security.util.HostnameChecker");
            Object objInvoke = cls.getMethod("getInstance", Byte.TYPE).invoke(new Object(), (byte) 2);
            if (logger.isLoggable(level)) {
                logger.finer("using sun.security.util.HostnameChecker");
            }
            try {
                cls.getMethod("match", String.class, X509Certificate.class).invoke(objInvoke, str, x509Certificate);
                return true;
            } catch (InvocationTargetException e2) {
                logger.log(Level.FINER, "HostnameChecker FAIL", (Throwable) e2);
                return false;
            }
        } catch (Exception e10) {
            logger.log(Level.FINER, "NO sun.security.util.HostnameChecker", (Throwable) e10);
            try {
                Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                if (subjectAlternativeNames != null) {
                    boolean z6 = false;
                    for (List<?> list : subjectAlternativeNames) {
                        if (((Integer) list.get(0)).intValue() == 2) {
                            String str2 = (String) list.get(1);
                            if (logger.isLoggable(Level.FINER)) {
                                logger.finer("found name: " + str2);
                            }
                            if (matchServer(str, str2)) {
                                return true;
                            }
                            z6 = true;
                        }
                    }
                    if (z6) {
                        return false;
                    }
                }
            } catch (CertificateParsingException unused) {
            }
            Matcher matcher = Pattern.compile("CN=([^,]*)").matcher(x509Certificate.getSubjectX500Principal().getName());
            return matcher.find() && matchServer(str, matcher.group(1).trim());
        }
    }

    private static boolean matchServer(String str, String str2) {
        int length;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("match server " + str + " with " + str2);
        }
        if (!str2.startsWith("*.")) {
            return str.equalsIgnoreCase(str2);
        }
        String strSubstring = str2.substring(2);
        return strSubstring.length() != 0 && (length = str.length() - strSubstring.length()) >= 1 && str.charAt(length + (-1)) == '.' && str.regionMatches(true, length, strSubstring, 0, strSubstring.length());
    }

    private static void proxyConnect(Socket socket, String str, int i10, String str2, String str3, String str4, int i11, int i12) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            MailLogger mailLogger = logger;
            StringBuilder sbM125p = AbstractC0030c.m125p(i10, "connecting through proxy ", str, ":", " to ");
            sbM125p.append(str4);
            sbM125p.append(":");
            sbM125p.append(i11);
            mailLogger.fine(sbM125p.toString());
        }
        if (i12 >= 0) {
            socket.connect(new InetSocketAddress(str, i10), i12);
        } else {
            socket.connect(new InetSocketAddress(str, i10));
        }
        OutputStream outputStream = socket.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        PrintStream printStream = new PrintStream(outputStream, false, charset.name());
        StringBuilder sbM125p2 = AbstractC0030c.m125p(i11, "CONNECT ", str4, ":", " HTTP/1.1\r\nHost: ");
        AbstractC1452a.m4551B(sbM125p2, str4, ":", i11, "\r\n");
        if (str2 != null && str3 != null) {
            a1.m14318A(sbM125p2, "Proxy-Authorization: Basic ", new String(BASE64EncoderStream.encode((str2 + ':' + str3).getBytes(charset)), StandardCharsets.US_ASCII), "\r\n");
        }
        sbM125p2.append("Proxy-Connection: keep-alive\r\n\r\n");
        printStream.print(sbM125p2.toString());
        printStream.flush();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
        boolean z6 = true;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.length() == 0) {
                return;
            }
            logger.finest(line);
            if (z6) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                stringTokenizer.nextToken();
                if (!stringTokenizer.nextToken().equals("200")) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                    StringBuilder sbM125p3 = AbstractC0030c.m125p(i10, "connection through proxy ", str, ":", " to ");
                    AbstractC1452a.m4551B(sbM125p3, str4, ":", i11, " failed: ");
                    sbM125p3.append(line);
                    ConnectException connectException = new ConnectException(sbM125p3.toString());
                    logger.log(Level.FINE, "connect failed", (Throwable) connectException);
                    throw connectException;
                }
                z6 = false;
            }
        }
    }

    @Deprecated
    public static Socket startTLS(Socket socket) {
        return startTLS(socket, new Properties(), "socket");
    }

    private static String[] stringArray(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Deprecated
    public static Socket startTLS(Socket socket, Properties properties, String str) {
        return startTLS(socket, socket.getInetAddress().getHostName(), properties, str);
    }

    public static Socket startTLS(Socket socket, String str, Properties properties, String str2) throws IOException {
        Object socketFactory;
        String str3;
        SSLSocketFactory sSLSocketFactory;
        int port = socket.getPort();
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("startTLS host " + str + ", port " + port);
        }
        String str4 = "unknown socket factory";
        try {
            Object obj = properties.get(str2 + ".ssl.socketFactory");
            SSLSocketFactory sSLSocketFactory2 = null;
            sSLSocketFactory2 = null;
            if (obj instanceof SocketFactory) {
                socketFactory = (SocketFactory) obj;
                str4 = "SSL socket factory instance " + socketFactory;
            } else {
                socketFactory = null;
            }
            if (socketFactory == null) {
                String property = properties.getProperty(str2 + ".ssl.socketFactory.class");
                socketFactory = getSocketFactory(property);
                str4 = "SSL socket factory class " + property;
            }
            if (socketFactory != null && (socketFactory instanceof SSLSocketFactory)) {
                sSLSocketFactory2 = (SSLSocketFactory) socketFactory;
            }
            if (sSLSocketFactory2 == null) {
                Object obj2 = properties.get(str2 + ".socketFactory");
                if (obj2 instanceof SocketFactory) {
                    socketFactory = (SocketFactory) obj2;
                    str4 = "socket factory instance " + socketFactory;
                }
                if (socketFactory == null) {
                    String property2 = properties.getProperty(str2 + ".socketFactory.class");
                    socketFactory = getSocketFactory(property2);
                    str4 = "socket factory class " + property2;
                }
                if (socketFactory != null && (socketFactory instanceof SSLSocketFactory)) {
                    sSLSocketFactory2 = (SSLSocketFactory) socketFactory;
                }
            }
            SSLSocketFactory sSLSocketFactory3 = sSLSocketFactory2;
            if (sSLSocketFactory2 == null) {
                String property3 = properties.getProperty(str2 + ".ssl.trust");
                if (property3 != null) {
                    try {
                        MailSSLSocketFactory mailSSLSocketFactory = new MailSSLSocketFactory();
                        if (property3.equals("*")) {
                            mailSSLSocketFactory.setTrustAllHosts(true);
                        } else {
                            mailSSLSocketFactory.setTrustedHosts(property3.split("\\s+"));
                        }
                        str3 = "mail SSL socket factory";
                        sSLSocketFactory = mailSSLSocketFactory;
                    } catch (GeneralSecurityException e2) {
                        IOException iOException = new IOException("Can't create MailSSLSocketFactory");
                        iOException.initCause(e2);
                        throw iOException;
                    }
                } else {
                    str3 = "default SSL socket factory";
                    sSLSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                }
                sSLSocketFactory3 = sSLSocketFactory;
            }
            Socket socketCreateSocket = sSLSocketFactory3.createSocket(socket, str, port, true);
            configureSSLSocket(socketCreateSocket, str, properties, str2, sSLSocketFactory3);
            return socketCreateSocket;
        } catch (Exception e10) {
            e = e10;
            if (e instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) e).getTargetException();
                if (targetException instanceof Exception) {
                    e = (Exception) targetException;
                }
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            StringBuilder sbM127r = AbstractC0030c.m127r("Exception in startTLS using ", str4, ": host, port: ", str, ", ");
            sbM127r.append(port);
            sbM127r.append("; Exception: ");
            sbM127r.append(e);
            IOException iOException2 = new IOException(sbM127r.toString());
            iOException2.initCause(e);
            throw iOException2;
        }
    }

    public static Socket getSocket(String str, int i10, Properties properties, String str2) {
        return getSocket(str, i10, properties, str2, false);
    }
}
