package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.InterfaceC1893c;
import java.io.IOException;
import p001o.fjd;
import p001o.u72;

/* loaded from: classes2.dex */
public final class wid implements pdc {
    /* renamed from: b */
    public static lic m54606b(gjd gjdVar, fm6 fm6Var, InterfaceC1893c interfaceC1893c) {
        return lic.m37317k(interfaceC1893c, fm6Var, gjdVar.m28865b(), gjdVar.m28869f(), gjdVar.m28870g(), m54608d(interfaceC1893c));
    }

    /* renamed from: c */
    public static lic m54607c(gjd gjdVar, fm6 fm6Var, InterfaceC1893c interfaceC1893c) {
        Size size = new Size(interfaceC1893c.getWidth(), interfaceC1893c.getHeight());
        int iM28869f = gjdVar.m28869f() - fm6Var.m27062s();
        Size sizeM54609e = m54609e(iM28869f, size);
        Matrix matrixM55035d = wuh.m55035d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeM54609e.getWidth(), sizeM54609e.getHeight()), iM28869f);
        return lic.m37318l(interfaceC1893c, fm6Var, sizeM54609e, m54610f(gjdVar.m28865b(), matrixM55035d), fm6Var.m27062s(), m54611g(gjdVar.m28870g(), matrixM55035d), m54608d(interfaceC1893c));
    }

    /* renamed from: d */
    public static u72 m54608d(InterfaceC1893c interfaceC1893c) {
        return interfaceC1893c.y2() instanceof v72 ? ((v72) interfaceC1893c.y2()).m52395c() : u72.C17312a.m51071k();
    }

    /* renamed from: e */
    public static Size m54609e(int i, Size size) {
        return wuh.m55040i(wuh.m55052u(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: f */
    public static Rect m54610f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: g */
    public static Matrix m54611g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // p001o.pdc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lic apply(fjd.AbstractC13464b abstractC13464b) throws vc8 {
        fm6 fm6VarM27049j;
        InterfaceC1893c interfaceC1893cMo26933a = abstractC13464b.mo26933a();
        gjd gjdVarMo26934b = abstractC13464b.mo26934b();
        if (ke8.m35536i(interfaceC1893cMo26933a.mo4657l())) {
            try {
                fm6VarM27049j = fm6.m27049j(interfaceC1893cMo26933a);
                interfaceC1893cMo26933a.u1()[0].getBuffer().rewind();
            } catch (IOException e) {
                throw new vc8(1, "Failed to extract EXIF data.", e);
            }
        } else {
            fm6VarM27049j = null;
        }
        if (!rd8.f43399g.m40786b(interfaceC1893cMo26933a)) {
            return m54606b(gjdVarMo26934b, fm6VarM27049j, interfaceC1893cMo26933a);
        }
        fgd.m26664h(fm6VarM27049j, "JPEG image must have exif.");
        return m54607c(gjdVarMo26934b, fm6VarM27049j, interfaceC1893cMo26933a);
    }
}
