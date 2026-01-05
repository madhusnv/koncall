package pu;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pu.e */
/* loaded from: classes3.dex */
public final class C6037e extends AbstractC6038f {

    /* renamed from: a */
    public final String f29487a;

    public C6037e(String str) {
        this.f29487a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6037e) && AbstractC4154l.m8918a(this.f29487a, ((C6037e) obj).f29487a);
    }

    public final int hashCode() {
        String str = this.f29487a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("Success(message=", this.f29487a, ")");
    }
}
