package p001o;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class sb1 implements tg0 {

    /* renamed from: a */
    public final List f45105a;

    public sb1(List list) {
        this.f45105a = list;
    }

    @Override // p001o.tg0
    /* renamed from: b */
    public List mo24961b() {
        return this.f45105a;
    }

    @Override // p001o.tg0
    /* renamed from: c */
    public boolean mo24962c() {
        if (this.f45105a.isEmpty()) {
            return true;
        }
        return this.f45105a.size() == 1 && ((sd9) this.f45105a.get(0)).m48227h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f45105a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f45105a.toArray()));
        }
        return sb.toString();
    }
}
