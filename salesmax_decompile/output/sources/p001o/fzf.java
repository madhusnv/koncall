package p001o;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class fzf implements Comparable {

    /* renamed from: Y */
    public static int f24287Y = 1;

    /* renamed from: a */
    public boolean f24293a;

    /* renamed from: b */
    public String f24294b;

    /* renamed from: f */
    public float f24298f;

    /* renamed from: s */
    public EnumC13593a f24302s;

    /* renamed from: c */
    public int f24295c = -1;

    /* renamed from: d */
    public int f24296d = -1;

    /* renamed from: e */
    public int f24297e = 0;

    /* renamed from: g */
    public boolean f24299g = false;

    /* renamed from: h */
    public float[] f24300h = new float[9];

    /* renamed from: q */
    public float[] f24301q = new float[9];

    /* renamed from: x */
    public zo0[] f24303x = new zo0[16];

    /* renamed from: y */
    public int f24304y = 0;

    /* renamed from: H */
    public int f24288H = 0;

    /* renamed from: L */
    public boolean f24289L = false;

    /* renamed from: M */
    public int f24290M = -1;

    /* renamed from: Q */
    public float f24291Q = 0.0f;

    /* renamed from: X */
    public HashSet f24292X = null;

    /* renamed from: o.fzf$a */
    public enum EnumC13593a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public fzf(EnumC13593a enumC13593a, String str) {
        this.f24302s = enumC13593a;
    }

    /* renamed from: d */
    public static void m27820d() {
        f24287Y++;
    }

    /* renamed from: a */
    public final void m27821a(zo0 zo0Var) {
        int i = 0;
        while (true) {
            int i2 = this.f24304y;
            if (i >= i2) {
                zo0[] zo0VarArr = this.f24303x;
                if (i2 >= zo0VarArr.length) {
                    this.f24303x = (zo0[]) Arrays.copyOf(zo0VarArr, zo0VarArr.length * 2);
                }
                zo0[] zo0VarArr2 = this.f24303x;
                int i3 = this.f24304y;
                zo0VarArr2[i3] = zo0Var;
                this.f24304y = i3 + 1;
                return;
            }
            if (this.f24303x[i] == zo0Var) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(fzf fzfVar) {
        return this.f24295c - fzfVar.f24295c;
    }

    /* renamed from: e */
    public final void m27823e(zo0 zo0Var) {
        int i = this.f24304y;
        int i2 = 0;
        while (i2 < i) {
            if (this.f24303x[i2] == zo0Var) {
                while (i2 < i - 1) {
                    zo0[] zo0VarArr = this.f24303x;
                    int i3 = i2 + 1;
                    zo0VarArr[i2] = zo0VarArr[i3];
                    i2 = i3;
                }
                this.f24304y--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public void m27824g() {
        this.f24294b = null;
        this.f24302s = EnumC13593a.UNKNOWN;
        this.f24297e = 0;
        this.f24295c = -1;
        this.f24296d = -1;
        this.f24298f = 0.0f;
        this.f24299g = false;
        this.f24289L = false;
        this.f24290M = -1;
        this.f24291Q = 0.0f;
        int i = this.f24304y;
        for (int i2 = 0; i2 < i; i2++) {
            this.f24303x[i2] = null;
        }
        this.f24304y = 0;
        this.f24288H = 0;
        this.f24293a = false;
        Arrays.fill(this.f24301q, 0.0f);
    }

    /* renamed from: h */
    public void m27825h(sda sdaVar, float f) {
        this.f24298f = f;
        this.f24299g = true;
        this.f24289L = false;
        this.f24290M = -1;
        this.f24291Q = 0.0f;
        int i = this.f24304y;
        this.f24296d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f24303x[i2].m59637A(sdaVar, this, false);
        }
        this.f24304y = 0;
    }

    /* renamed from: j */
    public void m27826j(EnumC13593a enumC13593a, String str) {
        this.f24302s = enumC13593a;
    }

    /* renamed from: m */
    public final void m27827m(sda sdaVar, zo0 zo0Var) {
        int i = this.f24304y;
        for (int i2 = 0; i2 < i; i2++) {
            this.f24303x[i2].mo30638B(sdaVar, zo0Var, false);
        }
        this.f24304y = 0;
    }

    public String toString() {
        if (this.f24294b != null) {
            return "" + this.f24294b;
        }
        return "" + this.f24295c;
    }
}
