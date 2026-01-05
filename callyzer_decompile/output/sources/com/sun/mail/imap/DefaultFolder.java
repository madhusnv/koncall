package com.sun.mail.imap;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.ListInfo;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.MethodNotSupportedException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class DefaultFolder extends IMAPFolder {
    public DefaultFolder(IMAPStore iMAPStore) {
        super("", (char) 65535, iMAPStore, null);
        this.exists = true;
        this.type = 2;
    }

    @Override // com.sun.mail.imap.IMAPFolder, jakarta.mail.AbstractC3679k
    public void appendMessages(AbstractC3682n[] abstractC3682nArr) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("Cannot append to Default Folder");
    }

    @Override // com.sun.mail.imap.IMAPFolder, jakarta.mail.AbstractC3679k
    public boolean delete(boolean z6) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("Cannot delete Default Folder");
    }

    @Override // com.sun.mail.imap.IMAPFolder
    public AbstractC3682n[] expunge() throws MethodNotSupportedException {
        throw new MethodNotSupportedException("Cannot expunge Default Folder");
    }

    @Override // com.sun.mail.imap.IMAPFolder
    public AbstractC3679k getFolder(String str) {
        return ((IMAPStore) this.store).newIMAPFolder(str, (char) 65535);
    }

    @Override // com.sun.mail.imap.IMAPFolder
    public synchronized String getName() {
        return this.fullName;
    }

    @Override // com.sun.mail.imap.IMAPFolder
    public AbstractC3679k getParent() {
        return null;
    }

    @Override // com.sun.mail.imap.IMAPFolder
    public boolean hasNewMessages() {
        return false;
    }

    @Override // com.sun.mail.imap.IMAPFolder, jakarta.mail.AbstractC3679k
    public synchronized AbstractC3679k[] list(final String str) {
        ListInfo[] listInfoArr = (ListInfo[]) doCommand(new IMAPFolder.ProtocolCommand() { // from class: com.sun.mail.imap.DefaultFolder.1
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                return iMAPProtocol.list("", str);
            }
        });
        if (listInfoArr == null) {
            return new AbstractC3679k[0];
        }
        int length = listInfoArr.length;
        IMAPFolder[] iMAPFolderArr = new IMAPFolder[length];
        for (int i10 = 0; i10 < length; i10++) {
            iMAPFolderArr[i10] = ((IMAPStore) this.store).newIMAPFolder(listInfoArr[i10]);
        }
        return iMAPFolderArr;
    }

    @Override // com.sun.mail.imap.IMAPFolder, jakarta.mail.AbstractC3679k
    public synchronized AbstractC3679k[] listSubscribed(final String str) {
        ListInfo[] listInfoArr = (ListInfo[]) doCommand(new IMAPFolder.ProtocolCommand() { // from class: com.sun.mail.imap.DefaultFolder.2
            @Override // com.sun.mail.imap.IMAPFolder.ProtocolCommand
            public Object doCommand(IMAPProtocol iMAPProtocol) {
                return iMAPProtocol.lsub("", str);
            }
        });
        if (listInfoArr == null) {
            return new AbstractC3679k[0];
        }
        int length = listInfoArr.length;
        IMAPFolder[] iMAPFolderArr = new IMAPFolder[length];
        for (int i10 = 0; i10 < length; i10++) {
            iMAPFolderArr[i10] = ((IMAPStore) this.store).newIMAPFolder(listInfoArr[i10]);
        }
        return iMAPFolderArr;
    }

    @Override // com.sun.mail.imap.IMAPFolder
    public boolean renameTo(AbstractC3679k abstractC3679k) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("Cannot rename Default Folder");
    }
}
