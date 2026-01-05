package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class we5 implements dka {

    /* renamed from: a */
    public vja f51844a;

    /* renamed from: b */
    public wba f51845b;

    /* renamed from: c */
    public String f51846c;

    /* renamed from: d */
    public List f51847d;

    /* renamed from: e */
    public List f51848e;

    /* renamed from: f */
    public List f51849f;

    /* renamed from: g */
    public Throwable f51850g;

    /* renamed from: h */
    public String f51851h;

    public we5(wba wbaVar, vja vjaVar) {
        this.f51844a = vjaVar;
        this.f51845b = wbaVar;
    }

    @Override // p001o.dka
    /* renamed from: a */
    public Object[] mo23362a() {
        List list = this.f51848e;
        if (list == null) {
            return null;
        }
        return list.toArray();
    }

    @Override // p001o.dka
    /* renamed from: b */
    public List mo23363b() {
        return this.f51847d;
    }

    @Override // p001o.dka
    /* renamed from: c */
    public List mo23364c() {
        return this.f51849f;
    }

    @Override // p001o.dka
    /* renamed from: d */
    public String mo23365d() {
        return this.f51851h;
    }

    @Override // p001o.dka
    /* renamed from: e */
    public wba mo23366e() {
        return this.f51845b;
    }

    @Override // p001o.dka
    /* renamed from: f */
    public Throwable mo23367f() {
        return this.f51850g;
    }

    /* renamed from: g */
    public void m54257g(String str, Object obj) {
        m54258h().add(new nd9(str, obj));
    }

    @Override // p001o.dka
    public String getMessage() {
        return this.f51846c;
    }

    /* renamed from: h */
    public final List m54258h() {
        if (this.f51849f == null) {
            this.f51849f = new ArrayList(4);
        }
        return this.f51849f;
    }

    /* renamed from: i */
    public void m54259i(String str) {
        this.f51851h = str;
    }

    /* renamed from: j */
    public void m54260j(String str) {
        this.f51846c = str;
    }

    /* renamed from: k */
    public void m54261k(Throwable th) {
        this.f51850g = th;
    }
}
