package p001o;

import android.graphics.Bitmap;
import androidx.camera.core.C1895e;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC1893c;
import java.nio.ByteBuffer;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class gc8 implements pdc {
    @Override // p001o.pdc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(lic licVar) throws Throwable {
        C1895e c1895e;
        Bitmap bitmapM35538k;
        C1895e c1895e2 = null;
        try {
            try {
                if (licVar.mo22325e() == 35) {
                    InterfaceC1893c interfaceC1893c = (InterfaceC1893c) licVar.mo22323c();
                    boolean z = licVar.mo22326f() % Opcodes.GETFIELD != 0;
                    c1895e = new C1895e(be8.m18789a(z ? interfaceC1893c.getHeight() : interfaceC1893c.getWidth(), z ? interfaceC1893c.getWidth() : interfaceC1893c.getHeight(), 1, 2));
                    try {
                        InterfaceC1893c interfaceC1893cM4649d = ImageProcessingUtil.m4649d(interfaceC1893c, c1895e, ByteBuffer.allocateDirect(interfaceC1893c.getWidth() * interfaceC1893c.getHeight() * 4), licVar.mo22326f(), false);
                        interfaceC1893c.close();
                        if (interfaceC1893cM4649d == null) {
                            throw new vc8(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapM35538k = ke8.m35529b(interfaceC1893cM4649d);
                        interfaceC1893cM4649d.close();
                    } catch (UnsupportedOperationException e) {
                        e = e;
                        throw new vc8(0, "Can't convert " + (licVar.mo22325e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        c1895e2 = c1895e;
                        if (c1895e2 != null) {
                            c1895e2.close();
                        }
                        throw th;
                    }
                } else {
                    if (licVar.mo22325e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + licVar.mo22325e());
                    }
                    InterfaceC1893c interfaceC1893c2 = (InterfaceC1893c) licVar.mo22323c();
                    Bitmap bitmapM35529b = ke8.m35529b(interfaceC1893c2);
                    interfaceC1893c2.close();
                    c1895e = null;
                    bitmapM35538k = ke8.m35538k(bitmapM35529b, licVar.mo22326f());
                }
                if (c1895e != null) {
                    c1895e.close();
                }
                return bitmapM35538k;
            } catch (UnsupportedOperationException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
