package m0;

import c0.b2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4154l;
import u0.C7294d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m0.b */
/* loaded from: classes.dex */
public final class C4608b {

    /* renamed from: a */
    public final LinkedHashSet f22818a;

    /* renamed from: b */
    public final ArrayList f22819b;

    /* renamed from: c */
    public final ArrayList f22820c;

    /* renamed from: d */
    public final ArrayList f22821d;

    /* renamed from: e */
    public final ArrayList f22822e;

    /* renamed from: f */
    public final C7294d f22823f;

    /* renamed from: g */
    public final b2 f22824g;

    /* renamed from: h */
    public final HashMap f22825h;

    /* renamed from: i */
    public final C4615i f22826i;

    /* renamed from: j */
    public final C4615i f22827j;

    public C4608b(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C7294d c7294d, b2 b2Var, HashMap map, C4615i primaryStreamSpecResult, C4615i c4615i) {
        AbstractC4154l.m8923f(primaryStreamSpecResult, "primaryStreamSpecResult");
        this.f22818a = linkedHashSet;
        this.f22819b = arrayList;
        this.f22820c = arrayList2;
        this.f22821d = arrayList3;
        this.f22822e = arrayList4;
        this.f22823f = c7294d;
        this.f22824g = b2Var;
        this.f22825h = map;
        this.f22826i = primaryStreamSpecResult;
        this.f22827j = c4615i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4608b)) {
            return false;
        }
        C4608b c4608b = (C4608b) obj;
        return this.f22818a.equals(c4608b.f22818a) && this.f22819b.equals(c4608b.f22819b) && this.f22820c.equals(c4608b.f22820c) && this.f22821d.equals(c4608b.f22821d) && this.f22822e.equals(c4608b.f22822e) && AbstractC4154l.m8918a(this.f22823f, c4608b.f22823f) && AbstractC4154l.m8918a(this.f22824g, c4608b.f22824g) && this.f22825h.equals(c4608b.f22825h) && AbstractC4154l.m8918a(this.f22826i, c4608b.f22826i) && AbstractC4154l.m8918a(this.f22827j, c4608b.f22827j);
    }

    public final int hashCode() {
        int iHashCode = (this.f22822e.hashCode() + ((this.f22821d.hashCode() + ((this.f22820c.hashCode() + ((this.f22819b.hashCode() + (this.f22818a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        C7294d c7294d = this.f22823f;
        int iHashCode2 = (iHashCode + (c7294d == null ? 0 : c7294d.hashCode())) * 31;
        b2 b2Var = this.f22824g;
        int iHashCode3 = (this.f22826i.hashCode() + ((this.f22825h.hashCode() + ((iHashCode2 + (b2Var == null ? 0 : b2Var.hashCode())) * 31)) * 31)) * 31;
        C4615i c4615i = this.f22827j;
        return iHashCode3 + (c4615i != null ? c4615i.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f22818a + ", cameraUseCases=" + this.f22819b + ", cameraUseCasesToAttach=" + this.f22820c + ", cameraUseCasesToKeep=" + this.f22821d + ", cameraUseCasesToDetach=" + this.f22822e + ", streamSharing=" + this.f22823f + ", placeholderForExtensions=" + this.f22824g + ", useCaseConfigs=" + this.f22825h + ", primaryStreamSpecResult=" + this.f22826i + ", secondaryStreamSpecResult=" + this.f22827j + ')';
    }
}
