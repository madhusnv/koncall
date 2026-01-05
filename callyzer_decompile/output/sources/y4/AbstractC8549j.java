package y4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y4.j */
/* loaded from: classes.dex */
public abstract class AbstractC8549j {

    /* renamed from: a */
    public final Object f41509a;

    public AbstractC8549j(Object obj) {
        this.f41509a = obj;
        new LinkedHashMap();
    }

    /* renamed from: a */
    public Object mo15809a() {
        return this.f41509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8549j) && AbstractC4154l.m8918a(mo15809a(), ((AbstractC8549j) obj).mo15809a());
    }

    public final int hashCode() {
        return mo15809a().hashCode();
    }
}
