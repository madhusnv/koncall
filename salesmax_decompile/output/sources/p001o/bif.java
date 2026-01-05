package p001o;

import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public final class bif extends tjg {

    /* renamed from: b */
    public final Fragment f16400b;

    /* renamed from: c */
    public final int f16401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bif(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(fragment2, "targetFragment");
        this.f16400b = fragment2;
        this.f16401c = i;
    }
}
