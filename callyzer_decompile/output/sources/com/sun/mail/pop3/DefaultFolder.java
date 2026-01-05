package com.sun.mail.pop3;

import jakarta.mail.AbstractC3679k;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.C3678j;
import jakarta.mail.MessagingException;
import jakarta.mail.MethodNotSupportedException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class DefaultFolder extends AbstractC3679k {
    public DefaultFolder(POP3Store pOP3Store) {
        super(pOP3Store);
    }

    @Override // jakarta.mail.AbstractC3679k
    public void appendMessages(AbstractC3682n[] abstractC3682nArr) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("Append not supported");
    }

    @Override // jakarta.mail.AbstractC3679k
    public void close(boolean z6) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("close");
    }

    public boolean create(int i10) {
        return false;
    }

    @Override // jakarta.mail.AbstractC3679k
    public boolean delete(boolean z6) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("delete");
    }

    @Override // jakarta.mail.AbstractC3679k
    public boolean exists() {
        return true;
    }

    public AbstractC3682n[] expunge() throws MethodNotSupportedException {
        throw new MethodNotSupportedException("expunge");
    }

    public AbstractC3679k getFolder(String str) throws MessagingException {
        if (str.equalsIgnoreCase("INBOX")) {
            return getInbox();
        }
        throw new MessagingException("only INBOX supported");
    }

    @Override // jakarta.mail.AbstractC3679k
    public String getFullName() {
        return "";
    }

    public AbstractC3679k getInbox() {
        return getStore().getFolder("INBOX");
    }

    @Override // jakarta.mail.AbstractC3679k
    public AbstractC3682n getMessage(int i10) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("getMessage");
    }

    @Override // jakarta.mail.AbstractC3679k
    public int getMessageCount() {
        return 0;
    }

    public String getName() {
        return "";
    }

    public AbstractC3679k getParent() {
        return null;
    }

    public C3678j getPermanentFlags() {
        return new C3678j();
    }

    public char getSeparator() {
        return '/';
    }

    public int getType() {
        return 2;
    }

    public boolean hasNewMessages() {
        return false;
    }

    @Override // jakarta.mail.AbstractC3679k
    public boolean isOpen() {
        return false;
    }

    @Override // jakarta.mail.AbstractC3679k
    public AbstractC3679k[] list(String str) {
        return new AbstractC3679k[]{getInbox()};
    }

    public void open(int i10) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("open");
    }

    public boolean renameTo(AbstractC3679k abstractC3679k) throws MethodNotSupportedException {
        throw new MethodNotSupportedException("renameTo");
    }
}
