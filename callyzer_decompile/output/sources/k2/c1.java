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
public final class c1 extends AbstractC7329z implements Parcelable, InterfaceC7318o, w0, h2 {
    public static final Parcelable.Creator<c1> CREATOR = new z0(2);

    /* renamed from: b */
    public b2 f20360b;

    public c1(long j6) {
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        b2 b2Var = new b2(abstractC7311hM13686k.mo13652g(), j6);
        if (!(abstractC7311hM13686k instanceof C7306c)) {
            b2Var.f34839b = new b2(1, j6);
        }
        this.f20360b = b2Var;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: b */
    public final u2.a0 mo8488b() {
        return this.f20360b;
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
    public final long m8531f() {
        return ((b2) AbstractC7316m.m13695t(this.f20360b, this)).f20356c;
    }

    /* renamed from: g */
    public final void m8532g(long j6) {
        AbstractC7311h abstractC7311hM13686k;
        b2 b2Var = (b2) AbstractC7316m.m13684i(this.f20360b);
        if (b2Var.f20356c != j6) {
            b2 b2Var2 = this.f20360b;
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                ((b2) AbstractC7316m.m13690o(b2Var2, this, abstractC7311hM13686k, b2Var)).f20356c = j6;
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        }
    }

    @Override // k2.h2
    public Object getValue() {
        return Long.valueOf(m8531f());
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: h */
    public final u2.a0 mo8492h(u2.a0 a0Var, u2.a0 a0Var2, u2.a0 a0Var3) {
        if (((b2) a0Var2).f20356c == ((b2) a0Var3).f20356c) {
            return a0Var2;
        }
        return null;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: j */
    public final void mo8493j(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f20360b = (b2) a0Var;
    }

    @Override // k2.w0
    public void setValue(Object obj) {
        m8532g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((b2) AbstractC7316m.m13684i(this.f20360b)).f20356c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(m8531f());
    }
}
