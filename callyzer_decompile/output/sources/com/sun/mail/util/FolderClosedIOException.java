package com.sun.mail.util;

import jakarta.mail.AbstractC3679k;
import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class FolderClosedIOException extends IOException {
    private static final long serialVersionUID = 4281122580365555735L;
    private transient AbstractC3679k folder;

    public FolderClosedIOException(AbstractC3679k abstractC3679k) {
        this(abstractC3679k, null);
    }

    public AbstractC3679k getFolder() {
        return this.folder;
    }

    public FolderClosedIOException(AbstractC3679k abstractC3679k, String str) {
        super(str);
        this.folder = abstractC3679k;
    }
}
