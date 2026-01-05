package com.sun.mail.pop3;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.AuthenticationFailedException;
import jakarta.mail.MessagingException;
import jakarta.mail.c0;
import jakarta.mail.d0;
import jakarta.mail.h0;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class POP3Store extends d0 {
    volatile boolean cacheWriteTo;
    private Map<String, String> capabilities;
    private int defaultPort;
    volatile boolean disableTop;
    volatile File fileCacheDir;
    volatile boolean finalizeCleanClose;
    volatile boolean forgetTopHeaders;
    private String host;
    private boolean isSSL;
    volatile boolean keepMessageContent;
    private MailLogger logger;
    volatile Constructor<?> messageConstructor;
    private String name;
    private String passwd;
    private Protocol port;
    private int portNum;
    private POP3Folder portOwner;
    private boolean requireStartTLS;
    volatile boolean rsetBeforeQuit;
    volatile boolean supportsUidl;
    volatile boolean useFileCache;
    private boolean useStartTLS;
    private String user;
    private boolean usingSSL;

    public POP3Store(c0 c0Var, h0 h0Var) {
        this(c0Var, h0Var, "pop3", false);
    }

    private boolean authenticate(Protocol protocol, String str, String str2) throws AuthenticationFailedException {
        boolean z6;
        String property = this.session.f19287a.getProperty(AbstractC1452a.m4564k(new StringBuilder("mail."), this.name, ".auth.mechanisms"));
        if (property == null) {
            property = protocol.getDefaultMechanisms();
            z6 = true;
        } else {
            z6 = false;
        }
        String property2 = this.session.f19287a.getProperty(AbstractC1452a.m4564k(new StringBuilder("mail."), this.name, ".sasl.authorizationid"));
        String str3 = property2 == null ? str : property2;
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("Attempt to authenticate using mechanisms: " + property);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            Locale locale = Locale.ENGLISH;
            String upperCase = strNextToken.toUpperCase(locale);
            if (!protocol.supportsMechanism(upperCase)) {
                this.logger.log(Level.FINE, "no authenticator for mechanism {0}", upperCase);
            } else {
                if (protocol.supportsAuthentication(upperCase)) {
                    if (z6) {
                        String str4 = "mail." + this.name + ".auth." + upperCase.toLowerCase(locale) + ".disable";
                        if (PropUtil.getBooleanProperty(this.session.f19287a, str4, !protocol.isMechanismEnabled(upperCase))) {
                            if (this.logger.isLoggable(Level.FINE)) {
                                this.logger.fine("mechanism " + upperCase + " disabled by property: " + str4);
                            }
                        }
                    }
                    this.logger.log(Level.FINE, "Using mechanism {0}", upperCase);
                    String strAuthenticate = protocol.authenticate(upperCase, this.host, str3, str, str2);
                    if (strAuthenticate == null) {
                        return true;
                    }
                    throw new AuthenticationFailedException(strAuthenticate);
                }
                this.logger.log(Level.FINE, "mechanism {0} not supported by server", upperCase);
            }
        }
        throw new AuthenticationFailedException("No authentication mechanisms supported by both server and client");
    }

    private void checkConnected() throws MessagingException {
        if (!super.isConnected()) {
            throw new MessagingException("Not connected");
        }
    }

    private static IOException cleanupAndThrow(Protocol protocol, IOException iOException) {
        try {
            protocol.quit();
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

    private final synchronized boolean getBoolProp(String str) {
        boolean booleanProperty;
        String str2 = "mail." + this.name + "." + str;
        booleanProperty = PropUtil.getBooleanProperty(this.session.f19287a, str2, false);
        if (this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config(str2 + ": " + booleanProperty);
        }
        return booleanProperty;
    }

    private static boolean isRecoverable(Throwable th2) {
        return (th2 instanceof Exception) || (th2 instanceof LinkageError);
    }

    public Map<String, String> capabilities() {
        Map<String, String> map;
        synchronized (this) {
            map = this.capabilities;
        }
        return map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
    }

    @Override // jakarta.mail.AbstractC3695w, java.lang.AutoCloseable
    public synchronized void close() {
        close(false);
    }

    public synchronized void closePort(POP3Folder pOP3Folder) {
        if (this.portOwner == pOP3Folder) {
            this.port = null;
            this.portOwner = null;
        }
    }

    @Override // jakarta.mail.AbstractC3695w
    public void finalize() {
        try {
            if (this.port != null) {
                close(!this.finalizeCleanClose);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // jakarta.mail.d0
    public AbstractC3679k getDefaultFolder() throws MessagingException {
        checkConnected();
        return new DefaultFolder(this);
    }

    @Override // jakarta.mail.d0
    public AbstractC3679k getFolder(String str) throws MessagingException {
        checkConnected();
        return new POP3Folder(this, str);
    }

    public synchronized Protocol getPort(POP3Folder pOP3Folder) {
        Map<String, String> map;
        Protocol protocol = this.port;
        if (protocol != null && this.portOwner == null) {
            this.portOwner = pOP3Folder;
            return protocol;
        }
        Protocol protocol2 = new Protocol(this.host, this.portNum, this.logger, this.session.f19287a, "mail." + this.name, this.isSSL);
        if (this.useStartTLS || this.requireStartTLS) {
            if (protocol2.hasCapability("STLS")) {
                if (protocol2.stls()) {
                    protocol2.setCapabilities(protocol2.capa());
                } else if (this.requireStartTLS) {
                    this.logger.fine("STLS required but failed");
                    throw cleanupAndThrow(protocol2, new EOFException("STLS required but failed"));
                }
            } else if (this.requireStartTLS) {
                this.logger.fine("STLS required but not supported");
                throw cleanupAndThrow(protocol2, new EOFException("STLS required but not supported"));
            }
        }
        this.capabilities = protocol2.getCapabilities();
        this.usingSSL = protocol2.isSSL();
        boolean z6 = true;
        if (!this.disableTop && (map = this.capabilities) != null && !map.containsKey("TOP")) {
            this.disableTop = true;
            this.logger.fine("server doesn't support TOP, disabling it");
        }
        Map<String, String> map2 = this.capabilities;
        if (map2 != null && !map2.containsKey("UIDL")) {
            z6 = false;
        }
        this.supportsUidl = z6;
        try {
            if (!authenticate(protocol2, this.user, this.passwd)) {
                throw cleanupAndThrow(protocol2, new EOFException("login failed"));
            }
            if (this.port == null && pOP3Folder != null) {
                this.port = protocol2;
                this.portOwner = pOP3Folder;
            }
            if (this.portOwner == null) {
                this.portOwner = pOP3Folder;
            }
            return protocol2;
        } catch (EOFException e2) {
            throw cleanupAndThrow(protocol2, e2);
        } catch (Exception e10) {
            throw cleanupAndThrow(protocol2, new EOFException(e10.getMessage()));
        }
    }

    public synchronized c0 getSession() {
        return this.session;
    }

    @Override // jakarta.mail.AbstractC3695w
    public synchronized boolean isConnected() {
        try {
            if (!super.isConnected()) {
                return false;
            }
            try {
                try {
                    Protocol protocol = this.port;
                    if (protocol == null) {
                        this.port = getPort(null);
                    } else if (!protocol.noop()) {
                        throw new IOException("NOOP failed");
                    }
                    return true;
                } catch (IOException unused) {
                    super.close();
                    return false;
                }
            } catch (MessagingException unused2) {
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isSSL() {
        return this.usingSSL;
    }

    @Override // jakarta.mail.AbstractC3695w
    public synchronized boolean protocolConnect(String str, int i10, String str2, String str3) {
        if (str == null || str3 == null || str2 == null) {
            return false;
        }
        if (i10 == -1) {
            try {
                i10 = PropUtil.getIntProperty(this.session.f19287a, "mail." + this.name + ".port", -1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 == -1) {
            i10 = this.defaultPort;
        }
        this.host = str;
        this.portNum = i10;
        this.user = str2;
        this.passwd = str3;
        try {
            try {
                this.port = getPort(null);
                return true;
            } catch (SocketConnectException e2) {
                throw new MailConnectException(e2);
            }
        } catch (EOFException e10) {
            throw new AuthenticationFailedException(e10.getMessage());
        } catch (IOException e11) {
            throw new MessagingException("Connect failed", e11);
        }
    }

    public POP3Store(c0 c0Var, h0 h0Var, String str, boolean z6) throws ClassNotFoundException {
        Class<?> cls;
        super(c0Var, h0Var);
        this.name = "pop3";
        this.defaultPort = 110;
        this.isSSL = false;
        this.port = null;
        this.portOwner = null;
        this.host = null;
        this.portNum = -1;
        this.user = null;
        this.passwd = null;
        this.useStartTLS = false;
        this.requireStartTLS = false;
        this.usingSSL = false;
        this.messageConstructor = null;
        this.rsetBeforeQuit = false;
        this.disableTop = false;
        this.forgetTopHeaders = false;
        this.supportsUidl = true;
        this.cacheWriteTo = false;
        this.useFileCache = false;
        this.fileCacheDir = null;
        this.keepMessageContent = false;
        this.finalizeCleanClose = false;
        str = h0Var != null ? h0Var.f19313b : str;
        this.name = str;
        this.logger = new MailLogger(getClass(), "DEBUG POP3", c0Var.m8181b(), c0Var.m8182c());
        z6 = z6 ? z6 : AbstractC0030c.m134y("mail.", str, ".ssl.enable", c0Var.f19287a, false);
        if (z6) {
            this.defaultPort = 995;
        } else {
            this.defaultPort = 110;
        }
        this.isSSL = z6;
        this.rsetBeforeQuit = getBoolProp("rsetbeforequit");
        this.disableTop = getBoolProp("disabletop");
        this.forgetTopHeaders = getBoolProp("forgettopheaders");
        this.cacheWriteTo = getBoolProp("cachewriteto");
        this.useFileCache = getBoolProp("filecache.enable");
        String property = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".filecache.dir"));
        if (property != null && this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config("mail." + str + ".filecache.dir: " + property);
        }
        if (property != null) {
            this.fileCacheDir = new File(property);
        }
        this.keepMessageContent = getBoolProp("keepmessagecontent");
        this.useStartTLS = getBoolProp("starttls.enable");
        this.requireStartTLS = getBoolProp("starttls.required");
        this.finalizeCleanClose = getBoolProp("finalizecleanclose");
        String property2 = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".message.class"));
        if (property2 != null) {
            this.logger.log(Level.CONFIG, "message class: {0}", property2);
            try {
                try {
                    cls = Class.forName(property2, false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName(property2);
                }
                this.messageConstructor = cls.getConstructor(AbstractC3679k.class, Integer.TYPE);
            } catch (Exception e2) {
                this.logger.log(Level.CONFIG, "failed to load message class", (Throwable) e2);
            }
        }
    }

    public synchronized void close(boolean z6) {
        try {
            try {
                Protocol protocol = this.port;
                if (protocol != null) {
                    if (z6) {
                        protocol.close();
                    } else {
                        protocol.quit();
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                this.port = null;
                super.close();
                throw th2;
            }
            this.port = null;
            super.close();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public AbstractC3679k getFolder(h0 h0Var) throws MessagingException {
        checkConnected();
        return new POP3Folder(this, h0Var.f19320i);
    }
}
