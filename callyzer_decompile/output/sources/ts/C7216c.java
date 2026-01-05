package ts;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.domain.model.WhatsNewDescription;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ts.c */
/* loaded from: classes3.dex */
public final class C7216c {

    /* renamed from: a */
    public final List f34513a;

    /* renamed from: b */
    public final C7217d f34514b;

    /* renamed from: c */
    public final boolean f34515c;

    /* renamed from: d */
    public final EnumC7215b f34516d;

    /* renamed from: e */
    public final String f34517e;

    /* renamed from: f */
    public final WhatsNewDescription f34518f;

    /* renamed from: g */
    public final boolean f34519g;

    /* renamed from: h */
    public final boolean f34520h;

    /* renamed from: i */
    public final String f34521i;

    /* renamed from: j */
    public final String f34522j;

    public C7216c(List list, C7217d c7217d, boolean z6, EnumC7215b enumC7215b, String str, WhatsNewDescription whatsNewDescription, boolean z10, boolean z11, String str2, String str3) {
        this.f34513a = list;
        this.f34514b = c7217d;
        this.f34515c = z6;
        this.f34516d = enumC7215b;
        this.f34517e = str;
        this.f34518f = whatsNewDescription;
        this.f34519g = z10;
        this.f34520h = z11;
        this.f34521i = str2;
        this.f34522j = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.List] */
    /* renamed from: a */
    public static C7216c m13448a(C7216c c7216c, ArrayList arrayList, C7217d c7217d, boolean z6, EnumC7215b enumC7215b, String str, WhatsNewDescription whatsNewDescription, boolean z10, boolean z11, String str2, String str3, int i10) {
        ArrayList arrayList2 = arrayList;
        if ((i10 & 1) != 0) {
            arrayList2 = c7216c.f34513a;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i10 & 2) != 0) {
            c7217d = c7216c.f34514b;
        }
        C7217d c7217d2 = c7217d;
        if ((i10 & 4) != 0) {
            z6 = c7216c.f34515c;
        }
        boolean z12 = z6;
        if ((i10 & 8) != 0) {
            enumC7215b = c7216c.f34516d;
        }
        EnumC7215b enumC7215b2 = enumC7215b;
        c7216c.getClass();
        String str4 = (i10 & 32) != 0 ? c7216c.f34517e : str;
        WhatsNewDescription whatsNewDescription2 = (i10 & 64) != 0 ? c7216c.f34518f : whatsNewDescription;
        boolean z13 = (i10 & 128) != 0 ? c7216c.f34519g : z10;
        boolean z14 = (i10 & 256) != 0 ? c7216c.f34520h : z11;
        String str5 = (i10 & 512) != 0 ? c7216c.f34521i : str2;
        String str6 = (i10 & 1024) != 0 ? c7216c.f34522j : str3;
        c7216c.getClass();
        return new C7216c(arrayList3, c7217d2, z12, enumC7215b2, str4, whatsNewDescription2, z13, z14, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7216c)) {
            return false;
        }
        C7216c c7216c = (C7216c) obj;
        return this.f34513a.equals(c7216c.f34513a) && this.f34514b.equals(c7216c.f34514b) && this.f34515c == c7216c.f34515c && this.f34516d == c7216c.f34516d && AbstractC4154l.m8918a(this.f34517e, c7216c.f34517e) && AbstractC4154l.m8918a(this.f34518f, c7216c.f34518f) && this.f34519g == c7216c.f34519g && this.f34520h == c7216c.f34520h && AbstractC4154l.m8918a(this.f34521i, c7216c.f34521i) && AbstractC4154l.m8918a(this.f34522j, c7216c.f34522j);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e((this.f34514b.hashCode() + (this.f34513a.hashCode() * 31)) * 31, 31, this.f34515c);
        EnumC7215b enumC7215b = this.f34516d;
        int iM4558e2 = AbstractC1452a.m4558e((iM4558e + (enumC7215b == null ? 0 : enumC7215b.hashCode())) * 31, 31, false);
        String str = this.f34517e;
        int iHashCode = (iM4558e2 + (str == null ? 0 : str.hashCode())) * 31;
        WhatsNewDescription whatsNewDescription = this.f34518f;
        int iM4558e3 = AbstractC1452a.m4558e(AbstractC1452a.m4558e((iHashCode + (whatsNewDescription == null ? 0 : whatsNewDescription.hashCode())) * 31, 31, this.f34519g), 31, this.f34520h);
        String str2 = this.f34521i;
        int iHashCode2 = (iM4558e3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34522j;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MainScreenState(bottomNavigationList=");
        sb2.append(this.f34513a);
        sb2.append(", simOptionState=");
        sb2.append(this.f34514b);
        sb2.append(", navigateToOverlayPermissionScreen=");
        sb2.append(this.f34515c);
        sb2.append(", showDialog=");
        sb2.append(this.f34516d);
        sb2.append(", showFolderPathSetMessage=false, folderSelectError=");
        sb2.append(this.f34517e);
        sb2.append(", versionInfo=");
        sb2.append(this.f34518f);
        sb2.append(", openSIMChangeDialog=");
        AbstractC0030c.m133x(sb2, this.f34519g, ", isShowBadge=", this.f34520h, ", startDestination=");
        return AbstractC0030c.m124o(sb2, this.f34521i, ", pendingDestination=", this.f34522j, ")");
    }
}
