package mg;

import com.google.android.gms.fido.fido2.api.common.C1279e;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.f */
/* loaded from: classes.dex */
public final class C4727f extends AbstractC4726e {

    /* renamed from: a */
    public final C1279e f23640a;

    public C4727f(C1279e c1279e) {
        this.f23640a = c1279e;
    }

    @Override // mg.AbstractC4726e
    /* renamed from: a */
    public final Object mo9614a() {
        return this.f23640a;
    }

    @Override // mg.AbstractC4726e
    /* renamed from: b */
    public final boolean mo9615b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4727f) {
            return this.f23640a.equals(((C4727f) obj).f23640a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23640a.hashCode() + 1502476572;
    }

    public final String toString() {
        return AbstractC5601a.m11238i("Optional.of(", this.f23640a.toString(), ")");
    }
}
