package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p001o.bc7;
import p001o.ppe;
import p001o.xb7;

/* loaded from: classes2.dex */
public abstract class fzh {

    /* renamed from: a */
    public static final lzh f24307a;

    /* renamed from: b */
    public static final xma f24308b;

    /* renamed from: o.fzh$a */
    public static class C13594a extends bc7.C12353c {

        /* renamed from: a */
        public ppe.AbstractC16161e f24309a;

        public C13594a(ppe.AbstractC16161e abstractC16161e) {
            this.f24309a = abstractC16161e;
        }

        @Override // p001o.bc7.C12353c
        /* renamed from: a */
        public void mo18595a(int i) {
            ppe.AbstractC16161e abstractC16161e = this.f24309a;
            if (abstractC16161e != null) {
                abstractC16161e.m44051f(i);
            }
        }

        @Override // p001o.bc7.C12353c
        /* renamed from: b */
        public void mo18596b(Typeface typeface) {
            ppe.AbstractC16161e abstractC16161e = this.f24309a;
            if (abstractC16161e != null) {
                abstractC16161e.m44052g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f24307a = new kzh();
        } else if (i >= 28) {
            f24307a = new jzh();
        } else if (i >= 26) {
            f24307a = new izh();
        } else if (hzh.m31326j()) {
            f24307a = new hzh();
        } else {
            f24307a = new gzh();
        }
        f24308b = new xma(16);
    }

    /* renamed from: a */
    public static Typeface m27828a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m27829b(Context context, CancellationSignal cancellationSignal, bc7.C12352b[] c12352bArr, int i) {
        return f24307a.mo29711b(context, cancellationSignal, c12352bArr, i);
    }

    /* renamed from: c */
    public static Typeface m27830c(Context context, xb7.InterfaceC18099b interfaceC18099b, Resources resources, int i, String str, int i2, int i3, ppe.AbstractC16161e abstractC16161e, Handler handler, boolean z) {
        Typeface typefaceMo29710a;
        if (interfaceC18099b instanceof xb7.C18102e) {
            xb7.C18102e c18102e = (xb7.C18102e) interfaceC18099b;
            Typeface typefaceM27834g = m27834g(c18102e.m55940c());
            if (typefaceM27834g != null) {
                if (abstractC16161e != null) {
                    abstractC16161e.m44054d(typefaceM27834g, handler);
                }
                return typefaceM27834g;
            }
            boolean z2 = !z ? abstractC16161e != null : c18102e.m55938a() != 0;
            int iM55941d = z ? c18102e.m55941d() : -1;
            typefaceMo29710a = bc7.m18585c(context, c18102e.m55939b(), i3, z2, iM55941d, ppe.AbstractC16161e.m44050e(handler), new C13594a(abstractC16161e));
        } else {
            typefaceMo29710a = f24307a.mo29710a(context, (xb7.C18100c) interfaceC18099b, resources, i3);
            if (abstractC16161e != null) {
                if (typefaceMo29710a != null) {
                    abstractC16161e.m44054d(typefaceMo29710a, handler);
                } else {
                    abstractC16161e.m44053c(-3, handler);
                }
            }
        }
        if (typefaceMo29710a != null) {
            f24308b.put(m27832e(resources, i, str, i2, i3), typefaceMo29710a);
        }
        return typefaceMo29710a;
    }

    /* renamed from: d */
    public static Typeface m27831d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo32958d = f24307a.mo32958d(context, resources, i, str, i3);
        if (typefaceMo32958d != null) {
            f24308b.put(m27832e(resources, i, str, i2, i3), typefaceMo32958d);
        }
        return typefaceMo32958d;
    }

    /* renamed from: e */
    public static String m27832e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m27833f(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) f24308b.get(m27832e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    public static Typeface m27834g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
