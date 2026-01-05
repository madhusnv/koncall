package eb;

import a9.C0073l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a */
    public final C1992p f9301a;

    /* renamed from: b */
    public final ArrayList f9302b;

    /* renamed from: c */
    public final h0 f9303c;

    /* renamed from: d */
    public final LinkedHashMap f9304d;

    /* renamed from: e */
    public final String f9305e;

    public e2(C0073l c0073l) {
        this.f9301a = (C1992p) c0073l.f264a;
        this.f9302b = (ArrayList) c0073l.f265b;
        this.f9303c = (h0) c0073l.f266c;
        this.f9304d = (LinkedHashMap) c0073l.f267d;
        this.f9305e = (String) c0073l.f268e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2.class != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return AbstractC4154l.m8918a(this.f9301a, e2Var.f9301a) && AbstractC4154l.m8918a(this.f9302b, e2Var.f9302b) && AbstractC4154l.m8918a(this.f9303c, e2Var.f9303c) && AbstractC4154l.m8918a(this.f9304d, e2Var.f9304d) && AbstractC4154l.m8918a(this.f9305e, e2Var.f9305e);
    }

    public final int hashCode() {
        C1992p c1992p = this.f9301a;
        int iHashCode = (c1992p != null ? c1992p.hashCode() : 0) * 31;
        ArrayList arrayList = this.f9302b;
        int iHashCode2 = (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        h0 h0Var = this.f9303c;
        int iHashCode3 = (iHashCode2 + (h0Var != null ? h0Var.hashCode() : 0)) * 31;
        LinkedHashMap linkedHashMap = this.f9304d;
        int iHashCode4 = (iHashCode3 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0)) * 31;
        String str = this.f9305e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InitiateAuthResponse(");
        sb2.append("authenticationResult=" + this.f9301a + ',');
        sb2.append("availableChallenges=" + this.f9302b + ',');
        sb2.append("challengeName=" + this.f9303c + ',');
        sb2.append("challengeParameters=" + this.f9304d + ',');
        sb2.append("session=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
