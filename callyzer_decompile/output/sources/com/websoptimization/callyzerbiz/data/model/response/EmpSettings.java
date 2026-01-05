package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class EmpSettings {

    @InterfaceC4485b("isSyncLeadOnly")
    private Boolean isSyncLeadOnly;

    /* JADX WARN: Multi-variable type inference failed */
    public EmpSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public final Boolean m4769a() {
        return this.isSyncLeadOnly;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmpSettings) && AbstractC4154l.m8918a(this.isSyncLeadOnly, ((EmpSettings) obj).isSyncLeadOnly);
    }

    public final int hashCode() {
        Boolean bool = this.isSyncLeadOnly;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "EmpSettings(isSyncLeadOnly=" + this.isSyncLeadOnly + ")";
    }

    public EmpSettings(Boolean bool) {
        this.isSyncLeadOnly = bool;
    }

    public /* synthetic */ EmpSettings(Boolean bool, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : bool);
    }
}
