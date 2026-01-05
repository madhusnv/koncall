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
public final class e1 extends AbstractC7329z implements Parcelable, InterfaceC7318o {
    public static final Parcelable.Creator<e1> CREATOR = new d1();

    /* renamed from: b */
    public final d2 f20372b;

    /* renamed from: c */
    public c2 f20373c;

    public e1(Object obj, d2 d2Var) {
        this.f20372b = d2Var;
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        c2 c2Var = new c2(abstractC7311hM13686k.mo13652g(), obj);
        if (!(abstractC7311hM13686k instanceof C7306c)) {
            c2Var.f34839b = new c2(1, obj);
        }
        this.f20373c = c2Var;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: b */
    public final u2.a0 mo8488b() {
        return this.f20373c;
    }

    @Override // u2.InterfaceC7318o
    /* renamed from: c */
    public final d2 mo8489c() {
        return this.f20372b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // k2.h2
    public final Object getValue() {
        return ((c2) AbstractC7316m.m13695t(this.f20373c, this)).f20361c;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: h */
    public final u2.a0 mo8492h(u2.a0 a0Var, u2.a0 a0Var2, u2.a0 a0Var3) {
        if (this.f20372b.mo8534a(((c2) a0Var2).f20361c, ((c2) a0Var3).f20361c)) {
            return a0Var2;
        }
        return null;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: j */
    public final void mo8493j(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f20373c = (c2) a0Var;
    }

    @Override // k2.w0
    public final void setValue(Object obj) {
        AbstractC7311h abstractC7311hM13686k;
        c2 c2Var = (c2) AbstractC7316m.m13684i(this.f20373c);
        if (this.f20372b.mo8534a(c2Var.f20361c, obj)) {
            return;
        }
        c2 c2Var2 = this.f20373c;
        synchronized (AbstractC7316m.f34890b) {
            abstractC7311hM13686k = AbstractC7316m.m13686k();
            ((c2) AbstractC7316m.m13690o(c2Var2, this, abstractC7311hM13686k, c2Var)).f20361c = obj;
        }
        AbstractC7316m.m13689n(abstractC7311hM13686k, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((c2) AbstractC7316m.m13684i(this.f20373c)).f20361c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        s0 s0Var = s0.f20544c;
        d2 d2Var = this.f20372b;
        if (AbstractC4154l.m8918a(d2Var, s0Var)) {
            i11 = 0;
        } else if (AbstractC4154l.m8918a(d2Var, s0.f20547f)) {
            i11 = 1;
        } else {
            if (!AbstractC4154l.m8918a(d2Var, s0.f20545d)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
