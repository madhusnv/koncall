package pu;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4154l;
import og.kc;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pu.h */
/* loaded from: classes3.dex */
public final class C6040h {

    /* renamed from: a */
    public final String f29488a;

    /* renamed from: b */
    public final String f29489b;

    /* renamed from: c */
    public final int f29490c;

    /* renamed from: d */
    public final InterfaceC2139c f29491d;

    /* renamed from: e */
    public final EnumC6039g f29492e;

    /* renamed from: f */
    public final String f29493f;

    /* renamed from: g */
    public final kc f29494g;

    /* renamed from: h */
    public final InterfaceC2142f f29495h;

    public C6040h(String str, String str2, int i10, InterfaceC2139c interfaceC2139c, EnumC6039g troubleshootStepStatus, String str3, kc kcVar, InterfaceC2142f interfaceC2142f) {
        AbstractC4154l.m8923f(troubleshootStepStatus, "troubleshootStepStatus");
        this.f29488a = str;
        this.f29489b = str2;
        this.f29490c = i10;
        this.f29491d = interfaceC2139c;
        this.f29492e = troubleshootStepStatus;
        this.f29493f = str3;
        this.f29494g = kcVar;
        this.f29495h = interfaceC2142f;
    }

    /* renamed from: a */
    public static C6040h m12050a(C6040h c6040h, EnumC6039g troubleshootStepStatus, String str, kc kcVar, int i10) {
        String title = c6040h.f29488a;
        String description = c6040h.f29489b;
        int i11 = c6040h.f29490c;
        InterfaceC2139c process = c6040h.f29491d;
        if ((i10 & 32) != 0) {
            str = c6040h.f29493f;
        }
        String str2 = str;
        if ((i10 & 64) != 0) {
            kcVar = c6040h.f29494g;
        }
        InterfaceC2142f errorActionUi = c6040h.f29495h;
        c6040h.getClass();
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(process, "process");
        AbstractC4154l.m8923f(troubleshootStepStatus, "troubleshootStepStatus");
        AbstractC4154l.m8923f(errorActionUi, "errorActionUi");
        return new C6040h(title, description, i11, process, troubleshootStepStatus, str2, kcVar, errorActionUi);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6040h)) {
            return false;
        }
        C6040h c6040h = (C6040h) obj;
        return AbstractC4154l.m8918a(this.f29488a, c6040h.f29488a) && AbstractC4154l.m8918a(this.f29489b, c6040h.f29489b) && this.f29490c == c6040h.f29490c && AbstractC4154l.m8918a(this.f29491d, c6040h.f29491d) && this.f29492e == c6040h.f29492e && AbstractC4154l.m8918a(this.f29493f, c6040h.f29493f) && AbstractC4154l.m8918a(this.f29494g, c6040h.f29494g) && AbstractC4154l.m8918a(this.f29495h, c6040h.f29495h);
    }

    public final int hashCode() {
        int iHashCode = (this.f29492e.hashCode() + ((this.f29491d.hashCode() + AbstractC1452a.m4556c(this.f29490c, AbstractC0030c.m113d(this.f29488a.hashCode() * 31, 31, this.f29489b), 31)) * 31)) * 31;
        String str = this.f29493f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kc kcVar = this.f29494g;
        return this.f29495h.hashCode() + ((iHashCode2 + (kcVar != null ? kcVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("TroubleshootStepUiModel(title=", this.f29488a, ", description=", this.f29489b, ", icon=");
        sbM127r.append(this.f29490c);
        sbM127r.append(", process=");
        sbM127r.append(this.f29491d);
        sbM127r.append(", troubleshootStepStatus=");
        sbM127r.append(this.f29492e);
        sbM127r.append(", completeMsg=");
        sbM127r.append(this.f29493f);
        sbM127r.append(", troubleshootErrorAction=");
        sbM127r.append(this.f29494g);
        sbM127r.append(", errorActionUi=");
        sbM127r.append(this.f29495h);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ C6040h(String str, String str2, int i10, InterfaceC2139c interfaceC2139c, C6734c c6734c) {
        this(str, str2, i10, interfaceC2139c, EnumC6039g.PENDING, null, null, c6734c);
    }
}
