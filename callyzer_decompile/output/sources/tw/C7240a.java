package tw;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tw.a */
/* loaded from: classes3.dex */
public final class C7240a implements Comparator {

    /* renamed from: b */
    public static final C7240a f34590b = new C7240a(0);

    /* renamed from: c */
    public static final C7240a f34591c = new C7240a(1);

    /* renamed from: a */
    public final /* synthetic */ int f34592a;

    public /* synthetic */ C7240a(int i10) {
        this.f34592a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f34592a) {
            case 0:
                Comparable a10 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                AbstractC4154l.m8923f(a10, "a");
                AbstractC4154l.m8923f(b10, "b");
                return a10.compareTo(b10);
            default:
                Comparable a11 = (Comparable) obj;
                Comparable b11 = (Comparable) obj2;
                AbstractC4154l.m8923f(a11, "a");
                AbstractC4154l.m8923f(b11, "b");
                return b11.compareTo(a11);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f34592a) {
            case 0:
                return f34591c;
            default:
                return f34590b;
        }
    }
}
