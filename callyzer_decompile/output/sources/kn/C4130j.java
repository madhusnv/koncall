package kn;

import a2.AbstractC0030c;
import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4792c;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import yv.C8789d;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.j */
/* loaded from: classes3.dex */
public final class C4130j {

    /* renamed from: a */
    public final C4792c f21081a;

    /* renamed from: b */
    public final String f21082b;

    /* renamed from: c */
    public boolean f21083c;

    /* renamed from: d */
    public final int f21084d;

    /* renamed from: e */
    public final String f21085e;

    /* renamed from: f */
    public final String f21086f;

    /* renamed from: g */
    public final String f21087g;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public C4130j(C4792c c4792c, String str, boolean z6) {
        String strM16159f;
        LocalDateTime localDateTime = c4792c.f23849f;
        this.f21081a = c4792c;
        this.f21082b = str;
        this.f21083c = z6;
        EnumC8994d enumC8994d = c4792c.f23848e;
        String typeName = enumC8994d != null ? enumC8994d.getTypeName() : null;
        int i10 = R.drawable.ic_tab_incoming_outlined;
        if (typeName != null) {
            switch (typeName.hashCode()) {
                case -1990013253:
                    if (typeName.equals("Missed")) {
                        i10 = R.drawable.ic_tab_missed_outline;
                        break;
                    }
                    break;
                case -543852386:
                    if (typeName.equals("Rejected")) {
                        i10 = R.drawable.ic_tab_rejected_outlined;
                        break;
                    }
                    break;
                case 126326668:
                    if (typeName.equals("Outgoing")) {
                        i10 = R.drawable.ic_tab_outgoing_outlined;
                        break;
                    }
                    break;
                case 157441094:
                    typeName.equals("Incoming");
                    break;
            }
        }
        this.f21084d = i10;
        C8800o c8800o = C8800o.f42459a;
        this.f21085e = C8800o.m16191O(localDateTime);
        this.f21086f = C8800o.m16186J(localDateTime);
        Long l9 = c4792c.f23851h;
        this.f21087g = (l9 == null || (strM16159f = C8789d.m16159f((int) l9.longValue())) == null) ? "0" : strM16159f;
    }

    /* renamed from: a */
    public static C4130j m8900a(C4130j c4130j, boolean z6) {
        C4792c c4792c = c4130j.f21081a;
        String str = c4130j.f21082b;
        c4130j.getClass();
        return new C4130j(c4792c, str, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4130j)) {
            return false;
        }
        C4130j c4130j = (C4130j) obj;
        return AbstractC4154l.m8918a(this.f21081a, c4130j.f21081a) && AbstractC4154l.m8918a(this.f21082b, c4130j.f21082b) && this.f21083c == c4130j.f21083c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21083c) + AbstractC0030c.m113d(this.f21081a.hashCode() * 31, 31, this.f21082b);
    }

    public final String toString() {
        boolean z6 = this.f21083c;
        StringBuilder sb2 = new StringBuilder("SIMVerificationViaCallLogData(callLogDetails=");
        sb2.append(this.f21081a);
        sb2.append(", phoneAccountId=");
        sb2.append(this.f21082b);
        sb2.append(", isSelected=");
        return AbstractC5601a.m11242m(sb2, z6, ")");
    }
}
