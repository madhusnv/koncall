package com.sun.mail.imap;

import jakarta.mail.AbstractC3682n;
import java.util.Date;
import ow.AbstractC5767j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class OlderTerm extends AbstractC5767j {
    private static final long serialVersionUID = 3951078948727995682L;
    private int interval;

    public OlderTerm(int i10) {
        this.interval = i10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof OlderTerm) && this.interval == ((OlderTerm) obj).interval;
    }

    public int getInterval() {
        return this.interval;
    }

    public int hashCode() {
        return this.interval;
    }

    @Override // ow.AbstractC5767j
    public boolean match(AbstractC3682n abstractC3682n) {
        Date receivedDate;
        try {
            receivedDate = abstractC3682n.getReceivedDate();
        } catch (Exception unused) {
        }
        return receivedDate != null && receivedDate.getTime() <= System.currentTimeMillis() - (((long) this.interval) * 1000);
    }
}
