package p001o;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class eb9 {

    /* renamed from: a */
    public static final ka9.C14756a f21292a = ka9.C14756a.m35230a("x", "y");

    /* renamed from: o.eb9$a */
    public static /* synthetic */ class C13141a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21293a;

        static {
            int[] iArr = new int[ka9.EnumC14757b.values().length];
            f21293a = iArr;
            try {
                iArr[ka9.EnumC14757b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21293a[ka9.EnumC14757b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21293a[ka9.EnumC14757b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static PointF m24694a(ka9 ka9Var, float f) {
        ka9Var.mo22731c();
        float fMo22737o = (float) ka9Var.mo22737o();
        float fMo22737o2 = (float) ka9Var.mo22737o();
        while (ka9Var.mo22723C() != ka9.EnumC14757b.END_ARRAY) {
            ka9Var.mo22726K();
        }
        ka9Var.mo22733f();
        return new PointF(fMo22737o * f, fMo22737o2 * f);
    }

    /* renamed from: b */
    public static PointF m24695b(ka9 ka9Var, float f) {
        float fMo22737o = (float) ka9Var.mo22737o();
        float fMo22737o2 = (float) ka9Var.mo22737o();
        while (ka9Var.mo22735h()) {
            ka9Var.mo22726K();
        }
        return new PointF(fMo22737o * f, fMo22737o2 * f);
    }

    /* renamed from: c */
    public static PointF m24696c(ka9 ka9Var, float f) {
        ka9Var.mo22732d();
        float fM24700g = 0.0f;
        float fM24700g2 = 0.0f;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f21292a);
            if (iMo22724H == 0) {
                fM24700g = m24700g(ka9Var);
            } else if (iMo22724H != 1) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                fM24700g2 = m24700g(ka9Var);
            }
        }
        ka9Var.mo22734g();
        return new PointF(fM24700g * f, fM24700g2 * f);
    }

    /* renamed from: d */
    public static int m24697d(ka9 ka9Var) {
        ka9Var.mo22731c();
        int iMo22737o = (int) (ka9Var.mo22737o() * 255.0d);
        int iMo22737o2 = (int) (ka9Var.mo22737o() * 255.0d);
        int iMo22737o3 = (int) (ka9Var.mo22737o() * 255.0d);
        while (ka9Var.mo22735h()) {
            ka9Var.mo22726K();
        }
        ka9Var.mo22733f();
        return Color.argb(Constants.MAX_HOST_LENGTH, iMo22737o, iMo22737o2, iMo22737o3);
    }

    /* renamed from: e */
    public static PointF m24698e(ka9 ka9Var, float f) {
        int i = C13141a.f21293a[ka9Var.mo22723C().ordinal()];
        if (i == 1) {
            return m24695b(ka9Var, f);
        }
        if (i == 2) {
            return m24694a(ka9Var, f);
        }
        if (i == 3) {
            return m24696c(ka9Var, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + ka9Var.mo22723C());
    }

    /* renamed from: f */
    public static List m24699f(ka9 ka9Var, float f) {
        ArrayList arrayList = new ArrayList();
        ka9Var.mo22731c();
        while (ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_ARRAY) {
            ka9Var.mo22731c();
            arrayList.add(m24698e(ka9Var, f));
            ka9Var.mo22733f();
        }
        ka9Var.mo22733f();
        return arrayList;
    }

    /* renamed from: g */
    public static float m24700g(ka9 ka9Var) {
        ka9.EnumC14757b enumC14757bMo22723C = ka9Var.mo22723C();
        int i = C13141a.f21293a[enumC14757bMo22723C.ordinal()];
        if (i == 1) {
            return (float) ka9Var.mo22737o();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + enumC14757bMo22723C);
        }
        ka9Var.mo22731c();
        float fMo22737o = (float) ka9Var.mo22737o();
        while (ka9Var.mo22735h()) {
            ka9Var.mo22726K();
        }
        ka9Var.mo22733f();
        return fMo22737o;
    }
}
