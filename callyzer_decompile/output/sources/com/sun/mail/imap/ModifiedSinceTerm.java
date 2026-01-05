package com.sun.mail.imap;

import jakarta.mail.AbstractC3682n;
import ow.AbstractC5767j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ModifiedSinceTerm extends AbstractC5767j {
    private static final long serialVersionUID = 5151457469634727992L;
    private long modseq;

    public ModifiedSinceTerm(long j6) {
        this.modseq = j6;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ModifiedSinceTerm) && this.modseq == ((ModifiedSinceTerm) obj).modseq;
    }

    public long getModSeq() {
        return this.modseq;
    }

    public int hashCode() {
        return (int) this.modseq;
    }

    @Override // ow.AbstractC5767j
    public boolean match(AbstractC3682n abstractC3682n) {
        try {
            if (abstractC3682n instanceof IMAPMessage) {
                if (((IMAPMessage) abstractC3682n).getModSeq() >= this.modseq) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
