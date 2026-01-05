package en;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rt.C6617a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: en.f */
/* loaded from: classes3.dex */
public final class C2073f {

    /* renamed from: a */
    public final boolean f9686a;

    /* renamed from: b */
    public final int f9687b;

    /* renamed from: c */
    public final C6617a f9688c;

    /* renamed from: d */
    public final boolean f9689d;

    /* renamed from: e */
    public final Long f9690e;

    /* renamed from: f */
    public final List f9691f;

    /* renamed from: g */
    public final boolean f9692g;

    /* renamed from: h */
    public final List f9693h;

    public C2073f(boolean z6, int i10, C6617a c6617a, boolean z10, Long l9, List excludeNumbersList, boolean z11, List callRecordingPathSuggestions) {
        AbstractC4154l.m8923f(excludeNumbersList, "excludeNumbersList");
        AbstractC4154l.m8923f(callRecordingPathSuggestions, "callRecordingPathSuggestions");
        this.f9686a = z6;
        this.f9687b = i10;
        this.f9688c = c6617a;
        this.f9689d = z10;
        this.f9690e = l9;
        this.f9691f = excludeNumbersList;
        this.f9692g = z11;
        this.f9693h = callRecordingPathSuggestions;
    }

    /* renamed from: a */
    public static C2073f m5790a(C2073f c2073f, boolean z6, int i10, C6617a c6617a, Long l9, List list, boolean z10, List list2, int i11) {
        if ((i11 & 1) != 0) {
            z6 = c2073f.f9686a;
        }
        boolean z11 = z6;
        if ((i11 & 2) != 0) {
            i10 = c2073f.f9687b;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            c6617a = c2073f.f9688c;
        }
        C6617a c6617a2 = c6617a;
        boolean z12 = (i11 & 8) != 0 ? c2073f.f9689d : true;
        if ((i11 & 16) != 0) {
            l9 = c2073f.f9690e;
        }
        Long l10 = l9;
        if ((i11 & 32) != 0) {
            list = c2073f.f9691f;
        }
        List excludeNumbersList = list;
        if ((i11 & 64) != 0) {
            z10 = c2073f.f9692g;
        }
        boolean z13 = z10;
        List callRecordingPathSuggestions = (i11 & 128) != 0 ? c2073f.f9693h : list2;
        c2073f.getClass();
        AbstractC4154l.m8923f(excludeNumbersList, "excludeNumbersList");
        AbstractC4154l.m8923f(callRecordingPathSuggestions, "callRecordingPathSuggestions");
        return new C2073f(z11, i12, c6617a2, z12, l10, excludeNumbersList, z13, callRecordingPathSuggestions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2073f)) {
            return false;
        }
        C2073f c2073f = (C2073f) obj;
        return this.f9686a == c2073f.f9686a && this.f9687b == c2073f.f9687b && AbstractC4154l.m8918a(this.f9688c, c2073f.f9688c) && this.f9689d == c2073f.f9689d && AbstractC4154l.m8918a(this.f9690e, c2073f.f9690e) && AbstractC4154l.m8918a(this.f9691f, c2073f.f9691f) && this.f9692g == c2073f.f9692g && AbstractC4154l.m8918a(this.f9693h, c2073f.f9693h);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f9687b, Boolean.hashCode(this.f9686a) * 31, 31);
        C6617a c6617a = this.f9688c;
        int iM4558e = AbstractC1452a.m4558e((iM4556c + (c6617a == null ? 0 : c6617a.hashCode())) * 31, 31, this.f9689d);
        Long l9 = this.f9690e;
        return this.f9693h.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f9691f, (iM4558e + (l9 != null ? l9.hashCode() : 0)) * 31, 31), 31, this.f9692g);
    }

    public final String toString() {
        return "SessionConfigurationData(showLeadSubscriptionBelt=" + this.f9686a + ", notVerifiedCallCount=" + this.f9687b + ", callLogData=" + this.f9688c + ", observeRecordingDownload=" + this.f9689d + ", recordingDownloadFinishedId=" + this.f9690e + ", excludeNumbersList=" + this.f9691f + ", stopCallMonitorService=" + this.f9692g + ", callRecordingPathSuggestions=" + this.f9693h + ")";
    }
}
