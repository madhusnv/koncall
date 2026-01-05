package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.b92;

/* loaded from: classes2.dex */
public class o42 implements b92 {

    /* renamed from: a */
    public final z92 f37711a;

    /* renamed from: f */
    public int f37716f = 0;

    /* renamed from: c */
    public final Map f37713c = new HashMap();

    /* renamed from: e */
    public Set f37715e = new HashSet();

    /* renamed from: b */
    public final List f37712b = new ArrayList();

    /* renamed from: d */
    public List f37714d = new ArrayList();

    public o42(z92 z92Var) {
        this.f37711a = z92Var;
        m41511e();
    }

    @Override // p001o.b92
    /* renamed from: a */
    public void mo18285a(b92.InterfaceC12302a interfaceC12302a) {
        this.f37712b.add(interfaceC12302a);
    }

    @Override // p001o.b92
    /* renamed from: b */
    public String mo18286b(String str) {
        if (!this.f37713c.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) this.f37713c.get(str)) {
            Iterator it = this.f37714d.iterator();
            while (it.hasNext()) {
                if (str2.equals(k52.m35006a((t92) it.next()).m35007b())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // p001o.b92
    /* renamed from: c */
    public int mo18287c() {
        return this.f37716f;
    }

    @Override // p001o.b92
    /* renamed from: d */
    public void mo18288d(int i) {
        if (i != this.f37716f) {
            Iterator it = this.f37712b.iterator();
            while (it.hasNext()) {
                ((b92.InterfaceC12302a) it.next()).mo18289a(this.f37716f, i);
            }
        }
        if (this.f37716f == 2 && i != 2) {
            this.f37714d.clear();
        }
        this.f37716f = i;
    }

    /* renamed from: e */
    public final void m41511e() {
        Set hashSet = new HashSet();
        try {
            hashSet = this.f37711a.m58954e();
        } catch (h72 unused) {
            wja.m54629c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                } catch (li8 unused2) {
                    wja.m54627a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
                boolean z = s92.m48031a(this.f37711a, str) && s92.m48031a(this.f37711a, str2);
                if (z) {
                    this.f37715e.add(new HashSet(Arrays.asList(str, str2)));
                    if (!this.f37713c.containsKey(str)) {
                        this.f37713c.put(str, new ArrayList());
                    }
                    if (!this.f37713c.containsKey(str2)) {
                        this.f37713c.put(str2, new ArrayList());
                    }
                    ((List) this.f37713c.get(str)).add((String) arrayList.get(1));
                    ((List) this.f37713c.get(str2)).add((String) arrayList.get(0));
                }
            }
        }
    }
}
