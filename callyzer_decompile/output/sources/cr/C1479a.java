package cr;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cr.a */
/* loaded from: classes3.dex */
public final class C1479a {

    /* renamed from: a */
    public final String f7540a;

    /* renamed from: b */
    public final String f7541b;

    /* renamed from: c */
    public final String f7542c;

    /* renamed from: d */
    public final String f7543d;

    /* renamed from: e */
    public final String f7544e;

    /* renamed from: f */
    public final String f7545f;

    /* renamed from: g */
    public final String f7546g;

    /* renamed from: h */
    public final String f7547h;

    /* renamed from: i */
    public final String f7548i;

    /* renamed from: j */
    public final String f7549j;

    /* renamed from: k */
    public final String f7550k;

    public /* synthetic */ C1479a() {
        this("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1479a)) {
            return false;
        }
        C1479a c1479a = (C1479a) obj;
        return AbstractC4154l.m8918a(this.f7540a, c1479a.f7540a) && AbstractC4154l.m8918a(this.f7541b, c1479a.f7541b) && AbstractC4154l.m8918a(this.f7542c, c1479a.f7542c) && AbstractC4154l.m8918a(this.f7543d, c1479a.f7543d) && AbstractC4154l.m8918a(this.f7544e, c1479a.f7544e) && AbstractC4154l.m8918a(this.f7545f, c1479a.f7545f) && AbstractC4154l.m8918a(this.f7546g, c1479a.f7546g) && AbstractC4154l.m8918a(this.f7547h, c1479a.f7547h) && AbstractC4154l.m8918a(this.f7548i, c1479a.f7548i) && AbstractC4154l.m8918a(this.f7549j, c1479a.f7549j) && AbstractC4154l.m8918a(this.f7550k, c1479a.f7550k);
    }

    public final int hashCode() {
        return this.f7550k.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f7540a.hashCode() * 31, 31, this.f7541b), 31, this.f7542c), 31, this.f7543d), 31, this.f7544e), 31, this.f7545f), 31, this.f7546g), 31, this.f7547h), 31, this.f7548i), 31, this.f7549j);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("ContactDetailAnalysisUiModel(longestDate=", this.f7540a, ", longestCallType=", this.f7541b, ", longestDuration=");
        a1.m14319B(sbM127r, this.f7542c, ", freqCallDate=", this.f7543d, ", freqNoOfCall=");
        a1.m14319B(sbM127r, this.f7544e, ", freqIncoming=", this.f7545f, ", freqOutgoing=");
        a1.m14319B(sbM127r, this.f7546g, ", avgDayCallCount=", this.f7547h, ", avgCallCount=");
        a1.m14319B(sbM127r, this.f7548i, ", avgIncomingCallCount=", this.f7549j, ", avgGoingCallCount=");
        return AbstractC1452a.m4564k(sbM127r, this.f7550k, ")");
    }

    public C1479a(String str, String str2, String str3, String str4, String freqNoOfCall, String str5, String str6, String avgDayCallCount, String avgCallCount, String avgIncomingCallCount, String avgGoingCallCount) {
        AbstractC4154l.m8923f(freqNoOfCall, "freqNoOfCall");
        AbstractC4154l.m8923f(avgDayCallCount, "avgDayCallCount");
        AbstractC4154l.m8923f(avgCallCount, "avgCallCount");
        AbstractC4154l.m8923f(avgIncomingCallCount, "avgIncomingCallCount");
        AbstractC4154l.m8923f(avgGoingCallCount, "avgGoingCallCount");
        this.f7540a = str;
        this.f7541b = str2;
        this.f7542c = str3;
        this.f7543d = str4;
        this.f7544e = freqNoOfCall;
        this.f7545f = str5;
        this.f7546g = str6;
        this.f7547h = avgDayCallCount;
        this.f7548i = avgCallCount;
        this.f7549j = avgIncomingCallCount;
        this.f7550k = avgGoingCallCount;
    }
}
