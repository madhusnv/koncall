package pu;

import com.websoptimization.callyzerbiz.common.exception.SimStateException;
import kotlin.jvm.internal.AbstractC4154l;
import og.kc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pu.c */
/* loaded from: classes3.dex */
public final class C6035c extends kc {

    /* renamed from: b */
    public final SimStateException.EnumC1456a f29484b;

    public C6035c(SimStateException.EnumC1456a simCardErrorCodes) {
        AbstractC4154l.m8923f(simCardErrorCodes, "simCardErrorCodes");
        this.f29484b = simCardErrorCodes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6035c) && this.f29484b == ((C6035c) obj).f29484b;
    }

    public final int hashCode() {
        return this.f29484b.hashCode();
    }

    public final String toString() {
        return "SimErrorActions(simCardErrorCodes=" + this.f29484b + ")";
    }
}
