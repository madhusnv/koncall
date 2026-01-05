package com.sun.mail.imap;

import com.sun.mail.imap.protocol.UIDSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CopyUID {
    public UIDSet[] dst;
    public UIDSet[] src;
    public long uidvalidity;

    public CopyUID(long j6, UIDSet[] uIDSetArr, UIDSet[] uIDSetArr2) {
        this.uidvalidity = j6;
        this.src = uIDSetArr;
        this.dst = uIDSetArr2;
    }
}
