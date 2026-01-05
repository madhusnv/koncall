package com.websoptimization.callyzerbiz.data.model.response.message_template;

import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class Documents {

    @InterfaceC4485b(IMAPStore.ID_NAME)
    private String name;

    @InterfaceC4485b("url")
    private String url;

    public Documents(String name, String url) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(url, "url");
        this.name = name;
        this.url = url;
    }

    /* renamed from: a */
    public final String m4982a() {
        return this.name;
    }

    /* renamed from: b */
    public final String m4983b() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Documents)) {
            return false;
        }
        Documents documents = (Documents) obj;
        return AbstractC4154l.m8918a(this.name, documents.name) && AbstractC4154l.m8918a(this.url, documents.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("Documents(name=", this.name, ", url=", this.url, ")");
    }
}
