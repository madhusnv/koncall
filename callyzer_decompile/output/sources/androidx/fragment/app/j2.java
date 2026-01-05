package androidx.fragment.app;

import android.view.View;
import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j2 {
    /* renamed from: a */
    public static l2 m1202a(View view) {
        AbstractC4154l.m8923f(view, "<this>");
        return (view.getAlpha() == DefinitionKt.NO_Float_VALUE && view.getVisibility() == 0) ? l2.INVISIBLE : m1203b(view.getVisibility());
    }

    /* renamed from: b */
    public static l2 m1203b(int i10) {
        if (i10 == 0) {
            return l2.VISIBLE;
        }
        if (i10 == 4) {
            return l2.INVISIBLE;
        }
        if (i10 == 8) {
            return l2.GONE;
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Unknown visibility "));
    }
}
