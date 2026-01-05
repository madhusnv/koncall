package com.sun.mail.pop3;

import com.sun.mail.util.MailLogger;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.C3649g;
import jakarta.mail.C3650h;
import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import jakarta.mail.FolderClosedException;
import jakarta.mail.FolderNotFoundException;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MessagingException;
import jakarta.mail.MethodNotSupportedException;
import jakarta.mail.g0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.logging.Level;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class POP3Folder extends AbstractC3679k {
    private boolean doneUidl;
    private boolean exists;
    private volatile TempFile fileCache;
    private boolean forceClose;
    MailLogger logger;
    private POP3Message[] message_cache;
    private String name;
    private volatile boolean opened;
    private volatile Protocol port;
    private int size;
    private POP3Store store;
    private int total;

    public POP3Folder(POP3Store pOP3Store, String str) {
        super(pOP3Store);
        this.exists = false;
        this.opened = false;
        this.doneUidl = false;
        this.fileCache = null;
        this.name = str;
        this.store = pOP3Store;
        if (str.equalsIgnoreCase("INBOX")) {
            this.exists = true;
        }
        this.logger = new MailLogger(getClass(), "DEBUG POP3", pOP3Store.getSession().m8181b(), pOP3Store.getSession().m8182c());
    }

    private void checkClosed() {
        if (this.opened) {
            throw new IllegalStateException("Folder is Open");
        }
    }

    private void checkOpen() {
        if (!this.opened) {
            throw new IllegalStateException("Folder is not Open");
        }
    }

    private void checkReadable() {
        int i10;
        if (!this.opened || ((i10 = this.mode) != 1 && i10 != 2)) {
            throw new IllegalStateException("Folder is not Readable");
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public void appendMessages(AbstractC3682n[] abstractC3682nArr) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("Append not supported");
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void close(boolean z6) {
        TempFile tempFile;
        try {
            checkOpen();
            try {
                try {
                    if (this.store.rsetBeforeQuit && !this.forceClose) {
                        this.port.rset();
                    }
                    if (z6 && this.mode == 2 && !this.forceClose) {
                        int i10 = 0;
                        while (true) {
                            POP3Message[] pOP3MessageArr = this.message_cache;
                            if (i10 >= pOP3MessageArr.length) {
                                break;
                            }
                            POP3Message pOP3Message = pOP3MessageArr[i10];
                            if (pOP3Message != null && pOP3Message.isSet(C3651i.f19324c)) {
                                try {
                                    this.port.dele(i10 + 1);
                                } catch (IOException e2) {
                                    throw new MessagingException("Exception deleting messages during close", e2);
                                }
                            }
                            i10++;
                        }
                    }
                    int i11 = 0;
                    while (true) {
                        POP3Message[] pOP3MessageArr2 = this.message_cache;
                        if (i11 >= pOP3MessageArr2.length) {
                            break;
                        }
                        POP3Message pOP3Message2 = pOP3MessageArr2[i11];
                        if (pOP3Message2 != null) {
                            pOP3Message2.invalidate(true);
                        }
                        i11++;
                    }
                    if (this.forceClose) {
                        this.port.close();
                    } else {
                        this.port.quit();
                    }
                    this.port = null;
                    this.store.closePort(this);
                    this.message_cache = null;
                    this.opened = false;
                    notifyConnectionListeners(3);
                } catch (Throwable th2) {
                    this.port = null;
                    this.store.closePort(this);
                    this.message_cache = null;
                    this.opened = false;
                    notifyConnectionListeners(3);
                    if (this.fileCache != null) {
                        this.fileCache.close();
                        this.fileCache = null;
                    }
                    throw th2;
                }
            } catch (IOException unused) {
                this.port = null;
                this.store.closePort(this);
                this.message_cache = null;
                this.opened = false;
                notifyConnectionListeners(3);
                if (this.fileCache != null) {
                    tempFile = this.fileCache;
                }
            }
            if (this.fileCache != null) {
                tempFile = this.fileCache;
                tempFile.close();
                this.fileCache = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public boolean create(int i10) {
        return false;
    }

    public POP3Message createMessage(AbstractC3679k abstractC3679k, int i10) {
        POP3Message pOP3Message;
        Constructor<?> constructor = this.store.messageConstructor;
        if (constructor != null) {
            try {
                pOP3Message = (POP3Message) constructor.newInstance(this, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        } else {
            pOP3Message = null;
        }
        return pOP3Message == null ? new POP3Message(this, i10) : pOP3Message;
    }

    @Override // jakarta.mail.AbstractC3679k
    public boolean delete(boolean z6) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("delete");
    }

    @Override // jakarta.mail.AbstractC3679k
    public boolean exists() {
        return this.exists;
    }

    public AbstractC3682n[] expunge() throws MethodNotSupportedException {
        throw new MethodNotSupportedException("Expunge not supported");
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void fetch(AbstractC3682n[] abstractC3682nArr, C3650h c3650h) {
        try {
            checkReadable();
            if (!this.doneUidl && this.store.supportsUidl && c3650h.m8195a(g0.f19308a)) {
                int length = this.message_cache.length;
                String[] strArr = new String[length];
                try {
                    if (!this.port.uidl(strArr)) {
                        return;
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        if (strArr[i10] != null) {
                            ((POP3Message) getMessage(i10 + 1)).uid = strArr[i10];
                        }
                    }
                    this.doneUidl = true;
                } catch (EOFException e2) {
                    close(false);
                    throw new FolderClosedException(this, e2.toString());
                } catch (IOException e10) {
                    throw new MessagingException("error getting UIDL", e10);
                }
            }
            if (c3650h.m8195a(C3649g.ENVELOPE)) {
                for (AbstractC3682n abstractC3682n : abstractC3682nArr) {
                    try {
                        POP3Message pOP3Message = (POP3Message) abstractC3682n;
                        pOP3Message.getHeader("");
                        pOP3Message.getSize();
                    } catch (MessageRemovedException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public void finalize() throws Throwable {
        this.forceClose = !this.store.finalizeCleanClose;
        try {
            if (this.opened) {
                close(false);
            }
        } finally {
            super.finalize();
            this.forceClose = false;
        }
    }

    public TempFile getFileCache() {
        return this.fileCache;
    }

    public AbstractC3679k getFolder(String str) throws MessagingException {
        throw new MessagingException("not a directory");
    }

    @Override // jakarta.mail.AbstractC3679k
    public String getFullName() {
        return this.name;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized AbstractC3682n getMessage(int i10) {
        POP3Message pOP3MessageCreateMessage;
        checkOpen();
        int i11 = i10 - 1;
        pOP3MessageCreateMessage = this.message_cache[i11];
        if (pOP3MessageCreateMessage == null) {
            pOP3MessageCreateMessage = createMessage(this, i10);
            this.message_cache[i11] = pOP3MessageCreateMessage;
        }
        return pOP3MessageCreateMessage;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized int getMessageCount() {
        if (!this.opened) {
            return -1;
        }
        checkReadable();
        return this.total;
    }

    public String getName() {
        return this.name;
    }

    public AbstractC3679k getParent() {
        return new DefaultFolder(this.store);
    }

    public C3678j getPermanentFlags() {
        return new C3678j();
    }

    public Protocol getProtocol() {
        Protocol protocol = this.port;
        checkOpen();
        return protocol;
    }

    public char getSeparator() {
        return (char) 0;
    }

    public synchronized int getSize() {
        checkOpen();
        return this.size;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0047 A[EXC_TOP_SPLITTER, PHI: r2
      0x0047: PHI (r2v4 java.io.InputStream) = (r2v3 java.io.InputStream), (r2v6 java.io.InputStream) binds: [B:37:0x0062, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int[] getSizes() {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.checkOpen()     // Catch: java.lang.Throwable -> L43
            int r0 = r6.total     // Catch: java.lang.Throwable -> L43
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L43
            r1 = 0
            com.sun.mail.pop3.Protocol r2 = r6.port     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            java.io.InputStream r2 = r2.list()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            com.sun.mail.util.LineInputStream r3 = new com.sun.mail.util.LineInputStream     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L5d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L5d
        L14:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3d
            if (r1 == 0) goto L3f
            java.util.StringTokenizer r4 = new java.util.StringTokenizer     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            r4.<init>(r1)     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            java.lang.String r1 = r4.nextToken()     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            java.lang.String r4 = r4.nextToken()     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            if (r1 <= 0) goto L14
            int r5 = r6.total     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            if (r1 > r5) goto L14
            int r1 = r1 + (-1)
            r0[r1] = r4     // Catch: java.lang.RuntimeException -> L14 java.lang.Throwable -> L3a java.io.IOException -> L3d
            goto L14
        L3a:
            r0 = move-exception
            r1 = r3
            goto L52
        L3d:
            r1 = r3
            goto L5d
        L3f:
            r3.close()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            goto L45
        L43:
            r0 = move-exception
            goto L67
        L45:
            if (r2 == 0) goto L65
        L47:
            r2.close()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L65
            goto L65
        L4b:
            r0 = move-exception
            goto L52
        L4d:
            r0 = move-exception
            r2 = r1
            goto L52
        L50:
            r2 = r1
            goto L5d
        L52:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L57
        L57:
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L5c
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L43
        L5d:
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L62
        L62:
            if (r2 == 0) goto L65
            goto L47
        L65:
            monitor-exit(r6)
            return r0
        L67:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.pop3.POP3Folder.getSizes():int[]");
    }

    public int getType() {
        return 1;
    }

    public synchronized String getUID(AbstractC3682n abstractC3682n) {
        try {
            checkOpen();
            if (!(abstractC3682n instanceof POP3Message)) {
                throw new MessagingException("message is not a POP3Message");
            }
            POP3Message pOP3Message = (POP3Message) abstractC3682n;
            try {
                if (!this.store.supportsUidl) {
                    return null;
                }
                if (pOP3Message.uid == "UNKNOWN") {
                    pOP3Message.uid = this.port.uidl(pOP3Message.getMessageNumber());
                }
                return pOP3Message.uid;
            } catch (EOFException e2) {
                close(false);
                throw new FolderClosedException(this, e2.toString());
            } catch (IOException e10) {
                throw new MessagingException("error getting UIDL", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean hasNewMessages() {
        return false;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized boolean isOpen() {
        if (!this.opened) {
            return false;
        }
        try {
            try {
                if (this.port.noop()) {
                    return true;
                }
                throw new IOException("NOOP failed");
            } catch (MessagingException unused) {
                return false;
            }
        } catch (IOException unused2) {
            close(false);
            return false;
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public AbstractC3679k[] list(String str) throws MessagingException {
        throw new MessagingException("not a directory");
    }

    public synchronized InputStream listCommand() {
        checkOpen();
        return this.port.list();
    }

    @Override // jakarta.mail.AbstractC3679k
    public void notifyMessageChangedListeners(int i10, AbstractC3682n abstractC3682n) {
        super.notifyMessageChangedListeners(i10, abstractC3682n);
    }

    public synchronized void open(int i10) {
        checkClosed();
        if (!this.exists) {
            throw new FolderNotFoundException(this, "folder is not INBOX");
        }
        try {
            this.port = this.store.getPort(this);
            Status statusStat = this.port.stat();
            this.total = statusStat.total;
            this.size = statusStat.size;
            this.mode = i10;
            if (this.store.useFileCache) {
                try {
                    this.fileCache = new TempFile(this.store.fileCacheDir);
                } catch (IOException e2) {
                    this.logger.log(Level.FINE, "failed to create file cache", (Throwable) e2);
                    throw e2;
                }
            }
            this.opened = true;
            this.message_cache = new POP3Message[this.total];
            this.doneUidl = false;
            notifyConnectionListeners(1);
        } catch (IOException e10) {
            try {
                try {
                    if (this.port != null) {
                        this.port.quit();
                    }
                    this.port = null;
                } catch (Throwable th2) {
                    this.port = null;
                    this.store.closePort(this);
                    throw th2;
                }
            } catch (IOException unused) {
                this.port = null;
            }
            this.store.closePort(this);
            throw new MessagingException("Open failed", e10);
        }
    }

    public boolean renameTo(AbstractC3679k abstractC3679k) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("renameTo");
    }
}
