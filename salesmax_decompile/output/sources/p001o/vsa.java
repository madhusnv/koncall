package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class vsa {

    /* renamed from: a */
    public final List f50825a;

    /* renamed from: b */
    public final List f50826b;

    /* renamed from: c */
    public final List f50827c;

    public vsa(List list) {
        this.f50827c = list;
        this.f50825a = new ArrayList(list.size());
        this.f50826b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f50825a.add(((usa) list.get(i)).m52008b().mo24960a());
            this.f50826b.add(((usa) list.get(i)).m52009c().mo24960a());
        }
    }

    /* renamed from: a */
    public List m53381a() {
        return this.f50825a;
    }

    /* renamed from: b */
    public List m53382b() {
        return this.f50827c;
    }

    /* renamed from: c */
    public List m53383c() {
        return this.f50826b;
    }
}
