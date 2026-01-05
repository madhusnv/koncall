package p001o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class f8 extends l8 implements zea {
    public f8(Map map) {
        super(map);
    }

    @Override // p001o.l8
    /* renamed from: E */
    public Collection mo26261E(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // p001o.l8
    /* renamed from: F */
    public Collection mo26262F(Object obj, Collection collection) {
        return m36683G(obj, (List) collection, null);
    }

    @Override // p001o.l8, p001o.lob
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // p001o.v8, p001o.lob
    /* renamed from: a */
    public Map mo26264a() {
        return super.mo26264a();
    }

    @Override // p001o.v8
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p001o.l8, p001o.lob
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }
}
