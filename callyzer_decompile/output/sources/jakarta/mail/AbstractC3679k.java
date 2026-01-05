package jakarta.mail;

import jakarta.mail.event.AbstractC3642e;
import jakarta.mail.event.C3638a;
import jakarta.mail.event.C3640c;
import jakarta.mail.event.C3644g;
import jakarta.mail.event.InterfaceC3639b;
import jakarta.mail.event.InterfaceC3641d;
import jakarta.mail.event.InterfaceC3643f;
import jakarta.mail.event.InterfaceC3645h;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.Executor;
import ow.AbstractC5767j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.k */
/* loaded from: classes3.dex */
public abstract class AbstractC3679k implements AutoCloseable {
    public static final int HOLDS_FOLDERS = 2;
    public static final int HOLDS_MESSAGES = 1;
    public static final int READ_ONLY = 1;
    public static final int READ_WRITE = 2;

    /* renamed from: q */
    private final RunnableC3648f f19404q;
    protected d0 store;
    protected int mode = -1;
    private volatile Vector<InterfaceC3639b> connectionListeners = null;
    private volatile Vector<InterfaceC3641d> folderListeners = null;
    private volatile Vector<InterfaceC3645h> messageCountListeners = null;
    private volatile Vector<InterfaceC3643f> messageChangedListeners = null;

    public AbstractC3679k(d0 d0Var) {
        this.store = d0Var;
        c0 session = d0Var.getSession();
        String property = session.f19287a.getProperty("mail.event.scope", "folder");
        Executor executor = (Executor) session.f19287a.get("mail.event.executor");
        if (property.equalsIgnoreCase("application")) {
            this.f19404q = RunnableC3648f.m8191b(executor);
            return;
        }
        if (property.equalsIgnoreCase("session")) {
            this.f19404q = session.f19296j;
        } else if (property.equalsIgnoreCase("store")) {
            this.f19404q = d0Var.getEventQueue();
        } else {
            this.f19404q = new RunnableC3648f(executor);
        }
    }

    public synchronized void addConnectionListener(InterfaceC3639b interfaceC3639b) {
        try {
            if (this.connectionListeners == null) {
                this.connectionListeners = new Vector<>();
            }
            this.connectionListeners.addElement(interfaceC3639b);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addFolderListener(InterfaceC3641d interfaceC3641d) {
        try {
            if (this.folderListeners == null) {
                this.folderListeners = new Vector<>();
            }
            this.folderListeners.addElement(interfaceC3641d);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addMessageChangedListener(InterfaceC3643f interfaceC3643f) {
        try {
            if (this.messageChangedListeners == null) {
                this.messageChangedListeners = new Vector<>();
            }
            this.messageChangedListeners.addElement(interfaceC3643f);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addMessageCountListener(InterfaceC3645h interfaceC3645h) {
        try {
            if (this.messageCountListeners == null) {
                this.messageCountListeners = new Vector<>();
            }
            this.messageCountListeners.addElement(interfaceC3645h);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract void appendMessages(AbstractC3682n[] abstractC3682nArr);

    @Override // java.lang.AutoCloseable
    public void close() {
        close(true);
    }

    public abstract void close(boolean z6);

    public void copyMessages(AbstractC3682n[] abstractC3682nArr, AbstractC3679k abstractC3679k) throws FolderNotFoundException {
        if (abstractC3679k.exists()) {
            abstractC3679k.appendMessages(abstractC3682nArr);
            return;
        }
        FolderNotFoundException folderNotFoundException = new FolderNotFoundException(abstractC3679k.getFullName() + " does not exist");
        folderNotFoundException.f19278a = abstractC3679k;
        throw folderNotFoundException;
    }

    public abstract boolean delete(boolean z6);

    public abstract boolean exists();

    public void finalize() throws Throwable {
        try {
            this.f19404q.m8193c();
        } finally {
            super.finalize();
        }
    }

    public synchronized int getDeletedMessageCount() {
        if (!isOpen()) {
            return -1;
        }
        int messageCount = getMessageCount();
        int i10 = 0;
        for (int i11 = 1; i11 <= messageCount; i11++) {
            try {
                if (getMessage(i11).isSet(C3651i.f19324c)) {
                    i10++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i10;
    }

    public abstract String getFullName();

    public abstract AbstractC3682n getMessage(int i10);

    public abstract int getMessageCount();

    public synchronized AbstractC3682n[] getMessages(int i10, int i11) {
        AbstractC3682n[] abstractC3682nArr;
        abstractC3682nArr = new AbstractC3682n[(i11 - i10) + 1];
        for (int i12 = i10; i12 <= i11; i12++) {
            abstractC3682nArr[i12 - i10] = getMessage(i12);
        }
        return abstractC3682nArr;
    }

    public synchronized int getMode() {
        if (!isOpen()) {
            throw new IllegalStateException("Folder not open");
        }
        return this.mode;
    }

    public synchronized int getNewMessageCount() {
        if (!isOpen()) {
            return -1;
        }
        int messageCount = getMessageCount();
        int i10 = 0;
        for (int i11 = 1; i11 <= messageCount; i11++) {
            try {
                if (getMessage(i11).isSet(C3651i.f19327f)) {
                    i10++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i10;
    }

    public d0 getStore() {
        return this.store;
    }

    public h0 getURLName() {
        h0 uRLName = getStore().getURLName();
        String fullName = getFullName();
        StringBuilder sb2 = new StringBuilder();
        if (fullName != null) {
            sb2.append(fullName);
        }
        return new h0(uRLName.f19319h, uRLName.f19313b, uRLName.f19316e, sb2.toString(), uRLName.m8199d(), null);
    }

    public synchronized int getUnreadMessageCount() {
        if (!isOpen()) {
            return -1;
        }
        int messageCount = getMessageCount();
        int i10 = 0;
        for (int i11 = 1; i11 <= messageCount; i11++) {
            try {
                if (!getMessage(i11).isSet(C3651i.f19328g)) {
                    i10++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i10;
    }

    /* renamed from: h */
    public final void m8266h(AbstractC3642e abstractC3642e, Vector vector) {
        this.f19404q.m8192a(abstractC3642e, (Vector) vector.clone());
    }

    public abstract boolean isOpen();

    public boolean isSubscribed() {
        return true;
    }

    public AbstractC3679k[] list() {
        return list("%");
    }

    public abstract AbstractC3679k[] list(String str);

    public AbstractC3679k[] listSubscribed(String str) {
        return list(str);
    }

    public void notifyConnectionListeners(int i10) {
        if (this.connectionListeners != null) {
            m8266h(new C3638a(this, i10), this.connectionListeners);
        }
        if (i10 == 3) {
            this.f19404q.m8193c();
        }
    }

    public void notifyFolderListeners(int i10) {
        if (this.folderListeners != null) {
            m8266h(new C3640c(this, this, this, i10), this.folderListeners);
        }
        this.store.notifyFolderListeners(i10, this);
    }

    public void notifyFolderRenamedListeners(AbstractC3679k abstractC3679k) {
        if (this.folderListeners != null) {
            m8266h(new C3640c(this, this, abstractC3679k, 3), this.folderListeners);
        }
        this.store.notifyFolderRenamedListeners(this, abstractC3679k);
    }

    public void notifyMessageAddedListeners(AbstractC3682n[] abstractC3682nArr) {
        if (this.messageCountListeners == null) {
            return;
        }
        m8266h(new C3644g(this, 1, false, abstractC3682nArr), this.messageCountListeners);
    }

    public void notifyMessageChangedListeners(int i10, AbstractC3682n abstractC3682n) {
        if (this.messageChangedListeners == null) {
            return;
        }
        m8266h(new C3637e(1, this), this.messageChangedListeners);
    }

    public void notifyMessageRemovedListeners(boolean z6, AbstractC3682n[] abstractC3682nArr) {
        if (this.messageCountListeners == null) {
            return;
        }
        m8266h(new C3644g(this, 2, z6, abstractC3682nArr), this.messageCountListeners);
    }

    public synchronized void removeConnectionListener(InterfaceC3639b interfaceC3639b) {
        if (this.connectionListeners != null) {
            this.connectionListeners.removeElement(interfaceC3639b);
        }
    }

    public synchronized void removeFolderListener(InterfaceC3641d interfaceC3641d) {
        if (this.folderListeners != null) {
            this.folderListeners.removeElement(interfaceC3641d);
        }
    }

    public synchronized void removeMessageChangedListener(InterfaceC3643f interfaceC3643f) {
        if (this.messageChangedListeners != null) {
            this.messageChangedListeners.removeElement(interfaceC3643f);
        }
    }

    public synchronized void removeMessageCountListener(InterfaceC3645h interfaceC3645h) {
        if (this.messageCountListeners != null) {
            this.messageCountListeners.removeElement(interfaceC3645h);
        }
    }

    public AbstractC3682n[] search(AbstractC5767j abstractC5767j) {
        return search(abstractC5767j, getMessages());
    }

    public synchronized void setFlags(AbstractC3682n[] abstractC3682nArr, C3678j c3678j, boolean z6) {
        for (AbstractC3682n abstractC3682n : abstractC3682nArr) {
            try {
                abstractC3682n.setFlags(c3678j, z6);
            } catch (MessageRemovedException unused) {
            }
        }
    }

    public void setSubscribed(boolean z6) throws MethodNotSupportedException {
        throw new MethodNotSupportedException();
    }

    public String toString() {
        String fullName = getFullName();
        return fullName != null ? fullName : super.toString();
    }

    public AbstractC3679k[] listSubscribed() {
        return listSubscribed("%");
    }

    public AbstractC3682n[] search(AbstractC5767j abstractC5767j, AbstractC3682n[] abstractC3682nArr) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC3682n abstractC3682n : abstractC3682nArr) {
            try {
                if (abstractC3682n.match(abstractC5767j)) {
                    arrayList.add(abstractC3682n);
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return (AbstractC3682n[]) arrayList.toArray(new AbstractC3682n[arrayList.size()]);
    }

    public synchronized AbstractC3682n[] getMessages(int[] iArr) {
        AbstractC3682n[] abstractC3682nArr;
        int length = iArr.length;
        abstractC3682nArr = new AbstractC3682n[length];
        for (int i10 = 0; i10 < length; i10++) {
            abstractC3682nArr[i10] = getMessage(iArr[i10]);
        }
        return abstractC3682nArr;
    }

    public synchronized void setFlags(int i10, int i11, C3678j c3678j, boolean z6) {
        while (i10 <= i11) {
            try {
                getMessage(i10).setFlags(c3678j, z6);
            } catch (MessageRemovedException unused) {
            }
            i10++;
        }
    }

    public synchronized AbstractC3682n[] getMessages() {
        AbstractC3682n[] abstractC3682nArr;
        if (isOpen()) {
            int messageCount = getMessageCount();
            abstractC3682nArr = new AbstractC3682n[messageCount];
            for (int i10 = 1; i10 <= messageCount; i10++) {
                abstractC3682nArr[i10 - 1] = getMessage(i10);
            }
        } else {
            throw new IllegalStateException("Folder not open");
        }
        return abstractC3682nArr;
    }

    public synchronized void setFlags(int[] iArr, C3678j c3678j, boolean z6) {
        for (int i10 : iArr) {
            try {
                getMessage(i10).setFlags(c3678j, z6);
            } catch (MessageRemovedException unused) {
            }
        }
    }

    public void fetch(AbstractC3682n[] abstractC3682nArr, C3650h c3650h) {
    }
}
