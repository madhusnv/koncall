package jakarta.mail;

import jakarta.mail.event.C3640c;
import jakarta.mail.event.InterfaceC3641d;
import jakarta.mail.event.InterfaceC3646i;
import java.util.Vector;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class d0 extends AbstractC3695w {
    private volatile Vector<InterfaceC3641d> folderListeners;
    private volatile Vector<InterfaceC3646i> storeListeners;

    public d0(c0 c0Var, h0 h0Var) {
        super(c0Var, h0Var);
        this.storeListeners = null;
        this.folderListeners = null;
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

    public synchronized void addStoreListener(InterfaceC3646i interfaceC3646i) {
        try {
            if (this.storeListeners == null) {
                this.storeListeners = new Vector<>();
            }
            this.storeListeners.addElement(interfaceC3646i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract AbstractC3679k getDefaultFolder();

    public abstract AbstractC3679k getFolder(String str);

    public AbstractC3679k[] getPersonalNamespaces() {
        return new AbstractC3679k[]{getDefaultFolder()};
    }

    public AbstractC3679k[] getSharedNamespaces() {
        return new AbstractC3679k[0];
    }

    public AbstractC3679k[] getUserNamespaces(String str) {
        return new AbstractC3679k[0];
    }

    public void notifyFolderListeners(int i10, AbstractC3679k abstractC3679k) {
        if (this.folderListeners == null) {
            return;
        }
        queueEvent(new C3640c(this, abstractC3679k, abstractC3679k, i10), this.folderListeners);
    }

    public void notifyFolderRenamedListeners(AbstractC3679k abstractC3679k, AbstractC3679k abstractC3679k2) {
        if (this.folderListeners == null) {
            return;
        }
        queueEvent(new C3640c(this, abstractC3679k, abstractC3679k2, 3), this.folderListeners);
    }

    public void notifyStoreListeners(int i10, String str) {
        if (this.storeListeners == null) {
            return;
        }
        queueEvent(new C3637e(2, this), this.storeListeners);
    }

    public synchronized void removeFolderListener(InterfaceC3641d interfaceC3641d) {
        if (this.folderListeners != null) {
            this.folderListeners.removeElement(interfaceC3641d);
        }
    }

    public synchronized void removeStoreListener(InterfaceC3646i interfaceC3646i) {
        if (this.storeListeners != null) {
            this.storeListeners.removeElement(interfaceC3646i);
        }
    }
}
