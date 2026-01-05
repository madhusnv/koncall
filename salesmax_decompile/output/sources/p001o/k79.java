package p001o;

import androidx.camera.core.C1895e;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC1893c;
import java.util.Objects;

/* loaded from: classes2.dex */
public class k79 implements pdc {
    @Override // p001o.pdc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lic apply(lic licVar) {
        C1895e c1895e = new C1895e(be8.m18789a(licVar.mo22328h().getWidth(), licVar.mo22328h().getHeight(), 256, 2));
        InterfaceC1893c interfaceC1893cM4647b = ImageProcessingUtil.m4647b(c1895e, (byte[]) licVar.mo22323c());
        c1895e.m4688m();
        Objects.requireNonNull(interfaceC1893cM4647b);
        fm6 fm6VarMo22324d = licVar.mo22324d();
        Objects.requireNonNull(fm6VarMo22324d);
        return lic.m37317k(interfaceC1893cM4647b, fm6VarMo22324d, licVar.mo22322b(), licVar.mo22326f(), licVar.mo22327g(), licVar.mo22321a());
    }
}
