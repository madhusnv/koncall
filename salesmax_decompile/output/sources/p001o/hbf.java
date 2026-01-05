package p001o;

import com.google.firebase.messaging.Constants;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class hbf {

    /* renamed from: h */
    public static final C13905a f26586h = new C13905a(null);

    /* renamed from: a */
    public final byte[] f26587a;

    /* renamed from: b */
    public int f26588b;

    /* renamed from: c */
    public int f26589c;

    /* renamed from: d */
    public boolean f26590d;

    /* renamed from: e */
    public boolean f26591e;

    /* renamed from: f */
    public hbf f26592f;

    /* renamed from: g */
    public hbf f26593g;

    /* renamed from: o.hbf$a */
    public static final class C13905a {
        public C13905a() {
        }

        public /* synthetic */ C13905a(id5 id5Var) {
            this();
        }
    }

    public hbf() {
        this.f26587a = new byte[8192];
        this.f26591e = true;
        this.f26590d = false;
    }

    /* renamed from: a */
    public final void m30153a() {
        hbf hbfVar = this.f26593g;
        int i = 0;
        if (!(hbfVar != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        sq8.m48646e(hbfVar);
        if (hbfVar.f26591e) {
            int i2 = this.f26589c - this.f26588b;
            hbf hbfVar2 = this.f26593g;
            sq8.m48646e(hbfVar2);
            int i3 = 8192 - hbfVar2.f26589c;
            hbf hbfVar3 = this.f26593g;
            sq8.m48646e(hbfVar3);
            if (!hbfVar3.f26590d) {
                hbf hbfVar4 = this.f26593g;
                sq8.m48646e(hbfVar4);
                i = hbfVar4.f26588b;
            }
            if (i2 > i3 + i) {
                return;
            }
            hbf hbfVar5 = this.f26593g;
            sq8.m48646e(hbfVar5);
            m30159g(hbfVar5, i2);
            m30154b();
            lbf.m36864b(this);
        }
    }

    /* renamed from: b */
    public final hbf m30154b() {
        hbf hbfVar = this.f26592f;
        if (hbfVar == this) {
            hbfVar = null;
        }
        hbf hbfVar2 = this.f26593g;
        sq8.m48646e(hbfVar2);
        hbfVar2.f26592f = this.f26592f;
        hbf hbfVar3 = this.f26592f;
        sq8.m48646e(hbfVar3);
        hbfVar3.f26593g = this.f26593g;
        this.f26592f = null;
        this.f26593g = null;
        return hbfVar;
    }

    /* renamed from: c */
    public final hbf m30155c(hbf hbfVar) {
        sq8.m48649h(hbfVar, "segment");
        hbfVar.f26593g = this;
        hbfVar.f26592f = this.f26592f;
        hbf hbfVar2 = this.f26592f;
        sq8.m48646e(hbfVar2);
        hbfVar2.f26593g = hbfVar;
        this.f26592f = hbfVar;
        return hbfVar;
    }

    /* renamed from: d */
    public final hbf m30156d() {
        this.f26590d = true;
        return new hbf(this.f26587a, this.f26588b, this.f26589c, true, false);
    }

    /* renamed from: e */
    public final hbf m30157e(int i) {
        hbf hbfVarM36865c;
        if (!(i > 0 && i <= this.f26589c - this.f26588b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i >= 1024) {
            hbfVarM36865c = m30156d();
        } else {
            hbfVarM36865c = lbf.m36865c();
            byte[] bArr = this.f26587a;
            byte[] bArr2 = hbfVarM36865c.f26587a;
            int i2 = this.f26588b;
            fp0.m27261j(bArr, bArr2, 0, i2, i2 + i, 2, null);
        }
        hbfVarM36865c.f26589c = hbfVarM36865c.f26588b + i;
        this.f26588b += i;
        hbf hbfVar = this.f26593g;
        sq8.m48646e(hbfVar);
        hbfVar.m30155c(hbfVarM36865c);
        return hbfVarM36865c;
    }

    /* renamed from: f */
    public final hbf m30158f() {
        byte[] bArr = this.f26587a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        sq8.m48648g(bArrCopyOf, "copyOf(...)");
        return new hbf(bArrCopyOf, this.f26588b, this.f26589c, false, true);
    }

    /* renamed from: g */
    public final void m30159g(hbf hbfVar, int i) {
        sq8.m48649h(hbfVar, "sink");
        if (!hbfVar.f26591e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = hbfVar.f26589c;
        if (i2 + i > 8192) {
            if (hbfVar.f26590d) {
                throw new IllegalArgumentException();
            }
            int i3 = hbfVar.f26588b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = hbfVar.f26587a;
            fp0.m27261j(bArr, bArr, 0, i3, i2, 2, null);
            hbfVar.f26589c -= hbfVar.f26588b;
            hbfVar.f26588b = 0;
        }
        byte[] bArr2 = this.f26587a;
        byte[] bArr3 = hbfVar.f26587a;
        int i4 = hbfVar.f26589c;
        int i5 = this.f26588b;
        fp0.m27256e(bArr2, bArr3, i4, i5, i5 + i);
        hbfVar.f26589c += i;
        this.f26588b += i;
    }

    public hbf(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f26587a = bArr;
        this.f26588b = i;
        this.f26589c = i2;
        this.f26590d = z;
        this.f26591e = z2;
    }
}
