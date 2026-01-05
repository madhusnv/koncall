package br;

import cr.C1479a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: br.a */
/* loaded from: classes3.dex */
public final class C0738a {

    /* renamed from: a */
    public final C1479a f4657a;

    public C0738a(C1479a c1479a) {
        this.f4657a = c1479a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0738a) && AbstractC4154l.m8918a(this.f4657a, ((C0738a) obj).f4657a);
    }

    public final int hashCode() {
        return this.f4657a.hashCode();
    }

    public final String toString() {
        return "AnalysisContactDetailState(callAnalysis=" + this.f4657a + ")";
    }
}
