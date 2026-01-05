package au;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.r */
/* loaded from: classes3.dex */
public final class C0454r {

    /* renamed from: a */
    public final List f3253a;

    /* renamed from: b */
    public final C4802m f3254b;

    /* renamed from: c */
    public final EnumC0455s f3255c;

    public C0454r(List uiSIMList, C4802m c4802m, EnumC0455s screenMode) {
        AbstractC4154l.m8923f(uiSIMList, "uiSIMList");
        AbstractC4154l.m8923f(screenMode, "screenMode");
        this.f3253a = uiSIMList;
        this.f3254b = c4802m;
        this.f3255c = screenMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* renamed from: a */
    public static C0454r m1459a(C0454r c0454r, ArrayList arrayList, C4802m c4802m, EnumC0455s screenMode, int i10) {
        ArrayList uiSIMList = arrayList;
        if ((i10 & 1) != 0) {
            uiSIMList = c0454r.f3253a;
        }
        c0454r.getClass();
        if ((i10 & 4) != 0) {
            c4802m = c0454r.f3254b;
        }
        if ((i10 & 8) != 0) {
            screenMode = c0454r.f3255c;
        }
        c0454r.getClass();
        AbstractC4154l.m8923f(uiSIMList, "uiSIMList");
        AbstractC4154l.m8923f(screenMode, "screenMode");
        return new C0454r(uiSIMList, c4802m, screenMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0454r)) {
            return false;
        }
        C0454r c0454r = (C0454r) obj;
        return AbstractC4154l.m8918a(this.f3253a, c0454r.f3253a) && AbstractC4154l.m8918a(this.f3254b, c0454r.f3254b) && this.f3255c == c0454r.f3255c;
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(0, this.f3253a.hashCode() * 31, 31);
        C4802m c4802m = this.f3254b;
        return this.f3255c.hashCode() + ((iM4556c + (c4802m != null ? c4802m.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ConnectedSIMState(uiSIMList=" + this.f3253a + ", selectedSIMCount=0, selectedSIM=" + this.f3254b + ", screenMode=" + this.f3255c + ")";
    }
}
