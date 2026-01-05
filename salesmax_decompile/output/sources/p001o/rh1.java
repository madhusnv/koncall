package p001o;

/* loaded from: classes6.dex */
public final class rh1 extends zqh {

    /* renamed from: c */
    public final short f43607c;

    /* renamed from: d */
    public final short f43608d;

    public rh1(zqh zqhVar, int i, int i2) {
        super(zqhVar);
        this.f43607c = (short) i;
        this.f43608d = (short) i2;
    }

    @Override // p001o.zqh
    /* renamed from: c */
    public void mo46741c(xh1 xh1Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f43608d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                xh1Var.m56302c(31, 5);
                short s2 = this.f43608d;
                if (s2 > 62) {
                    xh1Var.m56302c(s2 - 31, 16);
                } else if (i == 0) {
                    xh1Var.m56302c(Math.min((int) s2, 31), 5);
                } else {
                    xh1Var.m56302c(s2 - 31, 5);
                }
            }
            xh1Var.m56302c(bArr[this.f43607c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f43607c);
        sb.append("::");
        sb.append((this.f43607c + this.f43608d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
