package com.sun.mail.imap;

import a2.AbstractC0030c;
import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.CommandFailedException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.iap.ResponseHandler;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.IMAPReferralException;
import com.sun.mail.imap.protocol.ListInfo;
import com.sun.mail.imap.protocol.Namespaces;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import jakarta.mail.AbstractC3634b;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.AuthenticationFailedException;
import jakarta.mail.C3686r;
import jakarta.mail.C3694v;
import jakarta.mail.MessagingException;
import jakarta.mail.StoreClosedException;
import jakarta.mail.c0;
import jakarta.mail.d0;
import jakarta.mail.h0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPStore extends d0 implements ResponseHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String ID_ADDRESS = "address";
    public static final String ID_ARGUMENTS = "arguments";
    public static final String ID_COMMAND = "command";
    public static final String ID_DATE = "date";
    public static final String ID_ENVIRONMENT = "environment";
    public static final String ID_NAME = "name";
    public static final String ID_OS = "os";
    public static final String ID_OS_VERSION = "os-version";
    public static final String ID_SUPPORT_URL = "support-url";
    public static final String ID_VENDOR = "vendor";
    public static final String ID_VERSION = "version";
    public static final int RESPONSE = 1000;
    private final int appendBufferSize;
    protected String authorizationID;
    private final int blksize;
    private boolean closeFoldersOnStoreFailure;
    private volatile boolean connectionFailed;
    private final Object connectionFailedLock;
    private boolean debugpassword;
    private boolean debugusername;
    protected final int defaultPort;
    private boolean enableCompress;
    private boolean enableImapEvents;
    private boolean enableResponseEvents;
    private boolean enableSASL;
    private boolean enableStartTLS;
    private boolean finalizeCleanClose;
    private volatile Constructor<?> folderConstructor;
    private volatile Constructor<?> folderConstructorLI;
    private volatile boolean forceClose;
    private boolean forcePasswordRefresh;
    private String guid;
    protected String host;
    private boolean ignoreSize;
    protected final boolean isSSL;
    protected MailLogger logger;
    private boolean messageCacheDebug;
    private final int minIdleTime;
    protected final String name;
    private Namespaces namespaces;
    private ResponseHandler nonStoreResponseHandler;
    protected String password;
    private boolean peek;
    private final ConnectionPool pool;
    private volatile int port;
    protected String proxyAuthUser;
    private boolean requireStartTLS;
    private String[] saslMechanisms;
    protected String saslRealm;
    private final int statusCacheTimeout;
    private boolean throwSearchException;
    protected String user;
    private boolean usingSSL;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class ConnectionPool {
        private static final int ABORTING = 2;
        private static final int IDLE = 1;
        private static final int RUNNING = 0;
        private final long clientTimeoutInterval;
        private Vector<IMAPFolder> folders;
        private IMAPProtocol idleProtocol;
        private final MailLogger logger;
        private final int poolSize;
        private final long pruningInterval;
        private final boolean separateStoreConnection;
        private final long serverTimeoutInterval;
        private Vector<IMAPProtocol> authenticatedConnections = new Vector<>();
        private boolean storeConnectionInUse = false;
        private int idleState = 0;
        private long lastTimePruned = System.currentTimeMillis();

        public ConnectionPool(String str, MailLogger mailLogger, c0 c0Var) {
            Properties properties = c0Var.f19287a;
            MailLogger subLogger = mailLogger.getSubLogger("connectionpool", "DEBUG IMAP CP", AbstractC0030c.m134y("mail.", str, ".connectionpool.debug", properties, false));
            this.logger = subLogger;
            int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".connectionpoolsize", -1);
            if (intProperty > 0) {
                this.poolSize = intProperty;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.connectionpoolsize: " + intProperty);
                }
            } else {
                this.poolSize = 1;
            }
            int intProperty2 = PropUtil.getIntProperty(properties, "mail." + str + ".connectionpooltimeout", -1);
            if (intProperty2 > 0) {
                long j6 = intProperty2;
                this.clientTimeoutInterval = j6;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.connectionpooltimeout: " + j6);
                }
            } else {
                this.clientTimeoutInterval = 45000L;
            }
            int intProperty3 = PropUtil.getIntProperty(properties, "mail." + str + ".servertimeout", -1);
            if (intProperty3 > 0) {
                long j10 = intProperty3;
                this.serverTimeoutInterval = j10;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.servertimeout: " + j10);
                }
            } else {
                this.serverTimeoutInterval = 1800000L;
            }
            int intProperty4 = PropUtil.getIntProperty(properties, "mail." + str + ".pruninginterval", -1);
            if (intProperty4 > 0) {
                long j11 = intProperty4;
                this.pruningInterval = j11;
                if (subLogger.isLoggable(Level.CONFIG)) {
                    subLogger.config("mail.imap.pruninginterval: " + j11);
                }
            } else {
                this.pruningInterval = 60000L;
            }
            boolean zM134y = AbstractC0030c.m134y("mail.", str, ".separatestoreconnection", properties, false);
            this.separateStoreConnection = zM134y;
            if (zM134y) {
                subLogger.config("dedicate a store connection");
            }
        }
    }

    public IMAPStore(c0 c0Var, h0 h0Var) {
        this(c0Var, h0Var, "imap", false);
    }

    private void authenticate(IMAPProtocol iMAPProtocol, String str, String str2, String str3) throws ProtocolException {
        String property = this.session.f19287a.getProperty(AbstractC1452a.m4564k(new StringBuilder("mail."), this.name, ".auth.mechanisms"));
        if (property == null) {
            property = "PLAIN LOGIN NTLM XOAUTH2";
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            Locale locale = Locale.ENGLISH;
            String upperCase = strNextToken.toUpperCase(locale);
            if (property == "PLAIN LOGIN NTLM XOAUTH2") {
                String str4 = "mail." + this.name + ".auth." + upperCase.toLowerCase(locale) + ".disable";
                if (PropUtil.getBooleanProperty(this.session.f19287a, str4, upperCase.equals("XOAUTH2"))) {
                    if (this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("mechanism " + upperCase + " disabled by property: " + str4);
                    }
                }
            }
            if (!iMAPProtocol.hasCapability("AUTH=" + upperCase) && (!upperCase.equals("LOGIN") || !iMAPProtocol.hasCapability("AUTH-LOGIN"))) {
                this.logger.log(Level.FINE, "mechanism {0} not supported by server", upperCase);
            } else {
                if (upperCase.equals("PLAIN")) {
                    iMAPProtocol.authplain(str, str2, str3);
                    return;
                }
                if (upperCase.equals("LOGIN")) {
                    iMAPProtocol.authlogin(str2, str3);
                    return;
                } else if (upperCase.equals("NTLM")) {
                    iMAPProtocol.authntlm(str, str2, str3);
                    return;
                } else {
                    if (upperCase.equals("XOAUTH2")) {
                        iMAPProtocol.authoauth2(str2, str3);
                        return;
                    }
                    this.logger.log(Level.FINE, "no authenticator for mechanism {0}", upperCase);
                }
            }
        }
        if (iMAPProtocol.hasCapability("LOGINDISABLED")) {
            throw new ProtocolException("No login methods supported!");
        }
        iMAPProtocol.login(str2, str3);
    }

    private void checkConnected() {
        if (!super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    private synchronized void cleanup() {
        boolean z6;
        if (!super.isConnected()) {
            this.logger.fine("IMAPStore cleanup, not connected");
            return;
        }
        synchronized (this.connectionFailedLock) {
            z6 = this.forceClose;
            this.forceClose = false;
            this.connectionFailed = false;
        }
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("IMAPStore cleanup, force " + z6);
        }
        if (!z6 || this.closeFoldersOnStoreFailure) {
            closeAllFolders(z6);
        }
        emptyConnectionPool(z6);
        try {
            super.close();
        } catch (MessagingException unused) {
        }
        this.logger.fine("IMAPStore cleanup done");
    }

    private void closeAllFolders(boolean z6) {
        boolean z10;
        Vector vector = null;
        while (true) {
            synchronized (this.pool) {
                try {
                    if (this.pool.folders != null) {
                        vector = this.pool.folders;
                        this.pool.folders = null;
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                return;
            }
            int size = vector.size();
            for (int i10 = 0; i10 < size; i10++) {
                IMAPFolder iMAPFolder = (IMAPFolder) vector.get(i10);
                if (z6) {
                    try {
                        this.logger.fine("force folder to close");
                        iMAPFolder.forceClose();
                    } catch (MessagingException | IllegalStateException unused) {
                    }
                } else {
                    this.logger.fine("close folder");
                    iMAPFolder.close(false);
                }
            }
        }
    }

    private void emptyConnectionPool(boolean z6) {
        synchronized (this.pool) {
            try {
                for (int size = this.pool.authenticatedConnections.size() - 1; size >= 0; size--) {
                    try {
                        IMAPProtocol iMAPProtocol = (IMAPProtocol) this.pool.authenticatedConnections.elementAt(size);
                        iMAPProtocol.removeResponseHandler(this);
                        if (z6) {
                            iMAPProtocol.disconnect();
                        } else {
                            iMAPProtocol.logout();
                        }
                    } catch (ProtocolException unused) {
                    }
                }
                this.pool.authenticatedConnections.removeAllElements();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.pool.logger.fine("removed all authenticated connections from pool");
    }

    private synchronized Namespaces getNamespaces() {
        checkConnected();
        if (this.namespaces == null) {
            IMAPProtocol storeProtocol = null;
            try {
                try {
                    storeProtocol = getStoreProtocol();
                    this.namespaces = storeProtocol.namespace();
                } catch (BadCommandException unused) {
                } catch (ConnectionException e2) {
                    throw new StoreClosedException(this, e2.getMessage());
                } catch (ProtocolException e10) {
                    throw new MessagingException(e10.getMessage(), e10);
                }
            } finally {
                releaseStoreProtocol(storeProtocol);
            }
        }
        return this.namespaces;
    }

    private IMAPProtocol getStoreProtocol() {
        IMAPProtocol iMAPProtocolNewIMAPProtocol = null;
        while (iMAPProtocolNewIMAPProtocol == null) {
            synchronized (this.pool) {
                try {
                    waitIfIdle();
                    if (this.pool.authenticatedConnections.isEmpty()) {
                        this.pool.logger.fine("getStoreProtocol() - no connections in the pool, creating a new one");
                        try {
                            if (this.forcePasswordRefresh) {
                                refreshPassword();
                            }
                            iMAPProtocolNewIMAPProtocol = newIMAPProtocol(this.host, this.port);
                            login(iMAPProtocolNewIMAPProtocol, this.user, this.password);
                        } catch (Exception unused) {
                            if (iMAPProtocolNewIMAPProtocol != null) {
                                try {
                                    iMAPProtocolNewIMAPProtocol.logout();
                                } catch (Exception unused2) {
                                }
                            }
                            iMAPProtocolNewIMAPProtocol = null;
                        }
                        if (iMAPProtocolNewIMAPProtocol == null) {
                            throw new ConnectionException("failed to create new store connection");
                        }
                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this);
                        this.pool.authenticatedConnections.addElement(iMAPProtocolNewIMAPProtocol);
                    } else {
                        if (this.pool.logger.isLoggable(Level.FINE)) {
                            this.pool.logger.fine("getStoreProtocol() - connection available -- size: " + this.pool.authenticatedConnections.size());
                        }
                        iMAPProtocolNewIMAPProtocol = (IMAPProtocol) this.pool.authenticatedConnections.firstElement();
                        String str = this.proxyAuthUser;
                        if (str != null && !str.equals(iMAPProtocolNewIMAPProtocol.getProxyAuthUser()) && iMAPProtocolNewIMAPProtocol.hasCapability("X-UNAUTHENTICATE")) {
                            iMAPProtocolNewIMAPProtocol.unauthenticate();
                            login(iMAPProtocolNewIMAPProtocol, this.user, this.password);
                        }
                    }
                    if (this.pool.storeConnectionInUse) {
                        try {
                            this.pool.wait();
                            iMAPProtocolNewIMAPProtocol = null;
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            throw new ProtocolException("Interrupted getStoreProtocol", e2);
                        }
                    } else {
                        this.pool.storeConnectionInUse = true;
                        this.pool.logger.fine("getStoreProtocol() -- storeConnectionInUse");
                    }
                    timeoutConnections();
                } finally {
                }
            }
        }
        return iMAPProtocolNewIMAPProtocol;
    }

    private void login(IMAPProtocol iMAPProtocol, String str, String str2) throws ProtocolException {
        IMAPProtocol iMAPProtocol2;
        String str3;
        String str4;
        if ((this.enableStartTLS || this.requireStartTLS) && !iMAPProtocol.isSSL()) {
            if (iMAPProtocol.hasCapability("STARTTLS")) {
                iMAPProtocol.startTLS();
                iMAPProtocol.capability();
            } else if (this.requireStartTLS) {
                this.logger.fine("STARTTLS required but not supported by server");
                throw new ProtocolException("STARTTLS required but not supported by server");
            }
        }
        if (iMAPProtocol.isAuthenticated()) {
            return;
        }
        preLogin(iMAPProtocol);
        if (this.guid != null) {
            HashMap map = new HashMap();
            map.put("GUID", this.guid);
            iMAPProtocol.id(map);
        }
        iMAPProtocol.getCapabilities().put("__PRELOGIN__", "");
        String str5 = this.authorizationID;
        if (str5 == null && (str5 = this.proxyAuthUser) == null) {
            str5 = null;
        }
        String str6 = str5;
        if (this.enableSASL) {
            try {
                iMAPProtocol2 = iMAPProtocol;
                str3 = str;
                str4 = str2;
                try {
                    iMAPProtocol2.sasllogin(this.saslMechanisms, this.saslRealm, str6, str3, str4);
                    if (!iMAPProtocol2.isAuthenticated()) {
                        throw new CommandFailedException("SASL authentication failed");
                    }
                } catch (UnsupportedOperationException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
            }
        } else {
            iMAPProtocol2 = iMAPProtocol;
            str3 = str;
            str4 = str2;
        }
        if (!iMAPProtocol2.isAuthenticated()) {
            authenticate(iMAPProtocol2, str6, str3, str4);
        }
        String str7 = this.proxyAuthUser;
        if (str7 != null) {
            iMAPProtocol2.proxyauth(str7);
        }
        if (iMAPProtocol2.hasCapability("__PRELOGIN__")) {
            try {
                iMAPProtocol2.capability();
            } catch (ConnectionException e2) {
                throw e2;
            } catch (ProtocolException unused3) {
            }
        }
        if (this.enableCompress && iMAPProtocol2.hasCapability("COMPRESS=DEFLATE")) {
            iMAPProtocol2.compress();
        }
        if (iMAPProtocol2.hasCapability("UTF8=ACCEPT") || iMAPProtocol2.hasCapability("UTF8=ONLY")) {
            iMAPProtocol2.enable("UTF8=ACCEPT");
        }
    }

    private AbstractC3679k[] namespaceToFolders(Namespaces.Namespace[] namespaceArr, String str) {
        int length = namespaceArr.length;
        AbstractC3679k[] abstractC3679kArr = new AbstractC3679k[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strM4561h = namespaceArr[i10].prefix;
            if (str == null) {
                int length2 = strM4561h.length();
                if (length2 > 0) {
                    int i11 = length2 - 1;
                    if (strM4561h.charAt(i11) == namespaceArr[i10].delimiter) {
                        strM4561h = strM4561h.substring(0, i11);
                    }
                }
            } else {
                strM4561h = AbstractC1452a.m4561h(strM4561h, str);
            }
            abstractC3679kArr[i10] = newIMAPFolder(strM4561h, namespaceArr[i10].delimiter, Boolean.valueOf(str == null));
        }
        return abstractC3679kArr;
    }

    private void refreshPassword() throws UnknownHostException {
        InetAddress byName;
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("refresh password, user: " + traceUser(this.user));
        }
        try {
            byName = InetAddress.getByName(this.host);
        } catch (UnknownHostException unused) {
            byName = null;
        }
        c0 c0Var = this.session;
        int i10 = this.port;
        String str = this.name;
        String str2 = this.user;
        AbstractC3634b abstractC3634b = c0Var.f19288b;
        C3686r c3686rRequestPasswordAuthentication = abstractC3634b != null ? abstractC3634b.requestPasswordAuthentication(byName, i10, str, null, str2) : null;
        if (c3686rRequestPasswordAuthentication != null) {
            this.user = c3686rRequestPasswordAuthentication.f19415a;
            this.password = c3686rRequestPasswordAuthentication.f19416b;
        }
    }

    private void releaseStoreProtocol(IMAPProtocol iMAPProtocol) {
        boolean z6;
        if (iMAPProtocol == null) {
            cleanup();
            return;
        }
        synchronized (this.connectionFailedLock) {
            z6 = this.connectionFailed;
            this.connectionFailed = false;
        }
        synchronized (this.pool) {
            this.pool.storeConnectionInUse = false;
            this.pool.notifyAll();
            this.pool.logger.fine("releaseStoreProtocol()");
            timeoutConnections();
        }
        if (z6) {
            cleanup();
        }
    }

    private void timeoutConnections() {
        synchronized (this.pool) {
            try {
                if (System.currentTimeMillis() - this.pool.lastTimePruned > this.pool.pruningInterval && this.pool.authenticatedConnections.size() > 1) {
                    if (this.pool.logger.isLoggable(Level.FINE)) {
                        this.pool.logger.fine("checking for connections to prune: " + (System.currentTimeMillis() - this.pool.lastTimePruned));
                        this.pool.logger.fine("clientTimeoutInterval: " + this.pool.clientTimeoutInterval);
                    }
                    for (int size = this.pool.authenticatedConnections.size() - 1; size > 0; size--) {
                        IMAPProtocol iMAPProtocol = (IMAPProtocol) this.pool.authenticatedConnections.elementAt(size);
                        if (this.pool.logger.isLoggable(Level.FINE)) {
                            this.pool.logger.fine("protocol last used: " + (System.currentTimeMillis() - iMAPProtocol.getTimestamp()));
                        }
                        if (System.currentTimeMillis() - iMAPProtocol.getTimestamp() > this.pool.clientTimeoutInterval) {
                            this.pool.logger.fine("authenticated connection timed out, logging out the connection");
                            iMAPProtocol.removeResponseHandler(this);
                            this.pool.authenticatedConnections.removeElementAt(size);
                            try {
                                iMAPProtocol.logout();
                            } catch (ProtocolException unused) {
                            }
                        }
                    }
                    this.pool.lastTimePruned = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String tracePassword(String str) {
        return this.debugpassword ? str : str == null ? "<null>" : "<non-null>";
    }

    private String traceUser(String str) {
        return this.debugusername ? str : "<user name suppressed>";
    }

    private void waitIfIdle() throws ProtocolException, InterruptedException {
        while (this.pool.idleState != 0) {
            if (this.pool.idleState == 1) {
                this.pool.idleProtocol.idleAbort();
                this.pool.idleState = 2;
            }
            try {
                this.pool.wait();
            } catch (InterruptedException e2) {
                throw new ProtocolException("Interrupted waitIfIdle", e2);
            }
        }
    }

    public boolean allowReadOnlySelect() {
        return PropUtil.getBooleanProperty(this.session.f19287a, "mail." + this.name + ".allowreadonlyselect", false);
    }

    @Override // jakarta.mail.AbstractC3695w, java.lang.AutoCloseable
    public synchronized void close() {
        cleanup();
        closeAllFolders(true);
        emptyConnectionPool(true);
    }

    @Override // jakarta.mail.AbstractC3695w
    public void finalize() {
        if (!this.finalizeCleanClose) {
            synchronized (this.connectionFailedLock) {
                this.connectionFailed = true;
                this.forceClose = true;
            }
            this.closeFoldersOnStoreFailure = true;
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public int getAppendBufferSize() {
        return this.appendBufferSize;
    }

    public MailLogger getConnectionPoolLogger() {
        return this.pool.logger;
    }

    @Override // jakarta.mail.d0
    public synchronized AbstractC3679k getDefaultFolder() {
        checkConnected();
        return new DefaultFolder(this);
    }

    public int getFetchBlockSize() {
        return this.blksize;
    }

    @Override // jakarta.mail.d0
    public synchronized AbstractC3679k getFolder(String str) {
        checkConnected();
        return newIMAPFolder(str, (char) 65535);
    }

    public IMAPProtocol getFolderStoreProtocol() {
        IMAPProtocol storeProtocol = getStoreProtocol();
        storeProtocol.removeResponseHandler(this);
        storeProtocol.addResponseHandler(this.nonStoreResponseHandler);
        return storeProtocol;
    }

    public boolean getMessageCacheDebug() {
        return this.messageCacheDebug;
    }

    public int getMinIdleTime() {
        return this.minIdleTime;
    }

    public boolean getPeek() {
        return this.peek;
    }

    @Override // jakarta.mail.d0
    public AbstractC3679k[] getPersonalNamespaces() {
        Namespaces.Namespace[] namespaceArr;
        Namespaces namespaces = getNamespaces();
        return (namespaces == null || (namespaceArr = namespaces.personal) == null) ? super.getPersonalNamespaces() : namespaceToFolders(namespaceArr, null);
    }

    public IMAPProtocol getProtocol(IMAPFolder iMAPFolder) {
        while (true) {
            IMAPProtocol iMAPProtocolNewIMAPProtocol = null;
            while (iMAPProtocolNewIMAPProtocol == null) {
                synchronized (this.pool) {
                    try {
                        if (this.pool.authenticatedConnections.isEmpty() || (this.pool.authenticatedConnections.size() == 1 && (this.pool.separateStoreConnection || this.pool.storeConnectionInUse))) {
                            this.logger.fine("no connections in the pool, creating a new one");
                            try {
                                if (this.forcePasswordRefresh) {
                                    refreshPassword();
                                }
                                iMAPProtocolNewIMAPProtocol = newIMAPProtocol(this.host, this.port);
                                iMAPProtocolNewIMAPProtocol.addResponseHandler(this.nonStoreResponseHandler);
                                login(iMAPProtocolNewIMAPProtocol, this.user, this.password);
                                iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.nonStoreResponseHandler);
                            } catch (Exception unused) {
                                if (iMAPProtocolNewIMAPProtocol != null) {
                                    try {
                                        iMAPProtocolNewIMAPProtocol.disconnect();
                                    } catch (Exception unused2) {
                                    }
                                }
                                iMAPProtocolNewIMAPProtocol = null;
                            }
                            if (iMAPProtocolNewIMAPProtocol == null) {
                                throw new MessagingException("connection failure");
                            }
                        } else {
                            if (this.logger.isLoggable(Level.FINE)) {
                                this.logger.fine("connection available -- size: " + this.pool.authenticatedConnections.size());
                            }
                            iMAPProtocolNewIMAPProtocol = (IMAPProtocol) this.pool.authenticatedConnections.lastElement();
                            this.pool.authenticatedConnections.removeElement(iMAPProtocolNewIMAPProtocol);
                            if (System.currentTimeMillis() - iMAPProtocolNewIMAPProtocol.getTimestamp() > this.pool.serverTimeoutInterval) {
                                try {
                                    try {
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this.nonStoreResponseHandler);
                                        iMAPProtocolNewIMAPProtocol.noop();
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.nonStoreResponseHandler);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this);
                                    } catch (ProtocolException unused3) {
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.nonStoreResponseHandler);
                                        iMAPProtocolNewIMAPProtocol.disconnect();
                                    }
                                } catch (RuntimeException unused4) {
                                }
                            }
                            String str = this.proxyAuthUser;
                            if (str != null && !str.equals(iMAPProtocolNewIMAPProtocol.getProxyAuthUser()) && iMAPProtocolNewIMAPProtocol.hasCapability("X-UNAUTHENTICATE")) {
                                try {
                                    try {
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this.nonStoreResponseHandler);
                                        iMAPProtocolNewIMAPProtocol.unauthenticate();
                                        login(iMAPProtocolNewIMAPProtocol, this.user, this.password);
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.nonStoreResponseHandler);
                                        iMAPProtocolNewIMAPProtocol.addResponseHandler(this);
                                    } catch (ProtocolException unused5) {
                                        iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.nonStoreResponseHandler);
                                        iMAPProtocolNewIMAPProtocol.disconnect();
                                    }
                                } catch (RuntimeException unused6) {
                                }
                            }
                            iMAPProtocolNewIMAPProtocol.removeResponseHandler(this);
                        }
                        timeoutConnections();
                        if (iMAPFolder != null) {
                            if (this.pool.folders == null) {
                                this.pool.folders = new Vector();
                            }
                            this.pool.folders.addElement(iMAPFolder);
                        }
                    } finally {
                    }
                }
            }
            return iMAPProtocolNewIMAPProtocol;
        }
    }

    public String getProxyAuthUser() {
        return this.proxyAuthUser;
    }

    public synchronized C3694v[] getQuota(String str) {
        IMAPProtocol storeProtocol;
        checkConnected();
        storeProtocol = null;
        try {
            try {
                try {
                    storeProtocol = getStoreProtocol();
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } catch (BadCommandException e10) {
                throw new MessagingException("QUOTA not supported", e10);
            } catch (ConnectionException e11) {
                throw new StoreClosedException(this, e11.getMessage());
            }
        } finally {
            releaseStoreProtocol(storeProtocol);
        }
        return storeProtocol.getQuotaRoot(str);
    }

    public c0 getSession() {
        return this.session;
    }

    @Override // jakarta.mail.d0
    public AbstractC3679k[] getSharedNamespaces() {
        Namespaces.Namespace[] namespaceArr;
        Namespaces namespaces = getNamespaces();
        return (namespaces == null || (namespaceArr = namespaces.shared) == null) ? super.getSharedNamespaces() : namespaceToFolders(namespaceArr, null);
    }

    public int getStatusCacheTimeout() {
        return this.statusCacheTimeout;
    }

    @Override // jakarta.mail.d0
    public AbstractC3679k[] getUserNamespaces(String str) {
        Namespaces.Namespace[] namespaceArr;
        Namespaces namespaces = getNamespaces();
        return (namespaces == null || (namespaceArr = namespaces.otherUsers) == null) ? super.getUserNamespaces(str) : namespaceToFolders(namespaceArr, str);
    }

    @Override // com.sun.mail.iap.ResponseHandler
    public void handleResponse(Response response) {
        if (response.isOK() || response.isNO() || response.isBAD() || response.isBYE()) {
            handleResponseCode(response);
        }
        if (response.isBYE()) {
            this.logger.fine("IMAPStore connection dead");
            synchronized (this.connectionFailedLock) {
                try {
                    this.connectionFailed = true;
                    if (response.isSynthetic()) {
                        this.forceClose = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void handleResponseCode(Response response) {
        if (this.enableResponseEvents) {
            notifyStoreListeners(RESPONSE, response.toString());
        }
        String rest = response.getRest();
        boolean z6 = false;
        if (rest.startsWith("[")) {
            int iIndexOf = rest.indexOf(93);
            if (iIndexOf > 0 && rest.substring(0, iIndexOf + 1).equalsIgnoreCase("[ALERT]")) {
                z6 = true;
            }
            rest = rest.substring(iIndexOf + 1).trim();
        }
        if (z6) {
            notifyStoreListeners(1, rest);
        } else {
            if (!response.isUnTagged() || rest.length() <= 0) {
                return;
            }
            notifyStoreListeners(2, rest);
        }
    }

    public synchronized boolean hasCapability(String str) {
        IMAPProtocol storeProtocol;
        storeProtocol = null;
        try {
            try {
                storeProtocol = getStoreProtocol();
            } catch (ProtocolException e2) {
                throw new MessagingException(e2.getMessage(), e2);
            }
        } finally {
            releaseStoreProtocol(storeProtocol);
        }
        return storeProtocol.hasCapability(str);
    }

    public boolean hasSeparateStoreConnection() {
        return this.pool.separateStoreConnection;
    }

    public synchronized Map<String, String> id(Map<String, String> map) {
        IMAPProtocol storeProtocol;
        checkConnected();
        storeProtocol = null;
        try {
            try {
                try {
                    storeProtocol = getStoreProtocol();
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } catch (BadCommandException e10) {
                throw new MessagingException("ID not supported", e10);
            } catch (ConnectionException e11) {
                throw new StoreClosedException(this, e11.getMessage());
            }
        } finally {
            releaseStoreProtocol(storeProtocol);
        }
        return storeProtocol.id(map);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0074
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void idle() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPStore.idle():void");
    }

    public boolean ignoreBodyStructureSize() {
        return this.ignoreSize;
    }

    @Override // jakarta.mail.AbstractC3695w
    public synchronized boolean isConnected() {
        try {
            if (!super.isConnected()) {
                return false;
            }
            IMAPProtocol storeProtocol = null;
            try {
                storeProtocol = getStoreProtocol();
                storeProtocol.noop();
            } catch (ProtocolException unused) {
            } catch (Throwable th2) {
                releaseStoreProtocol(storeProtocol);
                throw th2;
            }
            releaseStoreProtocol(storeProtocol);
            return super.isConnected();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public boolean isConnectionPoolFull() {
        boolean z6;
        synchronized (this.pool) {
            try {
                if (this.pool.logger.isLoggable(Level.FINE)) {
                    this.pool.logger.fine("connection pool current size: " + this.pool.authenticatedConnections.size() + "   pool size: " + this.pool.poolSize);
                }
                z6 = this.pool.authenticatedConnections.size() >= this.pool.poolSize;
            } finally {
            }
        }
        return z6;
    }

    public synchronized boolean isSSL() {
        return this.usingSSL;
    }

    public IMAPFolder newIMAPFolder(String str, char c2, Boolean bool) {
        IMAPFolder iMAPFolder;
        if (this.folderConstructor != null) {
            try {
                iMAPFolder = (IMAPFolder) this.folderConstructor.newInstance(str, Character.valueOf(c2), this, bool);
            } catch (Exception e2) {
                this.logger.log(Level.FINE, "exception creating IMAPFolder class", (Throwable) e2);
            }
        } else {
            iMAPFolder = null;
        }
        return iMAPFolder == null ? new IMAPFolder(str, c2, this, bool) : iMAPFolder;
    }

    public IMAPProtocol newIMAPProtocol(String str, int i10) {
        return new IMAPProtocol(this.name, str, i10, this.session.f19287a, this.isSSL, this.logger);
    }

    @Override // jakarta.mail.AbstractC3695w
    public synchronized boolean protocolConnect(String str, int i10, String str2, String str3) {
        Protocol protocol;
        boolean zIsEmpty;
        try {
            if (str == null || str3 == null || str2 == null) {
                if (this.logger.isLoggable(Level.FINE)) {
                    this.logger.fine("protocolConnect returning false, host=" + str + ", user=" + traceUser(str2) + ", password=" + tracePassword(str3));
                }
                return false;
            }
            if (i10 != -1) {
                this.port = i10;
            } else {
                this.port = PropUtil.getIntProperty(this.session.f19287a, "mail." + this.name + ".port", this.port);
            }
            if (this.port == -1) {
                this.port = this.defaultPort;
            }
            protocol = null;
            synchronized (this.pool) {
                zIsEmpty = this.pool.authenticatedConnections.isEmpty();
            }
            if (zIsEmpty) {
                MailLogger mailLogger = this.logger;
                Level level = Level.FINE;
                if (mailLogger.isLoggable(level)) {
                    this.logger.fine("trying to connect to host \"" + str + "\", port " + this.port + ", isSSL " + this.isSSL);
                }
                IMAPProtocol iMAPProtocolNewIMAPProtocol = newIMAPProtocol(str, this.port);
                if (this.logger.isLoggable(level)) {
                    this.logger.fine("protocolConnect login, host=" + str + ", user=" + traceUser(str2) + ", password=" + tracePassword(str3));
                }
                iMAPProtocolNewIMAPProtocol.addResponseHandler(this.nonStoreResponseHandler);
                login(iMAPProtocolNewIMAPProtocol, str2, str3);
                iMAPProtocolNewIMAPProtocol.removeResponseHandler(this.nonStoreResponseHandler);
                iMAPProtocolNewIMAPProtocol.addResponseHandler(this);
                this.usingSSL = iMAPProtocolNewIMAPProtocol.isSSL();
                this.host = str;
                this.user = str2;
                this.password = str3;
                synchronized (this.pool) {
                    this.pool.authenticatedConnections.addElement(iMAPProtocolNewIMAPProtocol);
                }
            }
            return true;
        } catch (IOException e2) {
            throw new MessagingException(e2.getMessage(), e2);
        } catch (SocketConnectException e10) {
            throw new MailConnectException(e10);
        } catch (IMAPReferralException e11) {
            if (0 != 0) {
                protocol.disconnect();
            }
            throw new ReferralException(e11.getUrl(), e11.getMessage());
        } catch (CommandFailedException e12) {
            if (0 != 0) {
                protocol.disconnect();
            }
            Response response = e12.getResponse();
            throw new AuthenticationFailedException(response != null ? response.getRest() : e12.getMessage());
        } catch (ProtocolException e13) {
            if (0 != 0) {
                protocol.disconnect();
            }
            throw new MessagingException(e13.getMessage(), e13);
        } finally {
        }
    }

    public void releaseFolderStoreProtocol(IMAPProtocol iMAPProtocol) {
        if (iMAPProtocol == null) {
            return;
        }
        iMAPProtocol.removeResponseHandler(this.nonStoreResponseHandler);
        iMAPProtocol.addResponseHandler(this);
        synchronized (this.pool) {
            this.pool.storeConnectionInUse = false;
            this.pool.notifyAll();
            this.pool.logger.fine("releaseFolderStoreProtocol()");
            timeoutConnections();
        }
    }

    public void releaseProtocol(IMAPFolder iMAPFolder, IMAPProtocol iMAPProtocol) {
        synchronized (this.pool) {
            if (iMAPProtocol != null) {
                try {
                    if (isConnectionPoolFull()) {
                        this.logger.fine("pool is full, not adding an Authenticated connection");
                        try {
                            iMAPProtocol.logout();
                        } catch (ProtocolException unused) {
                        }
                    } else {
                        iMAPProtocol.addResponseHandler(this);
                        this.pool.authenticatedConnections.addElement(iMAPProtocol);
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("added an Authenticated connection -- size: " + this.pool.authenticatedConnections.size());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.pool.folders != null) {
                this.pool.folders.removeElement(iMAPFolder);
            }
            timeoutConnections();
        }
    }

    public synchronized void setPassword(String str) {
        this.password = str;
    }

    public void setProxyAuthUser(String str) {
        this.proxyAuthUser = str;
    }

    public synchronized void setQuota(C3694v c3694v) {
        checkConnected();
        IMAPProtocol storeProtocol = null;
        try {
            try {
                try {
                    storeProtocol = getStoreProtocol();
                    storeProtocol.setQuota(c3694v);
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } catch (BadCommandException e10) {
                throw new MessagingException("QUOTA not supported", e10);
            } catch (ConnectionException e11) {
                throw new StoreClosedException(this, e11.getMessage());
            }
        } finally {
            releaseStoreProtocol(storeProtocol);
        }
    }

    public synchronized void setUsername(String str) {
        this.user = str;
    }

    public boolean throwSearchException() {
        return this.throwSearchException;
    }

    public IMAPStore(c0 c0Var, h0 h0Var, String str, boolean z6) throws ClassNotFoundException {
        Class<?> cls;
        super(c0Var, h0Var);
        this.port = -1;
        this.enableStartTLS = false;
        this.requireStartTLS = false;
        this.usingSSL = false;
        this.enableSASL = false;
        this.forcePasswordRefresh = false;
        this.enableResponseEvents = false;
        this.enableImapEvents = false;
        this.throwSearchException = false;
        this.peek = false;
        this.closeFoldersOnStoreFailure = true;
        this.enableCompress = false;
        this.finalizeCleanClose = false;
        this.connectionFailed = false;
        this.forceClose = false;
        this.connectionFailedLock = new Object();
        this.folderConstructor = null;
        this.folderConstructorLI = null;
        this.nonStoreResponseHandler = new ResponseHandler() { // from class: com.sun.mail.imap.IMAPStore.1
            @Override // com.sun.mail.iap.ResponseHandler
            public void handleResponse(Response response) {
                if (response.isOK() || response.isNO() || response.isBAD() || response.isBYE()) {
                    IMAPStore.this.handleResponseCode(response);
                }
                if (response.isBYE()) {
                    IMAPStore.this.logger.fine("IMAPStore non-store connection dead");
                }
            }
        };
        Properties properties = c0Var.f19287a;
        str = h0Var != null ? h0Var.f19313b : str;
        this.name = str;
        z6 = z6 ? z6 : AbstractC0030c.m134y("mail.", str, ".ssl.enable", properties, false);
        if (z6) {
            this.defaultPort = 993;
        } else {
            this.defaultPort = 143;
        }
        this.isSSL = z6;
        this.debug = c0Var.m8181b();
        this.debugusername = PropUtil.getBooleanProperty(properties, "mail.debug.auth.username", true);
        this.debugpassword = PropUtil.getBooleanProperty(properties, "mail.debug.auth.password", false);
        this.logger = new MailLogger(getClass(), "DEBUG " + str.toUpperCase(Locale.ENGLISH), c0Var.m8181b(), c0Var.m8182c());
        if (AbstractC0030c.m134y("mail.", str, ".partialfetch", properties, true)) {
            int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".fetchsize", 16384);
            this.blksize = intProperty;
            if (this.logger.isLoggable(Level.CONFIG)) {
                this.logger.config("mail.imap.fetchsize: " + intProperty);
            }
        } else {
            this.blksize = -1;
            this.logger.config("mail.imap.partialfetch: false");
        }
        this.ignoreSize = AbstractC0030c.m134y("mail.", str, ".ignorebodystructuresize", properties, false);
        MailLogger mailLogger = this.logger;
        Level level = Level.CONFIG;
        if (mailLogger.isLoggable(level)) {
            this.logger.config("mail.imap.ignorebodystructuresize: " + this.ignoreSize);
        }
        int intProperty2 = PropUtil.getIntProperty(properties, "mail." + str + ".statuscachetimeout", RESPONSE);
        this.statusCacheTimeout = intProperty2;
        if (this.logger.isLoggable(level)) {
            this.logger.config("mail.imap.statuscachetimeout: " + intProperty2);
        }
        int intProperty3 = PropUtil.getIntProperty(properties, "mail." + str + ".appendbuffersize", -1);
        this.appendBufferSize = intProperty3;
        if (this.logger.isLoggable(level)) {
            this.logger.config("mail.imap.appendbuffersize: " + intProperty3);
        }
        int intProperty4 = PropUtil.getIntProperty(properties, "mail." + str + ".minidletime", 10);
        this.minIdleTime = intProperty4;
        if (this.logger.isLoggable(level)) {
            this.logger.config("mail.imap.minidletime: " + intProperty4);
        }
        String property = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".proxyauth.user"));
        if (property != null) {
            this.proxyAuthUser = property;
            if (this.logger.isLoggable(level)) {
                this.logger.config("mail.imap.proxyauth.user: " + this.proxyAuthUser);
            }
        }
        boolean zM134y = AbstractC0030c.m134y("mail.", str, ".starttls.enable", properties, false);
        this.enableStartTLS = zM134y;
        if (zM134y) {
            this.logger.config("enable STARTTLS");
        }
        boolean zM134y2 = AbstractC0030c.m134y("mail.", str, ".starttls.required", properties, false);
        this.requireStartTLS = zM134y2;
        if (zM134y2) {
            this.logger.config("require STARTTLS");
        }
        boolean zM134y3 = AbstractC0030c.m134y("mail.", str, ".sasl.enable", properties, false);
        this.enableSASL = zM134y3;
        if (zM134y3) {
            this.logger.config("enable SASL");
        }
        if (this.enableSASL) {
            String property2 = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".sasl.mechanisms"));
            if (property2 != null && property2.length() > 0) {
                if (this.logger.isLoggable(level)) {
                    this.logger.config("SASL mechanisms allowed: ".concat(property2));
                }
                ArrayList arrayList = new ArrayList(5);
                StringTokenizer stringTokenizer = new StringTokenizer(property2, " ,");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.length() > 0) {
                        arrayList.add(strNextToken);
                    }
                }
                String[] strArr = new String[arrayList.size()];
                this.saslMechanisms = strArr;
                arrayList.toArray(strArr);
            }
        }
        String property3 = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".sasl.authorizationid"));
        if (property3 != null) {
            this.authorizationID = property3;
            this.logger.log(Level.CONFIG, "mail.imap.sasl.authorizationid: {0}", property3);
        }
        String property4 = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".sasl.realm"));
        if (property4 != null) {
            this.saslRealm = property4;
            this.logger.log(Level.CONFIG, "mail.imap.sasl.realm: {0}", property4);
        }
        boolean zM134y4 = AbstractC0030c.m134y("mail.", str, ".forcepasswordrefresh", properties, false);
        this.forcePasswordRefresh = zM134y4;
        if (zM134y4) {
            this.logger.config("enable forcePasswordRefresh");
        }
        boolean zM134y5 = AbstractC0030c.m134y("mail.", str, ".enableresponseevents", properties, false);
        this.enableResponseEvents = zM134y5;
        if (zM134y5) {
            this.logger.config("enable IMAP response events");
        }
        boolean zM134y6 = AbstractC0030c.m134y("mail.", str, ".enableimapevents", properties, false);
        this.enableImapEvents = zM134y6;
        if (zM134y6) {
            this.logger.config("enable IMAP IDLE events");
        }
        this.messageCacheDebug = AbstractC0030c.m134y("mail.", str, ".messagecache.debug", properties, false);
        String property5 = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".yahoo.guid"));
        this.guid = property5;
        if (property5 != null) {
            this.logger.log(Level.CONFIG, "mail.imap.yahoo.guid: {0}", property5);
        }
        boolean zM134y7 = AbstractC0030c.m134y("mail.", str, ".throwsearchexception", properties, false);
        this.throwSearchException = zM134y7;
        if (zM134y7) {
            this.logger.config("throw SearchException");
        }
        boolean zM134y8 = AbstractC0030c.m134y("mail.", str, ".peek", properties, false);
        this.peek = zM134y8;
        if (zM134y8) {
            this.logger.config("peek");
        }
        boolean zM134y9 = AbstractC0030c.m134y("mail.", str, ".closefoldersonstorefailure", properties, true);
        this.closeFoldersOnStoreFailure = zM134y9;
        if (zM134y9) {
            this.logger.config("closeFoldersOnStoreFailure");
        }
        boolean zM134y10 = AbstractC0030c.m134y("mail.", str, ".compress.enable", properties, false);
        this.enableCompress = zM134y10;
        if (zM134y10) {
            this.logger.config("enable COMPRESS");
        }
        boolean zM134y11 = AbstractC0030c.m134y("mail.", str, ".finalizecleanclose", properties, false);
        this.finalizeCleanClose = zM134y11;
        if (zM134y11) {
            this.logger.config("close connection cleanly in finalize");
        }
        String property6 = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".folder.class"));
        if (property6 != null) {
            this.logger.log(Level.CONFIG, "IMAP: folder class: {0}", property6);
            try {
                try {
                    cls = Class.forName(property6, false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName(property6);
                }
                this.folderConstructor = cls.getConstructor(String.class, Character.TYPE, IMAPStore.class, Boolean.class);
                this.folderConstructorLI = cls.getConstructor(ListInfo.class, IMAPStore.class);
            } catch (Exception e2) {
                this.logger.log(Level.CONFIG, "IMAP: failed to load folder class", (Throwable) e2);
            }
        }
        this.pool = new ConnectionPool(str, this.logger, c0Var);
    }

    public synchronized AbstractC3679k getFolder(h0 h0Var) {
        checkConnected();
        return newIMAPFolder(h0Var.f19320i, (char) 65535);
    }

    public IMAPFolder newIMAPFolder(String str, char c2) {
        return newIMAPFolder(str, c2, null);
    }

    public IMAPFolder newIMAPFolder(ListInfo listInfo) {
        IMAPFolder iMAPFolder;
        if (this.folderConstructorLI != null) {
            try {
                iMAPFolder = (IMAPFolder) this.folderConstructorLI.newInstance(listInfo, this);
            } catch (Exception e2) {
                this.logger.log(Level.FINE, "exception creating IMAPFolder class LI", (Throwable) e2);
            }
        } else {
            iMAPFolder = null;
        }
        return iMAPFolder == null ? new IMAPFolder(listInfo, this) : iMAPFolder;
    }

    public void preLogin(IMAPProtocol iMAPProtocol) {
    }
}
