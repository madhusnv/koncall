package p001o;

/* loaded from: classes6.dex */
public class oqi {

    /* renamed from: a */
    public StringBuffer f38738a;

    /* renamed from: b */
    public int f38739b;

    /* renamed from: c */
    public int f38740c;

    /* renamed from: d */
    public boolean f38741d;

    public oqi() {
        this.f38738a = new StringBuffer();
    }

    /* renamed from: a */
    public void m42547a(byte b) {
        if (b >= 0) {
            if (this.f38739b <= 0) {
                this.f38738a.append((char) (b & 127));
                return;
            }
            this.f38738a.append('?');
            this.f38739b = 0;
            this.f38740c = 0;
            return;
        }
        int i = this.f38739b;
        if (i != 0) {
            if ((b & 192) == 192) {
                this.f38738a.append('?');
                this.f38739b = 0;
                this.f38740c = 0;
                this.f38741d = true;
                return;
            }
            int i2 = (b & 63) | (this.f38740c << 6);
            this.f38740c = i2;
            int i3 = i - 1;
            this.f38739b = i3;
            if (i3 == 0) {
                this.f38738a.append((char) i2);
                return;
            }
            return;
        }
        if ((b & 192) != 192) {
            this.f38738a.append('?');
            this.f38739b = 0;
            this.f38740c = 0;
            return;
        }
        if ((b & 224) == 192) {
            this.f38739b = 1;
            this.f38740c = b & 31;
            return;
        }
        if ((b & 240) == 224) {
            this.f38739b = 2;
            this.f38740c = b & 15;
            return;
        }
        if ((b & 248) == 240) {
            this.f38739b = 3;
            this.f38740c = b & 7;
        } else if ((b & 252) == 248) {
            this.f38739b = 4;
            this.f38740c = b & 3;
        } else if ((b & 254) == 252) {
            this.f38739b = 5;
            this.f38740c = b & 1;
        }
    }

    /* renamed from: b */
    public void m42548b(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            m42547a(bArr[i]);
            i++;
        }
    }

    /* renamed from: c */
    public StringBuffer m42549c() {
        return this.f38738a;
    }

    /* renamed from: d */
    public int m42550d() {
        return this.f38738a.length();
    }

    /* renamed from: e */
    public void m42551e() {
        this.f38738a.setLength(0);
        this.f38739b = 0;
        this.f38740c = 0;
        this.f38741d = false;
    }

    public String toString() {
        return this.f38738a.toString();
    }

    public oqi(int i) {
        this.f38738a = new StringBuffer(i);
    }
}
