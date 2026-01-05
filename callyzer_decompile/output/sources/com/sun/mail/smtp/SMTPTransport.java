package com.sun.mail.smtp;

import a2.AbstractC0030c;
import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.auth.Ntlm;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import i0.m0;
import jakarta.mail.AbstractC3633a;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.AbstractC3695w;
import jakarta.mail.AuthenticationFailedException;
import jakarta.mail.MessagingException;
import jakarta.mail.SendFailedException;
import jakarta.mail.c0;
import jakarta.mail.f0;
import jakarta.mail.h0;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.C3655d;
import jakarta.mail.internet.C3665n;
import jakarta.mail.internet.C3666o;
import jakarta.mail.internet.InterfaceC3667p;
import jakarta.mail.internet.ParseException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
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
public class SMTPTransport extends f0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String UNKNOWN = "UNKNOWN";
    private AbstractC3633a[] addresses;
    private boolean allowutf8;
    private Map<String, Authenticator> authenticators;
    private String authorizationID;
    private int chunkSize;
    private SMTPOutputStream dataStream;
    private boolean debugpassword;
    private boolean debugusername;
    private String defaultAuthenticationMechanisms;
    private int defaultPort;
    private boolean enableSASL;
    private MessagingException exception;
    private Hashtable<String, String> extMap;
    private String host;
    private AbstractC3633a[] invalidAddr;
    private boolean isSSL;
    private int lastReturnCode;
    private String lastServerResponse;
    private LineInputStream lineInputStream;
    private String localHostName;
    private MailLogger logger;
    private C3665n message;
    private String name;
    private boolean noauthdebug;
    private boolean noopStrict;
    private boolean notificationDone;
    private String ntlmDomain;
    private boolean quitOnSessionReject;
    private boolean quitWait;
    private boolean reportSuccess;
    private boolean requireStartTLS;
    private SaslAuthenticator saslAuthenticator;
    private String[] saslMechanisms;
    private String saslRealm;
    private boolean sendPartiallyFailed;
    private BufferedInputStream serverInput;
    private OutputStream serverOutput;
    private Socket serverSocket;
    private TraceInputStream traceInput;
    private MailLogger traceLogger;
    private TraceOutputStream traceOutput;
    private boolean useCanonicalHostName;
    private boolean useRset;
    private boolean useStartTLS;
    private AbstractC3633a[] validSentAddr;
    private AbstractC3633a[] validUnsentAddr;
    private static final String[] ignoreList = {"Bcc", "Content-Length"};
    private static final byte[] CRLF = {13, 10};
    private static final String[] UNKNOWN_SA = new String[0];
    private static char[] hexchar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public abstract class Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean enabled;
        private final String mech;
        protected int resp;

        public Authenticator(SMTPTransport sMTPTransport, String str) {
            this(str, true);
        }

        public boolean authenticate(String str, String str2, String str3, String str4) throws AuthenticationFailedException {
            String str5;
            str5 = "failed";
            try {
                try {
                    String initialResponse = getInitialResponse(str, str2, str3, str4);
                    if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                        SMTPTransport.this.logger.fine("AUTH " + this.mech + " command trace suppressed");
                        SMTPTransport.this.suspendTracing();
                    }
                    if (initialResponse != null) {
                        SMTPTransport sMTPTransport = SMTPTransport.this;
                        StringBuilder sb2 = new StringBuilder("AUTH ");
                        sb2.append(this.mech);
                        sb2.append(" ");
                        sb2.append(initialResponse.length() == 0 ? "=" : initialResponse);
                        this.resp = sMTPTransport.simpleCommand(sb2.toString());
                    } else {
                        this.resp = SMTPTransport.this.simpleCommand("AUTH " + this.mech);
                    }
                    if (this.resp == 530) {
                        SMTPTransport.this.startTLS();
                        if (initialResponse != null) {
                            this.resp = SMTPTransport.this.simpleCommand("AUTH " + this.mech + " " + initialResponse);
                        } else {
                            this.resp = SMTPTransport.this.simpleCommand("AUTH " + this.mech);
                        }
                    }
                    if (this.resp == 334) {
                        doAuth(str, str2, str3, str4);
                    }
                    if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                        MailLogger mailLogger = SMTPTransport.this.logger;
                        StringBuilder sb3 = new StringBuilder("AUTH ");
                        sb3.append(this.mech);
                        sb3.append(" ");
                        sb3.append(this.resp == 235 ? "succeeded" : "failed");
                        mailLogger.fine(sb3.toString());
                    }
                    SMTPTransport.this.resumeTracing();
                    if (this.resp == 235) {
                        return true;
                    }
                    SMTPTransport.this.closeConnection();
                    throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
                } catch (Throwable th2) {
                    if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                        MailLogger mailLogger2 = SMTPTransport.this.logger;
                        StringBuilder sb4 = new StringBuilder("AUTH ");
                        sb4.append(this.mech);
                        sb4.append(" ");
                        if (this.resp == 235) {
                            str5 = "succeeded";
                        }
                        sb4.append(str5);
                        mailLogger2.fine(sb4.toString());
                    }
                    SMTPTransport.this.resumeTracing();
                    if (this.resp == 235) {
                        throw th2;
                    }
                    SMTPTransport.this.closeConnection();
                    throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
                }
            } catch (IOException e2) {
                SMTPTransport.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", (Throwable) e2);
                if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                    MailLogger mailLogger3 = SMTPTransport.this.logger;
                    StringBuilder sb5 = new StringBuilder("AUTH ");
                    sb5.append(this.mech);
                    sb5.append(" ");
                    str5 = this.resp == 235 ? "succeeded" : "failed";
                    sb5.append(str5);
                    mailLogger3.fine(sb5.toString());
                }
                SMTPTransport.this.resumeTracing();
                if (this.resp != 235) {
                    SMTPTransport.this.closeConnection();
                    throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
                }
                return true;
            } catch (Throwable th3) {
                SMTPTransport.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", th3);
                if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                    MailLogger mailLogger4 = SMTPTransport.this.logger;
                    StringBuilder sb6 = new StringBuilder("AUTH ");
                    sb6.append(this.mech);
                    sb6.append(" ");
                    str5 = this.resp == 235 ? "succeeded" : "failed";
                    sb6.append(str5);
                    mailLogger4.fine(sb6.toString());
                }
                SMTPTransport.this.resumeTracing();
                if (this.resp != 235) {
                    SMTPTransport.this.closeConnection();
                    if (th3 instanceof Error) {
                        throw ((Error) th3);
                    }
                    if (th3 instanceof Exception) {
                        throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse(), (Exception) th3);
                    }
                    throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
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

        public Authenticator(String str, boolean z6) {
            this.mech = str.toUpperCase(Locale.ENGLISH);
            this.enabled = z6;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class BDATOutputStream extends SMTPOutputStream {
        public BDATOutputStream(OutputStream outputStream, int i10) {
            super(SMTPTransport.this.new ChunkedOutputStream(outputStream, i10));
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ((FilterOutputStream) this).out.close();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class DigestMD5Authenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private DigestMD5 md5support;

        public DigestMD5Authenticator() {
            super(SMTPTransport.this, "DIGEST-MD5");
        }

        private synchronized DigestMD5 getMD5() {
            try {
                if (this.md5support == null) {
                    this.md5support = new DigestMD5(SMTPTransport.this.logger);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.md5support;
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws IOException, MessagingException {
            DigestMD5 md5 = getMD5();
            int iSimpleCommand = SMTPTransport.this.simpleCommand(md5.authClient(str, str3, str4, SMTPTransport.this.getSASLRealm(), SMTPTransport.this.getLastServerResponse()));
            this.resp = iSimpleCommand;
            if (iSimpleCommand == 334) {
                if (md5.authServer(SMTPTransport.this.getLastServerResponse())) {
                    this.resp = SMTPTransport.this.simpleCommand(new byte[0]);
                } else {
                    this.resp = -1;
                }
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class LoginAuthenticator extends Authenticator {
        public LoginAuthenticator() {
            super(SMTPTransport.this, "LOGIN");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws IOException, MessagingException {
            SMTPTransport sMTPTransport = SMTPTransport.this;
            Charset charset = StandardCharsets.UTF_8;
            int iSimpleCommand = sMTPTransport.simpleCommand(BASE64EncoderStream.encode(str3.getBytes(charset)));
            this.resp = iSimpleCommand;
            if (iSimpleCommand == 334) {
                this.resp = SMTPTransport.this.simpleCommand(BASE64EncoderStream.encode(str4.getBytes(charset)));
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class NtlmAuthenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Ntlm ntlm;

        public NtlmAuthenticator() {
            super(SMTPTransport.this, "NTLM");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) {
            this.resp = SMTPTransport.this.simpleCommand(this.ntlm.generateType3Msg(SMTPTransport.this.getLastServerResponse().substring(4).trim()));
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            this.ntlm = new Ntlm(SMTPTransport.this.getNTLMDomain(), SMTPTransport.this.getLocalHost(), str3, str4, SMTPTransport.this.logger);
            return this.ntlm.generateType1Msg(PropUtil.getIntProperty(((AbstractC3695w) SMTPTransport.this).session.f19287a, "mail." + SMTPTransport.this.name + ".auth.ntlm.flags", 0), PropUtil.getBooleanProperty(((AbstractC3695w) SMTPTransport.this).session.f19287a, "mail." + SMTPTransport.this.name + ".auth.ntlm.v2", true));
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class OAuth2Authenticator extends Authenticator {
        public OAuth2Authenticator() {
            super("XOAUTH2", false);
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws AuthenticationFailedException {
            throw new AuthenticationFailedException("OAUTH2 asked for more");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            return ASCIIUtility.toString(BASE64EncoderStream.encode(a1.m14333m("user=", str3, "\u0001auth=Bearer ", str4, "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class PlainAuthenticator extends Authenticator {
        public PlainAuthenticator() {
            super(SMTPTransport.this, "PLAIN");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws AuthenticationFailedException {
            throw new AuthenticationFailedException("PLAIN asked for more");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
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

    public SMTPTransport(c0 c0Var, h0 h0Var) {
        this(c0Var, h0Var, "smtp", false);
    }

    private void addressesFailed() {
        AbstractC3633a[] abstractC3633aArr = this.validSentAddr;
        if (abstractC3633aArr != null) {
            AbstractC3633a[] abstractC3633aArr2 = this.validUnsentAddr;
            if (abstractC3633aArr2 == null) {
                this.validUnsentAddr = abstractC3633aArr;
                this.validSentAddr = null;
                return;
            }
            AbstractC3633a[] abstractC3633aArr3 = new AbstractC3633a[abstractC3633aArr.length + abstractC3633aArr2.length];
            System.arraycopy(abstractC3633aArr, 0, abstractC3633aArr3, 0, abstractC3633aArr.length);
            AbstractC3633a[] abstractC3633aArr4 = this.validUnsentAddr;
            System.arraycopy(abstractC3633aArr4, 0, abstractC3633aArr3, this.validSentAddr.length, abstractC3633aArr4.length);
            this.validSentAddr = null;
            this.validUnsentAddr = abstractC3633aArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean authenticate(java.lang.String r12, java.lang.String r13) throws jakarta.mail.AuthenticationFailedException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.authenticate(java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void closeConnection() {
        try {
            try {
                Socket socket = this.serverSocket;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e2) {
                throw new MessagingException("Server Close Failed", e2);
            }
        } finally {
            this.serverSocket = null;
            this.serverOutput = null;
            this.serverInput = null;
            this.lineInputStream = null;
            if (super.isConnected()) {
                super.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean convertTo8Bit(InterfaceC3667p interfaceC3667p) throws Throwable {
        InputStream inputStream;
        boolean z6 = false;
        try {
            if (!interfaceC3667p.isMimeType("text/*")) {
                if (!interfaceC3667p.isMimeType("multipart/*")) {
                    return false;
                }
                C3666o c3666o = (C3666o) interfaceC3667p.getContent();
                int iM8234e = c3666o.m8234e();
                boolean z10 = false;
                for (int i10 = 0; i10 < iM8234e; i10++) {
                    try {
                        if (convertTo8Bit((InterfaceC3667p) c3666o.m8233d(i10))) {
                            z10 = true;
                        }
                    } catch (MessagingException | IOException unused) {
                    }
                }
                return z10;
            }
            String encoding = interfaceC3667p.getEncoding();
            if (encoding == null) {
                return false;
            }
            if (!encoding.equalsIgnoreCase("quoted-printable") && !encoding.equalsIgnoreCase("base64")) {
                return false;
            }
            try {
                inputStream = interfaceC3667p.getInputStream();
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
            try {
                if (is8Bit(inputStream)) {
                    interfaceC3667p.setContent(interfaceC3667p.getContent(), interfaceC3667p.getContentType());
                    interfaceC3667p.setHeader("Content-Transfer-Encoding", "8bit");
                    z6 = true;
                }
                if (inputStream == null) {
                    return z6;
                }
                inputStream.close();
                return z6;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (MessagingException | IOException unused3) {
            return false;
        }
    }

    private void expandGroups() {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            AbstractC3633a[] abstractC3633aArr = this.addresses;
            if (i10 >= abstractC3633aArr.length) {
                break;
            }
            C3655d c3655d = (C3655d) abstractC3633aArr[i10];
            if (c3655d.isGroup()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < i10; i11++) {
                        arrayList.add(this.addresses[i11]);
                    }
                }
                try {
                    C3655d[] group = c3655d.getGroup(true);
                    if (group != null) {
                        for (C3655d c3655d2 : group) {
                            arrayList.add(c3655d2);
                        }
                    } else {
                        arrayList.add(c3655d);
                    }
                } catch (ParseException unused) {
                    arrayList.add(c3655d);
                }
            } else if (arrayList != null) {
                arrayList.add(c3655d);
            }
            i10++;
        }
        if (arrayList != null) {
            C3655d[] c3655dArr = new C3655d[arrayList.size()];
            arrayList.toArray(c3655dArr);
            this.addresses = c3655dArr;
        }
    }

    private void initStreams() {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.session.f19287a, "mail.debug.quote", false);
        TraceInputStream traceInputStream = new TraceInputStream(this.serverSocket.getInputStream(), this.traceLogger);
        this.traceInput = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.serverSocket.getOutputStream(), this.traceLogger);
        this.traceOutput = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.serverOutput = new BufferedOutputStream(this.traceOutput);
        this.serverInput = new BufferedInputStream(this.traceInput);
        this.lineInputStream = new LineInputStream(this.serverInput);
    }

    private boolean is8Bit(InputStream inputStream) throws IOException {
        boolean z6 = false;
        int i10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read();
                if (i11 < 0) {
                    if (z6) {
                        this.logger.fine("found an 8bit part");
                    }
                    return z6;
                }
                int i12 = i11 & 255;
                if (i12 == 13 || i12 == 10) {
                    i10 = 0;
                } else if (i12 == 0 || (i10 = i10 + 1) > 998) {
                    return false;
                }
                if (i12 > 127) {
                    z6 = true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    private boolean isNotLastLine(String str) {
        return str != null && str.length() >= 4 && str.charAt(3) == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isTracing() {
        return this.traceLogger.isLoggable(Level.FINEST);
    }

    private void issueSendCommand(String str, int i10) throws IOException, NumberFormatException, MessagingException {
        sendCommand(str);
        int serverResponse = readServerResponse();
        if (serverResponse != i10) {
            AbstractC3633a[] abstractC3633aArr = this.validSentAddr;
            int length = abstractC3633aArr == null ? 0 : abstractC3633aArr.length;
            AbstractC3633a[] abstractC3633aArr2 = this.validUnsentAddr;
            int length2 = abstractC3633aArr2 == null ? 0 : abstractC3633aArr2.length;
            AbstractC3633a[] abstractC3633aArr3 = new AbstractC3633a[length + length2];
            if (length > 0) {
                System.arraycopy(abstractC3633aArr, 0, abstractC3633aArr3, 0, length);
            }
            if (length2 > 0) {
                System.arraycopy(this.validUnsentAddr, 0, abstractC3633aArr3, length, length2);
            }
            this.validSentAddr = null;
            this.validUnsentAddr = abstractC3633aArr3;
            if (this.logger.isLoggable(Level.FINE)) {
                MailLogger mailLogger = this.logger;
                StringBuilder sbM4567n = AbstractC1452a.m4567n(serverResponse, "got response code ", ", with response: ");
                sbM4567n.append(this.lastServerResponse);
                mailLogger.fine(sbM4567n.toString());
            }
            String str2 = this.lastServerResponse;
            int i11 = this.lastReturnCode;
            if (this.serverSocket != null) {
                issueCommand("RSET", -1);
            }
            this.lastServerResponse = str2;
            this.lastReturnCode = i11;
            throw new SMTPSendFailedException(str, serverResponse, this.lastServerResponse, this.exception, this.validSentAddr, this.validUnsentAddr, this.invalidAddr);
        }
    }

    private String normalizeAddress(String str) {
        return (str.startsWith("<") || str.endsWith(">")) ? str : AbstractC5601a.m11238i("<", str, ">");
    }

    private void openServer(String str, int i10) throws IOException, MessagingException {
        int serverResponse;
        MailLogger mailLogger = this.logger;
        Level level = Level.FINE;
        if (mailLogger.isLoggable(level)) {
            MailLogger mailLogger2 = this.logger;
            StringBuilder sbM125p = AbstractC0030c.m125p(i10, "trying to connect to host \"", str, "\", port ", ", isSSL ");
            sbM125p.append(this.isSSL);
            mailLogger2.fine(sbM125p.toString());
        }
        try {
            Socket socket = SocketFetcher.getSocket(str, i10, this.session.f19287a, "mail." + this.name, this.isSSL);
            this.serverSocket = socket;
            int port = socket.getPort();
            this.host = str;
            initStreams();
            if (readServerResponse() == 220) {
                if (this.logger.isLoggable(level)) {
                    this.logger.fine("connected to host \"" + str + "\", port: " + port);
                    return;
                }
                return;
            }
            String str2 = this.lastServerResponse;
            try {
                try {
                    if (this.quitOnSessionReject) {
                        sendCommand("QUIT");
                        if (this.quitWait && (serverResponse = readServerResponse()) != 221 && serverResponse != -1 && this.logger.isLoggable(level)) {
                            this.logger.fine("QUIT failed with " + serverResponse);
                        }
                    }
                    this.serverSocket.close();
                    this.serverSocket = null;
                    this.serverOutput = null;
                } catch (Exception e2) {
                    MailLogger mailLogger3 = this.logger;
                    Level level2 = Level.FINE;
                    if (mailLogger3.isLoggable(level2)) {
                        this.logger.log(level2, "QUIT failed", (Throwable) e2);
                    }
                    this.serverSocket.close();
                    this.serverSocket = null;
                    this.serverOutput = null;
                }
                this.serverInput = null;
                this.lineInputStream = null;
                if (this.logger.isLoggable(Level.FINE)) {
                    this.logger.fine("got bad greeting from host \"" + str + "\", port: " + port + ", response: " + str2);
                }
                throw new MessagingException("Got bad greeting from SMTP host: " + str + ", port: " + port + ", response: " + str2);
            } catch (Throwable th2) {
                this.serverSocket.close();
                this.serverSocket = null;
                this.serverOutput = null;
                this.serverInput = null;
                this.lineInputStream = null;
                throw th2;
            }
        } catch (SocketConnectException e10) {
            throw new MailConnectException(e10);
        } catch (UnknownHostException e11) {
            throw new MessagingException(m0.m7378k("Unknown SMTP host: ", str), e11);
        } catch (IOException e12) {
            throw new MessagingException("Could not connect to SMTP host: " + str + ", port: " + i10, e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(true);
            this.traceOutput.setTrace(true);
        }
    }

    private boolean sasllogin(String[] strArr, String str, String str2, String str3, String str4) {
        ArrayList arrayList;
        String str5;
        String canonicalHostName = this.useCanonicalHostName ? this.serverSocket.getInetAddress().getCanonicalHostName() : this.host;
        if (this.saslAuthenticator == null) {
            try {
                int i10 = SMTPSaslAuthenticator.f7247a;
                this.saslAuthenticator = (SaslAuthenticator) SMTPSaslAuthenticator.class.getConstructor(SMTPTransport.class, String.class, Properties.class, MailLogger.class, String.class).newInstance(this, this.name, this.session.f19287a, this.logger, canonicalHostName);
            } catch (Exception e2) {
                this.logger.log(Level.FINE, "Can't load SASL authenticator", (Throwable) e2);
                return false;
            }
        }
        if (strArr == null || strArr.length <= 0) {
            arrayList = new ArrayList();
            Hashtable<String, String> hashtable = this.extMap;
            if (hashtable != null && (str5 = hashtable.get("AUTH")) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str5);
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(stringTokenizer.nextToken());
                }
            }
        } else {
            arrayList = new ArrayList(strArr.length);
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (supportsAuthentication(strArr[i11])) {
                    arrayList.add(strArr[i11]);
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        try {
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("SASL AUTH command trace suppressed");
                suspendTracing();
            }
            boolean zAuthenticate = this.saslAuthenticator.authenticate(strArr2, str, str2, str3, str4);
            resumeTracing();
            return zAuthenticate;
        } catch (Throwable th2) {
            resumeTracing();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void suspendTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(false);
            this.traceOutput.setTrace(false);
        }
    }

    private byte[] toBytes(String str) {
        return this.allowutf8 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str);
    }

    private String tracePassword(String str) {
        return this.debugpassword ? str : str == null ? "<null>" : "<non-null>";
    }

    private String traceUser(String str) {
        return this.debugusername ? str : "<user name suppressed>";
    }

    public static String xtext(String str) {
        return xtext(str, false);
    }

    public OutputStream bdat() {
        BDATOutputStream bDATOutputStream = new BDATOutputStream(this.serverOutput, this.chunkSize);
        this.dataStream = bDATOutputStream;
        return bDATOutputStream;
    }

    public void checkConnected() {
        if (!super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    @Override // jakarta.mail.AbstractC3695w, java.lang.AutoCloseable
    public synchronized void close() {
        int serverResponse;
        if (super.isConnected()) {
            try {
                if (this.serverSocket != null) {
                    sendCommand("QUIT");
                    if (this.quitWait && (serverResponse = readServerResponse()) != 221 && serverResponse != -1 && this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("QUIT failed with " + serverResponse);
                    }
                }
            } finally {
                closeConnection();
            }
        }
    }

    public synchronized void connect(Socket socket) {
        this.serverSocket = socket;
        super.connect();
    }

    public OutputStream data() throws IOException, NumberFormatException, MessagingException {
        issueSendCommand("DATA", 354);
        SMTPOutputStream sMTPOutputStream = new SMTPOutputStream(this.serverOutput);
        this.dataStream = sMTPOutputStream;
        return sMTPOutputStream;
    }

    public boolean ehlo(String str) throws IOException, NumberFormatException, MessagingException {
        sendCommand(str != null ? "EHLO ".concat(str) : "EHLO");
        int serverResponse = readServerResponse();
        if (serverResponse == 250) {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(this.lastServerResponse));
            this.extMap = new Hashtable<>();
            boolean z6 = true;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (z6) {
                        z6 = false;
                    } else if (line.length() >= 5) {
                        String strSubstring = line.substring(4);
                        int iIndexOf = strSubstring.indexOf(32);
                        String strSubstring2 = "";
                        if (iIndexOf > 0) {
                            strSubstring2 = strSubstring.substring(iIndexOf + 1);
                            strSubstring = strSubstring.substring(0, iIndexOf);
                        }
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("Found extension \"" + strSubstring + "\", arg \"" + strSubstring2 + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                        }
                        this.extMap.put(strSubstring.toUpperCase(Locale.ENGLISH), strSubstring2);
                    }
                } catch (IOException unused) {
                }
            }
        }
        return serverResponse == 250;
    }

    @Override // jakarta.mail.AbstractC3695w
    public void finalize() {
        try {
            closeConnection();
        } catch (MessagingException unused) {
        } finally {
            super.finalize();
        }
    }

    public void finishBdat() throws IOException {
        this.dataStream.ensureAtBOL();
        this.dataStream.close();
    }

    public void finishData() throws IOException, NumberFormatException, MessagingException {
        this.dataStream.ensureAtBOL();
        issueSendCommand(".", 250);
    }

    public synchronized String getAuthorizationId() {
        try {
            if (this.authorizationID == UNKNOWN) {
                this.authorizationID = this.session.f19287a.getProperty("mail." + this.name + ".sasl.authorizationid");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.authorizationID;
    }

    public String getExtensionParameter(String str) {
        Hashtable<String, String> hashtable = this.extMap;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str.toUpperCase(Locale.ENGLISH));
    }

    public synchronized int getLastReturnCode() {
        return this.lastReturnCode;
    }

    public synchronized String getLastServerResponse() {
        return this.lastServerResponse;
    }

    public synchronized String getLocalHost() {
        Socket socket;
        try {
            String str = this.localHostName;
            if (str == null || str.length() <= 0) {
                this.localHostName = this.session.f19287a.getProperty("mail." + this.name + ".localhost");
            }
            String str2 = this.localHostName;
            if (str2 == null || str2.length() <= 0) {
                this.localHostName = this.session.f19287a.getProperty("mail." + this.name + ".localaddress");
            }
            try {
                String str3 = this.localHostName;
                if (str3 == null || str3.length() <= 0) {
                    InetAddress localHost = InetAddress.getLocalHost();
                    String canonicalHostName = localHost.getCanonicalHostName();
                    this.localHostName = canonicalHostName;
                    if (canonicalHostName == null) {
                        this.localHostName = "[" + localHost.getHostAddress() + "]";
                    }
                }
            } catch (UnknownHostException unused) {
            }
            String str4 = this.localHostName;
            if ((str4 == null || str4.length() <= 0) && (socket = this.serverSocket) != null && socket.isBound()) {
                InetAddress localAddress = this.serverSocket.getLocalAddress();
                String canonicalHostName2 = localAddress.getCanonicalHostName();
                this.localHostName = canonicalHostName2;
                if (canonicalHostName2 == null) {
                    this.localHostName = "[" + localAddress.getHostAddress() + "]";
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.localHostName;
    }

    public synchronized String getNTLMDomain() {
        try {
            if (this.ntlmDomain == UNKNOWN) {
                this.ntlmDomain = this.session.f19287a.getProperty("mail." + this.name + ".auth.ntlm.domain");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.ntlmDomain;
    }

    public synchronized boolean getNoopStrict() {
        return this.noopStrict;
    }

    public synchronized boolean getReportSuccess() {
        return this.reportSuccess;
    }

    public synchronized boolean getRequireStartTLS() {
        return this.requireStartTLS;
    }

    public synchronized boolean getSASLEnabled() {
        return this.enableSASL;
    }

    public synchronized String[] getSASLMechanisms() {
        try {
            if (this.saslMechanisms == UNKNOWN_SA) {
                ArrayList arrayList = new ArrayList(5);
                String property = this.session.f19287a.getProperty("mail." + this.name + ".sasl.mechanisms");
                if (property != null && property.length() > 0) {
                    if (this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("SASL mechanisms allowed: ".concat(property));
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(property, " ,");
                    while (stringTokenizer.hasMoreTokens()) {
                        String strNextToken = stringTokenizer.nextToken();
                        if (strNextToken.length() > 0) {
                            arrayList.add(strNextToken);
                        }
                    }
                }
                String[] strArr = new String[arrayList.size()];
                this.saslMechanisms = strArr;
                arrayList.toArray(strArr);
            }
            String[] strArr2 = this.saslMechanisms;
            if (strArr2 == null) {
                return null;
            }
            return (String[]) strArr2.clone();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String getSASLRealm() {
        try {
            if (this.saslRealm == UNKNOWN) {
                String property = this.session.f19287a.getProperty("mail." + this.name + ".sasl.realm");
                this.saslRealm = property;
                if (property == null) {
                    this.saslRealm = this.session.f19287a.getProperty("mail." + this.name + ".saslrealm");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.saslRealm;
    }

    public synchronized boolean getStartTLS() {
        return this.useStartTLS;
    }

    public synchronized boolean getUseCanonicalHostName() {
        return this.useCanonicalHostName;
    }

    public synchronized boolean getUseRset() {
        return this.useRset;
    }

    public void helo(String str) {
        if (str != null) {
            issueCommand("HELO ".concat(str), 250);
        } else {
            issueCommand("HELO", 250);
        }
    }

    @Override // jakarta.mail.AbstractC3695w
    public synchronized boolean isConnected() {
        try {
            if (!super.isConnected()) {
                return false;
            }
            try {
                try {
                    if (this.useRset) {
                        sendCommand("RSET");
                    } else {
                        sendCommand("NOOP");
                    }
                    int serverResponse = readServerResponse();
                    if (serverResponse >= 0 && (!this.noopStrict ? serverResponse == 421 : serverResponse != 250)) {
                        return true;
                    }
                    try {
                        closeConnection();
                    } catch (MessagingException unused) {
                    }
                    return false;
                } catch (MessagingException unused2) {
                    return false;
                }
            } catch (Exception unused3) {
                closeConnection();
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isSSL() {
        return this.serverSocket instanceof SSLSocket;
    }

    public synchronized void issueCommand(String str, int i10) {
        sendCommand(str);
        int serverResponse = readServerResponse();
        if (i10 != -1 && serverResponse != i10) {
            throw new MessagingException(this.lastServerResponse);
        }
    }

    public void mailFrom() throws IOException, NumberFormatException, MessagingException {
        AbstractC3633a[] from;
        C3665n c3665n = this.message;
        String envelopeFrom = c3665n instanceof SMTPMessage ? ((SMTPMessage) c3665n).getEnvelopeFrom() : null;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            envelopeFrom = this.session.f19287a.getProperty(AbstractC1452a.m4564k(new StringBuilder("mail."), this.name, ".from"));
        }
        boolean z6 = false;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            C3665n c3665n2 = this.message;
            AbstractC3633a localAddress = (c3665n2 == null || (from = c3665n2.getFrom()) == null || from.length <= 0) ? C3655d.getLocalAddress(this.session) : from[0];
            if (localAddress == null) {
                throw new MessagingException("can't determine local email address");
            }
            envelopeFrom = ((C3655d) localAddress).getAddress();
        }
        String strM7379l = "MAIL FROM:" + normalizeAddress(envelopeFrom);
        if (this.allowutf8 && supportsExtension("SMTPUTF8")) {
            strM7379l = AbstractC1452a.m4561h(strM7379l, " SMTPUTF8");
        }
        if (supportsExtension("DSN")) {
            C3665n c3665n3 = this.message;
            String dSNRet = c3665n3 instanceof SMTPMessage ? ((SMTPMessage) c3665n3).getDSNRet() : null;
            if (dSNRet == null) {
                dSNRet = this.session.f19287a.getProperty(AbstractC1452a.m4564k(new StringBuilder("mail."), this.name, ".dsn.ret"));
            }
            if (dSNRet != null) {
                strM7379l = m0.m7379l(strM7379l, " RET=", dSNRet);
            }
        }
        if (supportsExtension("AUTH")) {
            C3665n c3665n4 = this.message;
            String submitter = c3665n4 instanceof SMTPMessage ? ((SMTPMessage) c3665n4).getSubmitter() : null;
            if (submitter == null) {
                submitter = this.session.f19287a.getProperty(AbstractC1452a.m4564k(new StringBuilder("mail."), this.name, ".submitter"));
            }
            if (submitter != null) {
                try {
                    if (this.allowutf8 && supportsExtension("SMTPUTF8")) {
                        z6 = true;
                    }
                    strM7379l = strM7379l + " AUTH=" + xtext(submitter, z6);
                } catch (IllegalArgumentException e2) {
                    MailLogger mailLogger = this.logger;
                    Level level = Level.FINE;
                    if (mailLogger.isLoggable(level)) {
                        this.logger.log(level, "ignoring invalid submitter: ".concat(submitter), (Throwable) e2);
                    }
                }
            }
        }
        C3665n c3665n5 = this.message;
        String mailExtension = c3665n5 instanceof SMTPMessage ? ((SMTPMessage) c3665n5).getMailExtension() : null;
        if (mailExtension == null) {
            mailExtension = this.session.f19287a.getProperty(AbstractC1452a.m4564k(new StringBuilder("mail."), this.name, ".mailextension"));
        }
        if (mailExtension != null && mailExtension.length() > 0) {
            strM7379l = m0.m7379l(strM7379l, " ", mailExtension);
        }
        try {
            issueSendCommand(strM7379l, 250);
        } catch (SMTPSendFailedException e10) {
            int returnCode = e10.getReturnCode();
            if (returnCode == 501 || returnCode == 503 || returnCode == 553 || returnCode == 550 || returnCode == 551) {
                try {
                    e10.setNextException(new SMTPSenderFailedException(new C3655d(envelopeFrom), strM7379l, returnCode, e10.getMessage()));
                } catch (AddressException unused) {
                }
            }
            throw e10;
        }
    }

    @Override // jakarta.mail.f0
    public void notifyTransportListeners(int i10, AbstractC3633a[] abstractC3633aArr, AbstractC3633a[] abstractC3633aArr2, AbstractC3633a[] abstractC3633aArr3, AbstractC3682n abstractC3682n) {
        if (this.notificationDone) {
            return;
        }
        super.notifyTransportListeners(i10, abstractC3633aArr, abstractC3633aArr2, abstractC3633aArr3, abstractC3682n);
        this.notificationDone = true;
    }

    @Override // jakarta.mail.AbstractC3695w
    public synchronized boolean protocolConnect(String str, int i10, String str2, String str3) {
        Properties properties = this.session.f19287a;
        boolean booleanProperty = PropUtil.getBooleanProperty(properties, "mail." + this.name + ".auth", false);
        if (booleanProperty && (str2 == null || str3 == null)) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("need username and password for authentication");
                this.logger.fine("protocolConnect returning false, host=" + str + ", user=" + traceUser(str2) + ", password=" + tracePassword(str3));
            }
            return false;
        }
        boolean booleanProperty2 = PropUtil.getBooleanProperty(properties, "mail." + this.name + ".ehlo", true);
        MailLogger mailLogger = this.logger;
        Level level = Level.FINE;
        if (mailLogger.isLoggable(level)) {
            this.logger.fine("useEhlo " + booleanProperty2 + ", useAuth " + booleanProperty);
        }
        if (i10 == -1) {
            i10 = PropUtil.getIntProperty(properties, "mail." + this.name + ".port", -1);
        }
        if (i10 == -1) {
            i10 = this.defaultPort;
        }
        if (str == null || str.length() == 0) {
            str = "localhost";
        }
        try {
            if (this.serverSocket != null) {
                openServer();
            } else {
                openServer(str, i10);
            }
            if (!(booleanProperty2 ? ehlo(getLocalHost()) : false)) {
                helo(getLocalHost());
            }
            if (this.useStartTLS || this.requireStartTLS) {
                if (this.serverSocket instanceof SSLSocket) {
                    this.logger.fine("STARTTLS requested but already using SSL");
                } else if (supportsExtension("STARTTLS")) {
                    startTLS();
                    ehlo(getLocalHost());
                } else if (this.requireStartTLS) {
                    this.logger.fine("STARTTLS required but not supported");
                    throw new MessagingException("STARTTLS is required but host does not support STARTTLS");
                }
            }
            if (this.allowutf8 && !supportsExtension("SMTPUTF8")) {
                this.logger.log(Level.INFO, "mail.mime.allowutf8 set but server doesn't advertise SMTPUTF8 support");
            }
            if ((!booleanProperty && (str2 == null || str3 == null)) || (!supportsExtension("AUTH") && !supportsExtension("AUTH=LOGIN"))) {
                return true;
            }
            if (this.logger.isLoggable(level)) {
                this.logger.fine("protocolConnect login, host=" + str + ", user=" + traceUser(str2) + ", password=" + tracePassword(str3));
            }
            boolean zAuthenticate = authenticate(str2, str3);
            if (!zAuthenticate) {
                try {
                    closeConnection();
                } catch (MessagingException unused) {
                }
            }
            return zAuthenticate;
        } catch (Throwable th2) {
            try {
                closeConnection();
            } catch (MessagingException unused2) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1 A[PHI: r9 r10
      0x00f1: PHI (r9v3 java.lang.Exception) = (r9v2 java.lang.Exception), (r9v6 java.lang.Exception), (r9v8 java.lang.Exception), (r9v12 java.lang.Exception) binds: [B:79:0x0165, B:72:0x014f, B:66:0x013b, B:52:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r10v6 boolean) = (r10v1 boolean), (r10v7 boolean), (r10v9 boolean), (r10v11 boolean) binds: [B:79:0x0165, B:72:0x014f, B:66:0x013b, B:52:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void rcptTo() throws java.io.IOException, java.lang.NumberFormatException, jakarta.mail.MessagingException {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.rcptTo():void");
    }

    public int readServerResponse() throws NumberFormatException, MessagingException {
        String line;
        int i10;
        StringBuilder sb2 = new StringBuilder(100);
        do {
            try {
                line = this.lineInputStream.readLine();
                if (line == null) {
                    String string = sb2.toString();
                    if (string.length() == 0) {
                        string = "[EOF]";
                    }
                    this.lastServerResponse = string;
                    this.lastReturnCode = -1;
                    this.logger.log(Level.FINE, "EOF: {0}", string);
                    return -1;
                }
                sb2.append(line);
                sb2.append("\n");
            } catch (IOException e2) {
                this.logger.log(Level.FINE, "exception reading response", (Throwable) e2);
                this.lastServerResponse = "";
                this.lastReturnCode = 0;
                throw new MessagingException("Exception reading response", e2);
            }
        } while (isNotLastLine(line));
        String string2 = sb2.toString();
        if (string2.length() >= 3) {
            try {
                try {
                    try {
                        i10 = Integer.parseInt(string2.substring(0, 3));
                    } catch (MessagingException e10) {
                        this.logger.log(Level.FINE, "close failed", (Throwable) e10);
                    }
                } catch (MessagingException e11) {
                    this.logger.log(Level.FINE, "close failed", (Throwable) e11);
                }
            } catch (NumberFormatException unused) {
                close();
            } catch (StringIndexOutOfBoundsException unused2) {
                close();
            }
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            this.logger.log(Level.FINE, "bad server response: {0}", string2);
        }
        this.lastServerResponse = string2;
        this.lastReturnCode = i10;
        return i10;
    }

    public void sendCommand(String str) throws IOException, MessagingException {
        sendCommand(toBytes(str));
    }

    @Override // jakarta.mail.f0
    public synchronized void sendMessage(AbstractC3682n abstractC3682n, AbstractC3633a[] abstractC3633aArr) {
        String subject;
        if (abstractC3682n != null) {
            try {
                subject = abstractC3682n.getSubject();
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            subject = "";
        }
        sendMessageStart(subject);
        checkConnected();
        if (!(abstractC3682n instanceof C3665n)) {
            this.logger.fine("Can only send RFC822 msgs");
            throw new MessagingException("SMTP can only send RFC822 messages");
        }
        if (abstractC3633aArr == null || abstractC3633aArr.length == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        for (int i10 = 0; i10 < abstractC3633aArr.length; i10++) {
            if (!(abstractC3633aArr[i10] instanceof C3655d)) {
                throw new MessagingException(abstractC3633aArr[i10] + " is not an InternetAddress");
            }
        }
        this.message = (C3665n) abstractC3682n;
        this.addresses = abstractC3633aArr;
        this.validUnsentAddr = abstractC3633aArr;
        expandGroups();
        boolean allow8bitMIME = abstractC3682n instanceof SMTPMessage ? ((SMTPMessage) abstractC3682n).getAllow8bitMIME() : false;
        if (!allow8bitMIME) {
            allow8bitMIME = PropUtil.getBooleanProperty(this.session.f19287a, "mail." + this.name + ".allow8bitmime", false);
        }
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("use8bit " + allow8bitMIME);
        }
        if (allow8bitMIME && supportsExtension("8BITMIME") && convertTo8Bit(this.message)) {
            try {
                this.message.saveChanges();
            } catch (MessagingException unused) {
            }
        }
        try {
            try {
                mailFrom();
                rcptTo();
                if (this.chunkSize <= 0 || !supportsExtension("CHUNKING")) {
                    this.message.writeTo(data(), ignoreList);
                    finishData();
                } else {
                    this.message.writeTo(bdat(), ignoreList);
                    finishBdat();
                }
                if (this.sendPartiallyFailed) {
                    this.logger.fine("Sending partially failed because of invalid destination addresses");
                    notifyTransportListeners(3, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
                    throw new SMTPSendFailedException(".", this.lastReturnCode, this.lastServerResponse, this.exception, this.validSentAddr, this.validUnsentAddr, this.invalidAddr);
                }
                this.logger.fine("message successfully delivered to mail server");
                notifyTransportListeners(1, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
                this.invalidAddr = null;
                this.validUnsentAddr = null;
                this.validSentAddr = null;
                this.addresses = null;
                this.message = null;
                this.exception = null;
                this.sendPartiallyFailed = false;
                this.notificationDone = false;
                sendMessageEnd();
            } finally {
                this.invalidAddr = null;
                this.validUnsentAddr = null;
                this.validSentAddr = null;
                this.addresses = null;
                this.message = null;
                this.exception = null;
                this.sendPartiallyFailed = false;
                this.notificationDone = false;
            }
        } catch (MessagingException e2) {
            this.logger.log(Level.FINE, "MessagingException while sending", (Throwable) e2);
            if (e2.getNextException() instanceof IOException) {
                this.logger.fine("nested IOException, closing");
                try {
                    closeConnection();
                } catch (MessagingException unused2) {
                }
            }
            addressesFailed();
            notifyTransportListeners(2, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
            throw e2;
        } catch (IOException e10) {
            this.logger.log(Level.FINE, "IOException while sending, closing", (Throwable) e10);
            try {
                closeConnection();
            } catch (MessagingException unused3) {
            }
            addressesFailed();
            notifyTransportListeners(2, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
            throw new MessagingException("IOException while sending message", e10);
        }
    }

    public synchronized void setAuthorizationID(String str) {
        this.authorizationID = str;
    }

    public synchronized void setLocalHost(String str) {
        this.localHostName = str;
    }

    public synchronized void setNTLMDomain(String str) {
        this.ntlmDomain = str;
    }

    public synchronized void setNoopStrict(boolean z6) {
        this.noopStrict = z6;
    }

    public synchronized void setReportSuccess(boolean z6) {
        this.reportSuccess = z6;
    }

    public synchronized void setRequireStartTLS(boolean z6) {
        this.requireStartTLS = z6;
    }

    public synchronized void setSASLEnabled(boolean z6) {
        this.enableSASL = z6;
    }

    public synchronized void setSASLMechanisms(String[] strArr) {
        if (strArr != null) {
            try {
                strArr = (String[]) strArr.clone();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.saslMechanisms = strArr;
    }

    public synchronized void setSASLRealm(String str) {
        this.saslRealm = str;
    }

    public synchronized void setStartTLS(boolean z6) {
        this.useStartTLS = z6;
    }

    public synchronized void setUseCanonicalHostName(boolean z6) {
        this.useCanonicalHostName = z6;
    }

    public synchronized void setUseRset(boolean z6) {
        this.useRset = z6;
    }

    public synchronized int simpleCommand(String str) {
        sendCommand(str);
        return readServerResponse();
    }

    public void startTLS() throws MessagingException {
        issueCommand("STARTTLS", 220);
        try {
            this.serverSocket = SocketFetcher.startTLS(this.serverSocket, this.host, this.session.f19287a, "mail." + this.name);
            initStreams();
        } catch (IOException e2) {
            closeConnection();
            throw new MessagingException("Could not convert socket to TLS", e2);
        }
    }

    public boolean supportsAuthentication(String str) {
        String str2;
        Hashtable<String, String> hashtable = this.extMap;
        if (hashtable == null || (str2 = hashtable.get("AUTH")) == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (!str.equalsIgnoreCase("LOGIN") || !supportsExtension("AUTH=LOGIN")) {
            return false;
        }
        this.logger.fine("use AUTH=LOGIN hack");
        return true;
    }

    public boolean supportsExtension(String str) {
        Hashtable<String, String> hashtable = this.extMap;
        return (hashtable == null || hashtable.get(str.toUpperCase(Locale.ENGLISH)) == null) ? false : true;
    }

    public SMTPTransport(c0 c0Var, h0 h0Var, String str, boolean z6) {
        super(c0Var, h0Var);
        this.name = "smtp";
        this.defaultPort = 25;
        this.isSSL = false;
        this.sendPartiallyFailed = false;
        this.authenticators = new HashMap();
        this.quitWait = false;
        this.quitOnSessionReject = false;
        this.saslRealm = UNKNOWN;
        this.authorizationID = UNKNOWN;
        this.enableSASL = false;
        this.useCanonicalHostName = false;
        this.saslMechanisms = UNKNOWN_SA;
        this.ntlmDomain = UNKNOWN;
        this.noopStrict = true;
        this.noauthdebug = true;
        Properties properties = c0Var.f19287a;
        MailLogger mailLogger = new MailLogger(getClass(), "DEBUG SMTP", c0Var.m8181b(), c0Var.m8182c());
        this.logger = mailLogger;
        this.traceLogger = mailLogger.getSubLogger("protocol", null);
        this.noauthdebug = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        this.debugusername = PropUtil.getBooleanProperty(properties, "mail.debug.auth.username", true);
        this.debugpassword = PropUtil.getBooleanProperty(properties, "mail.debug.auth.password", false);
        str = h0Var != null ? h0Var.f19313b : str;
        this.name = str;
        z6 = z6 ? z6 : AbstractC0030c.m134y("mail.", str, ".ssl.enable", properties, false);
        if (z6) {
            this.defaultPort = 465;
        } else {
            this.defaultPort = 25;
        }
        this.isSSL = z6;
        this.quitWait = AbstractC0030c.m134y("mail.", str, ".quitwait", properties, true);
        this.quitOnSessionReject = AbstractC0030c.m134y("mail.", str, ".quitonsessionreject", properties, false);
        this.reportSuccess = AbstractC0030c.m134y("mail.", str, ".reportsuccess", properties, false);
        this.useStartTLS = AbstractC0030c.m134y("mail.", str, ".starttls.enable", properties, false);
        this.requireStartTLS = AbstractC0030c.m134y("mail.", str, ".starttls.required", properties, false);
        this.useRset = AbstractC0030c.m134y("mail.", str, ".userset", properties, false);
        this.noopStrict = AbstractC0030c.m134y("mail.", str, ".noop.strict", properties, true);
        boolean zM134y = AbstractC0030c.m134y("mail.", str, ".sasl.enable", properties, false);
        this.enableSASL = zM134y;
        if (zM134y) {
            this.logger.config("enable SASL");
        }
        boolean zM134y2 = AbstractC0030c.m134y("mail.", str, ".sasl.usecanonicalhostname", properties, false);
        this.useCanonicalHostName = zM134y2;
        if (zM134y2) {
            this.logger.config("use canonical host name");
        }
        boolean booleanProperty = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        this.allowutf8 = booleanProperty;
        if (booleanProperty) {
            this.logger.config("allow UTF-8");
        }
        int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".chunksize", -1);
        this.chunkSize = intProperty;
        if (intProperty > 0 && this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config("chunk size " + this.chunkSize);
        }
        Authenticator[] authenticatorArr = {new LoginAuthenticator(), new PlainAuthenticator(), new DigestMD5Authenticator(), new NtlmAuthenticator(), new OAuth2Authenticator()};
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            this.authenticators.put(authenticatorArr[i10].getMechanism(), authenticatorArr[i10]);
            sb2.append(authenticatorArr[i10].getMechanism());
            sb2.append(' ');
        }
        this.defaultAuthenticationMechanisms = sb2.toString();
    }

    private void sendCommand(byte[] bArr) throws IOException, MessagingException {
        try {
            this.serverOutput.write(bArr);
            this.serverOutput.write(CRLF);
            this.serverOutput.flush();
        } catch (IOException e2) {
            throw new MessagingException("Can't send command to SMTP host", e2);
        }
    }

    public static String xtext(String str, boolean z6) {
        byte[] bytes = z6 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str);
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < bytes.length; i10++) {
            char c2 = (char) (bytes[i10] & 255);
            if (!z6 && c2 >= 128) {
                throw new IllegalArgumentException(m0.m7378k("Non-ASCII character in SMTP submitter: ", str));
            }
            if (c2 < '!' || c2 > '~' || c2 == '+' || c2 == '=') {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length() + 4);
                    sb2.append(str.substring(0, i10));
                }
                sb2.append('+');
                sb2.append(hexchar[(c2 & 240) >> 4]);
                sb2.append(hexchar[c2 & 15]);
            } else if (sb2 != null) {
                sb2.append(c2);
            }
        }
        return sb2 != null ? sb2.toString() : str;
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public class ChunkedOutputStream extends OutputStream {
        private final byte[] buf;
        private int count = 0;
        private final OutputStream out;

        public ChunkedOutputStream(OutputStream outputStream, int i10) {
            this.out = outputStream;
            this.buf = new byte[i10];
        }

        private void bdat(byte[] bArr, int i10, int i11, boolean z6) throws IOException {
            if (i11 > 0 || z6) {
                try {
                    if (z6) {
                        SMTPTransport.this.sendCommand("BDAT " + i11 + " LAST");
                    } else {
                        SMTPTransport.this.sendCommand("BDAT " + i11);
                    }
                    this.out.write(bArr, i10, i11);
                    this.out.flush();
                    if (SMTPTransport.this.readServerResponse() == 250) {
                    } else {
                        throw new IOException(SMTPTransport.this.lastServerResponse);
                    }
                } catch (MessagingException e2) {
                    throw new IOException("BDAT write exception", e2);
                }
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            bdat(this.buf, 0, this.count, true);
            this.count = 0;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            bdat(this.buf, 0, this.count, false);
            this.count = 0;
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            byte[] bArr = this.buf;
            int i11 = this.count;
            int i12 = i11 + 1;
            this.count = i12;
            bArr[i11] = (byte) i10;
            if (i12 >= bArr.length) {
                flush();
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            while (i11 > 0) {
                int iMin = Math.min(this.buf.length - this.count, i11);
                byte[] bArr2 = this.buf;
                if (iMin == bArr2.length) {
                    bdat(bArr, i10, iMin, false);
                } else {
                    System.arraycopy(bArr, i10, bArr2, this.count, iMin);
                    this.count += iMin;
                }
                i10 += iMin;
                i11 -= iMin;
                if (this.count >= this.buf.length) {
                    flush();
                }
            }
        }
    }

    public int simpleCommand(byte[] bArr) throws IOException, MessagingException {
        sendCommand(bArr);
        return readServerResponse();
    }

    private void sendMessageEnd() {
    }

    private void sendMessageStart(String str) {
    }

    private void openServer() throws NumberFormatException, IOException, MessagingException {
        int serverResponse;
        this.host = UNKNOWN;
        int i10 = -1;
        try {
            int port = this.serverSocket.getPort();
            try {
                this.host = this.serverSocket.getInetAddress().getHostName();
                MailLogger mailLogger = this.logger;
                Level level = Level.FINE;
                if (mailLogger.isLoggable(level)) {
                    this.logger.fine("starting protocol to host \"" + this.host + "\", port " + port);
                }
                initStreams();
                int serverResponse2 = readServerResponse();
                if (serverResponse2 != 220) {
                    try {
                        try {
                            if (this.quitOnSessionReject) {
                                sendCommand("QUIT");
                                if (this.quitWait && (serverResponse = readServerResponse()) != 221 && serverResponse != -1 && this.logger.isLoggable(level)) {
                                    this.logger.fine("QUIT failed with " + serverResponse);
                                }
                            }
                            this.serverSocket.close();
                            this.serverSocket = null;
                            this.serverOutput = null;
                        } catch (Exception e2) {
                            MailLogger mailLogger2 = this.logger;
                            Level level2 = Level.FINE;
                            if (mailLogger2.isLoggable(level2)) {
                                this.logger.log(level2, "QUIT failed", (Throwable) e2);
                            }
                            this.serverSocket.close();
                            this.serverSocket = null;
                            this.serverOutput = null;
                        }
                        this.serverInput = null;
                        this.lineInputStream = null;
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("got bad greeting from host \"" + this.host + "\", port: " + port + ", response: " + serverResponse2);
                        }
                        throw new MessagingException("Got bad greeting from SMTP host: " + this.host + ", port: " + port + ", response: " + serverResponse2);
                    } catch (Throwable th2) {
                        this.serverSocket.close();
                        this.serverSocket = null;
                        this.serverOutput = null;
                        this.serverInput = null;
                        this.lineInputStream = null;
                        throw th2;
                    }
                }
                if (this.logger.isLoggable(level)) {
                    this.logger.fine("protocol started to host \"" + this.host + "\", port: " + port);
                }
            } catch (IOException e10) {
                e = e10;
                i10 = port;
                throw new MessagingException("Could not start protocol to SMTP host: " + this.host + ", port: " + i10, e);
            }
        } catch (IOException e11) {
            e = e11;
        }
    }
}
