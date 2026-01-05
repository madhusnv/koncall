package p001o;

import android.graphics.Bitmap;
import p001o.is7;

/* loaded from: classes5.dex */
public final class hs7 implements is7.InterfaceC14363a {

    /* renamed from: a */
    public final mi1 f27432a;

    /* renamed from: b */
    public final wo0 f27433b;

    public hs7(mi1 mi1Var, wo0 wo0Var) {
        this.f27432a = mi1Var;
        this.f27433b = wo0Var;
    }

    @Override // p001o.is7.InterfaceC14363a
    /* renamed from: a */
    public void mo31044a(Bitmap bitmap) {
        this.f27432a.mo38104c(bitmap);
    }

    @Override // p001o.is7.InterfaceC14363a
    /* renamed from: b */
    public byte[] mo31045b(int i) {
        wo0 wo0Var = this.f27433b;
        return wo0Var == null ? new byte[i] : (byte[]) wo0Var.mo46964c(i, byte[].class);
    }

    @Override // p001o.is7.InterfaceC14363a
    /* renamed from: c */
    public Bitmap mo31046c(int i, int i2, Bitmap.Config config) {
        return this.f27432a.mo39090e(i, i2, config);
    }

    @Override // p001o.is7.InterfaceC14363a
    /* renamed from: d */
    public int[] mo31047d(int i) {
        wo0 wo0Var = this.f27433b;
        return wo0Var == null ? new int[i] : (int[]) wo0Var.mo46964c(i, int[].class);
    }

    @Override // p001o.is7.InterfaceC14363a
    /* renamed from: e */
    public void mo31048e(byte[] bArr) {
        wo0 wo0Var = this.f27433b;
        if (wo0Var == null) {
            return;
        }
        wo0Var.mo46966e(bArr);
    }

    @Override // p001o.is7.InterfaceC14363a
    /* renamed from: f */
    public void mo31049f(int[] iArr) {
        wo0 wo0Var = this.f27433b;
        if (wo0Var == null) {
            return;
        }
        wo0Var.mo46966e(iArr);
    }
}
