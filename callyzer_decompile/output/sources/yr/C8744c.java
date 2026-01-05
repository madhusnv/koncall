package yr;

import im.EnumC3313o;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.c */
/* loaded from: classes3.dex */
public final class C8744c extends AbstractC8761t {

    /* renamed from: a */
    public final EnumC3313o f42354a;

    public C8744c(EnumC3313o selectedOption) {
        AbstractC4154l.m8923f(selectedOption, "selectedOption");
        this.f42354a = selectedOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8744c) && this.f42354a == ((C8744c) obj).f42354a;
    }

    public final int hashCode() {
        return this.f42354a.hashCode();
    }

    public final String toString() {
        return "ChangeAssignEmployeeEmployee(selectedOption=" + this.f42354a + ")";
    }
}
