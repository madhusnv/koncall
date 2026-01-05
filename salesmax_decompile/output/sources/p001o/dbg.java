package p001o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes6.dex */
public class dbg implements l68 {

    /* renamed from: a */
    public volatile boolean f19542a = false;

    /* renamed from: b */
    public final Map f19543b = new ConcurrentHashMap();

    /* renamed from: c */
    public final LinkedBlockingQueue f19544c = new LinkedBlockingQueue();

    @Override // p001o.l68
    /* renamed from: a */
    public synchronized vja mo22758a(String str) {
        cbg cbgVar;
        cbgVar = (cbg) this.f19543b.get(str);
        if (cbgVar == null) {
            cbgVar = new cbg(str, this.f19544c, this.f19542a);
            this.f19543b.put(str, cbgVar);
        }
        return cbgVar;
    }

    /* renamed from: b */
    public void m22759b() {
        this.f19543b.clear();
        this.f19544c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue m22760c() {
        return this.f19544c;
    }

    /* renamed from: d */
    public List m22761d() {
        return new ArrayList(this.f19543b.values());
    }

    /* renamed from: e */
    public void m22762e() {
        this.f19542a = true;
    }
}
