package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchUpdatedCallNoteRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7351b;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final int duration;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchUpdatedCallNoteRequest(String toNumber, String callType, int i10, String dateTime, int i11, C4802m userSimDetails) {
        super(userSimDetails);
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        this.toNumber = toNumber;
        this.callType = callType;
        this.duration = i10;
        this.dateTime = dateTime;
        this.countryCode = i11;
        this.f7351b = userSimDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchUpdatedCallNoteRequest)) {
            return false;
        }
        FetchUpdatedCallNoteRequest fetchUpdatedCallNoteRequest = (FetchUpdatedCallNoteRequest) obj;
        return AbstractC4154l.m8918a(this.toNumber, fetchUpdatedCallNoteRequest.toNumber) && AbstractC4154l.m8918a(this.callType, fetchUpdatedCallNoteRequest.callType) && this.duration == fetchUpdatedCallNoteRequest.duration && AbstractC4154l.m8918a(this.dateTime, fetchUpdatedCallNoteRequest.dateTime) && this.countryCode == fetchUpdatedCallNoteRequest.countryCode && AbstractC4154l.m8918a(this.f7351b, fetchUpdatedCallNoteRequest.f7351b);
    }

    public final int hashCode() {
        return this.f7351b.hashCode() + AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(AbstractC1452a.m4556c(this.duration, AbstractC0030c.m113d(this.toNumber.hashCode() * 31, 31, this.callType), 31), 31, this.dateTime), 31);
    }

    public final String toString() {
        String str = this.toNumber;
        String str2 = this.callType;
        int i10 = this.duration;
        String str3 = this.dateTime;
        int i11 = this.countryCode;
        StringBuilder sbM127r = AbstractC0030c.m127r("FetchUpdatedCallNoteRequest(toNumber=", str, ", callType=", str2, ", duration=");
        AbstractC1452a.m4550A(sbM127r, i10, ", dateTime=", str3, ", countryCode=");
        sbM127r.append(i11);
        sbM127r.append(", userSimDetails=");
        sbM127r.append(this.f7351b);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
