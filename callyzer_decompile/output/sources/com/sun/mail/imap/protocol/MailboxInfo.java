package com.sun.mail.imap.protocol;

import com.sun.mail.iap.Response;
import jakarta.mail.C3678j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MailboxInfo {
    public C3678j availableFlags;
    public int first;
    public long highestmodseq;
    public int mode;
    public C3678j permanentFlags;
    public int recent;
    public List<IMAPResponse> responses;
    public int total;
    public boolean uidNotSticky;
    public long uidnext;
    public long uidvalidity;

    public MailboxInfo(Response[] responseArr) {
        this.availableFlags = null;
        this.permanentFlags = null;
        this.total = -1;
        this.recent = -1;
        this.first = -1;
        this.uidvalidity = -1L;
        this.uidnext = -1L;
        this.uidNotSticky = false;
        this.highestmodseq = -1L;
        for (int i10 = 0; i10 < responseArr.length; i10++) {
            Response response = responseArr[i10];
            if (response != null && (response instanceof IMAPResponse)) {
                IMAPResponse iMAPResponse = (IMAPResponse) response;
                if (iMAPResponse.keyEquals("EXISTS")) {
                    this.total = iMAPResponse.getNumber();
                    responseArr[i10] = null;
                } else if (iMAPResponse.keyEquals("RECENT")) {
                    this.recent = iMAPResponse.getNumber();
                    responseArr[i10] = null;
                } else if (iMAPResponse.keyEquals("FLAGS")) {
                    this.availableFlags = new FLAGS(iMAPResponse);
                    responseArr[i10] = null;
                } else if (iMAPResponse.keyEquals("VANISHED")) {
                    if (this.responses == null) {
                        this.responses = new ArrayList();
                    }
                    this.responses.add(iMAPResponse);
                    responseArr[i10] = null;
                } else if (iMAPResponse.keyEquals("FETCH")) {
                    if (this.responses == null) {
                        this.responses = new ArrayList();
                    }
                    this.responses.add(iMAPResponse);
                    responseArr[i10] = null;
                } else if (iMAPResponse.isUnTagged() && iMAPResponse.isOK()) {
                    iMAPResponse.skipSpaces();
                    if (iMAPResponse.readByte() != 91) {
                        iMAPResponse.reset();
                    } else {
                        String atom = iMAPResponse.readAtom();
                        if (atom.equalsIgnoreCase("UNSEEN")) {
                            this.first = iMAPResponse.readNumber();
                        } else if (atom.equalsIgnoreCase("UIDVALIDITY")) {
                            this.uidvalidity = iMAPResponse.readLong();
                        } else if (atom.equalsIgnoreCase("PERMANENTFLAGS")) {
                            this.permanentFlags = new FLAGS(iMAPResponse);
                        } else if (atom.equalsIgnoreCase("UIDNEXT")) {
                            this.uidnext = iMAPResponse.readLong();
                        } else if (atom.equalsIgnoreCase("HIGHESTMODSEQ")) {
                            this.highestmodseq = iMAPResponse.readLong();
                        } else {
                            iMAPResponse.reset();
                        }
                        responseArr[i10] = null;
                    }
                } else if (iMAPResponse.isUnTagged() && iMAPResponse.isNO()) {
                    iMAPResponse.skipSpaces();
                    if (iMAPResponse.readByte() != 91) {
                        iMAPResponse.reset();
                    } else if (iMAPResponse.readAtom().equalsIgnoreCase("UIDNOTSTICKY")) {
                        this.uidNotSticky = true;
                        responseArr[i10] = null;
                    } else {
                        iMAPResponse.reset();
                    }
                }
            }
        }
        if (this.permanentFlags == null) {
            C3678j c3678j = this.availableFlags;
            if (c3678j != null) {
                this.permanentFlags = new C3678j(c3678j);
            } else {
                this.permanentFlags = new C3678j();
            }
        }
    }
}
