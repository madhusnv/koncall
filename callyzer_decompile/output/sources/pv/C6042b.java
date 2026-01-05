package pv;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pv.b */
/* loaded from: classes3.dex */
public final class C6042b {

    /* renamed from: a */
    public final List f29500a;

    /* renamed from: b */
    public final boolean f29501b;

    /* renamed from: c */
    public final int f29502c;

    public C6042b(int i10, List list, boolean z6) {
        this.f29500a = list;
        this.f29501b = z6;
        this.f29502c = i10;
    }

    /* renamed from: a */
    public static C6042b m12051a(C6042b c6042b, List leadArrayList, boolean z6, int i10, int i11) {
        if ((i11 & 1) != 0) {
            leadArrayList = c6042b.f29500a;
        }
        if ((i11 & 2) != 0) {
            z6 = c6042b.f29501b;
        }
        if ((i11 & 4) != 0) {
            i10 = c6042b.f29502c;
        }
        c6042b.getClass();
        AbstractC4154l.m8923f(leadArrayList, "leadArrayList");
        return new C6042b(i10, leadArrayList, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6042b)) {
            return false;
        }
        C6042b c6042b = (C6042b) obj;
        return AbstractC4154l.m8918a(this.f29500a, c6042b.f29500a) && this.f29501b == c6042b.f29501b && this.f29502c == c6042b.f29502c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29502c) + AbstractC1452a.m4558e(this.f29500a.hashCode() * 31, 31, this.f29501b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneStateReceiverState(leadArrayList=");
        sb2.append(this.f29500a);
        sb2.append(", isNumberExistingInLead=");
        sb2.append(this.f29501b);
        sb2.append(", leadFoundIndex=");
        return AbstractC5601a.m11233d(this.f29502c, ")", sb2);
    }

    public /* synthetic */ C6042b() {
        this(-1, new ArrayList(), false);
    }
}
