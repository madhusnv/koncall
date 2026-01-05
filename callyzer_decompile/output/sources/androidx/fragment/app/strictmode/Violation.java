package androidx.fragment.app.strictmode;

import androidx.fragment.app.j0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: a */
    public final j0 f2699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(j0 fragment, String str) {
        super(str);
        AbstractC4154l.m8923f(fragment, "fragment");
        this.f2699a = fragment;
    }
}
