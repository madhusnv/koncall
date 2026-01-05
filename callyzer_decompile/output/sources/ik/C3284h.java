package ik;

import jy.n0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.h */
/* loaded from: classes.dex */
public final class C3284h {
    public static final C3283g Companion = new C3283g();

    /* renamed from: a */
    public final Boolean f17493a;

    /* renamed from: b */
    public final Double f17494b;

    /* renamed from: c */
    public final Integer f17495c;

    /* renamed from: d */
    public final Integer f17496d;

    /* renamed from: e */
    public final Long f17497e;

    public /* synthetic */ C3284h(int i10, Boolean bool, Double d2, Integer num, Integer num2, Long l9) {
        if (31 != (i10 & 31)) {
            n0.m8426g(i10, 31, C3282f.f17492a.getDescriptor());
            throw null;
        }
        this.f17493a = bool;
        this.f17494b = d2;
        this.f17495c = num;
        this.f17496d = num2;
        this.f17497e = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3284h)) {
            return false;
        }
        C3284h c3284h = (C3284h) obj;
        return AbstractC4154l.m8918a(this.f17493a, c3284h.f17493a) && AbstractC4154l.m8918a(this.f17494b, c3284h.f17494b) && AbstractC4154l.m8918a(this.f17495c, c3284h.f17495c) && AbstractC4154l.m8918a(this.f17496d, c3284h.f17496d) && AbstractC4154l.m8918a(this.f17497e, c3284h.f17497e);
    }

    public final int hashCode() {
        Boolean bool = this.f17493a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d2 = this.f17494b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.f17495c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17496d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l9 = this.f17497e;
        return iHashCode4 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f17493a + ", sessionSamplingRate=" + this.f17494b + ", sessionTimeoutSeconds=" + this.f17495c + ", cacheDurationSeconds=" + this.f17496d + ", cacheUpdatedTimeSeconds=" + this.f17497e + ')';
    }

    public C3284h(Boolean bool, Double d2, Integer num, Integer num2, Long l9) {
        this.f17493a = bool;
        this.f17494b = d2;
        this.f17495c = num;
        this.f17496d = num2;
        this.f17497e = l9;
    }
}
