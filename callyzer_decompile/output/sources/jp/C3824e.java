package jp;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.e */
/* loaded from: classes3.dex */
public final class C3824e extends AbstractC3828i {

    /* renamed from: a */
    public final String f19776a;

    public C3824e(String number) {
        AbstractC4154l.m8923f(number, "number");
        this.f19776a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3824e) && AbstractC4154l.m8918a(this.f19776a, ((C3824e) obj).f19776a);
    }

    public final int hashCode() {
        return this.f19776a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("PlaceCall(number=", this.f19776a, ")");
    }
}
