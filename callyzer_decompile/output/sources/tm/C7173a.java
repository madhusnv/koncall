package tm;

import ai.AbstractC0151h;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tm.a */
/* loaded from: classes3.dex */
public final class C7173a extends AbstractC0151h {

    /* renamed from: b */
    public final ArrayList f34434b;

    /* renamed from: c */
    public final C4802m f34435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7173a(ArrayList arrayList, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.f34434b = arrayList;
        this.f34435c = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7173a)) {
            return false;
        }
        C7173a c7173a = (C7173a) obj;
        return AbstractC4154l.m8918a(this.f34434b, c7173a.f34434b) && AbstractC4154l.m8918a(this.f34435c, c7173a.f34435c);
    }

    public final int hashCode() {
        return this.f34435c.hashCode() + (this.f34434b.hashCode() * 31);
    }

    public final String toString() {
        return "SyncTemplateRequest(templates=" + this.f34434b + ", userSimDetail=" + this.f34435c + ")";
    }
}
