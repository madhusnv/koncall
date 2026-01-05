package p001o;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.InterfaceC1893c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import p001o.ke8;

/* loaded from: classes2.dex */
public final class hc8 implements pdc {

    /* renamed from: a */
    public final n79 f26653a;

    /* renamed from: o.hc8$a */
    public static abstract class AbstractC13915a {
        /* renamed from: c */
        public static AbstractC13915a m30220c(lic licVar, int i) {
            return new r41(licVar, i);
        }

        /* renamed from: a */
        public abstract int mo30221a();

        /* renamed from: b */
        public abstract lic mo30222b();
    }

    public hc8(l5e l5eVar) {
        this.f26653a = new n79(l5eVar);
    }

    /* renamed from: b */
    public static fm6 m30216b(byte[] bArr) throws vc8 {
        try {
            return fm6.m27050k(new ByteArrayInputStream(bArr));
        } catch (IOException e) {
            throw new vc8(0, "Failed to extract Exif from YUV-generated JPEG", e);
        }
    }

    @Override // p001o.pdc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lic apply(AbstractC13915a abstractC13915a) {
        lic licVarM30219d;
        try {
            int iMo22325e = abstractC13915a.mo30222b().mo22325e();
            if (iMo22325e != 35) {
                if (iMo22325e != 256 && iMo22325e != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iMo22325e);
                }
                licVarM30219d = m30218c(abstractC13915a, iMo22325e);
            } else {
                licVarM30219d = m30219d(abstractC13915a);
            }
            return licVarM30219d;
        } finally {
            ((InterfaceC1893c) abstractC13915a.mo30222b().mo22323c()).close();
        }
    }

    /* renamed from: c */
    public final lic m30218c(AbstractC13915a abstractC13915a, int i) {
        lic licVarMo30222b = abstractC13915a.mo30222b();
        byte[] bArrM40204a = this.f26653a.m40204a((InterfaceC1893c) licVarMo30222b.mo22323c());
        fm6 fm6VarMo22324d = licVarMo30222b.mo22324d();
        Objects.requireNonNull(fm6VarMo22324d);
        return lic.m37319m(bArrM40204a, fm6VarMo22324d, i, licVarMo30222b.mo22328h(), licVarMo30222b.mo22322b(), licVarMo30222b.mo22326f(), licVarMo30222b.mo22327g(), licVarMo30222b.mo22321a());
    }

    /* renamed from: d */
    public final lic m30219d(AbstractC13915a abstractC13915a) throws vc8 {
        lic licVarMo30222b = abstractC13915a.mo30222b();
        InterfaceC1893c interfaceC1893c = (InterfaceC1893c) licVarMo30222b.mo22323c();
        Rect rectMo22322b = licVarMo30222b.mo22322b();
        try {
            byte[] bArrM35539l = ke8.m35539l(interfaceC1893c, rectMo22322b, abstractC13915a.mo30221a(), licVarMo30222b.mo22326f());
            return lic.m37319m(bArrM35539l, m30216b(bArrM35539l), 256, new Size(rectMo22322b.width(), rectMo22322b.height()), new Rect(0, 0, rectMo22322b.width(), rectMo22322b.height()), licVarMo30222b.mo22326f(), wuh.m55051t(licVarMo30222b.mo22327g(), rectMo22322b), licVarMo30222b.mo22321a());
        } catch (ke8.C14815a e) {
            throw new vc8(1, "Failed to encode the image to JPEG.", e);
        }
    }
}
