package p001o;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.dn7;

/* loaded from: classes2.dex */
public final class r06 extends kdc {

    /* renamed from: n */
    public int f42662n = -1;

    /* renamed from: o */
    public int f42663o = -1;

    /* renamed from: p */
    public final ei9 f42664p;

    /* renamed from: q */
    public final ei9 f42665q;

    public r06(ei9 ei9Var, ei9 ei9Var2) {
        this.f42664p = ei9Var;
        this.f42665q = ei9Var2;
    }

    /* renamed from: u */
    public static float[] m46011u(Size size, Size size2, ei9 ei9Var) {
        float[] fArrM23595l = dn7.m23595l();
        float[] fArrM23595l2 = dn7.m23595l();
        float[] fArrM23595l3 = dn7.m23595l();
        Matrix.scaleM(fArrM23595l, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArrM23595l2, 0, ei9Var.m25106c() / ei9Var.m25108e(), ei9Var.m25107d() / ei9Var.m25105b(), 0.0f);
        Matrix.multiplyMM(fArrM23595l3, 0, fArrM23595l, 0, fArrM23595l2, 0);
        return fArrM23595l3;
    }

    @Override // p001o.kdc
    /* renamed from: h */
    public av7 mo35473h(y16 y16Var, Map map) {
        av7 av7VarMo35473h = super.mo35473h(y16Var, map);
        this.f42662n = dn7.m23599p();
        this.f42663o = dn7.m23599p();
        return av7VarMo35473h;
    }

    @Override // p001o.kdc
    /* renamed from: k */
    public void mo35476k() {
        super.mo35476k();
        this.f42662n = -1;
        this.f42663o = -1;
    }

    /* renamed from: t */
    public int m46012t(boolean z) {
        dn7.m23592i(this.f31982a, true);
        dn7.m23591h(this.f31984c);
        return z ? this.f42662n : this.f42663o;
    }

    /* renamed from: v */
    public void m46013v(long j, Surface surface, ifg ifgVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        dn7.m23592i(this.f31982a, true);
        dn7.m23591h(this.f31984c);
        ngc ngcVarM35471f = m35471f(surface);
        if (ngcVarM35471f == dn7.f20305l) {
            ngcVarM35471f = m35468c(surface);
            if (ngcVarM35471f == null) {
                return;
            } else {
                this.f31983b.put(surface, ngcVarM35471f);
            }
        }
        if (surface != this.f31990i) {
            m35474i(ngcVarM35471f.mo20245a());
            this.f31990i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Opcodes.ACC_ENUM);
        ngc ngcVar = ngcVarM35471f;
        m46014w(ngcVar, ifgVar, surfaceTexture, this.f42664p, this.f42662n, true);
        m46014w(ngcVar, ifgVar, surfaceTexture2, this.f42665q, this.f42663o, true);
        EGLExt.eglPresentationTimeANDROID(this.f31985d, ngcVarM35471f.mo20245a(), j);
        if (EGL14.eglSwapBuffers(this.f31985d, ngcVarM35471f.mo20245a())) {
            return;
        }
        wja.m54638l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m35478m(surface, false);
    }

    /* renamed from: w */
    public final void m46014w(ngc ngcVar, ifg ifgVar, SurfaceTexture surfaceTexture, ei9 ei9Var, int i, boolean z) {
        m35484s(i);
        GLES20.glViewport(0, 0, ngcVar.mo20247c(), ngcVar.mo20246b());
        GLES20.glScissor(0, 0, ngcVar.mo20247c(), ngcVar.mo20246b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        ifgVar.mo32076F(fArr2, fArr, z);
        dn7.AbstractC13003f abstractC13003f = (dn7.AbstractC13003f) fgd.m26663g(this.f31992k);
        if (abstractC13003f instanceof dn7.C13004g) {
            ((dn7.C13004g) abstractC13003f).m23619h(fArr2);
        }
        abstractC13003f.m23615e(m46011u(new Size((int) (ngcVar.mo20247c() * ei9Var.m25108e()), (int) (ngcVar.mo20246b() * ei9Var.m25105b())), new Size(ngcVar.mo20247c(), ngcVar.mo20246b()), ei9Var));
        abstractC13003f.m23614d(ei9Var.m25104a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        dn7.m23590g("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
