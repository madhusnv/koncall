package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Response;
import i0.m0;
import jakarta.mail.internet.C3655d;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class IMAPAddress extends C3655d {
    private static final long serialVersionUID = -3835822029483122232L;
    private boolean group;
    private C3655d[] grouplist;
    private String groupname;

    public IMAPAddress(Response response) throws ParsingException {
        this.group = false;
        response.skipSpaces();
        if (response.readByte() != 40) {
            throw new ParsingException("ADDRESS parse error");
        }
        this.encodedPersonal = response.readString();
        response.readString();
        String string = response.readString();
        String string2 = response.readString();
        response.skipSpaces();
        if (!response.isNextNonSpace(')')) {
            throw new ParsingException("ADDRESS parse error");
        }
        if (string2 != null) {
            if (string == null || string.length() == 0) {
                this.address = string2;
                return;
            } else if (string2.length() == 0) {
                this.address = string;
                return;
            } else {
                this.address = m0.m7379l(string, "@", string2);
                return;
            }
        }
        this.group = true;
        this.groupname = string;
        if (string == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.groupname);
        sb2.append(':');
        ArrayList arrayList = new ArrayList();
        while (response.peekByte() != 41) {
            IMAPAddress iMAPAddress = new IMAPAddress(response);
            if (iMAPAddress.isEndOfGroup()) {
                break;
            }
            if (arrayList.size() != 0) {
                sb2.append(',');
            }
            sb2.append(iMAPAddress.toString());
            arrayList.add(iMAPAddress);
        }
        sb2.append(';');
        this.address = sb2.toString();
        this.grouplist = (C3655d[]) arrayList.toArray(new IMAPAddress[arrayList.size()]);
    }

    @Override // jakarta.mail.internet.C3655d
    public C3655d[] getGroup(boolean z6) {
        C3655d[] c3655dArr = this.grouplist;
        if (c3655dArr == null) {
            return null;
        }
        return (C3655d[]) c3655dArr.clone();
    }

    public boolean isEndOfGroup() {
        return this.group && this.groupname == null;
    }

    @Override // jakarta.mail.internet.C3655d
    public boolean isGroup() {
        return this.group;
    }
}
