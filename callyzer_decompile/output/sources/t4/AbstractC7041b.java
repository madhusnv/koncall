package t4;

import com.skydoves.balloon.internals.DefinitionKt;
import e1.AbstractC1916r;
import e1.v0;
import f1.AbstractC2176a;
import s4.AbstractC6753i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t4.b */
/* loaded from: classes.dex */
public abstract class AbstractC7041b {

    /* renamed from: a */
    public static final float[] f34055a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b */
    public static volatile v0 f34056b = new v0(0);

    /* renamed from: c */
    public static final Object[] f34057c;

    static {
        Object[] objArr = new Object[0];
        f34057c = objArr;
        synchronized (objArr) {
            f34056b.m5648e((int) 115.0f, new C7042c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f34056b.m5648e((int) 130.0f, new C7042c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f34056b.m5648e((int) 150.0f, new C7042c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f34056b.m5648e((int) 180.0f, new C7042c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f34056b.m5648e((int) 200.0f, new C7042c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f34056b.m5647d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC6753i.m12939b("You should only apply non-linear scaling to font scales > 1");
    }

    /* renamed from: a */
    public static InterfaceC7040a m13326a(float f6) {
        float fM5647d;
        InterfaceC7040a c7042c;
        float[] fArr = f34055a;
        if (f6 < 1.03f) {
            return null;
        }
        int i10 = (int) (f6 * 100.0f);
        InterfaceC7040a interfaceC7040a = (InterfaceC7040a) f34056b.m5646c(i10);
        if (interfaceC7040a != null) {
            return interfaceC7040a;
        }
        v0 v0Var = f34056b;
        if (v0Var.f9072a) {
            AbstractC1916r.m5605a(v0Var);
        }
        int iM5860a = AbstractC2176a.m5860a(v0Var.f9075d, i10, v0Var.f9073b);
        if (iM5860a >= 0) {
            return (InterfaceC7040a) f34056b.m5650g(iM5860a);
        }
        int i11 = -(iM5860a + 1);
        int i12 = i11 - 1;
        if (i11 >= f34056b.m5649f()) {
            C7042c c7042c2 = new C7042c(new float[]{1.0f}, new float[]{f6});
            m13327b(f6, c7042c2);
            return c7042c2;
        }
        if (i12 < 0) {
            c7042c = new C7042c(fArr, fArr);
            fM5647d = 1.0f;
        } else {
            fM5647d = f34056b.m5647d(i12) / 100.0f;
            c7042c = (InterfaceC7040a) f34056b.m5650g(i12);
        }
        float fM5647d2 = f34056b.m5647d(i11) / 100.0f;
        float fMax = (Math.max(DefinitionKt.NO_Float_VALUE, Math.min(1.0f, fM5647d == fM5647d2 ? 0.0f : (f6 - fM5647d) / (fM5647d2 - fM5647d))) * 1.0f) + DefinitionKt.NO_Float_VALUE;
        InterfaceC7040a interfaceC7040a2 = (InterfaceC7040a) f34056b.m5650g(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f10 = fArr[i13];
            float fMo12951b = c7042c.mo12951b(f10);
            fArr2[i13] = ((interfaceC7040a2.mo12951b(f10) - fMo12951b) * fMax) + fMo12951b;
        }
        C7042c c7042c3 = new C7042c(fArr, fArr2);
        m13327b(f6, c7042c3);
        return c7042c3;
    }

    /* renamed from: b */
    public static void m13327b(float f6, C7042c c7042c) {
        synchronized (f34057c) {
            v0 v0VarClone = f34056b.clone();
            v0VarClone.m5648e((int) (f6 * 100.0f), c7042c);
            f34056b = v0VarClone;
        }
    }
}
