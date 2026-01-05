package com.sun.mail.imap;

import jakarta.mail.AbstractC3679k;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.event.C3644g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MessageVanishedEvent extends C3644g {
    private static final AbstractC3682n[] noMessages = new AbstractC3682n[0];
    private static final long serialVersionUID = 2142028010250024922L;
    private long[] uids;

    public MessageVanishedEvent(AbstractC3679k abstractC3679k, long[] jArr) {
        super(abstractC3679k, 2, true, noMessages);
        this.uids = jArr;
    }

    public long[] getUIDs() {
        return this.uids;
    }
}
