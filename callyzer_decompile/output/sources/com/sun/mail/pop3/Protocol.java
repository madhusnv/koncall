package com.sun.mail.pop3;

import com.sun.mail.auth.Ntlm;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import i0.m0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class Protocol {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String CRLF = "\r\n";
    private static final int POP3_PORT = 110;
    private static final int SLOP = 128;
    private static char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private String apopChallenge;
    private String defaultAuthenticationMechanisms;
    private String host;
    private BufferedReader input;
    private String localHostName;
    private MailLogger logger;
    private boolean noauthdebug;
    private PrintWriter output;
    private boolean pipelining;
    private String prefix;
    private Properties props;
    private Socket socket;
    private TraceInputStream traceInput;
    private MailLogger traceLogger;
    private TraceOutputStream traceOutput;
    private boolean traceSuspended;
    private Map<String, String> capabilities = null;
    private Map<String, Authenticator> authenticators = new HashMap();

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public abstract class Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean enabled;
        private final String mech;
        protected Response resp;

        public Authenticator(Protocol protocol, String str) {
            this(str, true);
        }

        public boolean authenticate(String str, String str2, String str3, String str4) throws EOFException {
            String str5;
            str5 = "failed";
            try {
                try {
                    String initialResponse = getInitialResponse(str, str2, str3, str4);
                    if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                        Protocol.this.logger.fine("AUTH " + this.mech + " command trace suppressed");
                        Protocol.this.suspendTracing();
                    }
                    runAuthenticationCommand("AUTH " + this.mech, initialResponse);
                    if (this.resp.cont) {
                        doAuth(str, str2, str3, str4);
                    }
                    if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                        MailLogger mailLogger = Protocol.this.logger;
                        StringBuilder sb2 = new StringBuilder("AUTH ");
                        sb2.append(this.mech);
                        sb2.append(" ");
                        sb2.append(this.resp.f43926ok ? "succeeded" : "failed");
                        mailLogger.fine(sb2.toString());
                    }
                    Protocol.this.resumeTracing();
                    if (this.resp.f43926ok) {
                        return true;
                    }
                    Protocol.this.close();
                    String str6 = this.resp.data;
                    throw new EOFException(str6 != null ? str6 : "authentication failed");
                } catch (Throwable th2) {
                    if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                        MailLogger mailLogger2 = Protocol.this.logger;
                        StringBuilder sb3 = new StringBuilder("AUTH ");
                        sb3.append(this.mech);
                        sb3.append(" ");
                        if (this.resp.f43926ok) {
                            str5 = "succeeded";
                        }
                        sb3.append(str5);
                        mailLogger2.fine(sb3.toString());
                    }
                    Protocol.this.resumeTracing();
                    if (this.resp.f43926ok) {
                        throw th2;
                    }
                    Protocol.this.close();
                    String str7 = this.resp.data;
                    throw new EOFException(str7 != null ? str7 : "authentication failed");
                }
            } catch (IOException e2) {
                Protocol.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", (Throwable) e2);
                if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                    MailLogger mailLogger3 = Protocol.this.logger;
                    StringBuilder sb4 = new StringBuilder("AUTH ");
                    sb4.append(this.mech);
                    sb4.append(" ");
                    str5 = this.resp.f43926ok ? "succeeded" : "failed";
                    sb4.append(str5);
                    mailLogger3.fine(sb4.toString());
                }
                Protocol.this.resumeTracing();
                if (!this.resp.f43926ok) {
                    Protocol.this.close();
                    String str8 = this.resp.data;
                    throw new EOFException(str8 != null ? str8 : "authentication failed");
                }
                return true;
            } catch (Throwable th3) {
                Protocol.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", (Throwable) th3);
                if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                    MailLogger mailLogger4 = Protocol.this.logger;
                    StringBuilder sb5 = new StringBuilder("AUTH ");
                    sb5.append(this.mech);
                    sb5.append(" ");
                    str5 = this.resp.f43926ok ? "succeeded" : "failed";
                    sb5.append(str5);
                    mailLogger4.fine(sb5.toString());
                }
                Protocol.this.resumeTracing();
                if (!this.resp.f43926ok) {
                    Protocol.this.close();
                    if (th3 instanceof Error) {
                        throw th3;
                    }
                    if (!(th3 instanceof Exception)) {
                        String str9 = this.resp.data;
                        throw new EOFException(str9 != null ? str9 : "authentication failed");
                    }
                    String str10 = this.resp.data;
                    EOFException eOFException = new EOFException(str10 != null ? str10 : "authentication failed");
                    eOFException.initCause(th3);
                    throw eOFException;
                }
                return true;
            }
        }

        public abstract void doAuth(String str, String str2, String str3, String str4);

        public boolean enabled() {
            return this.enabled;
        }

        public String getInitialResponse(String str, String str2, String str3, String str4) {
            return null;
        }

        public String getMechanism() {
            return this.mech;
        }

        public void runAuthenticationCommand(String str, String str2) {
            if (Protocol.this.logger.isLoggable(Level.FINE)) {
                Protocol.this.logger.fine(str + " using one line authentication format");
            }
            if (str2 == null) {
                this.resp = Protocol.this.simpleCommand(str);
                return;
            }
            Protocol protocol = Protocol.this;
            StringBuilder sbM11245p = AbstractC5601a.m11245p(str, " ");
            if (str2.length() == 0) {
                str2 = "=";
            }
            sbM11245p.append(str2);
            this.resp = protocol.simpleCommand(sbM11245p.toString());
        }

        public Authenticator(String str, boolean z6) {
            this.mech = str.toUpperCase(Locale.ENGLISH);
            this.enabled = z6;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class LoginAuthenticator extends Authenticator {
        public LoginAuthenticator() {
            super(Protocol.this, "LOGIN");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public boolean authenticate(String str, String str2, String str3, String str4) throws EOFException {
            String strLogin = Protocol.this.login(str3, str4);
            if (strLogin == null) {
                return true;
            }
            throw new EOFException(strLogin);
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws EOFException {
            throw new EOFException("LOGIN asked for more");
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class NtlmAuthenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Ntlm ntlm;

        public NtlmAuthenticator() {
            super(Protocol.this, "NTLM");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) {
            this.resp = Protocol.this.simpleCommand(this.ntlm.generateType3Msg(this.resp.data.substring(4).trim()));
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            this.ntlm = new Ntlm(Protocol.this.props.getProperty(Protocol.this.prefix + ".auth.ntlm.domain"), Protocol.this.getLocalHost(), str3, str4, Protocol.this.logger);
            return this.ntlm.generateType1Msg(PropUtil.getIntProperty(Protocol.this.props, Protocol.this.prefix + ".auth.ntlm.flags", 0), PropUtil.getBooleanProperty(Protocol.this.props, Protocol.this.prefix + ".auth.ntlm.v2", true));
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class OAuth2Authenticator extends Authenticator {
        public OAuth2Authenticator() {
            super("XOAUTH2", false);
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws EOFException {
            String str5;
            String str6 = this.resp.data;
            if (str6 != null) {
                Charset charset = StandardCharsets.UTF_8;
                str5 = new String(BASE64DecoderStream.decode(str6.getBytes(charset)), charset);
            } else {
                str5 = "";
            }
            throw new EOFException("OAUTH2 authentication failed: ".concat(str5));
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            return ASCIIUtility.toString(BASE64EncoderStream.encode(a1.m14333m("user=", str3, "\u0001auth=Bearer ", str4, "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void runAuthenticationCommand(String str, String str2) {
            Protocol protocol = Protocol.this;
            if (!protocol.getBoolProp(protocol.props, AbstractC1452a.m4564k(new StringBuilder(), Protocol.this.prefix, ".auth.xoauth2.two.line.authentication.format"))) {
                super.runAuthenticationCommand(str, str2);
                return;
            }
            if (Protocol.this.logger.isLoggable(Level.FINE)) {
                Protocol.this.logger.fine(str + " using two line authentication format");
            }
            Protocol protocol2 = Protocol.this;
            if (str2.length() == 0) {
                str2 = "=";
            }
            this.resp = protocol2.twoLinesCommand(str, str2);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class PlainAuthenticator extends Authenticator {
        public PlainAuthenticator() {
            super(Protocol.this, "PLAIN");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws EOFException {
            throw new EOFException("PLAIN asked for more");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
            if (str2 != null) {
                bASE64EncoderStream.write(str2.getBytes(StandardCharsets.UTF_8));
            }
            bASE64EncoderStream.write(0);
            Charset charset = StandardCharsets.UTF_8;
            bASE64EncoderStream.write(str3.getBytes(charset));
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str4.getBytes(charset));
            bASE64EncoderStream.flush();
            return ASCIIUtility.toString(byteArrayOutputStream.toByteArray());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Protocol(java.lang.String r10, int r11, com.sun.mail.util.MailLogger r12, java.util.Properties r13, java.lang.String r14, boolean r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.pop3.Protocol.<init>(java.lang.String, int, com.sun.mail.util.MailLogger, java.util.Properties, java.lang.String, boolean):void");
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

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean getBoolProp(Properties properties, String str) {
        boolean booleanProperty;
        booleanProperty = PropUtil.getBooleanProperty(properties, str, false);
        if (this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config(str + ": " + booleanProperty);
        }
        return booleanProperty;
    }

    private String getDigest(String str) {
        try {
            return toHex(MessageDigest.getInstance("MD5").digest(AbstractC1452a.m4564k(new StringBuilder(), this.apopChallenge, str).getBytes("iso-8859-1")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String getLocalHost() {
        Socket socket;
        try {
            try {
                String str = this.localHostName;
                if (str == null || str.length() == 0) {
                    InetAddress localHost = InetAddress.getLocalHost();
                    String canonicalHostName = localHost.getCanonicalHostName();
                    this.localHostName = canonicalHostName;
                    if (canonicalHostName == null) {
                        this.localHostName = "[" + localHost.getHostAddress() + "]";
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (UnknownHostException unused) {
        }
        String str2 = this.localHostName;
        if ((str2 == null || str2.length() <= 0) && (socket = this.socket) != null && socket.isBound()) {
            InetAddress localAddress = this.socket.getLocalAddress();
            String canonicalHostName2 = localAddress.getCanonicalHostName();
            this.localHostName = canonicalHostName2;
            if (canonicalHostName2 == null) {
                this.localHostName = "[" + localAddress.getHostAddress() + "]";
            }
        }
        return this.localHostName;
    }

    private void initStreams() {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.props, "mail.debug.quote", false);
        TraceInputStream traceInputStream = new TraceInputStream(this.socket.getInputStream(), this.traceLogger);
        this.traceInput = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.socket.getOutputStream(), this.traceLogger);
        this.traceOutput = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.input = new BufferedReader(new InputStreamReader(this.traceInput, "iso-8859-1"));
        this.output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.traceOutput, "iso-8859-1")));
    }

    private static boolean isRecoverable(Throwable th2) {
        return (th2 instanceof Exception) || (th2 instanceof LinkageError);
    }

    private void issueCommand(String str) throws IOException {
        if (this.socket == null) {
            throw new IOException("Folder is closed");
        }
        if (str != null) {
            this.output.print(str.concat(CRLF));
            this.output.flush();
        }
    }

    private Response multilineCommand(String str, int i10) throws IOException {
        multilineCommandStart(str);
        issueCommand(str);
        Response response = readResponse();
        if (!response.f43926ok) {
            multilineCommandEnd();
            return response;
        }
        response.bytes = readMultilineResponse(i10);
        multilineCommandEnd();
        return response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r2 = r3.input.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.InputStream readMultilineResponse(int r4) throws java.io.IOException {
        /*
            r3 = this;
            com.sun.mail.util.SharedByteArrayOutputStream r0 = new com.sun.mail.util.SharedByteArrayOutputStream
            r0.<init>(r4)
            r4 = 10
            r1 = r4
        L8:
            java.io.BufferedReader r2 = r3.input     // Catch: java.io.InterruptedIOException -> L27
            int r2 = r2.read()     // Catch: java.io.InterruptedIOException -> L27
            if (r2 < 0) goto L2e
            if (r1 != r4) goto L29
            r1 = 46
            if (r2 != r1) goto L29
            java.io.BufferedReader r1 = r3.input     // Catch: java.io.InterruptedIOException -> L27
            int r1 = r1.read()     // Catch: java.io.InterruptedIOException -> L27
            r2 = 13
            if (r1 != r2) goto L2a
            java.io.BufferedReader r4 = r3.input     // Catch: java.io.InterruptedIOException -> L27
            int r2 = r4.read()     // Catch: java.io.InterruptedIOException -> L27
            goto L2e
        L27:
            r4 = move-exception
            goto L3d
        L29:
            r1 = r2
        L2a:
            r0.write(r1)     // Catch: java.io.InterruptedIOException -> L27
            goto L8
        L2e:
            if (r2 < 0) goto L35
            java.io.InputStream r4 = r0.toStream()
            return r4
        L35:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r0 = "EOF on socket"
            r4.<init>(r0)
            throw r4
        L3d:
            java.net.Socket r0 = r3.socket     // Catch: java.io.IOException -> L42
            r0.close()     // Catch: java.io.IOException -> L42
        L42:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.pop3.Protocol.readMultilineResponse(int):java.io.InputStream");
    }

    private Response readResponse() throws IOException {
        try {
            String line = this.input.readLine();
            if (line == null) {
                this.traceLogger.finest("<EOF>");
                throw new EOFException("EOF on socket");
            }
            Response response = new Response();
            if (line.startsWith("+OK")) {
                response.f43926ok = true;
            } else if (line.startsWith("+ ")) {
                response.f43926ok = true;
                response.cont = true;
            } else {
                if (!line.startsWith("-ERR")) {
                    throw new IOException("Unexpected response: ".concat(line));
                }
                response.f43926ok = false;
            }
            int iIndexOf = line.indexOf(32);
            if (iIndexOf >= 0) {
                response.data = line.substring(iIndexOf + 1);
            }
            return response;
        } catch (InterruptedIOException e2) {
            try {
                this.socket.close();
            } catch (IOException unused) {
            }
            throw new EOFException(e2.getMessage());
        } catch (SocketException e10) {
            try {
                this.socket.close();
            } catch (IOException unused2) {
            }
            throw new EOFException(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(true);
            this.traceOutput.setTrace(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response simpleCommand(String str) throws IOException {
        simpleCommandStart(str);
        issueCommand(str);
        Response response = readResponse();
        simpleCommandEnd();
        return response;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void suspendTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(false);
            this.traceOutput.setTrace(false);
        }
    }

    private static String toHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = digits;
            cArr[i10] = cArr2[(b10 & 255) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response twoLinesCommand(String str, String str2) throws IOException {
        String strM7379l = m0.m7379l(str, " ", str2);
        batchCommandStart(strM7379l);
        simpleCommand(str);
        batchCommandContinue(strM7379l);
        Response responseSimpleCommand = simpleCommand(str2);
        batchCommandEnd();
        return responseSimpleCommand;
    }

    public synchronized String authenticate(String str, String str2, String str3, String str4, String str5) {
        Authenticator authenticator = this.authenticators.get(str.toUpperCase(Locale.ENGLISH));
        if (authenticator == null) {
            return "No such authentication mechanism: ".concat(str);
        }
        try {
            if (authenticator.authenticate(str2, str3, str4, str5)) {
                return null;
            }
            return "login failed";
        } catch (IOException e2) {
            return e2.getMessage();
        }
    }

    public synchronized InputStream capa() {
        Response responseMultilineCommand = multilineCommand("CAPA", 128);
        if (!responseMultilineCommand.f43926ok) {
            return null;
        }
        return responseMultilineCommand.bytes;
    }

    public void close() {
        try {
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.socket = null;
            this.input = null;
            this.output = null;
            throw th2;
        }
        this.socket = null;
        this.input = null;
        this.output = null;
    }

    public synchronized boolean dele(int i10) {
        return simpleCommand("DELE " + i10).f43926ok;
    }

    public void finalize() throws Throwable {
        try {
            if (this.socket != null) {
                quit();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized Map<String, String> getCapabilities() {
        return this.capabilities;
    }

    public String getDefaultMechanisms() {
        return this.defaultAuthenticationMechanisms;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean hasCapability(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.capabilities     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r3.toUpperCase(r1)     // Catch: java.lang.Throwable -> L13
            boolean r3 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L15
            r3 = 1
            goto L16
        L13:
            r3 = move-exception
            goto L18
        L15:
            r3 = 0
        L16:
            monitor-exit(r2)
            return r3
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.pop3.Protocol.hasCapability(java.lang.String):boolean");
    }

    public boolean isMechanismEnabled(String str) {
        Authenticator authenticator = this.authenticators.get(str.toUpperCase(Locale.ENGLISH));
        return authenticator != null && authenticator.enabled();
    }

    public synchronized boolean isSSL() {
        return this.socket instanceof SSLSocket;
    }

    public boolean isTracing() {
        return this.traceLogger.isLoggable(Level.FINEST);
    }

    public synchronized int list(int i10) {
        int i11;
        Response responseSimpleCommand = simpleCommand("LIST " + i10);
        if (!responseSimpleCommand.f43926ok || responseSimpleCommand.data == null) {
            i11 = -1;
        } else {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(responseSimpleCommand.data);
                stringTokenizer.nextToken();
                i11 = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
            }
        }
        return i11;
    }

    public synchronized String login(String str, String str2) {
        Response responseSimpleCommand;
        boolean z6 = this.pipelining && (this.socket instanceof SSLSocket);
        try {
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("authentication command trace suppressed");
                suspendTracing();
            }
            String digest = this.apopChallenge != null ? getDigest(str2) : null;
            if (this.apopChallenge != null && digest != null) {
                responseSimpleCommand = simpleCommand("APOP " + str + " " + digest);
            } else if (z6) {
                String str3 = "USER " + str;
                batchCommandStart(str3);
                issueCommand(str3);
                String str4 = "PASS " + str2;
                batchCommandContinue(str4);
                issueCommand(str4);
                Response response = readResponse();
                if (!response.f43926ok) {
                    String str5 = response.data;
                    if (str5 == null) {
                        str5 = "USER command failed";
                    }
                    readResponse();
                    batchCommandEnd();
                    resumeTracing();
                    return str5;
                }
                responseSimpleCommand = readResponse();
                batchCommandEnd();
            } else {
                Response responseSimpleCommand2 = simpleCommand("USER " + str);
                if (!responseSimpleCommand2.f43926ok) {
                    String str6 = responseSimpleCommand2.data;
                    if (str6 == null) {
                        str6 = "USER command failed";
                    }
                    return str6;
                }
                responseSimpleCommand = simpleCommand("PASS " + str2);
            }
            if (this.noauthdebug && isTracing()) {
                this.logger.log(Level.FINE, "authentication command {0}", responseSimpleCommand.f43926ok ? "succeeded" : "failed");
            }
            if (responseSimpleCommand.f43926ok) {
                resumeTracing();
                return null;
            }
            String str7 = responseSimpleCommand.data;
            if (str7 == null) {
                str7 = "login failed";
            }
            resumeTracing();
            return str7;
        } finally {
            resumeTracing();
        }
    }

    public synchronized boolean noop() {
        return simpleCommand("NOOP").f43926ok;
    }

    public synchronized boolean quit() {
        try {
        } finally {
            close();
        }
        return simpleCommand("QUIT").f43926ok;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x0042, B:12:0x0046, B:16:0x005d, B:18:0x0067, B:24:0x0080, B:26:0x0088, B:27:0x0090, B:49:0x0102, B:52:0x0108, B:54:0x0112, B:55:0x0129, B:28:0x0094, B:30:0x00ae, B:35:0x00b6, B:37:0x00ba, B:39:0x00d1, B:43:0x00da, B:45:0x00e4, B:48:0x00f9), top: B:62:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.io.InputStream retr(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.pop3.Protocol.retr(int, int):java.io.InputStream");
    }

    public synchronized boolean rset() {
        return simpleCommand("RSET").f43926ok;
    }

    public synchronized void setCapabilities(InputStream inputStream) {
        BufferedReader bufferedReader = null;
        if (inputStream == null) {
            this.capabilities = null;
            return;
        }
        this.capabilities = new HashMap(10);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "us-ascii"));
        } catch (UnsupportedEncodingException unused) {
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    int iIndexOf = line.indexOf(32);
                    this.capabilities.put((iIndexOf > 0 ? line.substring(0, iIndexOf) : line).toUpperCase(Locale.ENGLISH), line);
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
            try {
                break;
            } catch (IOException unused4) {
            }
        }
        inputStream.close();
    }

    public synchronized Status stat() {
        Status status;
        Response responseSimpleCommand = simpleCommand("STAT");
        status = new Status();
        if (!responseSimpleCommand.f43926ok) {
            throw new IOException("STAT command failed: " + responseSimpleCommand.data);
        }
        if (responseSimpleCommand.data != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(responseSimpleCommand.data);
                status.total = Integer.parseInt(stringTokenizer.nextToken());
                status.size = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
            }
        }
        return status;
    }

    public synchronized boolean stls() {
        if (this.socket instanceof SSLSocket) {
            return true;
        }
        Response responseSimpleCommand = simpleCommand("STLS");
        if (responseSimpleCommand.f43926ok) {
            try {
                this.socket = SocketFetcher.startTLS(this.socket, this.host, this.props, this.prefix);
                initStreams();
            } catch (IOException e2) {
                try {
                    this.socket.close();
                    this.socket = null;
                    this.input = null;
                    this.output = null;
                    IOException iOException = new IOException("Could not convert socket to TLS");
                    iOException.initCause(e2);
                    throw iOException;
                } catch (Throwable th2) {
                    this.socket = null;
                    this.input = null;
                    this.output = null;
                    throw th2;
                }
            }
        }
        return responseSimpleCommand.f43926ok;
    }

    public synchronized boolean supportsAuthentication(String str) {
        if (str.equals("LOGIN")) {
            return true;
        }
        Map<String, String> map = this.capabilities;
        if (map == null) {
            return false;
        }
        String str2 = map.get("SASL");
        if (str2 == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean supportsMechanism(String str) {
        return this.authenticators.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    public synchronized InputStream top(int i10, int i11) {
        return multilineCommand("TOP " + i10 + " " + i11, 0).bytes;
    }

    public synchronized String uidl(int i10) {
        Response responseSimpleCommand = simpleCommand("UIDL " + i10);
        if (!responseSimpleCommand.f43926ok) {
            return null;
        }
        int iIndexOf = responseSimpleCommand.data.indexOf(32);
        if (iIndexOf <= 0) {
            return null;
        }
        return responseSimpleCommand.data.substring(iIndexOf + 1);
    }

    public synchronized InputStream list() {
        return multilineCommand("LIST", 128).bytes;
    }

    public synchronized boolean uidl(String[] strArr) {
        int i10;
        Response responseMultilineCommand = multilineCommand("UIDL", strArr.length * 15);
        if (!responseMultilineCommand.f43926ok) {
            return false;
        }
        LineInputStream lineInputStream = new LineInputStream(responseMultilineCommand.bytes);
        while (true) {
            String line = lineInputStream.readLine();
            if (line != null) {
                int iIndexOf = line.indexOf(32);
                if (iIndexOf >= 1 && iIndexOf < line.length() && (i10 = Integer.parseInt(line.substring(0, iIndexOf))) > 0 && i10 <= strArr.length) {
                    strArr[i10 - 1] = line.substring(iIndexOf + 1);
                }
            } else {
                try {
                    break;
                } catch (IOException unused) {
                }
            }
        }
        responseMultilineCommand.bytes.close();
        return true;
    }

    private void batchCommandEnd() {
    }

    private void multilineCommandEnd() {
    }

    private void simpleCommandEnd() {
    }

    private void batchCommandContinue(String str) {
    }

    private void batchCommandStart(String str) {
    }

    private void multilineCommandStart(String str) {
    }

    private void simpleCommandStart(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r2 = r5.input.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean retr(int r6, java.io.OutputStream r7) {
        /*
            r5 = this;
            java.lang.String r0 = "RETR "
            monitor-enter(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            r1.append(r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L23
            r5.multilineCommandStart(r6)     // Catch: java.lang.Throwable -> L23
            r5.issueCommand(r6)     // Catch: java.lang.Throwable -> L23
            com.sun.mail.pop3.Response r6 = r5.readResponse()     // Catch: java.lang.Throwable -> L23
            boolean r6 = r6.f43926ok     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L26
            r5.multilineCommandEnd()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)
            r6 = 0
            return r6
        L23:
            r6 = move-exception
            goto L8f
        L26:
            r6 = 10
            r0 = 0
            r1 = r6
        L2a:
            java.io.BufferedReader r2 = r5.input     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            int r2 = r2.read()     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            if (r2 < 0) goto L68
            if (r1 != r6) goto L4b
            r1 = 46
            if (r2 != r1) goto L4b
            java.io.BufferedReader r1 = r5.input     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            int r1 = r1.read()     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            r2 = 13
            if (r1 != r2) goto L4c
            java.io.BufferedReader r6 = r5.input     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            int r2 = r6.read()     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            goto L68
        L49:
            r6 = move-exception
            goto L89
        L4b:
            r1 = r2
        L4c:
            if (r0 != 0) goto L2a
            r7.write(r1)     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L52 java.io.IOException -> L5d
            goto L2a
        L52:
            r0 = move-exception
            com.sun.mail.util.MailLogger r2 = r5.logger     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            java.util.logging.Level r3 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            java.lang.String r4 = "exception while streaming"
            r2.log(r3, r4, r0)     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            goto L2a
        L5d:
            r0 = move-exception
            com.sun.mail.util.MailLogger r2 = r5.logger     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            java.util.logging.Level r3 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            java.lang.String r4 = "exception while streaming"
            r2.log(r3, r4, r0)     // Catch: java.lang.Throwable -> L23 java.io.InterruptedIOException -> L49
            goto L2a
        L68:
            if (r2 < 0) goto L81
            if (r0 == 0) goto L7b
            boolean r6 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L78
            boolean r6 = r0 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L75
            goto L7b
        L75:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L78:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L7b:
            r5.multilineCommandEnd()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)
            r6 = 1
            return r6
        L81:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = "EOF on socket"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L23
            throw r6     // Catch: java.lang.Throwable -> L23
        L89:
            java.net.Socket r7 = r5.socket     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L8e
            r7.close()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L8e
        L8e:
            throw r6     // Catch: java.lang.Throwable -> L23
        L8f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.pop3.Protocol.retr(int, java.io.OutputStream):boolean");
    }
}
