package qm;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qm.g */
/* loaded from: classes3.dex */
public final class C6251g {

    /* renamed from: a */
    public final C6246b f30293a;

    /* renamed from: b */
    public final List f30294b;

    /* renamed from: c */
    public final List f30295c;

    /* renamed from: d */
    public final List f30296d;

    public C6251g(C6246b c6246b, List list, List list2, List list3) {
        this.f30293a = c6246b;
        this.f30294b = list;
        this.f30295c = list2;
        this.f30296d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6251g)) {
            return false;
        }
        C6251g c6251g = (C6251g) obj;
        return AbstractC4154l.m8918a(this.f30293a, c6251g.f30293a) && AbstractC4154l.m8918a(this.f30294b, c6251g.f30294b) && AbstractC4154l.m8918a(this.f30295c, c6251g.f30295c) && AbstractC4154l.m8918a(this.f30296d, c6251g.f30296d);
    }

    public final int hashCode() {
        return this.f30296d.hashCode() + AbstractC1452a.m4559f(this.f30295c, AbstractC1452a.m4559f(this.f30294b, this.f30293a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MessageTemplateWithRelations(template=" + this.f30293a + ", subTemplates=" + this.f30294b + ", documents=" + this.f30295c + ", tags=" + this.f30296d + ")";
    }
}
