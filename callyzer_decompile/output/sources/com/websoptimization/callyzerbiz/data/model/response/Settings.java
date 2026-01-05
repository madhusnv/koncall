package com.websoptimization.callyzerbiz.data.model.response;

import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class Settings {

    @InterfaceC4485b("connectedCallDuration")
    private final int connectedCallDuration;

    public Settings(int i10) {
        this.connectedCallDuration = i10;
    }

    /* renamed from: a */
    public final int m4839a() {
        return this.connectedCallDuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Settings) && this.connectedCallDuration == ((Settings) obj).connectedCallDuration;
    }

    public final int hashCode() {
        return Integer.hashCode(this.connectedCallDuration);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.connectedCallDuration, "Settings(connectedCallDuration=", ")");
    }
}
