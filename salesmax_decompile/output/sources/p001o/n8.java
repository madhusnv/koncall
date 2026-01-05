package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public abstract class n8 extends z8 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m40233e((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m40233e(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        return mo21592j(entry);
    }

    /* renamed from: j */
    public abstract boolean mo21592j(Map.Entry entry);

    /* renamed from: o */
    public abstract /* bridge */ boolean mo21593o(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo21593o((Map.Entry) obj);
        }
        return false;
    }
}
