package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Response;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Status {
    static final String[] standardItems = {"MESSAGES", "RECENT", "UNSEEN", "UIDNEXT", "UIDVALIDITY"};
    public long highestmodseq;
    public Map<String, Long> items;
    public String mbox;
    public int recent;
    public int total;
    public long uidnext;
    public long uidvalidity;
    public int unseen;

    public Status(Response response) throws ParsingException {
        this.mbox = null;
        this.total = -1;
        this.recent = -1;
        this.uidnext = -1L;
        this.uidvalidity = -1L;
        this.unseen = -1;
        this.highestmodseq = -1L;
        this.mbox = response.readAtomString();
        if (!response.supportsUtf8()) {
            this.mbox = BASE64MailboxDecoder.decode(this.mbox);
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z6 = true;
        while (response.peekByte() != 40 && response.peekByte() != 0) {
            char c2 = (char) response.readByte();
            sb2.append(c2);
            if (c2 != ' ') {
                z6 = false;
            }
        }
        if (!z6) {
            this.mbox = (this.mbox + ((Object) sb2)).trim();
        }
        if (response.readByte() != 40) {
            throw new ParsingException("parse error in STATUS");
        }
        do {
            String atom = response.readAtom();
            if (atom == null) {
                throw new ParsingException("parse error in STATUS");
            }
            if (atom.equalsIgnoreCase("MESSAGES")) {
                this.total = response.readNumber();
            } else if (atom.equalsIgnoreCase("RECENT")) {
                this.recent = response.readNumber();
            } else if (atom.equalsIgnoreCase("UIDNEXT")) {
                this.uidnext = response.readLong();
            } else if (atom.equalsIgnoreCase("UIDVALIDITY")) {
                this.uidvalidity = response.readLong();
            } else if (atom.equalsIgnoreCase("UNSEEN")) {
                this.unseen = response.readNumber();
            } else if (atom.equalsIgnoreCase("HIGHESTMODSEQ")) {
                this.highestmodseq = response.readLong();
            } else {
                if (this.items == null) {
                    this.items = new HashMap();
                }
                this.items.put(atom.toUpperCase(Locale.ENGLISH), Long.valueOf(response.readLong()));
            }
        } while (!response.isNextNonSpace(')'));
    }

    public static void add(Status status, Status status2) {
        int i10 = status2.total;
        if (i10 != -1) {
            status.total = i10;
        }
        int i11 = status2.recent;
        if (i11 != -1) {
            status.recent = i11;
        }
        long j6 = status2.uidnext;
        if (j6 != -1) {
            status.uidnext = j6;
        }
        long j10 = status2.uidvalidity;
        if (j10 != -1) {
            status.uidvalidity = j10;
        }
        int i12 = status2.unseen;
        if (i12 != -1) {
            status.unseen = i12;
        }
        long j11 = status2.highestmodseq;
        if (j11 != -1) {
            status.highestmodseq = j11;
        }
        Map<String, Long> map = status.items;
        if (map == null) {
            status.items = status2.items;
            return;
        }
        Map<String, Long> map2 = status2.items;
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    public long getItem(String str) {
        int i10;
        Long l9;
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        Map<String, Long> map = this.items;
        if (map != null && (l9 = map.get(upperCase)) != null) {
            return l9.longValue();
        }
        if (upperCase.equals("MESSAGES")) {
            i10 = this.total;
        } else if (upperCase.equals("RECENT")) {
            i10 = this.recent;
        } else {
            if (upperCase.equals("UIDNEXT")) {
                return this.uidnext;
            }
            if (upperCase.equals("UIDVALIDITY")) {
                return this.uidvalidity;
            }
            if (!upperCase.equals("UNSEEN")) {
                if (upperCase.equals("HIGHESTMODSEQ")) {
                    return this.highestmodseq;
                }
                return -1L;
            }
            i10 = this.unseen;
        }
        return i10;
    }
}
