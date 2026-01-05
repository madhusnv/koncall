package p001o;

/* loaded from: classes6.dex */
public class c76 extends v48 {

    /* renamed from: o */
    public String f17449o;

    public c76(String str) {
        this.f17449o = str;
    }

    @Override // p001o.v48
    /* renamed from: b */
    public void mo20364b(cob cobVar) {
        int i = this.f49858j;
        if (i == this.f49859k) {
            return;
        }
        o8i.m41779k(s8g.m47998e(this.f49850b, i + 1, (r1 - i) - 1, this.f17449o), cobVar, this.f17449o);
    }

    @Override // p001o.v48
    /* renamed from: c */
    public void mo20365c(cob cobVar, String str) {
        int i = this.f49858j;
        if (i == this.f49859k) {
            return;
        }
        if (str == null) {
            str = this.f17449o;
        }
        o8i.m41779k(s8g.m47998e(this.f49850b, i + 1, (r1 - i) - 1, str), cobVar, str);
    }

    @Override // p001o.v48
    /* renamed from: d */
    public String mo20366d() {
        int i = this.f49856h;
        int i2 = this.f49857i;
        if (i == i2) {
            return null;
        }
        return b1i.m18100c(this.f49850b, i, i2 - i);
    }

    @Override // p001o.v48
    /* renamed from: e */
    public String mo20367e() {
        int i = this.f49859k;
        if (i == this.f49860l) {
            return null;
        }
        return s8g.m47998e(this.f49850b, i + 1, (r1 - i) - 1, this.f17449o);
    }

    @Override // p001o.v48
    /* renamed from: f */
    public String mo20368f() {
        int i = this.f49854f;
        int i2 = this.f49855g;
        if (i == i2) {
            return null;
        }
        return s8g.m47998e(this.f49850b, i, i2 - i, this.f17449o);
    }

    @Override // p001o.v48
    /* renamed from: g */
    public String mo20369g() {
        int i = this.f49856h;
        int i2 = this.f49858j;
        if (i == i2) {
            return null;
        }
        return s8g.m47998e(this.f49850b, i, i2 - i, this.f17449o);
    }

    @Override // p001o.v48
    /* renamed from: h */
    public int mo20370h() {
        int i = this.f49855g;
        if (i == this.f49856h) {
            return -1;
        }
        return czh.m22142d(this.f49850b, i + 1, (r1 - i) - 1, 10);
    }

    @Override // p001o.v48
    /* renamed from: i */
    public String mo20371i() {
        int i = this.f49858j;
        if (i == this.f49859k) {
            return null;
        }
        return s8g.m47998e(this.f49850b, i + 1, (r1 - i) - 1, this.f17449o);
    }

    @Override // p001o.v48
    /* renamed from: j */
    public boolean mo20372j() {
        return this.f49859k > this.f49858j;
    }

    @Override // p001o.v48
    public String toString() {
        if (this.f49851c == null) {
            byte[] bArr = this.f49850b;
            int i = this.f49852d;
            this.f49851c = s8g.m47998e(bArr, i, this.f49860l - i, this.f17449o);
        }
        return this.f49851c;
    }
}
