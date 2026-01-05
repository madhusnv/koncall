package com.websoptimization.callyzerbiz.data.model.response;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class Subscription {

    @InterfaceC4485b("endDateTime")
    private final LocalDateTime endDateTime;

    @InterfaceC4485b("isActive")
    private final boolean isActive;

    @InterfaceC4485b("startDateTime")
    private final LocalDateTime startDateTime;

    public Subscription(boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.isActive = z6;
        this.startDateTime = localDateTime;
        this.endDateTime = localDateTime2;
    }

    /* renamed from: a */
    public final LocalDateTime m4840a() {
        return this.endDateTime;
    }

    /* renamed from: b */
    public final LocalDateTime m4841b() {
        return this.startDateTime;
    }

    /* renamed from: c */
    public final boolean m4842c() {
        return this.isActive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.isActive == subscription.isActive && AbstractC4154l.m8918a(this.startDateTime, subscription.startDateTime) && AbstractC4154l.m8918a(this.endDateTime, subscription.endDateTime);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isActive) * 31;
        LocalDateTime localDateTime = this.startDateTime;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.endDateTime;
        return iHashCode2 + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }

    public final String toString() {
        return "Subscription(isActive=" + this.isActive + ", startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ")";
    }

    public /* synthetic */ Subscription(boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i10, AbstractC4148f abstractC4148f) {
        this(z6, (i10 & 2) != 0 ? null : localDateTime, (i10 & 4) != 0 ? null : localDateTime2);
    }
}
