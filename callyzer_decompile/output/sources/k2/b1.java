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
public final class b1 extends AbstractC7329z implements Parcelable, InterfaceC7318o, w0, h2 {
    public static final Parcelable.Creator<b1> CREATOR = new z0(1);

    /* renamed from: b */
    public a2 f20355b;

    public b1(int i10) {
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        a2 a2Var = new a2(i10, abstractC7311hM13686k.mo13652g());
        if (!(abstractC7311hM13686k instanceof C7306c)) {
            a2Var.f34839b = new a2(i10, 1);
        }
        this.f20355b = a2Var;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: b */
    public final u2.a0 mo8488b() {
        return this.f20355b;
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
    public final int m8526f() {
        return ((a2) AbstractC7316m.m13695t(this.f20355b, this)).f20346c;
    }

    /* renamed from: g */
    public final void m8527g(int i10) {
        AbstractC7311h abstractC7311hM13686k;
        a2 a2Var = (a2) AbstractC7316m.m13684i(this.f20355b);
        if (a2Var.f20346c != i10) {
            a2 a2Var2 = this.f20355b;
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                ((a2) AbstractC7316m.m13690o(a2Var2, this, abstractC7311hM13686k, a2Var)).f20346c = i10;
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        }
    }

    @Override // k2.h2
    public Object getValue() {
        return Integer.valueOf(m8526f());
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: h */
    public final u2.a0 mo8492h(u2.a0 a0Var, u2.a0 a0Var2, u2.a0 a0Var3) {
        if (((a2) a0Var2).f20346c == ((a2) a0Var3).f20346c) {
            return a0Var2;
        }
        return null;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: j */
    public final void mo8493j(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f20355b = (a2) a0Var;
    }

    @Override // k2.w0
    public void setValue(Object obj) {
        m8527g(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((a2) AbstractC7316m.m13684i(this.f20355b)).f20346c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(m8526f());
    }
}
