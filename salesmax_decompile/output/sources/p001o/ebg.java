package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class ebg implements dka {

    /* renamed from: a */
    public wba f21330a;

    /* renamed from: b */
    public List f21331b;

    /* renamed from: c */
    public String f21332c;

    /* renamed from: d */
    public cbg f21333d;

    /* renamed from: e */
    public String f21334e;

    /* renamed from: f */
    public String f21335f;

    /* renamed from: g */
    public Object[] f21336g;

    /* renamed from: h */
    public List f21337h;

    /* renamed from: i */
    public long f21338i;

    /* renamed from: j */
    public Throwable f21339j;

    @Override // p001o.dka
    /* renamed from: a */
    public Object[] mo23362a() {
        return this.f21336g;
    }

    @Override // p001o.dka
    /* renamed from: b */
    public List mo23363b() {
        return this.f21331b;
    }

    @Override // p001o.dka
    /* renamed from: c */
    public List mo23364c() {
        return this.f21337h;
    }

    @Override // p001o.dka
    /* renamed from: e */
    public wba mo23366e() {
        return this.f21330a;
    }

    @Override // p001o.dka
    /* renamed from: f */
    public Throwable mo23367f() {
        return this.f21339j;
    }

    /* renamed from: g */
    public void m24731g(osa osaVar) {
        if (osaVar == null) {
            return;
        }
        if (this.f21331b == null) {
            this.f21331b = new ArrayList(2);
        }
        this.f21331b.add(osaVar);
    }

    @Override // p001o.dka
    public String getMessage() {
        return this.f21335f;
    }

    /* renamed from: h */
    public cbg m24732h() {
        return this.f21333d;
    }

    /* renamed from: i */
    public void m24733i(Object[] objArr) {
        this.f21336g = objArr;
    }

    /* renamed from: j */
    public void m24734j(wba wbaVar) {
        this.f21330a = wbaVar;
    }

    /* renamed from: k */
    public void m24735k(cbg cbgVar) {
        this.f21333d = cbgVar;
    }

    /* renamed from: l */
    public void m24736l(String str) {
        this.f21332c = str;
    }

    /* renamed from: m */
    public void m24737m(String str) {
        this.f21335f = str;
    }

    /* renamed from: n */
    public void m24738n(String str) {
        this.f21334e = str;
    }

    /* renamed from: o */
    public void m24739o(Throwable th) {
        this.f21339j = th;
    }

    /* renamed from: p */
    public void m24740p(long j) {
        this.f21338i = j;
    }
}
