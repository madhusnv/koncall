package c5;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c5.d */
/* loaded from: classes.dex */
public final class C0866d extends AbstractC0864b {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // c5.AbstractC0864b, c5.AbstractC0865c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0866d) || Objects.equals(m2327b(), ((C0866d) obj).m2327b())) {
            return super.equals(obj);
        }
        return false;
    }
}
