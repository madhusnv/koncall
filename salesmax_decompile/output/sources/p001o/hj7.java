package p001o;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;

/* loaded from: classes2.dex */
public abstract class hj7 {

    /* renamed from: o.hj7$a */
    public static final class C13981a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f27048a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13981a(Fragment fragment) {
            super(0);
            this.f27048a = fragment;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0.InterfaceC2131c invoke() {
            return this.f27048a.getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: b */
    public static final gi9 m30656b(Fragment fragment, ob9 ob9Var, uk7 uk7Var, uk7 uk7Var2, uk7 uk7Var3) {
        if (uk7Var3 == null) {
            uk7Var3 = new C13981a(fragment);
        }
        return new a0(ob9Var, uk7Var, uk7Var3, uk7Var2);
    }

    /* renamed from: c */
    public static final lxi m30657c(gi9 gi9Var) {
        return (lxi) gi9Var.getValue();
    }
}
