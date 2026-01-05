package jp;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.f */
/* loaded from: classes3.dex */
public final class C3825f extends AbstractC3828i {

    /* renamed from: a */
    public final String f19777a;

    public C3825f(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f19777a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3825f) && AbstractC4154l.m8918a(this.f19777a, ((C3825f) obj).f19777a);
    }

    public final int hashCode() {
        return this.f19777a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SendTextMessage(phoneNumber=", this.f19777a, ")");
    }
}
