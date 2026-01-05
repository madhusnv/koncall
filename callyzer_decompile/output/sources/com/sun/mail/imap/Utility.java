package com.sun.mail.imap;

import com.sun.mail.imap.protocol.MessageSet;
import com.sun.mail.imap.protocol.UIDSet;
import jakarta.mail.AbstractC3682n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Utility {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface Condition {
        boolean test(IMAPMessage iMAPMessage);
    }

    private Utility() {
    }

    public static UIDSet[] getResyncUIDSet(ResyncData resyncData) {
        return resyncData.getUIDSet();
    }

    public static MessageSet[] toMessageSet(AbstractC3682n[] abstractC3682nArr, Condition condition) {
        ArrayList arrayList = new ArrayList(1);
        int i10 = 0;
        while (i10 < abstractC3682nArr.length) {
            IMAPMessage iMAPMessage = (IMAPMessage) abstractC3682nArr[i10];
            if (!iMAPMessage.isExpunged()) {
                int sequenceNumber = iMAPMessage.getSequenceNumber();
                if (condition == null || condition.test(iMAPMessage)) {
                    MessageSet messageSet = new MessageSet();
                    messageSet.start = sequenceNumber;
                    while (true) {
                        i10++;
                        if (i10 >= abstractC3682nArr.length) {
                            break;
                        }
                        IMAPMessage iMAPMessage2 = (IMAPMessage) abstractC3682nArr[i10];
                        if (!iMAPMessage2.isExpunged()) {
                            int sequenceNumber2 = iMAPMessage2.getSequenceNumber();
                            if (condition == null || condition.test(iMAPMessage2)) {
                                if (sequenceNumber2 != sequenceNumber + 1) {
                                    i10--;
                                    break;
                                }
                                sequenceNumber = sequenceNumber2;
                            }
                        }
                    }
                    messageSet.end = sequenceNumber;
                    arrayList.add(messageSet);
                }
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (MessageSet[]) arrayList.toArray(new MessageSet[arrayList.size()]);
    }

    public static MessageSet[] toMessageSetSorted(AbstractC3682n[] abstractC3682nArr, Condition condition) {
        AbstractC3682n[] abstractC3682nArr2 = (AbstractC3682n[]) abstractC3682nArr.clone();
        Arrays.sort(abstractC3682nArr2, new Comparator<AbstractC3682n>() { // from class: com.sun.mail.imap.Utility.1
            @Override // java.util.Comparator
            public int compare(AbstractC3682n abstractC3682n, AbstractC3682n abstractC3682n2) {
                return abstractC3682n.getMessageNumber() - abstractC3682n2.getMessageNumber();
            }
        });
        return toMessageSet(abstractC3682nArr2, condition);
    }

    public static UIDSet[] toUIDSet(AbstractC3682n[] abstractC3682nArr) {
        ArrayList arrayList = new ArrayList(1);
        int i10 = 0;
        while (i10 < abstractC3682nArr.length) {
            IMAPMessage iMAPMessage = (IMAPMessage) abstractC3682nArr[i10];
            if (!iMAPMessage.isExpunged()) {
                long uid = iMAPMessage.getUID();
                UIDSet uIDSet = new UIDSet();
                uIDSet.start = uid;
                while (true) {
                    i10++;
                    if (i10 >= abstractC3682nArr.length) {
                        break;
                    }
                    IMAPMessage iMAPMessage2 = (IMAPMessage) abstractC3682nArr[i10];
                    if (!iMAPMessage2.isExpunged()) {
                        long uid2 = iMAPMessage2.getUID();
                        if (uid2 != 1 + uid) {
                            i10--;
                            break;
                        }
                        uid = uid2;
                    }
                }
                uIDSet.end = uid;
                arrayList.add(uIDSet);
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (UIDSet[]) arrayList.toArray(new UIDSet[arrayList.size()]);
    }
}
