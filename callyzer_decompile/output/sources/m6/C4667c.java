package m6;

import al.C0174b;
import android.graphics.Rect;
import d6.C1617g;
import java.util.Comparator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m6.c */
/* loaded from: classes.dex */
public final class C4667c implements Comparator {

    /* renamed from: a */
    public final Rect f23078a = new Rect();

    /* renamed from: b */
    public final Rect f23079b = new Rect();

    /* renamed from: c */
    public final boolean f23080c;

    /* renamed from: d */
    public final C0174b f23081d;

    public C4667c(boolean z6, C0174b c0174b) {
        this.f23080c = z6;
        this.f23081d = c0174b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f23081d.getClass();
        Rect rect = this.f23078a;
        ((C1617g) obj).m5287f(rect);
        Rect rect2 = this.f23079b;
        ((C1617g) obj2).m5287f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z6 = this.f23080c;
        if (i12 < i13) {
            return z6 ? 1 : -1;
        }
        if (i12 > i13) {
            return z6 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z6 ? 1 : -1;
        }
        if (i16 > i17) {
            return z6 ? -1 : 1;
        }
        return 0;
    }
}
