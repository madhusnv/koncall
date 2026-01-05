package com.sun.mail.imap.protocol;

import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FLAGS extends C3678j implements Item {
    static final char[] name = {'F', Matrix.MATRIX_TYPE_RANDOM_LT, 'A', 'G', 'S'};
    private static final long serialVersionUID = 439049847053756670L;
    public int msgno;

    public FLAGS(IMAPResponse iMAPResponse) {
        this.msgno = iMAPResponse.getNumber();
        iMAPResponse.skipSpaces();
        String[] simpleList = iMAPResponse.readSimpleList();
        if (simpleList != null) {
            for (String str : simpleList) {
                if (str.length() < 2 || str.charAt(0) != '\\') {
                    add(str);
                } else {
                    char upperCase = Character.toUpperCase(str.charAt(1));
                    if (upperCase == '*') {
                        add(C3651i.f19329h);
                    } else if (upperCase == 'A') {
                        add(C3651i.f19323b);
                    } else if (upperCase != 'D') {
                        if (upperCase == 'F') {
                            add(C3651i.f19326e);
                        } else if (upperCase == 'R') {
                            add(C3651i.f19327f);
                        } else if (upperCase != 'S') {
                            add(str);
                        } else {
                            add(C3651i.f19328g);
                        }
                    } else if (str.length() >= 3) {
                        char cCharAt = str.charAt(2);
                        if (cCharAt == 'e' || cCharAt == 'E') {
                            add(C3651i.f19324c);
                        } else if (cCharAt == 'r' || cCharAt == 'R') {
                            add(C3651i.f19325d);
                        }
                    } else {
                        add(str);
                    }
                }
            }
        }
    }
}
