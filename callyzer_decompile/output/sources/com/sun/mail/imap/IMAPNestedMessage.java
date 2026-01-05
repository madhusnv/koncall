package com.sun.mail.imap;

import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.ENVELOPE;
import com.sun.mail.imap.protocol.IMAPProtocol;
import jakarta.mail.C3678j;
import jakarta.mail.MessageRemovedException;
import jakarta.mail.MethodNotSupportedException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPNestedMessage extends IMAPMessage {
    private IMAPMessage msg;

    public IMAPNestedMessage(IMAPMessage iMAPMessage, BODYSTRUCTURE bodystructure, ENVELOPE envelope, String str) {
        super(iMAPMessage._getSession());
        this.msg = iMAPMessage;
        this.f43917bs = bodystructure;
        this.envelope = envelope;
        this.sectionId = str;
        setPeek(iMAPMessage.getPeek());
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public void checkExpunged() throws MessageRemovedException {
        this.msg.checkExpunged();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public int getFetchBlockSize() {
        return this.msg.getFetchBlockSize();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public Object getMessageCacheLock() {
        return this.msg.getMessageCacheLock();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public IMAPProtocol getProtocol() {
        return this.msg.getProtocol();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public int getSequenceNumber() {
        return this.msg.getSequenceNumber();
    }

    @Override // com.sun.mail.imap.IMAPMessage, jakarta.mail.internet.C3665n, jakarta.mail.InterfaceC3685q
    public int getSize() {
        return this.f43917bs.size;
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public boolean ignoreBodyStructureSize() {
        return this.msg.ignoreBodyStructureSize();
    }

    @Override // jakarta.mail.AbstractC3682n
    public boolean isExpunged() {
        return this.msg.isExpunged();
    }

    @Override // com.sun.mail.imap.IMAPMessage
    public boolean isREV1() {
        return this.msg.isREV1();
    }

    @Override // com.sun.mail.imap.IMAPMessage, jakarta.mail.internet.C3665n, jakarta.mail.AbstractC3682n
    public synchronized void setFlags(C3678j c3678j, boolean z6) {
        throw new MethodNotSupportedException("Cannot set flags on this nested message");
    }
}
