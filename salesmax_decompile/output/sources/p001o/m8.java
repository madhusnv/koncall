package p001o;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class m8 extends z8 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m38510e((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m38510e(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
            return mo38511j(entry);
        }
        return false;
    }

    /* renamed from: j */
    public abstract boolean mo38511j(Map.Entry entry);

    /* renamed from: o */
    public final boolean m38512o(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
            return mo38513p(entry);
        }
        return false;
    }

    /* renamed from: p */
    public abstract boolean mo38513p(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return m38512o((Map.Entry) obj);
        }
        return false;
    }
}
