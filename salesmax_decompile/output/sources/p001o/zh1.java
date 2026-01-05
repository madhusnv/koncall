package p001o;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public class zh1 implements pdc {

    /* renamed from: o.zh1$a */
    public static class C18633a {
        /* renamed from: a */
        public static boolean m59398a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* renamed from: o.zh1$b */
    public static abstract class AbstractC18634b {
        /* renamed from: c */
        public static AbstractC18634b m59399c(lic licVar, int i) {
            return new y31(licVar, i);
        }

        /* renamed from: a */
        public abstract int mo57160a();

        /* renamed from: b */
        public abstract lic mo57161b();
    }

    /* renamed from: b */
    public static int m59396b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !C18633a.m59398a(bitmap)) ? 256 : 4101;
    }

    @Override // p001o.pdc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lic apply(AbstractC18634b abstractC18634b) {
        lic licVarMo57161b = abstractC18634b.mo57161b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) licVarMo57161b.mo22323c()).compress(Bitmap.CompressFormat.JPEG, abstractC18634b.mo57160a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        fm6 fm6VarMo22324d = licVarMo57161b.mo22324d();
        Objects.requireNonNull(fm6VarMo22324d);
        return lic.m37319m(byteArray, fm6VarMo22324d, m59396b((Bitmap) licVarMo57161b.mo22323c()), licVarMo57161b.mo22328h(), licVarMo57161b.mo22322b(), licVarMo57161b.mo22326f(), licVarMo57161b.mo22327g(), licVarMo57161b.mo22321a());
    }
}
