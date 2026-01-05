package vq;

import j$.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vq.b */
/* loaded from: classes3.dex */
public final class C7730b {

    /* renamed from: a */
    public final LocalDate f37279a;

    /* renamed from: b */
    public final LocalDate f37280b;

    /* renamed from: c */
    public final List f37281c;

    public C7730b(LocalDate localDate, LocalDate toDate, List contacts) {
        AbstractC4154l.m8923f(toDate, "toDate");
        AbstractC4154l.m8923f(contacts, "contacts");
        this.f37279a = localDate;
        this.f37280b = toDate;
        this.f37281c = contacts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7730b)) {
            return false;
        }
        C7730b c7730b = (C7730b) obj;
        return AbstractC4154l.m8918a(this.f37279a, c7730b.f37279a) && AbstractC4154l.m8918a(this.f37280b, c7730b.f37280b) && AbstractC4154l.m8918a(this.f37281c, c7730b.f37281c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f37279a;
        return this.f37281c.hashCode() + ((this.f37280b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompareQueryModel(fromDate=");
        sb2.append(this.f37279a);
        sb2.append(", toDate=");
        sb2.append(this.f37280b);
        sb2.append(", contacts=");
        return AbstractC5601a.m11240k(")", sb2, this.f37281c);
    }
}
