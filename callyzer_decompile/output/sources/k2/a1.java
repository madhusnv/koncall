package k2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC4154l;
import u2.AbstractC7311h;
import u2.AbstractC7316m;
import u2.AbstractC7329z;
import u2.C7306c;
import u2.InterfaceC7318o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 extends AbstractC7329z implements Parcelable, InterfaceC7318o, w0, h2 {
    public static final Parcelable.Creator<a1> CREATOR = new z0(0);

    /* renamed from: b */
    public z1 f20345b;

    public a1(float f6) {
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        z1 z1Var = new z1(f6, abstractC7311hM13686k.mo13652g());
        if (!(abstractC7311hM13686k instanceof C7306c)) {
            z1Var.f34839b = new z1(f6, 1);
        }
        this.f20345b = z1Var;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: b */
    public final u2.a0 mo8488b() {
        return this.f20345b;
    }

    @Override // u2.InterfaceC7318o
    /* renamed from: c */
    public final d2 mo8489c() {
        return s0.f20547f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final float m8490f() {
        return ((z1) AbstractC7316m.m13695t(this.f20345b, this)).f20637c;
    }

    /* renamed from: g */
    public final void m8491g(float f6) {
        AbstractC7311h abstractC7311hM13686k;
        z1 z1Var = (z1) AbstractC7316m.m13684i(this.f20345b);
        if (z1Var.f20637c == f6) {
            return;
        }
        z1 z1Var2 = this.f20345b;
        synchronized (AbstractC7316m.f34890b) {
            abstractC7311hM13686k = AbstractC7316m.m13686k();
            ((z1) AbstractC7316m.m13690o(z1Var2, this, abstractC7311hM13686k, z1Var)).f20637c = f6;
        }
        AbstractC7316m.m13689n(abstractC7311hM13686k, this);
    }

    @Override // k2.h2
    public Object getValue() {
        return Float.valueOf(m8490f());
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: h */
    public final u2.a0 mo8492h(u2.a0 a0Var, u2.a0 a0Var2, u2.a0 a0Var3) {
        if (((z1) a0Var2).f20637c == ((z1) a0Var3).f20637c) {
            return a0Var2;
        }
        return null;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: j */
    public final void mo8493j(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f20345b = (z1) a0Var;
    }

    @Override // k2.w0
    public void setValue(Object obj) {
        m8491g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((z1) AbstractC7316m.m13684i(this.f20345b)).f20637c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(m8490f());
    }
}
