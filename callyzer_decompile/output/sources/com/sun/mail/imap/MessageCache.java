package com.sun.mail.imap;

import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.MailLogger;
import jakarta.mail.AbstractC3682n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MessageCache {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int SLOP = 64;
    private IMAPFolder folder;
    private MailLogger logger;
    private IMAPMessage[] messages;
    private int[] seqnums;
    private int size;

    public MessageCache(IMAPFolder iMAPFolder, IMAPStore iMAPStore, int i10) {
        this.folder = iMAPFolder;
        MailLogger subLogger = iMAPFolder.logger.getSubLogger("messagecache", "DEBUG IMAP MC", iMAPStore.getMessageCacheDebug());
        this.logger = subLogger;
        if (subLogger.isLoggable(Level.CONFIG)) {
            this.logger.config("create cache of size " + i10);
        }
        ensureCapacity(i10, 1);
    }

    private void ensureCapacity(int i10, int i11) {
        IMAPMessage[] iMAPMessageArr = this.messages;
        if (iMAPMessageArr == null) {
            this.messages = new IMAPMessage[i10 + 64];
        } else if (iMAPMessageArr.length < i10) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("expand capacity to " + i10);
            }
            int i12 = i10 + 64;
            IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[i12];
            IMAPMessage[] iMAPMessageArr3 = this.messages;
            System.arraycopy(iMAPMessageArr3, 0, iMAPMessageArr2, 0, iMAPMessageArr3.length);
            this.messages = iMAPMessageArr2;
            int[] iArr = this.seqnums;
            if (iArr != null) {
                int[] iArr2 = new int[i12];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                int i13 = this.size;
                while (i13 < i12) {
                    iArr2[i13] = i11;
                    i13++;
                    i11++;
                }
                this.seqnums = iArr2;
                if (this.logger.isLoggable(Level.FINE)) {
                    MailLogger mailLogger = this.logger;
                    StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "message ", " has sequence number ");
                    sbM4567n.append(this.seqnums[i10 - 1]);
                    mailLogger.fine(sbM4567n.toString());
                }
            }
        } else if (i10 < this.size) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("shrink capacity to " + i10);
            }
            for (int i14 = i10 + 1; i14 <= this.size; i14++) {
                int i15 = i14 - 1;
                this.messages[i15] = null;
                int[] iArr3 = this.seqnums;
                if (iArr3 != null) {
                    iArr3[i15] = -1;
                }
            }
        }
        this.size = i10;
    }

    private int msgnumOf(int i10) {
        if (this.seqnums == null) {
            return i10;
        }
        if (i10 < 1) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("bad seqnum " + i10);
            }
            return -1;
        }
        for (int i11 = i10; i11 <= this.size; i11++) {
            int i12 = this.seqnums[i11 - 1];
            if (i12 == i10) {
                return i11;
            }
            if (i12 > i10) {
                break;
            }
        }
        return -1;
    }

    private void shrink(int i10, int i11) {
        this.size = i10 - 1;
        MailLogger mailLogger = this.logger;
        Level level = Level.FINE;
        if (mailLogger.isLoggable(level)) {
            this.logger.fine("size now " + this.size);
        }
        int i12 = this.size;
        if (i12 == 0) {
            this.messages = null;
            this.seqnums = null;
            return;
        }
        if (i12 > 64 && i12 < this.messages.length / 2) {
            this.logger.fine("reallocate array");
            int i13 = this.size;
            IMAPMessage[] iMAPMessageArr = new IMAPMessage[i13 + 64];
            System.arraycopy(this.messages, 0, iMAPMessageArr, 0, i13);
            this.messages = iMAPMessageArr;
            int[] iArr = this.seqnums;
            if (iArr != null) {
                int i14 = this.size;
                int[] iArr2 = new int[i14 + 64];
                System.arraycopy(iArr, 0, iArr2, 0, i14);
                this.seqnums = iArr2;
                return;
            }
            return;
        }
        if (this.logger.isLoggable(level)) {
            this.logger.fine("clean " + i10 + " to " + i11);
        }
        while (i10 < i11) {
            int i15 = i10 - 1;
            this.messages[i15] = null;
            int[] iArr3 = this.seqnums;
            if (iArr3 != null) {
                iArr3[i15] = 0;
            }
            i10++;
        }
    }

    public void addMessages(int i10, int i11) {
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("add " + i10 + " messages");
        }
        ensureCapacity(this.size + i10, i11);
    }

    public void expungeMessage(int i10) {
        int iMsgnumOf = msgnumOf(i10);
        if (iMsgnumOf < 0) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("expunge no seqnum " + i10);
                return;
            }
            return;
        }
        int i11 = iMsgnumOf - 1;
        IMAPMessage iMAPMessage = this.messages[i11];
        if (iMAPMessage != null) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("expunge existing " + iMsgnumOf);
            }
            iMAPMessage.setExpunged(true);
        }
        int[] iArr = this.seqnums;
        if (iArr == null) {
            this.logger.fine("create seqnums array");
            this.seqnums = new int[this.messages.length];
            for (int i12 = 1; i12 < iMsgnumOf; i12++) {
                this.seqnums[i12 - 1] = i12;
            }
            this.seqnums[i11] = 0;
            int i13 = iMsgnumOf + 1;
            while (true) {
                int[] iArr2 = this.seqnums;
                if (i13 > iArr2.length) {
                    return;
                }
                int i14 = i13 - 1;
                iArr2[i14] = i14;
                i13++;
            }
        } else {
            iArr[i11] = 0;
            int i15 = iMsgnumOf + 1;
            while (true) {
                int[] iArr3 = this.seqnums;
                if (i15 > iArr3.length) {
                    return;
                }
                int i16 = i15 - 1;
                int i17 = iArr3[i16];
                if (i17 > 0) {
                    iArr3[i16] = i17 - 1;
                }
                i15++;
            }
        }
    }

    public IMAPMessage getMessage(int i10) {
        if (i10 < 1 || i10 > this.size) {
            throw new ArrayIndexOutOfBoundsException(AbstractC5601a.m11233d(this.size, ")", AbstractC1452a.m4567n(i10, "message number (", ") out of bounds (")));
        }
        int i11 = i10 - 1;
        IMAPMessage iMAPMessageNewIMAPMessage = this.messages[i11];
        if (iMAPMessageNewIMAPMessage == null) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("create message number " + i10);
            }
            iMAPMessageNewIMAPMessage = this.folder.newIMAPMessage(i10);
            this.messages[i11] = iMAPMessageNewIMAPMessage;
            if (seqnumOf(i10) <= 0) {
                this.logger.fine("it's expunged!");
                iMAPMessageNewIMAPMessage.setExpunged(true);
            }
        }
        return iMAPMessageNewIMAPMessage;
    }

    public IMAPMessage getMessageBySeqnum(int i10) {
        int iMsgnumOf = msgnumOf(i10);
        if (iMsgnumOf >= 0) {
            return getMessage(iMsgnumOf);
        }
        if (!this.logger.isLoggable(Level.FINE)) {
            return null;
        }
        this.logger.fine("no message seqnum " + i10);
        return null;
    }

    public IMAPMessage[] removeExpungedMessages() {
        this.logger.fine("remove expunged messages");
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 <= this.size) {
            if (seqnumOf(i10) <= 0) {
                arrayList.add(getMessage(i10));
            } else {
                if (i11 != i10) {
                    IMAPMessage[] iMAPMessageArr = this.messages;
                    IMAPMessage iMAPMessage = iMAPMessageArr[i10 - 1];
                    iMAPMessageArr[i11 - 1] = iMAPMessage;
                    if (iMAPMessage != null) {
                        iMAPMessage.setMessageNumber(i11);
                    }
                }
                i11++;
            }
            i10++;
        }
        this.seqnums = null;
        shrink(i11, i10);
        int size = arrayList.size();
        IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[size];
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("return " + size);
        }
        arrayList.toArray(iMAPMessageArr2);
        return iMAPMessageArr2;
    }

    public int seqnumOf(int i10) {
        if (this.seqnums == null) {
            return i10;
        }
        if (this.logger.isLoggable(Level.FINE)) {
            MailLogger mailLogger = this.logger;
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "msgnum ", " is seqnum ");
            sbM4567n.append(this.seqnums[i10 - 1]);
            mailLogger.fine(sbM4567n.toString());
        }
        return this.seqnums[i10 - 1];
    }

    public int size() {
        return this.size;
    }

    public MessageCache(int i10, boolean z6) {
        this.folder = null;
        MailLogger mailLogger = new MailLogger(getClass(), "messagecache", "DEBUG IMAP MC", z6, System.out);
        this.logger = mailLogger;
        if (mailLogger.isLoggable(Level.CONFIG)) {
            this.logger.config("create DEBUG cache of size " + i10);
        }
        ensureCapacity(i10, 1);
    }

    public IMAPMessage[] removeExpungedMessages(AbstractC3682n[] abstractC3682nArr) {
        this.logger.fine("remove expunged messages");
        ArrayList arrayList = new ArrayList();
        int length = abstractC3682nArr.length;
        int[] iArr = new int[length];
        boolean z6 = false;
        for (int i10 = 0; i10 < abstractC3682nArr.length; i10++) {
            iArr[i10] = abstractC3682nArr[i10].getMessageNumber();
        }
        Arrays.sort(iArr);
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i11 <= this.size) {
            if (i13 < length && i11 == iArr[i13] && seqnumOf(i11) <= 0) {
                arrayList.add(getMessage(i11));
                while (i13 < length && iArr[i13] <= i11) {
                    i13++;
                }
            } else {
                if (i12 != i11) {
                    IMAPMessage[] iMAPMessageArr = this.messages;
                    int i14 = i12 - 1;
                    int i15 = i11 - 1;
                    IMAPMessage iMAPMessage = iMAPMessageArr[i15];
                    iMAPMessageArr[i14] = iMAPMessage;
                    if (iMAPMessage != null) {
                        iMAPMessage.setMessageNumber(i12);
                    }
                    int[] iArr2 = this.seqnums;
                    if (iArr2 != null) {
                        iArr2[i14] = iArr2[i15];
                    }
                }
                int[] iArr3 = this.seqnums;
                if (iArr3 != null && iArr3[i12 - 1] != i12) {
                    z6 = true;
                }
                i12++;
            }
            i11++;
        }
        if (!z6) {
            this.seqnums = null;
        }
        shrink(i12, i11);
        int size = arrayList.size();
        IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[size];
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("return " + size);
        }
        arrayList.toArray(iMAPMessageArr2);
        return iMAPMessageArr2;
    }
}
