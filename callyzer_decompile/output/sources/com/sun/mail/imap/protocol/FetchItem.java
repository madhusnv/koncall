package com.sun.mail.imap.protocol;

import jakarta.mail.C3649g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class FetchItem {
    private C3649g fetchProfileItem;
    private String name;

    public FetchItem(String str, C3649g c3649g) {
        this.name = str;
        this.fetchProfileItem = c3649g;
    }

    public C3649g getFetchProfileItem() {
        return this.fetchProfileItem;
    }

    public String getName() {
        return this.name;
    }

    public abstract Object parseItem(FetchResponse fetchResponse);
}
