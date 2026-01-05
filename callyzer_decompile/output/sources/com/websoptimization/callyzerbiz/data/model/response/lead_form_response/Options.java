package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import a2.AbstractC0030c;
import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class Options {

    @InterfaceC4485b("isDefault")
    private final boolean isDefault;

    @InterfaceC4485b(IMAPStore.ID_NAME)
    private final String name;

    @InterfaceC4485b("value")
    private final String value;

    public Options(String name, String value, boolean z6) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        this.name = name;
        this.value = value;
        this.isDefault = z6;
    }

    /* renamed from: a */
    public final String m4973a() {
        return this.name;
    }

    /* renamed from: b */
    public final String m4974b() {
        return this.value;
    }

    /* renamed from: c */
    public final boolean m4975c() {
        return this.isDefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return AbstractC4154l.m8918a(this.name, options.name) && AbstractC4154l.m8918a(this.value, options.value) && this.isDefault == options.isDefault;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isDefault) + AbstractC0030c.m113d(this.name.hashCode() * 31, 31, this.value);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.value;
        return AbstractC5601a.m11242m(AbstractC0030c.m127r("Options(name=", str, ", value=", str2, ", isDefault="), this.isDefault, ")");
    }
}
