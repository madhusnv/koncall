package jakarta.mail;

import java.util.Date;
import ow.AbstractC5767j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.n */
/* loaded from: classes3.dex */
public abstract class AbstractC3682n implements InterfaceC3685q {
    protected boolean expunged;
    protected AbstractC3679k folder;
    protected int msgnum;
    protected c0 session;

    public AbstractC3682n(AbstractC3679k abstractC3679k, int i10) {
        this.expunged = false;
        this.session = null;
        this.folder = abstractC3679k;
        this.msgnum = i10;
        this.session = abstractC3679k.store.session;
    }

    public abstract void addFrom(AbstractC3633a[] abstractC3633aArr);

    public void addRecipient(C3681m c3681m, AbstractC3633a abstractC3633a) {
        addRecipients(c3681m, new AbstractC3633a[]{abstractC3633a});
    }

    public abstract void addRecipients(C3681m c3681m, AbstractC3633a[] abstractC3633aArr);

    public abstract AbstractC3633a[] getAllRecipients();

    public abstract C3678j getFlags();

    public AbstractC3679k getFolder() {
        return this.folder;
    }

    public int getMessageNumber() {
        return this.msgnum;
    }

    public abstract Date getReceivedDate();

    public abstract Date getSentDate();

    public c0 getSession() {
        return this.session;
    }

    public abstract String getSubject();

    public boolean isExpunged() {
        return this.expunged;
    }

    public abstract boolean isSet(C3651i c3651i);

    public boolean match(AbstractC5767j abstractC5767j) {
        return abstractC5767j.match(this);
    }

    public abstract void saveChanges();

    public void setExpunged(boolean z6) {
        this.expunged = z6;
    }

    public void setFlag(C3651i c3651i, boolean z6) {
        setFlags(new C3678j(c3651i), z6);
    }

    public abstract void setFlags(C3678j c3678j, boolean z6);

    public abstract void setFrom();

    public abstract void setFrom(AbstractC3633a abstractC3633a);

    public void setMessageNumber(int i10) {
        this.msgnum = i10;
    }

    public void setRecipient(C3681m c3681m, AbstractC3633a abstractC3633a) {
        if (abstractC3633a == null) {
            setRecipients(c3681m, null);
        } else {
            setRecipients(c3681m, new AbstractC3633a[]{abstractC3633a});
        }
    }

    public abstract void setRecipients(C3681m c3681m, AbstractC3633a[] abstractC3633aArr);

    public abstract void setReplyTo(AbstractC3633a[] abstractC3633aArr);

    public abstract void setSentDate(Date date);

    public AbstractC3682n(c0 c0Var) {
        this.msgnum = 0;
        this.expunged = false;
        this.folder = null;
        this.session = c0Var;
    }
}
