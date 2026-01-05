package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FCMUpdateRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7349b;

    @InterfaceC4485b("fcmId")
    private final String fcmId;

    @InterfaceC4485b("uniqueSimId")
    private String uniqueSimId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMUpdateRequest(String fcmId, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(fcmId, "fcmId");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.fcmId = fcmId;
        this.f7349b = userSimDetail;
    }

    /* renamed from: N */
    public final String m4657N() {
        return this.fcmId;
    }

    /* renamed from: O */
    public final String m4658O() {
        return this.uniqueSimId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FCMUpdateRequest)) {
            return false;
        }
        FCMUpdateRequest fCMUpdateRequest = (FCMUpdateRequest) obj;
        return AbstractC4154l.m8918a(this.fcmId, fCMUpdateRequest.fcmId) && AbstractC4154l.m8918a(this.f7349b, fCMUpdateRequest.f7349b);
    }

    public final int hashCode() {
        return this.f7349b.hashCode() + (this.fcmId.hashCode() * 31);
    }

    public final String toString() {
        return "FCMUpdateRequest(fcmId=" + this.fcmId + ", userSimDetail=" + this.f7349b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FCMUpdateRequest(String fcmId, String str, C4802m userSimDetail) {
        this(fcmId, userSimDetail);
        AbstractC4154l.m8923f(fcmId, "fcmId");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.uniqueSimId = str;
    }
}
