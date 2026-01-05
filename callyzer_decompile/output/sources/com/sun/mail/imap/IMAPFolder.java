package com.sun.mail.imap;

import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.CommandFailedException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.iap.ResponseHandler;
import com.sun.mail.imap.IMAPMessage;
import com.sun.mail.imap.protocol.FetchItem;
import com.sun.mail.imap.protocol.FetchResponse;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.IMAPResponse;
import com.sun.mail.imap.protocol.Item;
import com.sun.mail.imap.protocol.ListInfo;
import com.sun.mail.imap.protocol.MailboxInfo;
import com.sun.mail.imap.protocol.MessageSet;
import com.sun.mail.imap.protocol.Status;
import com.sun.mail.imap.protocol.UID;
import com.sun.mail.imap.protocol.UIDSet;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.MailLogger;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.C3637e;
import jakarta.mail.C3649g;
import jakarta.mail.C3650h;
import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import jakarta.mail.C3694v;
import jakarta.mail.FolderClosedException;
import jakarta.mail.FolderNotFoundException;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MessagingException;
import jakarta.mail.ReadOnlyFolderException;
import jakarta.mail.StoreClosedException;
import jakarta.mail.event.AbstractC3642e;
import jakarta.mail.event.InterfaceC3645h;
import jakarta.mail.g0;
import jakarta.mail.internet.C3665n;
import jakarta.mail.search.SearchException;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import ow.AbstractC5767j;
import ow.C5762e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPFolder extends AbstractC3679k implements ResponseHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ABORTING = 2;
    private static final int IDLE = 1;
    private static final int RUNNING = 0;
    protected static final char UNKNOWN_SEPARATOR = 65535;
    protected volatile String[] attributes;
    protected C3678j availableFlags;
    private Status cachedStatus;
    private long cachedStatusTime;
    private MailLogger connectionPoolLogger;
    private boolean doExpungeNotification;
    protected volatile boolean exists;
    protected volatile String fullName;
    private boolean hasMessageCountListener;
    private volatile long highestmodseq;
    private IdleManager idleManager;
    private int idleState;
    protected boolean isNamespace;
    protected MailLogger logger;
    protected MessageCache messageCache;
    protected final Object messageCacheLock;
    protected String name;
    private volatile boolean opened;
    protected C3678j permanentFlags;
    protected volatile IMAPProtocol protocol;
    private int realTotal;
    private boolean reallyClosed;
    private volatile int recent;
    protected char separator;
    private volatile int total;
    protected int type;
    private boolean uidNotSticky;
    protected Hashtable<Long, IMAPMessage> uidTable;
    private long uidnext;
    private long uidvalidity;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class FetchProfileItem extends C3649g {
        public static final FetchProfileItem HEADERS = new FetchProfileItem("HEADERS");

        @Deprecated
        public static final FetchProfileItem SIZE = new FetchProfileItem("SIZE");
        public static final FetchProfileItem MESSAGE = new FetchProfileItem("MESSAGE");
        public static final FetchProfileItem INTERNALDATE = new FetchProfileItem("INTERNALDATE");

        public FetchProfileItem(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface ProtocolCommand {
        Object doCommand(IMAPProtocol iMAPProtocol);
    }

    public IMAPFolder(String str, char c2, IMAPStore iMAPStore, Boolean bool) {
        int iIndexOf;
        super(iMAPStore);
        this.isNamespace = false;
        this.messageCacheLock = new Object();
        this.opened = false;
        this.reallyClosed = true;
        this.idleState = 0;
        this.total = -1;
        this.recent = -1;
        this.realTotal = -1;
        this.uidvalidity = -1L;
        this.uidnext = -1L;
        this.uidNotSticky = false;
        this.highestmodseq = -1L;
        this.doExpungeNotification = true;
        this.cachedStatus = null;
        this.cachedStatusTime = 0L;
        this.hasMessageCountListener = false;
        if (str == null) {
            throw new NullPointerException("Folder name is null");
        }
        this.fullName = str;
        this.separator = c2;
        this.logger = new MailLogger(getClass(), "DEBUG IMAP", iMAPStore.getSession().m8181b(), iMAPStore.getSession().m8182c());
        this.connectionPoolLogger = iMAPStore.getConnectionPoolLogger();
        this.isNamespace = false;
        if (c2 != 65535 && c2 != 0 && (iIndexOf = this.fullName.indexOf(c2)) > 0 && iIndexOf == this.fullName.length() - 1) {
            this.fullName = this.fullName.substring(0, iIndexOf);
            this.isNamespace = true;
        }
        if (bool != null) {
            this.isNamespace = bool.booleanValue();
        }
    }

    private void addSuppressed(Throwable th2, Throwable th3) {
        if (isRecoverable(th3)) {
            th2.addSuppressed(th3);
            return;
        }
        th3.addSuppressed(th2);
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        if (!(th3 instanceof RuntimeException)) {
            throw new RuntimeException("unexpected exception", th3);
        }
        throw ((RuntimeException) th3);
    }

    private void checkFlags(C3678j c3678j) {
        if (this.mode == 2) {
            return;
        }
        throw new IllegalStateException("Cannot change flags on READ_ONLY folder: " + this.fullName);
    }

    private void cleanup(boolean z6) {
        releaseProtocol(z6);
        this.messageCache = null;
        this.uidTable = null;
        this.exists = false;
        this.attributes = null;
        this.opened = false;
        this.idleState = 0;
        this.messageCacheLock.notifyAll();
        notifyConnectionListeners(3);
    }

    private MessagingException cleanupAndThrow(MessagingException messagingException) {
        try {
            try {
                this.protocol.close();
                releaseProtocol(true);
            } catch (ProtocolException e2) {
                try {
                    addSuppressed(messagingException, logoutAndThrow(e2.getMessage(), e2));
                    releaseProtocol(false);
                } catch (Throwable th2) {
                    releaseProtocol(false);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            addSuppressed(messagingException, th3);
        }
        return messagingException;
    }

    private synchronized void copymoveMessages(AbstractC3682n[] abstractC3682nArr, AbstractC3679k abstractC3679k, boolean z6) {
        try {
            checkOpened();
            if (abstractC3682nArr.length == 0) {
                return;
            }
            if (abstractC3679k.getStore() == this.store) {
                synchronized (this.messageCacheLock) {
                    try {
                        IMAPProtocol protocol = getProtocol();
                        MessageSet[] messageSet = Utility.toMessageSet(abstractC3682nArr, null);
                        if (messageSet == null) {
                            throw new MessageRemovedException("Messages have been removed");
                        }
                        if (z6) {
                            protocol.move(messageSet, abstractC3679k.getFullName());
                        } else {
                            protocol.copy(messageSet, abstractC3679k.getFullName());
                        }
                    } catch (CommandFailedException e2) {
                        if (e2.getMessage().indexOf("TRYCREATE") == -1) {
                            throw new MessagingException(e2.getMessage(), e2);
                        }
                        throw new FolderNotFoundException(abstractC3679k, abstractC3679k.getFullName() + " does not exist");
                    } catch (ConnectionException e10) {
                        throw new FolderClosedException(this, e10.getMessage());
                    } catch (ProtocolException e11) {
                        throw new MessagingException(e11.getMessage(), e11);
                    } finally {
                    }
                }
            } else {
                if (z6) {
                    throw new MessagingException("Move between stores not supported");
                }
                super.copyMessages(abstractC3682nArr, abstractC3679k);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
    
        throw r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.sun.mail.imap.AppendUID[] copymoveUIDMessages(jakarta.mail.AbstractC3682n[] r13, jakarta.mail.AbstractC3679k r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPFolder.copymoveUIDMessages(jakarta.mail.n[], jakarta.mail.k, boolean):com.sun.mail.imap.AppendUID[]");
    }

    private String createHeaderCommand(String[] strArr, boolean z6) {
        StringBuilder sb2 = z6 ? new StringBuilder("BODY.PEEK[HEADER.FIELDS (") : new StringBuilder("RFC822.HEADER.LINES (");
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(" ");
            }
            sb2.append(strArr[i10]);
        }
        if (z6) {
            sb2.append(")]");
        } else {
            sb2.append(")");
        }
        return sb2.toString();
    }

    private AbstractC3682n[] createMessagesForUIDs(long[] jArr) {
        IMAPMessage[] iMAPMessageArr = new IMAPMessage[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10 += 2) {
            Hashtable<Long, IMAPMessage> hashtable = this.uidTable;
            IMAPMessage iMAPMessageNewIMAPMessage = hashtable != null ? hashtable.get(Long.valueOf(jArr[i10])) : null;
            if (iMAPMessageNewIMAPMessage == null) {
                iMAPMessageNewIMAPMessage = newIMAPMessage(-1);
                iMAPMessageNewIMAPMessage.setUID(jArr[i10]);
                iMAPMessageNewIMAPMessage.setExpunged(true);
            }
            iMAPMessageArr[i10] = iMAPMessageNewIMAPMessage;
        }
        return iMAPMessageArr;
    }

    private synchronized AbstractC3679k[] doList(final String str, final boolean z6) {
        checkExists();
        int i10 = 0;
        if (this.attributes != null && !isDirectory()) {
            return new AbstractC3679k[0];
        }
        final char separator = getSeparator();
        ListInfo[] listInfoArr = (ListInfo[]) doCommandIgnoreFailure(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.2
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                if (z6) {
                    return iMAPProtocol.lsub("", IMAPFolder.this.fullName + separator + str);
                }
                return iMAPProtocol.list("", IMAPFolder.this.fullName + separator + str);
            }
        });
        if (listInfoArr == null) {
            return new AbstractC3679k[0];
        }
        if (listInfoArr.length > 0) {
            if (listInfoArr[0].name.equals(this.fullName + separator)) {
                i10 = 1;
            }
        }
        IMAPFolder[] iMAPFolderArr = new IMAPFolder[listInfoArr.length - i10];
        IMAPStore iMAPStore = (IMAPStore) this.store;
        for (int i11 = i10; i11 < listInfoArr.length; i11++) {
            iMAPFolderArr[i11 - i10] = iMAPStore.newIMAPFolder(listInfoArr[i11]);
        }
        return iMAPFolderArr;
    }

    private int findName(ListInfo[] listInfoArr, String str) {
        int i10 = 0;
        while (i10 < listInfoArr.length && !listInfoArr[i10].name.equals(str)) {
            i10++;
        }
        if (i10 >= listInfoArr.length) {
            return 0;
        }
        return i10;
    }

    private Status getStatus() throws Throwable {
        int statusCacheTimeout = ((IMAPStore) this.store).getStatusCacheTimeout();
        if (statusCacheTimeout > 0 && this.cachedStatus != null && System.currentTimeMillis() - this.cachedStatusTime < statusCacheTimeout) {
            return this.cachedStatus;
        }
        IMAPProtocol iMAPProtocol = null;
        try {
            IMAPProtocol storeProtocol = getStoreProtocol();
            try {
                Status status = storeProtocol.status(this.fullName, null);
                if (statusCacheTimeout > 0) {
                    this.cachedStatus = status;
                    this.cachedStatusTime = System.currentTimeMillis();
                }
                releaseStoreProtocol(storeProtocol);
                return status;
            } catch (Throwable th2) {
                th = th2;
                iMAPProtocol = storeProtocol;
                releaseStoreProtocol(iMAPProtocol);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean isDirectory() {
        return (this.type & 2) != 0;
    }

    private boolean isRecoverable(Throwable th2) {
        return (th2 instanceof Exception) || (th2 instanceof LinkageError);
    }

    private MessagingException logoutAndThrow(String str, ProtocolException protocolException) {
        MessagingException messagingException = new MessagingException(str, protocolException);
        try {
            this.protocol.logout();
            return messagingException;
        } catch (Throwable th2) {
            addSuppressed(messagingException, th2);
            return messagingException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private jakarta.mail.AbstractC3682n processFetchResponse(com.sun.mail.imap.protocol.FetchResponse r9) {
        /*
            r8 = this;
            int r0 = r9.getNumber()
            com.sun.mail.imap.IMAPMessage r0 = r8.getMessageBySeqNumber(r0)
            if (r0 == 0) goto L6d
            java.lang.Class<com.sun.mail.imap.protocol.UID> r1 = com.sun.mail.imap.protocol.UID.class
            com.sun.mail.imap.protocol.Item r1 = r9.getItem(r1)
            com.sun.mail.imap.protocol.UID r1 = (com.sun.mail.imap.protocol.UID) r1
            r2 = 1
            if (r1 == 0) goto L3a
            long r3 = r0.getUID()
            long r5 = r1.uid
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3a
            r0.setUID(r5)
            java.util.Hashtable<java.lang.Long, com.sun.mail.imap.IMAPMessage> r3 = r8.uidTable
            if (r3 != 0) goto L2d
            java.util.Hashtable r3 = new java.util.Hashtable
            r3.<init>()
            r8.uidTable = r3
        L2d:
            java.util.Hashtable<java.lang.Long, com.sun.mail.imap.IMAPMessage> r3 = r8.uidTable
            long r4 = r1.uid
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3.put(r1, r0)
            r1 = r2
            goto L3b
        L3a:
            r1 = 0
        L3b:
            java.lang.Class<com.sun.mail.imap.protocol.MODSEQ> r3 = com.sun.mail.imap.protocol.MODSEQ.class
            com.sun.mail.imap.protocol.Item r3 = r9.getItem(r3)
            com.sun.mail.imap.protocol.MODSEQ r3 = (com.sun.mail.imap.protocol.MODSEQ) r3
            if (r3 == 0) goto L53
            long r4 = r0._getModSeq()
            long r6 = r3.modseq
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 == 0) goto L53
            r0.setModSeq(r6)
            r1 = r2
        L53:
            java.lang.Class<com.sun.mail.imap.protocol.FLAGS> r3 = com.sun.mail.imap.protocol.FLAGS.class
            com.sun.mail.imap.protocol.Item r3 = r9.getItem(r3)
            com.sun.mail.imap.protocol.FLAGS r3 = (com.sun.mail.imap.protocol.FLAGS) r3
            if (r3 == 0) goto L61
            r0._setFlags(r3)
            goto L62
        L61:
            r2 = r1
        L62:
            java.util.Map r9 = r9.getExtensionItems()
            r0.handleExtensionFetchItems(r9)
            if (r2 != 0) goto L6d
            r9 = 0
            return r9
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPFolder.processFetchResponse(com.sun.mail.imap.protocol.FetchResponse):jakarta.mail.n");
    }

    private void setACL(final ACL acl, final char c2) throws MessagingException {
        doOptionalCommand("ACL not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.18
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                iMAPProtocol.setACL(IMAPFolder.this.fullName, c2, acl);
                return null;
            }
        });
    }

    public void addACL(ACL acl) throws MessagingException {
        setACL(acl, (char) 0);
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void addMessageCountListener(InterfaceC3645h interfaceC3645h) {
        super.addMessageCountListener(interfaceC3645h);
        this.hasMessageCountListener = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized AbstractC3682n[] addMessages(AbstractC3682n[] abstractC3682nArr) {
        C3665n[] c3665nArr;
        checkOpened();
        c3665nArr = new C3665n[abstractC3682nArr.length];
        AppendUID[] appendUIDArrAppendUIDMessages = appendUIDMessages(abstractC3682nArr);
        for (int i10 = 0; i10 < appendUIDArrAppendUIDMessages.length; i10++) {
            AppendUID appendUID = appendUIDArrAppendUIDMessages[i10];
            if (appendUID != null && appendUID.uidvalidity == this.uidvalidity) {
                try {
                    c3665nArr[i10] = getMessageByUID(appendUID.uid);
                } catch (MessagingException unused) {
                }
            }
        }
        return c3665nArr;
    }

    public void addRights(ACL acl) throws MessagingException {
        setACL(acl, '+');
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void appendMessages(AbstractC3682n[] abstractC3682nArr) {
        try {
            checkExists();
            int appendBufferSize = ((IMAPStore) this.store).getAppendBufferSize();
            for (AbstractC3682n abstractC3682n : abstractC3682nArr) {
                final Date receivedDate = abstractC3682n.getReceivedDate();
                if (receivedDate == null) {
                    receivedDate = abstractC3682n.getSentDate();
                }
                final C3678j flags = abstractC3682n.getFlags();
                try {
                    final MessageLiteral messageLiteral = new MessageLiteral(abstractC3682n, abstractC3682n.getSize() > appendBufferSize ? 0 : appendBufferSize);
                    doCommand(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.10
                        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                        public Object doCommand(IMAPProtocol iMAPProtocol) {
                            iMAPProtocol.append(IMAPFolder.this.fullName, flags, receivedDate, messageLiteral);
                            return null;
                        }
                    });
                } catch (MessageRemovedException unused) {
                } catch (IOException e2) {
                    throw new MessagingException("IOException while appending messages", e2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized AppendUID[] appendUIDMessages(AbstractC3682n[] abstractC3682nArr) {
        AppendUID[] appendUIDArr;
        try {
            checkExists();
            int appendBufferSize = ((IMAPStore) this.store).getAppendBufferSize();
            appendUIDArr = new AppendUID[abstractC3682nArr.length];
            for (int i10 = 0; i10 < abstractC3682nArr.length; i10++) {
                AbstractC3682n abstractC3682n = abstractC3682nArr[i10];
                try {
                    final MessageLiteral messageLiteral = new MessageLiteral(abstractC3682n, abstractC3682n.getSize() > appendBufferSize ? 0 : appendBufferSize);
                    final Date receivedDate = abstractC3682n.getReceivedDate();
                    if (receivedDate == null) {
                        receivedDate = abstractC3682n.getSentDate();
                    }
                    final C3678j flags = abstractC3682n.getFlags();
                    appendUIDArr[i10] = (AppendUID) doCommand(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.11
                        @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                        public Object doCommand(IMAPProtocol iMAPProtocol) {
                            return iMAPProtocol.appenduid(IMAPFolder.this.fullName, flags, receivedDate, messageLiteral);
                        }
                    });
                } catch (MessageRemovedException unused) {
                } catch (IOException e2) {
                    throw new MessagingException("IOException while appending messages", e2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return appendUIDArr;
    }

    public void checkClosed() {
        if (this.opened) {
            throw new IllegalStateException("This operation is not allowed on an open folder");
        }
    }

    public void checkExists() throws FolderNotFoundException {
        if (!this.exists && !exists()) {
            throw new FolderNotFoundException(this, AbstractC1452a.m4564k(new StringBuilder(), this.fullName, " not found"));
        }
    }

    public void checkOpened() throws FolderClosedException {
        if (this.opened) {
            return;
        }
        if (!this.reallyClosed) {
            throw new FolderClosedException(this, "Lost folder connection to server");
        }
        throw new IllegalStateException("This operation is not allowed on a closed folder");
    }

    public void checkRange(int i10) {
        if (i10 < 1) {
            throw new IndexOutOfBoundsException("message number < 1");
        }
        if (i10 <= this.total) {
            return;
        }
        synchronized (this.messageCacheLock) {
            try {
                try {
                    keepConnectionAlive(false);
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this, e2.getMessage());
                }
            } catch (ProtocolException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
        if (i10 <= this.total) {
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " > " + this.total);
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void close(boolean z6) {
        close(z6, false);
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void copyMessages(AbstractC3682n[] abstractC3682nArr, AbstractC3679k abstractC3679k) {
        copymoveMessages(abstractC3682nArr, abstractC3679k, false);
    }

    public synchronized AppendUID[] copyUIDMessages(AbstractC3682n[] abstractC3682nArr, AbstractC3679k abstractC3679k) {
        return copymoveUIDMessages(abstractC3682nArr, abstractC3679k, false);
    }

    public synchronized boolean create(final int i10) {
        final char separator;
        if ((i10 & 1) == 0) {
            try {
                separator = getSeparator();
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            separator = 0;
        }
        if (doCommandIgnoreFailure(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.6
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) throws ProtocolException {
                ListInfo[] list;
                if ((i10 & 1) == 0) {
                    iMAPProtocol.create(IMAPFolder.this.fullName + separator);
                } else {
                    iMAPProtocol.create(IMAPFolder.this.fullName);
                    if ((i10 & 2) != 0 && (list = iMAPProtocol.list("", IMAPFolder.this.fullName)) != null && !list[0].hasInferiors) {
                        iMAPProtocol.delete(IMAPFolder.this.fullName);
                        throw new ProtocolException("Unsupported type");
                    }
                }
                return Boolean.TRUE;
            }
        }) == null) {
            return false;
        }
        boolean zExists = exists();
        if (zExists) {
            notifyFolderListeners(1);
        }
        return zExists;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized boolean delete(boolean z6) {
        try {
            checkClosed();
            if (z6) {
                for (AbstractC3679k abstractC3679k : list()) {
                    abstractC3679k.delete(z6);
                }
            }
            if (doCommandIgnoreFailure(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.8
                @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                public Object doCommand(IMAPProtocol iMAPProtocol) {
                    iMAPProtocol.delete(IMAPFolder.this.fullName);
                    return Boolean.TRUE;
                }
            }) == null) {
                return false;
            }
            this.exists = false;
            this.attributes = null;
            notifyFolderListeners(2);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Object doCommand(ProtocolCommand protocolCommand) throws MessagingException {
        try {
            return doProtocolCommand(protocolCommand);
        } catch (ConnectionException e2) {
            throwClosedException(e2);
            return null;
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
    }

    public Object doCommandIgnoreFailure(ProtocolCommand protocolCommand) throws MessagingException {
        try {
            return doProtocolCommand(protocolCommand);
        } catch (CommandFailedException unused) {
            return null;
        } catch (ConnectionException e2) {
            throwClosedException(e2);
            return null;
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
    }

    public Object doOptionalCommand(String str, ProtocolCommand protocolCommand) throws MessagingException {
        try {
            return doProtocolCommand(protocolCommand);
        } catch (BadCommandException e2) {
            throw new MessagingException(str, e2);
        } catch (ConnectionException e10) {
            throwClosedException(e10);
            return null;
        } catch (ProtocolException e11) {
            throw new MessagingException(e11.getMessage(), e11);
        }
    }

    public synchronized Object doProtocolCommand(ProtocolCommand protocolCommand) {
        IMAPProtocol storeProtocol;
        Object objDoCommand;
        if (this.protocol != null) {
            synchronized (this.messageCacheLock) {
                objDoCommand = protocolCommand.doCommand(getProtocol());
            }
            return objDoCommand;
        }
        try {
            storeProtocol = getStoreProtocol();
            try {
                Object objDoCommand2 = protocolCommand.doCommand(storeProtocol);
                releaseStoreProtocol(storeProtocol);
                return objDoCommand2;
            } catch (Throwable th2) {
                th = th2;
                releaseStoreProtocol(storeProtocol);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            storeProtocol = null;
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized boolean exists() {
        final String str;
        try {
            if (!this.isNamespace || this.separator == 0) {
                str = this.fullName;
            } else {
                str = this.fullName + this.separator;
            }
            ListInfo[] listInfoArr = (ListInfo[]) doCommand(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.1
                @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                public Object doCommand(IMAPProtocol iMAPProtocol) {
                    return iMAPProtocol.list("", str);
                }
            });
            if (listInfoArr != null) {
                int iFindName = findName(listInfoArr, str);
                this.fullName = listInfoArr[iFindName].name;
                this.separator = listInfoArr[iFindName].separator;
                int length = this.fullName.length();
                if (this.separator != 0 && length > 0) {
                    int i10 = length - 1;
                    if (this.fullName.charAt(i10) == this.separator) {
                        this.fullName = this.fullName.substring(0, i10);
                    }
                }
                this.type = 0;
                ListInfo listInfo = listInfoArr[iFindName];
                if (listInfo.hasInferiors) {
                    this.type = 2;
                }
                if (listInfo.canOpen) {
                    this.type |= 1;
                }
                this.exists = true;
                this.attributes = listInfoArr[iFindName].attrs;
            } else {
                this.exists = this.opened;
                this.attributes = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.exists;
    }

    public synchronized AbstractC3682n[] expunge() {
        return expunge(null);
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void fetch(AbstractC3682n[] abstractC3682nArr, C3650h c3650h) {
        boolean zIsREV1;
        FetchItem[] fetchItems;
        boolean z6;
        boolean z10;
        try {
            synchronized (this.messageCacheLock) {
                checkOpened();
                zIsREV1 = this.protocol.isREV1();
                fetchItems = this.protocol.getFetchItems();
            }
            StringBuilder sb2 = new StringBuilder();
            if (c3650h.m8195a(C3649g.ENVELOPE)) {
                sb2.append(getEnvelopeCommand());
                z6 = false;
            } else {
                z6 = true;
            }
            if (c3650h.m8195a(C3649g.FLAGS)) {
                sb2.append(z6 ? "FLAGS" : " FLAGS");
                z6 = false;
            }
            if (c3650h.m8195a(C3649g.CONTENT_INFO)) {
                sb2.append(z6 ? "BODYSTRUCTURE" : " BODYSTRUCTURE");
                z6 = false;
            }
            if (c3650h.m8195a(g0.f19308a)) {
                sb2.append(z6 ? "UID" : " UID");
                z6 = false;
            }
            if (c3650h.m8195a(FetchProfileItem.HEADERS)) {
                if (zIsREV1) {
                    sb2.append(z6 ? "BODY.PEEK[HEADER]" : " BODY.PEEK[HEADER]");
                } else {
                    sb2.append(z6 ? "RFC822.HEADER" : " RFC822.HEADER");
                }
                z6 = false;
                z10 = true;
            } else {
                z10 = false;
            }
            if (c3650h.m8195a(FetchProfileItem.MESSAGE)) {
                if (zIsREV1) {
                    sb2.append(z6 ? "BODY.PEEK[]" : " BODY.PEEK[]");
                } else {
                    sb2.append(z6 ? "RFC822" : " RFC822");
                }
                z6 = false;
                z10 = true;
            }
            if (c3650h.m8195a(C3649g.SIZE) || c3650h.m8195a(FetchProfileItem.SIZE)) {
                sb2.append(z6 ? "RFC822.SIZE" : " RFC822.SIZE");
                z6 = false;
            }
            if (c3650h.m8195a(FetchProfileItem.INTERNALDATE)) {
                sb2.append(z6 ? "INTERNALDATE" : " INTERNALDATE");
            }
            Response[] responseArrFetch = null;
            String[] strArr = !z10 ? new String[0] : null;
            for (int i10 = 0; i10 < fetchItems.length; i10++) {
                if (c3650h.m8195a(fetchItems[i10].getFetchProfileItem())) {
                    if (sb2.length() != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(fetchItems[i10].getName());
                }
            }
            IMAPMessage.FetchProfileCondition fetchProfileCondition = new IMAPMessage.FetchProfileCondition(c3650h, fetchItems);
            synchronized (this.messageCacheLock) {
                checkOpened();
                MessageSet[] messageSetSorted = Utility.toMessageSetSorted(abstractC3682nArr, fetchProfileCondition);
                if (messageSetSorted == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        responseArrFetch = getProtocol().fetch(messageSetSorted, sb2.toString());
                    } catch (ProtocolException e2) {
                        throw new MessagingException(e2.getMessage(), e2);
                    }
                } catch (CommandFailedException unused) {
                } catch (ConnectionException e10) {
                    throw new FolderClosedException(this, e10.getMessage());
                }
                if (responseArrFetch == null) {
                    return;
                }
                for (Response response : responseArrFetch) {
                    if (response != null) {
                        if (response instanceof FetchResponse) {
                            FetchResponse fetchResponse = (FetchResponse) response;
                            IMAPMessage messageBySeqNumber = getMessageBySeqNumber(fetchResponse.getNumber());
                            int itemCount = fetchResponse.getItemCount();
                            boolean z11 = false;
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                Item item = fetchResponse.getItem(i11);
                                if ((item instanceof C3678j) && (!c3650h.m8195a(C3649g.FLAGS) || messageBySeqNumber == null)) {
                                    z11 = true;
                                } else if (messageBySeqNumber != null) {
                                    messageBySeqNumber.handleFetchItem(item, strArr, z10);
                                }
                            }
                            if (messageBySeqNumber != null) {
                                messageBySeqNumber.handleExtensionFetchItems(fetchResponse.getExtensionItems());
                            }
                            if (z11) {
                                arrayList.add(fetchResponse);
                            }
                        } else {
                            arrayList.add(response);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Response[] responseArr = new Response[arrayList.size()];
                    arrayList.toArray(responseArr);
                    handleResponses(responseArr);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void forceClose() {
        close(false, true);
    }

    public ACL[] getACL() {
        return (ACL[]) doOptionalCommand("ACL not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.14
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                return iMAPProtocol.getACL(IMAPFolder.this.fullName);
            }
        });
    }

    public synchronized String[] getAttributes() {
        try {
            checkExists();
            if (this.attributes == null) {
                exists();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.attributes == null ? new String[0] : (String[]) this.attributes.clone();
    }

    public SocketChannel getChannel() {
        if (this.protocol != null) {
            return this.protocol.getChannel();
        }
        return null;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized int getDeletedMessageCount() {
        int length;
        if (!this.opened) {
            checkExists();
            return -1;
        }
        C3678j c3678j = new C3678j();
        c3678j.add(C3651i.f19324c);
        try {
            synchronized (this.messageCacheLock) {
                length = getProtocol().search(new C5762e(c3678j, true)).length;
            }
            return length;
        } catch (ConnectionException e2) {
            throw new FolderClosedException(this, e2.getMessage());
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
    }

    public String getEnvelopeCommand() {
        return "ENVELOPE INTERNALDATE RFC822.SIZE";
    }

    public synchronized AbstractC3679k getFolder(String str) {
        char separator;
        try {
            if (this.attributes != null && !isDirectory()) {
                throw new MessagingException("Cannot contain subfolders");
            }
            separator = getSeparator();
        } catch (Throwable th2) {
            throw th2;
        }
        return ((IMAPStore) this.store).newIMAPFolder(this.fullName + separator + str, separator);
    }

    @Override // jakarta.mail.AbstractC3679k
    public String getFullName() {
        return this.fullName;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0054 A[Catch: all -> 0x0009, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0005, B:15:0x0025, B:38:0x0054, B:41:0x0058, B:42:0x005f, B:47:0x006c, B:48:0x006f), top: B:52:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0058 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0005, B:15:0x0025, B:38:0x0054, B:41:0x0058, B:42:0x005f, B:47:0x006c, B:48:0x006f), top: B:52:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized long getHighestModSeq() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.opened     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            long r0 = r5.highestmodseq     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L9:
            r0 = move-exception
            goto L70
        Lc:
            r0 = 0
            com.sun.mail.imap.protocol.IMAPProtocol r1 = r5.getStoreProtocol()     // Catch: java.lang.Throwable -> L39 com.sun.mail.iap.ProtocolException -> L3e com.sun.mail.iap.ConnectionException -> L4c com.sun.mail.iap.BadCommandException -> L60
            java.lang.String r2 = "CONDSTORE"
            boolean r2 = r1.hasCapability(r2)     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L2b com.sun.mail.iap.ConnectionException -> L2d com.sun.mail.iap.BadCommandException -> L2f
            if (r2 == 0) goto L31
            java.lang.String r2 = "HIGHESTMODSEQ"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L2b com.sun.mail.iap.ConnectionException -> L2d com.sun.mail.iap.BadCommandException -> L2f
            java.lang.String r3 = r5.fullName     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L2b com.sun.mail.iap.ConnectionException -> L2d com.sun.mail.iap.BadCommandException -> L2f
            com.sun.mail.imap.protocol.Status r0 = r1.status(r3, r2)     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L2b com.sun.mail.iap.ConnectionException -> L2d com.sun.mail.iap.BadCommandException -> L2f
        L25:
            r5.releaseStoreProtocol(r1)     // Catch: java.lang.Throwable -> L9
            goto L52
        L29:
            r0 = move-exception
            goto L6c
        L2b:
            r0 = move-exception
            goto L42
        L2d:
            r2 = move-exception
            goto L4e
        L2f:
            r0 = move-exception
            goto L64
        L31:
            com.sun.mail.iap.BadCommandException r2 = new com.sun.mail.iap.BadCommandException     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L2b com.sun.mail.iap.ConnectionException -> L2d com.sun.mail.iap.BadCommandException -> L2f
            java.lang.String r3 = "CONDSTORE not supported"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L2b com.sun.mail.iap.ConnectionException -> L2d com.sun.mail.iap.BadCommandException -> L2f
            throw r2     // Catch: java.lang.Throwable -> L29 com.sun.mail.iap.ProtocolException -> L2b com.sun.mail.iap.ConnectionException -> L2d com.sun.mail.iap.BadCommandException -> L2f
        L39:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L6c
        L3e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L42:
            jakarta.mail.MessagingException r2 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L29
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            throw r2     // Catch: java.lang.Throwable -> L29
        L4c:
            r2 = move-exception
            r1 = r0
        L4e:
            r5.throwClosedException(r2)     // Catch: java.lang.Throwable -> L29
            goto L25
        L52:
            if (r0 == 0) goto L58
            long r0 = r0.highestmodseq     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L58:
            jakarta.mail.MessagingException r0 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "Cannot obtain HIGHESTMODSEQ"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L60:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L64:
            jakarta.mail.MessagingException r2 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "Cannot obtain HIGHESTMODSEQ"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            throw r2     // Catch: java.lang.Throwable -> L29
        L6c:
            r5.releaseStoreProtocol(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L70:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPFolder.getHighestModSeq():long");
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized AbstractC3682n getMessage(int i10) {
        checkOpened();
        checkRange(i10);
        return this.messageCache.getMessage(i10);
    }

    public IMAPMessage getMessageBySeqNumber(int i10) {
        if (i10 <= this.messageCache.size()) {
            return this.messageCache.getMessageBySeqnum(i10);
        }
        if (!this.logger.isLoggable(Level.FINE)) {
            return null;
        }
        MailLogger mailLogger = this.logger;
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "ignoring message number ", " outside range ");
        sbM4567n.append(this.messageCache.size());
        mailLogger.fine(sbM4567n.toString());
        return null;
    }

    public synchronized AbstractC3682n getMessageByUID(long j6) {
        IMAPMessage iMAPMessage;
        checkOpened();
        try {
            try {
                synchronized (this.messageCacheLock) {
                    Long lValueOf = Long.valueOf(j6);
                    Hashtable<Long, IMAPMessage> hashtable = this.uidTable;
                    if (hashtable != null) {
                        iMAPMessage = hashtable.get(lValueOf);
                        if (iMAPMessage != null) {
                            return iMAPMessage;
                        }
                    } else {
                        this.uidTable = new Hashtable<>();
                        iMAPMessage = null;
                    }
                    getProtocol().fetchSequenceNumber(j6);
                    Hashtable<Long, IMAPMessage> hashtable2 = this.uidTable;
                    return (hashtable2 == null || (iMAPMessage = hashtable2.get(lValueOf)) == null) ? iMAPMessage : iMAPMessage;
                }
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this, e2.getMessage());
            }
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized int getMessageCount() {
        synchronized (this.messageCacheLock) {
            if (this.opened) {
                try {
                    try {
                        keepConnectionAlive(true);
                        return this.total;
                    } catch (ConnectionException e2) {
                        throw new FolderClosedException(this, e2.getMessage());
                    }
                } catch (ProtocolException e10) {
                    throw new MessagingException(e10.getMessage(), e10);
                }
            }
            checkExists();
            try {
                try {
                    return getStatus().total;
                } catch (BadCommandException unused) {
                    IMAPProtocol storeProtocol = null;
                    try {
                        try {
                            storeProtocol = getStoreProtocol();
                            MailboxInfo mailboxInfoExamine = storeProtocol.examine(this.fullName);
                            storeProtocol.close();
                            return mailboxInfoExamine.total;
                        } catch (ProtocolException e11) {
                            throw new MessagingException(e11.getMessage(), e11);
                        }
                    } finally {
                        releaseStoreProtocol(storeProtocol);
                    }
                }
            } catch (ConnectionException e12) {
                throw new StoreClosedException(this.store, e12.getMessage());
            } catch (ProtocolException e13) {
                throw new MessagingException(e13.getMessage(), e13);
            }
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized AbstractC3682n[] getMessages() {
        AbstractC3682n[] abstractC3682nArr;
        checkOpened();
        int messageCount = getMessageCount();
        abstractC3682nArr = new AbstractC3682n[messageCount];
        for (int i10 = 1; i10 <= messageCount; i10++) {
            abstractC3682nArr[i10 - 1] = this.messageCache.getMessage(i10);
        }
        return abstractC3682nArr;
    }

    public IMAPMessage[] getMessagesBySeqNumbers(int[] iArr) {
        int length = iArr.length;
        IMAPMessage[] iMAPMessageArr = new IMAPMessage[length];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            IMAPMessage messageBySeqNumber = getMessageBySeqNumber(iArr[i11]);
            iMAPMessageArr[i11] = messageBySeqNumber;
            if (messageBySeqNumber == null) {
                i10++;
            }
        }
        if (i10 <= 0) {
            return iMAPMessageArr;
        }
        IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[iArr.length - i10];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            IMAPMessage iMAPMessage = iMAPMessageArr[i13];
            if (iMAPMessage != null) {
                iMAPMessageArr2[i12] = iMAPMessage;
                i12++;
            }
        }
        return iMAPMessageArr2;
    }

    public synchronized AbstractC3682n[] getMessagesByUID(long j6, long j10) {
        AbstractC3682n[] abstractC3682nArr;
        checkOpened();
        try {
            synchronized (this.messageCacheLock) {
                try {
                    if (this.uidTable == null) {
                        this.uidTable = new Hashtable<>();
                    }
                    long[] jArrFetchSequenceNumbers = getProtocol().fetchSequenceNumbers(j6, j10);
                    ArrayList arrayList = new ArrayList();
                    for (long j11 : jArrFetchSequenceNumbers) {
                        IMAPMessage iMAPMessage = this.uidTable.get(Long.valueOf(j11));
                        if (iMAPMessage != null) {
                            arrayList.add(iMAPMessage);
                        }
                    }
                    abstractC3682nArr = (AbstractC3682n[]) arrayList.toArray(new AbstractC3682n[arrayList.size()]);
                } finally {
                }
            }
        } catch (ConnectionException e2) {
            throw new FolderClosedException(this, e2.getMessage());
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
        return abstractC3682nArr;
    }

    public synchronized AbstractC3682n[] getMessagesByUIDChangedSince(long j6, long j10, long j11) {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        try {
            synchronized (this.messageCacheLock) {
                IMAPProtocol protocol = getProtocol();
                if (!protocol.hasCapability("CONDSTORE")) {
                    throw new BadCommandException("CONDSTORE not supported");
                }
                messagesBySeqNumbers = getMessagesBySeqNumbers(protocol.uidfetchChangedSince(j6, j10, j11));
            }
        } catch (ConnectionException e2) {
            throw new FolderClosedException(this, e2.getMessage());
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
        return messagesBySeqNumbers;
    }

    public synchronized String getName() {
        if (this.name == null) {
            try {
                this.name = this.fullName.substring(this.fullName.lastIndexOf(getSeparator()) + 1);
            } catch (MessagingException unused) {
            }
        }
        return this.name;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized int getNewMessageCount() {
        synchronized (this.messageCacheLock) {
            if (this.opened) {
                try {
                    try {
                        keepConnectionAlive(true);
                        return this.recent;
                    } catch (ConnectionException e2) {
                        throw new FolderClosedException(this, e2.getMessage());
                    }
                } catch (ProtocolException e10) {
                    throw new MessagingException(e10.getMessage(), e10);
                }
            }
            checkExists();
            try {
                try {
                    return getStatus().recent;
                } catch (BadCommandException unused) {
                    IMAPProtocol storeProtocol = null;
                    try {
                        try {
                            storeProtocol = getStoreProtocol();
                            MailboxInfo mailboxInfoExamine = storeProtocol.examine(this.fullName);
                            storeProtocol.close();
                            return mailboxInfoExamine.recent;
                        } catch (ProtocolException e11) {
                            throw new MessagingException(e11.getMessage(), e11);
                        }
                    } finally {
                        releaseStoreProtocol(storeProtocol);
                    }
                }
            } catch (ConnectionException e12) {
                throw new StoreClosedException(this.store, e12.getMessage());
            } catch (ProtocolException e13) {
                throw new MessagingException(e13.getMessage(), e13);
            }
        }
    }

    public synchronized AbstractC3679k getParent() {
        char separator = getSeparator();
        int iLastIndexOf = this.fullName.lastIndexOf(separator);
        if (iLastIndexOf != -1) {
            return ((IMAPStore) this.store).newIMAPFolder(this.fullName.substring(0, iLastIndexOf), separator);
        }
        return new DefaultFolder((IMAPStore) this.store);
    }

    public synchronized C3678j getPermanentFlags() {
        C3678j c3678j = this.permanentFlags;
        if (c3678j == null) {
            return null;
        }
        return (C3678j) c3678j.clone();
    }

    public IMAPProtocol getProtocol() throws ProtocolException, InterruptedException {
        waitIfIdle();
        if (this.protocol != null) {
            return this.protocol;
        }
        throw new ConnectionException("Connection closed");
    }

    public C3694v[] getQuota() {
        return (C3694v[]) doOptionalCommand("QUOTA not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.12
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                return iMAPProtocol.getQuotaRoot(IMAPFolder.this.fullName);
            }
        });
    }

    public synchronized char getSeparator() {
        try {
            if (this.separator == 65535) {
                ListInfo[] listInfoArr = (ListInfo[]) doCommand(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.3
                    @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                    public Object doCommand(IMAPProtocol iMAPProtocol) {
                        return iMAPProtocol.isREV1() ? iMAPProtocol.list(IMAPFolder.this.fullName, "") : iMAPProtocol.list("", IMAPFolder.this.fullName);
                    }
                });
                if (listInfoArr != null) {
                    this.separator = listInfoArr[0].separator;
                } else {
                    this.separator = '/';
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.separator;
    }

    public synchronized AbstractC3682n[] getSortedMessages(SortTerm[] sortTermArr) {
        return getSortedMessages(sortTermArr, null);
    }

    public synchronized long getStatusItem(String str) {
        if (this.opened) {
            return -1L;
        }
        checkExists();
        IMAPProtocol storeProtocol = null;
        try {
            try {
                try {
                    storeProtocol = getStoreProtocol();
                    Status status = storeProtocol.status(this.fullName, new String[]{str});
                    long item = status != null ? status.getItem(str) : -1L;
                    releaseStoreProtocol(storeProtocol);
                    return item;
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } catch (BadCommandException unused) {
                releaseStoreProtocol(storeProtocol);
                return -1L;
            } catch (ConnectionException e10) {
                throw new StoreClosedException(this.store, e10.getMessage());
            }
        } catch (Throwable th2) {
            releaseStoreProtocol(storeProtocol);
            throw th2;
        }
    }

    public synchronized IMAPProtocol getStoreProtocol() {
        this.connectionPoolLogger.fine("getStoreProtocol() borrowing a connection");
        return ((IMAPStore) this.store).getFolderStoreProtocol();
    }

    public synchronized int getType() {
        try {
            if (!this.opened) {
                checkExists();
            } else if (this.attributes == null) {
                exists();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.type;
    }

    public synchronized long getUID(AbstractC3682n abstractC3682n) {
        try {
            if (abstractC3682n.getFolder() != this) {
                throw new NoSuchElementException("Message does not belong to this folder");
            }
            checkOpened();
            if (!(abstractC3682n instanceof IMAPMessage)) {
                throw new MessagingException("message is not an IMAPMessage");
            }
            IMAPMessage iMAPMessage = (IMAPMessage) abstractC3682n;
            long uid = iMAPMessage.getUID();
            if (uid != -1) {
                return uid;
            }
            synchronized (this.messageCacheLock) {
                try {
                    IMAPProtocol protocol = getProtocol();
                    iMAPMessage.checkExpunged();
                    UID uidFetchUID = protocol.fetchUID(iMAPMessage.getSequenceNumber());
                    if (uidFetchUID != null) {
                        uid = uidFetchUID.uid;
                        iMAPMessage.setUID(uid);
                        if (this.uidTable == null) {
                            this.uidTable = new Hashtable<>();
                        }
                        this.uidTable.put(Long.valueOf(uid), iMAPMessage);
                    }
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this, e2.getMessage());
                } catch (ProtocolException e10) {
                    throw new MessagingException(e10.getMessage(), e10);
                } finally {
                }
            }
            return uid;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0043 A[Catch: all -> 0x0009, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0005, B:13:0x001c, B:34:0x0043, B:37:0x0047, B:38:0x004e, B:43:0x005b, B:44:0x005e), top: B:48:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0005, B:13:0x001c, B:34:0x0043, B:37:0x0047, B:38:0x004e, B:43:0x005b, B:44:0x005e), top: B:48:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized long getUIDNext() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.opened     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            long r0 = r5.uidnext     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L9:
            r0 = move-exception
            goto L5f
        Lb:
            r0 = 0
            com.sun.mail.imap.protocol.IMAPProtocol r1 = r5.getStoreProtocol()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2d com.sun.mail.iap.ConnectionException -> L3b com.sun.mail.iap.BadCommandException -> L4f
            java.lang.String r2 = "UIDNEXT"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            java.lang.String r3 = r5.fullName     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            com.sun.mail.imap.protocol.Status r0 = r1.status(r3, r2)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
        L1c:
            r5.releaseStoreProtocol(r1)     // Catch: java.lang.Throwable -> L9
            goto L41
        L20:
            r0 = move-exception
            goto L5b
        L22:
            r0 = move-exception
            goto L31
        L24:
            r2 = move-exception
            goto L3d
        L26:
            r0 = move-exception
            goto L53
        L28:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L5b
        L2d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L31:
            jakarta.mail.MessagingException r2 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L3b:
            r2 = move-exception
            r1 = r0
        L3d:
            r5.throwClosedException(r2)     // Catch: java.lang.Throwable -> L20
            goto L1c
        L41:
            if (r0 == 0) goto L47
            long r0 = r0.uidnext     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L47:
            jakarta.mail.MessagingException r0 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "Cannot obtain UIDNext"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L4f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L53:
            jakarta.mail.MessagingException r2 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "Cannot obtain UIDNext"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L5b:
            r5.releaseStoreProtocol(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L5f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPFolder.getUIDNext():long");
    }

    public synchronized boolean getUIDNotSticky() {
        checkOpened();
        return this.uidNotSticky;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0043 A[Catch: all -> 0x0009, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0005, B:13:0x001c, B:34:0x0043, B:37:0x0047, B:38:0x004e, B:43:0x005b, B:44:0x005e), top: B:48:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0005, B:13:0x001c, B:34:0x0043, B:37:0x0047, B:38:0x004e, B:43:0x005b, B:44:0x005e), top: B:48:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized long getUIDValidity() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.opened     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            long r0 = r5.uidvalidity     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L9:
            r0 = move-exception
            goto L5f
        Lb:
            r0 = 0
            com.sun.mail.imap.protocol.IMAPProtocol r1 = r5.getStoreProtocol()     // Catch: java.lang.Throwable -> L28 com.sun.mail.iap.ProtocolException -> L2d com.sun.mail.iap.ConnectionException -> L3b com.sun.mail.iap.BadCommandException -> L4f
            java.lang.String r2 = "UIDVALIDITY"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            java.lang.String r3 = r5.fullName     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
            com.sun.mail.imap.protocol.Status r0 = r1.status(r3, r2)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24 com.sun.mail.iap.BadCommandException -> L26
        L1c:
            r5.releaseStoreProtocol(r1)     // Catch: java.lang.Throwable -> L9
            goto L41
        L20:
            r0 = move-exception
            goto L5b
        L22:
            r0 = move-exception
            goto L31
        L24:
            r2 = move-exception
            goto L3d
        L26:
            r0 = move-exception
            goto L53
        L28:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L5b
        L2d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L31:
            jakarta.mail.MessagingException r2 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L3b:
            r2 = move-exception
            r1 = r0
        L3d:
            r5.throwClosedException(r2)     // Catch: java.lang.Throwable -> L20
            goto L1c
        L41:
            if (r0 == 0) goto L47
            long r0 = r0.uidvalidity     // Catch: java.lang.Throwable -> L9
            monitor-exit(r5)
            return r0
        L47:
            jakarta.mail.MessagingException r0 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "Cannot obtain UIDValidity"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L4f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L53:
            jakarta.mail.MessagingException r2 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "Cannot obtain UIDValidity"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L5b:
            r5.releaseStoreProtocol(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L5f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPFolder.getUIDValidity():long");
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized int getUnreadMessageCount() {
        int length;
        if (!this.opened) {
            checkExists();
            try {
                try {
                    return getStatus().unseen;
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } catch (BadCommandException unused) {
                return -1;
            } catch (ConnectionException e10) {
                throw new StoreClosedException(this.store, e10.getMessage());
            }
        }
        C3678j c3678j = new C3678j();
        c3678j.add(C3651i.f19328g);
        try {
            try {
                synchronized (this.messageCacheLock) {
                    length = getProtocol().search(new C5762e(c3678j, false)).length;
                }
                return length;
            } catch (ConnectionException e11) {
                throw new FolderClosedException(this, e11.getMessage());
            }
        } catch (ProtocolException e12) {
            throw new MessagingException(e12.getMessage(), e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleIdle(boolean r8) throws jakarta.mail.MessagingException {
        /*
            r7 = this;
        L0:
            com.sun.mail.imap.protocol.IMAPProtocol r0 = r7.protocol
            com.sun.mail.iap.Response r0 = r0.readIdleResponse()
            java.lang.Object r1 = r7.messageCacheLock     // Catch: com.sun.mail.iap.ProtocolException -> Laf com.sun.mail.iap.ConnectionException -> Lb1
            monitor-enter(r1)     // Catch: com.sun.mail.iap.ProtocolException -> Laf com.sun.mail.iap.ConnectionException -> Lb1
            boolean r2 = r0.isBYE()     // Catch: java.lang.Throwable -> L38
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L61
            boolean r2 = r0.isSynthetic()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L61
            int r2 = r7.idleState     // Catch: java.lang.Throwable -> L38
            if (r2 != r5) goto L61
            java.lang.Exception r2 = r0.getException()     // Catch: java.lang.Throwable -> L38
            boolean r6 = r2 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L61
            r6 = r2
            java.io.InterruptedIOException r6 = (java.io.InterruptedIOException) r6     // Catch: java.lang.Throwable -> L38
            int r6 = r6.bytesTransferred     // Catch: java.lang.Throwable -> L38
            if (r6 != 0) goto L61
            boolean r2 = r2 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3b
            com.sun.mail.util.MailLogger r0 = r7.logger     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "handleIdle: ignoring socket timeout"
            r0.finest(r2)     // Catch: java.lang.Throwable -> L38
            r0 = r4
            goto L5f
        L38:
            r8 = move-exception
            goto Lad
        L3b:
            com.sun.mail.util.MailLogger r2 = r7.logger     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "handleIdle: interrupting IDLE"
            r2.finest(r4)     // Catch: java.lang.Throwable -> L38
            com.sun.mail.imap.IdleManager r2 = r7.idleManager     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L51
            com.sun.mail.util.MailLogger r3 = r7.logger     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "handleIdle: request IdleManager to abort"
            r3.finest(r4)     // Catch: java.lang.Throwable -> L38
            r2.requestAbort(r7)     // Catch: java.lang.Throwable -> L38
            goto L5f
        L51:
            com.sun.mail.util.MailLogger r2 = r7.logger     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "handleIdle: abort IDLE"
            r2.finest(r4)     // Catch: java.lang.Throwable -> L38
            com.sun.mail.imap.protocol.IMAPProtocol r2 = r7.protocol     // Catch: java.lang.Throwable -> L38
            r2.idleAbort()     // Catch: java.lang.Throwable -> L38
            r7.idleState = r3     // Catch: java.lang.Throwable -> L38
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            goto L7d
        L61:
            r2 = 0
            com.sun.mail.imap.protocol.IMAPProtocol r6 = r7.protocol     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L8a
            com.sun.mail.imap.protocol.IMAPProtocol r6 = r7.protocol     // Catch: java.lang.Throwable -> L88
            boolean r6 = r6.processIdleResponse(r0)     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L6f
            goto L8a
        L6f:
            if (r8 == 0) goto L7c
            int r2 = r7.idleState     // Catch: java.lang.Throwable -> L38
            if (r2 != r5) goto L7c
            com.sun.mail.imap.protocol.IMAPProtocol r2 = r7.protocol     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L7a
            r2.idleAbort()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L7a
        L7a:
            r7.idleState = r3     // Catch: java.lang.Throwable -> L38
        L7c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
        L7d:
            if (r0 == 0) goto L0
            com.sun.mail.imap.protocol.IMAPProtocol r0 = r7.protocol
            boolean r0 = r0.hasResponse()
            if (r0 != 0) goto L0
            return r5
        L88:
            r8 = move-exception
            goto L9c
        L8a:
            com.sun.mail.util.MailLogger r8 = r7.logger     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "handleIdle: set to RUNNING"
            r8.finest(r0)     // Catch: java.lang.Throwable -> L38
            r7.idleState = r2     // Catch: java.lang.Throwable -> L38
            r7.idleManager = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r7.messageCacheLock     // Catch: java.lang.Throwable -> L38
            r8.notifyAll()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            return r2
        L9c:
            com.sun.mail.util.MailLogger r0 = r7.logger     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "handleIdle: set to RUNNING"
            r0.finest(r3)     // Catch: java.lang.Throwable -> L38
            r7.idleState = r2     // Catch: java.lang.Throwable -> L38
            r7.idleManager = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r7.messageCacheLock     // Catch: java.lang.Throwable -> L38
            r0.notifyAll()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        Lad:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: com.sun.mail.iap.ProtocolException -> Laf com.sun.mail.iap.ConnectionException -> Lb1
        Laf:
            r8 = move-exception
            goto Lb3
        Lb1:
            r8 = move-exception
            goto Lbd
        Lb3:
            jakarta.mail.MessagingException r0 = new jakarta.mail.MessagingException
            java.lang.String r1 = r8.getMessage()
            r0.<init>(r1, r8)
            throw r0
        Lbd:
            jakarta.mail.FolderClosedException r0 = new jakarta.mail.FolderClosedException
            java.lang.String r8 = r8.getMessage()
            r0.<init>(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPFolder.handleIdle(boolean):boolean");
    }

    @Override // com.sun.mail.iap.ResponseHandler
    public void handleResponse(Response response) throws NumberFormatException {
        if (response.isOK() || response.isNO() || response.isBAD() || response.isBYE()) {
            ((IMAPStore) this.store).handleResponseCode(response);
        }
        int i10 = 0;
        if (response.isBYE()) {
            if (this.opened) {
                cleanup(false);
                return;
            }
            return;
        }
        if (response.isOK()) {
            response.skipSpaces();
            if (response.readByte() == 91 && response.readAtom().equalsIgnoreCase("HIGHESTMODSEQ")) {
                this.highestmodseq = response.readLong();
            }
            response.reset();
            return;
        }
        if (response.isUnTagged()) {
            if (!(response instanceof IMAPResponse)) {
                this.logger.fine("UNEXPECTED RESPONSE : " + response.toString());
                return;
            }
            IMAPResponse iMAPResponse = (IMAPResponse) response;
            if (iMAPResponse.keyEquals("EXISTS")) {
                int number = iMAPResponse.getNumber();
                int i11 = this.realTotal;
                if (number <= i11) {
                    return;
                }
                int i12 = number - i11;
                AbstractC3682n[] abstractC3682nArr = new AbstractC3682n[i12];
                this.messageCache.addMessages(i12, i11 + 1);
                int i13 = this.total;
                this.realTotal += i12;
                this.total += i12;
                if (this.hasMessageCountListener) {
                    while (i10 < i12) {
                        i13++;
                        abstractC3682nArr[i10] = this.messageCache.getMessage(i13);
                        i10++;
                    }
                    notifyMessageAddedListeners(abstractC3682nArr);
                    return;
                }
                return;
            }
            if (iMAPResponse.keyEquals("EXPUNGE")) {
                int number2 = iMAPResponse.getNumber();
                if (number2 > this.realTotal) {
                    return;
                }
                AbstractC3682n[] abstractC3682nArr2 = null;
                if (this.doExpungeNotification && this.hasMessageCountListener) {
                    IMAPMessage messageBySeqNumber = getMessageBySeqNumber(number2);
                    AbstractC3682n[] abstractC3682nArr3 = {messageBySeqNumber};
                    if (messageBySeqNumber != null) {
                        abstractC3682nArr2 = abstractC3682nArr3;
                    }
                }
                this.messageCache.expungeMessage(number2);
                this.realTotal--;
                if (abstractC3682nArr2 != null) {
                    notifyMessageRemovedListeners(false, abstractC3682nArr2);
                    return;
                }
                return;
            }
            if (!iMAPResponse.keyEquals("VANISHED")) {
                if (!iMAPResponse.keyEquals("FETCH")) {
                    if (iMAPResponse.keyEquals("RECENT")) {
                        this.recent = iMAPResponse.getNumber();
                        return;
                    }
                    return;
                } else {
                    AbstractC3682n abstractC3682nProcessFetchResponse = processFetchResponse((FetchResponse) iMAPResponse);
                    if (abstractC3682nProcessFetchResponse != null) {
                        notifyMessageChangedListeners(1, abstractC3682nProcessFetchResponse);
                        return;
                    }
                    return;
                }
            }
            if (iMAPResponse.readAtomStringList() == null) {
                UIDSet[] uIDSets = UIDSet.parseUIDSets(iMAPResponse.readAtom());
                this.realTotal = (int) (this.realTotal - UIDSet.size(uIDSets));
                AbstractC3682n[] abstractC3682nArrCreateMessagesForUIDs = createMessagesForUIDs(UIDSet.toArray(uIDSets));
                int length = abstractC3682nArrCreateMessagesForUIDs.length;
                while (i10 < length) {
                    AbstractC3682n abstractC3682n = abstractC3682nArrCreateMessagesForUIDs[i10];
                    if (abstractC3682n.getMessageNumber() > 0) {
                        this.messageCache.expungeMessage(abstractC3682n.getMessageNumber());
                    }
                    i10++;
                }
                if (this.doExpungeNotification && this.hasMessageCountListener) {
                    notifyMessageRemovedListeners(true, abstractC3682nArrCreateMessagesForUIDs);
                }
            }
        }
    }

    public void handleResponses(Response[] responseArr) throws NumberFormatException {
        for (Response response : responseArr) {
            if (response != null) {
                handleResponse(response);
            }
        }
    }

    public synchronized boolean hasNewMessages() {
        final String str;
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        synchronized (this.messageCacheLock) {
            if (this.opened) {
                try {
                    keepConnectionAlive(true);
                    return this.recent > 0;
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this, e2.getMessage());
                } catch (ProtocolException e10) {
                    throw new MessagingException(e10.getMessage(), e10);
                }
            }
            if (!this.isNamespace || this.separator == 0) {
                str = this.fullName;
            } else {
                str = this.fullName + this.separator;
            }
            ListInfo[] listInfoArr = (ListInfo[]) doCommandIgnoreFailure(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.7
                @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                public Object doCommand(IMAPProtocol iMAPProtocol) {
                    return iMAPProtocol.list("", str);
                }
            });
            if (listInfoArr == null) {
                throw new FolderNotFoundException(this, this.fullName + " not found");
            }
            int i10 = listInfoArr[findName(listInfoArr, str)].changeState;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            try {
                return getStatus().recent > 0;
            } catch (BadCommandException unused) {
                return false;
            } catch (ConnectionException e11) {
                throw new StoreClosedException(this.store, e11.getMessage());
            } catch (ProtocolException e12) {
                throw new MessagingException(e12.getMessage(), e12);
            }
            throw th2;
        }
    }

    public Map<String, String> id(final Map<String, String> map) throws FolderClosedException {
        checkOpened();
        return (Map) doOptionalCommand("ID not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.20
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                return iMAPProtocol.id(map);
            }
        });
    }

    public void idle() throws InterruptedException {
        idle(false);
    }

    public void idleAbort() {
        synchronized (this.messageCacheLock) {
            try {
                if (this.idleState == 1 && this.protocol != null) {
                    this.protocol.idleAbort();
                    this.idleState = 2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void idleAbortWait() {
        synchronized (this.messageCacheLock) {
            if (this.idleState == 1 && this.protocol != null) {
                this.protocol.idleAbort();
                this.idleState = 2;
                do {
                    try {
                    } catch (Exception e2) {
                        this.logger.log(Level.FINEST, "Exception in idleAbortWait", (Throwable) e2);
                    }
                } while (handleIdle(false));
                this.logger.finest("IDLE aborted");
            }
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized boolean isOpen() {
        synchronized (this.messageCacheLock) {
            if (this.opened) {
                try {
                    keepConnectionAlive(false);
                } catch (ProtocolException unused) {
                }
            }
        }
        return this.opened;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized boolean isSubscribed() {
        final String str;
        ListInfo[] listInfoArr;
        try {
            if (!this.isNamespace || this.separator == 0) {
                str = this.fullName;
            } else {
                str = this.fullName + this.separator;
            }
            try {
                listInfoArr = (ListInfo[]) doProtocolCommand(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.4
                    @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                    public Object doCommand(IMAPProtocol iMAPProtocol) {
                        return iMAPProtocol.lsub("", str);
                    }
                });
            } catch (ProtocolException unused) {
                listInfoArr = null;
            }
            if (listInfoArr == null) {
                return false;
            }
            return listInfoArr[findName(listInfoArr, str)].canOpen;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void keepConnectionAlive(boolean z6) throws ProtocolException, InterruptedException {
        if (this.protocol == null) {
            return;
        }
        if (System.currentTimeMillis() - this.protocol.getTimestamp() > 1000) {
            waitIfIdle();
            if (this.protocol != null) {
                this.protocol.noop();
            }
        }
        if (z6 && ((IMAPStore) this.store).hasSeparateStoreConnection()) {
            IMAPProtocol folderStoreProtocol = null;
            try {
                folderStoreProtocol = ((IMAPStore) this.store).getFolderStoreProtocol();
                if (System.currentTimeMillis() - folderStoreProtocol.getTimestamp() > 1000) {
                    folderStoreProtocol.noop();
                }
            } finally {
                ((IMAPStore) this.store).releaseFolderStoreProtocol(folderStoreProtocol);
            }
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public AbstractC3679k[] list(String str) {
        return doList(str, false);
    }

    public Rights[] listRights(final String str) {
        return (Rights[]) doOptionalCommand("ACL not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.16
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                return iMAPProtocol.listRights(IMAPFolder.this.fullName, str);
            }
        });
    }

    @Override // jakarta.mail.AbstractC3679k
    public AbstractC3679k[] listSubscribed(String str) {
        return doList(str, true);
    }

    public synchronized void moveMessages(AbstractC3682n[] abstractC3682nArr, AbstractC3679k abstractC3679k) {
        copymoveMessages(abstractC3682nArr, abstractC3679k, true);
    }

    public synchronized AppendUID[] moveUIDMessages(AbstractC3682n[] abstractC3682nArr, AbstractC3679k abstractC3679k) {
        return copymoveUIDMessages(abstractC3682nArr, abstractC3679k, true);
    }

    public Rights myRights() {
        return (Rights) doOptionalCommand("ACL not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.17
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                return iMAPProtocol.myRights(IMAPFolder.this.fullName);
            }
        });
    }

    public IMAPMessage newIMAPMessage(int i10) {
        return new IMAPMessage(this, i10);
    }

    public synchronized void open(int i10) {
        open(i10, null);
    }

    public void releaseProtocol(boolean z6) {
        if (this.protocol != null) {
            this.protocol.removeResponseHandler(this);
            if (z6) {
                ((IMAPStore) this.store).releaseProtocol(this, this.protocol);
            } else {
                this.protocol.disconnect();
                ((IMAPStore) this.store).releaseProtocol(this, null);
            }
            this.protocol = null;
        }
    }

    public synchronized void releaseStoreProtocol(IMAPProtocol iMAPProtocol) {
        try {
            if (iMAPProtocol != this.protocol) {
                ((IMAPStore) this.store).releaseFolderStoreProtocol(iMAPProtocol);
            } else {
                this.logger.fine("releasing our protocol as store protocol?");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void removeACL(final String str) throws MessagingException {
        doOptionalCommand("ACL not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.15
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                iMAPProtocol.deleteACL(IMAPFolder.this.fullName, str);
                return null;
            }
        });
    }

    public void removeRights(ACL acl) throws MessagingException {
        setACL(acl, '-');
    }

    public synchronized boolean renameTo(final AbstractC3679k abstractC3679k) {
        checkClosed();
        checkExists();
        if (abstractC3679k.getStore() != this.store) {
            throw new MessagingException("Can't rename across Stores");
        }
        if (doCommandIgnoreFailure(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.9
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                iMAPProtocol.rename(IMAPFolder.this.fullName, abstractC3679k.getFullName());
                return Boolean.TRUE;
            }
        }) == null) {
            return false;
        }
        this.exists = false;
        this.attributes = null;
        notifyFolderRenamedListeners(abstractC3679k);
        return true;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized AbstractC3682n[] search(AbstractC5767j abstractC5767j) {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        try {
            try {
                synchronized (this.messageCacheLock) {
                    try {
                        int[] iArrSearch = getProtocol().search(abstractC5767j);
                        messagesBySeqNumbers = iArrSearch != null ? getMessagesBySeqNumbers(iArrSearch) : null;
                    } finally {
                    }
                }
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this, e2.getMessage());
            } catch (SearchException e10) {
                if (((IMAPStore) this.store).throwSearchException()) {
                    throw e10;
                }
                return super.search(abstractC5767j);
            }
        } catch (CommandFailedException unused) {
            return super.search(abstractC5767j);
        } catch (ProtocolException e11) {
            throw new MessagingException(e11.getMessage(), e11);
        }
        return messagesBySeqNumbers;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void setFlags(AbstractC3682n[] abstractC3682nArr, C3678j c3678j, boolean z6) {
        checkOpened();
        checkFlags(c3678j);
        if (abstractC3682nArr.length == 0) {
            return;
        }
        synchronized (this.messageCacheLock) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    MessageSet[] messageSetSorted = Utility.toMessageSetSorted(abstractC3682nArr, null);
                    if (messageSetSorted == null) {
                        throw new MessageRemovedException("Messages have been removed");
                    }
                    protocol.storeFlags(messageSetSorted, c3678j, z6);
                } catch (ConnectionException e2) {
                    throw new FolderClosedException(this, e2.getMessage());
                }
            } catch (ProtocolException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        }
    }

    public void setQuota(final C3694v c3694v) throws MessagingException {
        doOptionalCommand("QUOTA not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.13
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                iMAPProtocol.setQuota(c3694v);
                return null;
            }
        });
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void setSubscribed(final boolean z6) {
        doCommandIgnoreFailure(new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.5
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                if (z6) {
                    iMAPProtocol.subscribe(IMAPFolder.this.fullName);
                    return null;
                }
                iMAPProtocol.unsubscribe(IMAPFolder.this.fullName);
                return null;
            }
        });
    }

    public boolean startIdle(final IdleManager idleManager) {
        boolean zBooleanValue;
        IdleManager idleManager2;
        synchronized (this) {
            try {
                checkOpened();
                if (idleManager != null && (idleManager2 = this.idleManager) != null && idleManager != idleManager2) {
                    throw new MessagingException("Folder already being watched by another IdleManager");
                }
                Boolean bool = (Boolean) doOptionalCommand("IDLE not supported", new ProtocolCommand() { // from class: com.sun.mail.imap.IMAPFolder.19
                    @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
                    public Object doCommand(IMAPProtocol iMAPProtocol) throws InterruptedException {
                        IdleManager idleManager3;
                        if (IMAPFolder.this.idleState == 1 && (idleManager3 = idleManager) != null && idleManager3 == IMAPFolder.this.idleManager) {
                            return Boolean.TRUE;
                        }
                        if (IMAPFolder.this.idleState != 0) {
                            try {
                                IMAPFolder.this.messageCacheLock.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                            return Boolean.FALSE;
                        }
                        iMAPProtocol.idleStart();
                        IMAPFolder.this.logger.finest("startIdle: set to IDLE");
                        IMAPFolder.this.idleState = 1;
                        IMAPFolder.this.idleManager = idleManager;
                        return Boolean.TRUE;
                    }
                });
                this.logger.log(Level.FINEST, "startIdle: return {0}", bool);
                zBooleanValue = bool.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public synchronized void throwClosedException(ConnectionException connectionException) {
        try {
            if (this.protocol == null || connectionException.getProtocol() != this.protocol) {
                if (this.protocol != null || this.reallyClosed) {
                    throw new StoreClosedException(this.store, connectionException.getMessage());
                }
            }
            throw new FolderClosedException(this, connectionException.getMessage());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void waitIfIdle() throws ProtocolException, InterruptedException {
        while (true) {
            int i10 = this.idleState;
            if (i10 == 0) {
                return;
            }
            if (i10 == 1) {
                IdleManager idleManager = this.idleManager;
                if (idleManager != null) {
                    this.logger.finest("waitIfIdle: request IdleManager to abort");
                    idleManager.requestAbort(this);
                } else {
                    this.logger.finest("waitIfIdle: abort IDLE");
                    this.protocol.idleAbort();
                    this.idleState = 2;
                }
            } else {
                this.logger.log(Level.FINEST, "waitIfIdle: idleState {0}", Integer.valueOf(i10));
            }
            try {
                MailLogger mailLogger = this.logger;
                Level level = Level.FINEST;
                if (mailLogger.isLoggable(level)) {
                    this.logger.finest("waitIfIdle: wait to be not idle: " + Thread.currentThread());
                }
                this.messageCacheLock.wait();
                if (this.logger.isLoggable(level)) {
                    this.logger.finest("waitIfIdle: wait done, idleState " + this.idleState + ": " + Thread.currentThread());
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new ProtocolException("Interrupted waitIfIdle", e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c3, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r9 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized jakarta.mail.AbstractC3682n[] expunge(jakarta.mail.AbstractC3682n[] r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Cannot expunge READ_ONLY folder: "
            monitor-enter(r8)
            r8.checkOpened()     // Catch: java.lang.Throwable -> L1f
            if (r9 == 0) goto L22
            jakarta.mail.h r1 = new jakarta.mail.h     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            jakarta.mail.g0 r2 = jakarta.mail.g0.f19308a     // Catch: java.lang.Throwable -> L1f
            java.util.Vector r3 = new java.util.Vector     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            r1.f19309a = r3     // Catch: java.lang.Throwable -> L1f
            java.util.Vector r3 = r1.f19309a     // Catch: java.lang.Throwable -> L1f
            r3.addElement(r2)     // Catch: java.lang.Throwable -> L1f
            r8.fetch(r9, r1)     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r9 = move-exception
            goto Lc2
        L22:
            java.lang.Object r1 = r8.messageCacheLock     // Catch: java.lang.Throwable -> L1f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            r8.doExpungeNotification = r2     // Catch: java.lang.Throwable -> L4e
            r3 = 1
            com.sun.mail.imap.protocol.IMAPProtocol r4 = r8.getProtocol()     // Catch: java.lang.Throwable -> L37 com.sun.mail.iap.ProtocolException -> L3a com.sun.mail.iap.ConnectionException -> L3c com.sun.mail.iap.CommandFailedException -> L3e
            if (r9 == 0) goto L40
            com.sun.mail.imap.protocol.UIDSet[] r5 = com.sun.mail.imap.Utility.toUIDSet(r9)     // Catch: java.lang.Throwable -> L37 com.sun.mail.iap.ProtocolException -> L3a com.sun.mail.iap.ConnectionException -> L3c com.sun.mail.iap.CommandFailedException -> L3e
            r4.uidexpunge(r5)     // Catch: java.lang.Throwable -> L37 com.sun.mail.iap.ProtocolException -> L3a com.sun.mail.iap.ConnectionException -> L3c com.sun.mail.iap.CommandFailedException -> L3e
            goto L43
        L37:
            r9 = move-exception
            goto Lbd
        L3a:
            r9 = move-exception
            goto L86
        L3c:
            r9 = move-exception
            goto L90
        L3e:
            r9 = move-exception
            goto L9a
        L40:
            r4.expunge()     // Catch: java.lang.Throwable -> L37 com.sun.mail.iap.ProtocolException -> L3a com.sun.mail.iap.ConnectionException -> L3c com.sun.mail.iap.CommandFailedException -> L3e
        L43:
            r8.doExpungeNotification = r3     // Catch: java.lang.Throwable -> L4e
            if (r9 == 0) goto L50
            com.sun.mail.imap.MessageCache r0 = r8.messageCache     // Catch: java.lang.Throwable -> L4e
            com.sun.mail.imap.IMAPMessage[] r9 = r0.removeExpungedMessages(r9)     // Catch: java.lang.Throwable -> L4e
            goto L56
        L4e:
            r9 = move-exception
            goto Lc0
        L50:
            com.sun.mail.imap.MessageCache r9 = r8.messageCache     // Catch: java.lang.Throwable -> L4e
            com.sun.mail.imap.IMAPMessage[] r9 = r9.removeExpungedMessages()     // Catch: java.lang.Throwable -> L4e
        L56:
            java.util.Hashtable<java.lang.Long, com.sun.mail.imap.IMAPMessage> r0 = r8.uidTable     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L75
        L5a:
            int r0 = r9.length     // Catch: java.lang.Throwable -> L4e
            if (r2 >= r0) goto L75
            r0 = r9[r2]     // Catch: java.lang.Throwable -> L4e
            long r4 = r0.getUID()     // Catch: java.lang.Throwable -> L4e
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L72
            java.util.Hashtable<java.lang.Long, com.sun.mail.imap.IMAPMessage> r0 = r8.uidTable     // Catch: java.lang.Throwable -> L4e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L4e
            r0.remove(r4)     // Catch: java.lang.Throwable -> L4e
        L72:
            int r2 = r2 + 1
            goto L5a
        L75:
            com.sun.mail.imap.MessageCache r0 = r8.messageCache     // Catch: java.lang.Throwable -> L4e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L4e
            r8.total = r0     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            int r0 = r9.length     // Catch: java.lang.Throwable -> L1f
            if (r0 <= 0) goto L84
            r8.notifyMessageRemovedListeners(r3, r9)     // Catch: java.lang.Throwable -> L1f
        L84:
            monitor-exit(r8)
            return r9
        L86:
            jakarta.mail.MessagingException r0 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r9.getMessage()     // Catch: java.lang.Throwable -> L37
            r0.<init>(r2, r9)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L90:
            jakarta.mail.FolderClosedException r0 = new jakarta.mail.FolderClosedException     // Catch: java.lang.Throwable -> L37
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L37
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L9a:
            int r2 = r8.mode     // Catch: java.lang.Throwable -> L37
            r4 = 2
            if (r2 == r4) goto Lb3
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r8.fullName     // Catch: java.lang.Throwable -> L37
            r2.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L37
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        Lb3:
            jakarta.mail.MessagingException r0 = new jakarta.mail.MessagingException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r9.getMessage()     // Catch: java.lang.Throwable -> L37
            r0.<init>(r2, r9)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        Lbd:
            r8.doExpungeNotification = r3     // Catch: java.lang.Throwable -> L4e
            throw r9     // Catch: java.lang.Throwable -> L4e
        Lc0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            throw r9     // Catch: java.lang.Throwable -> L1f
        Lc2:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1f
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPFolder.expunge(jakarta.mail.n[]):jakarta.mail.n[]");
    }

    public synchronized AbstractC3682n[] getSortedMessages(SortTerm[] sortTermArr, AbstractC5767j abstractC5767j) {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        try {
            try {
                synchronized (this.messageCacheLock) {
                    try {
                        int[] iArrSort = getProtocol().sort(sortTermArr, abstractC5767j);
                        messagesBySeqNumbers = iArrSort != null ? getMessagesBySeqNumbers(iArrSort) : null;
                    } finally {
                    }
                }
            } catch (CommandFailedException e2) {
                throw new MessagingException(e2.getMessage(), e2);
            } catch (SearchException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        } catch (ConnectionException e11) {
            throw new FolderClosedException(this, e11.getMessage());
        } catch (ProtocolException e12) {
            throw new MessagingException(e12.getMessage(), e12);
        }
        return messagesBySeqNumbers;
    }

    public void idle(boolean z6) throws InterruptedException {
        synchronized (this) {
            try {
                if (this.protocol != null && this.protocol.getChannel() != null) {
                    throw new MessagingException("idle method not supported with SocketChannels");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (startIdle(null)) {
            while (handleIdle(z6)) {
            }
            int minIdleTime = ((IMAPStore) this.store).getMinIdleTime();
            if (minIdleTime > 0) {
                try {
                    Thread.sleep(minIdleTime);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private void close(boolean z6, boolean z10) {
        synchronized (this.messageCacheLock) {
            try {
                if (!this.opened && this.reallyClosed) {
                    throw new IllegalStateException("This operation is not allowed on a closed folder");
                }
                boolean z11 = true;
                this.reallyClosed = true;
                if (this.opened) {
                    try {
                        waitIfIdle();
                        if (z10) {
                            this.logger.log(Level.FINE, "forcing folder {0} to close", this.fullName);
                            if (this.protocol != null) {
                                this.protocol.disconnect();
                            }
                        } else if (((IMAPStore) this.store).isConnectionPoolFull()) {
                            this.logger.fine("pool is full, not adding an Authenticated connection");
                            if (z6 && this.protocol != null) {
                                this.protocol.close();
                            }
                            if (this.protocol != null) {
                                this.protocol.logout();
                            }
                        } else if (!z6 && this.mode == 2) {
                            try {
                                if (this.protocol != null && this.protocol.hasCapability("UNSELECT")) {
                                    this.protocol.unselect();
                                } else if (this.protocol != null) {
                                    try {
                                        this.protocol.examine(this.fullName);
                                        if (this.protocol != null) {
                                            this.protocol.close();
                                        }
                                    } catch (CommandFailedException unused) {
                                    }
                                }
                            } catch (ProtocolException unused2) {
                                z11 = false;
                            }
                        } else if (this.protocol != null) {
                            this.protocol.close();
                        }
                        if (this.opened) {
                            cleanup(z11);
                        }
                    } catch (ProtocolException e2) {
                        throw new MessagingException(e2.getMessage(), e2);
                    }
                }
            } catch (Throwable th2) {
                if (this.opened) {
                    cleanup(true);
                }
                throw th2;
            } finally {
            }
        }
    }

    public synchronized List<AbstractC3642e> open(int i10, ResyncData resyncData) {
        MailboxInfo mailboxInfoSelect;
        ArrayList arrayList;
        long[] array;
        checkClosed();
        this.protocol = ((IMAPStore) this.store).getProtocol(this);
        synchronized (this.messageCacheLock) {
            try {
                this.protocol.addResponseHandler(this);
                if (resyncData != null) {
                    try {
                        if (resyncData == ResyncData.CONDSTORE) {
                            if (!this.protocol.isEnabled("CONDSTORE") && !this.protocol.isEnabled("QRESYNC")) {
                                if (this.protocol.hasCapability("CONDSTORE")) {
                                    this.protocol.enable("CONDSTORE");
                                } else {
                                    this.protocol.enable("QRESYNC");
                                }
                            }
                        } else if (!this.protocol.isEnabled("QRESYNC")) {
                            this.protocol.enable("QRESYNC");
                        }
                    } catch (CommandFailedException e2) {
                        try {
                            checkExists();
                            if ((this.type & 1) == 0) {
                                throw new MessagingException("folder cannot contain messages");
                            }
                            throw new MessagingException(e2.getMessage(), e2);
                        } catch (Throwable th2) {
                            this.exists = false;
                            this.attributes = null;
                            this.type = 0;
                            releaseProtocol(true);
                            throw th2;
                        }
                    } catch (ProtocolException e10) {
                        try {
                            throw logoutAndThrow(e10.getMessage(), e10);
                        } catch (Throwable th3) {
                            releaseProtocol(false);
                            throw th3;
                        }
                    }
                }
                if (i10 == 1) {
                    mailboxInfoSelect = this.protocol.examine(this.fullName, resyncData);
                } else {
                    mailboxInfoSelect = this.protocol.select(this.fullName, resyncData);
                }
                int i11 = mailboxInfoSelect.mode;
                if (i11 != i10 && (i10 != 2 || i11 != 1 || !((IMAPStore) this.store).allowReadOnlySelect())) {
                    ReadOnlyFolderException readOnlyFolderException = new ReadOnlyFolderException("Cannot open in desired mode");
                    readOnlyFolderException.f19279a = this;
                    throw cleanupAndThrow(readOnlyFolderException);
                }
                this.opened = true;
                this.reallyClosed = false;
                this.mode = mailboxInfoSelect.mode;
                this.availableFlags = mailboxInfoSelect.availableFlags;
                this.permanentFlags = mailboxInfoSelect.permanentFlags;
                int i12 = mailboxInfoSelect.total;
                this.realTotal = i12;
                this.total = i12;
                this.recent = mailboxInfoSelect.recent;
                this.uidvalidity = mailboxInfoSelect.uidvalidity;
                this.uidnext = mailboxInfoSelect.uidnext;
                this.uidNotSticky = mailboxInfoSelect.uidNotSticky;
                this.highestmodseq = mailboxInfoSelect.highestmodseq;
                this.messageCache = new MessageCache(this, (IMAPStore) this.store, this.total);
                if (mailboxInfoSelect.responses != null) {
                    arrayList = new ArrayList();
                    for (IMAPResponse iMAPResponse : mailboxInfoSelect.responses) {
                        if (iMAPResponse.keyEquals("VANISHED")) {
                            String[] atomStringList = iMAPResponse.readAtomStringList();
                            if (atomStringList != null && atomStringList.length == 1 && atomStringList[0].equalsIgnoreCase("EARLIER") && (array = UIDSet.toArray(UIDSet.parseUIDSets(iMAPResponse.readAtom()), this.uidnext)) != null && array.length > 0) {
                                arrayList.add(new MessageVanishedEvent(this, array));
                            }
                        } else if (iMAPResponse.keyEquals("FETCH") && processFetchResponse((FetchResponse) iMAPResponse) != null) {
                            arrayList.add(new C3637e(1, this));
                        }
                    }
                } else {
                    arrayList = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.exists = true;
        this.attributes = null;
        this.type = 1;
        notifyConnectionListeners(1);
        return arrayList;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized AbstractC3682n[] search(AbstractC5767j abstractC5767j, AbstractC3682n[] abstractC3682nArr) {
        IMAPMessage[] messagesBySeqNumbers;
        checkOpened();
        if (abstractC3682nArr.length == 0) {
            return abstractC3682nArr;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this.messageCacheLock) {
                            try {
                                IMAPProtocol protocol = getProtocol();
                                MessageSet[] messageSetSorted = Utility.toMessageSetSorted(abstractC3682nArr, null);
                                if (messageSetSorted != null) {
                                    int[] iArrSearch = protocol.search(messageSetSorted, abstractC5767j);
                                    messagesBySeqNumbers = iArrSearch != null ? getMessagesBySeqNumbers(iArrSearch) : null;
                                } else {
                                    throw new MessageRemovedException("Messages have been removed");
                                }
                            } finally {
                            }
                        }
                        return messagesBySeqNumbers;
                    } catch (ConnectionException e2) {
                        throw new FolderClosedException(this, e2.getMessage());
                    }
                } catch (SearchException unused) {
                    return super.search(abstractC5767j, abstractC3682nArr);
                }
            } catch (ProtocolException e10) {
                throw new MessagingException(e10.getMessage(), e10);
            }
        } catch (CommandFailedException unused2) {
            return super.search(abstractC5767j, abstractC3682nArr);
        }
    }

    public synchronized AbstractC3682n[] getMessagesByUID(long[] jArr) {
        long[] jArr2;
        AbstractC3682n[] abstractC3682nArr;
        checkOpened();
        try {
            synchronized (this.messageCacheLock) {
                try {
                    if (this.uidTable != null) {
                        ArrayList arrayList = new ArrayList();
                        for (long j6 : jArr) {
                            if (!this.uidTable.containsKey(Long.valueOf(j6))) {
                                arrayList.add(Long.valueOf(j6));
                            }
                        }
                        int size = arrayList.size();
                        jArr2 = new long[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            jArr2[i10] = ((Long) arrayList.get(i10)).longValue();
                        }
                    } else {
                        this.uidTable = new Hashtable<>();
                        jArr2 = jArr;
                    }
                    if (jArr2.length > 0) {
                        getProtocol().fetchSequenceNumbers(jArr2);
                    }
                    abstractC3682nArr = new AbstractC3682n[jArr.length];
                    for (int i11 = 0; i11 < jArr.length; i11++) {
                        abstractC3682nArr[i11] = this.uidTable.get(Long.valueOf(jArr[i11]));
                    }
                } finally {
                }
            }
        } catch (ConnectionException e2) {
            throw new FolderClosedException(this, e2.getMessage());
        } catch (ProtocolException e10) {
            throw new MessagingException(e10.getMessage(), e10);
        }
        return abstractC3682nArr;
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void setFlags(int i10, int i11, C3678j c3678j, boolean z6) {
        try {
            checkOpened();
            AbstractC3682n[] abstractC3682nArr = new AbstractC3682n[(i11 - i10) + 1];
            int i12 = 0;
            while (i10 <= i11) {
                abstractC3682nArr[i12] = getMessage(i10);
                i10++;
                i12++;
            }
            setFlags(abstractC3682nArr, c3678j, z6);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // jakarta.mail.AbstractC3679k
    public synchronized void setFlags(int[] iArr, C3678j c3678j, boolean z6) {
        try {
            checkOpened();
            AbstractC3682n[] abstractC3682nArr = new AbstractC3682n[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                abstractC3682nArr[i10] = getMessage(iArr[i10]);
            }
            setFlags(abstractC3682nArr, c3678j, z6);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public IMAPFolder(ListInfo listInfo, IMAPStore iMAPStore) {
        this(listInfo.name, listInfo.separator, iMAPStore, null);
        if (listInfo.hasInferiors) {
            this.type |= 2;
        }
        if (listInfo.canOpen) {
            this.type |= 1;
        }
        this.exists = true;
        this.attributes = listInfo.attrs;
    }
}
