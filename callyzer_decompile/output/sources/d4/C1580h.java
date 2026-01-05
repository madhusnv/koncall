package d4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.h */
/* loaded from: classes.dex */
public final class C1580h {

    /* renamed from: a */
    public final int f7837a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1580h) {
            return this.f7837a == ((C1580h) obj).f7837a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7837a);
    }

    public final String toString() {
        int i10 = this.f7837a;
        return i10 == 0 ? "Button" : i10 == 1 ? "Checkbox" : i10 == 2 ? "Switch" : i10 == 3 ? "RadioButton" : i10 == 4 ? "Tab" : i10 == 5 ? "Image" : i10 == 6 ? "DropdownList" : i10 == 7 ? "Picker" : i10 == 8 ? "Carousel" : "Unknown";
    }
}
