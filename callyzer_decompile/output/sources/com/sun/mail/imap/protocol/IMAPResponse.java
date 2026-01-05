package com.sun.mail.imap.protocol;

import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.Response;
import com.sun.mail.util.ASCIIUtility;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPResponse extends Response {
    private String key;
    private int number;

    public IMAPResponse(Protocol protocol) {
        super(protocol);
        init();
    }

    private void init() {
        if (!isUnTagged() || isOK() || isNO() || isBAD() || isBYE()) {
            return;
        }
        String atom = readAtom();
        this.key = atom;
        try {
            this.number = Integer.parseInt(atom);
            this.key = readAtom();
        } catch (NumberFormatException unused) {
        }
    }

    public String getKey() {
        return this.key;
    }

    public int getNumber() {
        return this.number;
    }

    public boolean keyEquals(String str) {
        String str2 = this.key;
        return str2 != null && str2.equalsIgnoreCase(str);
    }

    public String[] readSimpleList() {
        byte[] bArr;
        int i10;
        skipSpaces();
        byte[] bArr2 = this.buffer;
        int i11 = this.index;
        if (bArr2[i11] != 40) {
            return null;
        }
        this.index = i11 + 1;
        ArrayList arrayList = new ArrayList();
        int i12 = this.index;
        while (true) {
            bArr = this.buffer;
            i10 = this.index;
            byte b10 = bArr[i10];
            if (b10 == 41) {
                break;
            }
            if (b10 == 32) {
                arrayList.add(ASCIIUtility.toString(bArr, i12, i10));
                i12 = this.index + 1;
            }
            this.index++;
        }
        if (i10 > i12) {
            arrayList.add(ASCIIUtility.toString(bArr, i12, i10));
        }
        this.index++;
        int size = arrayList.size();
        if (size > 0) {
            return (String[]) arrayList.toArray(new String[size]);
        }
        return null;
    }

    public IMAPResponse(IMAPResponse iMAPResponse) {
        super(iMAPResponse);
        this.key = iMAPResponse.key;
        this.number = iMAPResponse.number;
    }

    public IMAPResponse(String str) {
        this(str, true);
    }

    public IMAPResponse(String str, boolean z6) {
        super(str, z6);
        init();
    }
}
