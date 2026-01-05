package p001o;

import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public abstract class o0j extends RuntimeException {

    /* renamed from: a */
    public final Fragment f37516a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0j(Fragment fragment, String str) {
        super(str);
        sq8.m48649h(fragment, "fragment");
        this.f37516a = fragment;
    }

    /* renamed from: a */
    public final Fragment m41342a() {
        return this.f37516a;
    }
}
