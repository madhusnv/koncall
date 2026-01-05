package sv;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sv.a */
/* loaded from: classes3.dex */
public final class C6953a {

    /* renamed from: a */
    public final List f33641a;

    /* renamed from: b */
    public final boolean f33642b;

    /* renamed from: c */
    public final String f33643c;

    /* renamed from: d */
    public final Integer f33644d;

    /* renamed from: e */
    public final boolean f33645e;

    /* renamed from: f */
    public final boolean f33646f;

    /* renamed from: g */
    public final boolean f33647g;

    /* renamed from: h */
    public final String f33648h;

    public C6953a(List uiSIMList, boolean z6, String str, Integer num, boolean z10, boolean z11, boolean z12, String str2) {
        AbstractC4154l.m8923f(uiSIMList, "uiSIMList");
        this.f33641a = uiSIMList;
        this.f33642b = z6;
        this.f33643c = str;
        this.f33644d = num;
        this.f33645e = z10;
        this.f33646f = z11;
        this.f33647g = z12;
        this.f33648h = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* renamed from: a */
    public static C6953a m13205a(C6953a c6953a, ArrayList arrayList, boolean z6, String str, Integer num, boolean z10, boolean z11, boolean z12, String str2, int i10) {
        ArrayList arrayList2 = arrayList;
        if ((i10 & 1) != 0) {
            arrayList2 = c6953a.f33641a;
        }
        ArrayList uiSIMList = arrayList2;
        if ((i10 & 2) != 0) {
            z6 = c6953a.f33642b;
        }
        boolean z13 = z6;
        if ((i10 & 4) != 0) {
            str = c6953a.f33643c;
        }
        String dccCode = str;
        if ((i10 & 8) != 0) {
            num = c6953a.f33644d;
        }
        Integer num2 = num;
        if ((i10 & 16) != 0) {
            z10 = c6953a.f33645e;
        }
        boolean z14 = z10;
        if ((i10 & 32) != 0) {
            z11 = c6953a.f33646f;
        }
        boolean z15 = z11;
        boolean z16 = (i10 & 64) != 0 ? c6953a.f33647g : z12;
        String str3 = (i10 & 128) != 0 ? c6953a.f33648h : str2;
        c6953a.getClass();
        AbstractC4154l.m8923f(uiSIMList, "uiSIMList");
        AbstractC4154l.m8923f(dccCode, "dccCode");
        return new C6953a(uiSIMList, z13, dccCode, num2, z14, z15, z16, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6953a)) {
            return false;
        }
        C6953a c6953a = (C6953a) obj;
        return AbstractC4154l.m8918a(this.f33641a, c6953a.f33641a) && this.f33642b == c6953a.f33642b && AbstractC4154l.m8918a(this.f33643c, c6953a.f33643c) && AbstractC4154l.m8918a(this.f33644d, c6953a.f33644d) && this.f33645e == c6953a.f33645e && this.f33646f == c6953a.f33646f && this.f33647g == c6953a.f33647g && AbstractC4154l.m8918a(this.f33648h, c6953a.f33648h);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4558e(this.f33641a.hashCode() * 31, 31, this.f33642b), 31, this.f33643c);
        Integer num = this.f33644d;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iM113d + (num == null ? 0 : num.hashCode())) * 31, 31, this.f33645e), 31, this.f33646f), 31, this.f33647g);
        String str = this.f33648h;
        return iM4558e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DccState(uiSIMList=");
        sb2.append(this.f33641a);
        sb2.append(", isSimListEmpty=");
        sb2.append(this.f33642b);
        sb2.append(", dccCode=");
        sb2.append(this.f33643c);
        sb2.append(", dccCodeError=");
        sb2.append(this.f33644d);
        sb2.append(", isDccEnable=");
        AbstractC0030c.m133x(sb2, this.f33645e, ", isNetWorkConnected=", this.f33646f, ", isConnectedBtnProcess=");
        sb2.append(this.f33647g);
        sb2.append(", apiFailure=");
        sb2.append(this.f33648h);
        sb2.append(")");
        return sb2.toString();
    }
}
