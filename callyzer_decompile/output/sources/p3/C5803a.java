package p3;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.a */
/* loaded from: classes.dex */
public final class C5803a implements InterfaceC5816n {

    /* renamed from: b */
    public final int f28408b;

    public C5803a(int i10) {
        this.f28408b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5803a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f28408b == ((C5803a) obj).f28408b;
    }

    public final int hashCode() {
        return this.f28408b;
    }

    public final String toString() {
        return AbstractC1452a.m4563j(new StringBuilder("AndroidPointerIcon(type="), this.f28408b, ')');
    }
}
