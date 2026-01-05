package com.websoptimization.callyzerbiz.data.model.response.edit_lead_response;

import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DynamicFieldResponse {

    @InterfaceC4485b(IMAPStore.ID_NAME)
    private final String name;

    @InterfaceC4485b("value")
    private final Object value;

    public DynamicFieldResponse(String name, Object value) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        this.name = name;
        this.value = value;
    }

    /* renamed from: a */
    public final String m4859a() {
        return this.name;
    }

    /* renamed from: b */
    public final Object m4860b() {
        return this.value;
    }
}
