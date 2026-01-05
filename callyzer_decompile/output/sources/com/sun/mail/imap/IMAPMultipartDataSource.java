package com.sun.mail.imap;

import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import jakarta.mail.AbstractC3635c;
import jakarta.mail.internet.C3668q;
import jakarta.mail.internet.InterfaceC3667p;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPMultipartDataSource extends C3668q {
    private List<IMAPBodyPart> parts;

    public IMAPMultipartDataSource(InterfaceC3667p interfaceC3667p, BODYSTRUCTURE[] bodystructureArr, String str, IMAPMessage iMAPMessage) {
        String string;
        super(interfaceC3667p);
        this.parts = new ArrayList(bodystructureArr.length);
        for (int i10 = 0; i10 < bodystructureArr.length; i10++) {
            List<IMAPBodyPart> list = this.parts;
            BODYSTRUCTURE bodystructure = bodystructureArr[i10];
            if (str == null) {
                string = Integer.toString(i10 + 1);
            } else {
                StringBuilder sbM11245p = AbstractC5601a.m11245p(str, ".");
                sbM11245p.append(Integer.toString(i10 + 1));
                string = sbM11245p.toString();
            }
            list.add(new IMAPBodyPart(bodystructure, string, iMAPMessage));
        }
    }

    public AbstractC3635c getBodyPart(int i10) {
        return this.parts.get(i10);
    }

    public int getCount() {
        return this.parts.size();
    }
}
