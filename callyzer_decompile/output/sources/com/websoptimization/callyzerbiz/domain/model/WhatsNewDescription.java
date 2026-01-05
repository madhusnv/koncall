package com.websoptimization.callyzerbiz.domain.model;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class WhatsNewDescription {

    @InterfaceC4485b("announce")
    private final Announce announce;

    @InterfaceC4485b("bug")
    private final Bug bug;

    @InterfaceC4485b("features")
    private final Features features;

    @InterfaceC4485b("releaseDate")
    private final String releaseDate;

    @InterfaceC4485b("versionName")
    private final String versionName;

    public WhatsNewDescription(String versionName, String str, Bug bug, Features features, Announce announce) {
        AbstractC4154l.m8923f(versionName, "versionName");
        this.versionName = versionName;
        this.releaseDate = str;
        this.bug = bug;
        this.features = features;
        this.announce = announce;
    }

    /* renamed from: a */
    public final Announce m5027a() {
        return this.announce;
    }

    /* renamed from: b */
    public final Bug m5028b() {
        return this.bug;
    }

    /* renamed from: c */
    public final Features m5029c() {
        return this.features;
    }

    /* renamed from: d */
    public final String m5030d() {
        return this.releaseDate;
    }

    /* renamed from: e */
    public final String m5031e() {
        return this.versionName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhatsNewDescription)) {
            return false;
        }
        WhatsNewDescription whatsNewDescription = (WhatsNewDescription) obj;
        return AbstractC4154l.m8918a(this.versionName, whatsNewDescription.versionName) && AbstractC4154l.m8918a(this.releaseDate, whatsNewDescription.releaseDate) && AbstractC4154l.m8918a(this.bug, whatsNewDescription.bug) && AbstractC4154l.m8918a(this.features, whatsNewDescription.features) && AbstractC4154l.m8918a(this.announce, whatsNewDescription.announce);
    }

    public final int hashCode() {
        int iHashCode = this.versionName.hashCode() * 31;
        String str = this.releaseDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bug bug = this.bug;
        int iHashCode3 = (iHashCode2 + (bug == null ? 0 : bug.hashCode())) * 31;
        Features features = this.features;
        int iHashCode4 = (iHashCode3 + (features == null ? 0 : features.hashCode())) * 31;
        Announce announce = this.announce;
        return iHashCode4 + (announce != null ? announce.hashCode() : 0);
    }

    public final String toString() {
        String str = this.versionName;
        String str2 = this.releaseDate;
        Bug bug = this.bug;
        Features features = this.features;
        Announce announce = this.announce;
        StringBuilder sbM127r = AbstractC0030c.m127r("WhatsNewDescription(versionName=", str, ", releaseDate=", str2, ", bug=");
        sbM127r.append(bug);
        sbM127r.append(", features=");
        sbM127r.append(features);
        sbM127r.append(", announce=");
        sbM127r.append(announce);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ WhatsNewDescription(String str, String str2, Bug bug, Features features, Announce announce, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bug, (i10 & 8) != 0 ? null : features, (i10 & 16) != 0 ? null : announce);
    }
}
