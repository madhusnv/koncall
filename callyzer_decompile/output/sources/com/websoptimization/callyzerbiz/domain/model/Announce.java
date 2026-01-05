package com.websoptimization.callyzerbiz.domain.model;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class Announce {

    @InterfaceC4485b("descriptions")
    private final List<String> descriptions;

    public Announce(List<String> descriptions) {
        AbstractC4154l.m8923f(descriptions, "descriptions");
        this.descriptions = descriptions;
    }

    /* renamed from: a */
    public final List m5024a() {
        return this.descriptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Announce) && AbstractC4154l.m8918a(this.descriptions, ((Announce) obj).descriptions);
    }

    public final int hashCode() {
        return this.descriptions.hashCode();
    }

    public final String toString() {
        return m0.m7380m("Announce(descriptions=", ")", this.descriptions);
    }
}
