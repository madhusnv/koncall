package rv;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import sv.C6954b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a */
    public final q0 f31836a;

    /* renamed from: b */
    public final C6954b f31837b;

    /* renamed from: c */
    public final boolean f31838c;

    /* renamed from: d */
    public final C6361k f31839d;

    public h0(q0 actionMode, C6954b c6954b, boolean z6, C6361k c6361k) {
        AbstractC4154l.m8923f(actionMode, "actionMode");
        this.f31836a = actionMode;
        this.f31837b = c6954b;
        this.f31838c = z6;
        this.f31839d = c6361k;
    }

    /* renamed from: a */
    public static h0 m12673a(h0 h0Var, q0 actionMode, C6954b registrationState, boolean z6, C6361k c6361k, int i10) {
        if ((i10 & 1) != 0) {
            actionMode = h0Var.f31836a;
        }
        if ((i10 & 2) != 0) {
            registrationState = h0Var.f31837b;
        }
        if ((i10 & 4) != 0) {
            z6 = h0Var.f31838c;
        }
        if ((i10 & 8) != 0) {
            c6361k = h0Var.f31839d;
        }
        h0Var.getClass();
        AbstractC4154l.m8923f(actionMode, "actionMode");
        AbstractC4154l.m8923f(registrationState, "registrationState");
        return new h0(actionMode, registrationState, z6, c6361k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f31836a == h0Var.f31836a && AbstractC4154l.m8918a(this.f31837b, h0Var.f31837b) && this.f31838c == h0Var.f31838c && AbstractC4154l.m8918a(this.f31839d, h0Var.f31839d);
    }

    public final int hashCode() {
        return this.f31839d.hashCode() + AbstractC1452a.m4558e((this.f31837b.hashCode() + (this.f31836a.hashCode() * 31)) * 31, 31, this.f31838c);
    }

    public final String toString() {
        return "State(actionMode=" + this.f31836a + ", registrationState=" + this.f31837b + ", isNetWorkConnected=" + this.f31838c + ", connectedSimDetails=" + this.f31839d + ")";
    }
}
