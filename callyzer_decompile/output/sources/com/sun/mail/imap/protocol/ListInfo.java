package com.sun.mail.imap.protocol;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ListInfo {
    public static final int CHANGED = 1;
    public static final int INDETERMINATE = 3;
    public static final int UNCHANGED = 2;
    public String[] attrs;
    public boolean canOpen;
    public int changeState;
    public boolean hasInferiors;
    public String name;
    public char separator;

    public ListInfo(IMAPResponse iMAPResponse) {
        this.name = null;
        this.separator = '/';
        this.hasInferiors = true;
        this.canOpen = true;
        this.changeState = 3;
        String[] simpleList = iMAPResponse.readSimpleList();
        ArrayList arrayList = new ArrayList();
        if (simpleList != null) {
            for (int i10 = 0; i10 < simpleList.length; i10++) {
                if (simpleList[i10].equalsIgnoreCase("\\Marked")) {
                    this.changeState = 1;
                } else if (simpleList[i10].equalsIgnoreCase("\\Unmarked")) {
                    this.changeState = 2;
                } else if (simpleList[i10].equalsIgnoreCase("\\Noselect")) {
                    this.canOpen = false;
                } else if (simpleList[i10].equalsIgnoreCase("\\Noinferiors")) {
                    this.hasInferiors = false;
                }
                arrayList.add(simpleList[i10]);
            }
        }
        this.attrs = (String[]) arrayList.toArray(new String[arrayList.size()]);
        iMAPResponse.skipSpaces();
        if (iMAPResponse.readByte() == 34) {
            char c2 = (char) iMAPResponse.readByte();
            this.separator = c2;
            if (c2 == '\\') {
                this.separator = (char) iMAPResponse.readByte();
            }
            iMAPResponse.skip(1);
        } else {
            iMAPResponse.skip(2);
        }
        iMAPResponse.skipSpaces();
        this.name = iMAPResponse.readAtomString();
        if (iMAPResponse.supportsUtf8()) {
            return;
        }
        this.name = BASE64MailboxDecoder.decode(this.name);
    }
}
