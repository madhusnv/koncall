package jp;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.a */
/* loaded from: classes3.dex */
public final class C3820a extends AbstractC3828i {

    /* renamed from: a */
    public final String f19772a;

    public C3820a(String number) {
        AbstractC4154l.m8923f(number, "number");
        this.f19772a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3820a) && AbstractC4154l.m8918a(this.f19772a, ((C3820a) obj).f19772a);
    }

    public final int hashCode() {
        return this.f19772a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("CopyNumber(number=", this.f19772a, ")");
    }
}
