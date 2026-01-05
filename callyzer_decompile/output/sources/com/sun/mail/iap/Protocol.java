package com.sun.mail.iap;

import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Protocol {
    private final List<ResponseHandler> handlers;
    protected String host;
    private volatile ResponseInputStream input;
    private String localHostName;
    protected MailLogger logger;
    private volatile DataOutputStream output;
    protected String prefix;
    protected Properties props;
    protected boolean quote;
    private Socket socket;
    private int tagCounter;
    private final String tagPrefix;
    private volatile long timestamp;
    private TraceInputStream traceInput;
    protected MailLogger traceLogger;
    private TraceOutputStream traceOutput;
    static final AtomicInteger tagNum = new AtomicInteger();
    private static final byte[] CRLF = {13, 10};

    public Protocol(String str, int i10, Properties properties, String str2, boolean z6, MailLogger mailLogger) {
        this.tagCounter = 0;
        this.handlers = new CopyOnWriteArrayList();
        this.tagPrefix = computePrefix(properties, str2);
        try {
            this.host = str;
            this.props = properties;
            this.prefix = str2;
            this.logger = mailLogger;
            this.traceLogger = mailLogger.getSubLogger("protocol", null);
            this.socket = SocketFetcher.getSocket(str, i10, properties, str2, z6);
            this.quote = PropUtil.getBooleanProperty(properties, "mail.debug.quote", false);
            initStreams();
            processGreeting(readResponse());
            this.timestamp = System.currentTimeMillis();
        } catch (Throwable th2) {
            disconnect();
            throw th2;
        }
    }

    private String computePrefix(Properties properties, String str) {
        if (PropUtil.getBooleanProperty(properties, str + ".reusetagprefix", false)) {
            return "A";
        }
        int andIncrement = tagNum.getAndIncrement() % 18278;
        if (andIncrement < 26) {
            return new String(new char[]{(char) (andIncrement + 65)});
        }
        if (andIncrement < 702) {
            int i10 = andIncrement - 26;
            return new String(new char[]{(char) ((i10 / 26) + 65), (char) ((i10 % 26) + 65)});
        }
        int i11 = andIncrement - 702;
        return new String(new char[]{(char) ((i11 / 676) + 65), (char) (((i11 % 676) / 26) + 65), (char) ((i11 % 26) + 65)});
    }

    private static SocketChannel findSocketChannel(Socket socket) throws NoSuchFieldException, SecurityException {
        SocketChannel channel;
        for (Class<?> superclass = socket.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("socket");
                declaredField.setAccessible(true);
                channel = ((Socket) declaredField.get(socket)).getChannel();
            } catch (Exception unused) {
            }
            if (channel != null) {
                return channel;
            }
        }
        for (Class<?> superclass2 = socket.getClass(); superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
            try {
                for (Field field : superclass2.getDeclaredFields()) {
                    if (Socket.class.isAssignableFrom(field.getType())) {
                        try {
                            field.setAccessible(true);
                            SocketChannel channel2 = ((Socket) field.get(socket)).getChannel();
                            if (channel2 != null) {
                                return channel2;
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    private void initStreams() {
        TraceInputStream traceInputStream = new TraceInputStream(this.socket.getInputStream(), this.traceLogger);
        this.traceInput = traceInputStream;
        traceInputStream.setQuote(this.quote);
        this.input = new ResponseInputStream(this.traceInput);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.socket.getOutputStream(), this.traceLogger);
        this.traceOutput = traceOutputStream;
        traceOutputStream.setQuote(this.quote);
        this.output = new DataOutputStream(new BufferedOutputStream(this.traceOutput));
    }

    public void addResponseHandler(ResponseHandler responseHandler) {
        this.handlers.add(responseHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:17:0x0029, B:18:0x002d, B:21:0x0035, B:23:0x003e, B:32:0x005d, B:33:0x0060, B:27:0x004a, B:30:0x0057, B:10:0x0014, B:14:0x001f), top: B:38:0x0001, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.sun.mail.iap.Response[] command(java.lang.String r8, com.sun.mail.iap.Argument r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.commandStart(r8)     // Catch: java.lang.Throwable -> L11
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            r2 = 1
            java.lang.String r8 = r7.writeCommand(r8, r9)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13 com.sun.mail.iap.LiteralException -> L1e
            r9 = 0
            goto L27
        L11:
            r8 = move-exception
            goto L74
        L13:
            r8 = move-exception
            com.sun.mail.iap.Response r8 = com.sun.mail.iap.Response.byeResponse(r8)     // Catch: java.lang.Throwable -> L11
            r0.add(r8)     // Catch: java.lang.Throwable -> L11
        L1b:
            r8 = r1
        L1c:
            r9 = r2
            goto L27
        L1e:
            r8 = move-exception
            com.sun.mail.iap.Response r8 = r8.getResponse()     // Catch: java.lang.Throwable -> L11
            r0.add(r8)     // Catch: java.lang.Throwable -> L11
            goto L1b
        L27:
            if (r9 != 0) goto L5b
            com.sun.mail.iap.Response r3 = r7.readResponse()     // Catch: java.lang.Throwable -> L11 com.sun.mail.iap.ProtocolException -> L49 java.io.IOException -> L54
            boolean r4 = r3.isBYE()     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L35
            r1 = r3
            goto L27
        L35:
            r0.add(r3)     // Catch: java.lang.Throwable -> L11
            boolean r4 = r3.isTagged()     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L27
            java.lang.String r3 = r3.getTag()     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L27
            goto L1c
        L49:
            r3 = move-exception
            com.sun.mail.util.MailLogger r4 = r7.logger     // Catch: java.lang.Throwable -> L11
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = "ignoring bad response"
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L11
            goto L27
        L54:
            r8 = move-exception
            if (r1 != 0) goto L5b
            com.sun.mail.iap.Response r1 = com.sun.mail.iap.Response.byeResponse(r8)     // Catch: java.lang.Throwable -> L11
        L5b:
            if (r1 == 0) goto L60
            r0.add(r1)     // Catch: java.lang.Throwable -> L11
        L60:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L11
            com.sun.mail.iap.Response[] r8 = new com.sun.mail.iap.Response[r8]     // Catch: java.lang.Throwable -> L11
            r0.toArray(r8)     // Catch: java.lang.Throwable -> L11
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11
            r7.timestamp = r0     // Catch: java.lang.Throwable -> L11
            r7.commandEnd()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r7)
            return r8
        L74:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.iap.Protocol.command(java.lang.String, com.sun.mail.iap.Argument):com.sun.mail.iap.Response[]");
    }

    public synchronized void disconnect() {
        Socket socket = this.socket;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            this.socket = null;
        }
    }

    public void finalize() throws Throwable {
        try {
            disconnect();
        } finally {
            super.finalize();
        }
    }

    public SocketChannel getChannel() {
        SocketChannel channel = this.socket.getChannel();
        if (channel != null) {
            return channel;
        }
        Socket socket = this.socket;
        return socket instanceof SSLSocket ? findSocketChannel(socket) : channel;
    }

    public InetAddress getInetAddress() {
        return this.socket.getInetAddress();
    }

    public ResponseInputStream getInputStream() {
        return this.input;
    }

    public synchronized String getLocalHost() {
        Socket socket;
        try {
            String str = this.localHostName;
            if (str == null || str.length() <= 0) {
                this.localHostName = this.props.getProperty(this.prefix + ".localhost");
            }
            String str2 = this.localHostName;
            if (str2 == null || str2.length() <= 0) {
                this.localHostName = this.props.getProperty(this.prefix + ".localaddress");
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
            if ((str4 == null || str4.length() <= 0) && (socket = this.socket) != null && socket.isBound()) {
                InetAddress localAddress = this.socket.getLocalAddress();
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

    public SocketAddress getLocalSocketAddress() {
        return this.socket.getLocalSocketAddress();
    }

    public OutputStream getOutputStream() {
        return this.output;
    }

    public ByteArray getResponseBuffer() {
        return null;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void handleResult(Response response) throws CommandFailedException, BadCommandException, ConnectionException {
        if (response.isOK()) {
            return;
        }
        if (response.isNO()) {
            throw new CommandFailedException(response);
        }
        if (response.isBAD()) {
            throw new BadCommandException(response);
        }
        if (response.isBYE()) {
            disconnect();
            throw new ConnectionException(this, response);
        }
    }

    public boolean hasResponse() {
        try {
            return this.input.available() > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean isSSL() {
        return this.socket instanceof SSLSocket;
    }

    public boolean isTracing() {
        return this.traceLogger.isLoggable(Level.FINEST);
    }

    public void notifyResponseHandlers(Response[] responseArr) {
        if (this.handlers.isEmpty()) {
            return;
        }
        for (Response response : responseArr) {
            if (response != null) {
                for (ResponseHandler responseHandler : this.handlers) {
                    if (responseHandler != null) {
                        responseHandler.handleResponse(response);
                    }
                }
            }
        }
    }

    public void processGreeting(Response response) throws ConnectionException {
        if (response.isBYE()) {
            throw new ConnectionException(this, response);
        }
    }

    public Response readResponse() {
        return new Response(this);
    }

    public void removeResponseHandler(ResponseHandler responseHandler) {
        this.handlers.remove(responseHandler);
    }

    public void resumeTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(true);
            this.traceOutput.setTrace(true);
        }
    }

    public void simpleCommand(String str, Argument argument) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrCommand = command(str, argument);
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
    }

    public synchronized void startCompression(String str) {
        try {
            simpleCommand(str, null);
            TraceInputStream traceInputStream = new TraceInputStream(new InflaterInputStream(this.socket.getInputStream(), new Inflater(true)), this.traceLogger);
            this.traceInput = traceInputStream;
            traceInputStream.setQuote(this.quote);
            this.input = new ResponseInputStream(this.traceInput);
            int intProperty = PropUtil.getIntProperty(this.props, this.prefix + ".compress.level", -1);
            int intProperty2 = PropUtil.getIntProperty(this.props, this.prefix + ".compress.strategy", 0);
            MailLogger mailLogger = this.logger;
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                this.logger.log(level, "Creating Deflater with compression level {0} and strategy {1}", Integer.valueOf(intProperty), Integer.valueOf(intProperty2));
            }
            Deflater deflater = new Deflater(-1, true);
            try {
                deflater.setLevel(intProperty);
            } catch (IllegalArgumentException e2) {
                this.logger.log(Level.FINE, "Ignoring bad compression level", (Throwable) e2);
            }
            try {
                deflater.setStrategy(intProperty2);
            } catch (IllegalArgumentException e10) {
                this.logger.log(Level.FINE, "Ignoring bad compression strategy", (Throwable) e10);
            }
            TraceOutputStream traceOutputStream = new TraceOutputStream(new DeflaterOutputStream(this.socket.getOutputStream(), deflater, true), this.traceLogger);
            this.traceOutput = traceOutputStream;
            traceOutputStream.setQuote(this.quote);
            this.output = new DataOutputStream(new BufferedOutputStream(this.traceOutput));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void startTLS(String str) {
        if (this.socket instanceof SSLSocket) {
            return;
        }
        simpleCommand(str, null);
        this.socket = SocketFetcher.startTLS(this.socket, this.host, this.props, this.prefix);
        initStreams();
    }

    public synchronized boolean supportsNonSyncLiterals() {
        return false;
    }

    public boolean supportsUtf8() {
        return false;
    }

    public void suspendTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(false);
            this.traceOutput.setTrace(false);
        }
    }

    public String writeCommand(String str, Argument argument) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tagPrefix);
        int i10 = this.tagCounter;
        this.tagCounter = i10 + 1;
        sb2.append(Integer.toString(i10));
        String string = sb2.toString();
        this.output.writeBytes(string + " " + str);
        if (argument != null) {
            this.output.write(32);
            argument.write(this);
        }
        this.output.write(CRLF);
        this.output.flush();
        return string;
    }

    public Protocol(InputStream inputStream, PrintStream printStream, Properties properties, boolean z6) {
        this.tagCounter = 0;
        this.handlers = new CopyOnWriteArrayList();
        this.host = "localhost";
        this.props = properties;
        this.quote = false;
        this.tagPrefix = computePrefix(properties, "mail.imap");
        MailLogger mailLogger = new MailLogger(getClass(), "DEBUG", z6, System.out);
        this.logger = mailLogger;
        this.traceLogger = mailLogger.getSubLogger("protocol", null);
        TraceInputStream traceInputStream = new TraceInputStream(inputStream, this.traceLogger);
        this.traceInput = traceInputStream;
        traceInputStream.setQuote(this.quote);
        this.input = new ResponseInputStream(this.traceInput);
        TraceOutputStream traceOutputStream = new TraceOutputStream(printStream, this.traceLogger);
        this.traceOutput = traceOutputStream;
        traceOutputStream.setQuote(this.quote);
        this.output = new DataOutputStream(new BufferedOutputStream(this.traceOutput));
        this.timestamp = System.currentTimeMillis();
    }

    private void commandEnd() {
    }

    private void commandStart(String str) {
    }
}
