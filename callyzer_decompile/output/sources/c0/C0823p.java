package c0;

import i0.C3077h;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.p */
/* loaded from: classes.dex */
public final class C0823p {

    /* renamed from: a */
    public final ArrayList f5187a;

    /* renamed from: b */
    public final C3077h f5188b;

    public C0823p(ArrayList arrayList, C3077h c3077h) {
        this.f5187a = arrayList;
        this.f5188b = c3077h;
        og.y0.m11051a("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    /* renamed from: a */
    public final String m2223a() {
        ArrayList arrayList = this.f5187a;
        og.y0.m11056f("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) AbstractC6663m.m12742F(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0823p)) {
            return false;
        }
        C0823p c0823p = (C0823p) obj;
        return this.f5187a.equals(c0823p.f5187a) && AbstractC4154l.m8918a(this.f5188b, c0823p.f5188b);
    }

    public final int hashCode() {
        int iHashCode = this.f5187a.hashCode() * 31;
        C3077h c3077h = this.f5188b;
        return iHashCode + (c3077h != null ? c3077h.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraIdentifier{cameraIds="
            r0.<init>(r1)
            r6 = 0
            r7 = 62
            java.util.ArrayList r2 = r8.f5187a
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            java.lang.String r1 = rw.AbstractC6663m.m12748L(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            i0.h r1 = r8.f5188b
            if (r1 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ", compatId="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L2d
        L2b:
            java.lang.String r1 = ""
        L2d:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = a2.AbstractC0030c.m123n(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0823p.toString():java.lang.String");
    }
}
